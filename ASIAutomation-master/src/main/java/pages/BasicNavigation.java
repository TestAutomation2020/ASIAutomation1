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

public class BasicNavigation {

    @FindBy(how = How.XPATH, using = "//span[@class=\"x-btn-inner x-btn-inner-default-toolbar-small\"][text()='Ask HR']")
    private WebElement AskHRIcon;

    @FindBy(how = How.XPATH, using = "//span[@class=\"x-btn-inner x-btn-inner-default-toolbar-small\"][text()='Ask HR']")
    private WebElement AskHRtest;





}
