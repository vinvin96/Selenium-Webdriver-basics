package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson1_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1: Invoke .exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinVin\\Desktop\\webdriver\\chromedriver.exe");
		
		//Step 2: Create Driver Object
		WebDriver driver = new ChromeDriver();
		
		//Step 3: Open up website url
		driver.get("https://twitter.com/");
		
		//Step 4: Locate elements and key in text
		driver.findElement(By.name("session[username_or_email]")).sendKeys("My Twitter");
		
		driver.close();
	}

}
