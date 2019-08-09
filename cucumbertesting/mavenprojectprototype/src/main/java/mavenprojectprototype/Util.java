package mavenprojectprototype;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Util {
	
	public void clickOnOption(WebElement element,String targetsName) {

		List<WebElement> allrows = element.findElements(By.tagName("tr"));
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
