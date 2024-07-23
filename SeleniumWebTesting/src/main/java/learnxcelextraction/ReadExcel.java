package learnxcelextraction;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] inputData() throws IOException {
		//open my excel
		//set workbook path (file path)
		XSSFWorkbook wb = new XSSFWorkbook("./data/shopping.xlsx"); 
		
		//Get sheet by name
		//XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//Get sheet by index number
		System.out.println("Total number of sheets: "+wb.getNumberOfSheets());
		XSSFSheet ws = wb.getSheetAt(0);
		
		
		//Get row
		System.out.println("Total number of rows: "+ws.getPhysicalNumberOfRows());
		XSSFRow row = ws.getRow(0);
		
		
		System.out.println("Total number of cells: "+row.getPhysicalNumberOfCells());
		
		XSSFCell cell = row.getCell(0);
		System.out.println("First cell: " +cell.getStringCellValue() + "\n");
		
		String[][] data = new String[ws.getLastRowNum()][row.getLastCellNum()];
		for(int j=1;j<=ws.getLastRowNum();j++) {
			XSSFRow currentRow = ws.getRow(j);
			System.out.println("Cell number: "+ currentRow.getLastCellNum());
			for (int i = 0; i <= currentRow.getLastCellNum()-1; i++) {
				System.out.println(j+"-->"+i);
				data[j-1][i] = currentRow.getCell(i).getStringCellValue();
			}	
		}
		
		return data;
	}
}
