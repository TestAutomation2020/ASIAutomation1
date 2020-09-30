package pages;

import junit.framework.Assert;
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

import java.util.List;

public class UserCreate {

    @FindBy(how = How.XPATH, using = "//span[text()='Add New']")
    private WebElement AddNew;

    @FindBy(how = How.XPATH, using = "//input[@name='userid']")
    private WebElement txtUserid;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Apply')]")
    private WebElement ApplyBtn;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'test080915')]")
    private String Userlink;

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
    //Add 1
    //Add 2
    //textarea[@name='addressline2']

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

    //Birthdate

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

    //Hire date

    //Start date

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

    //Termination date

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


    public void UserAdd(WebDriver driver) throws InterruptedException {
        PageFactory.initElements(driver, this);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        AddNew.isDisplayed();
        AddNew.click();
        txtaccountid.isDisplayed();
        txtaccountid.sendKeys(ConfigReader.getProperty("accountid"));
        txtPassword.sendKeys(ConfigReader.getProperty("userpassword"));
        txtConfirmPassword.sendKeys(ConfigReader.getProperty("userconfirmpassword"));
        txtPrefix.sendKeys(ConfigReader.getProperty("prefix"));
        txtFirstname.sendKeys(ConfigReader.getProperty("firstname"));
        txtMiddlename.sendKeys(ConfigReader.getProperty("middlename"));
        txtLastname.sendKeys(ConfigReader.getProperty("lastname"));
        txtSuffix.sendKeys(ConfigReader.getProperty("suffix"));
        txtEmailaddress.sendKeys(ConfigReader.getProperty("emailaddress"));
        txtLevelnumber.click();
        txtLevelnumber_select_8.click();
        Click_Startpage.click();
        Select_Startpage.click();
        txtUseripaddress.sendKeys(ConfigReader.getProperty("useripaddress"));
        Click_Timezone.click();

        List<WebElement> timezoneList = driver.findElements(By.xpath("//input[@name='timezoneiana']/li"));

        //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", timezoneList);

        WebElement element = driver.findElement(By.xpath("//input[contains(@value,'(GMT+05:30) Asia/Calcutta')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);

        // Other there way that I prefer is:
        //input[contains(@value,'(GMT+05:30) Asia/Calcutta')]
        //Select dropdown = new Select(driver.findElement(By.xpath("//input[@name='timezoneiana']")));
        //dropdown.selectByVisibleText("(GMT+05:30) Asia/Calcutta')");
        //dropdown.selectByValue("(GMT+05:30) Asia/Calcutta')");
        //Click_Timezone.sendKeys("(GMT+05:30");
        //Click_Timezone.click();
        //driver.findElement(By.)
        //Select_AsiaCalcutta.click();

    /*    Click_Locale.click();
        Select_EnUS.click();
        txtSSN.click();
        Thread.sleep(2000);
        txtPassword2.sendKeys(ConfigReader.getProperty("userpassword2"));
        Click_Validate.click();
        Thread.sleep(2000);
        txtSSN.sendKeys(ConfigReader.getProperty("ssn"));
        addressLine1.sendKeys(ConfigReader.getProperty("addressLine1"));
        addressLine2.sendKeys(ConfigReader.getProperty("addressLine2"));
        txtCity.sendKeys(ConfigReader.getProperty("city"));
        txtState.sendKeys(ConfigReader.getProperty("state"));
        txtCountry.sendKeys(ConfigReader.getProperty("country"));
        txtZipcode.sendKeys(ConfigReader.getProperty("zipcode"));
        txtHomephone.sendKeys(ConfigReader.getProperty("homephone"));
        txtGendercode.sendKeys(ConfigReader.getProperty("gender"));
        //BIRTH DATE
        txtSpousename.sendKeys(ConfigReader.getProperty("spouse"));
        txtCellphone.sendKeys(ConfigReader.getProperty("cellphone"));

        txtCompany.sendKeys(ConfigReader.getProperty("company"));
        txtBusinessunit.sendKeys(ConfigReader.getProperty("businessunit"));
        txtCostcenter.sendKeys(ConfigReader.getProperty("costcenter"));
        txtManagerid.sendKeys(ConfigReader.getProperty("managerid"));
        txtOnboardingid.sendKeys(ConfigReader.getProperty("onboardingid"));
        txtEmployeenumber.sendKeys(ConfigReader.getProperty("employeenumber"));
        txtJobtitle.sendKeys(ConfigReader.getProperty("jobtitle"));
        txtOfficelocation.sendKeys(ConfigReader.getProperty("officelocation"));
        txtLocation.sendKeys(ConfigReader.getProperty("location"));
        txtLocation2.sendKeys(ConfigReader.getProperty("location2"));
        txtLocation3.sendKeys(ConfigReader.getProperty("location3"));
        txtLocation4.sendKeys(ConfigReader.getProperty("location4"));

        //HIRE DATE and START DATE

        txtSalary.sendKeys(ConfigReader.getProperty("salary"));
        txtOfficephone.sendKeys(ConfigReader.getProperty("officephone"));
        txtOfficefax.sendKeys(ConfigReader.getProperty("officefax"));
        txtEmployeetype.sendKeys(ConfigReader.getProperty("employeetype"));
        txtDivision.sendKeys(ConfigReader.getProperty("division"));
        txtDivision2.sendKeys(ConfigReader.getProperty("division2"));
        txtDivision3.sendKeys(ConfigReader.getProperty("division3"));
        txtDivision4.sendKeys(ConfigReader.getProperty("division4"));
        txtHrstatus.sendKeys(ConfigReader.getProperty("hrstatus"));
        txtFulltime.sendKeys(ConfigReader.getProperty("fulltime"));
        txtClassification.sendKeys(ConfigReader.getProperty("classification"));
        txtClassification2.sendKeys(ConfigReader.getProperty("classification2"));
        txtClassification3.sendKeys(ConfigReader.getProperty("classification3"));
        txtClassification4.sendKeys(ConfigReader.getProperty("classification4"));

        //TERMINATION DATE

        txtErclocationcode.sendKeys(ConfigReader.getProperty("erclocationcode"));
        txtRole1.sendKeys(ConfigReader.getProperty("role1"));
        txtRole2.sendKeys(ConfigReader.getProperty("role2"));
        txtRole3.sendKeys(ConfigReader.getProperty("role3"));
        txtRole4.sendKeys(ConfigReader.getProperty("role4"));
        txtRole5.sendKeys(ConfigReader.getProperty("role5"));
        txtRole6.sendKeys(ConfigReader.getProperty("role6"));
        txtServicerep.sendKeys(ConfigReader.getProperty("servicerep"));
        txtUnion.sendKeys(ConfigReader.getProperty("union"));

        //Custom Fields

        txtCustom1.sendKeys(ConfigReader.getProperty("custom1"));
        txtCustom2.sendKeys(ConfigReader.getProperty("custom2"));
        txtCustom3.sendKeys(ConfigReader.getProperty("custom3"));
        txtCustom4.sendKeys(ConfigReader.getProperty("custom4"));
        txtCustom5.sendKeys(ConfigReader.getProperty("custom5"));
        txtCustom6.sendKeys(ConfigReader.getProperty("custom6"));
        txtCustom7.sendKeys(ConfigReader.getProperty("custom7"));
        txtCustom8.sendKeys(ConfigReader.getProperty("custom8"));
        txtCustom9.sendKeys(ConfigReader.getProperty("custom9"));
        txtCustom10.sendKeys(ConfigReader.getProperty("custom10"));
        txtCustom11.sendKeys(ConfigReader.getProperty("custom11"));
        txtCustom12.sendKeys(ConfigReader.getProperty("custom12"));
        txtRuleString.sendKeys(ConfigReader.getProperty("rulestring"));
        Thread.sleep(10000);
        Usersave.click();
        Thread.sleep(2000);
        AddedSuccessfully.isDisplayed();
        Thread.sleep(5000);
        txtUserid.isDisplayed();
        txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
        ApplyBtn.click();
        Thread.sleep(5000);
        //String actualid="test080915";
        //String expectedid= Userlink;
        //Assert.assertEquals(expectedid,actualid);

     */
        Thread.sleep(5000);

      }
}