package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class BasePage  {
    @FindBy(xpath = "//span[text()='Knowledgebase']")
    private WebElement lnkKnowledgebase;

    @FindBy(xpath = "//span[text()='Administration']")
    private WebElement lnkAdministration;

    @FindBy(xpath = "//span[text()='Knowledgebase Admin']")
    private WebElement lnkKnowledgebaseAdmin;

    @FindBy(xpath = "//span[text()='Analytics']")
    private WebElement lnkAnalytics;

    @FindBy(xpath = "//span[text()='Knowledgebase Analytics']")
    private WebElement lnkKnowledgebaseAnalytics;

    @FindBy(xpath = "//div[text()='Loading...']")
    private WebElement loading;

    protected WebDriver webDriver;
    protected WebDriverWait wait;
    private String currentTab;

    public BasePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 30);
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
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkKnowledgebase);
            clickAfterVisibilityOfElement(lnkAdministration);
            clickAfterVisibilityOfElement(lnkKnowledgebaseAdmin);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void navigateToKbAnalytics() {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkKnowledgebase);
            clickAfterVisibilityOfElement(lnkAnalytics);
            clickAfterVisibilityOfElement(lnkKnowledgebaseAnalytics);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void switchAnotherTab() {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Set<String> handles = webDriver.getWindowHandles();
            for (String actual : handles) {
                if (!actual.equals(currentTab)) { //switching to the opened tab
                    webDriver.switchTo().window(actual); //opening the URL saved.
                }
            }
            Reporter.log("Switch to another tab successfully");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void navigateDefaultTab() {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            webDriver.switchTo().window(currentTab);
            webDriver.switchTo().defaultContent();
            Reporter.log("Navigate to main tab Successfully");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void openDuplicateTab() {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            currentTab = webDriver.getWindowHandle();
            String currentUrl = webDriver.getCurrentUrl();
            String link = String.format("window.open('%s','_blank');", currentUrl);
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript(link);
            Reporter.log("Duplicate Tab open successfully");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }

    }

    public void clickAfterVisibilityOfElement(WebElement element) {
        getElement(element).click();
    }

    public void clearAfterVisibilityOfElement(WebElement element) {
        getElement(element).clear();
    }

    private WebElement getElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void ScreenPrints(WebDriver driver) throws IOException
    {
        Date d = new Date();
        System.out.println(d.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,  new File(System.getProperty("user.dir")+"\\Screenshots\\"+sdf.format(d)+".png"));
    }

    public void clickwhenready(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        if(element!=null) {
            element.click();
        }
        else
        {
            throw new ElementNotVisibleException("Element not found");
        }
    }

}

