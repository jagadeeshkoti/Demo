package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dummy_dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///C:/Users/Admin/Desktop/selenium%20HTML/Multi_Dropdown.html");
       Thread.sleep(2000);
       WebElement ele = driver.findElement(By.id("appaji hotel"));
       Select s=new Select(ele);
       boolean b = s.isMultiple();
       if(b)
       {
    	   System.out.println("is multiple");
       }
       else
       {
    	   System.out.println("not multiple");
       }
       
       
       
	}

}
