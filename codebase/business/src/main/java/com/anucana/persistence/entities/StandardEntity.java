package com.anucana.persistence.entities;

import java.io.Serializable;

public interface StandardEntity<T extends Serializable> {

    public static final int FIRSTNAME_SIZE = 50;
    public static final int LASTNAME_SIZE = 50;
    public static final int EMAIL_SIZE = 255;
    public static final int PASSWORD_SIZE = 128;
	
	T getId();

	void setId(T id);

}
