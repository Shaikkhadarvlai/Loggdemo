package com.OrengePage.TestCases;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.OrengePage.AdminPage;
import com.OrengePage.Loginpage;
import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.utility123.Utility1234;

public class BaseClass 
{
	public WebDriver driver;
	public Loginpage olp;
	public AdminPage oap;
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	@BeforeSuite
	public void reports()
	{
		//create ExtentReport instance
		  extent = new ExtentReports();
		  
		  //Using reporter we can add path
		spark = new ExtentSparkReporter("Reports/OrengeHRM.html");
		  
		  //setup any configuration
		  spark.config().setDocumentTitle("Sprint1 report");
		  spark.config().setReportName("OrengeHRMAutomation Report");
		  spark.config().setTheme(Theme.DARK);
		  
		  
		  //attached the report
		  extent .attachReporter(spark);
		  
		  
		  //Create a test-ExtentTest
		  test=extent.createTest("OrengeHRM End To End Report");
		  
	}
	
	@BeforeTest
	public void Setupbrowser()
	{
           
		
		WebDriver driver=new ChromeDriver();
		 Reporter.log("Log: Driver session is created",true);
		 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Reporter.log("Log: Apllication is open",true);
		test.pass("OrengHRM Application open Successfully!");
		
		olp=new Loginpage (driver);
		oap=new AdminPage (driver);
		
	}

	@BeforeClass()
	public void SetupPages() throws InterruptedException
	{
		Reporter.log("Log :Log page is open",true);
		olp.url();
		addWait();
		olp.Title();
		addWait();
		olp.allfunctions();
		addWait();
		Reporter.log("Log:Login is completed with valid data set",true);
		test.pass("Login completed!");
		
		oap.admintest();
		addWait();
		oap.Student();
		
	
	}
	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterSuite
	public void exitReport()
	{
		extent.flush();
	}
}
