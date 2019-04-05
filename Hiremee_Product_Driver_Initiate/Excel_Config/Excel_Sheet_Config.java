package Excel_Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Sheet_Config 
{	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	//File src=new File("D:\\automation\\Hiremee_Product_UAT__smoke_Testing\\CMMI-F-08-04-R0-SmokeTestCase-HireMee 8.6.xlsx");
	//File src=new File("./Excel_Sheet/CMMI-F-08-04-R0-SmokeTestCase-HireMee 8.6.xlsx");
	File src=new File("./Excel_Sheet/SmokeTestCaseHireMee.xlsx");
	
	public Excel_Sheet_Config() 
	{

		try {
			FileInputStream fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//wb.close();	
	}		

	public String Read_data(int SheetNumber,int row,int column)
	{
		sheet=wb.getSheetAt(SheetNumber);
		String data=sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public String Write_data_pass(int SheetNumber,int row,int column) throws Exception
	{	

		sheet=wb.getSheetAt(SheetNumber);
		sheet.getRow(row).createCell(column).setCellValue("PASS");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		return null;
	}

	public String Write_data_fail(int SheetNumber,int row,int column) throws Exception
	{	

		sheet=wb.getSheetAt(SheetNumber);
		sheet.getRow(row).createCell(column).setCellValue("FAIL");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		return null;
	}
	
	
	
	
	}



