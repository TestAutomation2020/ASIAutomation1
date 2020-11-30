package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import util.ConfigReader;

import java.io.IOException;


public class ExportAuditLog extends BasePage {

    @FindBy(xpath = "(//span[@class='x-btn-button x-btn-button-default-toolbar-small  x-btn-no-text x-btn-icon x-btn-icon-left x-btn-button-center '])[1]")
    private WebElement hamburgerIcon;

    @FindBy(xpath = "//span[text()='Export Audit Log']")
    private WebElement menuExportAuditLog;

    @FindBy(xpath = "//span[text()='Export Audit Log' and @class='cls-text']")
    private WebElement labelExportAuditLogLabel;

    @FindBy(xpath = "(//div[@class='x-toolbar-text cls-title x-box-item x-toolbar-item x-toolbar-text-default']/span[@class='cls-text'])[4]")
    private WebElement labelExportAuditLogLast1Month;

    @FindBy(xpath = "(//span[text()='User ID'])[1]")
    private WebElement labelUserIDFilter;

    @FindBy(xpath = "(//span[text()='Pattern Code'])[1]")
    private WebElement labelPatternCodeFilter;

    @FindBy(xpath = "(//span[text()='File Format'])[1]")
    private WebElement labelFileFormatFilter;

    @FindBy(xpath = "(//span[text()='Download Status'])[1]")
    private WebElement labelDownloadStatusFilter;

    @FindBy(xpath = "(//span[text()='User ID'])[2]")
    private WebElement labelUserID;

    @FindBy(xpath = "//input[@name='timePeriod']")
    private WebElement dropTimePeriod;

    @FindBy(xpath = "//li[text()='Last 2 Days']")
    private WebElement selectLast2Days;

    @FindBy(xpath = "//input[@name='patterncode']")
    private WebElement patternCodeFilter;

    @FindBy(xpath = "//input[@name='fileformat']")
    private WebElement fileFormatFilter;

    @FindBy(xpath = "//li[text()='CSV']")
    private WebElement csvFileFormat;

    @FindBy(xpath = "//span[text()='APPLY']")
    private WebElement btnApply;

    @FindBy(xpath = "//div[@class='x-grid-cell-inner ' and contains(text(),'AnalyticsFrequentSearches-ale-FrequentSearches')]")
    private WebElement gridCodeData;

    @FindBy(xpath = "//div[@class='x-grid-cell-inner ' and text()='CSV']")
    private WebElement gridCSVData;


    public ExportAuditLog(WebDriver webDriver) {
        super(webDriver);
    }

    public void navigateToExportAuditLogMenu() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(menuExportAuditLog);
            Reporter.log("Export Audit Log report opened.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifyLabel() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(labelExportAuditLogLabel.getText(), "Export Audit Log", "Label of Export Audit Log is not present.");
            Assert.assertEquals(labelExportAuditLogLast1Month.getText(), "Export Audit Log Last 1 Month", "Label of Export Audit Log Last 1 month is not present.");
            Assert.assertEquals(labelUserIDFilter.getText(), "User ID", "Label of User ID is not present.");
            Assert.assertEquals(labelPatternCodeFilter.getText(), "Pattern Code", "Label of Pattern Code is not present.");
            Assert.assertEquals(labelFileFormatFilter.getText(), "File Format", "Label of File Format is not present.");
            Assert.assertEquals(labelDownloadStatusFilter.getText(), "Download Status", "Label of Download Status is not present.");
            Assert.assertEquals(labelUserID.getText(), "User ID", "Label of column User ID is not present.");
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
            patternCodeFilter.sendKeys(ConfigReader.getProperty("patterncodeexportauditlog"));
            clickAfterVisibilityOfElement(fileFormatFilter);
            clickAfterVisibilityOfElement(csvFileFormat);
            clickAfterVisibilityOfElement(btnApply);
            waitForLoadingIconToBeDisappeared();
            Reporter.log("Clicked on Apply button.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }

    }

    public void verifiedAppliedFilter() throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Thread.sleep(5000);
            Assert.assertTrue(gridCodeData.isDisplayed(),"Grid data is not available.");
            Assert.assertTrue(gridCSVData.isDisplayed(), "Grid data is not present.");
        } catch (InterruptedException e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }





}
