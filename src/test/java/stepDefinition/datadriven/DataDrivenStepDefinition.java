package stepDefinition.datadriven;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjcet.GoogleHOmePage;

public class DataDrivenStepDefinition{

	private GoogleHOmePage home=new GoogleHOmePage();
	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Throwable {
	   home.launchBrowser();
	   System.out.println(home.hashCode());
	}

	@When("^I open Google Homepage$")
	public void i_open_Google_Homepage() throws Throwable {
	  home.goToGoogleHomePage();
	  System.out.println(home.hashCode());
	}
	@Then("^I search for data \"([^\"]*)\"$")
	public void i_search_for_data(String arg1) throws Throwable {
		
		home.searchForInput(arg1);
		home.clickOnSearchBtn();
		
	}

}
