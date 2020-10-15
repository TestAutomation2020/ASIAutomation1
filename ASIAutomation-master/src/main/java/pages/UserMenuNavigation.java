package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import util.ConfigReader;

import java.io.IOException;

public class UserMenuNavigation extends BasePage {

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase']")
    private WebElement txtKnowledgebase;

    @FindBy(how = How.XPATH, using = "//span[text()='Administration']")
    private WebElement txtAdministration;

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase Admin']")
    private WebElement txtKnowledgebaseAdmin;

    @FindBy(how = How.XPATH, using = "//span[text()='Users']")
    private WebElement txtUsers;

    @FindBy(how = How.XPATH, using = "//span[text()='User ID']")
    private WebElement txtUserID;

    public UserMenuNavigation(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean UserMenu(WebDriver webDriver) throws InterruptedException, IOException {
         String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Reporter.log("---------- User menu navigation script ----------");
            Thread.sleep(5000);
            clickwhenready(txtKnowledgebase);
            Reporter.log("Knowledgebase menu link clicked");
            clickwhenready(txtAdministration);
            Reporter.log("Administration menu clicked");
            clickwhenready(txtKnowledgebaseAdmin);
            Reporter.log("Knowledgebase Admin menu clicked");
            Thread.sleep(5000);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Users']")));
            txtUsers.click();
            Reporter.log("User menu clicked");
            Thread.sleep(5000);
            txtUserID.isDisplayed();
            Reporter.log("UserID text is displayed");
            Reporter.log("---------- End of User menu navigation script ----------");
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