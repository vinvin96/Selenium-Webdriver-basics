package introduction;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo_edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1: Invoke .exe file
		System.setProperty("webdriver.edge.driver", "C:\\Users\\VinVin\\Desktop\\webdriver\\MicrosoftWebDriver.exe");
		
		//Step 2: Create Driver Object
		WebDriver driver = new EdgeDriver();
		
		//Step 3: Open up website url
		driver.get("https://twitter.com/");
		
		//Step 4: Get title of the website 
		//to validate the title of the website
		System.out.println(driver.getTitle());

	}

}
