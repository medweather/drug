package com.company.drug.web.screens.medicament;

import com.haulmont.cuba.gui.screen.*;
import com.company.drug.entity.Medicament;

@UiController("drug_Medicament.browse")
@UiDescriptor("medicament-browse.xml")
@LookupComponent("medicamentsTable")
@LoadDataBeforeShow
public class MedicamentBrowse extends StandardLookup<Medicament> {
}