package com.company.drug.service;

import com.company.drug.entity.Medicament;
import com.company.drug.entityApi.MedicamentInfo;

import java.util.List;

public interface MedicamentService {
    String NAME = "drug_MedicamentService";

    List<MedicamentInfo> getAllMedicamentInfo();

    Medicament createMedicament(MedicamentInfo medicamentInfo);

    void deleteMedicament(String medicamentId);
}