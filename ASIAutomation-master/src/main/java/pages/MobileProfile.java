package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MobileProfile extends EActions{
    //Mobile profile link on Home Page
    @FindBy(how = How.XPATH, using = "//*[@id='lnk_mobile']")
    private WebElement AddMobileProfilelink;

    //Mobile profile form
    @FindBy(how = How.XPATH, using = "//*[@class='cls-text' and text()='Add Mobile Profile']")
    private WebElement AddMobileProfileText;
    @FindBy(how = How.XPATH, using = "//*[@name='name']")
    private WebElement NameTxtboxonaddmobileform;
    @FindBy(how = How.XPATH, using = "//*[@name='pin']")
    private WebElement PinTxtboxonaddmobileform;
    @FindBy(how = How.XPATH, using = "//*[@name='emailaddress']")
    private WebElement EmailTxtboxonaddmobileform;
    @FindBy(how = How.XPATH, using = "//*[@data-ref='btnInnerEl' and text()='Add']")
    private WebElement Addbuttononmobileform;
    @FindBy(how = How.XPATH, using = "//*[@data-ref='labelTextEl' and contains(text(),' You will need to provide the user with the pin number in order to log in.')]")
    private WebElement NoteonMobileForm;

    //Click on mobile user created
    @FindBy(how = How.XPATH, using = "//div[@class='x-grid-cell-inner ']/a")
    private WebElement Linkofmobileuserscreated;

    @FindBy(how = How.XPATH, using = "//*[@data-ref='textEl' and text()='Edit Mobile Profile']")
    private WebElement Labelonmobileprofileform;

    @FindBy(how = How.XPATH, using = "//*[@data-ref='btnInnerEl' and text()='Copy to Clipboard']")
    private WebElement Copylinkbtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"hcm-button-1502-btnEl\"]")
    private WebElement Closeform;


    public MobileProfile(WebDriver webDriver) {
        super(webDriver);
    }


    public void createmobileprofile(String Name, int pin, String Email)
    {
        //Click on Add Mobile profile link
        clickwhenready(AddMobileProfilelink);
        IsElementExists(AddMobileProfileText);
        EnterText(NameTxtboxonaddmobileform,"smane");
        EnterText(NameTxtboxonaddmobileform,"1234");
        EnterText(NameTxtboxonaddmobileform,"smita.mane@harbingergroup.com");





        


    }


}
