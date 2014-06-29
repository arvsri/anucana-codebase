package com.anucana.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PASSWORD_HISTORY")
public class PasswordHistoryEntity extends EqualityHashcodeEntity implements Serializable, StandardEntity<Long> {

    private static final long serialVersionUID = -3997638096651472788L;

    @Id
    @GeneratedValue
    @Column(name = "PASSWORD_HISTORY_ID")
    private Long id;

    @ManyToOne(targetEntity = UserLoginEntity.class)
    @JoinColumn(name = "LOGIN_ID", referencedColumnName = "LOGIN_ID", nullable = false)
    private UserLoginEntity userLogin;

    @Column(name = "PASSWORD_SHA", nullable = false, length = PASSWORD_SIZE)
    private String password;

    public PasswordHistoryEntity(){}

    public PasswordHistoryEntity(UserLoginEntity user, String password){
    	setUserLogin(user);
    	setPassword(password);
    }
    
    @Override
    public Long getId() {
        return this.id;
    }

    public UserLoginEntity getUserLogin() {
        return userLogin;
    }


    public String getPassword() {
        return password;
    }


    public void setUserLogin(UserLoginEntity userLogin) {
        this.userLogin = userLogin;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public void setId(Long id) {
        this.id = id;
    }

}
