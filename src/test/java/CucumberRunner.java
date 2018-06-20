import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty", "html:target/cucumber-html", "json:target/cucumber-json-report.json"},
        glue={"qa.automation"},
        features={"src/main/resources/cucmberfeatures"},
        tags={"@accountsetup"}
)
public class CucumberRunner {
}
