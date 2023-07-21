package newcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_Pom {
	
	
	public WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='email']")
	private   WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	private  WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private  WebElement login;
	
//	//public FaceBook_Pom(WebDriver d2) {
//		this.driver=d2;
//		PageFactory.initElements(d2, this);
//}



	public  FaceBook_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		 }
		
	



	public  WebElement getLogin() {
		return login;
	}



	public  WebElement getEmail() {
		return email;
	}



	public  WebElement getPassword() {
		return password;
	}
	
	
	

     

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


