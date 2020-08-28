package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ConfigReader;

public class UserBlock {

    @FindBy(how = How.XPATH, using = "//span[text()='User ID']")
    private WebElement txtUserID;

    @FindBy(how = How.NAME, using = "userid")
    private WebElement useridfield;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'testblock1')]")
    private WebElement testuser1;


    public void Userblock(WebDriver driver) throws InterruptedException {
        PageFactory.initElements(driver, this);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        useridfield.sendKeys(ConfigReader.getProperty("userblock1"));
        driver.findElement(By.linkText("APPLY")).click();
        Thread.sleep(3000);
        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'testblock1')]")));
        testuser1.click();

        Thread.sleep(10000);


    }
}


