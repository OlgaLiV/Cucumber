package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	// path to our feature file							//path to our actual test(stepDefinitions package)
@CucumberOptions(features = "@target/FailedTests.txt", 
				 glue = "com/hrms/stepDefinitions",
				 monochrome = true,// clean output in console
				 plugin = {"pretty", // pretty - print out steps in console		
						   "html:target/cucumber-default-reports",//generate default html report
						   "rerun:target/FailedTests.txt"}
				 ) 
public class FailedRunner {
	
	

}
