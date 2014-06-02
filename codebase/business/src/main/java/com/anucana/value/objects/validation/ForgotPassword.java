package com.anucana.value.objects.validation;

import javax.validation.GroupSequence;

@GroupSequence(value = {ForgotPassword.FirstPass.class,ForgotPassword.SecondPass.class,ForgotPassword.ThirdPass.class})
public interface ForgotPassword{

	public static interface FirstPass{
	}

	public static interface SecondPass{
	}
	
	public static interface ThirdPass{
	}
	
}