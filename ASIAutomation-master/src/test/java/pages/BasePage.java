package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import util.ConfigReader;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class BasePage {
    @FindBy(xpath = "//span[text()='Knowledgebase']")
    private WebElement lnkKnowledgebase;

    @FindBy(xpath = "//span[text()='Administration']")
    private WebElement lnkAdministration;

    @FindBy(xpath = "//span[contains(text(),'Knowledgebase Admin')]")
    private WebElement lnkKnowledgebaseAdmin;

    @FindBy(xpath = "//span[text()='Analytics']")
    private WebElement lnkAnalytics;

    @FindBy(xpath = "//span[text()='Knowledgebase Analytics']")
    private WebElement lnkKnowledgebaseAnalytics;

    @FindBy(xpath = "//div[text()='Loading...']")
    private WebElement loading;

    @FindBy(xpath = "//span[@id='PageHeaderLogout-btnInnerEl']")
    private WebElement btnUserName;

    @FindBy(xpath = "//a[@class='x-menu-item-link cls-has-icon']")
    private WebElement btnSignOut;

    protected WebDriver webDriver;
    protected WebDriverWait wait;
    private String currentTab;

    public BasePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 40);
    }

    public void pageReload() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            webDriver.navigate().refresh();
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
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

    public void navigateToKbAdmin() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkKnowledgebase);
            clickAfterVisibilityOfElement(lnkAdministration);
            clickAfterVisibilityOfElement(lnkKnowledgebaseAdmin);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void navigateToKbAnalytics() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkKnowledgebase);
            clickAfterVisibilityOfElement(lnkAnalytics);
            clickAfterVisibilityOfElement(lnkKnowledgebaseAnalytics);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void switchAnotherTab() throws IOException {
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
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void ContentWebServiceUATURL(WebDriver webDriver) {
        webDriver.get(ConfigReader.getProperty("uatcontenturl"));
        WebDriverWait wait = new WebDriverWait(webDriver, 220);
    }

    public void EnwisenWebServiceUATURL(WebDriver webDriver) {
        webDriver.get(ConfigReader.getProperty("uatenwisenurl"));
        WebDriverWait wait = new WebDriverWait(webDriver, 220);
    }

    public static String extractInt(String str) {
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        if (str.equals(""))
            return "-1";
        return str;
    }

    public void navigateDefaultTab() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            webDriver.switchTo().window(currentTab);
            webDriver.switchTo().defaultContent();
            Reporter.log("Navigate to main tab Successfully");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }
    public void backButton() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            webDriver.navigate().back();
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void openDuplicateTab() throws IOException {
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
            ScreenPrints(webDriver);
            throw e;
        }

    }

    public void navigateAnotherOpenedTab() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            currentTab = webDriver.getWindowHandle();

            Set<String> s = webDriver.getWindowHandles();
            Iterator<String> I1 = s.iterator();
            while (I1.hasNext()) {
                String child_window = I1.next();
                if (!currentTab.equals(child_window)) {
                    webDriver.switchTo().window(child_window);
                    Reporter.log("Switched to child window.");
                }
            }
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void clickAfterVisibilityOfElement (WebElement element){
        getElement(element).click();
    }

    public void clearAfterVisibilityOfElement (WebElement element){
        getElement(element).clear();
    }

    private WebElement getElement (WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void moveToElement (WebElement element){
        Actions action = new Actions(webDriver);
        action.moveToElement(element).build().perform();
    }
    public void clickAndHold (WebElement element){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(element).clickAndHold(element).build().perform();
    }

    public boolean isElementPresent (WebElement element){
        boolean isElementPresent;
        try {
            isElementPresent = element.isDisplayed();
            return isElementPresent;
        } catch (Exception e) {
            return false;
        }
    }
    public void ScreenPrints (WebDriver webDriver) throws IOException
    {
        Date d = new Date();
        System.out.println(d.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\Screenshots\\" + sdf.format(d) + ".png"));
    }

    public void clickwhenready (WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element != null) {
            element.click();
        } else {
            throw new ElementNotVisibleException("Element not found");
        }
    }

    public String getTodayDate(){
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        return dateFormat.format(date).trim();
    }

    public void signOutUser () {
        clickAndHold(btnUserName);
        clickAfterVisibilityOfElement(btnSignOut);
    }


}

