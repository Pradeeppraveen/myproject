package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sales {
    public static void main(String[] args) {
        System.setProperty("webdriver.drive.chromedriver","C:\\chrome\\chrome\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=i");
        driver.findElement(By.id("username")).sendKeys("userName");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("Login")).click();
    }
    }



