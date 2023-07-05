package Runner_Script;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depend1 {
	@Test 
	public void test1() {
		System.out.println("Hello India");
	}
	@Test
	public void test2()
	{
		System.out.println("Hello Asia");
	Assert.fail();
	} 
   @Test(dependsOnMethods = "test2")
   public void test3()
   {
	   System.out.println("Hello Banglore");
   }
}
