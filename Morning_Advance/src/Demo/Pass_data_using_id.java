package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pass_data_using_id {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20HTML/Empty_textfield.html");
		driver.findElement(By.id("a1")).sendKeys("Selenium");

	}

}
