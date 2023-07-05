package Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fetch_text_alloptions_aseending_INFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.id("month"));
        ArrayList<String> l = new ArrayList<String>();
        Select s=new Select(ele);
          List<WebElement> opt = s.getOptions();
         int count = opt.size();
         for (WebElement we : opt) {
			String t = we.getText();
			 l.add(t);
		}
	Collections.sort(l);
	for(String l1:l)
	{
	System.out.println(l1);
	}

	}
}

