package com.anucana.persistence.entities;

import java.io.Serializable;

public interface Identifiable<T extends Serializable> {

	T getId();

	void setId(T id);

}
