package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import util.ConfigReader;

import java.io.IOException;

public class FrequentSearches extends BasePage {

    @FindBy(xpath = "//span[contains(@class,'x-tree-node-text')][contains(text(),'Search')]")
    private WebElement menuSearch;

    @FindBy(xpath = "//span[text()='Frequent Searches']")
    private WebElement menuFrequentSearches;

    @FindBy(xpath = "(//span[text()='Frequent Searches'])[2]")
    private WebElement labelFrequentSearches;

    @FindBy(xpath = "//span[text()='Frequent Searches Last 1 Month']")
    private WebElement labelFrequentSearchesLast1month;

    @FindBy(xpath = "(//span[@class='cls-text'])[4]")
    private WebElement labelFrequentSearchesGrid;

    @FindBy(xpath = "(//span[@class='cls-text'])[5]")
    private WebElement labelPercentageOfTotalSearchesChart;

    @FindBy(xpath = "(//span[@class='cls-text'])[6]")
    private WebElement labelSearchTrendsChart;

    @FindBy(xpath = "//span[text()='Filter']")
    private WebElement labelFilter;

    @FindBy(xpath = "//span[text()='Group']")
    private WebElement filterLabelGroup;

    @FindBy(xpath = "//div[@class='x-column-header-text']/span[text()='Search Term']")
    private WebElement colmLabelSearchTerm;

    @FindBy(xpath = "//div[@class='x-column-header-text']/span[text()='Count']")
    private WebElement colmLabelCount;

    @FindBy(xpath = "//div[@class='x-column-header-text']/span[text()='Percentage of Total Searches']")
    private WebElement colmLabelPercentageOfTotalSearches;

    @FindBy(xpath = "//span[text()='Percentage of Total Searches Last 1 Month']")
    private WebElement labelPercentageOfTotalSearches;

    @FindBy(xpath = "//span[text()='Search Trends - Last 1 Month -']")
    private WebElement labelSearchTrends;

    @FindBy(xpath = "//span[text()='50 Records Per Page']")
    private WebElement labelPagination;

    @FindBy(xpath = "//input[@name='timePeriod']")
    private WebElement dropTimePeriod;

    @FindBy(xpath = "//li[text()='Last 2 Days']")
    private WebElement selectLast2Days;

    @FindBy(xpath = "//span[text()='APPLY']")
    private WebElement btnApply;

    @FindBy(xpath = "//span[text()='CLEAR']")
    private WebElement btnClear;

    @FindBy(xpath = "//span[text()='Frequent Searches Last 2 Days']")
    private WebElement labelFrequentSearchesLast2Days;

    @FindBy(xpath = "//span[text()='Percentage of Total Searches Last 2 Days']")
    private WebElement labelPercentageOfTotalSearchesLast2Days;

    @FindBy(xpath = "//input[@name='searchTerm']")
    private WebElement inputSearchTerm;

    @FindBy(xpath = "//a[text()='Health & wellness']")
    private WebElement gridValue;

    @FindBy(xpath = "((//div[@class='x-toolbar-text cls-title x-box-item x-toolbar-item x-toolbar-text-default'])[6]//span)[1]")
    private WebElement labelSearchTrend;

    @FindBy(xpath = "(//div[@class='x-surface' and contains(@id,'cartesian-')]//*[name()='svg']//*[name()='tspan'])[11]")
    private WebElement barGraph;

    @FindBy(xpath = "//div[contains(@id,'ext-element-')]//*[name()='svg']")
    private WebElement pieChart;

    @FindBy(xpath = "(//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-btn-no-text'])[4]")
    private WebElement exportIcon;

    @FindBy(xpath = "(//span[text()='Export'])[2]")
    private WebElement exportButtonFirstTime;

    @FindBy(xpath = "(//span[text()='Export'])[4]")
    private WebElement exportButtonSecondTime;

    @FindBy(xpath = "(//span[text()='Export'])[6]")
    private WebElement exportButtonThirdTime;

    @FindBy(xpath = "(//span[text()='Export'])[8]")
    private WebElement exportButtonForthTime;

    @FindBy(xpath = "(//input[@class='x-form-field x-form-text x-form-text-default   ' and @value='CSV'])[2]")
    private WebElement dropdownExport;

    @FindBy(xpath = "//li[@class='x-boundlist-item' and text()='HTML']")
    private WebElement selectHTML;

    @FindBy(xpath = "(//li[@class='x-boundlist-item' and text()='PDF'])[3]")
    private WebElement selectPDF;

    @FindBy(xpath = "(//li[@class='x-boundlist-item' and text()='XML'])[2]")
    private WebElement selectXML;

    @FindBy(xpath = "(//div[@class='x-panel-body x-panel-body-default x-panel-body-default x-noborder-trbl']//*[local-name()='svg' and @namespace='http://www.w3.org/2000/svg'])[2]")
    private WebElement graphPercentageOfTotalSearch;

    @FindBy(xpath = "//div[@class='x-autocontainer-outerCt']//*[contains(@id,'tooltip-') and @data-ref='innerCt']")
    private WebElement pieChartTooltip;

    @FindBy(xpath = "(//span[text()='Print Chart'])[2]")
    private WebElement btnPrintChartForSearchTrend;

    @FindBy(xpath = "//div[contains(text(),'No data meets the provided criteria. Please adjust filters, if required.')]")
    private WebElement messageProcessingErrorForPrintChart;

    @FindBy(xpath = "//span[@class='x-column-header-checkbox']")
    private WebElement selectAllCheckBox;

    @FindBy(xpath = "(//span[@class='x-grid-checkcolumn'])[1]")
    private WebElement firstCheckBox;

    @FindBy(xpath = "//div[@class='x-form-cb-wrap-inner']//label[normalize-space()='Group']")
    private WebElement btnGroupRadio;

    @FindBy(xpath = "//div[@class='x-grid-group-title']")
    private WebElement groupTitleOnGroupGrid;

    @FindBy(xpath = "//label[text()='Date Range']")
    private WebElement radioDateRange;

    @FindBy(xpath = "(//input[@class='x-form-field x-form-text x-form-text-default   '])[1]")
    private WebElement txtStartDate;

    @FindBy(xpath = "(//input[@class='x-form-field x-form-text x-form-text-default  x-form-empty-field x-form-empty-field-default'])[1]")
    private WebElement afterTheClearStartDate;


    public FrequentSearches(WebDriver webDriver) {
        super(webDriver);
    }

    public void navigateToFrequentSearchMenu() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(menuSearch);
            Reporter.log("Search menu opened.");
            clickAfterVisibilityOfElement(menuFrequentSearches);
            Reporter.log("Frequent Search report opened.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateFrequentSearchMenu() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Assert.assertEquals(labelFrequentSearches.getText(), "Frequent Searches", "Frequent Searches screen is not open.");
            Reporter.log("Label of Frequent Search is verified.");
            Assert.assertEquals(labelFrequentSearchesLast1month.getText(), "Frequent Searches Last 1 Month", "Frequent Searches related label is not display.");
            Reporter.log("Label of Frequent Searches Last 1 Month is verified.");
            Assert.assertEquals(labelFilter.getText(), "Filter", "Filter label is not present.");
            Reporter.log("Label of Filter is verified.");
            Assert.assertEquals(filterLabelGroup.getText(), "Group", "Group label is not present.");
            Reporter.log("Label of Group is verified.");
            Assert.assertEquals(colmLabelSearchTerm.getText(), "Search Term", "Search Term Column label is not present.");
            Reporter.log("Label of Search term is verified.");
            Assert.assertEquals(colmLabelCount.getText(), "Count", "Count Column label is not present.");
            Reporter.log("Label of Count is verified.");
            Assert.assertEquals(colmLabelPercentageOfTotalSearches.getText(), "Percentage of Total Searches", "Percentage of Total Searches Column label is not present.");
            Reporter.log("Label of Percentage of Total Searches is verified.");
            Assert.assertEquals(labelPercentageOfTotalSearches.getText(), "Percentage of Total Searches Last 1 Month", "Percentage of Total Searches Last 1 month label is not present.");
            Reporter.log("Label of Percentage of Total Searches Last 1 Month is verified.");
            Assert.assertEquals(labelSearchTrends.getText(), "Search Trends - Last 1 Month -", "Search Trends - Last 1 Month - label is not present.");
            Reporter.log("Label of Search Trends - Last 1 Month - is verified.");
            Assert.assertEquals(labelPagination.getText(), "50 RECORDS PER PAGE", "50 Records Per Page label is not present.");
            Reporter.log("Label of 50 RECORDS PER PAGE is verified.");
            Assert.assertTrue(pieChart.isDisplayed(), "Pie chart is not present.");

        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifyCSVExportFunctionality() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Thread.sleep(5000);
            clickAfterVisibilityOfElement(exportIcon);
            clickAfterVisibilityOfElement(exportButtonFirstTime);
            waitForLoadingIconToBeDisappeared();
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


    public void appliedLast2DaysFilter() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(dropTimePeriod);
            Reporter.log("Time Period dropdown select.");
            clickAfterVisibilityOfElement(selectLast2Days);
            Reporter.log("Today value selected in Time Period dropdown.");
            inputSearchTerm.sendKeys(ConfigReader.getProperty("searchtermforfrequentsearch"));
            Reporter.log("Search term entered in Search Term text box.");
            clickAfterVisibilityOfElement(btnApply);
            Reporter.log("Clicked on Apply button.");

        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateAppliedLast2DaysFilter() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Assert.assertEquals(labelFrequentSearchesLast2Days.getText(), "Frequent Searches Last 2 Days", "Frequent Searches Toady label is not verified.");
            Reporter.log("Label of Frequent Searches Toady is verified.");
            Assert.assertEquals(labelPercentageOfTotalSearchesLast2Days.getText(), "Percentage of Total Searches Last 2 Days", "Percentage of Total Searches Today label is not verified.");
            Reporter.log("Label of Percentage of Total Searches Today is verified.");
            Assert.assertTrue(gridValue.isDisplayed(), "Searched term is not present in grid.");
            Reporter.log("Search term present in grid.");
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
            moveToElement(graphPercentageOfTotalSearch);
            Reporter.log("Pie Chart Tooltip" + pieChartTooltip.getText());
            Assert.assertEquals(labelSearchTrend.getText(), "Search Trends - Last 2 Days - Health & wellness", "Label of Search Trend is not verified.");
            Assert.assertTrue(barGraph.isDisplayed(), "Bar Graph is not loaded.");
            Reporter.log("Bar chart tooltip" + barGraph.getText());
            Thread.sleep(1000);
            Assert.assertTrue(Double.parseDouble(barGraph.getText()) > 0, "Bar Grpah is not loaded.");
        } catch (NumberFormatException e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void groupRadioButton() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(selectAllCheckBox);
            clickAfterVisibilityOfElement(firstCheckBox);
            clickAfterVisibilityOfElement(btnApply);
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(btnGroupRadio);
            Assert.assertTrue(groupTitleOnGroupGrid.isDisplayed(),"Group Title on Group Grid is not present.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifyHTMLExportFunctionality() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Thread.sleep(5000);
            clickAfterVisibilityOfElement(exportIcon);
            clickAfterVisibilityOfElement(dropdownExport);
            clickAfterVisibilityOfElement(selectHTML);
            clickAfterVisibilityOfElement(exportButtonSecondTime);
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void appliedDateRangeFilter() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(radioDateRange);
            txtStartDate.clear();
            Thread.sleep(1000);
            afterTheClearStartDate.sendKeys(ConfigReader.getProperty("analyticsstartdate"));
            txtStartDate.clear();
           Thread.sleep(1000);
            afterTheClearStartDate.sendKeys(ConfigReader.getProperty("analyticsenddate"));
            inputSearchTerm.clear();
            clickAfterVisibilityOfElement(btnApply);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifiedAppliedDateRangeFilter() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(labelFrequentSearchesGrid.getText(),"Frequent Searches "+ConfigReader.getProperty("analyticsstartdate")+" To "+ConfigReader.getProperty("analyticsenddate"));
            Assert.assertEquals(labelPercentageOfTotalSearchesChart.getText(),"Percentage of Total Searches "+ConfigReader.getProperty("analyticsstartdate")+" To "+ConfigReader.getProperty("analyticsenddate"));
            Assert.assertEquals(labelSearchTrendsChart.getText(),"Search Trends - "+ConfigReader.getProperty("analyticsstartdate")+" To "+ConfigReader.getProperty("analyticsenddate")+" -");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }
    public void verifyXMLExportFunctionality() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Thread.sleep(5000);
            clickAfterVisibilityOfElement(exportIcon);
            clickAfterVisibilityOfElement(dropdownExport);
            clickAfterVisibilityOfElement(selectXML);
            clickAfterVisibilityOfElement(exportButtonThirdTime);
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void appliedClearButton() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(btnClear);
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifyPDFExportFunctionality() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Thread.sleep(5000);
            clickAfterVisibilityOfElement(exportIcon);
            clickAfterVisibilityOfElement(dropdownExport);
            clickAfterVisibilityOfElement(selectPDF);
            clickAfterVisibilityOfElement(exportButtonForthTime);
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

}


