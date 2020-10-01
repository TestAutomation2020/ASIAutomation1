package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MobileProfile {
    @FindBy(how = How.XPATH, using = "//*[@id='lnk_mobile']")
    private WebElement AddMobileProfilelink;

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


}
