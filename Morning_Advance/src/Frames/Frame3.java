package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20HTML/mainpage2.html");
		Thread.sleep(2000);
         driver.findElement(By.id("un")).sendKeys("jagedeesh");
         driver.switchTo().frame(0); //A to B
         driver.findElement(By.id("pwd")).sendKeys("Koti");
         driver.switchTo().frame("f2");
         driver.findElement(By.id("c1")).click();
         
         
         
         
         
         
	}

}
