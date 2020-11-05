package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MAvenGitSampleProject {
	WebDriver driver;
	
	@Test
	public void doLogin()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Rishikesh");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
