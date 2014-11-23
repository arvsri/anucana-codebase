package com.anucana.persistence.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "type_group",uniqueConstraints =  @UniqueConstraint(columnNames = { "group_cd" }))
public class TypeGroupEntity extends AuditEntity implements Serializable,StandardEntity<String>{

	private static final long serialVersionUID = -6316770806512052175L;

	@Id
	@Column(name = "group_cd",unique = true,length = 20,nullable = false)
	private String groupCode;

	@Column(name = "type_cd_prefix",length = 10,nullable = false)
	private String typeCodePrefix;

	@Column(name = "group_description",length = 255,nullable = false)
	private String groupDescription;

	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "groupCode" ,targetEntity = TypeTableEntity.class)
	private Collection<TypeTableEntity> typeCodes;
	
	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getTypeCodePrefix() {
		return typeCodePrefix;
	}

	public void setTypeCodePrefix(String typeCodePrefix) {
		this.typeCodePrefix = typeCodePrefix;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	
	public Collection<TypeTableEntity> getTypeCodes() {
		return typeCodes;
	}

	public void setTypeCodes(Collection<TypeTableEntity> typeCodes) {
		this.typeCodes = typeCodes;
	}

	@Override
	public String getId() {
		return getGroupCode();
	}

	@Override
	public void setId(String id) {
		setGroupCode(id);
	}


}
