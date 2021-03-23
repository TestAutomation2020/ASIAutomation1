package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;
import util.ConfigReader;
import java.io.IOException;
import java.util.ArrayList;

public class ChangePwdAtLogin extends BasePage
{
    @FindBy(how = How.XPATH, using = "//span[text()='Add New']")
    private WebElement AddNew;

    @FindBy(how = How.NAME, using = "txtOrganization")
    private WebElement txtOrganization;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Clear')]")
    private WebElement ClearBtn;

    @FindBy(how = How.XPATH, using = "//input[@name='userid']")
    private WebElement txtUserid;

    @FindBy(how = How.XPATH, using = "(//div[@class='x-grid-cell-inner '])[1]")
    private WebElement Userlink;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Apply')]")
    private WebElement ApplyBtn;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'User Properties')]")
    private WebElement UserPropertiesmenu;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Password')]")
    private WebElement PasswordMenu;

    @FindBy(how = How.XPATH, using = "(//span[contains(.,'Save')])[6]")
    private WebElement SaveBtn;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'relativeurl')]")
    private WebElement relativeURL;

    @FindBy(how = How.XPATH, using = "//div[text()='Password has been updated successfully and email has been sent to the user ']")
    private WebElement PasswordUpdatedSuccessfully;

    @FindBy(how = How.XPATH, using = "//textarea[contains(@name,'createdlink')]")
    private WebElement Link;

    @FindBy(how = How.NAME, using = "txtPassword")
    private WebElement txtPassword;

    @FindBy(how = How.NAME, using = "btnLogin")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//span[@id='PageHeaderLogout-btnEl']")
    private WebElement Logoutlink;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Sign Out')]")
    private WebElement Signout;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Forgot Your Password?')]")
    private WebElement Forgotpswdlink;

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase']")
    private WebElement txtKnowledgebase;

    @FindBy(how = How.XPATH, using = "(//label[contains(@class,'x-form-cb-label x-form-cb-label-default x-form-cb-label-after  ')])[4]")
    private WebElement PasswordSwitch;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'newpassword')]")
    private WebElement newPassword;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'confirmpswd')]")
    private WebElement confirmPassword;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Update Password')]")
    private WebElement UpdatePassword;

    @FindBy(how = How.NAME, using = "txtUserId")
    private WebElement txtUserName;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'txtNewPassword')]")
    private WebElement txtNewPwd;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'txtRetypeNewPassword')]")
    private WebElement txtRetypeNewPwd;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'btnChangePassword')]")
    private WebElement btnChangePwd;


    public ChangePwdAtLogin(WebDriver webDriver) throws IOException {
        super(webDriver);}

    public void UChangePwdAtLogin() throws InterruptedException, IOException
    {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Reporter.log("---------- Script ----------");
            clickwhenready(ClearBtn);
            Reporter.log("Clear button clicked");
            Thread.sleep(3000);
            clearAfterVisibilityOfElement(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridChangePwd"));
            clickwhenready(ApplyBtn);
            Thread.sleep(5000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(UserPropertiesmenu);
            clickwhenready(PasswordMenu);
            Thread.sleep(8000);
            newPassword.sendKeys(ConfigReader.getProperty("newpassword"));
            confirmPassword.sendKeys(ConfigReader.getProperty("confirmnewpassword"));
            clickwhenready(PasswordSwitch);
            Thread.sleep(2000);
            clickwhenready(UpdatePassword);
            Thread.sleep(8000);

          //  if (PasswordUpdatedSuccessfully.isDisplayed()) {
                Thread.sleep(3000);
                System.out.println("Test abc");
                clickwhenready(Logoutlink);
                clickwhenready(Signout);
                Thread.sleep(7000);
                clearAfterVisibilityOfElement(txtUserName);
                txtUserName.sendKeys(ConfigReader.getProperty("useridChangePwd"));
                clearAfterVisibilityOfElement(txtPassword);
                txtPassword.sendKeys(ConfigReader.getProperty("newpassword"));
                clearAfterVisibilityOfElement(txtOrganization);
                txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
                btnLogin.click();
                Thread.sleep(8000);
                txtNewPwd.sendKeys(ConfigReader.getProperty("newpwd"));
                txtRetypeNewPwd.sendKeys(ConfigReader.getProperty("retyprnewpwd"));
                clickwhenready(btnChangePwd);
                clickwhenready(btnLogin);
                Thread.sleep(15000);

                if(txtKnowledgebase.isDisplayed()) {
                    clickwhenready(Logoutlink);
                    clickwhenready(Signout);
                }
                ScreenPrints(webDriver);
                Thread.sleep(3000);
            Thread.sleep(7000);
            Login login = new Login(webDriver);
            login.LaunchApplication(webDriver);
            login.Loginpage(webDriver);
            UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
            usermenu.UserMenu(webDriver);


        } catch (Exception e) {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

}
