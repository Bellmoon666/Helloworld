package passfail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class passfail {

	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Excel data\\Login.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet Login=wb.getSheetAt(0);
		int rowcount=Login.getLastRowNum();
		System.out.println("Total row is" +"-"+rowcount);
		
		Cell cell=Login.getRow(1).getCell(1);
		cell.setCellValue("Bellmoon");
		System.out.println(cell);
	 FileOutputStream out = new FileOutputStream( new File("C:\\Excel data\\Login.xlsx"));
	  wb.write(out);
      out.close();
      System.out.println("Write on " +src+ " Check It");
}
}

