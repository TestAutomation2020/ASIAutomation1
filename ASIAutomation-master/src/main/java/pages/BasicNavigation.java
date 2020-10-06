package pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

    @FindBy(how = How.XPATH, using = "//div[@id='hcm-displayfield-1072-inputEl']")
    private WebElement PagecodeonPrint;
    @FindBy(how = How.XPATH, using = "//span[@id='hcm-button-1731-btnEl']")
    private WebElement AskHRCloseform;

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

    public void AskHR() {
        waitForLoadingIconToBeDisappeared();
        AskHRIconbtn.isDisplayed();
        System.out.println("Ask HR Button  is displayed");
        AskHRIconbtn.click();
        waitForLoadingIconToBeDisappeared();
        Assert.assertTrue(AskHRlabelonform.isDisplayed(), "AskHR label on form is displayed on click of ASK HR button.");
        AskHRCloseform.click();
    }

    public void Favorite() {
        waitForLoadingIconToBeDisappeared();
        Favoritesbtn.isDisplayed();
        System.out.println("Favorite Button is displayed");
        waitForLoadingIconToBeDisappeared();
        Assert.assertTrue(SavebuttoninFavoriteform.isDisplayed(), "Save button in Favorite form is displayed.");
    }

    public void Print() {
        waitForLoadingIconToBeDisappeared();
        Printbtn.isDisplayed();
        System.out.println("Print Button is displayed");
        waitForLoadingIconToBeDisappeared();
        Assert.assertTrue(PagecodeonPrint.isDisplayed(), "Page code on Print form is displayed.");

    }

    public void SearchForBasicUser() {

        waitForLoadingIconToBeDisappeared();
        Searchtxtbox.isDisplayed();
        System.out.println("Search text box is displayed");
        clearAfterVisibilityOfElement(Searchtxtbox);
        waitForLoadingIconToBeDisappeared();
        Searchtxtbox.sendKeys("Health");
        Searchtxtbox.sendKeys(Keys.ENTER);

    }

    public void validateSearchedPosting(String postingName) {
        String txtAllResult = labelAllResults.getText();
        int searchResultCount = Integer.parseInt(StringUtils.substringBetween(txtAllResult, "(", ")"));
        Assert.assertTrue(searchResultCount > 0, "Searched Result count is 0.");
        Assert.assertTrue(searchResultPagination.isDisplayed(), "Pagination is displayed on search result page.");
        Assert.assertEquals(postingName, lnkSearchedDocument.getText(), "Searched Posting is displayed on search result page. ");
    }

}







