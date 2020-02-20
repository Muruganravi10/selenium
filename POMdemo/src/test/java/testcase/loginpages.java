package testcase;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import library.wrapperEx;
import pages.linkedinlogin;

public class loginpages extends wrapperEx
{
@BeforeClass
public void startup()
{
	launchApplication("chrome","https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
}

@Test
public void login()
{
	linkedinlogin lpage=new linkedinlogin(driver);
	lpage.logintousername("welcome");
	lpage.logintopassword("welcome123");
	lpage.logintoclickbutton();
}
@AfterClass
public void close()
{
	quit();
}

}
