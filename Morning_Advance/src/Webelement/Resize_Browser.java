package Webelement;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize_Browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		Dimension d = new Dimension(200, 300);
		driver.manage().window().setSize(d);
	
	}

}
