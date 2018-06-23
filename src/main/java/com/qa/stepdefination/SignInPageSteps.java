package com.qa.stepdefination;

import org.junit.Assert;

import com.qa.base.TestBase;
import com.qa.pages.SignInPage;

import cucumber.api.java.en.Then;

public class SignInPageSteps extends TestBase {
	
	SignInPage signinpage = new SignInPage();
	
	@Then("^SignIn page opens$")
	public void new_page_opens() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String SItitle = signinpage.validatesigninpage();
		Assert.assertEquals("Sign In with Auth0", SItitle);
		
		System.out.println("Sign In Page validated");
	    
	}
	
	@Then("^User login to the application$")
	public void user_login_to_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   signinpage.login(prop.getProperty("username"), prop.getProperty("password"));
	   System.out.println("Login Successful");
	}


}
