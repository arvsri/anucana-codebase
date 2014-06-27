package com.anucana.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COMMUNITY_KEYWORD")
public class CommunityKeywordEntity extends AuditEntity implements Identifiable<Long>, Serializable {

	private static final long serialVersionUID = 3742975405394974080L;
	
	@Id
	@GeneratedValue
	@Column(name = "KEYWORD_ID")
	private Long id;

	@ManyToOne(targetEntity = CommunityEntity.class)
	@JoinColumn( name = "COMMUNITY_ID", referencedColumnName = "COMMUNITY_ID" , nullable = false)
	private CommunityEntity community;
	
	@Column(name = "KEYWORD", length = 255, nullable = false)
	private String keyword;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public CommunityEntity getCommunity() {
		return community;
	}

	public void setCommunity(CommunityEntity community) {
		this.community = community;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
