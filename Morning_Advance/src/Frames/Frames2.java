package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20HTML/mainpage2.html");
		Thread.sleep(2000);
         driver.findElement(By.id("un")).sendKeys("jagedeesh");
		driver.switchTo().frame("f1");  //A to B
		driver.findElement(By.id("pwd")).sendKeys("koti");
		driver.switchTo().frame(0); //B to C
		driver.findElement(By.id("c1")).click();
		driver.switchTo().defaultContent();//C to A
		driver.findElement(By.id("un")).sendKeys("Java");
		driver.switchTo().parentFrame();  //C to B
		driver.findElement(By.id("pwd")).sendKeys("mava");
		
		
		
		
	}

}
