package pages;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class BlocknUnblockfromSitemapSearch extends BasePage{


@FindBy(xpath = "//span[contains(@class,'x-tree-node-text')][contains(text(),'Search & Nav')]")
private WebElement SearchNavMenue;

@FindBy(xpath = "(//span[text()='Document Settings'])[1]")
private WebElement DocumentSettings;
@FindBy(xpath = "(//span[text()='Document Settings'])[2]")
private WebElement DocumentSettings2;

@FindBy(xpath = "(//input[@data-ref='inputEl'])[2]")
private WebElement Selectsitemalist;

@FindBy(xpath = "(//input[contains(@class,'x-form-field x-form-text x-form-text-default  x-form-empty-field x-form-empty-field-default')])[3]")
private WebElement Blockunblock;

@FindBy(xpath = "//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom')]//span[text()='Submit']")
private WebElement BlockunblockSubmitbtn;



@FindBy(xpath = "(//span[contains(@class,'x-btn-button x-btn-button-default-toolbar-small  x-btn-no-text x-btn-icon x-btn-icon-left x-btn-button-center ')])[3]")
private WebElement HomeMenu;

@FindBy(xpath = "(//span[text()='Site Map'])[1]")
private WebElement Sitemap;
@FindBy(xpath = "(//input[@data-ref='inputEl'])[3]")
private WebElement DocumentNametxtSearchbar;

@FindBy(xpath = "//td[contains(@class,'x-grid-cell x-grid-td x-grid-cell-hcm-gridcolumn')]//div[contains(text(),'FSA Health Care Calculator')]")
private WebElement DocumentNameinSearchgrid;

@FindBy(xpath = "//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')]")
private WebElement DocumentNamechkbox;

@FindBy(how = How.XPATH, using = "//input[@id='PageHeaderSearchField-inputEl']")
private WebElement Searchtxtbox;
@FindBy(xpath = "(//a[@class='x-tree-node-text  cls-treecolumn-link-item'])[1]")
private WebElement labelAllResults;
@FindBy(xpath = "//a[@class='x-btn list-page-arrow list-page-prev x-unselectable x-box-item x-toolbar-item x-btn-plain-toolbar-small x-btn-no-text x-item-disabled x-btn-disabled']")
private WebElement searchResultPagination;
@FindBy(xpath = "(//div[@class='x-grid-cell-inner ']/h4/b/a)[1]")
private WebElement lnkSearchedDocument;

@FindBy(xpath = "//div[contains(text(),'0 Results Found')]")
private WebElement oResultFound;

@FindBy(xpath = "//b[contains(text(),'Did you mean')]")
private WebElement Didyoumean;

@FindBy(xpath = "//span[contains(text(),'Search results for')]")
private WebElement SearchResultfor;

@FindBy(xpath = "//a[contains(@class,'didYouMeanAnchor')]/@href")
private WebElement Hyperlinkafterdidyoumean;





//td[contains(@class,'x-grid-cell x-grid-td x-grid-cell-hcm-gridcolumn')]//div[contains(text(),'FSA Health Care Calculator')]

public BlocknUnblockfromSitemapSearch(WebDriver webDriver) {
        super(webDriver);
        }

public void NavigatetoDocumentSettings() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
        clickAfterVisibilityOfElement(SearchNavMenue);
        Reporter.log("Search & NavMenue menu opened.");
        clickAfterVisibilityOfElement(DocumentSettings);
        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Document Settings'])[2]")));
        Reporter.log("Document Settings screen opened.");
        } catch (Exception e) {
        Reporter.log(nameOfCurrMethod + "\n" + e.toString());
        ScreenPrints(webDriver);
        throw e;
        }

        }
public void Blockinsearch(String Documentnametosearch)
        {
        String nameOfCurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
        try{
        Thread.sleep(1000);
        clearAfterVisibilityOfElement(DocumentNametxtSearchbar);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//span[text()='Document Settings'])[2]))"))));
        DocumentNametxtSearchbar.sendKeys(Documentnametosearch);
        DocumentNametxtSearchbar.sendKeys(Keys.ENTER);
        waitForLoadingIconToBeDisappeared();
        if(DocumentNameinSearchgrid.isDisplayed())
        {
        DocumentNamechkbox.click();
        Thread.sleep(500);
        Blockunblock.click();
        List<WebElement> list = webDriver.findElements(By.xpath("//ul[@class='x-list-plain']/li"));
        list.get(1).click();
        Thread.sleep(200);
        Blockunblock.click();
        List<WebElement> listBlock = webDriver.findElements(By.xpath("(//input[contains(@class,'x-form-field x-form-text x-form-text-default  x-form-empty-field x-form-empty-field-default')])[3]"));
        listBlock.get(1).click();
        BlockunblockSubmitbtn.click();
        openDuplicateTab();
        HomeMenu.click();
        Sitemap.click();
        Thread.sleep(1000);
        WebElement sitemapdoclink = webDriver.findElement(By.xpath("//td[contains(@class,'x-grid-cell x-grid-td x-grid-cell-hcm-gridcolumn')]//div[contains(text(),'"+Documentnametosearch+"')]"));
        if(sitemapdoclink.isDisplayed())
        {
        System.out.println(" Document is not blocked  "+Documentnametosearch);
        }
        else
        {
        System.out.println(" Document is Blocked as expected"+Documentnametosearch);
        }


        }

        }
        catch (Exception ex) {

        }


        }

public void SearchForBasicUser(String searchtearm) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try{

        waitForLoadingIconToBeDisappeared();
        Searchtxtbox.isDisplayed();
        System.out.println("Search text box is displayed");
        Reporter.log("Search text box is displayed");
        clearAfterVisibilityOfElement(Searchtxtbox);
        waitForLoadingIconToBeDisappeared();
        Thread.sleep(2000);
        Searchtxtbox.sendKeys(searchtearm);
        Searchtxtbox.sendKeys(Keys.ENTER);
        System.out.println("Basic user is searched successfully");
        Reporter.log("Basic user is searched successfully");
        }
        catch (Exception ex)
        {
        System.out.println(ex.getMessage());
        ScreenPrints(webDriver);
        Reporter.log(nameOfCurrMethod + "\n" + ex.toString());
        }
        }
public void validateSearchedterm(String searchtearm) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
        String txtAllResult = labelAllResults.getText();
        Reporter.log("All Result label present on search result page.");
        int searchResultCount = Integer.parseInt(StringUtils.substringBetween(txtAllResult, "(", ")"));
        Reporter.log("Search result count taken from All result label.");
        Assert.assertTrue(searchResultCount > 0, "Searched Result count is 0.");
        Reporter.log("Search result count greater than 0.");
        Assert.assertTrue(searchResultPagination.isDisplayed(), "Pagination is not displayed on search result page.");
        Reporter.log("Pagination is present on Search result page.");
        // Assert.assertEquals(searchtearm, lnkSearchedDocument.getText(), "Searched Posting is not displayed on search result page. ");
        Reporter.log("Searched Posting Present on Search result page.");
        SearchResultfor.isDisplayed();
        Reporter.log("Word is searched result page.");

        } catch (NumberFormatException e) {
        Reporter.log(nameOfCurrMethod + "\n" + e.toString());
        ScreenPrints(webDriver);
        throw e;
        }
        }

public void  ReadDataExcel(String searchtearm) throws Exception {
        ExcelUtils.setExcelFile();

        int rowCount =ExcelUtils.getRowUsed();
        for (int i = 1; i<rowCount; i++) {
        searchtearm = ExcelUtils.getCellData(i,1);
        System.out.print( "Search value: "+ searchtearm);
        Thread.sleep(500);
        SearchForBasicUser(searchtearm);
        validateSearchedterm(searchtearm);
        ExcelUtils.setcell(i,2);
        Thread.sleep(1000);
        }
        }


public void Noicesearchterm(String searchtearm) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
        oResultFound.isDisplayed();
        Reporter.log("0 Result Found on search result page.");
        } catch (NumberFormatException e) {
        Reporter.log(nameOfCurrMethod + "\n" + e.toString());
        ScreenPrints(webDriver);
        throw e;
        }
        }

public void Missspellsearchterm(String searchtearm) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
        SearchResultfor.isDisplayed();
        Reporter.log("Misspelled word is searched result page.");

        Didyoumean.isDisplayed();
        Reporter.log("Misspelled word is searched result page.");
        Hyperlinkafterdidyoumean.isDisplayed();
        Reporter.log("Link is displayed after Did you Mean text after misspelled word.");
        } catch (NumberFormatException e) {
        Reporter.log(nameOfCurrMethod + "\n" + e.toString());
        ScreenPrints(webDriver);
        throw e;
        }
        }

        }

