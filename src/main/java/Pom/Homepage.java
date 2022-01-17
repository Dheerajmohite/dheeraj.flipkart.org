package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	
	@FindBy(xpath="//input[@type=\"text\"]  ") private WebElement searchbar;
	@FindBy(xpath="(//div[@class=\"CXW8mj\"])[2]") private WebElement trimmer;
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]") private WebElement addcart;
	@FindBy(xpath="(//div[@class=\"_3dsJAO\"])[2]") private WebElement delete ;
	@FindBy(xpath="//div[@class=\"_3dsJAO _24d-qY FhkMJZ\"]")private WebElement remove;
	
public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchbar(String trimeer) {
		searchbar.sendKeys(trimeer);
	}
	public void movetotrimmer(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(trimmer);
		act.perform();
	}
	public void buytrimmer(WebDriver driver) {
		Actions act1 = new Actions(driver);
	    act1.moveToElement(trimmer);
	    act1.click();
	    act1.build().perform();
	    
	}
	
	public void removetrimmer(WebDriver driver) {
		remove.click();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	


