package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickaction_using_id {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20HTML/Dummylocator.html");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).click();

	}

}
