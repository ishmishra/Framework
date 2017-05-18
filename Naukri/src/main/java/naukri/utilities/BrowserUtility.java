/**
 * 
 */
package naukri.utilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author IshM
 *
 */
/**
 * @author IshM
 *
 */
public class BrowserUtility {

	private static WebDriver driver;

	/**
	 * @param browser
	 * @param url
	 * @return WebDriver instance
	 */
	public static WebDriver launchBrowser(String browser, String url) {

		if (browser.toLowerCase() == "firefox") {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");

			driver = new FirefoxDriver();
			driver.get(url);

		} else if (browser.toLowerCase() == "chrome") {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get(url);
		}
		return driver;
	}

	/**
	 * @param driver
	 *            Particular instance of a driver
	 */
	public static void closeAllWindowButThis(WebDriver driver) {

		// Return a set of window handles which can be used to iterate over all
		// open windows of this WebDriver instance
		Set<String> windowHandles = driver.getWindowHandles();

		String currentHandle = driver.getWindowHandle();
		System.out.println(currentHandle);
		for (String handle : windowHandles) {

			System.out.println("At handle: " + handle);
			if (!handle.equals(currentHandle)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(currentHandle);

	}

}
