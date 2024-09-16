package com.stepdef.pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pack.browseractions.BrowserClass;

import io.cucumber.java.*;
import io.cucumber.java.Scenario;

public class Hooks
{
	
	
	@Before(order = 1,value = "@Sc1")
	public void beforeMethod(Scenario sce)
	{
		System.out.println("::::::::::::Running Scenarion Name211:["+sce.getName()+"]:::::::::::::::::::::::::::");
	}
	
	
	@Before(order = 2,value = "@Sc2")
	public void beforeMethod1(Scenario sce)
	{
		System.out.println("::::::::::::Running Scenarion Name3:["+sce.getName()+"]:::::::::::::::::::::::::::");
	}
	
	
	@Before(order = 0,value = "@Sc3")
	public void beforeMethod2(Scenario sce)
	{
		System.out.println("::::::::::::Running Scenarion Name1:["+sce.getName()+"]:::::::::::::::::::::::::::");
	}
	
	@After
	public void screenshot(Scenario sce)
	{
		if(sce.isFailed())
		{
			byte[] screenshot = ((TakesScreenshot) BrowserClass.driver).getScreenshotAs(OutputType.BYTES);

            // Attach the screenshot to the scenario report
			sce.attach(screenshot, "image/png", "screenshot");
		}
	}
	
	@BeforeStep(value = "@Sc3")
	public void beforeStep()
	{
		System.out.println("Step Execution__Started!");
	}
	
	@AfterStep(value = "@Sc3")
	public void afterStep()
	{
		System.out.println("Step Execution__Completed!");
	}
	
	
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("AUTOMATION EXECUTION HAS STARTED!.....");
	}
	
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("AUTOMATION EXECUTION HAS COMPLETED!.....");
	}
	
	

}
