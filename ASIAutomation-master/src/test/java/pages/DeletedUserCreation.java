package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import sun.font.TrueTypeFont;
import util.ConfigReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeletedUserCreation extends BasePage {

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

    @FindBy(how = How.XPATH, using = "//li[text()='Onboarding']")
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

    @FindBy(how = How.XPATH, using = "//span[@id='PageHeaderLogout-btnEl']")
    private WebElement Logoutlink;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Sign Out')]")
    private WebElement Signout;

    public DeletedUserCreation(WebDriver webDriver) {
        super(webDriver);
    }

    public void DeletedUserAdd() throws InterruptedException, IOException
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
}