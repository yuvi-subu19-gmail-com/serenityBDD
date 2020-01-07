
package MyBDD.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;


public class LoginPage extends PageObject {
	
	
	@FindBy(className="login")
	@CacheLookup
	WebElement menuLogin;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="passwd")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="SubmitLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(className="logout")
	@CacheLookup
	WebElement btnLogout;
	
	

	public void login(String UserName, String Password)
	{
		openURL();
		clickMenuLogin();
		setUsername(UserName);
		setPassword(Password);
		clickBtnLogin();
		
		
	}
	
	public void openURL()
	{
		//WebDriverManager.chromedriver().setup();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getDriver().get("http://automationpractice.com/index.php");
	}
	
	public void clickMenuLogin()
	{
		menuLogin.click();
		
	}
	
	public void setUsername(String UserName)
	{
		txtEmail.sendKeys(UserName);
		
	}

	public void setPassword(String Password)
	{
		txtPassword.sendKeys(Password);
		
	}
	
	public void clickBtnLogin()
	{
		btnLogin.click();
		
	}
	
	public void clickBtnLogout()
	{
		btnLogout.click();
		
	}
	
	public void verifyTitle()
	{
		Assert.assertEquals(getDriver().getTitle(), "My account - My Store");
		
		
	}
}