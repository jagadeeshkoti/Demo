package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Execution {
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void exec(String browser)
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
		}
		
	}

}
