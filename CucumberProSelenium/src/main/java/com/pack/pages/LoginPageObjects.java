package com.pack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects
{
	
	@FindBy(id="email") private WebElement email;
	
	@FindBy(id="pass") private WebElement passcode;

	@FindBy(name="login") private WebElement login;
	
	
	public LoginPageObjects(WebDriver driverobj) 
	{
		PageFactory.initElements(driverobj, this);
	}
	
	
	public void inputUsernameAndPassword(String userName, String password)
	{
		email.clear();
		
		passcode.clear();
		
		email.sendKeys(userName);
		
		passcode.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		login.click();
	}
	

}
