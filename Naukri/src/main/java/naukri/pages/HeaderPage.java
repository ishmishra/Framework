/**
 * 
 */
package naukri.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author IshM
 *
 */
public class HeaderPage {

	private WebDriver driver;

	@FindBy(xpath = "html/body/div[2]/div/ul/li[1]/a")
	private WebElement jobs;

	@FindBy(tagName = "//div[@class='subMenuc2']//a")
	private List<WebElement> jobsSubMenu;

	/**
	 * 
	 * @param jobs
	 * 
	 */
	public void clickJobs() {

		jobs.click();
	}

}
