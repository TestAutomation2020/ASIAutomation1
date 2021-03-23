package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;
import util.ConfigReader;
import java.io.IOException;
import java.util.ArrayList;

public class SignOnLinkWInvalidLink extends BasePage
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

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Sign On Link')]")
    private WebElement SignOnlink;

    @FindBy(how = How.XPATH, using = "(//span[contains(.,'Save')])[6]")
    private WebElement SaveBtn;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'relativeurl')]")
    private WebElement relativeURL;

    @FindBy(how = How.XPATH, using = "//div[text()='The Sign-On Link has been created successfully.']")
    private WebElement SignOnLinkAddedSuccessfully;

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

    @FindBy(how = How.XPATH, using = "//div[contains(.,'The page is not available')]")
    private WebElement txtErrorMsg;

    public SignOnLinkWInvalidLink(WebDriver webDriver) {
        super(webDriver);
    }

    public void USignOnLinkWInvalidLink() throws InterruptedException, IOException
    {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {

            Reporter.log("---------- Sign On Link Script ----------");
            clickwhenready(ClearBtn);
            Reporter.log("Clear button clicked");
            Thread.sleep(3000);
            clearAfterVisibilityOfElement(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridSignOn"));
            clickwhenready(ApplyBtn);
            Thread.sleep(5000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(UserPropertiesmenu);
            clickwhenready(SignOnlink);
            Thread.sleep(4000);
            clearAfterVisibilityOfElement(relativeURL);
            relativeURL.sendKeys(ConfigReader.getProperty("relativeURL"));
            clickwhenready(SaveBtn);
            Thread.sleep(3000);

            if (SignOnLinkAddedSuccessfully.isDisplayed()) {
                Thread.sleep(4000);
                clickwhenready(Link);
                Thread.sleep(6000);
                String abc = Link.getAttribute("value");
                System.out.println(abc);
                String xyz = abc+"testlink";
                ((JavascriptExecutor)webDriver).executeScript("window.open()");
                ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
                webDriver.switchTo().window(tabs2.get(1));
                webDriver.get(xyz);
                Thread.sleep(3000);
                //clearAfterVisibilityOfElement(txtPassword);
                //txtPassword.sendKeys(ConfigReader.getProperty("password"));
                //clickwhenready(btnLogin);
                Thread.sleep(8000);
                String strUrl = webDriver.getCurrentUrl();
                System.out.println(strUrl);

                if(strUrl.contains("Error")) {
                    System.out.println("Error page is displayed.");
                    ScreenPrints(webDriver);
                   // webDriver.switchTo().window(tabs2.get(0));
                    webDriver.close();
                    Thread.sleep(3000);
                    webDriver.switchTo().window(tabs2.get(0));
                    clickwhenready(Logoutlink);
                    clickwhenready(Signout);
                }

                Thread.sleep(7000);
                Login login = new Login(webDriver);
                login.LaunchApplication(webDriver);
                login.Loginpage(webDriver);
                UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
                usermenu.UserMenu(webDriver);
                Thread.sleep(5000);
            }

        } catch (Exception e) {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

}