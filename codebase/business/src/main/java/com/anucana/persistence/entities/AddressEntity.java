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
@Table(name = "address")
public class AddressEntity extends EqualityHashcodeEntity implements Serializable, StandardEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "address_id")
    private Long id;

    @ManyToOne(targetEntity = PostalCodeEntity.class)
    @JoinColumn(name = "postal_code_id", referencedColumnName = "postal_code_id", nullable = true)
    private PostalCodeEntity postalCode;

    @Column(name = "address_ln_1", length = ADDRESS_LINE_SIZE)
    private String addressLine1;

    @Column(name = "address_ln_2", length = ADDRESS_LINE_SIZE)
    private String addressLine2;

    @Column(name = "lattitude")
    private Double lattitude;

    @Column(name = "longitude")
    private Double longitude;
    
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


    public Double getLattitude() {
		return lattitude;
	}

	public Double getLongitude() {
		return longitude;
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

	public void setLattitude(Double lattitude) {
		this.lattitude = lattitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}



}
