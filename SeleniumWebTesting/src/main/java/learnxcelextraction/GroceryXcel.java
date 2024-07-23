package learnxcelextraction;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GroceryXcel {
     public static String[][] grocerydata() throws IOException {
    	 //allocate memory and find the folder from xcel
    	 XSSFWorkbook wb=new XSSFWorkbook("./data/grocery.xlsx"); 
    	 //find the sheet
    	 XSSFSheet sheet = wb.getSheetAt(0);
    	 //find row
    	  XSSFRow row = sheet.getRow(0);
    	  //to find cell
    	  XSSFCell cell = row.getCell(0);
    	 int lastrow = sheet.getPhysicalNumberOfRows();
    	 short lastCellNum = row.getLastCellNum();
    	 //intializes the matrix
    	 String[][] data=new String[lastrow-1][lastCellNum];
    	 //to find the row[0]
    	 for (int i = 1; i <lastrow ; i++) {
			//XSSFRow currentrow = sheet.getRow(i);
			//to find the cell[0]
			for (int j = 0; j < lastCellNum; j++) {
				//XSSFRow currentrow = sheet.getRow(i);
				//XSSFCell currentcell =sheet.getRow(i).getCell(j);
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();				
				System.out.println(data[i-1][j]);
			
				//System.out.println(i + "-->" + j +" = " + currentcell.getStringCellValue());   
			}
		}
		return data;
    	 }
}
