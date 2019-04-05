package Excel_Sheet_config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Sheet {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	File src=new File("./Excel_Sheet/RegressionTestcase.xlsx");

	public Excel_Sheet()   
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
