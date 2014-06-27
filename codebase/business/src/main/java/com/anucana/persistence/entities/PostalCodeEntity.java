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
@Table(name = "POSTAL_CODE")
public class PostalCodeEntity extends EqualityHashcodeEntity implements Serializable, Identifiable<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "POSTAL_CODE_ID")
    private Long id;

    @Column(name = "POSTAL_CD")
    private Integer postalCd;

    @ManyToOne(targetEntity = TypeTableEntity.class)
    @JoinColumn(name = "COUNTRY_CD", referencedColumnName = "TYPE_CD")
    private TypeTableEntity country;

    @Column(name = "STATE_NAME", length = 255)
    private String state;

    @Column(name = "DISTRICT_NAME", length = 255)
    private String district;

    @Column(name = "OFFICE_NAME", length = 255)
    private String office;

    @Override
    public Long getId() {
        return this.id;
    }

    public Integer getPostalCd() {
        return postalCd;
    }


    public TypeTableEntity getCountry() {
        return country;
    }


    public String getState() {
        return state;
    }


    public String getDistrict() {
        return district;
    }


    public String getOffice() {
        return office;
    }


    @Override
    public void setId(Long id) {
        this.id = id;
    }


    public void setPostalCd(Integer postalCd) {
        this.postalCd = postalCd;
    }


    public void setCountry(TypeTableEntity country) {
        this.country = country;
    }


    public void setState(String state) {
        this.state = state;
    }


    public void setDistrict(String district) {
        this.district = district;
    }


    public void setOffice(String office) {
        this.office = office;
    }

}
