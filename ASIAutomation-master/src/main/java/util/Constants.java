package util;

public interface Constants {
    String RANDOM_NUMBER = String.valueOf(System.currentTimeMillis());
    String KEYWORD_YES = "yes";
    String postingTitle = ConfigReader.getProperty("postingtitle") + Constants.RANDOM_NUMBER;
    String Searchtermforbasicuser=ConfigReader.getProperty("Searchtermforbasicuser");
    String UpdateTitle=ConfigReader.getProperty("updatemessage") + Constants.RANDOM_NUMBER;

}

