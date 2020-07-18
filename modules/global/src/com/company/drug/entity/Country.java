package com.company.drug.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|countryName")
@Table(name = "DRUG_COUNTRY")
@Entity(name = "drug_Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = 2774849947411622183L;

    @Column(name = "COUNTRY_NAME")
    protected String countryName;

    @Column(name = "COUNTRY_NAME_EN")
    protected String countryNameEn;

    @Column(name = "CIPHER")
    protected String cipher;

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public String getCipher() {
        return cipher;
    }

    public void setCountryNameEn(String countryNameEn) {
        this.countryNameEn = countryNameEn;
    }

    public String getCountryNameEn() {
        return countryNameEn;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}