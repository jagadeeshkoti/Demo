package Webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Perform_forward_backward_refresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.navigate().to("https://www.facebook.com");
   driver.navigate().to("https://www.google.com");
   Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	
	}

}
