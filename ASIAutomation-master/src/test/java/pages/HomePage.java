package pages;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.Assertion;
import util.Constants;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'x-container') and contains(@class,'Widget')]")
    private WebElement getWidgetCountHomePage;

    @FindBy(xpath = "//div[@id='PageHeaderBreadcrumb-targetEl']//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-btn-no-text']")
    private WebElement btnHamburgIconHomePage;

    @FindBy(xpath = "//span[text()='Set up Home Page']")
    private WebElement btnSetUpHomePage;

    @FindBy(xpath = "//span[@class='x-grid-checkcolumn x-grid-checkcolumn-checked']")
    private WebElement getSelectedWidgetCountSetUpHomePage;

    @FindBy(xpath = "//span[text()='Update']")
    private WebElement btnUpdate;

    @FindBy(xpath = "//div[text()='Tools']")
    private WebElement toolsWidgetSetupHomePage;

    @FindBy(xpath = "//div[text()='Tools']//..//..//td[2]//span")
    private WebElement toolsWidgetCheckbox;

    @FindBy(xpath = "//span[text()='Tools']")
    private WebElement toolsWidgetOnHomePage;

    @FindBy(xpath = "//div[text()='Announcements']")
    private WebElement announcementWidgetSetupHomePage;

    @FindBy(xpath = "//*[text()='Announcements']")
    private WebElement announcementWidgetOnHomePage;

    @FindBy(xpath = "//div[text()='Announcements']//..//..//td[2]//span")
    private WebElement announcementWidgetCheckbox;

    @FindBy(xpath = "//div[text()='Bulletins']")
    private WebElement bulletinsWidgetSetupHomePage;

    @FindBy(xpath = "//*[text()='Bulletins']")
    private WebElement bulletinsWidgetOnHomePage;

    @FindBy(xpath = "//div[text()='Bulletins']//..//..//td[2]//span")
    private WebElement bulletinsWidgetCheckbox;

    @FindBy(xpath = "//a[text()='Utilities']")
    private WebElement lnkUtilitiesLinkToolsWidget;

    @FindBy(xpath = "//iframe[@class='x-component x-fit-item x-component-default']")
    private WebElement frameUtilitiesMenu;

    @FindBy(xpath = "//div[@class='x-grid-group-title']")
    private WebElement utilitiesMenuTitle;

    @FindBy(xpath = "//span[@class='x-btn-inner x-btn-inner-plain-toolbar-small']")
    private WebElement lnkHome;

    @FindBy(xpath = "//div[text()='Locale Selection']")
    private WebElement localeSelectionWidgetSetupHomePage;

    @FindBy(xpath = "//div[text()='Locale Selection']//..//..//td[2]//span")
    private WebElement localeSelectionWidgetCheckbox;

    @FindBy(xpath = "//p[text()='Locale Selection']")
    private WebElement localeSelectionWidgetOnHomePage;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public List<WebElement> widgetOnHomePage() {
        return webDriver.findElements(By.xpath("//div[contains(@class,'x-container') and contains(@class,'Widget')]"));
    }

    public List<String> widgetTitleOnHomePage() {
        List<String> a = webDriver.findElements(By.xpath("//*[contains(@class,'WidgetTitle')]")).stream().map(WebElement::getText).collect(Collectors.toList());
        a.addAll(webDriver.findElements(By.xpath("//*[@class='x-toolbar-text cls-title x-box-item x-toolbar-item x-toolbar-text-default']")).stream().map(WebElement::getText).collect(Collectors.toList()));
        if (toolsWidgetOnHomePage.isDisplayed()) {
            a.add("Tools");
        }
        return a;
    }

    public List<String> widgetTitleOnSetUpHomePage() {
        return webDriver.findElements(By.xpath("//div[contains(@class,'x-grid-checkcolumn-cell-inner')]//..//..//td[1]//div")).stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public void navigateToSetUpHomePage() {
        waitForLoadingIconToBeDisappeared();
        clickAfterVisibilityOfElement(btnHamburgIconHomePage);
        clickAfterVisibilityOfElement(btnSetUpHomePage);
    }

    public List<WebElement> getCheckedWidgetOnSetUpHomePage() {
        return webDriver.findElements(By.xpath("//span[@class='x-grid-checkcolumn x-grid-checkcolumn-checked']"));
    }

    /**
     * Validate Checked Widget count with Home page and Set up home page widget.
     */
    public void validateCountHomepageWidgetWithSetUpHomePage() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Thread.sleep(12000);
            int countHomePage = widgetOnHomePage().size();
            navigateToSetUpHomePage();
            int countSetUpHomePage = getCheckedWidgetOnSetUpHomePage().size();
            Assert.assertEquals(countHomePage, countSetUpHomePage);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }


    /**
     * Unchecked All checked widget on Setup Home page
     */
    public void unCheckedAllCheckedWidget() throws InterruptedException {
        List<WebElement> checkedWidgetElements = getCheckedWidgetOnSetUpHomePage();
        for (WebElement checkedWidgetElement : checkedWidgetElements) {
            checkedWidgetElement.click();
        }
        clickAfterVisibilityOfElement(btnUpdate);

    }

    /**
     * get all unchecked widget and Checked all
     */
    public void
    getUnCheckedAllWidget() throws InterruptedException {
        List<WebElement> uncheckedWidgetElements = webDriver.findElements(By.xpath("//span[@class='x-grid-checkcolumn']"));
        for (WebElement uncheckedWidgetElement : uncheckedWidgetElements) {
            uncheckedWidgetElement.click();
        }
        clickAfterVisibilityOfElement(btnUpdate);

        waitForLoadingIconToBeDisappeared();
    }

    public void verifiedWidgetTitle() {
        waitForLoadingIconToBeDisappeared();
        List<String> widgetTitleOnHomePage = widgetTitleOnHomePage();
        System.out.println(widgetTitleOnHomePage.toString());
        navigateToSetUpHomePage();
        List<String> widgetTitleOnSetUpHomePage = widgetTitleOnSetUpHomePage();
        System.out.println(widgetTitleOnSetUpHomePage.toString());
        // Assert.assertEquals(widgetTitleOnHomePage,widgetTitleOnSetUpHomePage);
        //  Assert.assertTrue( compareList(widgetTitleOnHomePage,widgetTitleOnSetUpHomePage),"Widget title is not matched on Homepage and SetupHomePage");
    }


    /**
     * EWRD-990, EWRD-1096
     */
    public void toolsWidgetComparison() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertTrue(isElementPresent(toolsWidgetSetupHomePage), "Tools Widget should not present on Setup Home Page.");
            Reporter.log("Tools widget present on Set up Home page.");
            if (!StringUtils.contains(toolsWidgetCheckbox.getAttribute("class"), "x-grid-checkcolumn-checked")) {
                clickAfterVisibilityOfElement(toolsWidgetCheckbox);
            }
            clickAfterVisibilityOfElement(btnUpdate);
            Thread.sleep(3000);
            waitForLoadingIconToBeDisappeared();
            Assert.assertTrue(isElementPresent(toolsWidgetOnHomePage), "Tools widget should not present on Home Page.");
            Reporter.log("Tools Widget present on Home page.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    /**
     * EWRD-1004
     */
    public void toolsWidgetFunctionality() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkUtilitiesLinkToolsWidget);
            waitForLoadingIconToBeDisappeared();
            webDriver.switchTo().frame(frameUtilitiesMenu);
            Assert.assertEquals("Utilities", utilitiesMenuTitle.getText(), "Utitles menu should not open properly.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    /**
     * EWRD-1235 and EWRD-1356
     */
    public void localeSelectionWidgetComparison() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Thread.sleep(5000);
            Assert.assertTrue(isElementPresent(localeSelectionWidgetSetupHomePage), "Tools Widget should not present on Setup Home Page.");
            Reporter.log("Tools widget present on Set up Home page.");
            if (!StringUtils.contains(localeSelectionWidgetCheckbox.getAttribute("class"), "x-grid-checkcolumn-checked")) {
                clickAfterVisibilityOfElement(localeSelectionWidgetCheckbox);
            }
            clickAfterVisibilityOfElement(btnUpdate);
            waitForLoadingIconToBeDisappeared();
            Assert.assertTrue(isElementPresent(localeSelectionWidgetOnHomePage), "Locale Selection widget should not present on Home Page.");
            Reporter.log("Locale Selection Widget present on Home page.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void announcementWidgetComparison() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertTrue(isElementPresent(announcementWidgetSetupHomePage), "Tools Widget should not present on Setup Home Page.");
            Reporter.log("Tools widget present on Set up Home page.");
            if (!StringUtils.contains(announcementWidgetCheckbox.getAttribute("class"), "x-grid-checkcolumn-checked")) {
                clickAfterVisibilityOfElement(announcementWidgetCheckbox);
            }
            clickAfterVisibilityOfElement(btnUpdate);
            Thread.sleep(3000);
            waitForLoadingIconToBeDisappeared();
            Assert.assertTrue(isElementPresent(announcementWidgetOnHomePage), "Tools widget should not present on Home Page.");
            Reporter.log("Tools Widget present on Home page.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void announcementWidgetFunctionality(String postingName) {
        Assert.assertTrue(isElementPresent("//a[text()='" + postingName + "']"), "Posting: " + postingName + " is not present in Announcement widget.");
        webDriver.findElement(By.xpath("//a[text()='" + postingName + "']")).click();

    }

    public void bulletinsWidgetComparison() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertTrue(isElementPresent(bulletinsWidgetSetupHomePage), "Tools Widget should not present on Setup Home Page.");
            Reporter.log("Tools widget present on Set up Home page.");
            if (!StringUtils.contains(bulletinsWidgetCheckbox.getAttribute("class"), "x-grid-checkcolumn-checked")) {
                clickAfterVisibilityOfElement(bulletinsWidgetCheckbox);
            }
            clickAfterVisibilityOfElement(btnUpdate);
            Thread.sleep(3000);
            waitForLoadingIconToBeDisappeared();
            Assert.assertTrue(isElementPresent(bulletinsWidgetOnHomePage), "Tools widget should not present on Home Page.");
            Reporter.log("Tools Widget present on Home page.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void bulletinsWidgetFunctionality(String postingName, String message) {
        Assert.assertTrue(isElementPresent("//div[@class='wdg-bulletins-messagetitle-kb104' and contains(text(),'" +postingName + "')]"), "Posting: " + postingName + " is not present in Announcement widget.");
       Assert.assertEquals((webDriver.findElement(By.xpath("//div[@class='wdg-bulletins-messagetitle-kb104' and contains(text(),'" + postingName + "')]//span")).getText().split("-"))[1].trim(), message, "Posting message is not matched");


    }
}
