package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chromelogin {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1207/Desktop/Selenium/chromedriver.exe");
		WebDriver firefox1=new ChromeDriver();
		 firefox1.get("https://in.linkedin.com");
	}

}
