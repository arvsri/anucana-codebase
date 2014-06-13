package com.anucana.value.objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class TypeGroup implements Serializable{

	private static final long serialVersionUID = -6265919786478860394L;

	private String groupCode;

	private String groupDescription;
	
	public TypeGroup(String groupCode, String groupDescription){
		this.groupCode = groupCode;
		this.groupDescription = groupDescription;
	}

	private Collection<TypeGroup.Type> types = new ArrayList<TypeGroup.Type>(); 
	
	public Collection<TypeGroup.Type> getTypes() {
		return types;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public static class Type implements Serializable{

		private static final long serialVersionUID = 8546055487829311332L;

		private String typeCode;
		
		private String typeDescription;
		
		// for jquery UI auto complete support
		private String value;
		
		public Type(String typeCode,String typeDescription){
			this.typeCode = typeCode;
			this.typeDescription = typeDescription;
			this.value = typeDescription;
		}

		public String getTypeCode() {
			return typeCode;
		}

		public String getTypeDescription() {
			return typeDescription;
		}

		public String getValue() {
			return value;
		}
		
	}
	
}
