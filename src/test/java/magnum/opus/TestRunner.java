package magnum.opus;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
/**
 * The TestRunner class is responsible for running Cucumber tests for the Magnum Opus application.
 */
@Slf4j
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        glue = "magnum.opus.stepdefinitions"
)
public class TestRunner {}