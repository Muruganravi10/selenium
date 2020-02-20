package testexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboardoperation
{

	
	@Test
		public void operation()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1207\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("billa");
			Actions action=new Actions(driver);
					action.sendKeys(Keys.TAB).perform();
			action.sendKeys("1220").perform();
			action.sendKeys(Keys.RETURN).perform();
			//driver.findElement(By.id("password")).sendKeys("123");
			
		}
	}

