package com.anucana.persistence.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.anucana.value.objects.Community;
import com.anucana.value.objects.CommunityKeyword;
import com.anucana.value.objects.UserCommunity;

@Deprecated
@Component
public class UserCommunityDaoLegecy extends JdbcTemplate implements IUserCommunityDao {

	/**
	 * The serial version uid
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	public UserCommunityDaoLegecy(DataSource dataSource) {
		super(dataSource);
	}

	@Override
	public List<String> selectAllKeywords() {
		final String query = "select keyword from community_keywords";
		List<String> keywords = query(query, new RowMapper<String>() {
			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString("keyword");
			}
		}, new Object[] {});

		return keywords;
	}

	@Override
	public List<CommunityKeyword> selectKeywordsByCommunityId(long communityId) {
		final String query = "select keyword_id,community_id,keyword,created_by,creation_dt from community_keywords where community_id = ?";
		List<CommunityKeyword> keywords = query(query,new RowMapper<CommunityKeyword>() {
			@Override
			public CommunityKeyword mapRow(ResultSet rs, int rowNum)throws SQLException {
				CommunityKeyword keyword = new CommunityKeyword();
				keyword.setKeywordId(rs.getLong("keyword_id"));
				keyword.setCommunityId(rs.getLong("community_id"));
				keyword.setKeyword(rs.getString("keyword"));
//				keyword.setCreatedBy(rs.getLong("created_by"));
//				keyword.setCreationDt(rs.getDate("creation_dt"));
				return keyword;
			}
		}, new Object[] { communityId });

		return keywords;
	}
	
	@Override
	public List<Community> selectAllCommunities() {
		final String query = "select community_id,name,foundation_dt,about,address,email,website,phone,phone_type,industry_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt from community where status_cd = 'tcs_act'";
		List<Community> communitties = query(query, new RowMapper<Community>() {

			@Override
            public Community mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				Community community = new Community();
				community.setCommunityId(rs.getLong("community_id"));
				community.setName(rs.getString("name"));
				community.setFoundationDate(rs.getDate("foundation_dt"));
				community.setAbout(rs.getString("about"));

				community.setAddress(rs.getString("address"));
				community.setEmail(rs.getString("email"));
				community.setWebsite(rs.getString("website"));

				community.setPhone(rs.getString("phone"));
				community.setPhoneTypeCd(rs.getString("phone_type"));
				community.setIndustryCd(rs.getString("industry_cd"));

				return community;
			}
		}, new Object[] {});

		return communitties;
	}

	@Override
	public List<Community> selectUserSubscribedCommunities(
			long loginNumber) {

		final String query = "select com.community_id,com.name,com.foundation_dt,com.about,com.address,com.email,com.website,com.phone,com.phone_type,com.industry_cd,com.status_cd,com.created_by,com.creation_dt,com.last_updated_by,com.last_update_dt "
				+ "from community com,user_community ucom where com.status_cd = 'tcs_act' and com.community_id = ucom.community_id and ucom.login_id = ? ";
		List<Community> communitties = query(query, new RowMapper<Community>() {

			@Override
            public Community mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				Community community = new Community();
				community.setCommunityId(rs.getLong("community_id"));
				community.setName(rs.getString("name"));
				community.setFoundationDate(rs.getDate("foundation_dt"));
				community.setAbout(rs.getString("about"));

				community.setAddress(rs.getString("address"));
				community.setEmail(rs.getString("email"));
				community.setWebsite(rs.getString("website"));

				community.setPhone(rs.getString("phone"));
				community.setPhoneTypeCd(rs.getString("phone_type"));
				community.setIndustryCd(rs.getString("industry_cd"));

				return community;
			}
		}, new Object[] { loginNumber });

		return communitties;
	}

	@Override
	public List<Community> selectCommunitiesByIndustryCd(String industryCd) {
		final String query = "select community_id,name,foundation_dt,about,address,email,website,phone,phone_type,industry_cd,status_cd,created_by,creation_dt,last_updated_by,last_update_dt from community where status_cd = 'tcs_act' and industry_cd = ?";
		List<Community> communitties = query(query, new RowMapper<Community>() {
			@Override
            public Community mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				Community community = new Community();
				community.setCommunityId(rs.getLong("community_id"));
				community.setName(rs.getString("name"));
				community.setFoundationDate(rs.getDate("foundation_dt"));
				community.setAbout(rs.getString("about"));

				community.setAddress(rs.getString("address"));
				community.setEmail(rs.getString("email"));
				community.setWebsite(rs.getString("website"));

				community.setPhone(rs.getString("phone"));
				community.setPhoneTypeCd(rs.getString("phone_type"));
				community.setIndustryCd(rs.getString("industry_cd"));

				return community;
			}
		}, new Object[] { industryCd });

		return communitties;
	}

	@Override
	public void saveUserCommunity(final UserCommunity userCommunity) {
		final String query = "insert into user_community values (null,?,?,?,?)";
		update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setLong(1, userCommunity.getLoginNumber());
				ps.setLong(2, userCommunity.getCommunityId());
//				ps.setLong(3, userCommunity.getCreatedBy());
//				ps.setDate(4, new java.sql.Date(userCommunity.getCreationDt() == null ? (new Date()).getTime() : userCommunity.getCreationDt().getTime()));
			}
		});
	}

	@Override
	public UserCommunity selectUserCommunity(long loginNumber, long communityId) {
		final String query = "select user_community_id,community_id,login_id,created_by,creation_dt from user_community where login_id = ? and community_id = ?";

		List<UserCommunity> userCommunities = query(query,
				new RowMapper<UserCommunity>() {
					@Override
                    public UserCommunity mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						UserCommunity userCommunity = new UserCommunity();
						userCommunity.setUserCommunityId(rs
								.getLong("user_community_id"));
						userCommunity.setCommunityId(rs.getLong("community_id"));
						userCommunity.setLoginNumber(rs.getLong("login_id"));

//						userCommunity.setCreatedBy(rs.getLong("created_by"));
//						userCommunity.setCreationDt(rs.getDate("creation_dt"));

						return userCommunity;
					}
				}, new Object[] { loginNumber, communityId });

		if (userCommunities == null || userCommunities.isEmpty()) {
			return null;
		}
		return userCommunities.get(0);
	}

}
