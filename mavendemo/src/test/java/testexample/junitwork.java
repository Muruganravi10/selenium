package testexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitwork
{
	@Test
	public void testcase1()
	{
		System.out.println("testcase1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("testcase2");
	}
	@Test
	public void testcase3()
	{
		System.out.println("testcase3");
	}
	@Before
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	@After
	public void Aftermethod()
	{
		System.out.println("aftermethod");
	}
	@BeforeClass
	public static void Beforeclass()
	{
		System.out.println("beforeclass");
	}
	@AfterClass
	public static void Afterclass()
	{
		System.out.println("afterclass");
	}
}
