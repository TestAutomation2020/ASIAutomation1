package pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;

import static java.sql.DriverManager.getDriver;

public class BasicNavigation extends BasePage {

    @FindBy(how = How.XPATH, using = "//span[@class='x-btn-inner x-btn-inner-default-toolbar-small'][text()='Ask HR']")
    private WebElement AskHRIconbtn;
    @FindBy(how = How.XPATH, using = "//span[@class='x-btn-inner x-btn-inner-default-toolbar-small'][text()='Favorites']")
    private WebElement Favoritesbtn;
    @FindBy(how = How.XPATH, using = "//span[@class='x-btn-inner x-btn-inner-default-toolbar-small'][text()='Print']")
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
    @FindBy(how = How.XPATH, using = "//span[contains(@id,'hcm-tbtext') and text()='Ask HR']")
    private WebElement AskHRlabelonform;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl' and text ()='Save']")
    private WebElement SavebuttoninFavoriteform;

    @FindBy(how = How.XPATH, using = "//div[@data-ref='inputEl'][contains(.,'Page Code: ')]")
    private WebElement PrintPageCode;
    @FindBy(how = How.XPATH, using = "//span[contains(@data-ref,'btnEl')]")
    private WebElement PrintIcon;
    @FindBy(how = How.XPATH, using = "//div[@class='x-window-bodyWrap']//span[contains(@data-ref,'btnEl')]")
    private WebElement CloseBtn;
    @FindBy(how = How.XPATH, using = "//iframe[@class='x-component x-fit-item x-component-default']")
    private WebElement PrintScreenFrame;



    @FindBy(how = How.XPATH, using = "//div[5]//div//a[@class='x-btn sw-tertiary x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-btn-no-text']")
    private WebElement AskHRCloseform;
    @FindBy(how = How.XPATH, using = "//*[@data-ref='instrEl' and text()='Ask HR instructions.']")
    private WebElement AskHRLabelonAskHRform;

    //Search Home page
    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl' and text ()='Search Help']")
    private WebElement SearchHelptip;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search results for')]")
    private WebElement Searchlabelfor;
    @FindBy(xpath = "(//div[@class='x-grid-cell-inner ']/h4/b/a)[1]")
    private WebElement lnkSearchedDocument;

    @FindBy(xpath = "(//a[@class='x-tree-node-text  cls-treecolumn-link-item'])[1]")
    private WebElement labelAllResults;
    @FindBy(xpath = "//a[@class='x-btn list-page-arrow list-page-prev x-unselectable x-box-item x-toolbar-item x-btn-plain-toolbar-small x-btn-no-text x-item-disabled x-btn-disabled']")
    private WebElement searchResultPagination;

    public BasicNavigation(WebDriver webDriver) {
        super(webDriver);
    }

    public void AskHR() throws IOException {
        try {
            waitForLoadingIconToBeDisappeared();
            AskHRIconbtn.isDisplayed();
            System.out.println("Ask HR Button  is displayed");
            AskHRIconbtn.click();
            waitForLoadingIconToBeDisappeared();
            Assert.assertTrue(AskHRlabelonform.isDisplayed(), "AskHR label on form is displayed on click of ASK HR button.");
            Assert.assertTrue(AskHRLabelonAskHRform.isDisplayed(),"Ask HR Instructions are displayed");
            System.out.println("Ask HR form is open successfully");
            waitForLoadingIconToBeDisappeared();
            ScreenPrints(webDriver);
            AskHRCloseform.click();
            System.out.println("Ask HR form is closed successfully");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            ScreenPrints(webDriver);
        }
    }

    public void Favorite() throws IOException {
        try{
        waitForLoadingIconToBeDisappeared();
        clickAfterVisibilityOfElement(Favoritesbtn);
        System.out.println("Favorite Button is displayed");
        waitForLoadingIconToBeDisappeared();
        Assert.assertTrue(SavebuttoninFavoriteform.isDisplayed(), "Save button in Favorite form is displayed.");
        System.out.println("Favorites button functionality is as expected");
        ScreenPrints(webDriver);
    }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            ScreenPrints(webDriver);
        }
    }

    public void Print() throws IOException {
        try{
        waitForLoadingIconToBeDisappeared();
            Printbtn.click();
            Thread.sleep(5000);
            webDriver.switchTo().frame(PrintScreenFrame);
            Thread.sleep(3000);
            String abc = PrintPageCode.getText();
            System.out.println(abc);
            PrintIcon.click();
            Thread.sleep(5000);
            ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());
            webDriver.switchTo().window(tabs.get(1));
            webDriver.close();
            webDriver.switchTo().window(tabs.get(0));
            Thread.sleep(5000);
            webDriver.switchTo().defaultContent();
            CloseBtn.click();
            Thread.sleep(5000);
            System.out.println("Print Button functionality is as expected");
        ScreenPrints(webDriver);

    }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            ScreenPrints(webDriver);
        }
    }




    public void SearchForBasicUser() throws IOException {
        try{

        waitForLoadingIconToBeDisappeared();
        Searchtxtbox.isDisplayed();
        System.out.println("Search text box is displayed");
        clearAfterVisibilityOfElement(Searchtxtbox);
        waitForLoadingIconToBeDisappeared();
        Searchtxtbox.sendKeys("Health");
        Searchtxtbox.sendKeys(Keys.ENTER);
        System.out.println("Basic user is searched successfully");

    }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            ScreenPrints(webDriver);
        }
    }

    public void validateSearchedPosting(String postingName) throws IOException {
        try {
            String txtAllResult = labelAllResults.getText();
            int searchResultCount = Integer.parseInt(StringUtils.substringBetween(txtAllResult, "(", ")"));
            Assert.assertTrue(searchResultCount > 0, "Searched Result count is 0.");
            Assert.assertTrue(searchResultPagination.isDisplayed(), "Pagination is displayed on search result page.");
            Assert.assertEquals(postingName, lnkSearchedDocument.getText(), "Searched Posting is displayed on search result page. ");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ScreenPrints(webDriver);
        }
    }


}







