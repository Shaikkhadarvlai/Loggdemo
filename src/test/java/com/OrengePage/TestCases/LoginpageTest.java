package com.OrengePage.TestCases;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginpageTest extends BaseClass
{
	@Test(priority=1)
	public void teturl()
	{
	 String Url= olp.url();
	 Assert.assertTrue(Url.contains("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"),"The url is not matched");
	 System.out.println("the url is matched");
	 
	 
	}
	
	@Test(priority=2)
	public void testtile()
	{
		String title =olp.Title();
	Assert.assertTrue(title.contains("OrangeHRM"),"The Title is not matched");
	System.out.println("The Title is matched");
		
	}
	
	@Test(priority=3)
	public void Testallfunctions()
	{
	    olp.allfunctions();
	}

}
