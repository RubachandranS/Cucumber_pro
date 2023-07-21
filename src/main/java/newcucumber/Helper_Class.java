package newcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper_Class {
	 WebDriver driver;
	
	
	
	public static void url(WebDriver driver,String s) {
		driver.get(s);
 
	}
	
	public static void maxi(WebDriver driver) {
		driver.manage().window().maximize();

	}
	
	public static void send(WebElement e,String value) {
		e.sendKeys(value);

	}
	public static void click(WebElement r) {
		r.click();

	}
	
	
	
	
	
	
	
	
	

}
