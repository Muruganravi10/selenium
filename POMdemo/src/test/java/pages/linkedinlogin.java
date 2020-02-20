package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class linkedinlogin
{
  WebDriver driver;
  By username=By.id("username");
  By password=By.id("password");
  By loginbutton=By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
  	public linkedinlogin(WebDriver driver)
  	{
  		this.driver=driver;
  	}
  	public void logintousername(String userid)
  	{
  		driver.findElement(username).sendKeys("murugan");
  	}
  	public void logintopassword(String pass)
  	{
  		driver.findElement(password).sendKeys("billa");
  	}
  	public void logintoclickbutton()
  	{
  		driver.findElement(loginbutton).click();
  	}
  
}
