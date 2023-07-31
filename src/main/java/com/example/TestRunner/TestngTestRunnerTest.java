package com.example.TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions



(

		// features ="classpath:feature/01Login.feature",
		// features = "classpath:feature/02AddClient.feature",
//  features ="classpath:feature/Supervisioraccomplishment.feature",
//features ="classpath:feature/EmployeeAccomplishment.feature",


//features ="classpath:feature/SupervisorTeamDashboard.feature",

// features ={"classpath:feature/01ManageGoal.feature","classpath:feature/02ManagePIP.feature"},
 features ="classpath:feature/02ManagePIP.feature", 
// features ="classpath:feature/ManageGoal.feature",
		// features ="classpath:feature",
    				
//  features ="classpath:feature/SupervisorManageGoal.feature",
		// features
		// ={"classpath:feature/01SignUp.feature","classpath:feature/02MyProfile.feature","classpath:feature/03ProfileVerification.feature"},

		glue = "com.example.StepDefinitions",
		// monochrome=false,
	//tags = "@test7",
		////// glue="stepDefinitions",stepNotifications=true,tags="@SmokeTest or
		////// @RegressionTest",
		// glue="stepDefinitions",stepNotifications=true,tags="@SmokeTest and
		////// @RegressionTest",
		// glue="stepDefinitions",stepNotifications=true,tags="not @SanityTest"
		// plugin= {"html:target/cucumber.html",
		////// "json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenarios.txt"}
		// ),

		// plugin =
		// {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml","html:target/cucumber.html",
		// "json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenarios.txt"})
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

// AbstractTestNGCucumberTests - This is class which provided all wrappers to
// run our cucumber test through TestNG
public class TestngTestRunnerTest extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
