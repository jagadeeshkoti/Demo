package Action_class_Screept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//div[@id='box3']"));
		Thread.sleep(2000);
		WebElement dst = driver.findElement(By.xpath("//div[@id='box103']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();

	}

}
 