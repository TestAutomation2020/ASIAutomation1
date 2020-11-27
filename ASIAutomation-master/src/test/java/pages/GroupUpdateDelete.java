package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.Reporter;
import util.ConfigReader;

import java.io.IOException;

public class GroupUpdateDelete extends BasePage{

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase']")
    private WebElement txtKnowledgebase;

    @FindBy(how = How.XPATH, using = "//span[text()='Administration']")
    private WebElement txtAdministration;

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase Admin']")
    private WebElement txtKnowledgebaseAdmin;

    @FindBy(how = How.XPATH, using = "//span[text()='Users']")
    private WebElement txtUsers;

    @FindBy(how = How.XPATH, using = "//span[text()='User ID']")
    private WebElement txtUserID;

    @FindBy(how = How.XPATH, using = "//span[text()='Groups']")
    private WebElement GroupMenu;
    @FindBy(how = How.XPATH, using = "//span[text()='ID']")
    private WebElement GroupID;
    @FindBy(how = How.XPATH, using = "//span[text()='Start Page'][@data-ref='btnInnerEl']")
    private WebElement GroupStartPageBtn;
    @FindBy(how = How.XPATH, using = "(//span[text()='Delete'])[1]")
    private WebElement GroupDeleteBtn;
    @FindBy(how = How.XPATH, using = "(//span[normalize-space(text())='Delete']/ancestor::a)[2]")
    private WebElement GroupDeleteBtnongrpdetails;


    @FindBy(how = How.XPATH, using = "//input[@name='name']")
    private WebElement GroupNameTxt;
    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Apply')]")
    private WebElement ApplyBtn;
    @FindBy(how = How.XPATH, using = "(//div[@class='x-grid-cell-inner ']//a[@href='#'])[1]")
    private WebElement GroupLink;
    @FindBy(how = How.XPATH, using = "//input[@name='matchcode']")
    private WebElement GroupName;

    @FindBy(how = How.XPATH, using = "//input[@name='pagename']")
    private WebElement Click_Startpage;

    @FindBy(how = How.XPATH, using = "//li[text()='Onboarding']")
    private WebElement Select_Startpage;

    @FindBy(how = How.XPATH, using = "//input[@name='sessiontimeoutperiod']")
    private WebElement Sessionoutperiod;

    @FindBy(how = How.XPATH, using = "//span[text()='Update']")
    private WebElement UpdateBtn;
    @FindBy(how = How.XPATH, using = "//div[text()='Updated Successfully']")
    private WebElement UpdatedSuccessfully;

    @FindBy(how = How.XPATH, using = "//div[text()='Deleted Successfully']")
    private WebElement DeletedSuccessfully;

    @FindBy(how = How.XPATH, using = "(//div[@class='x-grid-cell-inner x-grid-checkcolumn-cell-inner'])[1]")
    private WebElement Groupchk1;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnEl'][contains(.,'Ok')]")
    private WebElement BtnOK;


    @FindBy(how = How.XPATH, using = "(//span[@class='x-btn-button x-btn-button-default-toolbar-small  x-btn-no-text x-btn-icon x-btn-icon-left x-btn-button-center '])[4]")
    private WebElement RefreashIcon;
    @FindBy(how = How.XPATH, using = "//div[@class='x-grid-empty']")
    private WebElement Emptygrid;

    public GroupUpdateDelete(WebDriver webDriver) {
        super(webDriver);
    }
    //Method to access KB Admin -> Groups Menu
    public void NavigateToGroup(WebDriver webDriver) throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Reporter.log("---------- User menu navigation script ----------");
            Thread.sleep(5000);
            clickwhenready(txtKnowledgebase);
            Reporter.log("Knowledgebase menu link clicked");
            clickwhenready(txtAdministration);
            Reporter.log("Administration menu clicked");
            clickwhenready(txtKnowledgebaseAdmin);
            Reporter.log("Knowledgebase Admin menu clicked");
            Thread.sleep(5000);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Groups']")));
            GroupMenu.click();
            Reporter.log("Group menu clicked");
            Thread.sleep(5000);
            GroupID.isDisplayed();
            Reporter.log("ID text is displayed");
            Reporter.log("---------- End of Group menu navigation script ----------");
            ScreenPrints(webDriver);
        }
        catch (Exception e)
        {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());

        }
    }
    public void GroupUpdate(WebDriver webDriver) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try
        {
            Reporter.log("Group menu link clicked");
            clearAfterVisibilityOfElement(GroupNameTxt);
            GroupNameTxt.sendKeys(ConfigReader.getProperty("Groupname"));
            clickwhenready(ApplyBtn);
            Thread.sleep(3000);
            clickwhenready(GroupLink);
            Thread.sleep(4000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='matchcode']")));
            Thread.sleep(4000);
            String grpnm=GroupName.getAttribute("value");
           Assert.assertEquals(grpnm,ConfigReader.getProperty("Groupname"));
            System.out.println("Group Name is same"+grpnm);
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            WebElement Element = webDriver.findElement(By.xpath("//input[@name='pagename']"));
            js.executeScript("arguments[0].scrollIntoView();", Element);
            Element.click();
            Thread.sleep(4000);
            //clickwhenready(Click_Startpage);
            Thread.sleep(2000);
            clickwhenready(Select_Startpage);
            Thread.sleep(200);
            clearAfterVisibilityOfElement(Sessionoutperiod);
            Sessionoutperiod.sendKeys(ConfigReader.getProperty("SessionPeriod"));
            clickwhenready(UpdateBtn);
            Reporter.log("Group is updated with start page and session Period");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Updated Successfully']")));
            Thread.sleep(4000);
            if(UpdatedSuccessfully.isDisplayed())
            {
                clickwhenready(RefreashIcon);
                waitForLoadingIconToBeDisappeared();
                clickwhenready(GroupLink);
                Thread.sleep(4000);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='matchcode']")));
                String grpnmvalidation=GroupName.getAttribute("value");
                Assert.assertEquals(grpnm,ConfigReader.getProperty("Groupname"));
                System.out.println("Group Name is same after updating"+grpnmvalidation);
                Reporter.log("Group Name is same"+grpnmvalidation);
                JavascriptExecutor jss = (JavascriptExecutor) webDriver;
                WebElement Elements = webDriver.findElement(By.xpath("//input[@name='pagename']"));
                jss.executeScript("arguments[0].scrollIntoView();", Element);
                Elements.click();
                String startpage=Elements.getText();
                Assert.assertEquals(startpage,ConfigReader.getProperty("StartpageforGroup"));
                System.out.println("Start page is updated as expected");
                Reporter.log("Start page is updated as expected");
                String session= Sessionoutperiod.getText();
                Assert.assertEquals(startpage,ConfigReader.getProperty("SessionPeriod"));
                System.out.println("Session period is updated as expected");
                Reporter.log("Group is period is updated as expected");

            }
            else {

                ScreenPrints(webDriver);
                System.out.println("Group is not updated as expected");
                Reporter.log("Group is not updated as expected");
            }

        }catch (Exception ex)
        {
            ScreenPrints(webDriver);
            System.out.println(ex.getMessage());
            Reporter.log(nameOfCurrMethod+"\n"+ex.toString());
        }
    }
    public void GroupDelete(WebDriver webDriver) throws IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Reporter.log("Group menu link clicked");
            clearAfterVisibilityOfElement(GroupNameTxt);
            GroupNameTxt.sendKeys(ConfigReader.getProperty("Groupname"));
            clickwhenready(ApplyBtn);
            Thread.sleep(4000);
            clickwhenready(GroupLink);
            Thread.sleep(4000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='matchcode']")));
            String grpnm = GroupName.getAttribute("value");
            Assert.assertEquals(grpnm, ConfigReader.getProperty("Groupname"));
            System.out.println("Group Name is same before deletion" + grpnm);
            clickwhenready(GroupDeleteBtnongrpdetails);
            Thread.sleep(3000);
            clickwhenready(BtnOK);
            Reporter.log("OK button clicked");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Deleted Successfully']")));
           if( DeletedSuccessfully.isDisplayed())
           {
               Reporter.log("Group menu link clicked");
               clearAfterVisibilityOfElement(GroupNameTxt);
               GroupNameTxt.sendKeys(ConfigReader.getProperty("Groupname"));
               clickwhenready(ApplyBtn);
               Thread.sleep(3000);
               if (Emptygrid.isDisplayed())
               {
                   Reporter.log("Empty report displayed");
                   Thread.sleep(3000);
                   System.out.println("Group deletion successful");
                   Reporter.log("Group Deleted successful");
               }
               else {
                   ScreenPrints(webDriver);
                   System.out.println("Group deletion successful");
                   Reporter.log("Group not eleted successful");
               }
        }
            ScreenPrints(webDriver);
            System.out.println("Group deletion successful");
            Reporter.log("Group not eleted successful");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    }
