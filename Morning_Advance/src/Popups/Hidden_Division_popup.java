package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='DD/MY']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='June']/../../span/span[6]/div[5]")).click();
		

	}

}
