package Testpackge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utility123.Utility1234;



public class orengetest {
  public static void main(String[] args) {
	

	
		// Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Maximize the browser window
         driver.manage().window().minimize();     

        // Set an implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Locate the username field and enter the username
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        // Locate the password field and enter the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        Utility1234.getScreenshot(driver);

        // Locate the login button and click it
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Utility1234.getScreenshot(driver);

        // Verify the URL after login
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Login successful and URL verified.");
        } else {
            System.out.println("Login failed or URL mismatch. Expected: " + expectedUrl + " but got: " + actualUrl);
        }
       
        // Close the browser
        driver.quit();

  }

}
