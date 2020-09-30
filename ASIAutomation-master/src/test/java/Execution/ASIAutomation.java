package Execution;

import org.testng.annotations.Test;
import pages.BasicNavigation;
import pages.Login;
import pages.UserBlock;
import pages.UserMenuNavigation;

public class ASIAutomation extends Base {

    @Test
    public void SmokeTest() throws InterruptedException {
        Login login = new Login();
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
/*
        UserMenuNavigation usermenu = new UserMenuNavigation();
        usermenu.UserMenu(getDriver());

        UserBlock userblock = new UserBlock();
        userblock.Userblock(getDriver());
*/
        BasicNavigation Basicuser= new BasicNavigation(getDriver());
        Basicuser.AskHR(getDriver());
        Basicuser.Favorite(getDriver());
        Basicuser.Print(getDriver());
        Basicuser.SearchForBasicUser(getDriver());
        Basicuser.validateSearchedPosting("Health");

    }
}
