package util;


import listener.TestStatistics;
import org.testng.Reporter;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Mail {
    private static final String USERNAME = System.getenv("EMAIL_USERNAME");
    private static final String PASSWORD = System.getenv("EMAIL_PASSWORD");

    public static void sendEmail() {

        try {


            Properties props = new Properties();
            props.put("mail.smtp.auth", true);
            props.put("mail.smtp.starttls.enable", true);
            props.put("mail.smtp.host", "smtp.office365.com");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(USERNAME, PASSWORD);
                        }
                    });

            try {
                Address[] addresses = new InternetAddress[5];
                addresses[0] = new InternetAddress("riddhi.kalolia@harbingergroup.com");
                addresses[1] = new InternetAddress("Smita.mane@harbingergroup.com");
                addresses[2] = new InternetAddress("Imran.shaikh@harbingergroup.com");
                addresses[3] = new InternetAddress("Aniket.Khedkar@harbingergroup.com");
                addresses[4] = new InternetAddress("Yogesh.Potdar@harbingergroup.com");




                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("riddhi.kalolia@harbingergroup.com"));
                message.setRecipients(Message.RecipientType.TO, addresses);
                message.setSubject("ASI Smoke test execution report");
                //message.setText("Smoke Test Result: test");


                MimeBodyPart messageBodyPart = new MimeBodyPart();

                Multipart multipart = new MimeMultipart();
                BodyPart textBodyPart = new MimeBodyPart();
                textBodyPart.setContent("We have completed Smoke testing on below Organization and Browser:" + "\n"
                        + "URL: " + ConfigReader.getProperty("url") + "\n"
                        + "Organization: " + ConfigReader.getProperty("organization") + "\n"
                        + "Browser: " + "Chrome" + "\n" + "\n"
                        + "Please find below Test Result:" + "\n"
                        + "Result: " + TestStatistics.getCount() + "\n" + "\n"
                        + "Failed Test Case: " + TestStatistics.getFailedTests() + "\n" + "\n"
                        + "Skipped Test Case: " + TestStatistics.getSkippedTests() + "\n" + "\n"
                        + "Passed Test Case: " + TestStatistics.getPassedTests(), "text/plain");
                multipart.addBodyPart(textBodyPart);
                messageBodyPart.attachFile(new File(System.getProperty("user.dir") + "\\Zip\\ReportsFolder.zip"));
                messageBodyPart.setHeader("Content-Type", "text/plain; charset=\"us-ascii\"; name=\"mail.txt\"");
                multipart.addBodyPart(messageBodyPart);
                message.setContent(multipart);
                Reporter.log("Mail sending.");
                Transport.send(message);
                Reporter.log("Mail sent.");

            } catch (MessagingException | IOException e) {
                e.printStackTrace();
                Reporter.log(e.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            Reporter.log(e.toString());
        }
    }
}