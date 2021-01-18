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
    private WebElement menuPostings;

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

    @FindBy(xpath = "//div[text()='Announcements']/../../../..//label[@data-ref='boxLabelEl']")
    private WebElement switchAnnouncements;

    @FindBy(xpath = "//div[text()='Bulletins']/../../../..//label[@data-ref='boxLabelEl']")
    private WebElement switchBulletins;

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
    private WebElement open1stPostingInGrid;

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

    @FindBy(xpath = "//label[@class='x-form-cb-label x-form-cb-label-default x-form-cb-label-after ' and text()='Create new Folder']")
    private WebElement radioCreateNewFolder;

    @FindBy(xpath = "//input[@name='newfolder']")
    private WebElement inputNewFolder;

    @FindBy(xpath = "//span[text()='Posting Audit Report' and @class='x-tree-node-text ']")
    private WebElement menuPostingAuditReport;

    @FindBy(xpath = "//span[text()='Start Date']/../../..//input")
    private WebElement inputStartDatePostingAuditReport;

    @FindBy(xpath = "//span[text()='End Date']/../../..//input")
    private WebElement inputEndDatePostingAuditReport;

    @FindBy(xpath = "//input[@name='accountId']")
    private WebElement inputAccountIDPostingAuditReport;

    @FindBy(xpath = "//input[@name='titlePosting']")
    private WebElement inputTitlePostingAuditReport;

    @FindBy(xpath = "//span[text()='Apply']")
    private WebElement btnApply;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner '])[1]")
    private WebElement gridTitleOnPostingAuditReport;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner '])[2]")
    private WebElement gridAccountIdOnPostingAuditReport;

    @FindBy(xpath = "//span[text()='All Postings' and @class='x-tree-node-text ']")
    private WebElement menuAllPosting;

    @FindBy(xpath = "//input[@name='folderList']")
    private WebElement inputFolderAllPosting;

    @FindBy(xpath = "//input[@name='postingTitle']")
    private WebElement inputTitleAllPosting;

    @FindBy(xpath = "//input[@name='aliasName']")
    private WebElement inputAliasAllPosting;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputSelectFolder;

    @FindBy(xpath = "//input[@name='keywords']")
    private WebElement inputKeyword;

    @FindBy(xpath = "//label[@class='x-form-cb-label x-form-cb-label-default x-form-cb-label-after  ' and text()='Both']")
    private WebElement radioBothAllPosting;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner ' and text()='Link'])[1]")
    private WebElement gridLinkTypeAllPosting;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner ' and text()='Message'])[1]")
    private WebElement gridMessageTypePostingUsage;

    @FindBy(xpath = "//span[text()='Posting Usage' and @class='x-tree-node-text ']")
    private WebElement menuPostingUsage;

    @FindBy(xpath = "//span[text()='Posting Images' and @class='x-tree-node-text ']")
    private WebElement menuPostingImage;

    @FindBy(xpath = "//input[@name='imageupload']")
    private WebElement btnImageFileUpload;

    @FindBy(xpath = "//span[text()='UPDATE']")
    private WebElement btnUpdatePostingImage;

    @FindBy(xpath = "//img")
    private WebElement imgPosting;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner ']//h4//a)[1]")
    private WebElement filePostingSearchPage;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner ']//h4//a)[2]")
    private WebElement linkPostingSearchPage;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner ']//h4//a)[3]")
    private WebElement messagePostingSearchPage;

    public Posting(WebDriver webDriver) {
        super(webDriver);
    }

    public void navigateToPostingMenu() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(menuPostings);
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
            txtMessage.sendKeys(Constants.FILEPOSTINGTITLE);
            Reporter.log("Posting message typed.");
            txtAliasName.sendKeys(Constants.ALIASNAMEFORMESSAGEPOSTING);
            if (shouldUploadToLive()) {
                clickAfterVisibilityOfElement(switchUploadToLive);
                Reporter.log("Upload to live switch off.");
            }
            // clickAfterVisibilityOfElement(switchNewWindow);
            // Reporter.log("New Window Switch off.");
            clickAfterVisibilityOfElement(radioCreateNewFolder);
            Reporter.log("Create New Folder radio button clicked.");
            inputNewFolder.sendKeys(Constants.NEWFOLDER);
            Reporter.log("Entered New folder text box.");
            clickAfterVisibilityOfElement(switchAnnouncements);
            Reporter.log("Announcement location on");
            clickAfterVisibilityOfElement(switchBulletins);
            Reporter.log("Bulletin location on");
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
            inputKeyword.sendKeys(Constants.FILEPOSTINGTITLE);
            if (shouldUploadToLive()) {
                clickAfterVisibilityOfElement(switchUploadToLive);
                Reporter.log("Upload to live switch off.");
            }
            // clickAfterVisibilityOfElement(switchNewWindow);
            // Reporter.log("New Window Switch off.");
            clickAfterVisibilityOfElement(inputSelectFolder);
            Reporter.log("Create New Folder radio button clicked.");
            inputSelectFolder.sendKeys(Constants.NEWFOLDER);
            Reporter.log("Entered New folder text box.");
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

    public void addFilePosting(String documentpostingpath, String filepostingtitle) throws Exception {
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
            txtTitle.sendKeys(filepostingtitle);
            Reporter.log("Posting Title " + Constants.FILEPOSTINGTITLE + " typed.");
            if (shouldUploadToLive()) {
                clickAfterVisibilityOfElement(switchUploadToLive);
                Reporter.log("Upload to live switch off.");
            }
            //clickAfterVisibilityOfElement(switchNewWindow);
            //Reporter.log("New Window Switch off.");
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
            //  waitForLoadingIconToBeDisappeared();
            clearAfterVisibilityOfElement(txtSearchbar);
            Reporter.log("Search bar cleared.");
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

    private void deleteFunctionality() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(btnDelete);
            Reporter.log("Clicked on Delete button.");
            clickAfterVisibilityOfElement(btnDeleteOk);
            Reporter.log("Clicked on OK button.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
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
            Assert.assertEquals(getMessagePostingText.getText(), Constants.FILEPOSTINGTITLE, "Posting Message is not verified.");
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
            webDriver.get(splitStrings[0] + "?alias=" + Constants.ALIASNAMEFORMESSAGEPOSTING);
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
            waitForLoadingIconToBeDisappeared();
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

    public void appliedTypeFilter(String patternType) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("arguments[0].scrollIntoView();", inputTypeFilter);
            clickAfterVisibilityOfElement(inputTypeFilter);
            webDriver.findElement(By.xpath("//li[text()='" + patternType + "']")).click();
            inputTypeFilter.sendKeys(Keys.ENTER);
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(open1stPostingInGrid);
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
            clickAfterVisibilityOfElement(menuPostings);
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

    public void validateAddedLocationOnPosting(String locationName) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Assert.assertTrue(webDriver.findElement(By.xpath("//div[text()='" + locationName + "']")).isDisplayed(), "Newly Added Location is not present.");
            Reporter.log("Newly Added Location is present.");
            webDriver.findElement(By.xpath("//div[text()='" + locationName + "']/../../../../div[2]/div//label")).click();
            clickAfterVisibilityOfElement(btnUpdate);
            Reporter.log("Clicked on Update button.");
            validatePostingUpdated();
            Reporter.log("Validate Posting update.");
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(dropdownLocationOnPosting);
            webDriver.findElement(By.xpath("//li[text()='" + locationName + "']")).click();
            dropdownLocationOnPosting.sendKeys(Keys.ENTER);
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(gridLocationOnPosting.getText(), locationName, "Location applied to the posting.");
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

    public void validateDeleteLocationOnPosting(String locationName) {
        Assert.assertFalse(isElementPresent("//div[text()='" + locationName + "']"), "Location should be present in form..");
        Reporter.log("Location is not present.");
        clickAfterVisibilityOfElement(dropdownLocationOnPosting);
        Assert.assertFalse(isElementPresent("//li[text()='" + locationName + "']"), "Location should be present in dropdown.");
    }

    public void navigateToPostingAuditReportMenu() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(menuPostings);
            Reporter.log("Posting menu opened.");
            clickAfterVisibilityOfElement(menuPostingAuditReport);
            Reporter.log("Posting Audit Report Menu screen opened.");
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void appliedFilterInPostingAuditReport() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            inputStartDatePostingAuditReport.sendKeys(getTodayDate());
            Reporter.log("StartDate entered in Posting Audit Report.");
            inputEndDatePostingAuditReport.sendKeys(getTodayDate());
            Reporter.log("EndDate entered in Posting Audit Report.");
            inputAccountIDPostingAuditReport.sendKeys(ConfigReader.getProperty("userid"));
            Reporter.log("Account ID enterted in Posting Audit Report.");
            inputTitlePostingAuditReport.sendKeys(Constants.MESSAGEPOSTINGTITLE);
            Reporter.log("Posting Title entered in Posting Audit Report.");
            clickAfterVisibilityOfElement(btnApply);
            Reporter.log("Clicked on apply button.");
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validatePostingAuditReportGrid() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(gridTitleOnPostingAuditReport.getText(), Constants.MESSAGEPOSTINGTITLE, "Posting title is not matched.");
            Reporter.log("Posting Title is matched on Posting Audit Report.");
            Assert.assertEquals(gridAccountIdOnPostingAuditReport.getText().toLowerCase(), ConfigReader.getProperty("userid").toLowerCase(), "User ID is not matched.");
            Reporter.log("User ID is matched on Posting Audit Repost.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void navigateToAllPosting() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(menuPostings);
            Reporter.log("Posting menu opened.");
            clickAfterVisibilityOfElement(menuAllPosting);
            Reporter.log("All Posting Menu screen opened.");
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void appliedFilterInAllPostingReport() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            inputFolderAllPosting.sendKeys(Constants.NEWFOLDER);
            inputFolderAllPosting.click();
            inputTitleAllPosting.sendKeys(Constants.LINKPOSTINGTITLE);
            //inputAliasAllPosting.sendKeys(Constants.ALIASNAMEFORMESSAGEPOSTING);
            inputKeyword.sendKeys(Constants.FILEPOSTINGTITLE);
            clickAfterVisibilityOfElement(radioBothAllPosting);
            clickAfterVisibilityOfElement(btnApply);
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateAllPostingReportGrid() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(gridLinkTypeAllPosting.getText(), "Link", "Posting Type Link is not matched.");
            Reporter.log("Posting Type is matched on All Posting.");
            Assert.assertEquals(webDriver.findElement(By.xpath("//div[@class='x-grid-cell-inner ' and text()='" + Constants.LINKPOSTINGTITLE + "']")).getText(), Constants.LINKPOSTINGTITLE, "Link Posting title is not matched.");
            Reporter.log("Link Posting Title is matched on All Posting.");
            Assert.assertEquals(webDriver.findElement(By.xpath("//div[@class='x-grid-cell-inner ' and text()='" + Constants.NEWFOLDER + "']")).getText(), Constants.NEWFOLDER, "Posting folder is not matched.");
            Reporter.log("Posting folder is matched on All Posting.");
            Assert.assertEquals(webDriver.findElement(By.xpath("//div[@class='x-grid-cell-inner ' and text()='" + Constants.FILEPOSTINGTITLE + "']")).getText(), Constants.FILEPOSTINGTITLE, "Posting Keyword is not matched.");
            Reporter.log("Posting Keyword is matched on All Posting.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void appliedFilterInAllPostingReportForFolder(String postingTitle) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            inputFolderAllPosting.clear();
            inputFolderAllPosting.sendKeys(postingTitle);
            inputFolderAllPosting.click();
            clickAfterVisibilityOfElement(radioBothAllPosting);
            clickAfterVisibilityOfElement(btnApply);
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateAllPostingReportGridForFolder(String validPostingTitle, String postingFolderName, String invalidPostingTitle) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(webDriver.findElement(By.xpath("//div[@class='x-grid-cell-inner ' and text()='" + validPostingTitle + "']")).getText(), validPostingTitle, "Posting title is not matched.");
            Reporter.log("Posting Title is matched on All Posting.");
            Assert.assertEquals(webDriver.findElement(By.xpath("//div[@class='x-grid-cell-inner ' and text()='" + postingFolderName + "']")).getText(), postingFolderName, "Posting folder is not matched.");
            Reporter.log("Posting folder is matched on All Posting.");
            Assert.assertFalse(isElementPresent("//div[@class='x-grid-cell-inner ' and text()='" + invalidPostingTitle + "']"), "Posting is present");
            Reporter.log("Posting Title(_) is not matched on All Posting.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void navigateToPostingUsageMenu() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clickAfterVisibilityOfElement(menuPostings);
            Reporter.log("Posting menu opened.");
            clickAfterVisibilityOfElement(menuPostingUsage);
            Reporter.log("Posting Usage Menu screen opened.");
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void appliedFilterInPostingUsageReport() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            inputAccountIDPostingAuditReport.sendKeys(ConfigReader.getProperty("userid"));
            inputTitleAllPosting.sendKeys(Constants.MESSAGEPOSTINGTITLE);
            inputAliasAllPosting.sendKeys(Constants.ALIASNAMEFORMESSAGEPOSTING);
            //inputKeyword.sendKeys(Constants.FILEPOSTINGTITLE);
            clickAfterVisibilityOfElement(radioBothAllPosting);
            clickAfterVisibilityOfElement(btnApply);
            waitForLoadingIconToBeDisappeared();
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validatePostingUsageReportGrid() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertEquals(gridMessageTypePostingUsage.getText(), "Message", "Posting Type Message is not matched.");
            Reporter.log("Posting Type is matched on Posting Usage.");
            Assert.assertEquals(webDriver.findElement(By.xpath("//div[@class='x-grid-cell-inner ' and text()='" + Constants.MESSAGEPOSTINGTITLE + "']")).getText(), Constants.MESSAGEPOSTINGTITLE, "Link Posting title is not matched.");
            Reporter.log("Message Posting Title is matched on All Posting.");
            Assert.assertEquals(webDriver.findElement(By.xpath("//div[@class='x-grid-cell-inner ' and text()='" + Constants.ALIASNAMEFORMESSAGEPOSTING + "']")).getText(), Constants.ALIASNAMEFORMESSAGEPOSTING, "Posting alias name is not matched.");
            Reporter.log("Posting alias namme is matched on All Posting.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void navigateToPostingImage() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(menuPostings);
            Reporter.log("Posting menu opened.");
            clickAfterVisibilityOfElement(menuPostingImage);
            Reporter.log("Posting Image menu opened.");

        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void addedImagePosting() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            clickAfterVisibilityOfElement(btnFileUpload);
            Reporter.log("clicked on Image upload button.");
            Thread.sleep(2000);
            Runtime.getRuntime().exec(ConfigReader.getProperty("imagePostingPath"));
            Reporter.log("Executed AutoIT and File taken in machine.");
            Thread.sleep(2000);
            if (shouldUploadToLive()) {
                clickAfterVisibilityOfElement(switchUploadToLive);
                Reporter.log("Upload to live switch off.");
            }
            clickAfterVisibilityOfElement(btnUpdatePostingImage);

        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void openAddedImagePosting() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            String url = webDriver.getCurrentUrl();
            String[] splitStrings = StringUtils.split(url, '/');
            System.out.println(splitStrings[1]);
            webDriver.get("https://" + splitStrings[1] + "/HR/" + ConfigReader.getProperty("organization") + "/Images/AutoImage.jpg");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validateOpenedImagePosting() throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            waitForLoadingIconToBeDisappeared();
            Assert.assertTrue(imgPosting.isDisplayed(), "Image Posting should not be opened.");
            Reporter.log("Image Posting is opened properly.");
            Assert.assertEquals(imgPosting.getAttribute("src"), webDriver.getCurrentUrl(), "Image posting path should not be matched.");
            Reporter.log("Image Posting path is opened properly.");
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void validatePostingTitleKeywordContent() {
        waitForLoadingIconToBeDisappeared();
        Assert.assertEquals(filePostingSearchPage.getText(), Constants.FILEPOSTINGTITLE, "File Posting should present on Search result page first.");
        Assert.assertEquals(linkPostingSearchPage.getText(), Constants.LINKPOSTINGTITLE, "Link Posting should present on Search result page second.");
        Assert.assertEquals(messagePostingSearchPage.getText(), Constants.MESSAGEPOSTINGTITLE, "Message Posting should present on Search result page third.");
    }


    private boolean shouldUploadToLive() {
        return ConfigReader.getProperty("uploadtolive").equalsIgnoreCase(Constants.KEYWORD_YES);
    }

}
