package com.anucana.persistence.entities;

import java.io.Serializable;

public interface StandardEntity<T extends Serializable> {

    public static final int NAME_SIZE = 255;
    public static final int FIRSTNAME_SIZE = 50;
    public static final int LASTNAME_SIZE = 50;
    public static final int EMAIL_SIZE = 255;
    public static final int PASSWORD_SIZE = 128;
    public static final int PHONE_NUMBER_SIZE = 10;
    public static final int MESSENGER_SIZE = 255;
    public static final int ADDRESS_LINE_SIZE = 255;
    public static final int WEBSITE_SIZE = 255;
    
	
	T getId();

	void setId(T id);

}
