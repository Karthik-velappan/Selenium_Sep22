package Maven_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_test {
	WebDriver driver;

	@BeforeClass
	public void launch()
	{
		driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.saucedemo.com/v1/");
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//*[@data-test='username']")).sendKeys("standard_user1");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		
		
		
	}
	
	@AfterClass
	public void close()
	{
		//driver.quit();
	}
}



