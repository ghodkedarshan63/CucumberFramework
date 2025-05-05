package Test_Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\Users\\admin\\eclipse-workspace Core Java\\Cucumber\\Feature_File\\Login.feature",
	glue="Step_Defination",
	dryRun=false,
	monochrome=true,
	plugin="html:target/cucumber-reports/htmlReport.html"
)

public class Login_Runner {

}
