package MyBDD.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import MyBDD.steps.serenity.LoginRunTests;
import net.thucydides.core.annotations.Steps;

public class LoginRunSteps {

	@Steps
	LoginRunTests loginrun;
	
	
	@Given("the user opens the url of the application")
	public void givenTheUserOpensTheUrlOfTheApplication() {
		loginrun.givenTheUserOpensTheUrlOfTheApplication();
	}

	@When("the user enters $userid and $password")
	public void whenTheUserEntersuseridAndpassword(String userid, String password) {
		loginrun.whenTheUserEntersuseridAndpassword(userid, password);
	}

	@Then("the user should go to the home page")
	public void thenTheUserShouldGoToTheHomePage() {
	 loginrun.thenTheUserShouldGoToTheHomePage();
	}

	
	
}
