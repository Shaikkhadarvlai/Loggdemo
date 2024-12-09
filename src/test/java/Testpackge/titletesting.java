package Testpackge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class titletesting {
  @Test
  public void title() 
  {

	 
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com");
		   
		  String actTitle=driver.getTitle();
		  
		  Assert.assertEquals(actTitle,"Google","Fail: Title not matched!");
		  System.out.println("Pass: Title matched!");
		  
		  
		  
		  
		  
		  
		 
	  
  }
}
