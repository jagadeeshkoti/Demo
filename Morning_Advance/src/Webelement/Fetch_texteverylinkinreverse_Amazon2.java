package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_texteverylinkinreverse_Amazon2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
        List<WebElement> ele= driver.findElements(By.xpath("//a"));
        int count = ele.size();
   System.out.println(count);
   for(int i=count-1;i>=0;i--)
   {
	   WebElement we = ele.get(i);
	   String text = we.getText();
	   System.out.println(text);
   }
	}


}
