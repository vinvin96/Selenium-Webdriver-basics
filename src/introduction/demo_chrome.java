package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1: Invoke .exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinVin\\Desktop\\webdriver\\chromedriver.exe");
		
		//Step 2: Create Driver Object
		WebDriver driver = new ChromeDriver();
		
		//Step 3: Open up website url
		driver.get("https://twitter.com/");
		
		//Step 4: Get title of the website 
		//to validate the title of the website
		System.out.println(driver.getTitle());
		
		//to validate the url of the website
		System.out.println(driver.getCurrentUrl());
		
		//to get page source of the website
		//System.out.println(driver.getPageSource());
		
	}

}
