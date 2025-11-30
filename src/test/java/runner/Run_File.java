package runner;

import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = "./src/test/features", glue="steps")
public class Run_File extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
public Object[][] scenarios()
{
   return super.scenarios();
}

}
