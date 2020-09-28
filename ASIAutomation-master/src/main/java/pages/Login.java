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

public class Login
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


    public void Loginpage(WebDriver driver) throws InterruptedException {
        PageFactory.initElements(driver, this);
        txtUserName.sendKeys(ConfigReader.getProperty("userid"));
        txtPassword.sendKeys(ConfigReader.getProperty("password"));
        txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
        btnLogin.click();
        Thread.sleep(7000);
        txtKnowledgebase.isDisplayed();
    }
    public void LaunchApplication(WebDriver driver){
        driver.get(ConfigReader.getProperty("url"));
        WebDriverWait wait = new WebDriverWait(driver,220);
    }
}