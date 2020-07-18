package com.company.drug.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s|medicamentName")
@Table(name = "DRUG_MEDICAMENT")
@Entity(name = "drug_Medicament")
public class Medicament extends StandardEntity {
    private static final long serialVersionUID = 5822389970620753248L;

    @Column(name = "MEDICAMENT_NAME")
    protected String medicamentName;

    @Column(name = "RELEASE_FORM")
    protected String releaseForm;

    @Column(name = "CIPHER")
    protected String cipher;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "IBD")
    protected Date iBD;

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public String getCipher() {
        return cipher;
    }

    public void setReleaseForm(String releaseForm) {
        this.releaseForm = releaseForm;
    }

    public String getReleaseForm() {
        return releaseForm;
    }

    public void setMedicamentName(String medicamentName) {
        this.medicamentName = medicamentName;
    }

    public String getMedicamentName() {
        return medicamentName;
    }

    public Date getIBD() {
        return iBD;
    }

    public void setIBD(Date iBD) {
        this.iBD = iBD;
    }

}