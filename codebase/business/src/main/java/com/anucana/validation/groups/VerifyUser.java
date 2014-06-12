package com.anucana.validation.groups;

import javax.validation.GroupSequence;

@GroupSequence(value = {VerifyUser.FirstPass.class,VerifyUser.SecondPass.class})
public interface VerifyUser {

	public static interface FirstPass {
	}

	public static interface SecondPass {
	}

}
