package qa.automation.api;

import ch.qos.logback.classic.Logger;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import qa.automation.util.DataProvider;
import qa.automation.util.SpringContextConfiguration;

import javax.annotation.PostConstruct;

public class APISteps extends SpringContextConfiguration {

    @Autowired
    APIActions apiActions;

    @Autowired
    DataProvider dataProvider;

    private static final Logger log = (Logger) LoggerFactory.getLogger(APIActions.class);

    private String BASE_ENDPOINT;

    final private String API_SIGNUP_ENDPT = "/v2/user/signup";
    final private String API_ACTIVITY_ENDPT = "/v2/user/activities";
    final private String API_FOLDERS_ENDPT = "/v2/folders";
    final private String USER_ENDPT = "/v2/user";
    final private String USER_ENDPT_TEST = "/v2/user/test";

    private static Response response;
    private String jsonResponseString;

    @PostConstruct
    public void init()
    {
        String url = dataProvider.getAkiliURL();

        // Use particular api urls for Prod and Big Dev
        // else, api url is USUALLY on port 11080 on http
        if (url.contains("https://dev-api.akiliws.com"))
            BASE_ENDPOINT ="https://dev-api.akiliws.com";
        else if (url.contains("https://test-api.akiliws.com"))
            BASE_ENDPOINT = "https://test-api.akiliws.com";

    }

    @Given("^new caregiver is signed up sucessfully via API$")
    public void newCaregiverIsSignedUpSucessfullyViaAPI() {
        apiActions.newCaregiverSignUp();
    }
}
