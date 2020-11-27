package pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
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

import java.io.IOException;

public class UserLocale extends BasePage {

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
    private static WebElement txtUserName;

    @FindBy(how = How.NAME, using = "txtOrganization")
    private WebElement txtOrganization;

    @FindBy(how = How.NAME, using = "btnLogin")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Onboarding Start Page')]")
    private String txtOnboarding;

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase']")
    private WebElement txtKnowledgebase;

    @FindBy(how = How.XPATH, using = "//input[@name='locale']")
    private WebElement Click_Locale;

    @FindBy(how = How.XPATH, using = "//li[text()='en-US']")
    private WebElement Select_EnUS;

    @FindBy(how = How.XPATH, using = "//li[text()='hr-HR']")
    private WebElement Select_hrHR;

    @FindBy(how = How.XPATH, using = "//li[text()='bg-BG']")
    private WebElement Select_bgBG;

    @FindBy(how = How.XPATH, using = "//span[text()='Administration']")
    private WebElement txtAdministration;

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase Admin']")
    private WebElement txtKnowledgebaseAdmin;

    @FindBy(how = How.XPATH, using = "//span[text()='Localization']")
    private WebElement txtLocalization;

    @FindBy(how = How.XPATH, using = "//span[text()='Locales']")
    private WebElement txtLocales;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Ispiši')]")
    private WebElement txtPrintLabel;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Odjava')]")
    private WebElement txt_hrHR_Signout;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Изход')]")
    private WebElement txt_bgBG_Signout;

    @FindBy(how = How.XPATH, using = "(//span[contains(@class,'x-grid-checkcolumn x-grid-checkcolumn-checked')])[1]")
    private WebElement checkedbox_localebgBG;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[1]")
    private WebElement uncheckedbox_localebgBG;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Update')]")
    private WebElement BtnUpdate_locale;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Печат')]")
    private WebElement BtnPrint_bgBG_locale;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Print')]")
    private WebElement BtnPrint_enUS_locale;




    public UserLocale(WebDriver webDriver) {
        super(webDriver);
    }

    public void localeuser() throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
    try {
        Reporter.log("---------- Locale User Script ----------");
        Login login = new Login(webDriver);
        login.LaunchApplication(webDriver);
        login.Loginpage(webDriver);
        UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
        usermenu.UserMenu(webDriver);
        Reporter.log("Application login successful by Admin user");
        clickwhenready(ClearBtn);
        Thread.sleep(3000);
        txtUserid.sendKeys(ConfigReader.getProperty("userlocale"));
        clickwhenready(ApplyBtn);
        Thread.sleep(5000);
        clickwhenready(Userlink);
        Thread.sleep(5000);
        clickwhenready(Click_Locale);
        clickwhenready(Select_bgBG);
        Reporter.log("User locale set to bgBG");
        Thread.sleep(3000);
        clickwhenready(Userupdate);
        Thread.sleep(5000);
        if (UpdatedSuccessfully.isDisplayed()) {
            Thread.sleep(5000);
            clickwhenready(Logout);
            clickwhenready(SignOut);
        }
        Thread.sleep(7000);
        clearAfterVisibilityOfElement(txtUserName);
        txtUserName.sendKeys(ConfigReader.getProperty("userlocale"));
        clearAfterVisibilityOfElement(txtLoginPassword);
        txtLoginPassword.sendKeys(ConfigReader.getProperty("userlocalepswd"));
        clearAfterVisibilityOfElement(txtLoginOrganization);
        txtLoginOrganization.sendKeys(ConfigReader.getProperty("organization"));
        clickwhenready(btnLogin);
        Reporter.log("Login with bgBG locale user and verify the changes as per locale");
        Thread.sleep(8000);
        if (BtnPrint_bgBG_locale.isDisplayed())
        {
            clickwhenready(Logout);
            clickwhenready(txt_bgBG_Signout);
            Thread.sleep(8000);
        }
        clearAfterVisibilityOfElement(txtUserName);
        txtUserName.sendKeys(ConfigReader.getProperty("userid"));
        clearAfterVisibilityOfElement(txtLoginPassword);
        txtLoginPassword.sendKeys(ConfigReader.getProperty("password"));
        clearAfterVisibilityOfElement(txtOrganization);
        txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
        clickwhenready(btnLogin);
        Reporter.log("Login with Admin user");
        Thread.sleep(10000);

        clickwhenready(txtKnowledgebase);
        clickwhenready(txtAdministration);
        clickwhenready(txtKnowledgebaseAdmin);
        Thread.sleep(5000);
        clickwhenready(txtLocalization);
        clickwhenready(txtLocales);
        Thread.sleep(5000);
        clickwhenready(checkedbox_localebgBG);
        clickwhenready(BtnUpdate_locale);
        Reporter.log("Remove bgBG as the active locale for the application");
        if (UpdatedSuccessfully.isDisplayed())
        {
            Thread.sleep(5000);
            Logout.click();
            SignOut.click();
        }
        Thread.sleep(5000);
        clearAfterVisibilityOfElement(txtUserName);
        txtUserName.sendKeys(ConfigReader.getProperty("userlocale"));
        clearAfterVisibilityOfElement(txtLoginPassword);
        txtLoginPassword.sendKeys(ConfigReader.getProperty("userlocalepswd"));
        clearAfterVisibilityOfElement(txtLoginOrganization);
        txtLoginOrganization.sendKeys(ConfigReader.getProperty("organization"));
        clickwhenready(btnLogin);
        Reporter.log("Login with bgBG locale user and verify the changes displayed as enUS");
        Thread.sleep(10000);
        if(BtnPrint_enUS_locale.isDisplayed())
        {
            Logout.click();
            SignOut.click();
            Thread.sleep(5000);
        }
        clearAfterVisibilityOfElement(txtUserName);
        txtUserName.sendKeys(ConfigReader.getProperty("userid"));
        clearAfterVisibilityOfElement(txtLoginPassword);
        txtLoginPassword.sendKeys(ConfigReader.getProperty("password"));
        clearAfterVisibilityOfElement(txtOrganization);
        txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
        clickwhenready(btnLogin);
        Reporter.log("Login with Admin user");
        Thread.sleep(10000);

        clickwhenready(txtKnowledgebase);
        clickwhenready(txtAdministration);
        clickwhenready(txtKnowledgebaseAdmin);
        Thread.sleep(5000);
        clickwhenready(txtLocalization);
        clickwhenready(txtLocales);
        Thread.sleep(5000);
        clickwhenready(uncheckedbox_localebgBG);
        clickwhenready(BtnUpdate_locale);
        Reporter.log("Add the bgBG as the active locale for the application");
        if (UpdatedSuccessfully.isDisplayed())
        {
            Thread.sleep(5000);
            Logout.click();
            SignOut.click();
            Reporter.log("---------- End of the Locale User Script ----------");
        }
        Thread.sleep(10000);

        ScreenPrints(webDriver);

    }
        catch (Exception e)
        {
        ScreenPrints(webDriver);
        e.printStackTrace();
        Reporter.log(nameOfCurrMethod + "\n" + e.toString());
      throw e;
        }
    }
}