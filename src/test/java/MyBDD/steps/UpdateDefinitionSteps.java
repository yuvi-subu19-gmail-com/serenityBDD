package MyBDD.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import MyBDD.steps.serenity.LookupADefinitionTests;


public class UpdateDefinitionSteps {

	
	@Given("the user is on the Wikionary home page")
	public void givenTheUserIsOnTheWikionaryHomePage() {
	
	}

	@When("the user looks up the definition of the word '$word'")
	public void whenTheUserLooksUpTheDefinitionOfTheWordapple(String word) {
		Assert.assertEquals("Text Message is", "apple", word);
	 
	}

	@Then("they should see the definition '$expectedDefinition'")
	public void thenTheyShouldSeeTheDefinitionACommonRoundFruitProducedByTheTreeMalusDomesticaCultivatedInTemperateClimates(String word) {
	  
		Assert.assertEquals("Expected message is", "A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.",word);
	}
}
