package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Empty_Chrme {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
		

	}

}
