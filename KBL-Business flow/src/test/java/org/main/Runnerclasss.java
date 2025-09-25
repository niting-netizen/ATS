package org.main;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.steps",tags="@Case10",
                 monochrome=true,dryRun=false,
		 plugin = { "json:target\\Cucumber-Reports\\Kbl.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class Runnerclasss {
	@AfterClass
	public static void JvmReport() {
		Jvmreports.generateJVM(System.getProperty("user.dir")+"\\target\\Cucumber-Reports\\Kbl.json");
		  	
	}
	
}





