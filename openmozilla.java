package selenium_prg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openmozilla {

	public static void main(String[] args) {
		System.out.println("hai");
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\firefoxdriver_win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		// TODO Auto-generated method stub
		
	}

}
