package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ConfigReader;

public class Login extends BasePage
{
    @FindBy(how = How.NAME, using = "txtUserId")
    private static WebElement txtUserName;

    @FindBy(how = How.NAME, using = "txtPassword")
    private WebElement txtPassword;

    @FindBy(how = How.NAME, using = "txtOrganization")
    private WebElement txtOrganization;

    @FindBy(how = How.NAME, using = "btnLogin")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase']")
    private WebElement txtKnowledgebase;

    public Login(WebDriver webDriver)  {
        super(webDriver);
    }

    public void Loginpage(WebDriver webDriver) throws InterruptedException {
        PageFactory.initElements(webDriver, this);
        txtUserName.clear();
        txtUserName.sendKeys(ConfigReader.getProperty("userid"));
        txtPassword.clear();
        txtPassword.sendKeys(ConfigReader.getProperty("password"));
        txtOrganization.clear();
        txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
        btnLogin.click();
        Thread.sleep(7000);
        txtKnowledgebase.isDisplayed();
    }
    public void LaunchApplication(WebDriver webDriver){
        webDriver.get(ConfigReader.getProperty("url"));
        WebDriverWait wait = new WebDriverWait(webDriver,220);
    }
    public void LoginBasicuser(WebDriver webDriver,String username, String password, String Organization) throws InterruptedException {
        PageFactory.initElements(webDriver, this);
        txtUserName.clear();
        txtUserName.sendKeys(username);
        txtPassword.clear();
        txtPassword.sendKeys(password);
        txtOrganization.clear();
        txtOrganization.sendKeys(Organization);
        btnLogin.click();
        Thread.sleep(7000);
        txtKnowledgebase.isDisplayed();
    }
}