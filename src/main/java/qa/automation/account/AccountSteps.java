package qa.automation.account;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import qa.automation.util.DataProvider;
import qa.automation.util.SpringContextConfiguration;
import qa.seleniumdriver.BrowserDriver;

public class AccountSteps extends SpringContextConfiguration {

    @Autowired
    DataProvider dataProvider;

    @Autowired
    AccountActions accountActions;

    @Given("^Invite teacher URL is successfully loaded$")
    public void inviteTeacherURLIsSuccessfullyLoaded() {

        accountActions.loadTeacherInvite();

    }

    @Then("^Accept the invitation$")
    public void acceptTheInvitation() {
        accountActions.acceptTeacherInvitation();
    }


}
