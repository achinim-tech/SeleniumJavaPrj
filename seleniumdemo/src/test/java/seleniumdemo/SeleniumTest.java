package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	WebDriver driver;
	   
	 @BeforeTest  
	  public void setUpDriver() {  
		 System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	  } 

	@Test
	public void test1 ()
	{
		
		 driver.get("http://google.com");  
		 driver.findElement(By.name("q")).sendKeys("selenium");
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 driver.quit();
		
		
	}
	
	@Test
	public void test2 ()
	{
		
		 System.out.println("pass");
		
		
	}

}
