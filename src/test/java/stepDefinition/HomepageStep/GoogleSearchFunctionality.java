package stepDefinition.HomepageStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjcet.GoogleHOmePage;

public class GoogleSearchFunctionality{
    GoogleHOmePage home=new GoogleHOmePage();
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

	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() throws Throwable {
	   home.isSearchBoxDisplayed();
	}

	@Then("^the page displays Google Search button$")
	public void the_page_displays_Google_Search_button() throws Throwable {
	   home.isGoogleSearchBtnDisplayed();
	}

	@Then("^the page displays Im Feeling Lucky button$")
	public void the_page_displays_Im_Feeling_Lucky_button() throws Throwable {
	   System.out.println("yet to be implemented"); 
	   home.closeSession();
	}


}
