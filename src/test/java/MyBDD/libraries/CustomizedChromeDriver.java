package MyBDD.libraries;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.webdriver.DriverSource;

public class CustomizedChromeDriver implements DriverSource {

	@Override
	public WebDriver newDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return false;
	}

}
