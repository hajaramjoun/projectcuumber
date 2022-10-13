package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //dryRun = false,
        features = "src/test/resources/features",
        glue = {"steps"},
//        tags = {"@REQ_POEI22GR3-2"},
        tags = {"@CreationCompte,@REQ_POEI22GR3-2"},
        plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" }
)

public class runner {
}