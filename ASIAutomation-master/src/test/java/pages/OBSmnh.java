package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import util.ConfigReader;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class OBSmnh extends BasePage {

    @FindBy(xpath = "//iframe[@class='x-component x-fit-item x-component-default']")
    private WebElement mainframe;
    @FindBy(xpath = "//iframe[@id='Onbd-user-c-main']")
    private WebElement Onbdframe;
    @FindBy(xpath = "//iframe[@id='userlist']")
    private WebElement MNHUserlistframe;

    @FindBy(xpath = "//iframe[@name='userprofile']")
    private WebElement MNHUserprofileframe;

    @FindBy(xpath = "//iframe[@name='common']")
    private WebElement MNHcommonframe;

    @FindBy(xpath = "//span[contains(.,'Onboarding Console')]")
    private WebElement OnboardingConsole;
    @FindBy(xpath = "//div[@class='dashSelection'][contains(.,'Manage New Hires')]")
    private WebElement Managenewhire;

    // @FindBy(xpath = "(//em[@class='x-btn-arrow']//button[text()='Add'])[1]']")
     //@FindBy(xpath = "//td[@id='ext-gen76']//button[text()='Add']")
    @FindBy(xpath = "//button[@type='button'][contains(.,'Add')]")
    private WebElement EleAdd;
     @FindBy (xpath = "//a/span[text()='Add New Hire']")
    // [FindsBy(How = How.Id, Using = "ext-gen117")]

    private WebElement AddNewHireButton;
     //Webelements on MNH user creation form:

  @FindBy(id= "UserID")
    private WebElement EleUserID;

    @FindBy(xpath = "//span[text()='Knowledgebase']")
    private WebElement lnkKnowledgebase;

    @FindBy(xpath = "//div[@id='ApplicationToolbar-innerCt']")
            private WebElement obclickinframe;

        @FindBy (id = "ProcNewHires.FirstName")
    private WebElement EleFirstNameSearch;
    @FindBy (id = "ProcNewHires.LastName")
    public WebElement EleLastNameSearch;
    @FindBy (id = "Password")
    private WebElement ElePassword ;
    @FindBy (id = "ConfirmPassword")
    private WebElement EleConfirmPassword;

    @FindBy (id = "MiddleName")
    private WebElement EleMiddleName ;


    @FindBy (id = "FirstName")
    private WebElement EleFirstName ;
    @FindBy (id = "LastName")
    private WebElement EleLastName ;
    @FindBy (id = "Email")
    private WebElement EleEmail ;
    @FindBy (id = "TestUser")
    private WebElement EleTestUser;
    @FindBy (xpath ="//div[@id='x-form-el-Gender']//img")
    private WebElement EleGender ;

    //To select start page:
    @FindBy (xpath = "//div[@class='x-form-element']/div/input[@id='StartPage']")
    private WebElement EleStartpage ;
    @FindBy (xpath = "//div[10]/div/div/img")
    private WebElement ImgStartpage ;


    @FindBy (id = "Address1")
    private WebElement EleAddress1;
    @FindBy (id = "City")
    private WebElement Elecity ;
    @FindBy (xpath = "//div[@id='x-form-el-State']//img")
    private WebElement ImgState ;
    @FindBy (id =  "Zipcode")
    private WebElement EleZipcode ;

    @FindBy (xpath =  "//div[@id='ext-gen121']/div[2]")
    private WebElement EleGenderID;

    @FindBy (id = "BirthDate")
    private WebElement EleBirthDate ;

    @FindBy (id =  "NationalID")
    private WebElement EleNationalID ;

    @FindBy (id =  "Address2")
    private WebElement EleAddress2 ;

    @FindBy (id = "City")
    private WebElement EleCity ;

    @FindBy (id = "Country")
    private WebElement EleCountry ;

    @FindBy (id = "HomePhone")
    private WebElement EleHomePhone;

    @FindBy (xpath =  "//div/span[text()='Cannot add New Hire. Duplicate UserID.']")
    private WebElement DuplicateUserAlert ;
    @FindBy (xpath = "//td[@class='x-btn-mc']/em/button[text()='OK']")
    private WebElement DuplicateUserAlertOK ;
    @FindBy (xpath = "//em/span/span[text()='Other']")
    private WebElement EleOther ;
    //Other tab:
    @FindBy (xpath = "//em/span/span[text()='Tracker I-9']")
    private WebElement EleTracker;
    @FindBy (xpath =  "//div[@id='x-form-el-EmployerDID']/div/input")
    private WebElement ImgTracker1 ;
    @FindBy (xpath = "//div[@id='x-form-el-ExternalWorksiteID']/div/img")
    private WebElement ImgTracker2 ;
    @FindBy (xpath =  "//div[@id='x-form-el-I9ApproverID']/div/img")
    private WebElement ImgTracker3 ;
    @FindBy (xpath = "//em/span/span[text()='Reset Password']")
    private WebElement EleResetPassword ;
    @FindBy (id =  "newpassword")
    private WebElement EleNewPassword ;
    @FindBy (xpath = "confirmpassword")
    private WebElement EleConfirmPasswordText;
    @FindBy (xpath = "//td/em/button[text()='Update Password']")
    private WebElement EleUpdatePassword ;
    @FindBy (xpath = "changepwdatlogin")
    private WebElement CheckChangePwdatLogin;
    @FindBy (xpath = "//div[@class='sw-form-msg-list x-hide-offsets']//b")
    private WebElement MsgofUpdatePwd;
    @FindBy (xpath = "//li[@id='tabcenter__pnl-groups']//span")
    private WebElement EleGroups ;

    @FindBy (xpath = "//div[@class='x-grid3-body']//div")
    private WebElement EleGroupNames;

    @FindBy (xpath = "//li[@id='tabcenter__pnl-tours']//span")
    private WebElement EleTours ;
    @FindBy (xpath =  "//div[@class='x-form-field-wrap x-form-field-trigger-wrap x-trigger-wrap-focus']/img")
    private WebElement ImgStartDate ;

    @FindBy (xpath =  "//input[@id='StartDate']")
    private WebElement StartDateText ;

    @FindBy (xpath =  "//input[@id='HireDate']")
    private WebElement HireDateText ;

    @FindBy (xpath = "//em/button[text()='Update Information']")
    private WebElement UpdateInformation ;

    @FindBy (xpath =  "//span[@class='ext-mb-text']")
    private WebElement IncorrectDate ;

    @FindBy (xpath = "//button[@class='x-btn-text']")
    private WebElement BtnOk ;

    @FindBy (xpath = "//em/button[text()='Delete']")
    private WebElement Deletebtn ;
    @FindBy (xpath = "//em/button[text()='Jump Start Tours']")
    private WebElement EleJumpstart;

    @FindBy (xpath = "//em/button[text()='Yes']")
    private WebElement EleYes;

    @FindBy (xpath = "//div[@class='sw-form-msg-list x-hide-offsets']/ul/li/b")
    private WebElement MessageRecordSussfull ;

    @FindBy (xpath = "//div[@class='x-form-invalid-icon']")
    private WebElement ValidationIcon;

    @FindBy (xpath = "//div[@class='sw-form-msg-list x-hide-offsets']/ul/li[2]/b/b")
    private WebElement MessageEmailSuccessfull ;
    @FindBy (xpath =  "//em/button[text()='Send Welcome Email']")
    private WebElement WelcomeEmail;

    @FindBy (xpath = "//div[@id='x-form-el-BirthDate']//img")
    private WebElement BirthdateImg  ;

    @FindBy (xpath =  "//td/em/button[text()='Today']")
    private WebElement TodayDate ;
    @FindBy (xpath =  "//button[text()='Update']")
    private WebElement UpdateBtn ;

    //Delete New Hire
    @FindBy(id = "ProcNewHires.UserID")
    private WebElement ProcNewHiresUserID;

    //Click on Search icon

        @FindBy(id= "ctrlBtnSearch")
    private WebElement SearchUserID ;

        @FindBy(id = "ctrlBtnRefresh")
    private WebElement ResetSearch;

    public OBSmnh(WebDriver webDriver) {
        super(webDriver);
    }

    public void NavigationtoOnboarding () throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try{
            clickAfterVisibilityOfElement(lnkKnowledgebase);
           // clickAfterVisibilityOfElement(OnbdConsole);
            clickAfterVisibilityOfElement(OnboardingConsole);
            Thread.sleep(3000);
            Reporter.log("Onboarding Console menu opened");
          System.out.println("Onboarding Console menu opened");

            Reporter.log("Onboarding Console menu opened successfully");
        }
        catch (Exception e)
        {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;

        }
    }
    public void CreateuserinMNH() throws IOException, InterruptedException
    {
         String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            webDriver.switchTo().defaultContent();
          //webDriver.switchTo().frame(mainframe);
           wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mainframe));
            System.out.println("Switched to frame");
            Thread.sleep(5000);
            clickAfterVisibilityOfElement(Managenewhire);
            Thread.sleep(5000);
            System.out.println("Switched to ob screen");
            Thread.sleep(1000);
            System.out.println("MNH menu opened");
           webDriver.switchTo().defaultContent();
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mainframe));
            System.out.println("Switched to mainframe");
           wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Onbdframe));
            System.out.println("Switched to onbdframe");
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(MNHUserlistframe));
            System.out.println("Switched to MNHUserlistframe");
            Thread.sleep(3000);
          // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainframe,Onbdframe,MNHUserlistframe"));
            //Thread.sleep(3000);
            clickAfterVisibilityOfElement(EleAdd);
            Thread.sleep(1000);
            clickAfterVisibilityOfElement(AddNewHireButton);
            System.out.println("Clicked on Add new hire Button");
           webDriver.switchTo().defaultContent();
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mainframe));
            System.out.println("Switched to Mainframe");
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Onbdframe));
           System.out.println("Switched to onbdframe");
           // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(MNHUserlistframe));
           //System.out.println("Switched to MNHUserlistframe");
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(MNHUserprofileframe));
           System.out.println("Switched to MNHUserprofileframe");
            //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainframe,Onbdframe,MNHUserprofileframe"));
            Reporter.log("Add New Hire Form is open as expected");
            System.out.println("Add new form opened successfully");
            Thread.sleep(3000);
            EleUserID.sendKeys(ConfigReader.getProperty("obnewhire"));
            System.out.println("Userid is addedd");
            ElePassword.sendKeys(ConfigReader.getProperty("obpassword"));
            EleConfirmPassword.sendKeys(ConfigReader.getProperty("obpassword"));
            EleFirstName.sendKeys(ConfigReader.getProperty("obfirstname") );
            EleMiddleName.sendKeys(ConfigReader.getProperty("obmiddlename") );
            EleLastName.sendKeys(ConfigReader.getProperty("oblastname") );
            EleEmail.sendKeys(ConfigReader.getProperty("obemail"));
            Thread.sleep(3000);
            EleAdd.click();
            Thread.sleep(3000);
            System.out.println("add button  is clicked");
            Thread.sleep(3000);
            if(DuplicateUserAlert.isDisplayed()) {
                if (DuplicateUserAlert.isDisplayed()) {
                    System.out.println("Duplicate user id");
                    Reporter.log("Duplicate user id");
                    webDriver.switchTo().defaultContent();
                    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mainframe));
                    System.out.println("Switched to Mainframe");
                    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Onbdframe));
                    System.out.println("Switched to onbdframe");
                    // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(MNHUserlistframe));
                    //System.out.println("Switched to MNHUserlistframe");
                    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(MNHUserprofileframe));
                    System.out.println("Switched to MNHUserprofileframe");
                    DuplicateUserAlertOK.click();
                }
            }
            else
            {
                System.out.println("MNH user is created as expected");
                //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainframe,"));
                webDriver.switchTo().defaultContent();
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mainframe));
                System.out.println("Switched to Mainframe");
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Onbdframe));
                System.out.println("Switched to onbdframe");
                // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(MNHUserlistframe));
                //System.out.println("Switched to MNHUserlistframe");
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(MNHUserprofileframe));
                System.out.println("Switched to MNHUserprofileframe");
                Thread.sleep(3000);
                if((EleOther.isDisplayed())&&(EleTracker.isDisplayed())&&(EleResetPassword.isDisplayed())&&(EleGroups.isDisplayed())&&(EleTours.isDisplayed()))
                {
                    System.out.println("All MNH tabs are visible");
                }
            }
        } catch (Exception e) {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }
    public void DeleteUserinMNH(String obnewhire) throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try
        {
            webDriver.switchTo().defaultContent();
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mainframe));
            System.out.println("Switched to frame");
            Thread.sleep(5000);
            clickAfterVisibilityOfElement(Managenewhire);
            Thread.sleep(5000);
            System.out.println("Switched to MNH screen");
            Thread.sleep(1000);
            System.out.println("MNH menu opened");
            webDriver.switchTo().defaultContent();
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mainframe));
            System.out.println("Switched to mainframe");
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Onbdframe));
            System.out.println("Switched to onbdframe");
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(MNHUserlistframe));
            System.out.println("Switched to MNHUserlistframe");
            Thread.sleep(3000);
            ProcNewHiresUserID.sendKeys(ConfigReader.getProperty("obnewhire"));
            SearchUserID.click();
            Thread.sleep(3000);
            List<WebElement>searchResult=webDriver.findElements(By.xpath("//*[@id='gridX3Report']//div/table/tbody/tr/td[1]/div"));
            List<WebElement>searchResultName=webDriver.findElements(By.xpath("//*[@id='gridX3Report']//div/table/tbody/tr/td[2]/div/a"));
            Boolean flag = false;
            for (WebElement searchoption: searchResult)
            {
                String strTextuserid = searchoption.getText();

                if ( strTextuserid== ConfigReader.getProperty("obnewhire"));
                {
                    System.out.println("User Deleted"+ strTextuserid);
                    flag = true;
                    System.out.println("flag Condition:"+ flag);
                    break;
                }

            }
            if (flag=true)
            {

                for (WebElement usernamelink:searchResultName)
                {
                    usernamelink.click();

                    Thread.sleep(5000);
                }
            }
            //ExtendedAction.FrameToBeAvailableAndSwitchToIt(HrsdBrowserFactory._driver, "mainframe,Onbd-user-c-main,userprofile,common");
            webDriver.switchTo().defaultContent();
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mainframe));
            System.out.println("Switched to Mainframe");
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Onbdframe));
            System.out.println("Switched to onbdframe");
            // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(MNHUserlistframe));
            //System.out.println("Switched to MNHUserlistframe");
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(MNHUserprofileframe));
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(MNHcommonframe));
            System.out.println("Switched to MNHUserprofileframe to delete user");
            Deletebtn.click();

            Thread.sleep(3000);
            EleYes.click();
            Thread.sleep(5000);
            System.out.println("User Deleted Successfully:"+ obnewhire);

        }catch (Exception e)
        {
            Reporter.log(nameOfCurrMethod +"\n"+e.toString());
            System.out.println(e.getMessage());
            ScreenPrints(webDriver);
            throw e;

        }
    }
}
