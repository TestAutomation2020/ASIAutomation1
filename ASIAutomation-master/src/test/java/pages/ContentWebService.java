package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;
import util.ConfigReader;

import java.io.IOException;

public class ContentWebService extends BasePage
{
    @FindBy(how = How.ID, using="txtTPPageTPUserIdVL")
    private WebElement UserID;

    @FindBy(how = How.ID, using = "txtTPPagePasswordVL")
    public WebElement Password;

    @FindBy(how = How.ID, using = "txtTPPageOrgNameVL")
    public WebElement OrgName;

    @FindBy(how = How.ID, using = "txtTPPageCode")
    public WebElement Code;

    @FindBy(how = How.ID, using = "txtTPPageParams")
    public WebElement OtherParams;

    @FindBy(how = How.ID, using = "btnTPPageVL")
    public WebElement SubmitBtn;

    @FindBy(how = How.XPATH, using = "//Data[@total]")
    public WebElement TotalUserCount;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Results')]")
    public WebElement UserCount;

    @FindBy(how = How.XPATH, using = "//span[@id='PageHeaderLogout-btnEl']")
    private WebElement Logout;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Sign Out')]")
    private WebElement SignOut;


    public ContentWebService(WebDriver webDriver) {
        super(webDriver);
    }

    public void ContentService() throws InterruptedException, IOException
    {   String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try
        {
            Reporter.log("---------- Content WebService Script ----------");
            Login login = new Login(webDriver);
            login.LaunchApplication(webDriver);
            login.Loginpage(webDriver);
            UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
            ContentWebServiceUATURL(webDriver);
            Reporter.log("Navigate to Content WebService URL ----------");
            Thread.sleep(3000);
            clearAfterVisibilityOfElement(UserID);
            UserID.sendKeys(ConfigReader.getProperty("userid"));
            clearAfterVisibilityOfElement(Password);
            Password.sendKeys(ConfigReader.getProperty("password"));
            clearAfterVisibilityOfElement(OrgName);
            OrgName.sendKeys(ConfigReader.getProperty("organization"));
            clearAfterVisibilityOfElement(Code);
            Code.sendKeys(ConfigReader.getProperty("code"));
            clearAfterVisibilityOfElement(OtherParams);
            OtherParams.sendKeys(ConfigReader.getProperty("OtherParams"));
            Reporter.log("Entered all the details in the Content WebService form");
            clickwhenready(SubmitBtn);
            Reporter.log("Clicked on Submit button and verified the XML page displayed");
            Thread.sleep(5000);
            String contentusercount = TotalUserCount.getAttribute("total");
            System.out.println(contentusercount);
            Thread.sleep(5000);
            login.LaunchApplication(webDriver);
            login.Loginpage(webDriver);
            usermenu.UserMenu(webDriver);
            Reporter.log("Login to the KB application with Admin user");
            Thread.sleep(3000);
            String portaluser = UserCount.getText();
            System.out.println(portaluser);
            Thread.sleep(5000);
            String portalusercount = extractInt(portaluser);
            System.out.println(portalusercount);
            Reporter.log("Comparing the XML and Application, total no of Users count");
            if (contentusercount.equals(portalusercount))
            {
                System.out.println("Content Web Service is working as expected.");
            }
            else {
                System.out.println("Content Web Service is NOT working as expected.");
            }

            Logout.click();
            SignOut.click();
            Reporter.log("Logout from the KB application");
            Reporter.log("---------- End of the Content WebService Script ----------");

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