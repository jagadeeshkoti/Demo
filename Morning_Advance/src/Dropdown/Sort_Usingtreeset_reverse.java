package Dropdown;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sort_Usingtreeset_reverse {
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
        TreeSet<String> t = new TreeSet<String>(Collections.reverseOrder());
        List<WebElement> opt = s.getOptions();
        int count = opt.size();
        for (WebElement we : opt) {
			String t1 = we.getText();
			t.add(t1);
		}
	for(String t2:t)
	{
		System.out.println(t2);
	}
	
	}
        
        
}