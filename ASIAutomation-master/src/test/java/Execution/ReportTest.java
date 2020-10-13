package Execution;


import org.testng.annotations.Test;
import util.Mail;
import util.ZipUtils;


public class ReportTest {

    @Test
    public void result() {
        ZipUtils zipUtils = new ZipUtils();
        zipUtils.createzip();
        Mail.sendEmail();
    }
}
