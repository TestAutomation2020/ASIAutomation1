package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import util.ConfigReader;
import util.ScreenPrints;

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
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'mobile')]")
    private WebElement Linkofmobileuserscreated;

    @FindBy(how = How.XPATH, using = "//*[@data-ref='textEl' and text()='Edit Mobile Profile']")
    private WebElement Labelonmobileprofileform;

    @FindBy(how = How.XPATH, using = "//*[@data-ref='btnInnerEl' and text()='Copy to Clipboard']")
    private WebElement Copylinkbtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"hcm-button-1502-btnEl\"]")
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
        try {
            //Click on Add Mobile profile link
            clickwhenready(AddMobileProfilelink);
            IsElementExists(AddMobileProfileText);
            EnterText(NameTxtboxonaddmobileform, ConfigReader.getProperty("mobileuser"));
            EnterText(PinTxtboxonaddmobileform, ConfigReader.getProperty("pin"));
            EnterText(EmailTxtboxonaddmobileform, ConfigReader.getProperty("email"));
            clickwhenready(Addbuttononmobileform);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ScreenPrints(webDriver);
        }

    }

    //Select user from list on home page widget
    public void searchnewmobileprofile(String Name) throws IOException {

        try {
           waitForLoadingIconToBeDisappeared();
            wait(5000);
           /* JavascriptExecutor js = (JavascriptExecutor) webDriver;
            WebElement Element = webDriver.findElement(By.xpath("//div[@class='x-grid-cell-inner '][contains(.,'mobile')]"));
            js.executeScript("arguments[0].scrollIntoView();", Element);

            */
            //Thread.sleep(5000);
//Click on Add Mobile profile link
            IsElementExists(Linkofmobileuserscreated);
            Linkofmobileuserscreated.click();

            /*System.out.println("Newly added Mobile Profile link is displayed");
            List<WebElement> Listofmobileusers = webDriver.findElements(By.xpath("//div[@class='x-grid-cell-inner '][contains(.,'mobile')]"));
            for (WebElement mobileuser : Listofmobileusers) {
                System.out.println("User found in list"+mobileuser);
                System.out.println("");

                if (mobileuser.getText().equalsIgnoreCase(ConfigReader.getProperty("mobileuser"))) {
                    wait(2000);
                    //System.out.println("User found in list"+mouser);
                    mobileuser.click();
                    break;
                } else {
                    System.out.println("Mobile user not found");
                    ScreenPrints(webDriver);
                    }
            }*/
            wait(5000);
            IsElementExists(Labelonmobileprofileform);
            clickwhenready(Copylinkbtn);
            System.out.println("Mobile link is copied successfully");
            String mobilelink = Copylinkbtn.getText();

            //To check mobile screen login
            webDriver.navigate().to(mobilelink);
            System.out.println("Mobile user link is opened");
            IsElementExists(Logoforpinscreen);
            clickwhenready(Buttonpin1);
            clickwhenready(Buttonpin2);
            clickwhenready(Buttonpin3);
            clickwhenready(Buttonpin4);
            clickwhenready(Buttonpinok);
            waitForLoadingIconToBeDisappeared();
            waitForLoadingIconToBeDisappeared();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ScreenPrints(webDriver);
        }

    }

}




