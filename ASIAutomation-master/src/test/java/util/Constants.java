package util;

public interface Constants {
    String RANDOM_NUMBER = String.valueOf(System.currentTimeMillis());
    String KEYWORD_YES = "No";
    String TITLE = ConfigReader.getProperty("postingtitle") + Constants.RANDOM_NUMBER;
    String Searchtermforbasicuser=ConfigReader.getProperty("Searchtermforbasicuser");
    String UpdateTitle = ConfigReader.getProperty("updatemessage") + Constants.RANDOM_NUMBER;

    String MobileUser=ConfigReader.getProperty("Mobileuser");
    int mobilepin= Integer.parseInt(ConfigReader.getProperty("Mobilepin"));
    String mobileEmail=ConfigReader.getProperty("Mobileemail");

}
