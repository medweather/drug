package com.company.drug.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.drug.entity.Country;

@UiController("drug_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countriesTable")
@LoadDataBeforeShow
public class CountryBrowse extends StandardLookup<Country> {
}