package com.company.drug.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s|numberRU")
@Table(name = "DRUG_STATUS_MEDICAMENT_REGISTRATION")
@Entity(name = "drug_StatusMedicamentRegistration")
public class StatusMedicamentRegistration extends StandardEntity {
    private static final long serialVersionUID = -3417623654788181713L;

    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEDICAMENT_ID")
    protected Medicament medicament;

    @Column(name = "RELEASE_FORM")
    protected String releaseForm;

    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    protected Country country;

    @Column(name = "NUMBER_RU", length = 100)
    protected String numberRU;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_RU")
    protected Date dateRU;

    @Column(name = "STATUS")
    protected String status;

    @Lob
    @Column(name = "INDICATION_FOR_USE")
    protected String indicationForUse;

    @Lob
    @Column(name = "SIDE_EFFECTS")
    protected String sideEffects;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATTACHMENT_ID")
    protected FileDescriptor attachment;

    public FileDescriptor getAttachment() {
        return attachment;
    }

    public void setAttachment(FileDescriptor attachment) {
        this.attachment = attachment;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    public String getIndicationForUse() {
        return indicationForUse;
    }

    public void setIndicationForUse(String indicationForUse) {
        this.indicationForUse = indicationForUse;
    }

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }

    public Date getDateRU() {
        return dateRU;
    }

    public void setDateRU(Date dateRU) {
        this.dateRU = dateRU;
    }

    public String getNumberRU() {
        return numberRU;
    }

    public void setNumberRU(String numberRU) {
        this.numberRU = numberRU;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getReleaseForm() {
        return releaseForm;
    }

    public void setReleaseForm(String releaseForm) {
        this.releaseForm = releaseForm;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }
}