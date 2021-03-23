package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ConfigReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;

public class SignOnLinkwithBlockUser extends BasePage {

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

    @FindBy(how = How.XPATH, using = "(//div[@class='x-grid-cell-inner '])[1]")
    private WebElement Userlink;

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

    public SignOnLinkwithBlockUser(WebDriver webDriver) {
        super(webDriver);
    }

    public void SignOnUserblock() throws InterruptedException, IOException {

        try {
            clearAfterVisibilityOfElement(useridfield);
            useridfield.sendKeys(ConfigReader.getProperty("testblocksignon"));
            clickwhenready(ApplyBtn);
            Thread.sleep(4000);
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
                //String xyz = abc+"testlink";
                ((JavascriptExecutor) webDriver).executeScript("window.open()");
                ArrayList<String> tabs2 = new ArrayList<String>(webDriver.getWindowHandles());
                webDriver.switchTo().window(tabs2.get(1));
                webDriver.get(abc);
                Thread.sleep(8000);
                String strUrl = webDriver.getCurrentUrl();
                System.out.println(strUrl);
                clearAfterVisibilityOfElement(txtPassword);
                txtPassword.sendKeys(ConfigReader.getProperty("testblocksignonpwd"));
                clickwhenready(btnLogin);
                Thread.sleep(3000);
                if(AccountBlockMsg.isDisplayed()) {
                    System.out.println("User is blocked.");
                    ScreenPrints(webDriver);
                    // webDriver.switchTo().window(tabs2.get(0));
                    webDriver.close();
                    Thread.sleep(3000);
                    webDriver.switchTo().window(tabs2.get(0));
                    clickwhenready(Logoutlink);
                    clickwhenready(Signout);
                }
                ScreenPrints(webDriver);
            }
        }
        catch (Exception e)
        {
            ScreenPrints(webDriver);
            e.printStackTrace();
            throw e;
        }
    }
}