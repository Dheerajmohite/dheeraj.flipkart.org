package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pojo1.Crosbrowser;
import Pom.Homepage;
import Pom.Loginpage;

class Testloginpage {
	@Test
	public void login(WebDriver driver) throws InterruptedException {
		Crosbrowser obj = new Crosbrowser();
		obj.browser();
		Loginpage obj1 = new Loginpage(driver);
		obj1.enteruserid("8624002381");
		obj1.enterpassward("dheeraj@123");
		obj1.clicklogin();
		obj1.entersubmit();
	}
	
	@Test
	public void loginhomepage(WebDriver driver) {
	   Homepage obj2 = new Homepage(driver);
	   obj2.searchbar("trimmer");
	   obj2.movetotrimmer(driver);
	   obj2.buytrimmer(driver);
	   obj2.removetrimmer(driver);
	  
	   
}
}