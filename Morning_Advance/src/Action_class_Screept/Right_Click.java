package Action_class_Screept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(2000);
		WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(rclick).perform();
		
		
		
		

	}

}
