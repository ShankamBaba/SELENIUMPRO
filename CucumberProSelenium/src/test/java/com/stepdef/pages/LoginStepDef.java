package com.stepdef.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pack.browseractions.BrowserClass;
import com.pack.pages.LoginPageObjects;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class LoginStepDef
{
	
	BrowserClass bwsr= new BrowserClass();
	
	LoginPageObjects loginOb;
	
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() 
	{
		bwsr.openBrowser();
		
		bwsr.launchURL("https://facebook.com");
		
		loginOb = new LoginPageObjects(BrowserClass.driver);
	}
	@When("user inputs username & password")
	public void user_inputs_username_password()
	{
		loginOb.inputUsernameAndPassword("teshghsh", ".paggsgghsg");
		
		throw new RuntimeException("I am failed!");
	}
	@And("Clicks on login button")
	public void clicks_on_login_button() 
	{
		loginOb.clickOnLoginButton();

	}
	@Then("User should login successfully")
	public void user_should_login_successfully()
	{
		
		bwsr.closeBrowser();
		
	}
	
	
	@When("user inputs username {string} & password {string}")
	public void user_inputs_username_password(String userName, String password) 
	{
		loginOb.inputUsernameAndPassword(userName, password);
		
		loginOb.clickOnLoginButton();
	}
	
	
	@When("user inputs username {string} & password {string} and verify login")
	public void user_inputs_username_password_and_verifylogin(String userName, String password) 
	{
		loginOb.inputUsernameAndPassword(userName, password);
		
		loginOb.clickOnLoginButton();
		
		throw new RuntimeException("Browser Failed!..");
	}
	
	
	 @When("user inputs username & password and verify login")
	 public void verifyDataTable(DataTable val)
	 {
		List<Map<String, String>> values = val.asMaps();
		
		System.out.println("LIST SIZE:"+values.size());
		
		for(int i=0;i<values.size();i++)
		{
			Map<String, String> usenameAndpasscode = values.get(i);
			
			loginOb.inputUsernameAndPassword(usenameAndpasscode.get("username"), usenameAndpasscode.get("password"));
		}
	 }
	
	 @Given("verify {string}")
	 public void veruh(String docstring)
	 {
		 System.out.println(docstring);
	 }
	 
	 @Given("the following text:")
	 public void the_following_text(String docString) 
	 {
		 String txt=docString;
	     System.out.println(txt);
	 }
}
