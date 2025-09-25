package org.steps;

import java.io.IOException;

import org.base.Ultilityclass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class KBLHooks extends Ultilityclass {
	

	
	@Before
	public void Start() {

      

		launchBrowser(1);

		  //launchurl("https://deveshop.kirloskarpumps.com/");

	
		 launchurl("https://betaeshop.kirloskarpumps.com/");

	   //   launchurl("https://betaeshopadm.kirloskarpumps.com/kbladmin");

		 //launchurl("https://eshop.kirloskarpumps.com/");

		 pagemaximize();
	   
	}
	@After
	public void End(Scenario s) throws IOException  {
		
	
		if (s.isFailed()) {
			
			TakesScreenshot tk =(TakesScreenshot)driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
		 
			//s.embed(screenshotAs, "image/png");
			
			s.attach(screenshotAs,"image/png" , s.getName());
			
		} else {
			
			//allScreenshot1("screen");
			
		}
	
	}

}
