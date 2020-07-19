package com.company.drug.web.screens.statusmedicamentregistration;

import com.company.drug.entity.StatusMedicamentRegistration;
import com.haulmont.cuba.gui.screen.*;

@UiController("drug_StatusMedicamentRegistration.browse")
@UiDescriptor("status-medicament-registration-browse.xml")
@LookupComponent("statusMedicamentRegistrationsTable")
@LoadDataBeforeShow
public class StatusMedicamentRegistrationBrowse extends StandardLookup<StatusMedicamentRegistration> {
}