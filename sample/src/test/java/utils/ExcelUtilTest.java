package utils;

public class ExcelUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String excelPath="./Data/dataExcel.xlsx";
		String sheetName ="Sheet1";
		ExcelUtils excelutils = new ExcelUtils(excelPath, sheetName);
		excelutils.getRowCount();
		excelutils.getCellData(1,0);
		excelutils.getCellData(1,1);
		excelutils.getCellData(1,2);
	}

}
