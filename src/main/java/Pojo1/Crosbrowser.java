package Pojo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crosbrowser {
	
	public static WebDriver browser() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\git\\repository\\org.flipkartautomation\\src\\main\\resources\\chromedriver.exe");
				
    WebDriver driver = new ChromeDriver();

		        driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				return driver ;

		}}

			
			

	
	
	
	
	
	
	


