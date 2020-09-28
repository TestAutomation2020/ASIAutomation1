package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BasicNavigation extends EActions{

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Ask HR')]")
    private WebElement AskHRIconbtn;
    @FindBy(how = How.XPATH, using = "//span[@class=\"x-btn-inner x-btn-inner-default-toolbar-small\"][text()='Favorites']")
    private WebElement Favoritesbtn;
    @FindBy(how = How.XPATH, using = "//span[@class=\"x-btn-inner x-btn-inner-default-toolbar-small\"][text()='Print']")
    private WebElement Printbtn;
    @FindBy(how = How.XPATH, using = "//input[@id='PageHeaderSearchField-inputEl']")
    private WebElement Searchtxtbox;
    @FindBy(how = How.XPATH, using = "//span[@id='hcm-button-1139-btnEl']")
    private WebElement Humbergericon;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Site Map')]")
    private WebElement SiteMaplink;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Set up Home Page')]")
    private WebElement SetupHomepagelink;
    @FindBy(how = How.XPATH, using = "//div//img")
    private WebElement Imagenwidgetimage;

    public void Buttons() {

        waitForLoadingIconToBeDisappeared();

       AskHRIconbtn.click();
        System.out.println("Ask HR Button  is displayed");
        Favoritesbtn.isDisplayed();
        System.out.println("Favorite Button is displayed");
        Printbtn.isDisplayed();
        System.out.println("Print Button is displayed");
        Searchtxtbox.isDisplayed();
        System.out.println("Search text box is displayed");
        Humbergericon.isDisplayed();




    }







}
