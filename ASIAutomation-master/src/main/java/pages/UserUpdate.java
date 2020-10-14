package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ConfigReader;

import java.io.IOException;
import java.util.List;

public class UserUpdate extends BasePage {

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

    //@FindBy(how = How.XPATH, using = "//li[text()='(GMT+05:30) Asia/Calcutta']")
    //private WebElement Select_AsiaCalcutta;

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

    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Update']/ancestor::a")
    private WebElement Userupdate;

    @FindBy(how = How.XPATH, using = "//div[text()='Updated Successfully']")
    private WebElement UpdatedSuccessfully;

    public UserUpdate(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean UpdateUser() throws IOException
    {
        try
        {
            clearAfterVisibilityOfElement(txtUserid);
            txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
            clickwhenready(ApplyBtn);
            Thread.sleep(3000);
            clickwhenready(Userlink);
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
            Thread.sleep(5000);

            if (UpdatedSuccessfully.isDisplayed())
            {
                Thread.sleep(3000);
                clearAfterVisibilityOfElement(txtUserid);
                //clickwhenready(txtUserid);
                txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
                String ActualUser = ConfigReader.getProperty(("useridfilter"));
                clickwhenready(ApplyBtn);
                Thread.sleep(5000);
                String NewlyUpdatedUser = Userlink.getText();
                System.out.println(NewlyUpdatedUser);
                //Assert.assertEquals(ActualUser,NewlyAddedUser);
                if (ActualUser.equals(NewlyUpdatedUser))
                {
                    System.out.println(ActualUser);
                    clickwhenready(Userlink);
                    Thread.sleep(5000);
                    return true;
                }
                ScreenPrints(webDriver);
                return false;
            }
            ScreenPrints(webDriver);
            return false;
        }
        catch (Exception e)
        {
            System.out.println("Selected user is not present");
            ScreenPrints(webDriver);
            e.printStackTrace();
            return false;
        }
    }
}