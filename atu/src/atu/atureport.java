package atu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class atureport {
@Test
	public  void verifytitle() {
	System.setProperty("webdriver.gecko.driver","D:\\Gecko Driver\\geckodriver-v0.20.0-win64\\geckodriver.exe");

	
	ExtentReports report= ExtentReports.get(atureport.class);
	report.init("D:\\software\\extentreports-java-3.1.5\\Generate.html",true);
	report.startTest("Report");
	
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	report.log(LogStatus.INFO,"Browser is up and running");
	driver.get("https://www.guru99.com/");
	report.log(LogStatus.INFO,"Application is up and running");

     String title=driver.getTitle();
 	report.log(LogStatus.INFO,"Title captured");

     
     Assert.assertTrue(title.contains("Meet"));
     report.log(LogStatus.PASS, "Title verified");
     driver.quit();
     
     report.endTest();
     }
	}
