package pages;


import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import util.ConfigReader;
import util.Constants;

public class Posting extends BasePage {

    @FindBy(xpath = "//span[contains(@class,'x-tree-node-text')][contains(text(),'Postings')]")
    private WebElement postingsMenu;

    @FindBy(xpath = "(//span[text()='Postings'])[2]")
    private WebElement postings;

    @FindBy(xpath = "//div[@class='x-toolbar-text cls-title x-box-item x-toolbar-item x-toolbar-text-default']//span[text()='Postings']")
    private WebElement validatePosting;

    @FindBy(xpath = "//span[text()='Add New']")
    private WebElement btnAddNew;

    @FindBy(xpath = "//input[@value='File' and @name='patterntype']")
    private WebElement drpSelectType;

    @FindBy(xpath = "//li[text()='Message']")
    private WebElement selectMessage;

    @FindBy(xpath = "//li[text()='Link']")
    private WebElement selectLink;

    @FindBy(xpath = "(//div[@class='x-btn x-form-file-btn x-unselectable x-btn-default-small'])[1]")
    private WebElement btnFile;

    @FindBy(xpath = "(//div[@class='x-btn x-form-file-btn x-unselectable x-btn-default-small'])[2]")
    private WebElement btnUpdateFile;

    @FindBy(xpath = "//input[@name='patternname']")
    private WebElement txtTitle;

    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement txtMessage;

    @FindBy(xpath = "//span[text()='Upload to Live']/../../../div/div/label")
    private WebElement switchUploadToLive;

    @FindBy(xpath = "//span[text()= 'Next']")
    private WebElement btnNext;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement btnSave;

    @FindBy(xpath = "//span[text()='Update']")
    private WebElement btnUpdate;

    @FindBy(xpath = "//div[text()='Added Successfully']")
    private WebElement notificationAddedSuccessfully;

    @FindBy(xpath = "//div[text()='Updated Successfully']")
    private WebElement notificationUpdatedSuccessfully;

    @FindBy(xpath = "//div[text()='Deleted Successfully']")
    private WebElement notificationDeletedSuccessfully;

    @FindBy(xpath = "//input[@id='PageHeaderSearchField-inputEl']")
    private WebElement txtSearchbar;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner ']/h4/b/a)[1]")
    private WebElement lnkSearchedDocument;

    @FindBy(xpath = "(//a[@class='x-tree-node-text  cls-treecolumn-link-item'])[1]")
    private WebElement labelAllResults;

    @FindBy(xpath = "//a[@class='x-btn list-page-arrow list-page-prev x-unselectable x-box-item x-toolbar-item x-btn-plain-toolbar-small x-btn-no-text x-item-disabled x-btn-disabled']")
    private WebElement searchResultPagination;

    @FindBy(xpath = "//div[@role='columnheader' and .//span[text()='Title']]//input")
//    @FindBy(xpath = "(//div[@class='x-form-text-wrap x-form-text-wrap-default'])[1]//input")
    private WebElement txtTitleFilter;

    @FindBy(xpath = "(//div[@class='x-form-text-wrap x-form-text-wrap-default'])[1]//input")
    private WebElement txtTitleFilter1;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner ']/a)[1]")
    private WebElement lnkPostingGrid;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner x-grid-checkcolumn-cell-inner'])[1]")
    private WebElement checkboxPostingGrid;

    @FindBy(xpath = "//span[@class='x-btn-inner x-btn-inner-default-toolbar-small' and text()='Delete']")
    private WebElement btnDelete;

    @FindBy(xpath = "//span[text()='Ok']")
    private WebElement btnDeleteOk;

    public Posting(WebDriver webDriver) {
        super(webDriver);
    }

    public void navigateToPostingMenu() {
        clickAfterVisibilityOfElement(postingsMenu);
        clickAfterVisibilityOfElement(postings);
    }

    public void validatePostingScreen() {
        Assert.assertEquals(validatePosting.getText(), "Postings", "Verification of Posting screen open.");
    }

    public void addMessagePosting() {
        clickAfterVisibilityOfElement(btnAddNew);
        clickAfterVisibilityOfElement(drpSelectType);
        clickAfterVisibilityOfElement(selectMessage);

        txtTitle.sendKeys(Constants.postingTitle);
        txtMessage.sendKeys(ConfigReader.getProperty("messagepostingmessage"));
        if (shouldUploadToLive()) {
            clickAfterVisibilityOfElement(switchUploadToLive);
        }
        clickAfterVisibilityOfElement(btnNext);
        clickAfterVisibilityOfElement(btnSave);

    }


    public void searchPosting(String postingName) {
        clearAfterVisibilityOfElement(txtSearchbar);
        waitForLoadingIconToBeDisappeared();
        txtSearchbar.sendKeys(postingName);
        txtSearchbar.sendKeys(Keys.ENTER);
    }

    public void validateSearchedPosting(String postingName) {
        String txtAllResult = labelAllResults.getText();
        int searchResultCount = Integer.parseInt(StringUtils.substringBetween(txtAllResult, "(", ")"));
        Assert.assertTrue(searchResultCount > 0, "Verification of Search Result");
        Assert.assertTrue(searchResultPagination.isDisplayed(), "Verification of Pagination");
        Assert.assertEquals(postingName, lnkSearchedDocument.getText(), "Verification of Searched posting");
    }

    public void openSearchedPosting() {
        clickAfterVisibilityOfElement(lnkSearchedDocument);
    }

    public void filterPosting(String postingName) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(txtTitleFilter));
//        clearAfterVisibilityOfElement(txtTitleFilter);
//         JavascriptExecutor js = (JavascriptExecutor) webDriver;
//         js.executeScript("arguments[0].value=arguments[1]",txtTitleFilter,postingName);
        txtTitleFilter.clear();
        txtTitleFilter.sendKeys(postingName);
        txtTitleFilter.sendKeys(Keys.ENTER);
        waitForLoadingIconToBeDisappeared();
        Assert.assertEquals(postingName, lnkPostingGrid.getText(), "Verification of Filter applied successfully");
    }

    public void updatePosting() {
        clickAfterVisibilityOfElement(lnkPostingGrid);
        waitForLoadingIconToBeDisappeared();
        clearAfterVisibilityOfElement(txtTitle);
        txtTitle.sendKeys(Constants.UpdateTitle);
        clickAfterVisibilityOfElement(btnUpdate);
    }

    public void deletePosting() {
        clickAfterVisibilityOfElement(checkboxPostingGrid);
        clickAfterVisibilityOfElement(btnDelete);
        clickAfterVisibilityOfElement(btnDeleteOk);
        validatePostingDeleted();
    }

    public void validatePostingAdded() {
        Assert.assertEquals(notificationAddedSuccessfully.getText(), "Added Successfully", "Verification of Posting added.");
    }

    public void validatePostingUpdated() {
        Assert.assertEquals(notificationUpdatedSuccessfully.getText(), "Updated Successfully", "Verification of Posting updated.");
    }

    public void validatePostingDeleted() {
        Assert.assertEquals(notificationDeletedSuccessfully.getText(), "Deleted Successfully", "Verification of Posting deleted.");
    }

    private boolean shouldUploadToLive() {
        return ConfigReader.getProperty("uploadtolive").equalsIgnoreCase(Constants.KEYWORD_YES);
    }


}
