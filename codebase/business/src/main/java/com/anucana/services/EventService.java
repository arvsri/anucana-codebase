package com.anucana.services;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anucana.client.data.IClientDetails;
import com.anucana.constants.ITypeConstants;
import com.anucana.entity.search.conditions.EventSearchConditions;
import com.anucana.persistence.dao.AddressDAO;
import com.anucana.persistence.dao.CommunityDAO;
import com.anucana.persistence.dao.EventDAO;
import com.anucana.persistence.dao.PostalCodeDAO;
import com.anucana.persistence.dao.TypeDAO;
import com.anucana.persistence.dao.UserEventDAO;
import com.anucana.persistence.dao.UserLoginDAO;
import com.anucana.persistence.entities.AddressEntity;
import com.anucana.persistence.entities.EventEntity;
import com.anucana.persistence.entities.UserEventEntity;
import com.anucana.persistence.entities.UserLoginEntity;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.utils.LocalCollectionUtils;
import com.anucana.utils.SimpleUtils;
import com.anucana.validation.implementations.EventBookingValidator;
import com.anucana.validation.implementations.IEventBookingValidator;
import com.anucana.validation.implementations.JSR303ValidatorFactoryBean;
import com.anucana.value.objects.Address;
import com.anucana.value.objects.Event;
import com.anucana.value.objects.ImageOps;

/**
 * Provides services related with Events ( event create / update / delete / search )
 * 
 * @author asrivastava
 *
 */
@Component
@Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
public class EventService extends AuditService implements IEventService,Serializable{
	
	private static final long serialVersionUID = 1L;

	@Autowired
	private JSR303ValidatorFactoryBean jsr303validator;
	@Autowired
	private IMultimediaService multimediaService;
	@Autowired
	private TypeDAO typeDao; 
	@Autowired
	private EventDAO eventDao; 
	@Autowired
	private CommunityDAO communityDAO;
	@Autowired
	private UserLoginDAO<UserLoginEntity> loginDAO;
	@Autowired
	private PostalCodeDAO postalCodeDAO;
	@Autowired
	private AddressDAO addressDAO;
	@Autowired
	private UserEventDAO userEventDAO;
	
	
	@Override
	public ServiceResponse<Event> getEventDetails(ServiceRequest<Long> request,IUserDetails userDetails, IClientDetails client)throws ServiceException {
		if(request.getTargetObject() == 0l){
			Event event = new Event();
			ServiceResponse<ImageOps> res = multimediaService.getDefaultImage(new ServiceRequest<ImageOps>(new ImageOps(ImageOps.BUCKET.EVENT)), userDetails, client);
			event.setBannerUrl(res.getTargetObject().getTimedImageURL());
			event.setDummyImage(res.getTargetObject().isDummy());
			return new ServiceResponse<Event>(event);
			
		}else{
			EventEntity eventEntity = eventDao.findById(request.getTargetObject());
			if(eventEntity == null){
				throw new ServiceException(ServiceException.EVENT_NOT_FOUND_EXCEPTION);
			}
			
			Event event = new Event();
			copyDBDetails(eventEntity,event);
			setBannerDetails(event,userDetails,client);

			return new ServiceResponse<Event>(event);
		}
	}

	private void setBannerDetails(Event event, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		ImageOps image = new ImageOps(ImageOps.BUCKET.EVENT);
		image.setId(event.getEventId());
		
		ServiceResponse<List<ImageOps>> res = multimediaService.getImages(new ServiceRequest<List<ImageOps>>(LocalCollectionUtils.addToNewList(image)), userDetails, client);
		
		event.setBannerUrl(res.getTargetObject().get(0).getTimedImageURL());
		event.setDummyImage(res.getTargetObject().get(0).isDummy());
	}

	private void copyDBDetails(EventEntity eventEntity, Event event) {
		event.setEventId(eventEntity.getId());
		
		event.setName(eventEntity.getName());
		event.setEventDate(DateFormatUtils.format(eventEntity.getEventDate(), Event.DATE_FORMAT));
		event.setDurationInMinutes(SimpleUtils.strVal(eventEntity.getDurationInMins()));
		
		event.setShortDesc(eventEntity.getShortDesc());
		event.setLongDesc(eventEntity.getLongDesc());

		if(eventEntity.getVenue() != null ){
			event.setAddressLine1(eventEntity.getVenue().getAddressLine1());
			event.setAddressLine2(eventEntity.getVenue().getAddressLine2());
			if(eventEntity.getVenue().getPostalCode() != null){
				event.setPinCode(eventEntity.getVenue().getPostalCode().getPostalCd().toString());
				event.setPincodeId(eventEntity.getVenue().getPostalCode().getId().toString());
			}
		}
		
		event.setPhone(eventEntity.getPhoneNumber());
		event.setImportanceIndex(eventEntity.getImportanceIndex().toString());
		
		if(eventEntity.getSpeaker() != null){
			event.setSpeakerId(eventEntity.getSpeaker().getId().toString());
			event.setSpeakerName(eventEntity.getSpeaker().getFirstName() + " " + eventEntity.getSpeaker().getLastName());
		}
		
		if(eventEntity.getCommunity() != null){
			event.setCommunityId(eventEntity.getCommunity().getId().toString());
		}
		
		event.setStatusCd(eventEntity.getStatus().getTypeCode());
		event.setCapacity(SimpleUtils.strVal(eventEntity.getProjectedAttendeeCount()));
		event.setCostInINR(eventEntity.getRateInRuppes() == null ? "" : eventEntity.getRateInRuppes().intValue() + "");
	}

	@Override
	public ServiceResponse<Event> saveEventDetails(ServiceRequest<Event> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		request.setValidator(jsr303validator);
		
		// validate for active or inactive events ( it will never be null )
		if(request.getTargetObject() != null && ITypeConstants.TYPE_EVENT_ACTIVE.equals(request.getTargetObject().getStatusCd())){
			request.validate(Event.EventGroupActive.class);
		}else{
			request.validate(Event.EventGroupInActive.class);
		}
		
		if(request.getBindingResult().hasErrors()){
			return request;
		}

		Event event = request.getTargetObject();
		EventEntity eventEntity = null;
		AddressEntity addressEntity = null;
		
		if(event.getEventId() == 0l){
			eventEntity = new EventEntity();
		}else{
			eventEntity = eventDao.findById(event.getEventId());
			addressEntity = eventEntity.getVenue();
		}

		if(addressEntity == null){
			addressEntity = new AddressEntity();
		}
		
		copyBeanDetails(event, eventEntity,addressEntity);
		
		if(addressEntity.getPostalCode() != null){
			addressDAO.save(addressEntity);
			eventEntity.setVenue(addressEntity);
		}

		stampAuditDetails(eventEntity, userDetails);
		eventDao.save(eventEntity);
		
		event.setEventId(eventEntity.getId());
		return new ServiceResponse<Event>(event);
	}

	private void copyBeanDetails(Event event, EventEntity eventEntity,AddressEntity addressEntity) throws ServiceException {
		eventEntity.setName(event.getName());
		SimpleDateFormat formatter = new SimpleDateFormat(Event.DATE_FORMAT);
		try {
			eventEntity.setEventDate(formatter.parse(event.getEventDate()));
		} catch (ParseException e) {
			throw new ServiceException(ServiceException.GENERAL_SYSTEM_EXCEPTION, e);
		}
		eventEntity.setDurationInMins(Long.valueOf(event.getDurationInMinutes()));

		eventEntity.setShortDesc(event.getShortDesc());
		eventEntity.setLongDesc(event.getLongDesc());
		
		eventEntity.setPhoneNumber(event.getPhone());
		eventEntity.setPhoneType(typeDao.findByTypeCode(ITypeConstants.TYPE_PHONE_WORK));
		eventEntity.setImportanceIndex(Integer.valueOf(event.getImportanceIndex()));
		
		eventEntity.setStatus(typeDao.findByTypeCode(event.getStatusCd()));
		if(StringUtils.isNotEmpty(event.getCapacity())){
			eventEntity.setProjectedAttendeeCount(Long.valueOf(event.getCapacity()));
		}
		if(StringUtils.isNotEmpty(event.getCostInINR())){
			eventEntity.setRateInRuppes(Float.valueOf(event.getCostInINR()));
		}
		if(StringUtils.isNotEmpty(event.getSpeakerId())){
			eventEntity.setSpeaker(loginDAO.findById(Long.valueOf(event.getSpeakerId())));
		}
		
		if(StringUtils.isNotEmpty(event.getCommunityId())){
			eventEntity.setCommunity(communityDAO.findById(Long.valueOf(event.getCommunityId())));
		}

		addressEntity.setAddressLine1(event.getAddressLine1());
		addressEntity.setAddressLine2(event.getAddressLine2());
		if (StringUtils.isNotEmpty(event.getPincodeId())) {
			addressEntity.setPostalCode(postalCodeDAO.findById(Long.valueOf(event.getPincodeId())));
		}
	}

	@Override
	public ServiceResponse<List<Event>> searchEvents(ServiceRequest<EventSearchConditions> request,IUserDetails userDetails, IClientDetails client)throws ServiceException {
		List<EventEntity> searchedEntites = new ArrayList<EventEntity>();
		List<Event> searchedResults = new ArrayList<Event>();
		
		EventSearchConditions searchConditions = request.getTargetObject();
		if(EventSearchConditions.MODE.SEARCH_BY_ID.equals(searchConditions.getSearchMode())){
			searchedEntites.add(eventDao.findById(searchConditions.getEventId()));
		}else if(EventSearchConditions.MODE.SEARCH_BY_NAME.equals(searchConditions.getSearchMode())){
			List<EventEntity> entities = eventDao.findByName(searchConditions.getName());
			if(CollectionUtils.isNotEmpty(entities)){
				for(EventEntity entity : entities){
					searchedEntites.add(eventDao.findById(entity.getId()));
				}
			}
		}else if(EventSearchConditions.MODE.SEARCH_BY_COMMUNITY_ID.equals(searchConditions.getSearchMode())){
			List<EventEntity> entities = eventDao.findByCommunityId(searchConditions.getCommunityId());
			if(CollectionUtils.isNotEmpty(entities)){
				for(EventEntity entity : entities){
					searchedEntites.add(eventDao.findById(entity.getId()));
				}
			}
		}else if(EventSearchConditions.MODE.SEARCH_BY_SPEAKER_ID.equals(searchConditions.getSearchMode())){
			List<EventEntity> entities = eventDao.findBySpeakerId(searchConditions.getSpeakerId());
			if(CollectionUtils.isNotEmpty(entities)){
				for(EventEntity entity : entities){
					searchedEntites.add(eventDao.findById(entity.getId()));
				}
			}
		}else if(EventSearchConditions.MODE.SEARCH_BY_MULTI_CONDITIONS.equals(searchConditions.getSearchMode())){
			Date fromDate = new Date();
			Date toDate = null;
			if (EventSearchConditions.PERIOD.WEEK.equals(searchConditions.getSearchPeriod())) {
				toDate = DateUtils.addWeeks(fromDate, 1);
			} else if (EventSearchConditions.PERIOD.MONTH.equals(searchConditions.getSearchPeriod())) {
				toDate = DateUtils.addMonths(fromDate, 1);
			} else {
				toDate = DateUtils.addYears(fromDate, 1);
			}
			
			
			List<EventEntity> entities = eventDao.findConditionally(searchConditions.getCommunityId(),searchConditions.getPinCode(),fromDate,toDate);
			if(CollectionUtils.isNotEmpty(entities)){
				for(EventEntity entity : entities){
					searchedEntites.add(eventDao.findById(entity.getId()));
				}
			}
		}
		
		for(EventEntity searchedEntity : searchedEntites){
			if(searchedEntity != null 
					&& ( ITypeConstants.TYPE_EVENT_ACTIVE.equals(searchedEntity.getStatus().getTypeCode()) 
					|| ITypeConstants.TYPE_EVENT_INACTIVE_PROJECTED.equals(searchedEntity.getStatus().getTypeCode()))){
				
				Event event = new Event();
				copyDBDetails(searchedEntity,event);
				setBookingDetails(event,userDetails);
				if(EventSearchConditions.LOAD.FULL.equals(searchConditions.getResultLoad())){
					setBannerDetails(event,userDetails,client);
				}
				searchedResults.add(event);
			}
		}
		return new ServiceResponse<List<Event>>(searchedResults);
	}

	private void setBookingDetails(Event event, IUserDetails userDetails) {
		if(userDetails != null && userDetails.getUserId() != 0l){
			List<UserEventEntity> userEvents = userEventDAO.findUserEvents(userDetails.getUserId(),event.getEventId());
			if(!CollectionUtils.isEmpty(userEvents)){
				for(UserEventEntity userEvent : userEvents){
					if ((ITypeConstants.TYPE_USER_EVENT_STATUS_ENROLLED.equals(userEvent.getStatus().getTypeCode()) 
							|| ITypeConstants.TYPE_USER_EVENT_STATUS_PAID.equals(userEvent.getStatus().getTypeCode()))) {
						event.setBookedByUser(true);
						break;
					}
				}
			}
		}
	}

	@Override
	public ServiceResponse<List<Address>> getAllEventAddresses(IUserDetails userDetails, IClientDetails client)throws ServiceException {
		List<Address> searchedResults = new ArrayList<Address>();
		// TODO : to re-implement this using HQL for better performance
		List<EventEntity> entites = eventDao.findAll();
		if(CollectionUtils.isNotEmpty(entites)){
			for(EventEntity entity : entites){
				if(entity != null && ITypeConstants.TYPE_EVENT_ACTIVE.equals(entity.getStatus().getTypeCode())){
					
					EventEntity relaodedEntity = eventDao.findById(entity.getId());
					if(relaodedEntity.getVenue() != null && relaodedEntity.getVenue().getPostalCode() != null){
						searchedResults.add(new Address(relaodedEntity.getVenue()
								.getPostalCode().getId(), relaodedEntity.getVenue()
								.getPostalCode().getPostalCd(), relaodedEntity
								.getVenue().getPostalCode().getState(), relaodedEntity
								.getVenue().getPostalCode().getDistrict(),
								relaodedEntity.getVenue().getPostalCode().getOffice(),
								relaodedEntity.getVenue().getAddressLine1(),
								relaodedEntity.getVenue().getAddressLine2()));
					}
				}
			}
		}
		
		return new ServiceResponse<List<Address>>(searchedResults);
	}

	@Override
	public ServiceResponse<Integer> getAvailableSeatsCount(ServiceRequest<Long> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		EventEntity event = eventDao.findById(request.getTargetObject());
		
		int numberOfAvailableSeats = 0;
		if(event != null && EventEntity.EVENT_STATUS_ACTIVE.equals(event.getStatus().getTypeCode())
				&& event.getEventDate().after(new Date())){

			// this is HACK, we need to cast it to the interface as it would be a JDK proxy object which will be received
			// due to aspectj enabled generic logging
			IEventBookingValidator eventBookingValidator = (IEventBookingValidator)jsr303validator.getConstraintValidatorFactory().getInstance(EventBookingValidator.class);
			numberOfAvailableSeats = eventBookingValidator.getNumberOfAvailableSeats(event);
		}
		
		return new ServiceResponse<Integer>(numberOfAvailableSeats);
	}

}
