package Execution;

import listener.TestStatistics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import util.ConfigReader;

import java.util.concurrent.TimeUnit;


public class Base {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeTest
    public void setup(ITestContext ctx) {
        TestRunner runner = (TestRunner) ctx;
        runner.setOutputDirectory(System.getProperty("user.dir") + "\\Report");
        String s = ConfigReader.getProperty("test.browser.name").toLowerCase();
        if ("chrome".equals(s)) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if ("firefox".equals(s)) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
            //driver = new ChromeDriver();
            //create object of chrome options
            ChromeOptions options = new ChromeOptions();

            //add the headless argument
            options.addArguments("headless");

            //pass the options parameter in the Chrome driver declaration
            driver = new ChromeDriver(options);

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @AfterSuite
    public void writeTest(){
        System.out.println(TestStatistics.getPassedTests());
        System.out.println(TestStatistics.getFailedTests());
        System.out.println(TestStatistics.getSkippedTests());
        System.out.println(TestStatistics.getCount());
    }

}