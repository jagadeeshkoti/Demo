package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empty_Chrome2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./sw/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.close();

	}

}
