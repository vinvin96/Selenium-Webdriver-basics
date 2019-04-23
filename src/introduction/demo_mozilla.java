package introduction;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo_mozilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1: Invoke .exe file
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VinVin\\Desktop\\webdriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		//Step 2: Create Driver Object
		WebDriver driver = new FirefoxDriver();
		
		//Step 3: Open up website url
		driver.get("https://twitter.com/");
		
		//Step 4: Get title of the website 
		//to validate the title of the website
		System.out.println(driver.getTitle());

	}

}
