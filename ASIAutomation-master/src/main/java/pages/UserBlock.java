package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import util.ConfigReader;
import util.ScreenPrints;
import java.io.File;
import java.io.IOException;
import org.testng.Assert;

public class UserBlock extends BasePage{

    @FindBy(how = How.XPATH, using = "//span[text()='User ID']")
    private WebElement txtUserID;

    @FindBy(how = How.NAME, using = "txtUserId")
    private static WebElement txtUserName;

    @FindBy(how = How.NAME, using = "txtPassword")
    private WebElement txtPassword;

    @FindBy(how = How.NAME, using = "txtOrganization")
    private WebElement txtOrganization;

    @FindBy(how = How.NAME, using = "btnLogin")
    private WebElement btnLogin;

    @FindBy(how = How.NAME, using = "userid")
    private WebElement useridfield;

    @FindBy(how = How.XPATH, using = "(//div[@class='x-grid-cell-inner '])[1]")
    private WebElement testuser1;

    @FindBy(how = How.XPATH, using = "(//div[@class='x-grid-cell-inner x-grid-checkcolumn-cell-inner'])[1]")
    private WebElement UserRptChkBox1;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnEl'][contains(.,'Ok')]")
    private WebElement BtnOK;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Block')]")
    private WebElement BtnBlock;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnEl'][contains(.,'Submit')]")
    private WebElement BtnSubmit;

    @FindBy(how = How.XPATH, using = "//li[text()='Unblock Users']")
    private WebElement Select_UnblockUsers;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'hcm-dropdown')]")
    private WebElement Select_Dropdown;

    @FindBy(how = How.XPATH, using = "//span[@id='PageHeaderLogout-btnEl']")
    private WebElement Logoutlink;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Sign Out')]")
    private WebElement Signout;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Forgot Your Password?')]")
    private WebElement Forgotpswdlink;

    @FindBy(how = How.XPATH, using = "(//span[contains(.,'User ID')])[2]")
    private WebElement UserIDtxt;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Apply')]")
    private WebElement ApplyBtn;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Account is blocked')]")
    private WebElement AccountBlockMsg;

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase']")
    private WebElement txtKnowledgebase;

    public UserBlock(WebDriver webDriver) {   super(webDriver);  }

    public boolean Userblock() throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Reporter.log("---------- Block/Unblock User Script ----------");
            clearAfterVisibilityOfElement(useridfield);
            useridfield.sendKeys(ConfigReader.getProperty("userblock1"));
            clickwhenready(ApplyBtn);
            Reporter.log("Apply button clicked");
            Thread.sleep(4000);
            clickwhenready(UserRptChkBox1);
            UserRptChkBox1.isSelected();
            clickwhenready(BtnBlock);
            Reporter.log("Block menu selected");
            Thread.sleep(2000);
            clickwhenready(BtnSubmit);
            Reporter.log("Submit button clicked");
            Thread.sleep(2000);
            clickwhenready(Logoutlink);
            Reporter.log("Logout link clicked");
            clickwhenready(Signout);
            Reporter.log("Signout link clicked");
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("testblockuser1"));
            clearAfterVisibilityOfElement(txtPassword);
            txtPassword.sendKeys(ConfigReader.getProperty("testblockuserpassword"));
            clearAfterVisibilityOfElement(txtOrganization);
            txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login button clicked");
            Thread.sleep(7000);
            if(AccountBlockMsg.isDisplayed()) {
                Reporter.log("Account block message is displayed");
                System.out.println(AccountBlockMsg);
                clearAfterVisibilityOfElement(txtUserName);
                txtUserName.sendKeys(ConfigReader.getProperty("userid"));
                clearAfterVisibilityOfElement(txtPassword);
                txtPassword.sendKeys(ConfigReader.getProperty("password"));
                clearAfterVisibilityOfElement(txtOrganization);
                txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
                clickwhenready(btnLogin);
                Reporter.log("Login button clicked");
            }
            Thread.sleep(10000);
            UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
            usermenu.UserMenu(webDriver);
            clearAfterVisibilityOfElement(useridfield);
            useridfield.sendKeys(ConfigReader.getProperty("userblock1"));
            clickwhenready(ApplyBtn);
            Reporter.log("Apply button clicked");
            Thread.sleep(4000);
            clickwhenready(UserRptChkBox1);
            UserRptChkBox1.isSelected();
            clickwhenready(BtnBlock);
            Thread.sleep(5000);
            clickwhenready(Select_Dropdown);
            Select_UnblockUsers.isSelected();
            clickwhenready(Select_UnblockUsers);
            clickwhenready(BtnSubmit);
            Reporter.log("Submit button clicked");
            Thread.sleep(5000);
            clickwhenready(Logoutlink);
            Reporter.log("Logout link clicked");
            clickwhenready(Signout);
            Reporter.log("Signout link clicked");

            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("testblockuser1"));
            clearAfterVisibilityOfElement(txtPassword);
            txtPassword.sendKeys(ConfigReader.getProperty("testblockuserpassword"));
            clearAfterVisibilityOfElement(txtOrganization);
            txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login button clicked");
            Thread.sleep(10000);
            if(txtKnowledgebase.isDisplayed()) {
                clickwhenready(Logoutlink);
                Reporter.log("Logout link clicked");
                clickwhenready(Signout);
                Reporter.log("Signout link clicked");
                Reporter.log("---------- End of Block/Unblock User Script ----------");
            }
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