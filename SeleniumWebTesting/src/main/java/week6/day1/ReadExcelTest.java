package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelTest {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./data/Data.xlsx");
		XSSFSheet sheet = wb.getSheet("sheet1");
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			short lastCellNum = row.getLastCellNum();
			for (int j = 0; j <lastCellNum; j++) {
				System.out.println(row.getCell(j).getStringCellValue());
				
			}
		
		}
		
		//for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
		//System.out.println(row.getCell(0).getStringCellValue());	
		//}
		// int rowCount = sheet.getLastRowNum();
		 
		    
		
		
		
	}
}
