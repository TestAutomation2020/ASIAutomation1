package pages;

import com.sun.deploy.security.SelectableSecurityManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.invoke.empty.Empty;
import util.ConfigReader;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

public class UserDelete extends BasePage {

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

    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Save']/ancestor::a")
    private WebElement Usersave;

    @FindBy(how = How.XPATH, using = "//div[text()='Added Successfully']")
    private WebElement AddedSuccessfully;

    @FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Update']/ancestor::a")
    private WebElement Userupdate;

    @FindBy(how = How.XPATH, using = "//div[text()='Updated Successfully']")
    private WebElement UpdatedSuccessfully;

    @FindBy(how = How.XPATH, using = "//span[@data-ref='btnInnerEl'][contains(.,'Clear')]")
    private WebElement ClearBtn;

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


    public UserDelete(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean DeleteUser() throws InterruptedException, IOException {

        try {
                    clickwhenready(txtUserid);
                    clickwhenready(ClearBtn);
                    Thread.sleep(3000);
                    clearAfterVisibilityOfElement(txtUserid);
                    txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
                    clickwhenready(ApplyBtn);
                    Thread.sleep(4000);
                    clickwhenready(Userlink);
                    Thread.sleep(3000);
                    clickwhenready(UserRptChkBox1);
                    UserRptChkBox1.isSelected();
                    clickwhenready(Userdelete);
                    Thread.sleep(3000);
                    clickwhenready(BtnOK);
                    Thread.sleep(3000);

                    if (DeletedSuccessfully.isDisplayed())
                    {
                        Thread.sleep(2000);
                        clearAfterVisibilityOfElement(txtUserid);
                        txtUserid.sendKeys(ConfigReader.getProperty("useridfilter"));
                        //String ActualUser = ConfigReader.getProperty(("useridfilter"));
                        clickwhenready(ApplyBtn);
                        Thread.sleep(4000);
                        if (Emptygrid.isDisplayed())
                        {
                            Thread.sleep(3000);
                            System.out.println("User deletion successful");
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
            System.out.println("Selected user is already deleted");
            ScreenPrints(webDriver);
            e.printStackTrace();
            return false;
        }
    }
}