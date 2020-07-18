package com.company.drug.web.screens.medicament;

import com.haulmont.cuba.gui.screen.*;
import com.company.drug.entity.Medicament;

@UiController("drug_Medicament.edit")
@UiDescriptor("medicament-edit.xml")
@EditedEntityContainer("medicamentDc")
@LoadDataBeforeShow
public class MedicamentEdit extends StandardEditor<Medicament> {
}