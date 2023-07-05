package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Fontsize_pwd_INFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='pass']"));
	//	String size = ele.getCssValue("font-size");
	//	System.out.println(size);
          int h = ele.getSize().getHeight();
System.out.println(h);
int w = ele.getSize().getWidth();
System.out.println(w);
	}  

}
