package com.company.drug.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.drug.entity.Country;

@UiController("drug_Country.edit")
@UiDescriptor("country-edit.xml")
@EditedEntityContainer("countryDc")
@LoadDataBeforeShow
public class CountryEdit extends StandardEditor<Country> {
}