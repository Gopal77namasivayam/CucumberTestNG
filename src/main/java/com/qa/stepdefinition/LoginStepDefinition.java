package com.qa.stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class LoginStepDefinition extends TestBase {
	
	LoginPage login;
	HomePage homepage;
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	public LoginStepDefinition()
	{
		super();
	}
	
	@Given("^user open the browser$")
	public void user_open_the_browser()
	{
	   TestBase.initialtion();
	   
	}

	
	@Then("^user validate loginPage title$")
	public void user_validate_loginPage_title() throws IOException
	{
		login=new LoginPage();
		String title=login.validatateLoginPageTitle();
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
		
	}

	@Then("^user enter the loginto the application using valid credentils$")
	public void user_enter_the_loginto_the_application_using_valid_credentils() throws IOException
	{
		homepage = login.login(prob.getProperty("username"), prob.getProperty("password"));
	   
	}

	 
	@Then("^validate home page title$")
	public void validate_home_page_title() 
	{
		String Htitle=homepage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", Htitle);
	   
	}

	
	@Then("^validate login user name text$")
	public void validate_login_user_name_text() 
	{
		driver.switchTo().frame("mainpanel");
		boolean UText=homepage.verifyUserNameTest();
		Assert.assertTrue(UText);
	   
	}

}
