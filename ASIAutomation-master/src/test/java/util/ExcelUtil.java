package util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelUtil {

    private static HSSFSheet ExcelWSheet;
    private static HSSFWorkbook ExcelWBook;
    private static HSSFCell Cell;
    private static File file;
    // This method is to set the File path and to open the Excel file, Pass
    // Excel Path and Sheetname as Arguments to this method

    public static void setExcelFile(String Path, String SheetName) throws Exception {

        try {
            file = new File(Path);
            FileInputStream ExcelFile = new FileInputStream(file);
            ExcelWBook = new HSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);
            int rowNum = ExcelWSheet.getLastRowNum();
        } catch (Exception e) {
            e.printStackTrace();
            throw (e);
        }
    }

    public static void fileOutputStream() throws Exception {
        FileOutputStream outputStream = new FileOutputStream(file);
        ExcelWBook.write(outputStream);
        outputStream.close();


    }


    // This method is to read the test data from the Excel cell, in this we are
    // passing parameters as Row num and Col num

    public static String getCellData(int rowNum, int colNum) {

        try {
            Cell = ExcelWSheet.getRow(rowNum).getCell(colNum);
            return Cell.getStringCellValue();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}


