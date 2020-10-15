package util;


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
                Address[] addresses = new InternetAddress[2];
                addresses[0] = new InternetAddress("riddhi.kalolia@harbingergroup.com");
                addresses[1] = new InternetAddress("riddhi.kalolia@infor.com");

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("riddhi.kalolia@harbingergroup.com"));
                message.setRecipients(Message.RecipientType.TO, addresses);
                message.setSubject("Smoke test report");
                message.setText("PFA");

                MimeBodyPart messageBodyPart = new MimeBodyPart();

                Multipart multipart = new MimeMultipart();

                messageBodyPart.setContent("test", "text/html");
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