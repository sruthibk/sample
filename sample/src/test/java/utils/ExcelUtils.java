package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	ExcelUtils(String excelPath,String sheetName){
		
		try{
			 workbook =  new XSSFWorkbook(excelPath);
				 sheet = workbook.getSheet(sheetName);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
public static void getCellData(int rowNum,int columnNum) {
		
		    DataFormatter formatter= new DataFormatter();
			Object value=formatter.formatCellValue(sheet.getRow(rowNum).getCell(columnNum));
	System.out.println(value);
		
	}
	
	public static void getRowCount() {
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		
			System.out.println(rowCount);
			
		
		
	}

}
