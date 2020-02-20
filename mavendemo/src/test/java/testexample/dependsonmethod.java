package testexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethod
{
@Test(groups= {"functional testing","retesting"})
public void testcase1()
{
	System.out.println("Test case1");
}
@Test(groups= {"functional testing","smoke testing"})
public void testcase2()
{
	System.out.println("Test case2");
}
@Test(groups= {"regression testing","smoke testing"})
public void testcase3()
{
	System.out.println("Test case3");
}
	
}
