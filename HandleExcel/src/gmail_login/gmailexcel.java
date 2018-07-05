package gmail_login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class gmailexcel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\Gecko Driver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		File src=new File("C:\\Excel data\\GmailExcel.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet GmailExcel=wb.getSheetAt(0);
		int rowcount=GmailExcel.getLastRowNum();
		System.out.println("Total row is " +rowcount);
		
		
	driver.get("http://www.gmail.com");
		//driver.manage().window().maximize();
	int count=0;
		
		for(int i=1;i<=rowcount;i++)
		{
			

			String username = GmailExcel.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username is "+username);
			driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys(username);
			driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
			Thread.sleep(2000);
			String password= GmailExcel.getRow(i).getCell(2).getStringCellValue();
            //System.out.println("Password is "+password);
			//driver.findElement(By.xpath("//input[@aria-label=\"Enter your password\"]")).isDisplayed();
		    driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		if(driver.findElement(By.xpath("//div[@aria-atomic=\"true\"]")).isDisplayed())
			{
			System.out.println("Oops..Enter correct password!!!");
			String Error=driver.findElement(By.xpath("//div[@aria-atomic=\"true\"]")).getText();
			System.out.println("Actually The Error is "+Error);	
			
		    }
		else
			{
			System.out.println("Hurray!!Your login is successful");
			
			}
		
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".oj .wO.nr.l1")).sendKeys("manichandraece463@gmail.com");
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@ name=\"subjectbox\"]")).sendKeys("TestCase");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@aria-label=\"Message Body\"]")).sendKeys("selenium webdriver");
	     Thread.sleep(5000);
	     try {
			Runtime.getRuntime().exec("C:\\AutoIt\\Fileupload.exe");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     driver.findElement(By.xpath("//div[@ data-tooltip-delay=\"800\"]")).click();
	     Thread.sleep(6000);
		   driver.findElement(By.xpath("//span[@class='gb_db gbii']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		    Thread.sleep(3000);
		    
		    
              if(driver.getCurrentUrl().contains("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"))
            		  {
            	  driver.findElement(By.cssSelector(".a9cric .xjKiLb svg")).click();
            	  Thread.sleep(2000);
  			    driver.findElement(By.cssSelector(".TnvOCe.k6Zj8d.XraQ3b.bLzI3e .vdE7Oc.f3GIQ")).click();
  			    Thread.sleep(2000);
            		  }
              else
              {
            	  driver.findElement(By.cssSelector(".TnvOCe.k6Zj8d.XraQ3b.bLzI3e .vdE7Oc.f3GIQ")).click();
  			    Thread.sleep(2000);  
  			    
  			
              }
              
		}
              
		    
		    
              driver.close();
		    
		     }
		   
		   
		    //driver.findElement(By.xpath("//*[ local-name()='svg' and @fill='#000000']/*[local-name()='path' and @d='M7.41 7.84L12 12.42l4.59-4.58L18 9.25l-6 6-6-6z']")).click();
		 
		
			
	
			

}

