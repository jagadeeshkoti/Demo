package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickaction_using_name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20HTML/Dummylocator.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("n1"));
		ele.click();

	}

}
