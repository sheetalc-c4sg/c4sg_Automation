package com.crm.qa.stepdefination;

import com.crm.qa.pages.HomePage;

import cucumber.api.java.en.Then;
import org.junit.Assert;


public class HomePageSteps {
	
	HomePage homepage = new HomePage();
	
	@Then("^home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    boolean b = homepage.verifyCorrectUserName();
	    Assert.assertTrue(b);
	    System.out.println("Home page displayed");
	}
	

}
