package qa.automation.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import qa.automation.account.AccountActions;
import qa.automation.util.DataProvider;
import qa.seleniumdriver.BrowserDriver;

public class AccountActionsImpl implements AccountActions {

    @Autowired
    DataProvider dataProvider;

    @Override
    public void loadTeacherInvite() {
        BrowserDriver.loadPage(dataProvider.getTeacherInvite());
        BrowserDriver.wait(3000);
    }

    @Override
    public void acceptTeacherInvitation() {
        BrowserDriver.click(acceptInvitationLocator);
    }
}
