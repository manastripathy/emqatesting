package mavenprojectprototype;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"j_username::content\"]")
	private WebElement loginpage_username ;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"j_password::content\"]")
	private WebElement loginpage_password;
	
	@FindBy(how=How.ID,using="login")
	private WebElement loginpage_login_btn;
	
	public void enter_username(String userName)
	{
		loginpage_username.sendKeys(userName);
	}
	
	public void enter_password(String password)
	{
		loginpage_password.sendKeys(password);
	}
	public void click_login_btn()
	{
		loginpage_login_btn.click();
	}
	

	
}
