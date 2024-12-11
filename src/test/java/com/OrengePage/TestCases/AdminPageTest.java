package com.OrengePage.TestCases;

import org.testng.annotations.*;

public class AdminPageTest extends  BaseClass
{
    @Test(priority=1)
    public void testadmin()
    {
    	try {
			
		} catch (Exception e) 
    	{
			oap.admintest();
		}
    	
    }
    @Test(priority=2)
    public void Teststudent()
    {
    	try {
			
		} catch (Exception e) 
    	{
			oap.Student();
		}
    
    }
}
