package starter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = "StepsDefinition",
        features = "src/test/resources/Features/Register on  the BSP.feature"
)
public class runner_for_BSP_Registration {
}
