package com.anucana.services;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anucana.client.data.IClientDetails;
import com.anucana.constants.ITypeConstants;
import com.anucana.entity.search.conditions.CommunitySearchConditions;
import com.anucana.persistence.dao.CommunityDAO;
import com.anucana.persistence.dao.CommunityKeywordDAO;
import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.dao.UserCommunityDAO;
import com.anucana.persistence.entities.CommunityEntity;
import com.anucana.persistence.entities.CommunityKeywordEntity;
import com.anucana.persistence.entities.UserCommunityEntity;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.utils.LocalCollectionUtils;
import com.anucana.validation.implementations.JSR303ValidatorFactoryBean;
import com.anucana.value.objects.Community;
import com.anucana.value.objects.ImageOps;

/**
 * Provides services related with Communities ( community create / update / delete / user subscribe / user un-subscribe)
 * 
 * @author asrivastava
 *
 */
@Component
@Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
public class CommunityService extends AuditService implements ICommunityService,Serializable{

	private static final long serialVersionUID = 1L;

	@Autowired
	private CommunityDAO communityDao;
	@Autowired
	private UserCommunityDAO userCommunityDao;
	@Autowired
	private JSR303ValidatorFactoryBean jsr303validator;
	@Autowired
	private IMultimediaService multimediaService;
	@Autowired
	private TypeDAO typeDao; 
	@Autowired
	private CommunityKeywordDAO communityKeywordDao; 
	
	@Override
	public ServiceResponse<Community> getCommunityDetails(ServiceRequest<Long> request,IUserDetails userDetails,IClientDetails client) throws ServiceException {
		CommunityEntity communityEntity = communityDao.findById(request.getTargetObject());
		if(communityEntity == null){
			throw new ServiceException(ServiceException.COMMUNITY_NOT_FOUND_EXCEPTION);
		}
		Community community = new Community();
		copyDBDetails(communityEntity,community);
		setBannerDetails(community,userDetails,client);
		
		return new ServiceResponse<Community>(community);
	}

	private void copyDBDetails(CommunityEntity communityEntity,Community community) {
		community.setCommunityId(communityEntity.getId());

		community.setName(communityEntity.getName());
		community.setAbout(communityEntity.getAbout());
		community.setEmail(communityEntity.getEmail());
		community.setPhone(communityEntity.getPhoneNumber());
		community.setIndustryCd(communityEntity.getIndustry().getTypeCode());
		community.setFoundationDate(DateFormatUtils.format(communityEntity.getFoundationDate(), Community.DATE_FORMAT));
		
		Collection<CommunityKeywordEntity> keywords = communityEntity.getKeywords();
		community.setKeywords(StringUtils.join(keywords, Community.KEY_WORD_SEPARATOR));
	}
	
	private void setBannerDetails(Community community,IUserDetails userDetails,IClientDetails client) throws ServiceException {
		ImageOps image = new ImageOps(ImageOps.BUCKET.COMMUNITY);
		image.setId(community.getCommunityId());
		
		ServiceResponse<List<ImageOps>> res = multimediaService.getImages(new ServiceRequest<List<ImageOps>>(LocalCollectionUtils.addToNewList(image)), userDetails, client);
		
		community.setBannerUrl(res.getTargetObject().get(0).getTimedImageURL());
		community.setDummyImage(res.getTargetObject().get(0).isDummy());
	}


	@Override
	public ServiceResponse<Community> saveCommunityDetails(ServiceRequest<Community> request,IUserDetails userDetails,IClientDetails client) throws ServiceException {
		
		request.setValidator(jsr303validator);
		request.validate();
		if(request.getBindingResult().hasErrors()){
			return request;
		}
		Community community = request.getTargetObject();
		CommunityEntity communityEntity = null;
		
		Collection<CommunityKeywordEntity> keywordEntities = null;
		
		if(community.getCommunityId() == 0l){
			communityEntity = new CommunityEntity();
			keywordEntities = new ArrayList<CommunityKeywordEntity>();
		}else{
			communityEntity = communityDao.findById(community.getCommunityId());
			keywordEntities = communityEntity.getKeywords();
		}
		
		copyBeanDetails(community, communityEntity);
		stampAuditDetails(communityEntity, userDetails);
		communityDao.save(communityEntity);
		
		if(StringUtils.isNotBlank(community.getKeywords())){
			String[] keywords = community.getKeywords().split(Community.KEY_WORD_SEPARATOR);
			for(String keyword : keywords){
				keyword = keyword.trim();
				if(keywordNotPresent(keyword,keywordEntities)){
					CommunityKeywordEntity keywordEntity = new CommunityKeywordEntity();
					keywordEntity.setCommunity(communityEntity);
					keywordEntity.setKeyword(keyword);
					stampAuditDetails(keywordEntity, userDetails);
					communityKeywordDao.save(keywordEntity);
				}
			}
		}
		
		community.setCommunityId(communityEntity.getId());
		return new ServiceResponse<Community>(community);
	}

	private boolean keywordNotPresent(final String keyword,Collection<CommunityKeywordEntity> keywordEntities) {
		if(CollectionUtils.isEmpty(keywordEntities)){
			return true;
		}
		Object keywordFound = CollectionUtils.find(keywordEntities, new Predicate() {
			
			@Override
			public boolean evaluate(Object arg0) {
				CommunityKeywordEntity entity = (CommunityKeywordEntity)arg0;
				return entity.getKeyword().equalsIgnoreCase(keyword);
			}
		});
		return keywordFound == null;
	}

	private void copyBeanDetails(Community community,CommunityEntity communityEntity) throws ServiceException {

		communityEntity.setName(community.getName());
		communityEntity.setAbout(community.getAbout());
		communityEntity.setEmail(community.getEmail());
		communityEntity.setPhoneNumber(community.getPhone());
		communityEntity.setPhoneType(typeDao.findByTypeCode(community.getPhoneTypeCd()));
		communityEntity.setIndustry(typeDao.findByTypeCode(community.getIndustryCd()));

		// TODO : this need to come from UI
		communityEntity.setStatus(typeDao.findByTypeCode(ITypeConstants.TYPE_COMMUNITY_ACTIVE));

		SimpleDateFormat formatter = new SimpleDateFormat(Community.DATE_FORMAT);
		try {
			communityEntity.setFoundationDate(formatter.parse(community.getFoundationDate()));
		} catch (ParseException e) {
			throw new ServiceException(ServiceException.GENERAL_SYSTEM_EXCEPTION, e);
		}
	}
	

	@Override
	public ServiceResponse<Collection<String>> getCommunityKeywords(ServiceRequest<Long> request,IUserDetails userDetails,IClientDetails client) throws ServiceException {
		CommunityEntity communityEntity = communityDao.findById(request.getTargetObject());
		if(communityEntity == null){
			throw new ServiceException(ServiceException.COMMUNITY_NOT_FOUND_EXCEPTION);
		}
		List<String> keywords = new ArrayList<String>();
		
		Collection<CommunityKeywordEntity> keywordEntities = communityEntity.getKeywords();
		if(keywordEntities != null){
			for(CommunityKeywordEntity keywordEntity : keywordEntities){
				keywords.add(keywordEntity.getKeyword());
			}
		}
		return new ServiceResponse<Collection<String>>(keywords);
	}

	@Override
	public ServiceResponse<List<Community>> searchCommunities(ServiceRequest<CommunitySearchConditions> request,IUserDetails userDetails, IClientDetails client)throws ServiceException {
		List<CommunityEntity> searchedEntites = new ArrayList<CommunityEntity>();
		List<Community> searchedResults = new ArrayList<Community>();
		
		CommunitySearchConditions searchConditions = request.getTargetObject();
		if(CommunitySearchConditions.MODE.SEARCH_BY_ID.equals(searchConditions.getSearchMode())){
			searchedEntites.add(communityDao.findById(searchConditions.getCommunityId()));
		}else if(CommunitySearchConditions.MODE.SEARCH_BY_NAME.equals(searchConditions.getSearchMode())){
			List<CommunityEntity> entities = communityDao.findByName(searchConditions.getName());
			if(CollectionUtils.isNotEmpty(entities)){
				for(CommunityEntity entity : entities){
					searchedEntites.add(communityDao.findById(entity.getId()));
				}
			}
		}else if(CommunitySearchConditions.MODE.SEARCH_BY_SUBSCRIBER.equals(searchConditions.getSearchMode())){
			List<UserCommunityEntity> entities = userCommunityDao.findByLoginId(searchConditions.getSubscriberId());
			if(CollectionUtils.isNotEmpty(entities)){
				for(UserCommunityEntity entity : entities){
					searchedEntites.add(communityDao.findById(entity.getCommunity().getId()));
				}
			}
		}else if(CommunitySearchConditions.MODE.SEARCH_BY_KEYWORDS.equals(searchConditions.getSearchMode())){
			Collection<String> keywords = searchConditions.getKeywords();
			if(CollectionUtils.isNotEmpty(keywords)){
				Set<Long> communityIds = new HashSet<Long>();
				for(String keyword : keywords){
					List<CommunityKeywordEntity> keywordEntities = communityKeywordDao.findByKeyword(keyword);
					if(CollectionUtils.isNotEmpty(keywordEntities)){
						for(CommunityKeywordEntity keywordEntity : keywordEntities){
							communityIds.add(keywordEntity.getCommunity().getId());
						}
					}
				}
					
				for (Long communityId : communityIds) {
					searchedEntites.add(communityDao.findById(communityId));
				}
			}	
		}else if(CommunitySearchConditions.MODE.SELECT_ALL.equals(searchConditions.getSearchMode())){
			List<CommunityEntity> entities = communityDao.findAll();
			if(CollectionUtils.isNotEmpty(entities)){
				for(CommunityEntity entity : entities){
					searchedEntites.add(communityDao.findById(entity.getId()));
				}
			}
		}
		
		for(CommunityEntity searchedEntity : searchedEntites){
			if(searchedEntity != null && ITypeConstants.TYPE_COMMUNITY_ACTIVE.equals(searchedEntity.getStatus().getTypeCode())){
				Community community = new Community();
				copyDBDetails(searchedEntity,community);
				setBannerDetails(community,userDetails,client);
				searchedResults.add(community);
			}
		}
		return new ServiceResponse<List<Community>>(searchedResults);
	}

}