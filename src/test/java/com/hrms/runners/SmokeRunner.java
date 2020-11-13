package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)							
@CucumberOptions(features = "src/test/resources/features/",// path to our feature file	
			     glue = "com/hrms/stepDefinitions", //path to our actual test(stepDefinitions package)
				 dryRun = false, // if true runs over the feature steps and identify the missing implementation
				 monochrome = true,// clean output in console
				 tags = "@smoke",// execute scenarios that tagged
				 strict = false,// when set as true will fail execution when underfined step is found
				 plugin = {"pretty", // pretty - print out steps in console		
							"html:target/cucumber-default-reports" ,//generate default html report
							"rerun:target/FailedTests.txt",
							"json:target/cucumber.json"} // generate txt file only with failed tests
				) 
				

public class SmokeRunner {
	

}
