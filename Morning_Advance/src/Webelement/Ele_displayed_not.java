package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_displayed_not {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20HTML/Webelement1.html");
		Thread.sleep(2000);
WebElement ele = driver.findElement(By.id("a1"));
boolean b = ele.isDisplayed();
if(b)
{
	System.out.println("is displayed");
}
else
{
	System.out.println("not displayed");
}
	}

}
