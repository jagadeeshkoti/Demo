package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_FB {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	

	}

}
