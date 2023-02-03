package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import reusablefiles.Browser;

public class Hooks extends Browser {
    static WebDriver driver;
    @AfterStep
    public  void captureScreenshot(Scenario scenario) {
      final byte[] screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png", null);

    }
    @After
    public void close(){

        driver.close();
    }
}


