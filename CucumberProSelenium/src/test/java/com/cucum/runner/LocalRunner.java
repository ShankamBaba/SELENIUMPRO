package com.cucum.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="src/test/resources/features",
glue="com.stepdef.pages",
//dryRun = true,
//extraGlue = "com.stepdef.pages1",
tags = " @Valid",
//publish = false,
//monochrome = true, // displays the output on the readable format
//name="Functionality3",
//snippets=SnippetType.UNDERSCORE,
plugin = {"json:target/cucumber.json", "html:target/cucumber-reports.html"})
public class LocalRunner extends AbstractTestNGCucumberTests
{

}
