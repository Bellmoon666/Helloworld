package WriteExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelWrite2 {
	private static XSSFWorkbook workb;
	private static XSSFSheet Sheet2;
	public static void main(String[] args) throws Exception {
	
		File src=new File("C:\\Excel data\\writeexcel.xlsx");
		FileInputStream fis=new FileInputStream(src);
		 workb=new XSSFWorkbook(fis);
	 Sheet2=workb.getSheetAt(2);
	int rowcount=Sheet2.getLastRowNum();
	int row1=rowcount++;
	System.out.println("Total row is " +"-"+row1);
	
	System.setProperty("webdriver.gecko.driver","D:\\Gecko Driver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.gmail.com");
String title=driver.getTitle();
System.out.println("Title is "+ title);
for(int i=1;i<=row1;i++) {
		if(title.equalsIgnoreCase("Gmail"))
		{
		
			Sheet2.getRow(i).getCell(3).setCellValue("passed");
		}
		else
		{
			Sheet2.getRow(i).getCell(3).setCellValue("failed");

		}
		

		 FileOutputStream out = new FileOutputStream( new File("C:\\Excel data\\writeexcel.xlsx"));
		  workb.write(out);
		  out.close();
}
	     

		
	      System.out.println("Write on " +src+ " Check It");

		

		}
		}



	