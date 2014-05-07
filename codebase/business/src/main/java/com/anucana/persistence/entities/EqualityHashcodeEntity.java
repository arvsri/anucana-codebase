package com.anucana.persistence.entities;

import java.io.Serializable;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public abstract class EqualityHashcodeEntity implements Serializable {

	private static final long serialVersionUID = -5604976185575284352L;

    public boolean equals(Object obj) {
    	return EqualsBuilder.reflectionEquals(this,obj);
    }
	
    @SuppressWarnings("unchecked")
	public int hashCode(){
    	return HashCodeBuilder.reflectionHashCode(this,CollectionUtils.EMPTY_COLLECTION);
    }
	

}
