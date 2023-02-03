package stepdefintion.com;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import reusablefiles.Browser;

import java.io.IOException;

public class StepDefinition extends Browser {

WebDriver driver;
    @Given("To navigate in to new website")
    public void navigateInToNewWebsite() throws IOException {
 driver=Browser.browser();
    }


    @And("click the login button")
    public void loginButton(){
        driver.findElement(By.id("Login")).click();
    }
    @Then("validate whether user navigate into homepage")
    public void navigateHomePage(){
        driver.quit();

    }


    @When("User enter the username {string} and password {string}")
    public void userEnterTheUsernameAndPassword(String userName, String password) throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
    }
}
