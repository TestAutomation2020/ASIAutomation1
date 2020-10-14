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
import util.ConfigReader;

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

    public void UserMenu(WebDriver webDriver) throws InterruptedException {
        PageFactory.initElements(webDriver, this);

        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        txtKnowledgebase.isDisplayed();
        txtKnowledgebase.click();
        txtAdministration.isDisplayed();
        txtAdministration.click();
        txtKnowledgebaseAdmin.isDisplayed();
        txtKnowledgebaseAdmin.click();
        Thread.sleep(5000);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Users']")));
        txtUsers.click();
        Thread.sleep(5000);
        txtUserID.isDisplayed();

    }
}
