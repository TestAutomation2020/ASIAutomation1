package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import util.ConfigReader;

import java.io.IOException;

public class RecentSearches extends BasePage {

    @FindBy(xpath = "//span[contains(@class,'x-tree-node-text')][contains(text(),'Search')]")
    private WebElement menuSearch;

    @FindBy(xpath = "//span[text()='Recent Searches']")
    private WebElement menuRecentSearches;

    @FindBy(xpath = "(//span[text()='Recent Searches'])[2]")
    private WebElement labelRecentSearches;

    @FindBy(xpath = "//span[text()='Recent Searches Last 1 Month ']")
    private WebElement labelRecentSearchesLast1month;

    @FindBy(xpath = "//span[text()='Search Trends - Last 1 Month']")
    private WebElement labelSearchTrends;

    @FindBy(xpath = "//span[text()='Filter']")
    private WebElement labelFilter;

    @FindBy(xpath = "//span[text()='Group']")
    private WebElement filterLabelGroup;

    @FindBy(xpath = "//span[text()='50 Records Per Page']")
    private WebElement labelPagination;

    @FindBy(xpath = "//span[text()='APPLY']")
    private WebElement btnApply;

    @FindBy(xpath = "//span[text()='CLEAR']")
    private WebElement btnClear;

    @FindBy(xpath = "//span[text()='Recent Searches Last 2 Days']")
    private WebElement labelRecentSearchesLast2Days;
    @FindBy(xpath = "//div[@class='x-column-header-text']/span[text()='Search Term']")
    private WebElement colmLabelSearchTerm;

    @FindBy(xpath = "//div[@class='x-column-header-text']/span[text()='Last Search Date']")
    private WebElement colmLabelLastSearchDate;

    @FindBy(xpath = "//div[@class='x-column-header-text']/span[text()='Search Results Count']")
    private WebElement colmLabelSearchResultCount;

    @FindBy(xpath = "//span[text()='Print Chart']")
    private WebElement btnPrintChartForSearchTrend;

    @FindBy(xpath = "//div[contains(text(),'No data meets the provided criteria. Please adjust filters, if required.')]")
    private WebElement messageProcessingErrorForPrintChart;

    @FindBy(xpath = "(//span[@class='cls-text'])[4]")
    private WebElement labelRecentSearchesGrid;

    @FindBy(xpath = "(//span[@class='cls-text'])[5]")
    private WebElement labelSearchTrendsChart;

    @FindBy(xpath = "//a[text()='Health & wellness']")
    private WebElement gridValue;

    @FindBy(xpath = "((//div[@class='x-toolbar-text cls-title x-box-item x-toolbar-item x-toolbar-text-default'])[5]//span)[1]")
    private WebElement labelSearchTrend;

    @FindBy(xpath = "(//div[@class='x-surface' and contains(@id,'cartesian-')]//*[name()='svg'])[5]")
    private WebElement barGraph;


    public RecentSearches(WebDriver webDriver) {
        super(webDriver);
    }

    public void navigateToRecentSearchMenu() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(menuSearch);
            Reporter.log("Search menu opened.");
            clickAfterVisibilityOfElement(menuRecentSearches);
            Reporter.log("Recent Search report opened.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateRecentSearchMenu() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Assert.assertEquals(labelRecentSearches.getText(), "Recent Searches", "Recent Searches screen is not open.");
            Reporter.log("Label of Recent Search is verified.");
            Assert.assertEquals(labelRecentSearchesLast1month.getText(), "Recent Searches Last 1 Month", "Frequent Searches related label is not display.");
            Reporter.log("Label of Recent Searches Last 1 Month is verified.");
            Assert.assertEquals(labelFilter.getText(), "Filter", "Filter label is not present.");
            Reporter.log("Label of Filter is verified.");
            Assert.assertEquals(filterLabelGroup.getText(), "Group", "Group label is not present.");
            Reporter.log("Label of Group is verified.");
            Assert.assertEquals(colmLabelSearchTerm.getText(), "Search Term", "Search Term Column label is not present.");
            Reporter.log("Label of Search term is verified.");
            Assert.assertEquals(colmLabelLastSearchDate.getText(), "Last Search Date", "Last Search Date Column label is not present.");
            Reporter.log("Label of Last Search Date is verified.");
            Assert.assertEquals(colmLabelSearchResultCount.getText(), "Search Results Count", "Search Results Count Column label is not present.");
            Reporter.log("Label of Search Result Count is verified.");
            Assert.assertEquals(labelSearchTrends.getText(), "Search Trends - Last 1 Month", "Search Trends - Last 1 Month - label is not present.");
            Reporter.log("Label of Search Trends - Last 1 Month  is verified.");
            Assert.assertEquals(labelPagination.getText(), "50 RECORDS PER PAGE", "50 Records Per Page label is not present.");
            Reporter.log("Label of 50 RECORDS PER PAGE is verified.");

        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateProcessingError() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(btnPrintChartForSearchTrend);
            Thread.sleep(1000);
            Assert.assertEquals(messageProcessingErrorForPrintChart.getText(), ConfigReader.getProperty("processingErrorforgrpah"));
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifiedAppliedDateRangeFilter(String analyticsStartDate, String analyticsEndDate) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(labelRecentSearchesGrid.getText(), "Recent Searches " + analyticsStartDate + " To " + analyticsEndDate);
            Assert.assertEquals(labelSearchTrendsChart.getText(), "Search Trends - " + analyticsStartDate + " To " + analyticsEndDate);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifiedAppliedTimePeriodFilter(String analyticsTimePeriod) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(labelRecentSearchesGrid.getText(), "Recent Searches " + analyticsTimePeriod);
            Assert.assertEquals(labelSearchTrendsChart.getText(), "Search Trends - " + analyticsTimePeriod);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifyGraph() throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(gridValue);
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(labelSearchTrend.getText(), "Search Trends - Last 2 Days - Health & wellness", "Label of Search Trend is not verified.");
            Assert.assertTrue(barGraph.isDisplayed(), "Bar Graph is not loaded.");
            Reporter.log("Bar chart tooltip" + barGraph.getText());
            Thread.sleep(1000);
            // Assert.assertTrue(Double.parseDouble(barGraph.getText()) > 0, "Bar Grpah is not loaded.");
        } catch (NumberFormatException e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

}
