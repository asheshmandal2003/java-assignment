package file;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Q11 {
    public void writeExcel() {
        try {
            String filename = "filestorage/StudentDetails.xlsx";
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("IT");
            HSSFRow rowhead = sheet.createRow((short) 0);
            rowhead.createCell(0).setCellValue("Name");
            rowhead.createCell(1).setCellValue("Roll");
            rowhead.createCell(2).setCellValue("Section");
            rowhead.createCell(3).setCellValue("Address");
            HSSFRow row = sheet.createRow((short) 1);
            row.createCell(0).setCellValue("Ashesh Mandal");
            row.createCell(1).setCellValue("18");
            row.createCell(2).setCellValue("IT-3A");
            row.createCell(3).setCellValue("Kalyani, WB");
            HSSFRow row1 = sheet.createRow((short) 2);
            row1.createCell(0).setCellValue("Devayan Mandal");
            row1.createCell(1).setCellValue("25");
            row1.createCell(2).setCellValue("IT-3A");
            row1.createCell(3).setCellValue("Kolkata, WB");
            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            System.out.println("Excel file has been generated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
