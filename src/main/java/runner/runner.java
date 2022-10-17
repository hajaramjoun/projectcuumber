package runner;

import commun.ImportResultsToXray;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;


@RunWith(Cucumber.class)
@CucumberOptions(
        //dryRun = false,
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = {"@TEST_POEI22GR3-20"},
//        tags = {"@CreationCompte,@REQ_POEI22GR3-2"},
        plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" }
)

public class runner {
    @AfterClass
    public static void teardown() throws NoSuchAlgorithmException, KeyStoreException, IOException, InterruptedException, KeyManagementException {
        ImportResultsToXray res = new ImportResultsToXray();
        res.RemonteResultats();
    }
}