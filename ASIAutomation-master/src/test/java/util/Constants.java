package util;

public interface Constants {
    String RANDOM_NUMBER = String.valueOf(System.currentTimeMillis());
    String KEYWORD_YES = "No";
    String FILEPOSTINGTITLE = ConfigReader.getProperty("postingtitle") +"File"+ Constants.RANDOM_NUMBER;
    String MESSAGEPOSTINGTITLE = ConfigReader.getProperty("postingtitle") +"Message"+ Constants.RANDOM_NUMBER;
    String LINKPOSTINGTITLE = ConfigReader.getProperty("postingtitle") +"Link"+ Constants.RANDOM_NUMBER;
    String Searchtermforbasicuser=ConfigReader.getProperty("Searchtermforbasicuser");
    String FILETITLEUPDATE = ConfigReader.getProperty("updatemessage") + Constants.RANDOM_NUMBER+" File";
    String MESSAGETITLEUPDATE = ConfigReader.getProperty("updatemessage") +Constants.RANDOM_NUMBER +" Message";
    String LINKTITLEUPDATE = ConfigReader.getProperty("updatemessage") + Constants.RANDOM_NUMBER+ " Link";
    String SEARCHPOSTINGTERMFORBASICUSER = ConfigReader.getProperty("updatemessage") + Constants.RANDOM_NUMBER;
    String ALIASNAMEFORMESSAGEPOSTING=ConfigReader.getProperty("aliasmessageposting")+Constants.RANDOM_NUMBER;
    String MobileUser=ConfigReader.getProperty("Mobileuser");
    int mobilepin= Integer.parseInt(ConfigReader.getProperty("Mobilepin"));
    String mobileEmail=ConfigReader.getProperty("Mobileemail");

}

