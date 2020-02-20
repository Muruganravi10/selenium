package testexample;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class sampletestcase {
  @Test
  public void testcase1() {
	  System.out.println("test case 1");
  }
  @Test
  public void testcase2() {
	  System.out.println("test case 2");
  }
  @Test
  public void testcase3() {
	  System.out.println("test case 3");
  }
  @BeforeMethod
  public void BeforeMethod() {
	  System.out.println("BeforeMethod : Launch the app");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod : Close the app");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass : Prepare Test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass : Clear test data");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest : Open db connection");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest : Close db connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite : smoke testing");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite : generate report");
  }

}
