package Demo;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Empty_Firefox {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value="./sw/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver = new FirefoxDriver();

	}

}
