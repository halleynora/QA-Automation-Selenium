package qa.automation.account;

import org.openqa.selenium.By;

public interface AccountActions {
    By acceptInvitationLocator = By.cssSelector("#root > div > main > section > div > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a");    

    void loadTeacherInvite();

    void acceptTeacherInvitation();
}
