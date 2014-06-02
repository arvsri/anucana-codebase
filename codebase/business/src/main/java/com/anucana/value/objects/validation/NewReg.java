package com.anucana.value.objects.validation;

import javax.validation.GroupSequence;

@GroupSequence(value = {NewReg.FirstPass.class,NewReg.SecondPass.class})
public interface NewReg{
	
	public static interface FirstPass{
	}

	public static interface SecondPass{
	}

}