package mavenprojectprototype;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DatabasePage {

	
	@FindBy(how = How.CLASS_NAME, using = "af_commandImageLink_text")
	private List<WebElement> ALL_DATABASE_NAMES_DISPLAY;

	/* This is constructor */
	
	public DatabasePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	/* Checking whether database name provided as input parameter 
	 * is present in the page or not 
	*/
	
	public void CheckDatabaseNameDisplayingOrNot(String databaseName) {
		String databasepresent = "false";
		
		for (WebElement db : ALL_DATABASE_NAMES_DISPLAY) {
			System.out.println("Database Name " + db);
			if (db.getText().equals(databaseName)) {
				databasepresent = "true";
				break;
			} else {
				System.out.println(db.getText() + " is not same as " +databaseName );
			}
		}

		Assert.assertTrue(databasepresent.equals("true"));
	}
	
	/* Clicking on database name provided as Input */
	
	public void clickOnDatabase(String databasename) {
		for (WebElement db : ALL_DATABASE_NAMES_DISPLAY) {
			if(db.getText().equals(databasename))
			{
				db.click();
			}
		}
	}
	
	
}
