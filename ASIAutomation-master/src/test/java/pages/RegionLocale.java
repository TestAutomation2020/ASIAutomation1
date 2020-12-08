package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.IOException;

public class RegionLocale extends BasePage {

    @FindBy(xpath = "//span[text()='Localization']")
    private WebElement lnkLocalization;

    @FindBy(xpath = "//span[text()='Region Locales']")
    private WebElement lnkRegionLocales;

    @FindBy(xpath = "(//span[text()='Region Locales'])[2]")
    private WebElement txtRegionLocales;

    @FindBy(xpath = "(//input[@name='countrycode'])[2]")
    private WebElement dropdownCountry;

    @FindBy(xpath = "//li[text()='UNITED STATES(US)']")
    private WebElement selectUS;

    @FindBy(xpath = "(//input[@name='localecode'])[2]")
    private WebElement dropdownLocale;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement btnSave;

    @FindBy(xpath = "//div[text()='Added Successfully']")
    private WebElement notificationAddedSuccessfully;

    @FindBy(xpath = "//input[@name='countryname']")
    private WebElement dropdownCountryNameFilter;

    @FindBy(xpath = "//li[text()='UNITED STATES']")
    private WebElement selectUSFilter;

    @FindBy(xpath = "(//input[@name='localecode'])[1]")
    private WebElement dropdownLocaleFilter;

    @FindBy(xpath = "//li[text()='ru-RU' and @class='x-boundlist-item']")
    private WebElement selectRUFilter;

    @FindBy(xpath = "//a[text()='UNITED STATES']")
    private WebElement lnkUSGrid;

    @FindBy(xpath = "//a[text()='BRAZIL']")
    private WebElement lnkBrazilGrid;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner ' and text()='ru-RU'])[1]")
    private WebElement lnkRUGrid;

    @FindBy(xpath = "//span[@class='x-column-header-checkbox']")
    private WebElement checkCheckBox;

    @FindBy(xpath = "//span[@class='x-btn-inner x-btn-inner-default-toolbar-small' and text()='Delete']")
    private WebElement btnDelete;

    @FindBy(xpath = "//span[@class='x-btn-inner x-btn-inner-default-toolbar-small' and text()='Ok']")
    private WebElement btnOk;

    @FindBy(xpath = "//div[text()='Deleted Successfully']")
    private WebElement notificationDeletedSuccessfully;

    @FindBy(xpath = "//p[text()='Locale Selection']")
    private WebElement labelLocaleSelection;

    @FindBy(xpath = "//div[@class='WidgetLinks']//a[text()='Russian']")
    private WebElement lnkRussianOnHomePage;

    @FindBy(xpath = "//input[@id='PageHeaderSearchField-inputEl']")
    private WebElement inputSearchTextBox;

    @FindBy(xpath = "//div[@class='WidgetLinks']//a[text()='English']")
    private WebElement lnkEnglishOnHomePage;

    @FindBy(xpath = "//span[text()='UPDATE' and @class='x-btn-inner x-btn-inner-default-toolbar-small']")
    private WebElement btnUpdate;

    @FindBy(xpath = "//div[text()='Updated Successfully']")
    private WebElement notificationUpdatedSuccessfully;


    @FindBy(xpath = "//li[text()='BRAZIL(BR)' and @class='x-boundlist-item']")
    private WebElement selectBrazilCountry;

    @FindBy(xpath = "//li[text()='BRAZIL' and @class='x-boundlist-item']")
    private WebElement selectBrazilCountryFilter;


    public RegionLocale(WebDriver webDriver) {
        super(webDriver);
    }

    public void navigateToRegionLocale() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(lnkLocalization);
            clickAfterVisibilityOfElement(lnkRegionLocales);
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(txtRegionLocales.getText(), "Region Locales", "Region Locale screen is not opened.");
            Reporter.log("Region Locale screen opened.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void addRegionLocale() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(dropdownCountry);
            clickAfterVisibilityOfElement(selectUS);
            clickAfterVisibilityOfElement(dropdownLocale);
            clickAfterVisibilityOfElement(selectRUFilter);
            clickAfterVisibilityOfElement(btnSave);
            Assert.assertEquals(notificationAddedSuccessfully.getText(), "Added Successfully", "Region Locale is not added successfully.");
            Reporter.log("Region Locale added successfully.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void filterApplied() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(dropdownCountryNameFilter);
            clickAfterVisibilityOfElement(selectUSFilter);
            clickAfterVisibilityOfElement(dropdownLocaleFilter);
            clickAfterVisibilityOfElement(selectRUFilter);
            dropdownLocaleFilter.sendKeys(Keys.ENTER);
            waitForLoadingIconToBeDisappeared();
            Reporter.log("Filter Applied successfully.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifiedAppliedFilter() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(lnkUSGrid.getText(), "UNITED STATES", "Filter is not applied. Grid is not present.");
            Assert.assertEquals(lnkRUGrid.getText(), "ru-RU", "Ru-ru is not present in grid.");
            Reporter.log("Applied Filter verified.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void deleteUSRegionLocale() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            if (isElementPresent(lnkUSGrid)) {
                deleteRegionLocale();
            } else {
                Reporter.log("Region locale is not present in Grid.");
            }
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void deleteRegionLocale() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(checkCheckBox);
            clickAfterVisibilityOfElement(btnDelete);
            clickAfterVisibilityOfElement(btnOk);
            Assert.assertEquals(notificationDeletedSuccessfully.getText(), "Deleted Successfully", "Posting is not delete successfully.");
            Reporter.log("Region Locale is deleted successfully.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifiedLocaleSelection() throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Thread.sleep(6000);
            Assert.assertEquals(labelLocaleSelection.getText(), "Locale Selection", "Locale Selection label present on Home Page.");
            clickAfterVisibilityOfElement(lnkRussianOnHomePage);
            Reporter.log("Russian link clicked on Locale selection widget.");
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(inputSearchTextBox.getAttribute("placeholder"),"Поиск","Search Text box related placeholder matched.");
            waitForLoadingIconToBeDisappeared();
            Thread.sleep(2000);
            clickAfterVisibilityOfElement(lnkEnglishOnHomePage);
            Reporter.log("English link clicked on Locale selection widget.");

        } catch (InterruptedException e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }

    }

    public void updateRegionLocale() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(dropdownCountry);
            clickAfterVisibilityOfElement(selectBrazilCountry);
            clickAfterVisibilityOfElement(btnUpdate);
            Assert.assertEquals(notificationUpdatedSuccessfully.getText(), "Updated Successfully", "Region Locale is not Updated successfully.");
            Reporter.log("Region Locale updated successfully.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void verifiedUpdatedRegionLocale() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(dropdownCountryNameFilter);
            clickAfterVisibilityOfElement(selectBrazilCountryFilter);
            dropdownCountryNameFilter.sendKeys(Keys.ENTER);
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(lnkBrazilGrid.getText(),"BRAZIL","BRAZIL is not present in Grid.");
            Reporter.log("Verified Region locale updated.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }

    }

}
