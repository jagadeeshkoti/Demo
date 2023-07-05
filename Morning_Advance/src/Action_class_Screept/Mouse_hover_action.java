package Action_class_Screept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.xpath("//div[text()='Electronics']"));
		act.moveToElement(ele1).perform();
      
		
		
		
	}

}
