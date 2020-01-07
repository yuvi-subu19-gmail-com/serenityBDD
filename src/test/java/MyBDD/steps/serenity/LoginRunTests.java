package MyBDD.steps.serenity;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import MyBDD.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginRunTests extends ScenarioSteps {

	LoginPage lp;
	
	@Step
	public void givenTheUserOpensTheUrlOfTheApplication() {
	 lp.openURL();
	}

	@Step
	public void whenTheUserEntersuseridAndpassword(String userid, String password) {
		lp.login(userid, password);
	}

	@Step
	public void thenTheUserShouldGoToTheHomePage() {
	  lp.verifyTitle();
	}
	
	
}
