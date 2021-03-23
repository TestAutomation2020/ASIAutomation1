package Execution;

import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

public class ASIAutomationReg extends Base {
    @Test(priority = 0)
    public void User() throws InterruptedException, IOException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());

        UserMenuNavigation usermenu = new UserMenuNavigation(getDriver());
        usermenu.UserMenu(getDriver());
    }

 /*  @Test(priority = 1)
    public void uSignOnLink() throws InterruptedException, IOException {
        SignOnLinkWChkPwd usignon = new SignOnLinkWChkPwd(getDriver());
        usignon.USignOnLink();
    }

    @Test(priority = 2)
    public void uSignOnLinkWOChkPwd() throws InterruptedException, IOException {
        SignOnLinkWOChkPwd usignonwopwd = new SignOnLinkWOChkPwd(getDriver());
        usignonwopwd.USignOnLinkWOChkPwd();
    }

    @Test(priority = 3)
    public void uChgPwdAtLogin() throws InterruptedException, IOException {
        ChangePwdAtLogin uchgpwd = new ChangePwdAtLogin(getDriver());
        uchgpwd.UChangePwdAtLogin();
    }

    @Test(priority = 4)
    public void uSignOnLinkWModifiedURL() throws InterruptedException, IOException {
        SignOnLinkWModifiedURL umurl = new SignOnLinkWModifiedURL(getDriver());
        umurl.USignOnLinkWMURL();
    }

    @Test(priority = 5)
    public void uSignOnLinkWInvalidLink() throws InterruptedException, IOException {
        SignOnLinkWInvalidLink uinvalidlink = new SignOnLinkWInvalidLink(getDriver());
        uinvalidlink.USignOnLinkWInvalidLink();
    }

    @Test(priority = 6)
    public void uSignOnBlock() throws InterruptedException, IOException {
         SignOnLinkwithBlockUser usignonblocku = new SignOnLinkwithBlockUser(getDriver());
         usignonblocku.SignOnUserblock();
    }

    @Test(priority = 7)
        public void uDeletedAdd() throws InterruptedException, IOException {
        DeletedUserCreation udeletedcreation = new DeletedUserCreation(getDriver());
        udeletedcreation.DeletedUserAdd(); */

    @Test(priority = 8)
        public void uDuplicateAdd() throws InterruptedException, IOException {
         ValidationOfDuplicateUser uduplicateadd = new ValidationOfDuplicateUser(getDriver());
         uduplicateadd.DuplicateUser();
    }
}
