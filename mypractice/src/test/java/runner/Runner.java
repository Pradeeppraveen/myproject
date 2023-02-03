package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/newfeaturefile.com/"},
        glue = {"stepdefintion/com"},
        plugin = {"json:target/cucumber-reports/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@vijay"

)
public class Runner {

}
