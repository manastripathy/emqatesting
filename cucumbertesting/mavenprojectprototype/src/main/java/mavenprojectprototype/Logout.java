package mavenprojectprototype;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	Util util=new Util();
	
	@FindBy(how=How.ID,using="login")
	private WebElement loginpage_login_btn;
	
	@FindBy(how= How.XPATH,using="//*[@id=\"emT:pref\"]//*/div")
	private WebElement SYSMAN_TEXT_ID;
		
	@FindBy(how=How.XPATH,using="//*[@id=\"emT:pref::ScrollContent\"]")
	private WebElement SYSMAN_SCROLL_CONTENT;
	
	//Constructor
	public Logout (WebDriver wd) {
		PageFactory.initElements(wd, this);
	}
	
	public void do_logout () throws InterruptedException
	{
		Thread.sleep(20000);
		if (SYSMAN_TEXT_ID.isDisplayed())
		{
			SYSMAN_TEXT_ID.click();
		}
		else
		{
			System.out.println("Element" + SYSMAN_TEXT_ID + "not displayed" );
			
		}
		util.clickOnOption(SYSMAN_SCROLL_CONTENT, "Log Out");
			
	}
	
	public void checkTextOnLogoutPage() {
		Assert.assertTrue(loginpage_login_btn.isEnabled());
		System.out.println("Successfully loged out");
		
	}
	

}
