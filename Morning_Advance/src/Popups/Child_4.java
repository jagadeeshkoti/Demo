package Popups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
	driver.findElement(By.name("NewWindow")).click();
	Thread.sleep(2000);	
	String p_id = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	int count = allwh.size();
	System.out.println(count);
	for (String wh : allwh) {
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		System.out.println(title);
		if(wh.equals(p_id))
		{
			driver.close();
		}
		
		
	}
	
	
	
	}

}
