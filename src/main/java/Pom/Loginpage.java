package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	
	    @FindBy(xpath="//a[@class=\"_1_3w1N\"]") private WebElement login;
		@FindBy(xpath="//input[@class=\"_2IX_2- VJZDxU\"]") private WebElement userid;
		@FindBy(xpath="//input[@type=\"password\"]") private WebElement pass;
		@FindBy(xpath="(//button[@type=\"submit\"])[2]") private WebElement submit;
		
		
	public Loginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void enteruserid(String username) {
			userid.sendKeys(username);
		}
		public void enterpassward(String passward) {
			pass.sendKeys(passward);
		}
		public void clicklogin() {
			login.click();
		}
		
		public void entersubmit() {
			submit.click();
	

}}
