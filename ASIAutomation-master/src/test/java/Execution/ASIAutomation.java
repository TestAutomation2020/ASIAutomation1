package Execution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

@Listeners(listener.TestStatistics.class)
public class ASIAutomation extends Base {

    @Test(priority = 0)
    public void User() throws InterruptedException, IOException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());

        UserMenuNavigation usermenu = new UserMenuNavigation(getDriver());
        usermenu.UserMenu(getDriver());

        UserCreate ucreate = new UserCreate(getDriver());
        ucreate.UserAdd();

        UserUpdate uupdate = new UserUpdate(getDriver());
        uupdate.UpdateUser();

        UserDelete udelete = new UserDelete(getDriver());
        udelete.DeleteUser();
    }

    @Test(priority = 1)
    public void userBlock() throws InterruptedException, IOException {
        UserBlock ublock = new UserBlock(getDriver());
        ublock.Userblock();
    }

    @Test(priority = 2)
    public void userStartPage() throws InterruptedException, IOException {
        UserStartPage ustartpage = new UserStartPage(getDriver());
        ustartpage.UStartPage();

    }

    @Test(priority = 3)
    public void userLocale() throws InterruptedException, IOException {
        UserLocale ulocale = new UserLocale(getDriver());
        ulocale.localeuser();
    }

    @Test(priority = 4)
    public void contentWebservice() throws InterruptedException, IOException {
        ContentWebService cwebservice = new ContentWebService(getDriver());
        cwebservice.ContentService();
    }


    //   EnwisenWebService ewebservice = new EnwisenWebService(getDriver());
    //   ewebservice.EnwisenService();

    //  BasicNavigationTestCase basicn = new BasicNavigationTestCase();
    //  basicn.Searchandvalidatebuttons();

    //    MobileProfile mprofile = new MobileProfile(getDriver());
    //    mprofile.createmobileprofile();

}

