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
@Table(name = "ADDRESS")
public class AddressEntity extends EqualityHashcodeEntity implements Serializable, StandardEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "ADDRESS_ID")
    private Long id;

    @ManyToOne(targetEntity = PostalCodeEntity.class)
    @JoinColumn(name = "POSTAL_CODE_ID", referencedColumnName = "POSTAL_CODE_ID", nullable = true)
    private PostalCodeEntity postalCode;

    @Column(name = "ADDRESS_LN_1", length = 255)
    private String addressLine1;

    @Column(name = "ADDRESS_LN_2", length = 255)
    private String addressLine2;

    @Column(name = "ADDRESS_LN_3", length = 255)
    private String addressLine3;

    @Override
    public Long getId() {
        return this.id;
    }


    public PostalCodeEntity getPostalCode() {
        return postalCode;
    }


    public String getAddressLine1() {
        return addressLine1;
    }


    public String getAddressLine2() {
        return addressLine2;
    }


    public String getAddressLine3() {
        return addressLine3;
    }


    @Override
    public void setId(Long id) {
        this.id = id;
    }


    public void setPostalCode(PostalCodeEntity postalCode) {
        this.postalCode = postalCode;
    }


    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }


}
