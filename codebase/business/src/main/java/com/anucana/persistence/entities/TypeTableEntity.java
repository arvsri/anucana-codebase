package com.anucana.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "type_table",uniqueConstraints =  @UniqueConstraint(columnNames = { "type_cd" }))
public class TypeTableEntity extends AuditEntity implements Serializable,StandardEntity<String> {
	
	private static final long serialVersionUID = 2901564050424912121L;

	@Id
	@Column(name = "type_cd",nullable = false, unique= true)
	private String typeCode;
	
	@JoinColumn(name = "group_cd",nullable = false)
	@ManyToOne(targetEntity = TypeGroupEntity.class)
	private TypeGroupEntity groupCode;
	
	@Column(name = "type_description",nullable = false)
	private String typeDescription;
	
	@JoinColumn(name = "status_cd",nullable = false)
	@OneToOne(targetEntity = TypeTableEntity.class)
	private TypeTableEntity statusCode;

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public TypeGroupEntity getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(TypeGroupEntity groupCode) {
		this.groupCode = groupCode;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

	public TypeTableEntity getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(TypeTableEntity statusCode) {
		this.statusCode = statusCode;
	}

    public boolean equals(Object obj) {
    	return EqualsBuilder.reflectionEquals(this,obj);
    }
	
    @SuppressWarnings("unchecked")
	public int hashCode(){
    	return HashCodeBuilder.reflectionHashCode(this,CollectionUtils.EMPTY_COLLECTION);
    }

	@Override
	public String getId() {
		return getTypeCode();
	}

	@Override
	public void setId(String id) {
		setTypeCode(typeCode);
	}
}
