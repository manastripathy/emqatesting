package mavenprojectprototype;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how = How.XPATH, using = "//*[@id=\"emT:ttlOt3\"]")
	private WebElement ENTEPRISE_TEXT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"emT:targets\"]")
	private WebElement TARGETS_TEXT_LINK;

	@FindBy(how = How.XPATH, using = "//*[@id=\"emT:targets::ScrollContent\"]")
	private WebElement targetsTable;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void checkForEnterpriseManagerTxtOnHomePage() {
		String text = ENTEPRISE_TEXT.getText();
		Assert.assertTrue(text.contains("Enterprise Manager Cloud Control"));

	}

	public void clickOnTargetsLink() {
		
		TARGETS_TEXT_LINK.click();
	}

	public void clickOnTargets(String targetsName) {

		List<WebElement> allrows = targetsTable.findElements(By.tagName("tr"));
		for (WebElement row : allrows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for (WebElement column : cells) {
				if (column.getText().contains(targetsName)) {
					column.click();
				}
			}
		}

	}

}
