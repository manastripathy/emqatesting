package mavenprojectprototype;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;
	Properties inputFile;
	HomePage hp;
	AllTargetsPage ap;
	Logout lo;
	DatabasePage dbpage;

	public LoginSteps() throws IOException {
		ReadPropFile rf = new ReadPropFile();
		inputFile = rf.readPropFile();
	}

	@Given("^lanuch EM URL in \"(.*)\"$")
	public void lanuch_EM_URL_in_browsername(String browser) throws Throwable {
		BrowserSelection bs = new BrowserSelection();
		driver = bs.initiateBrowserBasedOnInput(browser);
		driver.get(inputFile.getProperty("EM_URL"));

	}
	

	@When("^enter username pssword and click login button$")
	public void enter_username_pssword_and_click_login_button() throws Throwable {
		LogInPage lp = new LogInPage(driver);
		lp.enter_username(inputFile.getProperty("USERNAME"));
		lp.enter_password(inputFile.getProperty("PASSWORD"));
		lp.click_login_btn();
	}

	@Then("^checking for enterprise manager text in home page$")
	public void checking_for_enterprise_manager_text_in_home_page() throws Throwable {
		hp = new HomePage(driver);
		hp.checkForEnterpriseManagerTxtOnHomePage();
	}

	@When("^Click on logout$")
	public void Click_on_logout() throws Throwable {
		lo = new Logout(driver);
		lo.do_logout();
		
	}

	@Then("^Successfully logged out$")
	public void Successfully_logged_out() throws Throwable {
		lo = new Logout(driver);
		lo.checkTextOnLogoutPage();
		driver.quit();
	}

	@Given("^click on Targets link to see all the options$")
	public void click_on_Targets_link_to_see_all_the_options() throws Throwable {
		hp = new HomePage(driver);
		hp.clickOnTargetsLink();
	}

	@Given("^click on All Targets link$")
	public void click_on_All_Targets_link() throws Throwable {
		Thread.sleep(10000);
		hp.clickOnTargets("All Targets");

	}

	@When("^check for All Target text on the landed page$")
	public void check_for_All_Target_text_on_the_landed_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ap = new AllTargetsPage(driver);
		ap.checkAllTargetsTextVisibleOrNot();
	}
	
	@When("^click on Database option$")
	public void click_on_Database_option () throws InterruptedException {
		hp.clickOnTargets("Databases");
		Thread.sleep(20000);
		
	}
	
	@Then("^Database page should load successfully$")
	public void Database_page_should_load_successfully () throws InterruptedException {
		dbpage=new DatabasePage(driver);		
		dbpage.CheckDatabaseNameDisplayingOrNot("Oemrep_Database");
	}
}
