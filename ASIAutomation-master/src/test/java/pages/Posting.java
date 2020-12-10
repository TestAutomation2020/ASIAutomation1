package pages;


import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import util.ConfigReader;
import util.Constants;

import java.io.IOException;

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

    @FindBy(xpath = "//input[@name='patternpath']")
    private WebElement txtURL;

    @FindBy(xpath = "(//div[@class='x-btn x-form-file-btn x-unselectable x-btn-default-small'])[1]")
    private WebElement btnFileUpload;

    @FindBy(xpath = "(//div[@class='x-btn x-form-file-btn x-unselectable x-btn-default-small'])[2]")
    private WebElement btnFileUploadWhileUpdate;

    @FindBy(xpath = "//textarea[@name='aliasname']")
    private WebElement txtAliasName;

    @FindBy(xpath = "//span[text()='Upload to Live']/../../../div/div/label")
    private WebElement switchUploadToLive;

    @FindBy(xpath = "//span[text()='New Window']/../../../div/div/label")
    private WebElement switchNewWindow;

    @FindBy(xpath = "//span[text()='Exclude From Search']/../../../div/div/label")
    private WebElement switchExcludeFromSearch;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner '])[2]")
    private WebElement gridLocationOnPosting;

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

    @FindBy(xpath = "//div[text()=\"'mimetype.htm' file and 'text/plain' mime type is not supported\"]")
    private WebElement notificationMimePosting;

    @FindBy(xpath = "//div[text()='File exceeds the size limit. Use the CCT to upload the file.']")
    private WebElement notificationMoreThan10MBFilePosting;


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

    @FindBy(xpath = "//div[@class='x-grid-cell-inner ']//a[contains(text(),'Groups')]")
    private WebElement lnkGroupsInGrid;

    @FindBy(xpath = "//span[text()='Unassigned Groups']")
    private WebElement lnkUnAssignedGroups;

    @FindBy(xpath = "(//div[./span[text()='Group Name']]//..//..//..//..//input)[2]")
    private WebElement inputGroupName;

    @FindBy(xpath = "(//span[@class='x-column-header-checkbox'])[5]")
    private WebElement checkbox;

    @FindBy(xpath = "//span[text()='Assign']")
    private WebElement btnAssign;

    @FindBy(xpath = "//div[@class='x-grid-cell-inner ']/a[text()='View']")
    private WebElement btnView;

    @FindBy(xpath = "//div[@id='BulletinHeader']")
    private WebElement getMessagePostingTitle;

    @FindBy(xpath = "//textarea[@id='txtBulletinText']")
    private WebElement getMessagePostingText;

    @FindBy(xpath = "(//div[contains(text(),'Enwisen') and @class='x-grid-cell-inner '])[2]")
    private WebElement txtEnwisenGroup;

    @FindBy(xpath = "//input[@name='patternType']")
    private WebElement inputTypeFilter;

    @FindBy(xpath = "//li[text()='DOC']")
    private WebElement filterDoc;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner ']//a)[1]")
    private WebElement open1stDocPosting;

    @FindBy(xpath = "//div[@class='x-tool-tool-el x-tool-img x-tool-close ']")
    private WebElement btnCloseIconInNotification;

    @FindBy(xpath = "//div[@class='x-grid-empty']")
    private WebElement txt0ResultFound;

    @FindBy(xpath = "//input[@name='expirationdate']")
    private WebElement txtExpirationDate;

    @FindBy(xpath = "//span[@class='x-tree-node-text ' and text()='Locations']")
    private WebElement menuLocation;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement txtLocationName;

    @FindBy(xpath = "//input[@name='matchcode']")
    private WebElement txtLocationCode;

    @FindBy(xpath = "//textarea[@name='notes']")
    private WebElement txtLocationNotes;

    @FindBy(xpath = "//span[text()='SAVE']")
    private WebElement btnLocationSave;

    @FindBy(xpath = "//input[@name='locationlabel']")
    private WebElement dropdownLocationOnPosting;

    public Posting(WebDriver webDriver) {
        super(webDriver);
    }

    public void navigateToPostingMenu() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(postingsMenu);
            Reporter.log("Posting menu opened.");
            clickAfterVisibilityOfElement(postings);
            Reporter.log("Posting screen opened.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }

    }

    public void validatePostingScreen() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Assert.assertEquals(validatePosting.getText(), "Postings", "Posting screen is not opened.");
            Reporter.log("Validated Posting screen");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }

    }

    public void addMessagePosting() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(btnAddNew);
            Reporter.log("Add New button clicked.");
            clickAfterVisibilityOfElement(drpSelectType);
            Reporter.log("Type select dropdown clicked.");
            clickAfterVisibilityOfElement(selectMessage);
            Reporter.log("Message Type selected.");
            txtTitle.sendKeys(Constants.MESSAGEPOSTINGTITLE);
            Reporter.log("Posting Title " + Constants.MESSAGEPOSTINGTITLE + " typed.");
            txtMessage.sendKeys(ConfigReader.getProperty("messagepostingmessage"));
            Reporter.log("Posting message typed.");
            txtAliasName.sendKeys(Constants.ALIASNAMEFORMESSAGEPOSTING);
            if (shouldUploadToLive()) {
                clickAfterVisibilityOfElement(switchUploadToLive);
                Reporter.log("Upload to live switch off.");
            }
            // clickAfterVisibilityOfElement(switchNewWindow);
            Reporter.log("New Window Switch off.");
            clickAfterVisibilityOfElement(btnNext);
            Reporter.log("Next button clicked.");
            clickAfterVisibilityOfElement(btnSave);
            Reporter.log("Save button clicked.");
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void addLinkPosting() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(btnAddNew);
            Reporter.log("Add New button clicked.");
            clickAfterVisibilityOfElement(drpSelectType);
            Reporter.log("Type select dropdown clicked.");
            clickAfterVisibilityOfElement(selectLink);
            Reporter.log("Link Type selected.");
            txtTitle.sendKeys(Constants.LINKPOSTINGTITLE);
            Reporter.log("Posting Title " + Constants.LINKPOSTINGTITLE + " typed.");
            txtURL.sendKeys(ConfigReader.getProperty("linkpostingurl"));
            Reporter.log("Posting Link URL typed.");
            if (shouldUploadToLive()) {
                clickAfterVisibilityOfElement(switchUploadToLive);
                Reporter.log("Upload to live switch off.");
            }
            // clickAfterVisibilityOfElement(switchNewWindow);
            Reporter.log("New Window Switch off.");
            clickAfterVisibilityOfElement(btnNext);
            Reporter.log("Next button clicked.");
            clickAfterVisibilityOfElement(btnSave);
            Reporter.log("Save button clicked.");
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void addFilePosting(String documentpostingpath) throws Exception {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(btnAddNew);
            Reporter.log("Add New button clicked.");
            clickAfterVisibilityOfElement(btnFileUpload);
            Reporter.log("Type select dropdown clicked.");
            Thread.sleep(2000);
            Runtime.getRuntime().exec(documentpostingpath);
            Reporter.log("Executed AutoIT and File taken in machine.");
            Thread.sleep(2000);
            txtTitle.sendKeys(Constants.FILEPOSTINGTITLE);
            Reporter.log("Posting Title " + Constants.FILEPOSTINGTITLE + " typed.");
            if (shouldUploadToLive()) {
                clickAfterVisibilityOfElement(switchUploadToLive);
                Reporter.log("Upload to live switch off.");
            }
            //clickAfterVisibilityOfElement(switchNewWindow);
            Reporter.log("New Window Switch off.");
            clickAfterVisibilityOfElement(btnNext);
            Reporter.log("Next button clicked.");
            clickAfterVisibilityOfElement(btnSave);
            Reporter.log("Save button clicked.");

        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void searchPosting(String postingName) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clearAfterVisibilityOfElement(txtSearchbar);
            Reporter.log("Search bar cleared.");
            waitForLoadingIconToBeDisappeared();
            txtSearchbar.sendKeys(postingName);
            Reporter.log("Posting name typed in search text box.");
            txtSearchbar.sendKeys(Keys.ENTER);
            Reporter.log("Enter button clicked.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateSearchedPosting(String postingName) throws IOException {
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
            Assert.assertEquals(postingName, lnkSearchedDocument.getText(), "Searched Posting is not displayed on search result page. ");
            Reporter.log("Searched Posting Present on Search result page.");
        } catch (NumberFormatException e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void openSearchedPosting() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkSearchedDocument);
            Reporter.log("Searched Posting able to open.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void filterPosting(String postingName) throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("arguments[0].scrollIntoView();", txtTitleFilter);
            waitForLoadingIconToBeDisappeared();
            wait.until(ExpectedConditions.visibilityOf(txtTitleFilter));
            txtTitleFilter.clear();
            Reporter.log("Title Filter cleared.");
            txtTitleFilter.sendKeys(postingName);
            Reporter.log("Posting name typed in title filter.");
            txtTitleFilter.sendKeys(Keys.ENTER);
            Reporter.log("Enter button clicked.");
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(postingName, lnkPostingGrid.getText(), "Filtered posting is not present in grid.");
            Reporter.log("Filtered Posting present in grid.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void updatePosting(String postingName) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkPostingGrid);
            Reporter.log("Clicked on Posting link which is present in grid after applying filter.");
            waitForLoadingIconToBeDisappeared();
            clearAfterVisibilityOfElement(txtTitle);
            Reporter.log("Title field cleared.");
            txtTitle.sendKeys(postingName);
            Reporter.log("Title Updated.");
            clickAfterVisibilityOfElement(btnUpdate);
            Reporter.log("Clicked on Update button.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void deletePosting() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(checkboxPostingGrid);
            Reporter.log("Clicked on Checkbox button in Grid.");
            deleteFunctionality();
            validatePostingDeleted();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    private void deleteFunctionality() {
        clickAfterVisibilityOfElement(btnDelete);
        Reporter.log("Clicked on Delete button.");
        clickAfterVisibilityOfElement(btnDeleteOk);
        Reporter.log("Clicked on OK button.");
    }

    public void giveGroupAccess() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {

            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(lnkUnAssignedGroups);
            Reporter.log("Clicked on UnAssigned Group tab.");
            inputGroupName.sendKeys("Basic");
            inputGroupName.sendKeys(Keys.ENTER);
            Reporter.log("Basic filter applied");
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(checkbox);
            Reporter.log("Clicked on select all checkbox.");
            clickAfterVisibilityOfElement(btnAssign);
            Reporter.log("Clicked on Assign button.");
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void viewPosting() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(btnView);
            clickAfterVisibilityOfElement(btnView);
            Reporter.log("Clicked on View button.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateViewMessagePosting() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            //webDriver.switchTo().frame(webDriver.findElement(By.xpath("//*[@src='/ASI/Tools/Postings/Posting_Bulletin.aspx']")));
            Assert.assertEquals(getMessagePostingTitle.getText(), Constants.MESSAGEPOSTINGTITLE, "Posting Title is not verified.");
            Reporter.log("Posting Title Verified.");
            Assert.assertEquals(getMessagePostingText.getText(), ConfigReader.getProperty("messagepostingmessage"), "Posting Message is not verified.");
            Reporter.log("Message Posting title verified.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateViewLinkPosting() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            //webDriver.switchTo().frame(webDriver.findElement(By.xpath("//*[@src='/ASI/Tools/Postings/Posting_Bulletin.aspx']")));
            Assert.assertEquals(webDriver.getCurrentUrl().toLowerCase(), webDriver.getCurrentUrl().toLowerCase(), "Posting URL is not verified.");
            Reporter.log("Link Posting URL verified.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void openPostingUsingAliasName() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            String url = webDriver.getCurrentUrl();
            String[] splitStrings = StringUtils.split(url, '?');
            webDriver.get(splitStrings[0].toString() + "?alias=" + Constants.ALIASNAMEFORMESSAGEPOSTING);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateDefaultEnwisenGroupAccess() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(lnkGroupsInGrid.getText(), ConfigReader.getProperty("grouplink"), "1 Group is not present for the posting.");
            Reporter.log("1 Group is present for newly added posting.");
            clickAfterVisibilityOfElement(lnkGroupsInGrid);
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(txtEnwisenGroup.getText(), ConfigReader.getProperty("enwisengroup"), "Enwisen Group assigned by default.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void addMoreThan10MBFile(String documentpostingpath) throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(btnAddNew);
            Reporter.log("Add New button clicked.");
            clickAfterVisibilityOfElement(btnFileUpload);
            Reporter.log("Type select dropdown clicked.");
            Thread.sleep(2000);
            Runtime.getRuntime().exec(documentpostingpath);
            Reporter.log("Executed AutoIT and File taken in machine.");
            Thread.sleep(2000);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void updateExcludeFromSearch() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkPostingGrid);
            Reporter.log("Clicked on Posting link which is present in grid after applying filter.");
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(switchExcludeFromSearch);
            Reporter.log("Clicked on Exclude from Search switch.");
            clickAfterVisibilityOfElement(btnUpdate);
            Reporter.log("Clicked on Update button.");
            validatePostingUpdated();
            Reporter.log("Validate Posting update.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateExcludeFromSearchAndExpire() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Assert.assertEquals(txt0ResultFound.getText(), ConfigReader.getProperty("search0resultfound"), "0 Result found message is not verified.");
            Reporter.log("0 Result found message verified.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void updateExpirationDate() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(lnkPostingGrid);
            Reporter.log("Clicked on Posting link which is present in grid after applying filter.");
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(txtExpirationDate);
            txtExpirationDate.sendKeys(getTodayDate());
            clickAfterVisibilityOfElement(btnUpdate);
            Reporter.log("Clicked on Update button.");
            validatePostingUpdated();
            Reporter.log("Validate Posting update.");
        } catch (IOException e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validatePostingAdded() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Assert.assertEquals(notificationAddedSuccessfully.getText(), "Added Successfully", "Posting is not added successfully.");
            Reporter.log("Posting added successfully.");
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateMimePostingNotification() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(notificationMimePosting.getText(), ConfigReader.getProperty("mimepostingnotification"), "mime type posting validation message is not matched.");
            Reporter.log("Mime type posting is verified.");
            clickAfterVisibilityOfElement(btnCloseIconInNotification);
            Reporter.log("Clicked on Close icon.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateMoreThan10mbFilePostingNotification() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(notificationMoreThan10MBFilePosting.getText(), ConfigReader.getProperty("morethan10mbnotification"), "More than 10 mb file posting validation message is not matched.");
            Reporter.log("More than 10 mb file posting is verified.");
            clickAfterVisibilityOfElement(btnCloseIconInNotification);
            Reporter.log("Clicked on Close icon.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validatePostingUpdated() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Assert.assertEquals(notificationUpdatedSuccessfully.getText(), "Updated Successfully", "Posting is not Updated successfully.");
            Reporter.log("Posting updated successfully.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void appliedTypeFilter() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("arguments[0].scrollIntoView();", inputTypeFilter);
            clickAfterVisibilityOfElement(inputTypeFilter);
            clickAfterVisibilityOfElement(filterDoc);
            inputTypeFilter.sendKeys(Keys.ENTER);
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(open1stDocPosting);
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void fileUploadWhileUpdate(String documentpostingpath) throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(btnFileUploadWhileUpdate);
            Reporter.log("File Upload button clicked.");
            Thread.sleep(2000);
            Runtime.getRuntime().exec(documentpostingpath);
            Reporter.log("Executed AutoIT and File taken in machine.");
            Thread.sleep(2000);

        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void filePostingUpdate() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(btnDeleteOk);
            clickAfterVisibilityOfElement(btnUpdate);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }

    }

    public void validatePostingDeleted() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Assert.assertEquals(notificationDeletedSuccessfully.getText(), "Deleted Successfully", "Posting is not delete successfully.");
            Reporter.log("Posting deleted successfully.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void navigateToLocationMenu() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(postingsMenu);
            Reporter.log("Posting menu opened.");
            clickAfterVisibilityOfElement(menuLocation);
            Reporter.log("Posting screen opened.");
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void addLocation() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            txtLocationName.sendKeys(ConfigReader.getProperty("locationname"));
            txtLocationCode.sendKeys(ConfigReader.getProperty("locationcode"));
            txtLocationNotes.sendKeys(ConfigReader.getProperty("locationNote"));
            clickAfterVisibilityOfElement(btnLocationSave);
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void openNewlyAddedLocation(String locationcode) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            webDriver.findElement(By.xpath("//a[text()='" + locationcode + "']")).click();
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateNewlyAddedLocation(String locationname, String locationcode, String locationNote) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Assert.assertEquals(txtLocationName.getAttribute("value"), locationname, "Location Name is not matched.");
            Reporter.log("Location Name is matched.");
            Assert.assertEquals(txtLocationCode.getAttribute("value"), locationcode, "Location Code is not matched.");
            Reporter.log("Location Code is matched.");
            Assert.assertEquals(txtLocationNotes.getAttribute("value"), locationNote, "Location notes is not matched.");
            Reporter.log("Location Note is matched.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateAddedLocationOnPosting(String locationname) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Assert.assertTrue(webDriver.findElement(By.xpath("//div[text()='"+ locationname +"']")).isDisplayed(),"Newly Added Location is not present.");
            Reporter.log("Newly Added Location is present.");
            webDriver.findElement(By.xpath("//div[text()='"+ locationname +"']/../../../../div[2]/div//label")).click();
            clickAfterVisibilityOfElement(btnUpdate);
            Reporter.log("Clicked on Update button.");
            validatePostingUpdated();
            Reporter.log("Validate Posting update.");
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(dropdownLocationOnPosting);
            webDriver.findElement(By.xpath("//li[text()='" + locationname + "']")).click();
            dropdownLocationOnPosting.sendKeys(Keys.ENTER);
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(gridLocationOnPosting.getText(), locationname,"Location applied to the posting.");
            Reporter.log("Location Name present on Posting Grid.");
        } catch (IOException e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void updateLocation() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            txtLocationName.sendKeys(ConfigReader.getProperty("updatemessage"));
            txtLocationCode.sendKeys(ConfigReader.getProperty("updatemessage"));
            txtLocationNotes.sendKeys(ConfigReader.getProperty("updatemessage"));
            clickAfterVisibilityOfElement(btnUpdate);
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }


    private boolean shouldUploadToLive() {
        return ConfigReader.getProperty("uploadtolive").equalsIgnoreCase(Constants.KEYWORD_YES);
    }

}
