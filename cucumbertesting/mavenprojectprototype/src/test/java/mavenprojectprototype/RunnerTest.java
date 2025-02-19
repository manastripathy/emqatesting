package mavenprojectprototype;

import java.io.File;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.junit.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import dataProvider.ConfigFileReader;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)

public class RunnerTest {

	@AfterClass
	public static void writeExtentReport() throws IOException {
		ConfigFileReader cf = new ConfigFileReader();
		Reporter.loadXMLConfig(new File(cf.getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	}

}
