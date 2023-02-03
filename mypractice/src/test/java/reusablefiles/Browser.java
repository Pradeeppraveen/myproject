package reusablefiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Browser {
    static WebDriver driver;
    public static WebDriver browser() throws IOException {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        FileInputStream fis = new FileInputStream(new File("D:\\selenium\\my project\\mypractice\\src\\main\\resources\\utility.properties"));//copy from utility prperty absolute path and wut help of file input stream
        Properties properties = new Properties();//object
        properties.load(fis);//load method
        System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(properties.getProperty("url"));
        driver.manage().window().maximize();
        return driver;
    }
}
