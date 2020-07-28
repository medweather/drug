package com.company.drug.service;

import com.company.drug.entity.Medicament;
import com.company.drug.entityApi.MedicamentInfo;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.global.Metadata;
import org.apache.commons.compress.utils.Lists;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service(MedicamentService.NAME)
public class MedicamentServiceBean implements MedicamentService {

    @Inject
    private Persistence persistence;
    @Inject
    private Metadata metadata;

    @Override
    public List<MedicamentInfo> getAllMedicamentInfo() {
        return transformAllMedicamentToMedicamentInfo();
    }

    @Override
    public Medicament createMedicament(MedicamentInfo medicamentInfo) {
        Medicament medicament;
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            medicament = transformMedicamentInfoToMedicament(medicamentInfo);
            em.persist(medicament);
            tx.commit();
        }
        return medicament;
    }

    @Override
    public void deleteMedicament(String medicamentId) {
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            em.remove(Objects.requireNonNull(em.find(Medicament.class, UUID.fromString(medicamentId))));
            tx.commit();
        }
    }

    protected List<MedicamentInfo> transformAllMedicamentToMedicamentInfo() {
        List<MedicamentInfo> medicamentInfos = Lists.newArrayList();
        for (Medicament medicament : getAllMedicament()) {
            medicamentInfos.add(transformMedicamentToMedicamentInfo(medicament));
        }
        return medicamentInfos;
    }

    protected Medicament transformMedicamentInfoToMedicament(MedicamentInfo medicamentInfo) {
        Medicament medicament = metadata.create(Medicament.class);
        medicament.setMedicamentName(medicamentInfo.getMedicamentName());
        medicament.setCipher(medicamentInfo.getCipher());
        medicament.setReleaseForm(medicamentInfo.getReleaseForm());
        Date iBD = new Date();
        iBD.setTime(medicamentInfo.getiBD());
        medicament.setIBD(iBD);
        return medicament;
    }

    protected MedicamentInfo transformMedicamentToMedicamentInfo(Medicament medicament) {
        MedicamentInfo medicamentInfo = new MedicamentInfo();
        medicamentInfo.setUuid(String.valueOf(medicament.getId()));
        medicamentInfo.setMedicamentName(medicament.getMedicamentName());
        medicamentInfo.setCipher(medicament.getCipher());
        medicamentInfo.setiBD(medicament.getIBD().getTime());
        medicamentInfo.setReleaseForm(medicament.getReleaseForm());
        return medicamentInfo;
    }

    protected List<Medicament> getAllMedicament() {
        List<Medicament> allMedicament;
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            allMedicament = em.createQuery("select m from drug_Medicament m", Medicament.class).getResultList();
            tx.commit();
        }
        return allMedicament;
    }
}