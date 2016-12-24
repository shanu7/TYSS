package genericLib;

import org.openqa.selenium.WebDriver;

public class BrowserLib {
	private WebDriver driver;      

	public WebDriver getBrowser() {
		if (Constants.BROWSER.equalsIgnoreCase("chrome")) {

		} else if (Constants.BROWSER.equalsIgnoreCase("ie")) {

		} else if (Constants.BROWSER.equalsIgnoreCase("firefox")) {  

		} else if (Constants.BROWSER.equalsIgnoreCase("Opera")) {

		} else if (Constants.BROWSER.equalsIgnoreCase("safari")) {

		} else {
			System.err.println("Sorry! No Such Browser");
		}
		return driver;
	}
}
