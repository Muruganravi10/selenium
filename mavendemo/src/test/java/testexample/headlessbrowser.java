package testexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class headlessbrowser {
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","//C:/Users/BLTuser.BLT1210/Downloads/chromedriver.exe");
	    WebDriver driver=new HtmlUnitDriver(); 
	    driver.get("https://www.google.com");
	
	}

}
