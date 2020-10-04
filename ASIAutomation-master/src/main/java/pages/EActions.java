package pages;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EActions {
    //protected WebDriver driver;
    protected WebDriver webDriver;
    protected WebDriverWait wait;

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

    public void EnterText(WebElement element, String text)
    {
        try
        {
            element.clear();
            element.sendKeys(text);
        }
        catch (Exception ex){
            System.out.println(ex);
    }
    }
}
