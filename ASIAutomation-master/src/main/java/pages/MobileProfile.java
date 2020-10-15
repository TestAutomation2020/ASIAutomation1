package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import util.ConfigReader;


import javax.swing.*;
import java.io.IOException;
import java.util.List;

import static java.sql.DriverManager.getDriver;

public class MobileProfile extends EActions {
    //Mobile profile link on Home Page
    @FindBy(how = How.XPATH, using = "//*[@id='lnk_mobile']")
    private WebElement AddMobileProfilelink;

    //Mobile profile form
    @FindBy(how = How.XPATH, using = "//*[@class='cls-text' and text()='Add Mobile Profile']")
    private WebElement AddMobileProfileText;
    @FindBy(how = How.XPATH, using = "//*[@name='name']")
    private WebElement NameTxtboxonaddmobileform;
    @FindBy(how = How.XPATH, using = "//*[@name='pin']")
    private WebElement PinTxtboxonaddmobileform;
    @FindBy(how = How.XPATH, using = "//*[@name='emailaddress']")
    private WebElement EmailTxtboxonaddmobileform;
    @FindBy(how = How.XPATH, using = "//*[@data-ref='btnInnerEl' and text()='Add']")
    private WebElement Addbuttononmobileform;
    @FindBy(how = How.XPATH, using = "//*[@data-ref='labelTextEl' and contains(text(),' You will need to provide the user with the pin number in order to log in.')]")
    private WebElement NoteonMobileForm;

    //Click on mobile user created
    @FindBy(how = How.XPATH, using = "//a[@href='#'][contains(.,'aasmobile')]")
    private WebElement Linkofmobileuserscreated;

    @FindBy(how = How.XPATH, using = "//iframe[@class='x-component x-fit-item x-component-default']")
    private WebElement MobileFrame;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Edit Mobile Profile')]")
    private WebElement EditMobileProfile;

    @FindBy(how = How.XPATH, using = "//div[@data-ref='inputEl'][contains(.,'https://uat.enwisen.com/asi/mobile/index.html')]")
    private WebElement clipboardlink;
    @FindBy(how = How.XPATH, using = "//div[@class='x-window x-layer x-window-default x-border-box x-resizable x-window-resizable x-window-default-resizable']//span[contains(@class,'x-btn-button x-btn-button-default-toolbar-small  x-btn-no-text x-btn-icon x-btn-icon-left x-btn-button-center ')]")
    private WebElement Closeform;
    @FindBy(how = How.XPATH, using = "//div[@id='PinCodeLogo']//img[@src='resources/img/logo.png'][1]")
    private WebElement Logoforpinscreen;
    @FindBy(how = How.XPATH, using = "//*[@class=\"x-button-label\" and text()='1']")
    private WebElement Buttonpin1;
    @FindBy(how = How.XPATH, using = "//*[@class=\"x-button-label\" and text()='2']")
    private WebElement Buttonpin2;
    @FindBy(how = How.XPATH, using = "//*[@class=\"x-button-label\" and text()='3']")
    private WebElement Buttonpin3;
    @FindBy(how = How.XPATH, using = "//*[@class=\"x-button-label\" and text()='4']")
    private WebElement Buttonpin4;
    @FindBy(how = How.XPATH, using = "//*[@class=\"x-button-label\" and text()='OK']")
    private WebElement Buttonpinok;


    public MobileProfile(WebDriver webDriver) {
        super(webDriver);
    }


    public void createmobileprofile(String Name, int pin, String Email) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            //Click on Add Mobile profile link
            clickwhenready(AddMobileProfilelink);
            IsElementExists(AddMobileProfileText);
            EnterText(NameTxtboxonaddmobileform, ConfigReader.getProperty("mobileuser"));
            EnterText(PinTxtboxonaddmobileform, ConfigReader.getProperty("pin"));
            EnterText(EmailTxtboxonaddmobileform, ConfigReader.getProperty("email"));
            clickwhenready(Addbuttononmobileform);
            Reporter.log("Mobile Profile user is added as expected");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ScreenPrints(webDriver);
            Reporter.log(nameOfCurrMethod +ex.toString());
        }

    }

    //Select user from list on home page widget
    public void searchnewmobileprofile(String Name) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();

        try {
           waitForLoadingIconToBeDisappeared();
            Thread.sleep(5000);
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            WebElement Element = webDriver.findElement(By.xpath("//a[@href='#'][contains(.,'mobile')]"));
            js.executeScript("arguments[0].scrollIntoView();", Element);
            System.out.println("Add Mobile Profile link clicked !!!");
            Reporter.log("Add Mobile Profile link clicked as expected");
            Thread.sleep(5000);
            //Click on Add Mobile profile link
            Element.click();
            Thread.sleep(10000);
            String abc = EditMobileProfile.getText();
            System.out.println(abc);
           //Copy Link
            String copylink= clipboardlink.getText();
            System.out.println(copylink);
            System.out.println("Mobile link is copied successfully");
            Reporter.log("Mobile link is copied successfully");
            String mobilelink = clipboardlink.getText();
            System.out.println(mobilelink);

            webDriver.navigate().to(mobilelink);
            WebDriverWait wait = new WebDriverWait(webDriver,220);
            System.out.println("Mobile user link is opened");
            Reporter.log("Mobile link is copied successfully");

            IsElementExists(Logoforpinscreen);
            System.out.println("Logo of Mobile screen is displayed as expected");
            Reporter.log("Logo of Mobile screen is displayed as expected");
            clickwhenready(Buttonpin1);
            clickwhenready(Buttonpin2);
            clickwhenready(Buttonpin3);
            clickwhenready(Buttonpin4);
            Thread.sleep(2000);
            ScreenPrints(webDriver);
            clickwhenready(Buttonpinok);
            Reporter.log("Mobile user login screen is displayed as expected");
            Thread.sleep(2000);
            ScreenPrints(webDriver);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ScreenPrints(webDriver);
            Reporter.log(nameOfCurrMethod +ex.toString());
        }

    }

}




