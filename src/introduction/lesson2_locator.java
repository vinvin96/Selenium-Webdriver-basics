package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson2_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1: Invoke .exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinVin\\Desktop\\webdriver\\chromedriver.exe");
		
		//Step 2: Create Driver Object
		WebDriver driver = new ChromeDriver();
		
		//Step 3: Open up website url
		driver.get("https://twitter.com/");
		
		//Playing around with selenium basic functions
		driver.get("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close(); //close current window only
		driver.quit(); //close all windows opened by selenium script

	}

}
