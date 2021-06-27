package testLogging;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature", glue= {"TestLogging"}, 
plugin= {"pretty","html:target/HtmlReports/HtmlReports.html"}
)
public class runner {

}
