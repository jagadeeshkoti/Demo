package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_02 {
	@Test
	public void test1()
	{
		Reporter.log("HELLO WORLD",true);
	}
@Test
public void test2()
{
	Reporter.log("HELLO INDIA",true);
}
}
