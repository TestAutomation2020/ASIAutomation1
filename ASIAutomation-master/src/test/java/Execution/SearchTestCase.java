package Execution;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BlocknUnblockfromSitemapSearch;
import pages.Login;
import util.ConfigReader;

import java.io.IOException;
public class SearchTestCase extends Base {

    public String searchtearm;

    @Test(priority =0)
    private void NavigatetodocSearch() throws Exception {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());

        //BasePage basePage = new BasePage(getDriver());
        // basePage.navigateToKbAdmin();

        BlocknUnblockfromSitemapSearch block = new BlocknUnblockfromSitemapSearch(getDriver());
        //block.NavigatetoDocumentSettings();
        //block.Blockinsearch(ConfigReader.getProperty("Documentnametosearch"));

        block.ReadDataExcel(searchtearm);
        // block.SearchForBasicUser(searchtearm);
        //block.validateSearchedterm(searchtearm);




    }
}
