package com.OrengePage;

import java.util.List;

import org.openqa.selenium.*;

public class AdminPage
{
	private WebDriver driver;
	
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;		
	}

	private By admin =By.xpath("//span[text()='Admin']");
	
	private By studentdata=By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']");
	
	
	public void admintest()
	{
		driver.findElement(admin).click();
	}
	
	public void Student()
	{

        // Locate the table rows under the specified element 
        List<WebElement> rows = driver.findElements(By.xpath("studentdata")); 
        // Print the data from each row 
        
        for (WebElement row : rows)
        { 
        
        	System.out.println(row.getText()); 
        
        } 
		
	}
	
}
