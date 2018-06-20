package qa.automation.api.impl;

import gherkin.lexer.Ca;
import org.springframework.beans.factory.annotation.Autowired;
import qa.automation.api.APIActions;
import qa.automation.dto.api.request.Caregiver;
import qa.automation.util.DataProvider;
import qa.seleniumdriver.BrowserDriver;

public class APIActionsImpl implements APIActions {

    @Autowired
    Caregiver caregiver;

    @Autowired
    DataProvider dataProvider;

    @Override
    public void newCaregiverSignUp() {

        createCaregiverRequestObject(caregiver);

    }

    private void createCaregiverRequestObject(Caregiver caregiver){

        long unixTime = BrowserDriver

        caregiver.setEmail(dataProvider);
    }
}
