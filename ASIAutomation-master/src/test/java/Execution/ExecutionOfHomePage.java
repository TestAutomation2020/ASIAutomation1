package Execution;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.Login;
import pages.Posting;
import util.Constants;

import java.io.IOException;

public class ExecutionOfHomePage extends Base {

    @Test(priority = 0)
    private void login() throws InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
    }

    @Test(priority = 1)
    private void validateBanner(){
        HomePage homePage = new HomePage(getDriver());
        homePage.validateBanner();
    }

    /**
     * EWRD-6759 and EWRD-6831
     *
     * @throws IOException
     * @throws InterruptedException
     */
    @Test(priority = 2, enabled = false)
    private void widgetCheckAndUncheck() throws IOException, InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        homePage.validateCountHomepageWidgetWithSetUpHomePage();
        homePage.unCheckedAllCheckedWidget();
        homePage.validateCountHomepageWidgetWithSetUpHomePage();
        homePage.navigateToSetUpHomePage();
        homePage.getUnCheckedAllWidget();
        homePage.validateCountHomepageWidgetWithSetUpHomePage();
        Thread.sleep(10000);
        homePage.verifiedWidgetTitle();
    }

    @Test(priority = 3, enabled = false)
    private void toolsWidgetTestCase() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToSetUpHomePage();
        homePage.toolsWidgetComparison();
        homePage.toolsWidgetFunctionality();
    }

    /*
     *Locale Selection widget functionality covered in Region locale testcase.
     *
     */
    @Test(priority = 4, enabled = false)
    private void localeSelectionWidgetTestCase() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToSetUpHomePage();
        homePage.localeSelectionWidgetComparison();
    }

    @Test(priority = 5,enabled = false)
    private void announcementWidgetTestCase() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToSetUpHomePage();
        homePage.announcementWidgetComparison();
        Posting posting = new Posting(getDriver());
        basePage.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.addMessagePosting();
        posting.validatePostingAdded();
        basePage.pageReload();
        homePage.announcementWidgetFunctionality(Constants.MESSAGEPOSTINGTITLE);
        basePage.navigateAnotherOpenedTab();
        posting.validateViewMessagePosting();
        basePage.navigateDefaultTab();
    }

    @Test(priority = 6,dependsOnMethods = "announcementWidgetTestCase",enabled = false)
    private void bulletinsWidgetTestCase() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToSetUpHomePage();
        homePage.bulletinsWidgetComparison();
        Posting posting = new Posting(getDriver());
        homePage.bulletinsWidgetFunctionality(Constants.MESSAGEPOSTINGTITLE,Constants.FILEPOSTINGTITLE);
    }
}
