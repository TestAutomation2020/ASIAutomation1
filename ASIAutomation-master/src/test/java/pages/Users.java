package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;
import util.ConfigReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Users extends BasePage {

    @FindBy(how = How.XPATH, using = "//span[text()='Add New']")
    private WebElement AddNew;

    @FindBy(how = How.XPATH, using = "//input[@name='userid']")
    private WebElement txtUserid;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Apply')]")
    private WebElement ApplyBtn;

    @FindBy(how = How.XPATH, using = "(//div[@class='x-grid-cell-inner '])[1]")
    private WebElement Userlink;

    @FindBy(how = How.XPATH, using = "//input[@name='accountid']")
    private WebElement txtaccountid;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    private WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//input[@name='confirmpassword']")
    private WebElement txtConfirmPassword;

    @FindBy(how = How.XPATH, using = "//input[@name='prefix']")
    private WebElement txtPrefix;

    @FindBy(how = How.XPATH, using = "(//input[@name='firstname'])[2]")
    private WebElement txtFirstname;

    @FindBy(how = How.XPATH, using = "//input[@name='middlename']")
    private WebElement txtMiddlename;

    @FindBy(how = How.XPATH, using = "(//input[@name='lastname'])[2]")
    private WebElement txtLastname;

    @FindBy(how = How.XPATH, using = "//input[@name='suffix']")
    private WebElement txtSuffix;

    @FindBy(how = How.XPATH, using = "//input[@name='emailaddress']")
    private WebElement txtEmailaddress;

    @FindBy(how = How.XPATH, using = "//input[@name='levelnumber']")
    private WebElement txtLevelnumber;

    @FindBy(how = How.XPATH, using = "//li[text()='8-Portal Admin']")
    private WebElement txtLevelnumber_select_8;

    @FindBy(how = How.XPATH, using = "//input[@name='startpageid']")
    private WebElement Click_Startpage;

    @FindBy(how = How.XPATH, using = "//li[text()='Home']")
    private WebElement Select_Startpage;

    @FindBy(how = How.XPATH, using = "//input[@name='useripaddress']")
    private WebElement txtUseripaddress;

    @FindBy(how = How.XPATH, using = "//input[@name='timezoneiana']")
    private WebElement Click_Timezone;

    @FindBy(how = How.XPATH, using = "//input[@value='(GMT+05:30) Asia/Calcutta']")
    private WebElement Select_AsiaCalcutta;

   // @FindBy(how = How.XPATH, using = "//li[text()='(GMT+05:30) Asia/Calcutta']")
   // private WebElement Select_AsiaCalcutta;

    @FindBy(how = How.XPATH, using = "//input[@name='locale']")
    private WebElement Click_Locale;

    @FindBy(how = How.XPATH, using = "//li[text()='en-US']")
    private WebElement Select_EnUS;

    //Personal Information
    @FindBy(how = How.XPATH, using = "(//input[@name='ssn'])[1]")
    private WebElement txtSSN;

    @FindBy(how = How.XPATH, using = "(//input[@name='password'])[2]")
    private WebElement txtPassword2;

    @FindBy(how = How.XPATH, using = "(//span[contains(.,'Validate')])[3]")
    private WebElement Click_Validate;

    @FindBy(how = How.XPATH, using = "//textarea[@name='addressline1']")
    private WebElement addressLine1;

    @FindBy(how = How.XPATH, using = "//textarea[@name='addressline2']")
    private WebElement addressLine2;

    @FindBy(how = How.XPATH, using = "//input[@name='city']")
    private WebElement txtCity;

    @FindBy(how = How.XPATH, using = "//input[@name='state']")
    private WebElement txtState;

    @FindBy(how = How.XPATH, using = "//input[@name='country']")
    private WebElement txtCountry;

    @FindBy(how = How.XPATH, using = "//input[@name='zipcode']")
    private WebElement txtZipcode;

    @FindBy(how = How.XPATH, using = "//input[@name='homephone']")
    private WebElement txtHomephone;

    @FindBy(how = How.XPATH, using = "//input[@name='gendercode']")
    private WebElement txtGendercode;

    @FindBy(how = How.XPATH, using = "//input[@name='birthdate']")
    private WebElement birthDate;

    @FindBy(how = How.XPATH, using = "//input[@name='spousename']")
    private WebElement txtSpousename;

    @FindBy(how = How.XPATH, using = "//input[@name='cellphone']")
    private WebElement txtCellphone;

    //Employee Information
    @FindBy(how = How.XPATH, using = "//input[@name='company']")
    private WebElement txtCompany;

    @FindBy(how = How.XPATH, using = "//input[@name='businessunit']")
    private WebElement txtBusinessunit;

    @FindBy(how = How.XPATH, using = "//input[@name='costcenter']")
    private WebElement txtCostcenter;

    @FindBy(how = How.XPATH, using = "//input[@name='managerid']")
    private WebElement txtManagerid;

    @FindBy(how = How.XPATH, using = "//input[@name='onboardingid']")
    private WebElement txtOnboardingid;

    @FindBy(how = How.XPATH, using = "//input[@name='employeenumber']")
    private WebElement txtEmployeenumber;

    @FindBy(how = How.XPATH, using = "//input[@name='jobtitle']")
    private WebElement txtJobtitle;

    @FindBy(how = How.XPATH, using = "//input[@name='officelocation']")
    private WebElement txtOfficelocation;

    @FindBy(how = How.XPATH, using = "//input[@name='location']")
    private WebElement txtLocation;

    @FindBy(how = How.XPATH, using = "//input[@name='location2']")
    private WebElement txtLocation2;

    @FindBy(how = How.XPATH, using = "//input[@name='location3']")
    private WebElement txtLocation3;

    @FindBy(how = How.XPATH, using = "//input[@name='location4']")
    private WebElement txtLocation4;

    @FindBy(how = How.XPATH, using = "//input[@name='hiredate']")
    private WebElement hireDate;

    @FindBy(how = How.XPATH, using = "//input[@name='startdate']")
    private WebElement startDate;

    @FindBy(how = How.XPATH, using = "//input[@name='salary']")
    private WebElement txtSalary;

    @FindBy(how = How.XPATH, using = "//input[@name='officephone']")
    private WebElement txtOfficephone;

    @FindBy(how = How.XPATH, using = "//input[@name='officefax']")
    private WebElement txtOfficefax;

    @FindBy(how = How.XPATH, using = "//input[@name='employeetype']")
    private WebElement txtEmployeetype;

    @FindBy(how = How.XPATH, using = "//input[@name='division']")
    private WebElement txtDivision;

    @FindBy(how = How.XPATH, using = "//input[@name='division2']")
    private WebElement txtDivision2;

    @FindBy(how = How.XPATH, using = "//input[@name='division3']")
    private WebElement txtDivision3;

    @FindBy(how = How.XPATH, using = "//input[@name='division4']")
    private WebElement txtDivision4;

    @FindBy(how = How.XPATH, using = "//input[@name='hrstatus']")
    private WebElement txtHrstatus;

    @FindBy(how = How.XPATH, using = "//input[@name='fulltime']")
    private WebElement txtFulltime;

    @FindBy(how = How.XPATH, using = "//input[@name='classification']")
    private WebElement txtClassification;

    @FindBy(how = How.XPATH, using = "//input[@name='classification2']")
    private WebElement txtClassification2;

    @FindBy(how = How.XPATH, using = "//input[@name='classification3']")
    private WebElement txtClassification3;

    @FindBy(how = How.XPATH, using = "//input[@name='classification4']")
    private WebElement txtClassification4;

    @FindBy(how = How.XPATH, using = "//input[@name='terminationdate']")
    private WebElement terminationDate;

    @FindBy(how = How.XPATH, using = "//input[@name='erclocationcode']")
    private WebElement txtErclocationcode;

    @FindBy(how = How.XPATH, using = "//input[@name='role1']")
    private WebElement txtRole1;

    @FindBy(how = How.XPATH, using = "//input[@name='role2']")
    private WebElement txtRole2;

    @FindBy(how = How.XPATH, using = "//input[@name='role3']")
    private WebElement txtRole3;

    @FindBy(how = How.XPATH, using = "//input[@name='role4']")
    private WebElement txtRole4;

    @FindBy(how = How.XPATH, using = "//input[@name='role5']")
    private WebElement txtRole5;

    @FindBy(how = How.XPATH, using = "//input[@name='role6']")
    private WebElement txtRole6;

    @FindBy(how = How.XPATH, using = "//input[@name='servicerep']")
    private WebElement txtServicerep;

    @FindBy(how = How.XPATH, using = "//input[@name='union']")
    private WebElement txtUnion;

    //Custom Fields
    @FindBy(how = How.XPATH, using = "//input[@name='custom1']")
    private WebElement txtCustom1;

    @FindBy(how = How.XPATH, using = "//input[@name='custom2']")
    private WebElement txtCustom2;

    @FindBy(how = How.XPATH, using = "//input[@name='custom3']")
    private WebElement txtCustom3;

    @FindBy(how = How.XPATH, using = "//input[@name='custom4']")
    private WebElement txtCustom4;

    @FindBy(how = How.XPATH, using = "//input[@name='custom5']")
    private WebElement txtCustom5;

    @FindBy(how = How.XPATH, using = "//input[@name='custom6']")
    private WebElement txtCustom6;

    @FindBy(how = How.XPATH, using = "//input[@name='custom7']")
    private WebElement txtCustom7;

    @FindBy(how = How.XPATH, using = "//input[@name='custom8']")
    private WebElement txtCustom8;

    @FindBy(how = How.XPATH, using = "//input[@name='custom9']")
    private WebElement txtCustom9;

    @FindBy(how = How.XPATH, using = "//input[@name='custom10']")
    private WebElement txtCustom10;

    @FindBy(how = How.XPATH, using = "//input[@name='custom11']")
    private WebElement txtCustom11;

    @FindBy(how = How.XPATH, using = "//input[@name='custom12']")
    private WebElement txtCustom12;

    @FindBy(how = How.XPATH, using = "(//textarea[@name='rulestring'])[1]")
    private WebElement txtRuleString;

    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Save']/ancestor::a")
    private WebElement Usersave;

    @FindBy(how = How.XPATH, using = "//div[text()='Added Successfully']")
    private WebElement AddedSuccessfully;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Clear')]")
    private WebElement BtnClear;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Apply')]")
    private WebElement BtnApply;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'userid')]")
    private WebElement txtUserID;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'firstname')]")
    private WebElement txtFirstName;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'lastname')]")
    private WebElement txtLastName;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'email')]")
    private WebElement txtEmail;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'group')]")
    private WebElement dropdownGroup;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'startpage')]")
    private WebElement dropdownStartpage;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'blocked')]")
    private WebElement dropdownBlocked;

    @FindBy(xpath = "//li[text()='Home']")
    private WebElement selectStartPage;

    @FindBy(xpath = "//li[text()='Off']")
    private WebElement selectBlocked;

    @FindBy(xpath = "//li[text()='Basic Access']")
    private WebElement selectBasicAccess;

    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Update']/ancestor::a")
    private WebElement Userupdate;

    @FindBy(how = How.XPATH, using = "//div[text()='Updated Successfully']")
    private WebElement UpdatedSuccessfully;

    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Delete']/ancestor::a")
    private WebElement Userdelete;

    @FindBy(how = How.XPATH, using = "//div[text()='Deleted Successfully']")
    private WebElement DeletedSuccessfully;

    @FindBy(how = How.XPATH, using = "(//div[@class='x-grid-cell-inner '])[1]")
    private WebElement UserRptLink1;

    @FindBy(how = How.XPATH, using = "(//div[@class='x-grid-cell-inner x-grid-checkcolumn-cell-inner'])[1]")
    private WebElement UserRptChkBox1;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnEl'][contains(.,'Ok')]")
    private WebElement BtnOK;

    @FindBy(how = How.XPATH, using = "//div[@class='x-grid-empty']")
    private WebElement Emptygrid;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'(0 Result)')]")
    private WebElement Emptyresult;

    @FindBy(how = How.NAME, using = "userid")
    private WebElement useridfield;

    @FindBy(how = How.XPATH, using = "(//div[@class='x-grid-cell-inner '])[1]")
    private WebElement testuser1;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Block')]")
    private WebElement BtnBlock;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnEl'][contains(.,'Submit')]")
    private WebElement BtnSubmit;

    @FindBy(how = How.XPATH, using = "//li[text()='Unblock Users']")
    private WebElement Select_UnblockUsers;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'hcm-dropdown')]")
    private WebElement Select_Dropdown;

    @FindBy(how = How.XPATH, using = "//span[@id='PageHeaderLogout-btnEl']")
    private WebElement Logoutlink;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Sign Out')]")
    private WebElement Signout;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Forgot Your Password?')]")
    private WebElement Forgotpswdlink;

    @FindBy(how = How.XPATH, using = "(//span[contains(.,'User ID')])[2]")
    private WebElement UserIDtxt;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Account is blocked')]")
    private WebElement AccountBlockMsg;

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase']")
    private WebElement txtKnowledgebase;

    @FindBy(how = How.NAME, using = "txtUserId")
    private static WebElement txtUserName;

    @FindBy(how = How.NAME, using = "txtOrganization")
    private WebElement txtOrganization;

    @FindBy(how = How.NAME, using = "btnLogin")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//li[text()='onboarding']")
    private WebElement Select_Startpage_Onboarding;

    @FindBy(how = How.XPATH, using = "//li[text()='Offboarding']")
    private WebElement Select_Startpage_Offboarding;

    @FindBy(how = How.XPATH, using = "//li[text()='Home']")
    private WebElement Select_Startpage_Home;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Clear')]")
    private WebElement ClearBtn;

    @FindBy(how = How.XPATH, using = "//span[@id='PageHeaderLogout-btnEl']")
    private WebElement Logout;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Sign Out')]")
    private WebElement SignOut;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Onboarding Start Page')]")
    private WebElement txtOnboarding;

    @FindBy(how = How.XPATH, using = "//iframe[@class='x-component x-fit-item x-component-default']")
    private WebElement Onboardingiframe;

    @FindBy(how = How.XPATH, using = "//a[@href='#'][contains(.,'imran admin')]")
    private WebElement mobilelink;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnEl'][contains(.,'Copy to Clipboard')]")
    private WebElement clipboardlink;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Edit Mobile Profile')]")
    private WebElement EditMobileProfile;

    @FindBy(how = How.NAME, using = "txtPassword")
    private WebElement txtLoginPassword;

    @FindBy(how = How.NAME, using = "txtOrganization")
    private WebElement txtLoginOrganization;

    @FindBy(how = How.XPATH, using = "//div[@data-ref='innerCt'][contains(.,'Duplicate Entry! Please try again with different Inputs.')]")
    private WebElement DuplicateEntryMsg;

    @FindBy(how = How.XPATH, using = "//div[@data-ref='inputEl'][contains(.,'2021')]")
    private WebElement EditDate;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'User Properties')]")
    private WebElement UserPropertiesmenu;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Password')]")
    private WebElement PasswordMenu;

    @FindBy(how = How.XPATH, using = "(//span[contains(.,'Save')])[6]")
    private WebElement SaveBtn;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'relativeurl')]")
    private WebElement relativeURL;

    @FindBy(how = How.XPATH, using = "//div[text()='Password has been updated successfully and email has been sent to the user ']")
    private WebElement PasswordUpdatedSuccessfully;

    @FindBy(how = How.XPATH, using = "//textarea[contains(@name,'createdlink')]")
    private WebElement Link;

    @FindBy(how = How.XPATH, using = "(//label[contains(@class,'x-form-cb-label x-form-cb-label-default x-form-cb-label-after  ')])[4]")
    private WebElement PasswordSwitch;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'newpassword')]")
    private WebElement newPassword;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'confirmpswd')]")
    private WebElement confirmPassword;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Update Password')]")
    private WebElement UpdatePassword;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'txtNewPassword')]")
    private WebElement txtNewPwd;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'txtRetypeNewPassword')]")
    private WebElement txtRetypeNewPwd;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'btnChangePassword')]")
    private WebElement btnChangePwd;

    @FindBy(how = How.XPATH, using = "//li[text()='hr-HR']")
    private WebElement Select_hrHR;

    @FindBy(how = How.XPATH, using = "//li[text()='bg-BG']")
    private WebElement Select_bgBG;

    @FindBy(how = How.XPATH, using = "//span[text()='Administration']")
    private WebElement txtAdministration;

    @FindBy(how = How.XPATH, using = "//span[text()='Knowledgebase Admin']")
    private WebElement txtKnowledgebaseAdmin;

    @FindBy(how = How.XPATH, using = "//span[text()='Localization']")
    private WebElement txtLocalization;

    @FindBy(how = How.XPATH, using = "//span[text()='Locales']")
    private WebElement txtLocales;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Ispiši')]")
    private WebElement txtPrintLabel;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Odjava')]")
    private WebElement txt_hrHR_Signout;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Изход')]")
    private WebElement txt_bgBG_Signout;

    @FindBy(how = How.XPATH, using = "(//span[contains(@class,'x-grid-checkcolumn x-grid-checkcolumn-checked')])[1]")
    private WebElement checkedbox_localebgBG;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[1]")
    private WebElement uncheckedbox_localebgBG;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Update')]")
    private WebElement BtnUpdate_locale;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Печат')]")
    private WebElement BtnPrint_bgBG_locale;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Print')]")
    private WebElement BtnPrint_enUS_locale;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Sign On Link')]")
    private WebElement SignOnlink;

    @FindBy(how = How.XPATH, using = "//div[text()='The Sign-On Link has been created successfully.']")
    private WebElement SignOnLinkAddedSuccessfully;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Details')]")
    private WebElement PropertiesDetails;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Groups')]")
    private WebElement PropertiesGroups;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Emulation')]")
    private WebElement PropertiesEmulation;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Elections')]")
    private WebElement PropertiesElections;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Mobile Profile')]")
    private WebElement PropertiesMobileProfile;
    //PasswordMenu
    //SignOnlink

    @FindBy(how = How.XPATH, using = "//div[@class='x-component x-fieldset-header-text x-component-default'][contains(.,'Account Information')]")
    private WebElement DetailsAccountInformation;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textInnerEl'][contains(.,'Description')]")
    private WebElement PropertiesDescription;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='textEl'][contains(.,'Description')]")
    private WebElement PropertiesEmail;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Add Election')]")
    private WebElement AddElection;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Stop Emulation')]")
    private WebElement StopEmulation;

    @FindBy(how = How.XPATH, using = "(//span[@data-ref='btnEl'][contains(.,'Delete')])[3]")
    private WebElement DELETEBtn;











    public Users(WebDriver webDriver) {
        super(webDriver);
    }

    public void UserAdd() throws InterruptedException, IOException
    {   String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try
        {
                Reporter.log("---------- Add User Script ----------");
                clickwhenready(AddNew);
                Reporter.log("Add button clicked");
                //ScreenPrints(webDriver);
                clickwhenready(txtaccountid);
                txtaccountid.sendKeys(ConfigReader.getProperty("accountid"));
                clickwhenready(txtPassword);
                txtPassword.sendKeys(ConfigReader.getProperty("userpassword"));
                clickwhenready(txtConfirmPassword);
                txtConfirmPassword.sendKeys(ConfigReader.getProperty("userconfirmpassword"));
                clickwhenready(txtPrefix);
                txtPrefix.sendKeys(ConfigReader.getProperty("prefix"));
                clickwhenready(txtFirstname);
                txtFirstname.sendKeys(ConfigReader.getProperty("firstname"));
                clickwhenready(txtMiddlename);
                txtMiddlename.sendKeys(ConfigReader.getProperty("middlename"));
                clickwhenready(txtLastname);
                txtLastname.sendKeys(ConfigReader.getProperty("lastname"));
                clickwhenready(txtSuffix);
                txtSuffix.sendKeys(ConfigReader.getProperty("suffix"));
                clickwhenready(txtEmailaddress);
                txtEmailaddress.sendKeys(ConfigReader.getProperty("emailaddress"));
                clickwhenready(txtLevelnumber);
                clickwhenready(txtLevelnumber_select_8);
                clickwhenready(Click_Startpage);
                clickwhenready(Select_Startpage);
                clickwhenready(txtUseripaddress);
                txtUseripaddress.sendKeys(ConfigReader.getProperty("useripaddress"));
                Click_Timezone.click();
                Thread.sleep(2000);
                List<WebElement> list = webDriver.findElements(By.xpath("//ul[@class='x-list-plain']/li"));
                ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView(true);", list.get(228));
                list.get(228).click();
                //System.out.println(list.size());
                Thread.sleep(2000);
                clickwhenready(Click_Locale);
                clickwhenready(Select_EnUS);

                //Personal Information
                clickwhenready(txtSSN);
                Thread.sleep(2000);
                clickwhenready(txtPassword2);
                txtPassword2.sendKeys(ConfigReader.getProperty("userpassword2"));
                clickwhenready(Click_Validate);
                Thread.sleep(2000);
                clickwhenready(txtSSN);
                txtSSN.sendKeys(ConfigReader.getProperty("ssn"));
                clickwhenready(addressLine1);
                addressLine1.sendKeys(ConfigReader.getProperty("addressLine1"));
                clickwhenready(addressLine2);
                addressLine2.sendKeys(ConfigReader.getProperty("addressLine2"));
                clickwhenready(txtCity);
                txtCity.sendKeys(ConfigReader.getProperty("city"));
                clickwhenready(txtState);
                txtState.sendKeys(ConfigReader.getProperty("state"));
                clickwhenready(txtCountry);
                txtCountry.sendKeys(ConfigReader.getProperty("country"));
                clickwhenready(txtZipcode);
                txtZipcode.sendKeys(ConfigReader.getProperty("zipcode"));
                clickwhenready(txtHomephone);
                txtHomephone.sendKeys(ConfigReader.getProperty("homephone"));
                clickwhenready(txtGendercode);
                txtGendercode.sendKeys(ConfigReader.getProperty("gender"));
                clickwhenready(birthDate);
                birthDate.sendKeys(ConfigReader.getProperty("birthdate"));
                clickwhenready(txtSpousename);
                txtSpousename.sendKeys(ConfigReader.getProperty("spouse"));
                clickwhenready(txtCellphone);
                txtCellphone.sendKeys(ConfigReader.getProperty("cellphone"));

                //Employee Information
                clickwhenready(txtCompany);
                txtCompany.sendKeys(ConfigReader.getProperty("company"));
                clickwhenready(txtBusinessunit);
                txtBusinessunit.sendKeys(ConfigReader.getProperty("businessunit"));
                clickwhenready(txtCostcenter);
                txtCostcenter.sendKeys(ConfigReader.getProperty("costcenter"));
                clickwhenready(txtManagerid);
                txtManagerid.sendKeys(ConfigReader.getProperty("managerid"));
                clickwhenready(txtOnboardingid);
                txtOnboardingid.sendKeys(ConfigReader.getProperty("onboardingid"));
                clickwhenready(txtEmployeenumber);
                txtEmployeenumber.sendKeys(ConfigReader.getProperty("employeenumber"));
                clickwhenready(txtJobtitle);
                txtJobtitle.sendKeys(ConfigReader.getProperty("jobtitle"));
                clickwhenready(txtOfficelocation);
                txtOfficelocation.sendKeys(ConfigReader.getProperty("officelocation"));
                clickwhenready(txtLocation);
                txtLocation.sendKeys(ConfigReader.getProperty("location"));
                clickwhenready(txtLocation2);
                txtLocation2.sendKeys(ConfigReader.getProperty("location2"));
                clickwhenready(txtLocation3);
                txtLocation3.sendKeys(ConfigReader.getProperty("location3"));
                clickwhenready(txtLocation4);
                txtLocation4.sendKeys(ConfigReader.getProperty("location4"));
                clickwhenready(hireDate);
                hireDate.sendKeys(ConfigReader.getProperty("hiredate"));
                clickwhenready(startDate);
                startDate.sendKeys(ConfigReader.getProperty("startdate"));
                clickwhenready(txtSalary);
                txtSalary.sendKeys(ConfigReader.getProperty("salary"));
                clickwhenready(txtOfficephone);
                txtOfficephone.sendKeys(ConfigReader.getProperty("officephone"));
                clickwhenready(txtOfficefax);
                txtOfficefax.sendKeys(ConfigReader.getProperty("officefax"));
                clickwhenready(txtEmployeetype);
                txtEmployeetype.sendKeys(ConfigReader.getProperty("employeetype"));
                clickwhenready(txtDivision);
                txtDivision.sendKeys(ConfigReader.getProperty("division"));
                clickwhenready(txtDivision2);
                txtDivision2.sendKeys(ConfigReader.getProperty("division2"));
                clickwhenready(txtDivision3);
                txtDivision3.sendKeys(ConfigReader.getProperty("division3"));
                clickwhenready(txtDivision4);
                txtDivision4.sendKeys(ConfigReader.getProperty("division4"));
                clickwhenready(txtHrstatus);
                txtHrstatus.sendKeys(ConfigReader.getProperty("hrstatus"));
                clickwhenready(txtFulltime);
                txtFulltime.sendKeys(ConfigReader.getProperty("fulltime"));
                clickwhenready(txtClassification);
                txtClassification.sendKeys(ConfigReader.getProperty("classification"));
                clickwhenready(txtClassification2);
                txtClassification2.sendKeys(ConfigReader.getProperty("classification2"));
                clickwhenready(txtClassification3);
                txtClassification3.sendKeys(ConfigReader.getProperty("classification3"));
                clickwhenready(txtClassification4);
                txtClassification4.sendKeys(ConfigReader.getProperty("classification4"));
                clickwhenready(terminationDate);
                terminationDate.sendKeys(ConfigReader.getProperty("terminationdate"));
                clickwhenready(txtErclocationcode);
                txtErclocationcode.sendKeys(ConfigReader.getProperty("erclocationcode"));
                clickwhenready(txtRole1);
                txtRole1.sendKeys(ConfigReader.getProperty("role1"));
                clickwhenready(txtRole2);
                txtRole2.sendKeys(ConfigReader.getProperty("role2"));
                clickwhenready(txtRole3);
                txtRole3.sendKeys(ConfigReader.getProperty("role3"));
                clickwhenready(txtRole4);
                txtRole4.sendKeys(ConfigReader.getProperty("role4"));
                clickwhenready(txtRole5);
                txtRole5.sendKeys(ConfigReader.getProperty("role5"));
                clickwhenready(txtRole6);
                txtRole6.sendKeys(ConfigReader.getProperty("role6"));
                clickwhenready(txtServicerep);
                txtServicerep.sendKeys(ConfigReader.getProperty("servicerep"));
                clickwhenready(txtUnion);
                txtUnion.sendKeys(ConfigReader.getProperty("union"));

                //Custom Fields
                clickwhenready(txtCustom1);
                txtCustom1.sendKeys(ConfigReader.getProperty("custom1"));
                clickwhenready(txtCustom2);
                txtCustom2.sendKeys(ConfigReader.getProperty("custom2"));
                clickwhenready(txtCustom3);
                txtCustom3.sendKeys(ConfigReader.getProperty("custom3"));
                clickwhenready(txtCustom4);
                txtCustom4.sendKeys(ConfigReader.getProperty("custom4"));
                clickwhenready(txtCustom5);
                txtCustom5.sendKeys(ConfigReader.getProperty("custom5"));
                clickwhenready(txtCustom6);
                txtCustom6.sendKeys(ConfigReader.getProperty("custom6"));
                clickwhenready(txtCustom7);
                txtCustom7.sendKeys(ConfigReader.getProperty("custom7"));
                clickwhenready(txtCustom8);
                txtCustom8.sendKeys(ConfigReader.getProperty("custom8"));
                clickwhenready(txtCustom9);
                txtCustom9.sendKeys(ConfigReader.getProperty("custom9"));
                clickwhenready(txtCustom10);
                txtCustom10.sendKeys(ConfigReader.getProperty("custom10"));
                clickwhenready(txtCustom11);
                txtCustom11.sendKeys(ConfigReader.getProperty("custom11"));
                clickwhenready(txtCustom12);
                txtCustom12.sendKeys(ConfigReader.getProperty("custom12"));
                clickwhenready(txtRuleString);
                txtRuleString.sendKeys(ConfigReader.getProperty("rulestring"));
                clickwhenready(Usersave);
                Reporter.log("Save button clicked.");
                Thread.sleep(2000);

                if (AddedSuccessfully.isDisplayed())
                {
                    Reporter.log("Add successfully message displayed");
                    Thread.sleep(3000);
                    clickwhenready(txtUserid);
                    txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
                    String ActualUser = ConfigReader.getProperty(("useridfilter"));
                    clickwhenready(ApplyBtn);
                    Reporter.log("Apply button clicked");
                    Thread.sleep(5000);
                    String NewlyAddedUser = Userlink.getText();
                    System.out.println(NewlyAddedUser);
                    //Assert.assertEquals(ActualUser,NewlyAddedUser);
                    if (ActualUser.equals(NewlyAddedUser))
                    {
                        Reporter.log("User compare successful");
                        System.out.println(ActualUser);
                        clickwhenready(Userlink);
                        Reporter.log("Username link clicked");
                        Reporter.log("---------- End of Add User Script ----------");
                        Thread.sleep(5000);

                    }
                    ScreenPrints(webDriver);
                  }
                ScreenPrints(webDriver);
            }
        catch (Exception e)
        {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
           throw e;
        }
    }

    public void UpdateUser() throws IOException, InterruptedException {    String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try
        {
            // clearAfterVisibilityOfElement(txtUserid);
            // txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
            // clickwhenready(ApplyBtn);
            // Thread.sleep(3000);
            //  clickwhenready(Userlink);
            Reporter.log("---------- Update User Script ----------");
            Reporter.log("Update user details started");
            Thread.sleep(5000);
            clearAfterVisibilityOfElement(txtPrefix);
            txtPrefix.sendKeys(ConfigReader.getProperty("prefix"));
            clearAfterVisibilityOfElement(txtFirstname);
            txtFirstname.sendKeys(ConfigReader.getProperty("firstname"));
            clearAfterVisibilityOfElement(txtMiddlename);
            txtMiddlename.sendKeys(ConfigReader.getProperty("middlename"));
            clearAfterVisibilityOfElement(txtLastname);
            txtLastname.sendKeys(ConfigReader.getProperty("lastname"));
            clearAfterVisibilityOfElement(txtSuffix);
            txtSuffix.sendKeys(ConfigReader.getProperty("suffix"));
            clearAfterVisibilityOfElement(txtEmailaddress);
            txtEmailaddress.sendKeys(ConfigReader.getProperty("emailaddress"));
            clickwhenready(txtLevelnumber);
            clickwhenready(txtLevelnumber_select_8);
            clickwhenready(Click_Startpage);
            clickwhenready(Select_Startpage);
            clearAfterVisibilityOfElement(txtUseripaddress);
            txtUseripaddress.sendKeys(ConfigReader.getProperty("useripaddress"));
            Click_Timezone.click();
            Thread.sleep(2000);
            List<WebElement> list = webDriver.findElements(By.xpath("//ul[@class='x-list-plain']/li"));
            ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView(true);", list.get(228));
            list.get(228).click();
            Thread.sleep(2000);
            clickwhenready(Click_Locale);
            clickwhenready(Select_EnUS);

            //Personal Information
            clickwhenready(txtSSN);
            Thread.sleep(2000);
            clearAfterVisibilityOfElement(txtPassword2);
            txtPassword2.sendKeys(ConfigReader.getProperty("userpassword2"));
            clickwhenready(Click_Validate);
            Thread.sleep(2000);
            clearAfterVisibilityOfElement(txtSSN);
            txtSSN.sendKeys(ConfigReader.getProperty("ssn"));
            clearAfterVisibilityOfElement(addressLine1);
            addressLine1.sendKeys(ConfigReader.getProperty("addressLine1"));
            clearAfterVisibilityOfElement(addressLine2);
            addressLine2.sendKeys(ConfigReader.getProperty("addressLine2"));
            clearAfterVisibilityOfElement(txtCity);
            txtCity.sendKeys(ConfigReader.getProperty("city"));
            clearAfterVisibilityOfElement(txtState);
            txtState.sendKeys(ConfigReader.getProperty("state"));
            clearAfterVisibilityOfElement(txtCountry);
            txtCountry.sendKeys(ConfigReader.getProperty("country"));
            clearAfterVisibilityOfElement(txtZipcode);
            txtZipcode.sendKeys(ConfigReader.getProperty("zipcode"));
            clearAfterVisibilityOfElement(txtHomephone);
            txtHomephone.sendKeys(ConfigReader.getProperty("homephone"));
            clearAfterVisibilityOfElement(txtGendercode);
            txtGendercode.sendKeys(ConfigReader.getProperty("gender"));
            clearAfterVisibilityOfElement(birthDate);
            birthDate.sendKeys(ConfigReader.getProperty("birthdate"));
            clearAfterVisibilityOfElement(txtSpousename);
            txtSpousename.sendKeys(ConfigReader.getProperty("spouse"));
            clearAfterVisibilityOfElement(txtCellphone);
            txtCellphone.sendKeys(ConfigReader.getProperty("cellphone"));

            //Employee Information
            clearAfterVisibilityOfElement(txtCompany);
            txtCompany.sendKeys(ConfigReader.getProperty("company"));
            clearAfterVisibilityOfElement(txtBusinessunit);
            txtBusinessunit.sendKeys(ConfigReader.getProperty("businessunit"));
            clearAfterVisibilityOfElement(txtCostcenter);
            txtCostcenter.sendKeys(ConfigReader.getProperty("costcenter"));
            clearAfterVisibilityOfElement(txtManagerid);
            txtManagerid.sendKeys(ConfigReader.getProperty("managerid"));
            clearAfterVisibilityOfElement(txtOnboardingid);
            txtOnboardingid.sendKeys(ConfigReader.getProperty("onboardingid"));
            clearAfterVisibilityOfElement(txtEmployeenumber);
            txtEmployeenumber.sendKeys(ConfigReader.getProperty("employeenumber"));
            clearAfterVisibilityOfElement(txtJobtitle);
            txtJobtitle.sendKeys(ConfigReader.getProperty("jobtitle"));
            clearAfterVisibilityOfElement(txtOfficelocation);
            txtOfficelocation.sendKeys(ConfigReader.getProperty("officelocation"));
            clearAfterVisibilityOfElement(txtLocation);
            txtLocation.sendKeys(ConfigReader.getProperty("location"));
            clearAfterVisibilityOfElement(txtLocation2);
            txtLocation2.sendKeys(ConfigReader.getProperty("location2"));
            clearAfterVisibilityOfElement(txtLocation3);
            txtLocation3.sendKeys(ConfigReader.getProperty("location3"));
            clearAfterVisibilityOfElement(txtLocation4);
            txtLocation4.sendKeys(ConfigReader.getProperty("location4"));
            clearAfterVisibilityOfElement(hireDate);
            hireDate.sendKeys(ConfigReader.getProperty("hiredate"));
            clearAfterVisibilityOfElement(startDate);
            startDate.sendKeys(ConfigReader.getProperty("startdate"));
            clearAfterVisibilityOfElement(txtSalary);
            txtSalary.sendKeys(ConfigReader.getProperty("salary"));
            clearAfterVisibilityOfElement(txtOfficephone);
            txtOfficephone.sendKeys(ConfigReader.getProperty("officephone"));
            clearAfterVisibilityOfElement(txtOfficefax);
            txtOfficefax.sendKeys(ConfigReader.getProperty("officefax"));
            clearAfterVisibilityOfElement(txtEmployeetype);
            txtEmployeetype.sendKeys(ConfigReader.getProperty("employeetype"));
            clearAfterVisibilityOfElement(txtDivision);
            txtDivision.sendKeys(ConfigReader.getProperty("division"));
            clearAfterVisibilityOfElement(txtDivision2);
            txtDivision2.sendKeys(ConfigReader.getProperty("division2"));
            clearAfterVisibilityOfElement(txtDivision3);
            txtDivision3.sendKeys(ConfigReader.getProperty("division3"));
            clearAfterVisibilityOfElement(txtDivision4);
            txtDivision4.sendKeys(ConfigReader.getProperty("division4"));
            clearAfterVisibilityOfElement(txtHrstatus);
            txtHrstatus.sendKeys(ConfigReader.getProperty("hrstatus"));
            clearAfterVisibilityOfElement(txtFulltime);
            txtFulltime.sendKeys(ConfigReader.getProperty("fulltime"));
            clearAfterVisibilityOfElement(txtClassification);
            txtClassification.sendKeys(ConfigReader.getProperty("classification"));
            clearAfterVisibilityOfElement(txtClassification2);
            txtClassification2.sendKeys(ConfigReader.getProperty("classification2"));
            clearAfterVisibilityOfElement(txtClassification3);
            txtClassification3.sendKeys(ConfigReader.getProperty("classification3"));
            clearAfterVisibilityOfElement(txtClassification4);
            txtClassification4.sendKeys(ConfigReader.getProperty("classification4"));
            clearAfterVisibilityOfElement(terminationDate);
            terminationDate.sendKeys(ConfigReader.getProperty("terminationdate"));
            clearAfterVisibilityOfElement(txtErclocationcode);
            txtErclocationcode.sendKeys(ConfigReader.getProperty("erclocationcode"));
            clearAfterVisibilityOfElement(txtRole1);
            txtRole1.sendKeys(ConfigReader.getProperty("role1"));
            clearAfterVisibilityOfElement(txtRole2);
            txtRole2.sendKeys(ConfigReader.getProperty("role2"));
            clearAfterVisibilityOfElement(txtRole3);
            txtRole3.sendKeys(ConfigReader.getProperty("role3"));
            clearAfterVisibilityOfElement(txtRole4);
            txtRole4.sendKeys(ConfigReader.getProperty("role4"));
            clearAfterVisibilityOfElement(txtRole5);
            txtRole5.sendKeys(ConfigReader.getProperty("role5"));
            clearAfterVisibilityOfElement(txtRole6);
            txtRole6.sendKeys(ConfigReader.getProperty("role6"));
            clearAfterVisibilityOfElement(txtServicerep);
            txtServicerep.sendKeys(ConfigReader.getProperty("servicerep"));
            clearAfterVisibilityOfElement(txtUnion);
            txtUnion.sendKeys(ConfigReader.getProperty("union"));

            //Custom Fields
            clearAfterVisibilityOfElement(txtCustom1);
            txtCustom1.sendKeys(ConfigReader.getProperty("custom1"));
            clearAfterVisibilityOfElement(txtCustom2);
            txtCustom2.sendKeys(ConfigReader.getProperty("custom2"));
            clearAfterVisibilityOfElement(txtCustom3);
            txtCustom3.sendKeys(ConfigReader.getProperty("custom3"));
            clearAfterVisibilityOfElement(txtCustom4);
            txtCustom4.sendKeys(ConfigReader.getProperty("custom4"));
            clearAfterVisibilityOfElement(txtCustom5);
            txtCustom5.sendKeys(ConfigReader.getProperty("custom5"));
            clearAfterVisibilityOfElement(txtCustom6);
            txtCustom6.sendKeys(ConfigReader.getProperty("custom6"));
            clearAfterVisibilityOfElement(txtCustom7);
            txtCustom7.sendKeys(ConfigReader.getProperty("custom7"));
            clearAfterVisibilityOfElement(txtCustom8);
            txtCustom8.sendKeys(ConfigReader.getProperty("custom8"));
            clearAfterVisibilityOfElement(txtCustom9);
            txtCustom9.sendKeys(ConfigReader.getProperty("custom9"));
            clearAfterVisibilityOfElement(txtCustom10);
            txtCustom10.sendKeys(ConfigReader.getProperty("custom10"));
            clearAfterVisibilityOfElement(txtCustom11);
            txtCustom11.sendKeys(ConfigReader.getProperty("custom11"));
            clearAfterVisibilityOfElement(txtCustom12);
            txtCustom12.sendKeys(ConfigReader.getProperty("custom12"));
            clearAfterVisibilityOfElement(txtRuleString);
            txtRuleString.sendKeys(ConfigReader.getProperty("rulestring"));
            clickwhenready(Userupdate);
            Reporter.log("Update button clicked.");
            Thread.sleep(5000);

            if (UpdatedSuccessfully.isDisplayed())
            {
                Reporter.log("Update successful message displayed");
                Thread.sleep(3000);
                clearAfterVisibilityOfElement(txtUserid);
                //clickwhenready(txtUserid);
                txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
                String ActualUser = ConfigReader.getProperty(("useridfilter"));
                clickwhenready(ApplyBtn);
                Reporter.log("Apply button clicked");
                Thread.sleep(5000);
                String NewlyUpdatedUser = Userlink.getText();
                System.out.println(NewlyUpdatedUser);
                //Assert.assertEquals(ActualUser,NewlyAddedUser);
                if (ActualUser.equals(NewlyUpdatedUser))
                {
                    Reporter.log("User compare successful");
                    System.out.println(ActualUser);
                    clickwhenready(Userlink);
                    Reporter.log("Username link clicked");
                    Reporter.log("---------- End of Update User Script ----------");
                    Thread.sleep(5000);
                }
                ScreenPrints(webDriver);
            }
            ScreenPrints(webDriver);
        }
        catch (Exception e)
        {
            System.out.println("Selected user is not present");
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void DeleteUser() throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
              /*      clickwhenready(txtUserid);
                    clickwhenready(ClearBtn);
                    Thread.sleep(3000);
                    clearAfterVisibilityOfElement(txtUserid);
                    txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
                    clickwhenready(ApplyBtn);
                    Thread.sleep(4000);
                    clickwhenready(Userlink); */
            Reporter.log("---------- Delete User Script ----------");
            Thread.sleep(3000);
            clickwhenready(UserRptChkBox1);
            UserRptChkBox1.isSelected();
            clickwhenready(Userdelete);
            Thread.sleep(3000);
            clickwhenready(BtnOK);
            Reporter.log("OK button clicked");
            Thread.sleep(3000);

            if (DeletedSuccessfully.isDisplayed())
            {
                Reporter.log("Delete successful message displayed");
                Thread.sleep(2000);
                clearAfterVisibilityOfElement(txtUserid);
                txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
                //String ActualUser = ConfigReader.getProperty(("useridfilter"));
                clickwhenready(ApplyBtn);
                Reporter.log("Apply button clicked");
                Thread.sleep(4000);
                if (Emptygrid.isDisplayed())
                {
                    Reporter.log("Empty report displayed");
                    Thread.sleep(3000);
                    System.out.println("User deletion successful");
                    Reporter.log("---------- End of Delete User Script ----------");
                }
                ScreenPrints(webDriver);
            }
            ScreenPrints(webDriver);
        }
        catch (Exception e)
        {
            System.out.println("Selected user is already deleted");
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void Userblock() throws InterruptedException, IOException {

        try {
            clearAfterVisibilityOfElement(useridfield);
            useridfield.sendKeys(ConfigReader.getProperty("userblock1"));
            clickwhenready(ApplyBtn);
            Thread.sleep(4000);
            clickwhenready(UserRptChkBox1);
            UserRptChkBox1.isSelected();
            clickwhenready(BtnBlock);
            Thread.sleep(2000);
            clickwhenready(BtnSubmit);
            Thread.sleep(2000);
            clickwhenready(Logoutlink);
            clickwhenready(Signout);
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("testblockuser1"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("testblockuserpassword"));
            clearAfterVisibilityOfElement(txtOrganization);
            txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Thread.sleep(7000);
            if(AccountBlockMsg.isDisplayed()) {
                System.out.println(AccountBlockMsg);
                clearAfterVisibilityOfElement(txtUserName);
                txtUserName.sendKeys(ConfigReader.getProperty("userid"));
                clearAfterVisibilityOfElement(txtLoginPassword);
                txtLoginPassword.sendKeys(ConfigReader.getProperty("password"));
                clearAfterVisibilityOfElement(txtOrganization);
                txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
                clickwhenready(btnLogin);
            }
            Thread.sleep(10000);
            UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
            usermenu.UserMenu(webDriver);
            clearAfterVisibilityOfElement(useridfield);
            useridfield.sendKeys(ConfigReader.getProperty("userblock1"));
            clickwhenready(ApplyBtn);
            Thread.sleep(4000);
            clickwhenready(UserRptChkBox1);
            UserRptChkBox1.isSelected();
            clickwhenready(BtnBlock);
            Thread.sleep(5000);
            clickwhenready(Select_Dropdown);
            Select_UnblockUsers.isSelected();
            clickwhenready(Select_UnblockUsers);
            clickwhenready(BtnSubmit);
            Thread.sleep(5000);
            clickwhenready(Logoutlink);
            clickwhenready(Signout);

            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("testblockuser1"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("testblockuserpassword"));
            clearAfterVisibilityOfElement(txtOrganization);
            txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Thread.sleep(10000);
            if(txtKnowledgebase.isDisplayed()) {
                clickwhenready(Logoutlink);
                clickwhenready(Signout);
            }
            ScreenPrints(webDriver);

        }
        catch (Exception e)
        {
            ScreenPrints(webDriver);
            e.printStackTrace();
            throw e;
        }
    }

    public void UStartPage() throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Reporter.log("---------- User Startpage Script ----------");
            Login login = new Login(webDriver);
            clearAfterVisibilityOfElement(txtOrganization);
            login.Loginpage(webDriver);
            UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
            usermenu.UserMenu(webDriver);
            clickwhenready(ClearBtn);
            Reporter.log("Clear button clicked");
            Thread.sleep(3000);
            clickwhenready(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridstartpage"));
            clickwhenready(ApplyBtn);
            Thread.sleep(4000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(Click_Startpage);
            clickwhenready(Select_Startpage_Onboarding);
            Reporter.log("Startpage Onboarding selected");
            Thread.sleep(3000);
            clickwhenready(Userupdate);
            Reporter.log("Update button clicked");
            Thread.sleep(5000);
            UpdatedSuccessfully.isDisplayed();
            Reporter.log("Update successful message is displayed");
            Thread.sleep(5000);
            clickwhenready(Logout);
            clickwhenready(SignOut);
            Reporter.log("Signout done successful");
            Thread.sleep(7000);
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("useridstartpage"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("usersppassword"));
            clearAfterVisibilityOfElement(txtLoginOrganization);
            txtLoginOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login button clicked");
            Thread.sleep(15000);
            webDriver.switchTo().frame(Onboardingiframe);
            String abc = txtOnboarding.getText();
            System.out.println(abc);
            if(txtOnboarding.isDisplayed())
            {
                webDriver.switchTo().defaultContent();
                clickwhenready(Logout);
                Reporter.log("Logout link clicked");
                clickwhenready(SignOut);
                Reporter.log("Signout link clicked");
            }
            Thread.sleep(5000);
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("userid"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("password"));
            clearAfterVisibilityOfElement(txtOrganization);
            txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login button clicked");
            Thread.sleep(10000);
            usermenu.UserMenu(webDriver);
            txtUserid.isDisplayed();
            clickwhenready(ClearBtn);
            Thread.sleep(3000);
            clearAfterVisibilityOfElement(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridstartpage"));
            clickwhenready(ApplyBtn);
            Thread.sleep(5000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(Click_Startpage);
            clickwhenready(Select_Startpage_Home);
            Thread.sleep(3000);
            clickwhenready(Userupdate);
            Thread.sleep(5000);
            UpdatedSuccessfully.isDisplayed();
            Thread.sleep(5000);
            clickwhenready(Logout);
            Reporter.log("Logout link clicked");
            clickwhenready(SignOut);
            Reporter.log("Signout link clicked");
            Thread.sleep(7000);
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("useridstartpage"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("usersppassword"));
            clearAfterVisibilityOfElement(txtLoginOrganization);
            txtLoginOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login button clicked");
            Thread.sleep(10000);
            if(txtKnowledgebase.isDisplayed())
            {
                clickwhenready(Logout);
                Reporter.log("Logout link clicked");
                clickwhenready(SignOut);
                Reporter.log("Signout link clicked");
                Reporter.log("---------- End of User Startpage Script ----------");
            }
            Thread.sleep(5000);
            ScreenPrints(webDriver);

        }
        catch (Exception e)
        {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void DuplicateUser() throws InterruptedException, IOException
    {   String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try
        {
            Login login = new Login(webDriver);
            clearAfterVisibilityOfElement(txtOrganization);
            login.Loginpage(webDriver);
            UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
            usermenu.UserMenu(webDriver);
            Reporter.log("---------- Add User Script ----------");
            clickwhenready(AddNew);
            Reporter.log("Add button clicked");
            //ScreenPrints(webDriver);
            clickwhenready(txtaccountid);
            txtaccountid.sendKeys(ConfigReader.getProperty("userid"));
            clickwhenready(txtPassword);
            txtPassword.sendKeys(ConfigReader.getProperty("password"));
            clickwhenready(txtConfirmPassword);
            txtConfirmPassword.sendKeys(ConfigReader.getProperty("password"));
            clickwhenready(txtFirstname);
            txtFirstname.sendKeys(ConfigReader.getProperty("firstname"));
            clickwhenready(txtMiddlename);
            txtMiddlename.sendKeys(ConfigReader.getProperty("middlename"));
            clickwhenready(txtLastname);
            txtLastname.sendKeys(ConfigReader.getProperty("lastname"));
            clickwhenready(txtSuffix);
            txtSuffix.sendKeys(ConfigReader.getProperty("suffix"));
            clickwhenready(txtEmailaddress);
            txtEmailaddress.sendKeys(ConfigReader.getProperty("emailaddress"));
            clickwhenready(txtLevelnumber);
            clickwhenready(txtLevelnumber_select_8);

            if(EditDate.isDisplayed())
            {
                Thread.sleep(3000);
                System.out.println("Edit date displayed as expected");
            }
            clickwhenready(Click_Startpage);
            clickwhenready(Select_Startpage);

            clickwhenready(txtUseripaddress);
            txtUseripaddress.sendKeys(ConfigReader.getProperty("useripaddress"));
            Click_Timezone.click();
            Thread.sleep(2000);
            List<WebElement> list = webDriver.findElements(By.xpath("//ul[@class='x-list-plain']/li"));
            ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView(true);", list.get(228));
            list.get(228).click();
            //System.out.println(list.size());
            Thread.sleep(2000);
            clickwhenready(Click_Locale);
            clickwhenready(Select_EnUS);

            //Personal Information
            clickwhenready(txtSSN);
            Thread.sleep(2000);
            clickwhenready(txtPassword2);
            txtPassword2.sendKeys(ConfigReader.getProperty("userpassword2"));
            clickwhenready(Click_Validate);
            Thread.sleep(2000);
            clickwhenready(txtSSN);
            txtSSN.sendKeys(ConfigReader.getProperty("ssn"));
            clickwhenready(addressLine1);
            addressLine1.sendKeys(ConfigReader.getProperty("addressLine1"));
            clickwhenready(addressLine2);
            addressLine2.sendKeys(ConfigReader.getProperty("addressLine2"));
            clickwhenready(txtCity);
            txtCity.sendKeys(ConfigReader.getProperty("city"));
            clickwhenready(txtState);
            txtState.sendKeys(ConfigReader.getProperty("state"));
            clickwhenready(txtCountry);
            txtCountry.sendKeys(ConfigReader.getProperty("country"));
            clickwhenready(txtZipcode);
            txtZipcode.sendKeys(ConfigReader.getProperty("zipcode"));
            clickwhenready(txtHomephone);
            txtHomephone.sendKeys(ConfigReader.getProperty("homephone"));
            clickwhenready(txtGendercode);
            txtGendercode.sendKeys(ConfigReader.getProperty("gender"));
            clickwhenready(birthDate);
            birthDate.sendKeys(ConfigReader.getProperty("birthdate"));
            clickwhenready(txtSpousename);
            txtSpousename.sendKeys(ConfigReader.getProperty("spouse"));
            clickwhenready(txtCellphone);
            txtCellphone.sendKeys(ConfigReader.getProperty("cellphone"));

            //Employee Information
            clickwhenready(txtCompany);
            txtCompany.sendKeys(ConfigReader.getProperty("company"));
            clickwhenready(txtBusinessunit);
            txtBusinessunit.sendKeys(ConfigReader.getProperty("businessunit"));
            clickwhenready(txtCostcenter);
            txtCostcenter.sendKeys(ConfigReader.getProperty("costcenter"));
            clickwhenready(txtManagerid);
            txtManagerid.sendKeys(ConfigReader.getProperty("managerid"));
            clickwhenready(txtOnboardingid);
            txtOnboardingid.sendKeys(ConfigReader.getProperty("onboardingid"));
            clickwhenready(txtEmployeenumber);
            txtEmployeenumber.sendKeys(ConfigReader.getProperty("employeenumber"));
            clickwhenready(txtJobtitle);
            txtJobtitle.sendKeys(ConfigReader.getProperty("jobtitle"));
            clickwhenready(txtOfficelocation);
            txtOfficelocation.sendKeys(ConfigReader.getProperty("officelocation"));
            clickwhenready(txtLocation);
            txtLocation.sendKeys(ConfigReader.getProperty("location"));
            clickwhenready(txtLocation2);
            txtLocation2.sendKeys(ConfigReader.getProperty("location2"));
            clickwhenready(txtLocation3);
            txtLocation3.sendKeys(ConfigReader.getProperty("location3"));
            clickwhenready(txtLocation4);
            txtLocation4.sendKeys(ConfigReader.getProperty("location4"));
            clickwhenready(hireDate);
            hireDate.sendKeys(ConfigReader.getProperty("hiredate"));
            clickwhenready(startDate);
            startDate.sendKeys(ConfigReader.getProperty("startdate"));
            clickwhenready(txtSalary);
            txtSalary.sendKeys(ConfigReader.getProperty("salary"));
            clickwhenready(txtOfficephone);
            txtOfficephone.sendKeys(ConfigReader.getProperty("officephone"));
            clickwhenready(txtOfficefax);
            txtOfficefax.sendKeys(ConfigReader.getProperty("officefax"));
            clickwhenready(txtEmployeetype);
            txtEmployeetype.sendKeys(ConfigReader.getProperty("employeetype"));
            clickwhenready(txtDivision);
            txtDivision.sendKeys(ConfigReader.getProperty("division"));
            clickwhenready(txtDivision2);
            txtDivision2.sendKeys(ConfigReader.getProperty("division2"));
            clickwhenready(txtDivision3);
            txtDivision3.sendKeys(ConfigReader.getProperty("division3"));
            clickwhenready(txtDivision4);
            txtDivision4.sendKeys(ConfigReader.getProperty("division4"));
            clickwhenready(txtHrstatus);
            txtHrstatus.sendKeys(ConfigReader.getProperty("hrstatus"));
            clickwhenready(txtFulltime);
            txtFulltime.sendKeys(ConfigReader.getProperty("fulltime"));
            clickwhenready(txtClassification);
            txtClassification.sendKeys(ConfigReader.getProperty("classification"));
            clickwhenready(txtClassification2);
            txtClassification2.sendKeys(ConfigReader.getProperty("classification2"));
            clickwhenready(txtClassification3);
            txtClassification3.sendKeys(ConfigReader.getProperty("classification3"));
            clickwhenready(txtClassification4);
            txtClassification4.sendKeys(ConfigReader.getProperty("classification4"));
            clickwhenready(terminationDate);
            terminationDate.sendKeys(ConfigReader.getProperty("terminationdate"));
            clickwhenready(txtErclocationcode);
            txtErclocationcode.sendKeys(ConfigReader.getProperty("erclocationcode"));
            clickwhenready(txtRole1);
            txtRole1.sendKeys(ConfigReader.getProperty("role1"));
            clickwhenready(txtRole2);
            txtRole2.sendKeys(ConfigReader.getProperty("role2"));
            clickwhenready(txtRole3);
            txtRole3.sendKeys(ConfigReader.getProperty("role3"));
            clickwhenready(txtRole4);
            txtRole4.sendKeys(ConfigReader.getProperty("role4"));
            clickwhenready(txtRole5);
            txtRole5.sendKeys(ConfigReader.getProperty("role5"));
            clickwhenready(txtRole6);
            txtRole6.sendKeys(ConfigReader.getProperty("role6"));
            clickwhenready(txtServicerep);
            txtServicerep.sendKeys(ConfigReader.getProperty("servicerep"));
            clickwhenready(txtUnion);
            txtUnion.sendKeys(ConfigReader.getProperty("union"));

            //Custom Fields
            clickwhenready(txtCustom1);
            txtCustom1.sendKeys(ConfigReader.getProperty("custom1"));
            clickwhenready(txtCustom2);
            txtCustom2.sendKeys(ConfigReader.getProperty("custom2"));
            clickwhenready(txtCustom3);
            txtCustom3.sendKeys(ConfigReader.getProperty("custom3"));
            clickwhenready(txtCustom4);
            txtCustom4.sendKeys(ConfigReader.getProperty("custom4"));
            clickwhenready(txtCustom5);
            txtCustom5.sendKeys(ConfigReader.getProperty("custom5"));
            clickwhenready(txtCustom6);
            txtCustom6.sendKeys(ConfigReader.getProperty("custom6"));
            clickwhenready(txtCustom7);
            txtCustom7.sendKeys(ConfigReader.getProperty("custom7"));
            clickwhenready(txtCustom8);
            txtCustom8.sendKeys(ConfigReader.getProperty("custom8"));
            clickwhenready(txtCustom9);
            txtCustom9.sendKeys(ConfigReader.getProperty("custom9"));
            clickwhenready(txtCustom10);
            txtCustom10.sendKeys(ConfigReader.getProperty("custom10"));
            clickwhenready(txtCustom11);
            txtCustom11.sendKeys(ConfigReader.getProperty("custom11"));
            clickwhenready(txtCustom12);
            txtCustom12.sendKeys(ConfigReader.getProperty("custom12"));
            clickwhenready(txtRuleString);
            txtRuleString.sendKeys(ConfigReader.getProperty("rulestring"));
            clickwhenready(Usersave);
            Reporter.log("Save button clicked.");
            Thread.sleep(2000);

            if(DuplicateEntryMsg.isDisplayed())
            {
                Thread.sleep(5000);
                System.out.println("User already exists");
            }

         /*   if (AddedSuccessfully.isDisplayed())
            {
                Reporter.log("Add successfully message displayed");
                Thread.sleep(3000);
                clickwhenready(txtUserid);
                txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
                String ActualUser = ConfigReader.getProperty(("useridfilter"));
                clickwhenready(ApplyBtn);
                Reporter.log("Apply button clicked");
                Thread.sleep(5000);
                String NewlyAddedUser = Userlink.getText();
                System.out.println(NewlyAddedUser);
                //Assert.assertEquals(ActualUser,NewlyAddedUser);
                if (ActualUser.equals(NewlyAddedUser))
                {
                    Reporter.log("User compare successful");
                    System.out.println(ActualUser);
                    clickwhenready(Userlink);
                    Reporter.log("Username link clicked");
                    Reporter.log("---------- End of Add User Script ----------");
                    Thread.sleep(5000);

                }
                ScreenPrints(webDriver);
            }*/
            ScreenPrints(webDriver);
        }
        catch (Exception e)
        {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void localeuser() throws InterruptedException, IOException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Reporter.log("---------- Locale User Script ----------");
         /*   Login login = new Login(webDriver);
            login.LaunchApplication(webDriver);
            login.Loginpage(webDriver);
            UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
            usermenu.UserMenu(webDriver); */
            Reporter.log("Application login successful by Admin user");
            clickwhenready(ClearBtn);
            Thread.sleep(3000);
            txtUserid.sendKeys(ConfigReader.getProperty("userlocale"));
            clickwhenready(ApplyBtn);
            Thread.sleep(5000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(Click_Locale);
            clickwhenready(Select_bgBG);
            Reporter.log("User locale set to bgBG");
            Thread.sleep(3000);
            clickwhenready(Userupdate);
            Thread.sleep(5000);
            if (UpdatedSuccessfully.isDisplayed()) {
                Thread.sleep(5000);
                clickwhenready(Logout);
                clickwhenready(SignOut);
            }
            Thread.sleep(7000);
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("userlocale"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("userlocalepswd"));
            clearAfterVisibilityOfElement(txtLoginOrganization);
            txtLoginOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login with bgBG locale user and verify the changes as per locale");
            Thread.sleep(8000);
            if (BtnPrint_bgBG_locale.isDisplayed())
            {
                clickwhenready(Logout);
                clickwhenready(txt_bgBG_Signout);
                Thread.sleep(8000);
            }
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("userid"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("password"));
            clearAfterVisibilityOfElement(txtOrganization);
            txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login with Admin user");
            Thread.sleep(10000);

            clickwhenready(txtKnowledgebase);
            clickwhenready(txtAdministration);
            clickwhenready(txtKnowledgebaseAdmin);
            Thread.sleep(5000);
            clickwhenready(txtLocalization);
            clickwhenready(txtLocales);
            Thread.sleep(5000);
            clickwhenready(checkedbox_localebgBG);
            clickwhenready(BtnUpdate_locale);
            Reporter.log("Remove bgBG as the active locale for the application");
            if (UpdatedSuccessfully.isDisplayed())
            {
                Thread.sleep(5000);
                Logout.click();
                SignOut.click();
            }
            Thread.sleep(5000);
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("userlocale"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("userlocalepswd"));
            clearAfterVisibilityOfElement(txtLoginOrganization);
            txtLoginOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login with bgBG locale user and verify the changes displayed as enUS");
            Thread.sleep(10000);
            if(BtnPrint_enUS_locale.isDisplayed())
            {
                Logout.click();
                SignOut.click();
                Thread.sleep(5000);
            }
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("userid"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("password"));
            clearAfterVisibilityOfElement(txtOrganization);
            txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
            clickwhenready(btnLogin);
            Reporter.log("Login with Admin user");
            Thread.sleep(10000);

            clickwhenready(txtKnowledgebase);
            clickwhenready(txtAdministration);
            clickwhenready(txtKnowledgebaseAdmin);
            Thread.sleep(5000);
            clickwhenready(txtLocalization);
            clickwhenready(txtLocales);
            Thread.sleep(5000);
            clickwhenready(uncheckedbox_localebgBG);
            clickwhenready(BtnUpdate_locale);
            Reporter.log("Add the bgBG as the active locale for the application");
            if (UpdatedSuccessfully.isDisplayed())
            {
                Thread.sleep(5000);
                Logout.click();
                SignOut.click();
                Reporter.log("---------- End of the Locale User Script ----------");

            }
            Thread.sleep(10000);

            ScreenPrints(webDriver);

        }
        catch (Exception e)
        {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void USignOnLinkWChkPwd() throws InterruptedException, IOException
    {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Login login = new Login(webDriver);
            login.LaunchApplication(webDriver);
            login.Loginpage(webDriver);
            UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
            usermenu.UserMenu(webDriver);
            Reporter.log("---------- Sign On Link Script ----------");
            clickwhenready(ClearBtn);
            Reporter.log("Clear button clicked");
            Thread.sleep(3000);
            clearAfterVisibilityOfElement(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridSignOn"));
            clickwhenready(ApplyBtn);
            Thread.sleep(5000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(UserPropertiesmenu);
            clickwhenready(SignOnlink);
            Thread.sleep(4000);
            clearAfterVisibilityOfElement(relativeURL);
            relativeURL.sendKeys(ConfigReader.getProperty("relativeURL"));
            clickwhenready(SaveBtn);
            Thread.sleep(3000);

            if (SignOnLinkAddedSuccessfully.isDisplayed()) {
                Thread.sleep(3000);
                clickwhenready(Link);
                Thread.sleep(5000);
                String abc = Link.getAttribute("value");
                System.out.println(abc);
                ((JavascriptExecutor)webDriver).executeScript("window.open()");
                ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
                webDriver.switchTo().window(tabs2.get(1));
                webDriver.get(abc);
                Thread.sleep(3000);
                clearAfterVisibilityOfElement(txtLoginPassword);
                txtLoginPassword.sendKeys(ConfigReader.getProperty("password"));
                clickwhenready(btnLogin);
                Thread.sleep(15000);
                if(txtKnowledgebase.isDisplayed()) {
                    clickwhenready(Logoutlink);
                    clickwhenready(Signout);
                }
                ScreenPrints(webDriver);
                webDriver.close();
                webDriver.switchTo().window(tabs2.get(0));
                //webDriver.close();
                Thread.sleep(7000);
                //Login login = new Login(webDriver);
                login.LaunchApplication(webDriver);
                login.Loginpage(webDriver);
                //UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
                usermenu.UserMenu(webDriver);
            }

        } catch (Exception e) {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void USignOnLinkWOChkPwd() throws InterruptedException, IOException
    {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {

            Reporter.log("---------- Sign On Link Script ----------");
            clickwhenready(ClearBtn);
            Reporter.log("Clear button clicked");
            Thread.sleep(3000);
            clearAfterVisibilityOfElement(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridSignOn"));
            clickwhenready(ApplyBtn);
            Thread.sleep(5000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(UserPropertiesmenu);
            clickwhenready(SignOnlink);
            Thread.sleep(4000);
            clickwhenready(PasswordSwitch);
            clearAfterVisibilityOfElement(relativeURL);
            relativeURL.sendKeys(ConfigReader.getProperty("relativeURL"));
            clickwhenready(SaveBtn);
            Thread.sleep(3000);

            if (SignOnLinkAddedSuccessfully.isDisplayed()) {
                Thread.sleep(3000);
                clickwhenready(Link);
                Thread.sleep(5000);
                String abc = Link.getAttribute("value");
                System.out.println(abc);
                ((JavascriptExecutor)webDriver).executeScript("window.open()");
                ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
                webDriver.switchTo().window(tabs2.get(1));
                webDriver.get(abc);
                Thread.sleep(3000);
                //clearAfterVisibilityOfElement(txtPassword);
                //txtPassword.sendKeys(ConfigReader.getProperty("password"));
                //clickwhenready(btnLogin);
                Thread.sleep(15000);
                if(txtKnowledgebase.isDisplayed()) {
                    clickwhenready(Logoutlink);
                    clickwhenready(Signout);
                }
                ScreenPrints(webDriver);
                webDriver.close();
                webDriver.switchTo().window(tabs2.get(0));
                Thread.sleep(7000);
                Login login = new Login(webDriver);
                login.LaunchApplication(webDriver);
                login.Loginpage(webDriver);
                UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
                usermenu.UserMenu(webDriver);
            }

        } catch (Exception e) {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void UChangePwdAtLogin() throws InterruptedException, IOException
    {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Reporter.log("---------- Script ----------");
            clickwhenready(ClearBtn);
            Reporter.log("Clear button clicked");
            Thread.sleep(3000);
            clearAfterVisibilityOfElement(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridChangePwd"));
            clickwhenready(ApplyBtn);
            Thread.sleep(5000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(UserPropertiesmenu);
            clickwhenready(PasswordMenu);
            Thread.sleep(8000);
            newPassword.sendKeys(ConfigReader.getProperty("newpassword"));
            confirmPassword.sendKeys(ConfigReader.getProperty("confirmnewpassword"));
            clickwhenready(PasswordSwitch);
            Thread.sleep(2000);
            clickwhenready(UpdatePassword);
            Thread.sleep(8000);

            //  if (PasswordUpdatedSuccessfully.isDisplayed()) {
            Thread.sleep(3000);
            System.out.println("Test abc");
            clickwhenready(Logoutlink);
            clickwhenready(Signout);
            Thread.sleep(7000);
            clearAfterVisibilityOfElement(txtUserName);
            txtUserName.sendKeys(ConfigReader.getProperty("useridChangePwd"));
            clearAfterVisibilityOfElement(txtLoginPassword);
            txtLoginPassword.sendKeys(ConfigReader.getProperty("newpassword"));
            clearAfterVisibilityOfElement(txtOrganization);
            txtOrganization.sendKeys(ConfigReader.getProperty("organization"));
            btnLogin.click();
            Thread.sleep(8000);
            txtNewPwd.sendKeys(ConfigReader.getProperty("newpwd"));
            txtRetypeNewPwd.sendKeys(ConfigReader.getProperty("retyprnewpwd"));
            clickwhenready(btnChangePwd);
            clickwhenready(btnLogin);
            Thread.sleep(15000);

            if(txtKnowledgebase.isDisplayed()) {
                clickwhenready(Logoutlink);
                clickwhenready(Signout);
            }
            ScreenPrints(webDriver);
            Thread.sleep(3000);
            Thread.sleep(7000);
            Login login = new Login(webDriver);
            login.LaunchApplication(webDriver);
            login.Loginpage(webDriver);
            UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
            usermenu.UserMenu(webDriver);


        } catch (Exception e) {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void USignOnLinkWMURL() throws InterruptedException, IOException
    {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            Reporter.log("---------- Sign On Link Script ----------");
            clickwhenready(ClearBtn);
            Reporter.log("Clear button clicked");
            Thread.sleep(3000);
            clearAfterVisibilityOfElement(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridSignOn"));
            clickwhenready(ApplyBtn);
            Thread.sleep(5000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(UserPropertiesmenu);
            clickwhenready(SignOnlink);
            Thread.sleep(4000);
            clearAfterVisibilityOfElement(relativeURL);
            relativeURL.sendKeys(ConfigReader.getProperty("modifiedrelativeURL"));
            clickwhenready(SaveBtn);
            Thread.sleep(3000);

            if (SignOnLinkAddedSuccessfully.isDisplayed()) {
                Thread.sleep(3000);
                clickwhenready(Link);
                Thread.sleep(5000);
                String abc = Link.getAttribute("value");
                System.out.println(abc);
                ((JavascriptExecutor)webDriver).executeScript("window.open()");
                ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
                webDriver.switchTo().window(tabs2.get(1));
                webDriver.get(abc);
                Thread.sleep(3000);
                clearAfterVisibilityOfElement(txtLoginPassword);
                txtLoginPassword.sendKeys(ConfigReader.getProperty("password"));
                clickwhenready(btnLogin);
                Thread.sleep(8000);
                String strUrl = webDriver.getCurrentUrl();
                System.out.println(strUrl);

                if(strUrl.contains("Error")) {
                    System.out.println("Error page is displayed.");
                    ScreenPrints(webDriver);
                    //webDriver.switchTo().window(tabs2.get(0));
                    webDriver.close();
                    webDriver.switchTo().window(tabs2.get(0));
                    clickwhenready(Logoutlink);
                    clickwhenready(Signout);
                }
                Thread.sleep(7000);
                Login login = new Login(webDriver);
                login.LaunchApplication(webDriver);
                login.Loginpage(webDriver);
                UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
                usermenu.UserMenu(webDriver);
                Thread.sleep(3000);
            }

        } catch (Exception e) {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void USignOnLinkWInvalidLink() throws InterruptedException, IOException
    {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {

            Reporter.log("---------- Sign On Link Script ----------");
            clickwhenready(ClearBtn);
            Reporter.log("Clear button clicked");
            Thread.sleep(3000);
            clearAfterVisibilityOfElement(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridSignOn"));
            clickwhenready(ApplyBtn);
            Thread.sleep(5000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(UserPropertiesmenu);
            clickwhenready(SignOnlink);
            Thread.sleep(4000);
            clearAfterVisibilityOfElement(relativeURL);
            relativeURL.sendKeys(ConfigReader.getProperty("relativeURL"));
            clickwhenready(SaveBtn);
            Thread.sleep(3000);

            if (SignOnLinkAddedSuccessfully.isDisplayed()) {
                Thread.sleep(4000);
                clickwhenready(Link);
                Thread.sleep(6000);
                String abc = Link.getAttribute("value");
                System.out.println(abc);
                String xyz = abc+"testlink";
                ((JavascriptExecutor)webDriver).executeScript("window.open()");
                ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
                webDriver.switchTo().window(tabs2.get(1));
                webDriver.get(xyz);
                Thread.sleep(3000);
                //clearAfterVisibilityOfElement(txtPassword);
                //txtPassword.sendKeys(ConfigReader.getProperty("password"));
                //clickwhenready(btnLogin);
                Thread.sleep(8000);
                String strUrl = webDriver.getCurrentUrl();
                System.out.println(strUrl);

                if(strUrl.contains("Error")) {
                    System.out.println("Error page is displayed.");
                    ScreenPrints(webDriver);
                    // webDriver.switchTo().window(tabs2.get(0));
                    webDriver.close();
                    Thread.sleep(3000);
                    webDriver.switchTo().window(tabs2.get(0));
                    clickwhenready(Logoutlink);
                    clickwhenready(Signout);
                }

                Thread.sleep(7000);
                Login login = new Login(webDriver);
                login.LaunchApplication(webDriver);
                login.Loginpage(webDriver);
                UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
                usermenu.UserMenu(webDriver);
                Thread.sleep(5000);
            }

        } catch (Exception e) {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void SignOnUserblock() throws InterruptedException, IOException {

        try {
            clearAfterVisibilityOfElement(useridfield);
            useridfield.sendKeys(ConfigReader.getProperty("testblocksignon"));
            clickwhenready(ApplyBtn);
            Thread.sleep(4000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(UserPropertiesmenu);
            clickwhenready(SignOnlink);
            Thread.sleep(4000);
            clearAfterVisibilityOfElement(relativeURL);
            relativeURL.sendKeys(ConfigReader.getProperty("relativeURL"));
            clickwhenready(SaveBtn);
            Thread.sleep(3000);

            if (SignOnLinkAddedSuccessfully.isDisplayed()) {
                Thread.sleep(4000);
                clickwhenready(Link);
                Thread.sleep(6000);
                String abc = Link.getAttribute("value");
                System.out.println(abc);
                //String xyz = abc+"testlink";
                ((JavascriptExecutor) webDriver).executeScript("window.open()");
                ArrayList<String> tabs2 = new ArrayList<String>(webDriver.getWindowHandles());
                webDriver.switchTo().window(tabs2.get(1));
                webDriver.get(abc);
                Thread.sleep(8000);
                String strUrl = webDriver.getCurrentUrl();
                System.out.println(strUrl);
                clearAfterVisibilityOfElement(txtLoginPassword);
                txtLoginPassword.sendKeys(ConfigReader.getProperty("testblocksignonpwd"));
                clickwhenready(btnLogin);
                Thread.sleep(3000);
                if(AccountBlockMsg.isDisplayed()) {
                    System.out.println("User is blocked.");
                    ScreenPrints(webDriver);
                    // webDriver.switchTo().window(tabs2.get(0));
                    webDriver.close();
                    Thread.sleep(3000);
                    webDriver.switchTo().window(tabs2.get(0));
                    clickwhenready(Logoutlink);
                    clickwhenready(Signout);
                }
                ScreenPrints(webDriver);
            }
        }
        catch (Exception e)
        {
            ScreenPrints(webDriver);
            e.printStackTrace();
            throw e;
        }
    }

    public void DeletedUserAdd() throws InterruptedException, IOException
    {   String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try
        {
            Reporter.log("---------- Add User Script ----------");
            Login login = new Login(webDriver);
            login.LaunchApplication(webDriver);
            login.Loginpage(webDriver);
            UserMenuNavigation usermenu = new UserMenuNavigation(webDriver);
            usermenu.UserMenu(webDriver);
            clickwhenready(AddNew);
            Reporter.log("Add button clicked");
            //ScreenPrints(webDriver);
            clickwhenready(txtaccountid);
            txtaccountid.sendKeys(ConfigReader.getProperty("accountid"));
            clickwhenready(txtPassword);
            txtPassword.sendKeys(ConfigReader.getProperty("userpassword"));
            clickwhenready(txtConfirmPassword);
            txtConfirmPassword.sendKeys(ConfigReader.getProperty("userconfirmpassword"));
            clickwhenready(txtPrefix);
            txtPrefix.sendKeys(ConfigReader.getProperty("prefix"));
            clickwhenready(txtFirstname);
            txtFirstname.sendKeys(ConfigReader.getProperty("firstname"));
            clickwhenready(txtMiddlename);
            txtMiddlename.sendKeys(ConfigReader.getProperty("middlename"));
            clickwhenready(txtLastname);
            txtLastname.sendKeys(ConfigReader.getProperty("lastname"));
            clickwhenready(txtSuffix);
            txtSuffix.sendKeys(ConfigReader.getProperty("suffix"));
            clickwhenready(txtEmailaddress);
            txtEmailaddress.sendKeys(ConfigReader.getProperty("emailaddress"));
            clickwhenready(txtLevelnumber);
            clickwhenready(txtLevelnumber_select_8);
            clickwhenready(Click_Startpage);
            clickwhenready(Select_Startpage);
            clickwhenready(txtUseripaddress);
            txtUseripaddress.sendKeys(ConfigReader.getProperty("useripaddress"));
            Click_Timezone.click();
            Thread.sleep(2000);
            List<WebElement> list = webDriver.findElements(By.xpath("//ul[@class='x-list-plain']/li"));
            ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView(true);", list.get(228));
            list.get(228).click();
            //System.out.println(list.size());
            Thread.sleep(2000);
            clickwhenready(Click_Locale);
            clickwhenready(Select_EnUS);

            //Personal Information
            clickwhenready(txtSSN);
            Thread.sleep(2000);
            clickwhenready(txtPassword2);
            txtPassword2.sendKeys(ConfigReader.getProperty("userpassword2"));
            clickwhenready(Click_Validate);
            Thread.sleep(2000);
            clickwhenready(txtSSN);
            txtSSN.sendKeys(ConfigReader.getProperty("ssn"));
            clickwhenready(addressLine1);
            addressLine1.sendKeys(ConfigReader.getProperty("addressLine1"));
            clickwhenready(addressLine2);
            addressLine2.sendKeys(ConfigReader.getProperty("addressLine2"));
            clickwhenready(txtCity);
            txtCity.sendKeys(ConfigReader.getProperty("city"));
            clickwhenready(txtState);
            txtState.sendKeys(ConfigReader.getProperty("state"));
            clickwhenready(txtCountry);
            txtCountry.sendKeys(ConfigReader.getProperty("country"));
            clickwhenready(txtZipcode);
            txtZipcode.sendKeys(ConfigReader.getProperty("zipcode"));
            clickwhenready(txtHomephone);
            txtHomephone.sendKeys(ConfigReader.getProperty("homephone"));
            clickwhenready(txtGendercode);
            txtGendercode.sendKeys(ConfigReader.getProperty("gender"));
            clickwhenready(birthDate);
            birthDate.sendKeys(ConfigReader.getProperty("birthdate"));
            clickwhenready(txtSpousename);
            txtSpousename.sendKeys(ConfigReader.getProperty("spouse"));
            clickwhenready(txtCellphone);
            txtCellphone.sendKeys(ConfigReader.getProperty("cellphone"));

            //Employee Information
            clickwhenready(txtCompany);
            txtCompany.sendKeys(ConfigReader.getProperty("company"));
            clickwhenready(txtBusinessunit);
            txtBusinessunit.sendKeys(ConfigReader.getProperty("businessunit"));
            clickwhenready(txtCostcenter);
            txtCostcenter.sendKeys(ConfigReader.getProperty("costcenter"));
            clickwhenready(txtManagerid);
            txtManagerid.sendKeys(ConfigReader.getProperty("managerid"));
            clickwhenready(txtOnboardingid);
            txtOnboardingid.sendKeys(ConfigReader.getProperty("onboardingid"));
            clickwhenready(txtEmployeenumber);
            txtEmployeenumber.sendKeys(ConfigReader.getProperty("employeenumber"));
            clickwhenready(txtJobtitle);
            txtJobtitle.sendKeys(ConfigReader.getProperty("jobtitle"));
            clickwhenready(txtOfficelocation);
            txtOfficelocation.sendKeys(ConfigReader.getProperty("officelocation"));
            clickwhenready(txtLocation);
            txtLocation.sendKeys(ConfigReader.getProperty("location"));
            clickwhenready(txtLocation2);
            txtLocation2.sendKeys(ConfigReader.getProperty("location2"));
            clickwhenready(txtLocation3);
            txtLocation3.sendKeys(ConfigReader.getProperty("location3"));
            clickwhenready(txtLocation4);
            txtLocation4.sendKeys(ConfigReader.getProperty("location4"));
            clickwhenready(hireDate);
            hireDate.sendKeys(ConfigReader.getProperty("hiredate"));
            clickwhenready(startDate);
            startDate.sendKeys(ConfigReader.getProperty("startdate"));
            clickwhenready(txtSalary);
            txtSalary.sendKeys(ConfigReader.getProperty("salary"));
            clickwhenready(txtOfficephone);
            txtOfficephone.sendKeys(ConfigReader.getProperty("officephone"));
            clickwhenready(txtOfficefax);
            txtOfficefax.sendKeys(ConfigReader.getProperty("officefax"));
            clickwhenready(txtEmployeetype);
            txtEmployeetype.sendKeys(ConfigReader.getProperty("employeetype"));
            clickwhenready(txtDivision);
            txtDivision.sendKeys(ConfigReader.getProperty("division"));
            clickwhenready(txtDivision2);
            txtDivision2.sendKeys(ConfigReader.getProperty("division2"));
            clickwhenready(txtDivision3);
            txtDivision3.sendKeys(ConfigReader.getProperty("division3"));
            clickwhenready(txtDivision4);
            txtDivision4.sendKeys(ConfigReader.getProperty("division4"));
            clickwhenready(txtHrstatus);
            txtHrstatus.sendKeys(ConfigReader.getProperty("hrstatus"));
            clickwhenready(txtFulltime);
            txtFulltime.sendKeys(ConfigReader.getProperty("fulltime"));
            clickwhenready(txtClassification);
            txtClassification.sendKeys(ConfigReader.getProperty("classification"));
            clickwhenready(txtClassification2);
            txtClassification2.sendKeys(ConfigReader.getProperty("classification2"));
            clickwhenready(txtClassification3);
            txtClassification3.sendKeys(ConfigReader.getProperty("classification3"));
            clickwhenready(txtClassification4);
            txtClassification4.sendKeys(ConfigReader.getProperty("classification4"));
            clickwhenready(terminationDate);
            terminationDate.sendKeys(ConfigReader.getProperty("terminationdate"));
            clickwhenready(txtErclocationcode);
            txtErclocationcode.sendKeys(ConfigReader.getProperty("erclocationcode"));
            clickwhenready(txtRole1);
            txtRole1.sendKeys(ConfigReader.getProperty("role1"));
            clickwhenready(txtRole2);
            txtRole2.sendKeys(ConfigReader.getProperty("role2"));
            clickwhenready(txtRole3);
            txtRole3.sendKeys(ConfigReader.getProperty("role3"));
            clickwhenready(txtRole4);
            txtRole4.sendKeys(ConfigReader.getProperty("role4"));
            clickwhenready(txtRole5);
            txtRole5.sendKeys(ConfigReader.getProperty("role5"));
            clickwhenready(txtRole6);
            txtRole6.sendKeys(ConfigReader.getProperty("role6"));
            clickwhenready(txtServicerep);
            txtServicerep.sendKeys(ConfigReader.getProperty("servicerep"));
            clickwhenready(txtUnion);
            txtUnion.sendKeys(ConfigReader.getProperty("union"));

            //Custom Fields
            clickwhenready(txtCustom1);
            txtCustom1.sendKeys(ConfigReader.getProperty("custom1"));
            clickwhenready(txtCustom2);
            txtCustom2.sendKeys(ConfigReader.getProperty("custom2"));
            clickwhenready(txtCustom3);
            txtCustom3.sendKeys(ConfigReader.getProperty("custom3"));
            clickwhenready(txtCustom4);
            txtCustom4.sendKeys(ConfigReader.getProperty("custom4"));
            clickwhenready(txtCustom5);
            txtCustom5.sendKeys(ConfigReader.getProperty("custom5"));
            clickwhenready(txtCustom6);
            txtCustom6.sendKeys(ConfigReader.getProperty("custom6"));
            clickwhenready(txtCustom7);
            txtCustom7.sendKeys(ConfigReader.getProperty("custom7"));
            clickwhenready(txtCustom8);
            txtCustom8.sendKeys(ConfigReader.getProperty("custom8"));
            clickwhenready(txtCustom9);
            txtCustom9.sendKeys(ConfigReader.getProperty("custom9"));
            clickwhenready(txtCustom10);
            txtCustom10.sendKeys(ConfigReader.getProperty("custom10"));
            clickwhenready(txtCustom11);
            txtCustom11.sendKeys(ConfigReader.getProperty("custom11"));
            clickwhenready(txtCustom12);
            txtCustom12.sendKeys(ConfigReader.getProperty("custom12"));
            clickwhenready(txtRuleString);
            txtRuleString.sendKeys(ConfigReader.getProperty("rulestring"));
            clickwhenready(Usersave);
            Reporter.log("Save button clicked.");
            Thread.sleep(2000);

            if (AddedSuccessfully.isDisplayed())
            {
                Reporter.log("Add successfully message displayed");
                Thread.sleep(3000);
                clickwhenready(txtUserid);
                txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
                String ActualUser = ConfigReader.getProperty(("useridfilter"));
                clickwhenready(ApplyBtn);
                Reporter.log("Apply button clicked");
                Thread.sleep(5000);
                String NewlyAddedUser = Userlink.getText();
                System.out.println(NewlyAddedUser);
                //Assert.assertEquals(ActualUser,NewlyAddedUser);
                if (ActualUser.equals(NewlyAddedUser))
                {
                    Reporter.log("User compare successful");
                    System.out.println(ActualUser);
                    clickwhenready(Userlink);
                    Reporter.log("Username link clicked");
                    Reporter.log("---------- End of Add User Script ----------");
                    Thread.sleep(5000);
                }
                //clickwhenready(Logoutlink);
                //clickwhenready(Signout);
                ScreenPrints(webDriver);
            }
            ScreenPrints(webDriver);
        }
        catch (Exception e)
        {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }

    public void SearchfilterUserslist() throws IOException, InterruptedException {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {
            clearAfterVisibilityOfElement(txtUserid);
            txtUserID.sendKeys(ConfigReader.getProperty("SearchFilterUserId"));
            txtFirstName.sendKeys(ConfigReader.getProperty("SearchFilterFirstName"));
            txtLastName.sendKeys(ConfigReader.getProperty("SearchFilterLastName"));
            dropdownGroup.click();
            selectBasicAccess.click();
            Thread.sleep(2000);
            txtEmail.sendKeys(ConfigReader.getProperty("SearchFilterEmail"));
            dropdownStartpage.click();
            selectStartPage.click();
            Thread.sleep(2000);
            dropdownBlocked.click();
            selectBlocked.click();
            Thread.sleep(2000);
            ApplyBtn.click();
            Reporter.log("Apply button clicked");
            Thread.sleep(5000);

            System.out.println("User list Printed");
            String ActualUser = ConfigReader.getProperty(("Searchuseridfilter"));
            Thread.sleep(5000);
            String NewlyAddedUser = Userlink.getText();
            System.out.println(NewlyAddedUser);
            if (ActualUser.equals(NewlyAddedUser))
            {
                Reporter.log("User compare successful");
                System.out.println(ActualUser);
                clickwhenready(Userlink);
                Reporter.log("Username link clicked");
                Thread.sleep(5000);
            }
            ScreenPrints(webDriver);
        } catch (Exception e) {
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            ScreenPrints(webDriver);
            throw e;
        }
    }

    public void UPropertiesMenusCheck() throws InterruptedException, IOException
    {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        try {

            Reporter.log("---------- User properties dropdown check ----------");
            clickwhenready(ClearBtn);
            Reporter.log("Clear button clicked");
            Thread.sleep(3000);
            clearAfterVisibilityOfElement(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridSignOn"));
            clickwhenready(ApplyBtn);
            Thread.sleep(5000);
            clickwhenready(Userlink);
            Thread.sleep(5000);
            clickwhenready(UserPropertiesmenu);
            clickwhenready(PropertiesDetails);
            Thread.sleep(4000);
            System.out.println("Details menu clicked");
            if(DetailsAccountInformation.isDisplayed()) {
                clickwhenready(UserPropertiesmenu);
                clickwhenready(PasswordMenu);
                Thread.sleep(4000);
                System.out.println("Password menu clicked");
                if (UpdatePassword.isDisplayed()) {
                    clickwhenready(UserPropertiesmenu);
                    clickwhenready(PropertiesGroups);
                    Thread.sleep(6000);
                    System.out.println("Groups menu clicked");
                    if (PropertiesDescription.isDisplayed()) {
                        clickwhenready(UserPropertiesmenu);
                        clickwhenready(SignOnlink);
                        Thread.sleep(4000);
                        if (SaveBtn.isDisplayed()) {
                            clickwhenready(UserPropertiesmenu);
                            clickwhenready(PropertiesElections);
                            Thread.sleep(4000);
                            if (AddElection.isDisplayed()) {
                                clickwhenready(UserPropertiesmenu);
                                clickwhenready(PropertiesMobileProfile);
                                Thread.sleep(6000);
                                if (DELETEBtn.isDisplayed()) {
                                    clickwhenready(UserPropertiesmenu);
                                    clickwhenready(PropertiesEmulation);
                                    Thread.sleep(5000);
                                    if (StopEmulation.isDisplayed()) {
                                        clickwhenready(StopEmulation);
                                        Thread.sleep(10000);
                                    }
                                }
                            }
                        }
                    }
                }
            }

             }
            catch (Exception e) {
            ScreenPrints(webDriver);
            e.printStackTrace();
            Reporter.log(nameOfCurrMethod + "\n" + e.toString());
            throw e;
        }
    }


}