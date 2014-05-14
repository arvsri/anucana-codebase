package com.anucana.web.user.data;

import org.springframework.security.core.GrantedAuthority;

import com.anucana.value.objects.UserRole;

public class WebUserRole implements GrantedAuthority {

	private static final long serialVersionUID = 6766710541730229859L;
	
	private UserRole userRole;
	
	public WebUserRole(UserRole userRole){
		this.userRole = userRole;
	}
	
	@Override
	public String getAuthority() {
		return userRole.getRole();
	}
	
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof WebUserRole) {
            return this.getAuthority().equals(((WebUserRole) obj).getAuthority());
        }

        return false;
    }

    public int hashCode() {
        return this.userRole.getRole().hashCode();
    }

    public String toString() {
        return this.userRole.getRole();
    }
	

}
