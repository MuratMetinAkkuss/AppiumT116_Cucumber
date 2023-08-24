package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = "src/test/resources/features/booking.feature",
        glue = "stepdefinitions",
        tags = "@browser",
        dryRun = false
)


        public class Runner {
}
