package com.pack.browseractions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserClass 
{
	public static WebDriver driver;
	
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	public void launchURL(String url)
	{
		driver.get(url);
	}

	
	public void closeBrowser()
	{
		driver.close();
	}
}
