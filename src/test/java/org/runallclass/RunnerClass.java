package org.runallclass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)


@CucumberOptions(features = "src\\test\\java\\Facebook_feature\\fb.feature",glue="org.stepdefinition")

		

public class RunnerClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		
			   ChromeOptions o = new ChromeOptions();
	    	   o.addArguments("--remote-allow-origins=*");
	    	   o.addArguments("incognito");
	    	   
	    	   driver = new ChromeDriver(o);
	    	   
	    	  // url(driver, "https://www.facebook.com/login/");
		
		
	}}
	
	


