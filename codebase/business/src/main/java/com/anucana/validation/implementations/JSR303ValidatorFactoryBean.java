package com.anucana.validation.implementations;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.validation.Errors;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

public class JSR303ValidatorFactoryBean extends LocalValidatorFactoryBean {
	
	public void validate(Object target,String propertyName, Errors errors, Object... validationHints) {
		Set<Class<?>> groups = new LinkedHashSet<Class<?>>();
		if (validationHints != null) {
			for (Object hint : validationHints) {
				if (hint instanceof Class) {
					groups.add((Class<?>) hint);
				}
			}
		}
		processConstraintViolations(getValidator().validateProperty(target, propertyName,groups.toArray(new Class[groups.size()])), errors);
	}
	
}
