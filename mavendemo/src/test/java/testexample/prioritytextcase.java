package testexample;

import org.testng.annotations.Test;

public class prioritytextcase {

	
		 @Test(priority=3,invocationCount=3,invocationTimeOut=5)
		  public void testcase1() {
			  System.out.println("test case 1");
		  }
		 @Test(priority=1,description="this gives the priority of the values")
		  public void testcase2() {
			  System.out.println("test case 2");
		  }
		 @Test(priority=2)
		  public void testcas3() {
			  System.out.println("test case 3");
		  }

	}


