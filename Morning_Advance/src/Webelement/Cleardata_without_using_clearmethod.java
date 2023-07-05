package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleardata_without_using_clearmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20HTML/Keyboard.html");
		Thread.sleep(2000);
   WebElement ele = driver.findElement(By.id("a1"));
   ele.sendKeys(Keys.CONTROL+"a");
   Thread.sleep(2000);
   ele.sendKeys((Keys.DELETE));
	}

}
