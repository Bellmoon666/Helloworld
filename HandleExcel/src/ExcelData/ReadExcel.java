package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Excel data\\Login.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet Login=wb.getSheetAt(0);
		int rowcount=Login.getLastRowNum();
		System.out.println("Total row is" +"-"+rowcount);
		
		
		for(int i=0;i<rowcount;i++)
		{
			
			String data0=Login.getRow(i).getCell(0).getStringCellValue();
			float data1=(int)Login.getRow(i).getCell(1).getNumericCellValue();
			System.out.println("The data from Excel is" +data0);
			System.out.println("The data from Excel is" +data1);
		}
		
		
		
		
		
		
		

	}

}
