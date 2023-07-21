package org.stepdefinition;



import org.openqa.selenium.WebDriver;
import org.runallclass.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newcucumber.FaceBook_Pom;
import newcucumber.Helper_Class;

public class stepDefintion extends Helper_Class {
	
	
	public static WebDriver driver=RunnerClass.driver;
	public static FaceBook_Pom fb=new FaceBook_Pom(driver);
	
	
	@Given("User launching the browser")
	public void user_launching_the_browser() {
		url(driver, "https://www.facebook.com/");
		maxi(driver);
		    
	}

	@When("User entering the valid username in username field")
	public void user_entering_the_valid_username_in_username_field() {
		send(fb.getEmail(), "rahul");
			
	}

	@When("user entering the valid password in password field")
	public void user_entering_the_valid_password_in_password_field() {
		
		send(fb.getPassword(), "1234");
	   
	}

	@Then("user clicking the login button")
	public void user_clicking_the_login_button() {
		click(fb.getLogin());
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	WebDriver driver=RunnerClass.driver;
//	FaceBook_Pom p=new FaceBook_Pom(driver);
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Given("User launching the browser")
//	public void user_launching_the_browser() {
//	  url(driver, "https://www.facebook.com/login/");
//	  maxi(driver);
//	}
//	
//	
//	
//
//	@When("User entering the valid username in username field")
//	public void user_entering_the_valid_username_in_username_field() {
//		send(p.getEmail(), "ruba");
//		
//	}
//
//	@When("user entering the valid password in password field")
//	public void user_entering_the_valid_password_in_password_field() {
//		send(p.getPassword(), "1234");
//	}
//
//	@Then("user clicking the login button")
//	public void user_clicking_the_login_button() {
//		click(p.getLogin());
//	    

	    
	    
	    
	    
	    
	



//	@When("user have to click login button")
//	public void user_have_to_click_login_button() throws InterruptedException {
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(5000);
//	}
//
//	@Then("user have to be in invalid credentials page")
//	public void user_have_to_be_in_invalid_credentials_page(io.cucumber.datatable.DataTable dataTable) {
//
//	}

}
