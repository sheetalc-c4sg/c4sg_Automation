package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LandingPage extends TestBase {
	
	//Page Factory - OR:
		//@FindBy(Type="button")
		//WebElement loginsignup;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement loginBtn;
		
		@FindBy(xpath="//button[contains(text(),'Sign Up')]")
		WebElement signUpBtn;
		
		@FindBy(xpath="//img[contains(@class,'img-responsive')]")
		WebElement crmLogo;
		
		//Initializing the Page Objects:
		public LandingPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateCRMImage(){
			return crmLogo.isDisplayed();
		}
		
		public SignInPage loginsignupclick(){
					    
			driver.findElement(By.xpath("/html/body/my-app/my-c4sg-header/nav/div/ul[2]/li[4]/a/span/button")).click();
			return new SignInPage();
		}
		
		
		
		
		
		
		
		
		
		

}
