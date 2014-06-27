package com.anucana.web.controllers;

import org.springframework.security.core.context.SecurityContextHolder;

import com.anucana.user.data.IUserDetails;
import com.anucana.web.errors.AuthorizationException;

public abstract class AccessController {

	protected void selfAuthorize(long userId){
		if(!isUserLoggedIn(userId)){
			throw new AuthorizationException("You are not authorized to perform this operation!");
		}
		
	}
	
    protected boolean isUserLoggedIn(long userId) {
    	if(SecurityContextHolder.getContext().getAuthentication() != null && SecurityContextHolder.getContext().getAuthentication().getPrincipal() != null){
    		if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof IUserDetails){
        		IUserDetails userDetails = (IUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        		return userDetails.getUserId() == userId;
    		}
    	}
		return false;
	}

    protected IUserDetails getLoggedInUserDetails() {
        if (SecurityContextHolder.getContext().getAuthentication() != null
                && SecurityContextHolder.getContext().getAuthentication().getPrincipal() != null) {
            if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof IUserDetails) {
                return (IUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            }
        }
        return null;
    }

	
}
