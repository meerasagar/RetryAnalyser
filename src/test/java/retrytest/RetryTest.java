package retrytest;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class RetryTest {
	
	@Test
	public void test1()
	{
		Assert.assertTrue(false);
		System.out.println("test1");
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
		
	}

}
