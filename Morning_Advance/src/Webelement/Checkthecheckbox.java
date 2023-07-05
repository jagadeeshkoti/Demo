package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkthecheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20HTML/Dummy_checkbox.html");
		List<WebElement> ele = driver.findElements(By.xpath("//input"));
		int count = ele.size();
		System.out.println(count);
		for(int i=0;i<=count;i++)
		{
			WebElement ch = ele.get(i);
			ch.click();
			Thread.sleep(2000);
		}
	for(int i=count-1;i>=0;i--)
	{
		WebElement ch1 = ele.get(i);
		ch1.click();
	}
	
	}

}
