package Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import util.ConfigReader;


import java.util.concurrent.TimeUnit;

public class Base {
static WebDriver driver;
@BeforeClass
public static void setup(){
    String s = ConfigReader.getProperty("test.browser.name").toLowerCase();
    if ("chrome".equals(s)) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    } else if ("firefox".equals(s)) {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    } else {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();


}

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
