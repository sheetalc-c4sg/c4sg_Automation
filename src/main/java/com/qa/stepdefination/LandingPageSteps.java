package com.qa.stepdefination;

import org.junit.Assert;

import com.qa.base.TestBase;
import com.qa.pages.LandingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LandingPageSteps extends TestBase{
	
	LandingPage landingpage = new LandingPage();
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.initialization();
	    
	}

	@Then("^user is on Landing Page$")
	public void user_is_on_Landing_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title = landingpage.validateLoginPageTitle();
		System.out.println("This Prints-----  "+title);
		Assert.assertEquals("Code for Social Good", title);
		
	  
	}

	@Then("^User clicks on Log In/Sign Up button$")
	public void user_Clicks_on_login_Sign_Up_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		landingpage.loginsignupclick();
		System.out.println("Sign in Page opens");
		
	    
	}



	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   landingpage.closeBrowser();
	}




}
