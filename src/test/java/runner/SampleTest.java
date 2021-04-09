package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"F:\\Eclipse-selenium\\workspace\\CucumberPractices\\src\\test\\resources\\Features\\sample.feature"},
		glue= {"stepDefinitions"},//{"stepDefinitions","hooks"},
		tags= "@newtag2",//"@Smoke or @Regression", // "@Smoke and @Regression", "not @Smoke"
		plugin={"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"
		  },	
		monochrome=true, // for proper alignment on console
		publish=true // alternative (preferred)- create a cucumber.properties file within src/test/resources folder and set
		             // cucumber.publish.enabled=true
		)


public class SampleTest {
	

}
