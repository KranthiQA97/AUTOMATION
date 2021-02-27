package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/Features/",
		glue = {"stepdefinitions"},
//		plugin = {""},
		dryRun = false,
		monochrome =true
//		strict = false,
//		tags = ""
		)
public class RunCucumberIT {

}
