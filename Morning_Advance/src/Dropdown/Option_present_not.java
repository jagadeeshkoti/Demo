package Dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Option_present_not {
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
	        Select s=new Select(ele);
	        ArrayList<String> l = new ArrayList<String>();
	        List<WebElement> opt = s.getOptions();
	        for (WebElement we : opt) {
				String text = we.getText();
		l.add(text);
	        
	        }
	        if(l.contains("Sep"))
	        {
	        	System.out.println("Option is present");
	        }
	        else
	        {
	        	System.out.println("Option is not present");
	        }
	
		
		
		}

}
