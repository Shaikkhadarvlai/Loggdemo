package com.OrengePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{

	private WebDriver driver;
	
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	private By user =By.name("username");
	
	private By passowrd=By.name("password");
	
	private By clicksubmit =By.xpath("//button[@type='submit']");
	
	public String url()

	{
		return  driver.getCurrentUrl();
	}
	
	
	public String Title()
	{
		return driver.getTitle();
	}
	
	
	public void allfunctions( )
	{
		driver.findElement(user).sendKeys("Admin");
		driver.findElement(passowrd).sendKeys("admin123");
		driver.findElement(clicksubmit).click();
		
		
	}


	
	
	
	
	
}
