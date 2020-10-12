package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ConfigReader;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class EActions {
    //protected WebDriver driver;
    protected WebDriver webDriver;
    protected WebDriverWait wait;
    private String currentTab;

    @FindBy(xpath = "//div[text()='Loading...']")
    private WebElement loading;

    public EActions(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 10), this);
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 30);
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
    public void waitForLoadingIconToBeDisappeared() {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 5);
            wait.until(ExpectedConditions.visibilityOf(loading));
        } catch (Exception e) {
            return;
        }
        wait.until(ExpectedConditions.invisibilityOf(loading));
    }

    public boolean IsElementExists(WebElement element)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(webDriver, 5);
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        }
        catch (Exception ex)
        {
            return false;
        }

    }
    public void openDuplicateTab() {
        currentTab = webDriver.getWindowHandle();
        String currentUrl = webDriver.getCurrentUrl();
        String link = String.format("window.open('%s','_blank');", currentUrl);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript(link);
        System.out.println("Duplicate Tab open successfully");

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
    public void LaunchApplication(WebDriver driver){
        driver.get(ConfigReader.getProperty("url"));
        WebDriverWait wait = new WebDriverWait(driver,220);
    }
    public void EnterText(WebElement element, String text)
    {
        try
        {
            element.clear();
            element.sendKeys(text);
                }
        catch (Exception ex){
            System.out.println(ex.getMessage());
    }
    }
    public void ScreenPrints(WebDriver webDriver) throws IOException
    {
        Date d = new Date();
        System.out.println(d.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,  new File(System.getProperty("user.dir")+"\\Screenshots\\"+sdf.format(d)+".png"));
    }
}
