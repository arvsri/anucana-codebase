package com.anucana.web.controllers;

import org.springframework.core.Conventions;
import org.springframework.validation.BindingResult;

public class ControllerUtil {

	public static String getVariableName(Object obj){
		return Conventions.getVariableName(obj);
	}
	
	public static String getVariableName(BindingResult obj){
		return BindingResult.class.getName() +"." + obj.getObjectName();
	}

}
