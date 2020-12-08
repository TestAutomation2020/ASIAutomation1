package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import util.ConfigReader;

import java.io.IOException;

public class FederatedSearch extends BasePage {

    @FindBy(xpath = "//span[text()='Settings']")
    private WebElement lnkSettings;

    @FindBy(xpath = "//span[text()='Federated Search']")
    private WebElement lnkFederatedSearch;

    @FindBy(xpath = "//div[@class='x-toolbar-text cls-title x-box-item x-toolbar-item x-toolbar-text-default']//span[text()='Federated Search']")
    private WebElement labelFederatedSearch;

    @FindBy(xpath = "//span[text()='Add New']")
    private WebElement btnAddNew;

    @FindBy(xpath = "//input[@name='sourceid']")
    private WebElement inputSourceID;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputDisplayLabel;

    @FindBy(xpath = "//input[@name='url']")
    private WebElement inputUrl;

    @FindBy(xpath = "//input[@name='method']")
    private WebElement inputMethod;

    @FindBy(xpath = "//li[text()='GET']")
    private WebElement dropdownGET;

    @FindBy(xpath = "//li[text()='POST']")
    private WebElement dropdownPost;

    @FindBy(xpath = "//input[@name='searchparam']")
    private WebElement inputSearchParameter;

    @FindBy(xpath = "//input[@name='addlparam']")
    private WebElement inputAdditionalParameter;

    @FindBy(xpath = "//input[@name='sourcedescription']")
    private WebElement inputTooltip;

    @FindBy(xpath = "//input[@name='searchservice']")
    private WebElement inputSearchService;

    @FindBy(xpath = "//li[text()='SharePoint']")
    private WebElement dropdownSharePointService;

    @FindBy(xpath = "//li[text()='MOSS']")
    private WebElement dropdownMOSSService;

    @FindBy(xpath = "//input[@name='ord']")
    private WebElement inputRank;

    @FindBy(xpath = "//label[@data-ref='boxLabelEl']")
    private WebElement switchSearchIDEnabled;

    @FindBy(xpath = "(//span[text()='Save' and @class='x-btn-inner x-btn-inner-default-toolbar-small'])[1]")
    private WebElement btnSave;

    @FindBy(xpath = "(//span[text()='Update'])[1]")
    private WebElement btnUpdate;

    @FindBy(xpath = "//div[text()='Added Successfully']")
    private WebElement notificationAddedSuccessfully;

    @FindBy(xpath = "//div[text()='Updated Successfully']")
    private WebElement notificationUpdatedSuccessfully;

    @FindBy(xpath = "//div[text()='Deleted Successfully']")
    private WebElement notificationDeletedSuccessfully;

    @FindBy(xpath = "//a[text()='FederatedSearchParameter']")
    private WebElement lnkGridFederatedSearch;

    @FindBy(xpath = "//span[text()='Federated Search Properties']")
    private WebElement dropdownFederatedSearchProperties;

    @FindBy(xpath = "//a[@class='x-menu-item-link cls-has-icon']//span[text()='Groups']")
    private WebElement dropdownGroup;

    @FindBy(xpath = "(//span[@class='x-grid-checkcolumn'])[1]")
    private WebElement checkbox;

    @FindBy(xpath = "(//span[@data-ref='btnWrap']//span[text()='Update'])[2]")
    private WebElement btnUpdateGroup;

    @FindBy(xpath = "//span[text()='Locale']")
    private WebElement dropdownLocale;

    @FindBy(xpath = "//a[text()='English(United States)']")
    private WebElement lnkEnglishLocale;

    @FindBy(xpath = "(//input[@name='name'])[2]")
    private WebElement inputSourceName;

    @FindBy(xpath = "(//input[@name='sourcedescription'])[2]")
    private WebElement inputSourceTooltip;

    @FindBy(xpath = "(//span[text()='Save'])[2]")
    private WebElement btnLocaleSave;

    @FindBy(xpath = "(//span[text()='Update'])[3]")
    private WebElement btnLocaleUpdate;

    @FindBy(xpath = "(//span[text()='Delete'])[2]")
    private WebElement btnLocaleDelete;

    @FindBy(xpath = "//div[@class='x-form-display-field x-form-display-field-default']")
    private WebElement txtLocaleDelete;

    @FindBy(xpath = "//span[text()='Details']")
    private WebElement dropdownDetails;

    @FindBy(xpath = "(//span[text()='Delete'])[1]")
    private WebElement btnFederatedSearchDelete;

    @FindBy(xpath = "(//span[text()='Ok'])[1]")
    private WebElement btnLocaleOk;
    @FindBy(xpath = "(//span[text()='Ok'])[2]")
    private WebElement btnOk;

    public FederatedSearch(WebDriver webDriver) {
        super(webDriver);
    }

    public void navigateToFederatedSearch() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkSettings);
            clickAfterVisibilityOfElement(lnkFederatedSearch);
            Assert.assertEquals(labelFederatedSearch.getText(), "Federated Search", "Federated Search screen is not loaded.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void addFederatedSearch() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(btnAddNew);
            inputSourceID.sendKeys(ConfigReader.getProperty("federatedsearch"));
            inputDisplayLabel.sendKeys(ConfigReader.getProperty("federatedsearch"));
            inputUrl.sendKeys(ConfigReader.getProperty("url"));
            clickAfterVisibilityOfElement(inputMethod);
            clickAfterVisibilityOfElement(dropdownGET);
            inputSearchParameter.sendKeys(ConfigReader.getProperty("federatedsearch"));
            inputAdditionalParameter.sendKeys(ConfigReader.getProperty("federatedsearch"));
            inputTooltip.sendKeys(ConfigReader.getProperty("federatedsearch"));
            clickAfterVisibilityOfElement(inputSearchService);
            clickAfterVisibilityOfElement(dropdownSharePointService);
            inputRank.sendKeys(ConfigReader.getProperty("federatedsearchrank"));
            clickAfterVisibilityOfElement(switchSearchIDEnabled);
            clickAfterVisibilityOfElement(btnSave);
            Assert.assertEquals(notificationAddedSuccessfully.getText(), "Added Successfully", "Federated Search is not added successfully.");
            Reporter.log("Federated Search added successfully.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifiedAddedFederatedSearch() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            webDriver.findElement(By.xpath("//a[text()='"+ConfigReader.getProperty("federatedsearch")+"']")).click();
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(inputSourceID.getAttribute("value"),ConfigReader.getProperty("federatedsearch"),"Source ID is not matched.");
            Reporter.log("Source ID is verified.");
            Assert.assertEquals(inputDisplayLabel.getAttribute("value"),ConfigReader.getProperty("federatedsearch"),"Display Label is not matched.");
            Reporter.log("Display Label is verified.");
            Assert.assertEquals(inputUrl.getAttribute("value"),ConfigReader.getProperty("url"),"URL is not matched.");
            Reporter.log("URL is verified.");
            Assert.assertEquals(inputMethod.getAttribute("value"),"GET","Method is not matched.");
            Reporter.log("Method is verified.");
            Assert.assertEquals(inputSearchParameter.getAttribute("value"),ConfigReader.getProperty("federatedsearch"),"Source Parameter is not matched.");
            Reporter.log("Source Parameter is verified.");
            Assert.assertEquals(inputAdditionalParameter.getAttribute("value"),ConfigReader.getProperty("federatedsearch"),"Additional Parameter is not matched.");
            Reporter.log("Additional Parameter is verified.");
            Assert.assertEquals(inputTooltip.getAttribute("value"),ConfigReader.getProperty("federatedsearch"),"Tooltip is not matched.");
            Reporter.log("Tooltip is verified.");
            Assert.assertEquals(inputSearchService.getAttribute("value"),"SharePoint","Search Service is not matched.");
            Reporter.log("Search Service is verified.");
            Assert.assertEquals(inputRank.getAttribute("value"),ConfigReader.getProperty("federatedsearchrank"),"Rank is not matched.");
            Reporter.log("Rank is verified.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void updateFederatedSearch() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            inputSourceID.sendKeys(ConfigReader.getProperty("updatefederatedsearch"));
            inputDisplayLabel.sendKeys(ConfigReader.getProperty("updatefederatedsearch"));
            inputUrl.clear();
            inputUrl.sendKeys(ConfigReader.getProperty("uatcontenturl"));
            clickAfterVisibilityOfElement(inputMethod);
            clickAfterVisibilityOfElement(dropdownPost);
            inputSearchParameter.sendKeys(ConfigReader.getProperty("updatefederatedsearch"));
            inputAdditionalParameter.sendKeys(ConfigReader.getProperty("updatefederatedsearch"));
            inputTooltip.sendKeys(ConfigReader.getProperty("updatefederatedsearch"));
            clickAfterVisibilityOfElement(inputSearchService);
            clickAfterVisibilityOfElement(dropdownMOSSService);
            inputRank.clear();
            inputRank.sendKeys(ConfigReader.getProperty("updatefederatedsearchrank"));
            clickAfterVisibilityOfElement(switchSearchIDEnabled);
            clickAfterVisibilityOfElement(btnUpdate);
            Assert.assertEquals(notificationUpdatedSuccessfully.getText(), "Updated Successfully", "Federated Search is not Updated successfully.");
            Reporter.log("Federated Search updated successfully.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }

    }
    public void verifiedUpdatedFederatedSearch() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            webDriver.findElement(By.xpath("//a[text()='"+ConfigReader.getProperty("federatedsearch")+ConfigReader.getProperty("updatefederatedsearch")+"']")).click();
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(inputSourceID.getAttribute("value"),ConfigReader.getProperty("federatedsearch")+ConfigReader.getProperty("updatefederatedsearch"),"Source ID is not matched.");
            Reporter.log("Source ID is verified.");
            Assert.assertEquals(inputDisplayLabel.getAttribute("value"),ConfigReader.getProperty("federatedsearch")+ConfigReader.getProperty("updatefederatedsearch"),"Display Label is not matched.");
            Reporter.log("Display Label is verified.");
            Assert.assertEquals(inputUrl.getAttribute("value"),ConfigReader.getProperty("uatcontenturl"),"URL is not matched.");
            Reporter.log("URL is verified.");
            Assert.assertEquals(inputMethod.getAttribute("value"),"POST","Method is not matched.");
            Reporter.log("Method is verified.");
            Assert.assertEquals(inputSearchParameter.getAttribute("value"),ConfigReader.getProperty("federatedsearch")+ConfigReader.getProperty("updatefederatedsearch"),"Source Parameter is not matched.");
            Reporter.log("Source Parameter is verified.");
            Assert.assertEquals(inputAdditionalParameter.getAttribute("value"),ConfigReader.getProperty("federatedsearch")+ConfigReader.getProperty("updatefederatedsearch"),"Additional Parameter is not matched.");
            Reporter.log("Additional Parameter is verified.");
            Assert.assertEquals(inputTooltip.getAttribute("value"),ConfigReader.getProperty("federatedsearch")+ConfigReader.getProperty("updatefederatedsearch"),"Tooltip is not matched.");
            Reporter.log("Tooltip is verified.");
            Assert.assertEquals(inputSearchService.getAttribute("value"),"MOSS","Search Service is not matched.");
            Reporter.log("Search Service is verified.");
            Assert.assertEquals(inputRank.getAttribute("value"),ConfigReader.getProperty("updatefederatedsearchrank"),"Rank is not matched.");
            Reporter.log("Rank is verified.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void federatedSearchGroupProperty() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(dropdownFederatedSearchProperties);
            clickAfterVisibilityOfElement(dropdownGroup);
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(checkbox);
            clickAfterVisibilityOfElement(btnUpdateGroup);
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(webDriver.findElement(By.xpath("//a[text()='"+ConfigReader.getProperty("federatedsearch")+ConfigReader.getProperty("updatefederatedsearch")
                    +"']//..//..//..//td[2]//a" )).getText(),"1 Group", "Group is not updated.");
            Reporter.log("Group updated verified.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }

    }

    public void federatedSearchLocaleProperty() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(dropdownFederatedSearchProperties);
            clickAfterVisibilityOfElement(dropdownLocale);
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(lnkEnglishLocale);
            waitForLoadingIconToBeDisappeared();
            inputSourceName.sendKeys(ConfigReader.getProperty("federatedsearch"));
            inputSourceTooltip.sendKeys(ConfigReader.getProperty("federatedsearch"));
            clickAfterVisibilityOfElement(btnLocaleSave);
            Assert.assertEquals(notificationAddedSuccessfully.getText(), "Added Successfully", "Federated Search Locale is not added successfully.");
            Reporter.log("Federated Search Locale added successfully.");
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(lnkEnglishLocale);
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(inputSourceName.getAttribute("value"),ConfigReader.getProperty("federatedsearch"),"Locale Source Name is not matched.");
            Reporter.log("Locale Source Name is matched.");
            Assert.assertEquals(inputSourceTooltip.getAttribute("value"),ConfigReader.getProperty("federatedsearch"),"Locale Source Tooltip is not matched.");
            Reporter.log("Locale Source Tooltip is matched.");
            inputSourceName.sendKeys(ConfigReader.getProperty("updatefederatedsearch"));
            inputSourceTooltip.sendKeys(ConfigReader.getProperty("updatefederatedsearch"));
            clickAfterVisibilityOfElement(btnLocaleUpdate);
            Assert.assertEquals(notificationUpdatedSuccessfully.getText(), "Updated Successfully", "Federated Search Locale is not Updated successfully.");
            Reporter.log("Federated Search Locale updated successfully.");
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(lnkEnglishLocale);
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(inputSourceName.getAttribute("value"),ConfigReader.getProperty("federatedsearch")+ConfigReader.getProperty("updatefederatedsearch"),"Locale Source Name is not matched.");
            Reporter.log("Locale Source Name is matched.");
            Assert.assertEquals(inputSourceTooltip.getAttribute("value"),ConfigReader.getProperty("federatedsearch")+ConfigReader.getProperty("updatefederatedsearch"),"Locale Source Tooltip is not matched.");
            Reporter.log("Locale Source Tooltip is matched.");
            clickAfterVisibilityOfElement(btnLocaleDelete);
            clickAfterVisibilityOfElement(btnLocaleOk);
            Assert.assertEquals(notificationDeletedSuccessfully.getText(), "Deleted Successfully", "Federated Search Locale is not delete successfully.");
            Reporter.log("Federated Search Locale deleted successfully.");
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(txtLocaleDelete.getText(),"Please click locale to Add/Update search source detail.","After Delete message is not display right side.");
            Reporter.log("After Delete, Right side message verified.");

        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void deleteFederatedSearch() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(dropdownFederatedSearchProperties);
            clickAfterVisibilityOfElement(dropdownDetails);
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(btnFederatedSearchDelete);
            clickAfterVisibilityOfElement(btnOk);
            Assert.assertEquals(notificationDeletedSuccessfully.getText(), "Deleted Successfully", "Federated Search is not delete successfully.");
            Reporter.log("Federated Search deleted successfully.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }

    }

}
