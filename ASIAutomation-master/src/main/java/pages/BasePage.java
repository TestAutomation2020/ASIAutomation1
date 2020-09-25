package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class BasePage {
    @FindBy(xpath = "//span[text()='Knowledgebase']")
    private WebElement lnkKnowledgebase;

    @FindBy(xpath = "//span[text()='Administration']")
    private WebElement lnkAdministration;

    @FindBy(xpath = "//span[text()='Knowledgebase Admin']")
    private WebElement lnkKnowledgebaseAdmin;

    @FindBy(xpath = "//div[text()='Loading...']")
    private WebElement loading;

    protected WebDriver webDriver;
    protected WebDriverWait wait;
    private String currentTab;

    public BasePage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 10), this);
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 30);
    }

    public void clickAfterVisibilityOfElement(WebElement element) {
        getElement(element).click();
    }


    public void clearAfterVisibilityOfElement(WebElement element) {
        getElement(element).clear();
    }

    public void waitForLoadingIconToBeDisappeared() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 5);
            wait.until(ExpectedConditions.visibilityOf(loading));
        } catch (Exception e) {
            return;
        }
        wait.until(ExpectedConditions.invisibilityOf(loading));
    }


    public void navigateToKbAdmin() {
        clickAfterVisibilityOfElement(lnkKnowledgebase);
        clickAfterVisibilityOfElement(lnkAdministration);
        clickAfterVisibilityOfElement(lnkKnowledgebaseAdmin);
    }

    public void switchAnotherTab() {
        Set<String> handles = webDriver.getWindowHandles();
        for (String actual : handles) {
            if (!actual.equals(currentTab)) { //switching to the opened tab
                webDriver.switchTo().window(actual); //opening the URL saved.
            }
        }
        System.out.println("Switch to another tab successfully");
    }

    public void navigateDefaultTab() {
        webDriver.switchTo().window(currentTab);
        webDriver.switchTo().defaultContent();
        System.out.println("Navigate to main tab Successfully");
    }

    public void openDuplicateTab() {
        currentTab = webDriver.getWindowHandle();
        String currentUrl = webDriver.getCurrentUrl();
        String link = String.format("window.open('%s','_blank');", currentUrl);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript(link);
        System.out.println("Duplicate Tab open successfully");

    }

    private WebElement getElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


}

