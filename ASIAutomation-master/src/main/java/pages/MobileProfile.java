package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import util.ConfigReader;
import util.Constants;
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
    @FindBy(how = How.XPATH, using = "//input[@name='name']")
    //input[@name='name']
    //*[@data-ref='inputEl' and @name='name']
    private WebElement NameTxtboxonaddmobileform;
    @FindBy(how = How.XPATH, using = "//*[@data-ref='inputEl' and @name='pin']")
    private WebElement PinTxtboxonaddmobileform;
    @FindBy(how = How.XPATH, using = "//*[@data-ref='inputEl' and @name='emailaddress']")
    private WebElement EmailTxtboxonaddmobileform;
    @FindBy(how = How.XPATH, using = "//*[@data-ref='btnInnerEl' and text()='Add']")
    private WebElement Addbuttononmobileform;
    @FindBy(how = How.XPATH, using = "//*[@data-ref='labelTextEl' and contains(text(),' You will need to provide the user with the pin number in order to log in.')]")
    private WebElement NoteonMobileForm;

    //Click on mobile user created
    @FindBy(how = How.XPATH, using = "//div[@class='x-grid-cell-inner ']/a")
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
            waitForLoadingIconToBeDisappeared();
            waitForLoadingIconToBeDisappeared();
            clickwhenready(AddMobileProfilelink);
            IsElementExists(AddMobileProfileText);
            System.out.println("Add mobile form is open as expected");
            wait(2000);
             //NameTxtboxonaddmobileform.clear();
           /* EnterText(NameTxtboxonaddmobileform, Constants.MobileUser);
            EnterText(PinTxtboxonaddmobileform, String.valueOf(Constants.mobilepin));
            EnterText(EmailTxtboxonaddmobileform, Constants.mobileEmail);
            clickwhenready(Addbuttononmobileform);*/

            /*EnterText(NameTxtboxonaddmobileform, ConfigReader.getProperty("Mobileuser"));
            EnterText(PinTxtboxonaddmobileform, ConfigReader.getProperty("pin"));
            EnterText(EmailTxtboxonaddmobileform, ConfigReader.getProperty("email"));
            clickwhenready(Addbuttononmobileform);*/
            String tedt= NameTxtboxonaddmobileform.getText();
            System.out.println("Name is displayed:"+tedt);

            NameTxtboxonaddmobileform.sendKeys("samne");

            /*NameTxtboxonaddmobileform.sendKeys(Constants.MobileUser);
            PinTxtboxonaddmobileform.sendKeys("1234");
            EmailTxtboxonaddmobileform.sendKeys(Constants.mobileEmail);*/


            System.out.println("Mobile Profile created successfully");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ScreenPrints(webDriver);
        }

    }

    //Select user from list on home page widget
    public void searchnewmobileprofile(String Name) throws IOException {

        try {
            waitForLoadingIconToBeDisappeared();
            IsElementExists(Linkofmobileuserscreated);
            List<WebElement> Listofmobileusers = webDriver.findElements(By.xpath("//div[@class='x-grid-cell-inner ']/a"));
            for (WebElement mobileuser : Listofmobileusers) {
                String mouser = mobileuser.getText();
                if (mobileuser.getText().equalsIgnoreCase(ConfigReader.getProperty("userid"))) {
                    mobileuser.click();
                    break;
                } else {
                    System.out.println("Mobile user not found");
                    ScreenPrints(webDriver);
                }
            }
            waitForLoadingIconToBeDisappeared();
            IsElementExists(Labelonmobileprofileform);
            clickwhenready(Copylinkbtn);
            String mobilelink = Copylinkbtn.getText();

            //To check mobile screen login
            openDuplicateTab();
            switchAnotherTab();
            webDriver.navigate().to(mobilelink);
            IsElementExists(Logoforpinscreen);
            clickwhenready(Buttonpin1);
            clickwhenready(Buttonpin2);
            clickwhenready(Buttonpin3);
            clickwhenready(Buttonpin4);
            clickwhenready(Buttonpinok);
            waitForLoadingIconToBeDisappeared();
            waitForLoadingIconToBeDisappeared();
            System.out.println("Mobile login successful");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ScreenPrints(webDriver);
        }

    }
}




