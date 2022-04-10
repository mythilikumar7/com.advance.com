package com.advance.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"C:\\Users\\MSTSYS\\Desktop\\Advance Automation\\com.advance.com\\featureFile"},
glue = {"stepDefinition"},
plugin = { "pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm", "json:C:\\Users\\MSTSYS\\Desktop\\Advance Automation\\com.advance.com\\target\\CucumberReports\\Cucumber.json"
		},
monochrome = true,
//dryrun=false
//strict=false
tags= ("@SmokeTest")

)



public class RunnerClass {
	
	

}
