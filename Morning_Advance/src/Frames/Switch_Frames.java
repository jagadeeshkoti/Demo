package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20HTML/mainpage.html");
		Thread.sleep(2000);
		driver.findElement(By.id("un")).sendKeys("Jagadeesh");
		Thread.sleep(2000);
	/*	driver.switchTo().frame(0);
		driver.findElement(By.id("pwd")).sendKeys("koti");
*/
	/*	driver.switchTo().frame("f1");
		driver.findElement(By.id("pwd")).sendKeys("koti");
		*/
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(ele); 
		driver.findElement(By.id("pwd")).sendKeys("koti");
		
		
		
	}

}
