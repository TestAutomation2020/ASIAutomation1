package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OBConsoles {

    @FindBy(xpath = "//div[@class='dashSelection'][text()='Admin Console']")
    private WebElement AdminConsole;
    @FindBy(className = "x-component x-fit-item x-component-default")
    private WebElement Mainframe;
    @FindBy(id = "pf-admin-c-AdminConsole")
    private WebElement Adminconsoleframe;
    @FindBy(id = "UserLoginReport")
    private WebElement Userloginframe;
    @FindBy(xpath = "//span[text()='Admin Console']")
    private WebElement Adminconsolelabel;

    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement Deletebtn;
    @FindBy(xpath = "//button[text()='Archive']")
    private WebElement Archivebtn;
    @FindBy(xpath = "//button[text()='Refresh']")
    private WebElement Refreshbtn;

    public void AdminConsole() {
        String nameofcurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
        


    }
}
