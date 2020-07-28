package com.company.drug.entityApi;

import java.io.Serializable;

public class MedicamentInfo implements Serializable {

    protected String uuid;
    protected String medicamentName;
    protected String releaseForm;
    protected String cipher;
    protected long iBD;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMedicamentName() {
        return medicamentName;
    }

    public void setMedicamentName(String medicamentName) {
        this.medicamentName = medicamentName;
    }

    public String getReleaseForm() {
        return releaseForm;
    }

    public void setReleaseForm(String releaseForm) {
        this.releaseForm = releaseForm;
    }

    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public long getiBD() {
        return iBD;
    }

    public void setiBD(long iBD) {
        this.iBD = iBD;
    }
}
