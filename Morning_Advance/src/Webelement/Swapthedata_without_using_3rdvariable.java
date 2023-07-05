package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swapthedata_without_using_3rdvariable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20HTML/swap.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.tagName("input"));
		ele.sendKeys(Keys.CONTROL+"ax");
		WebElement ele1 = driver.findElement(By.className("c1"));
		ele1.sendKeys(Keys.CONTROL+"V");
		WebElement ele2 = driver.findElement(By.id("a1"));
		ele2.sendKeys(Keys.CONTROL+"ax");
		WebElement ele3 = driver.findElement(By.tagName("input"));
		ele3.sendKeys(Keys.CONTROL+"v");
		WebElement ele4 = driver.findElement(By.className("c1"));
		ele4.sendKeys(Keys.CONTROL+"ax");
		WebElement ele5 = driver.findElement(By.id("a1"));
		ele5.sendKeys(Keys.CONTROL+"v");

	}

}
