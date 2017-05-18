import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import naukri.pages.HeaderPage;
import naukri.utilities.BrowserUtility;

public class TestIt {

	private static WebDriver driver;

	@Test
	public void openingHomePage() {

		driver = BrowserUtility.launchBrowser("firefox", "https://www.naukri.com");

		BrowserUtility.closeAllWindowButThis(driver);
	}

	@Test
	public void getJobsMenu() throws InterruptedException {

		/*
		 * HeaderPage hP = PageFactory.initElements(driver, HeaderPage.class);
		 * hP.clickJobs();
		 */
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[1]/a/div")).click();
	}
}
