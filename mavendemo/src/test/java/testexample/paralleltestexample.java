package testexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class paralleltestexample {
  @Test
  public void f()
  {
	  System.out.println("login to linkedin");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C://Users//BLTuser.BLT1207//Downloads//chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
	      chrome.get("https://in.linkedin.com");
		chrome.manage().window().maximize();
chrome.findElement(By.className("nav__button-secondary")).click();
chrome.findElement(By.id("username")).sendKeys("murugannru@gmail.com");
chrome.findElement(By.id("password")).sendKeys("1230");
chrome.findElement(By.className("btn__primary--large from__button--floating")).click();
chrome.findElement(By.xpath("//*[@id=app__container]/main/div/form/div[3]/button")).click();
	  
 }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("logout");
  }

}
