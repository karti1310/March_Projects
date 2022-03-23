package com.Adactin.Test_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.BaseClass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\Adactin\\Feature",glue="com\\Adactin\\StepDefinition")

public class Test_Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		//driver=BaseClass.browser("Edge");

	}
	
	@AfterClass
	public static void tearDown() {
		//driver.close();

	}
}
