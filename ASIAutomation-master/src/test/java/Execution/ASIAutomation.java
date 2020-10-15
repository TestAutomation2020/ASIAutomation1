package Execution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

public class ASIAutomation extends Base {

    @Test
    public void SmokeTest() throws InterruptedException, IOException {
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

        UserBlock ublock = new UserBlock(getDriver());
        ublock.Userblock();

        UserStartPage ustartpage = new UserStartPage(getDriver());
        ustartpage.UStartPage();

        //    BasicNavigationTestCase basicn = new BasicNavigationTestCase();
        //    basicn.Searchandvalidatebuttons();

    //    MobileProfile mprofile = new MobileProfile(getDriver());
    //    mprofile.createmobileprofile();

    }
}
