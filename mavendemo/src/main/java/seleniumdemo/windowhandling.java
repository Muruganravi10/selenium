package seleniumdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class windowhandling 
{
	@Test
public void login()
{
	 System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1207//Downloads//chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://www.irctc.co.in/nget/train-search");
		chrome.manage().window().maximize();
		chrome.findElement(By.linkText("CONTACT US")).click();
		Set<String>winHandles=chrome.getWindowHandles();
		System.out.println("The number of window handles are "+winHandles.size());
		for(String winHandle:winHandles)
		{
			chrome.switchTo().window(winHandle);
		}
		String title=chrome.getTitle();
		System.out.println("The page title is "+title);
		chrome.quit();

		
	
}
}