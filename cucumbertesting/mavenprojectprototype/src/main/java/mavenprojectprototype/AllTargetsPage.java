package mavenprojectprototype;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AllTargetsPage {
	
	@FindBy(how=How.XPATH,using="//*[@id=\"emT:ch_fn_txt\"]")
	private WebElement alltargetTextId;
	
	
	public AllTargetsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void checkAllTargetsTextVisibleOrNot() {
		Assert.assertTrue(alltargetTextId.getText().equals("All Targets"));
	}

}
