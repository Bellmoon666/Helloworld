package atu;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class normalatu {
@Test
	public void atunormal() {
		 
	ExtentReports report= ExtentReports.get(normalatu.class);
	report.init("D:\\software\\extentreports-java-3.1.5\\normal.html",true);
	report.startTest("Report");
	
	int i=8;
	report.log(LogStatus.INFO,"Check with integer");

		if(i>4)
		{
			System.out.println("Wow!! You are a great mathematician");
			report.log(LogStatus.INFO,"Running through if condition");

		}
		else
		{
			System.out.println("Oops!!Count the numbers correctly");
			report.log(LogStatus.INFO,"Running through else condition");

		}
	     report.log(LogStatus.PASS, "Integer checked correctly");

	     report.endTest();

	}
}
