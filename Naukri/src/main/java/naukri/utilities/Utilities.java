/**
 * 
 */
package naukri.utilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;

/**
 * @author IshM General utility functions are here
 */
public class Utilities {

	public static void closeAllButThis(WebDriver driver) {

		// Return a set of window handles which can be used to iterate over all
		// open windows of this WebDriver instance
		Set<String> windowHandles = driver.getWindowHandles();
		
		

	}
}
