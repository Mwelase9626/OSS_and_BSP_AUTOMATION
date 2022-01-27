package starter;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue =  "StepsDefinition",
        features = "src/test/java/Features/LoginApplication.feature"
)
public class runnerForLoginApplication {
}
