package WriteExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	
	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Excel data\\writeexcel.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook workb=new XSSFWorkbook(fis);
	XSSFSheet Sheet1=workb.getSheetAt(1);
		int rowcount=Sheet1.getLastRowNum();
		int row1=rowcount++;
		System.out.println("Total row is " +"-"+row1);
		
	//	Cell cell=Sheet1.getRow(i).getCell(3);
		
		for(int i=1;i<=row1;i++)
		{	
		Sheet1.getRow(i).createCell(3).setCellValue("passed");

		
		 FileOutputStream out = new FileOutputStream( new File("C:\\Excel data\\writeexcel.xlsx"));
		  workb.write(out);
	      out.close();
		}
	      System.out.println("Write on " +src+ " Check It");

		

		}
		}
	


	