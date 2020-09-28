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
        login.LaunchApplication(driver);
        login.Loginpage(driver);

        UserMenuNavigation usermenu = new UserMenuNavigation();
        usermenu.UserMenu(driver);

        UserBlock userblock = new UserBlock();
        userblock.Userblock(driver);

        BasicNavigation Basicuser= new BasicNavigation();
        Basicuser.Buttons();

    }
}
