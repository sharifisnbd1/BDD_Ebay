package Ebay_Runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//TestRunner configuration and change check in github


@CucumberOptions(
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},
		
		
		features= {"C:\\Users\\shari\\eclipse-workspace\\com.Ebay\\src\\test\\java\\Features"},
		glue= {"C:\\Users\\shari\\eclipse-workspace\\com.Ebay\\src\\test\\java\\Ebay_StepDefinitions"},
				
		tags= {"@smoke"},
		
			monochrome=true,
				strict=true)
@Test
public class ebay_TestRunner extends AbstractTestNGCucumberTests {

}
