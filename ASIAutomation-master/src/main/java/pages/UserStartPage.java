package pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import util.ConfigReader;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class UserStartPage extends BasePage  {

    @FindBy(how = How.XPATH, using = "//span[text()='Add New']")
    private WebElement AddNew;

    @FindBy(how = How.XPATH, using = "//input[@name='userid']")
    private WebElement txtUserid;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Apply')]")
    private WebElement ApplyBtn;

    @FindBy(how = How.XPATH, using = "//input[@name='accountid']")
    private WebElement txtaccountid;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    private WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//input[@name='confirmpassword']")
    private WebElement txtConfirmPassword;

    @FindBy(how = How.NAME, using = "txtPassword")
    private WebElement txtLoginPassword;

    @FindBy(how = How.NAME, using = "txtOrganization")
    private WebElement txtLoginOrganization;

    @FindBy(how = How.XPATH, using = "//input[@name='prefix']")
    private WebElement txtPrefix;

    @FindBy(how = How.XPATH, using = "(//input[@name='firstname'])[2]")
    private WebElement txtFirstname;

    @FindBy(how = How.XPATH, using = "//input[@name='middlename']")
    private WebElement txtMiddlename;

    @FindBy(how = How.XPATH, using = "(//input[@name='lastname'])[2]")
    private WebElement txtLastname;

    @FindBy(how = How.XPATH, using = "//input[@name='suffix']")
    private WebElement txtSuffix;

    @FindBy(how = How.XPATH, using = "//input[@name='emailaddress']")
    private WebElement txtEmailaddress;

    @FindBy(how = How.XPATH, using = "//input[@name='levelnumber']")
    private WebElement txtLevelnumber;

    @FindBy(how = How.XPATH, using = "//li[text()='8-Portal Admin']")
    private WebElement txtLevelnumber_select_8;

    @FindBy(how = How.XPATH, using = "//input[@name='startpageid']")
    private WebElement Click_Startpage;

    @FindBy(how = How.XPATH, using = "//li[text()='Onboarding']")
    private WebElement Select_Startpage_Onboarding;

    @FindBy(how = How.XPATH, using = "//li[text()='Offboarding']")
    private WebElement Select_Startpage_Offboarding;

    @FindBy(how = How.XPATH, using = "//li[text()='Home']")
    private WebElement Select_Startpage_Home;

    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Save']/ancestor::a")
    private WebElement Usersave;

    @FindBy(how = How.XPATH, using = "//div[text()='Added Successfully']")
    private WebElement AddedSuccessfully;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Clear')]")
    private WebElement ClearBtn;

    @FindBy(how = How.XPATH, using = "(//div[@class='x-grid-cell-inner '])[1]")
    private WebElement Userlink;

    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Update']/ancestor::a")
    private WebElement Userupdate;

    @FindBy(how = How.XPATH, using = "//div[text()='Updated Successfully']")
    private WebElement UpdatedSuccessfully;

    @FindBy(how = How.XPATH, using = "//span[@id='PageHeaderLogout-btnEl']")
    private WebElement Logout;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Sign Out')]")
    private WebElement SignOut;

    @FindBy(how = How.NAME, using = "txtUserId")
    private WebElement txtUserName;

    @FindBy(how = How.NAME, using = "txtOrganization")
    private WebElement txtOrganization;

    @FindBy(how = How.NAME, using = "btnLogin")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Onboarding Start Page')]")
    private WebElement txtOnboarding;

    @FindBy(how = How.XPATH, using = "//iframe[@class='x-component x-fit-item x-component-default']")
    private WebElement Onboardingiframe;

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase']")
    private WebElement txtKnowledgebase;

    @FindBy(how = How.XPATH, using = "//a[@href='#'][contains(.,'imran admin')]")
    private WebElement mobilelink;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnEl'][contains(.,'Copy to Clipboard')]")
    private WebElement clipboardlink;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Edit Mobile Profile')]")
    private WebElement EditMobileProfile;

    public UserStartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean UStartPage() throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Reporter.log("---------- User Startpage Script ----------");
            Login login = new Login(webDriver);
            clearAfterVisibilityOfElement(txtOrganization);
            login.Loginpage(webDriver);
            UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
            usermenu.UserMenu(webDriver);
            clickwhenready(ClearBtn);
            Reporter.log("Clear button clicked");
            Thread.sleep(3000);
            clickwhenready(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridstartpage"));
            clickwhenready(ApplyBtn);
            Thread.sleep(4000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(Click_Startpage);
            clickwhenready(Select_Startpage_Onboarding);
            Reporter.log("Startpage Onboarding selected");
            Thread.sleep(3000);
            clickwhenready(Userupdate);
            Reporter.log("Update button clicked");
            Thread.sleep(5000);            
            UpdatedSuccessfully.isDisplayed();
            Reporter.log("Update successful message is displayed");
            Thread.sleep(5000);
            clickwhenready(Logout);
            clickwhenready(SignOut);
            Reporter.log("Signout done successful");
            Thread.sleep(7000);
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("useridstartpage"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("usersppassword"));
            clearAfterVisibilityOfElement(txtLoginOrganization);
            txtLoginOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login button clicked");
            Thread.sleep(15000);
            webDriver.switchTo().frame(Onboardingiframe);
            String abc = txtOnboarding.getText();
            System.out.println(abc);
            if(txtOnboarding.isDisplayed())
            {
                webDriver.switchTo().defaultContent();
                clickwhenready(Logout);
                Reporter.log("Logout link clicked");
                clickwhenready(SignOut);
                Reporter.log("Signout link clicked");
            }
            Thread.sleep(5000);
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("userid"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("password"));
            clearAfterVisibilityOfElement(txtOrganization);
            txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login button clicked");
            Thread.sleep(10000);
            usermenu.UserMenu(webDriver);
            txtUserid.isDisplayed();
            clickwhenready(ClearBtn);
            Thread.sleep(3000);
            clearAfterVisibilityOfElement(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridstartpage"));
            clickwhenready(ApplyBtn);
            Thread.sleep(5000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(Click_Startpage);
            clickwhenready(Select_Startpage_Home);
            Thread.sleep(3000);
            clickwhenready(Userupdate);
            Thread.sleep(5000);
            UpdatedSuccessfully.isDisplayed();
            Thread.sleep(5000);
            clickwhenready(Logout);
            Reporter.log("Logout link clicked");
            clickwhenready(SignOut);
            Reporter.log("Signout link clicked");
            Thread.sleep(7000);
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("useridstartpage"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("usersppassword"));
            clearAfterVisibilityOfElement(txtLoginOrganization);
            txtLoginOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login button clicked");
            Thread.sleep(10000);
            if(txtKnowledgebase.isDisplayed())
            {
                clickwhenready(Logout);
                Reporter.log("Logout link clicked");
                clickwhenready(SignOut);
                Reporter.log("Signout link clicked");
                Reporter.log("---------- End of User Startpage Script ----------");
            }
            Thread.sleep(5000);
            ScreenPrints(webDriver);
            return false;
        }
        catch (Exception e)
        {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            return false;
        }
    }
}