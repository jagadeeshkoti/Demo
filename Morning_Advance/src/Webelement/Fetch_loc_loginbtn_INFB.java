package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_loc_loginbtn_INFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Log in']"));
		Point locn = ele.getLocation();
	System.out.println(locn);
	int x = locn.getX();
	System.out.println(x);
	int y = locn.getY();
	System.out.println(y);

	}

}
