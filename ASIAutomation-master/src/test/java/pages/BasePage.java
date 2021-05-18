package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import util.ConfigReader;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BasePage {
    @FindBy(xpath = "//span[text()='Knowledgebase']")
    private WebElement lnkKnowledgebase;

    @FindBy(xpath = "//span[text()='Administration']")
    private WebElement lnkAdministration;

    @FindBy(xpath = "//span[contains(text(),'Knowledgebase Admin')]")
    private WebElement lnkKnowledgebaseAdmin;

    @FindBy(xpath = "//span[text()='Analytics']")
    private WebElement lnkAnalytics;

    @FindBy(xpath = "//span[text()='Knowledgebase Analytics']")
    private WebElement lnkKnowledgebaseAnalytics;

    @FindBy(xpath = "//div[text()='Loading...']")
    private WebElement loading;

    @FindBy(xpath = "//span[@id='PageHeaderLogout-btnInnerEl']")
    private WebElement btnUserName;

    @FindBy(xpath = "//a[@class='x-menu-item-link cls-has-icon']")
    private WebElement btnSignOut;

    @FindBy(xpath = "//span[text()='Start Date']//..//..//..//div[1]//input")
    private WebElement txtStartDate;

    @FindBy(xpath = "//span[text()='End Date']//..//..//..//div[1]//input")
    private WebElement txtEndDate;

    @FindBy(xpath = "//input[@name='searchTerm']")
    private WebElement inputSearchTerm;

    @FindBy(xpath = "//span[text()='APPLY']")
    private WebElement btnApply;

    @FindBy(xpath = "//label[text()='Date Range']")
    private WebElement radioDateRange;

    @FindBy(xpath = "//span[text()='CLEAR']")
    private WebElement btnClear;

    @FindBy(xpath = "(//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-btn-no-text'])[2]")
    private WebElement filterIcon;

    @FindBy(xpath = "//span[@class='x-btn-inner x-btn-inner-default-toolbar-small' and contains(text(),'Filters Applied')]")
    private WebElement filterCount;

    @FindBy(xpath = "//span[@class='x-column-header-checkbox']")
    private WebElement selectAllCheckBox;

    @FindBy(xpath = "(//span[@class='x-grid-checkcolumn'])[1]")
    private WebElement firstCheckBox;

    @FindBy(xpath = "//div[@class='x-form-cb-wrap-inner']//label[normalize-space()='Group']")
    private WebElement btnGroupRadio;

    @FindBy(xpath = "//div[@class='x-grid-group-title']")
    private WebElement groupTitleOnGroupGrid;

    @FindBy(xpath = "//input[@name='timePeriod']")
    private WebElement dropTimePeriod;

    @FindBy(xpath = "//li[text()='Last 2 Days']")
    private WebElement selectLast2Days;

    @FindBy(xpath = "(//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-btn-no-text'])[4]")
    private WebElement exportIcon;

    @FindBy(xpath = "(//span[text()='Export'])[2]")
    private WebElement exportButtonFirstTime;
    @FindBy(xpath = "(//input[@class='x-form-field x-form-text x-form-text-default   ' and @value='CSV'])[2]")
    private WebElement dropdownExport;

    @FindBy(xpath = "//li[@class='x-boundlist-item' and text()='HTML']")
    private WebElement selectHTML;

    @FindBy(xpath = "(//li[@class='x-boundlist-item' and text()='PDF'])[3]")
    private WebElement selectPDF;

    @FindBy(xpath = "(//li[@class='x-boundlist-item' and text()='XML'])[2]")
    private WebElement selectXML;
    @FindBy(xpath = "(//span[text()='Export'])[4]")
    private WebElement exportButtonSecondTime;

    @FindBy(xpath = "(//span[text()='Export'])[6]")
    private WebElement exportButtonThirdTime;

    @FindBy(xpath = "(//span[text()='Export'])[8]")
    private WebElement exportButtonForthTime;

    @FindBy(xpath = "(//span[text()='Export'])[10]")
    private WebElement exportButtonFifthTime;

    @FindBy(xpath = "//div[text()='Grid does not contain data for export. Please adjust filters if required.']")
    private WebElement txtProcessingError;


    protected WebDriver webDriver;
    protected WebDriverWait wait;
    private String currentTab;
    private final Calendar cal;
    public String startDate_Format;
    public String endDate_Format;

    public BasePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 30);
        cal = Calendar.getInstance();
    }

    public void pageReload() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            webDriver.navigate().refresh();
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
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

    public void navigateToKbAdmin() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkKnowledgebase);
            clickAfterVisibilityOfElement(lnkAdministration);
            clickAfterVisibilityOfElement(lnkKnowledgebaseAdmin);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void navigateToKbAnalytics() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkKnowledgebase);
            clickAfterVisibilityOfElement(lnkAnalytics);
            clickAfterVisibilityOfElement(lnkKnowledgebaseAnalytics);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void switchAnotherTab() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Set<String> handles = webDriver.getWindowHandles();
            for (String actual : handles) {
                if (!actual.equals(currentTab)) { //switching to the opened tab
                    webDriver.switchTo().window(actual); //opening the URL saved.
                }
            }
            Reporter.log("Switch to another tab successfully");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void ContentWebServiceUATURL(WebDriver webDriver) {
        webDriver.get(ConfigReader.getProperty("uatcontenturl"));
        WebDriverWait wait = new WebDriverWait(webDriver, 220);
    }

    public void EnwisenWebServiceUATURL(WebDriver webDriver) {
        webDriver.get(ConfigReader.getProperty("uatenwisenurl"));
        WebDriverWait wait = new WebDriverWait(webDriver, 220);
    }

    public static String extractInt(String str) {
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        if (str.equals(""))
            return "-1";
        return str;
    }

    public void navigateDefaultTab() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            webDriver.switchTo().window(currentTab);
            webDriver.switchTo().defaultContent();
            Reporter.log("Navigate to main tab Successfully");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void backButton() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            webDriver.navigate().back();
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void openDuplicateTab() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            currentTab = webDriver.getWindowHandle();
            String currentUrl = webDriver.getCurrentUrl();
            String link = String.format("window.open('%s','_blank');", currentUrl);
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript(link);
            Reporter.log("Duplicate Tab open successfully");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }

    }

    public void navigateAnotherOpenedTab() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            currentTab = webDriver.getWindowHandle();

            Set<String> s = webDriver.getWindowHandles();
            Iterator<String> I1 = s.iterator();
            while (I1.hasNext()) {
                String child_window = I1.next();
                if (!currentTab.equals(child_window)) {
                    webDriver.switchTo().window(child_window);
                    Reporter.log("Switched to child window.");
                }
            }
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void clickAfterVisibilityOfElement(WebElement element) {
        getElement(element).click();
    }

    public void clearAfterVisibilityOfElement(WebElement element) {
        getElement(element).clear();
    }

    private WebElement getElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void moveToElement(WebElement element) {
        Actions action = new Actions(webDriver);
        action.moveToElement(element).build().perform();
    }

    public void clickAndHold(WebElement element) {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(element).clickAndHold(element).build().perform();
    }

    public boolean isElementPresent(WebElement element) {
        boolean isElementPresent;
        try {
            isElementPresent = element.isDisplayed();
            return isElementPresent;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isElementPresent(String xpath) {
        boolean isElementPresent;
        try {
            isElementPresent = webDriver.findElement(By.xpath(xpath)).isDisplayed();
            return isElementPresent;
        } catch (Exception e) {
            return false;
        }
    }

    public void ScreenPrints(WebDriver webDriver) throws IOException {
        Date d = new Date();
        System.out.println(d.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\Screenshots\\" + sdf.format(d) + ".png"));
    }

    public void clickwhenready(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element != null) {
            element.click();
        } else {
            throw new ElementNotVisibleException("Element not found");
        }
    }

    public String getTodayDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        return dateFormat.format(date).trim();
    }

    public void signOutUser() {
        clickAndHold(btnUserName);
        clickAfterVisibilityOfElement(btnSignOut);
    }

    public boolean compareList(List<String> listOne, List<String> listTwo) {
        Collections.sort(listOne);
        Collections.sort(listTwo);
        return listOne.containsAll(listTwo);
    }

    public void getLastDayOfCurrentMonth() throws ParseException {

        String endDate = txtEndDate.getAttribute("value");
        Date date = new SimpleDateFormat("M/d/yyyy").parse(endDate);
        SimpleDateFormat formatter = new SimpleDateFormat("M/d/yyyy");
        endDate_Format = formatter.format(date);


    }

    public void getFirstDateOfCurrentMonth() throws ParseException {


        String startDate = txtStartDate.getAttribute("value");
        System.out.println(startDate);
        Date date = new SimpleDateFormat("M/d/yyyy").parse(startDate);
        SimpleDateFormat formatter = new SimpleDateFormat("M/d/yyyy");
        startDate_Format = formatter.format(date);
        System.out.println(startDate_Format);


    }

    public void appliedDateRangeFilter(String analyticsstartdate, String analyticsenddate) throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(radioDateRange);
            txtStartDate.clear();
            Thread.sleep(1000);
            txtStartDate.sendKeys(analyticsstartdate);
            txtEndDate.clear();
            Thread.sleep(1000);
            txtEndDate.sendKeys(analyticsenddate);
            inputSearchTerm.clear();
            clickAfterVisibilityOfElement(btnApply);
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void appliedClearDateRangeFilter() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(radioDateRange);
            txtStartDate.clear();
            Thread.sleep(1000);
            txtEndDate.clear();
            Thread.sleep(1000);
            clickAfterVisibilityOfElement(btnApply);
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

    public void appliedFilter() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(selectAllCheckBox);
            clickAfterVisibilityOfElement(btnApply);
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(filterIcon);
            String filterText = filterCount.getText();
            String[] count = filterText.split("\\s");
            Assert.assertTrue(Integer.parseInt(count[0]) > 1, "Filter count is not greater than 1");
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
            Assert.assertTrue(groupTitleOnGroupGrid.isDisplayed(), "Group Title on Group Grid is not present.");
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

    public void validateBlankGridExport() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(exportIcon);
            clickAfterVisibilityOfElement(exportButtonFifthTime);
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(txtProcessingError.getText(), ConfigReader.getProperty("processingErrorforgrid"));
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

    public void FrameToBeAvailableAndSwitchToIt(WebDriver webDriver,String framename){
        if(framename.contains(","))
        {
            String[] strframename = framename.split(",");
            for(int i=0;i<strframename.length;i++)
            {
                if(i==0)
                {
                    webDriver.switchTo().defaultContent();
                    webDriver.switchTo().frame(strframename[i]);
                }
            }
        }
        else {
            webDriver.switchTo().defaultContent();
            webDriver.switchTo().frame(framename);
        }

    }

}

