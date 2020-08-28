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

public class UserMenuNavigation {

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

    public void UserMenu(WebDriver driver) {
        PageFactory.initElements(driver, this);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        txtKnowledgebase.isDisplayed();
        txtKnowledgebase.click();
        txtAdministration.isDisplayed();
        txtAdministration.click();
        txtKnowledgebaseAdmin.isDisplayed();
        txtKnowledgebaseAdmin.click();
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Users']")));
        txtUsers.click();
        txtUserID.isDisplayed();

    }
}
