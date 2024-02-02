package com.automation.steps;

import org.junit.Assert;

import com.automation.factory.DriverFactory;
import com.automation.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("Launch browser")
	public void launch_browser() {
		System.out.println("Browser launched");
	}

	@When("Navigate to url {string}")
	public void navigate_to_url(String url) {
		DriverFactory.getDriver().get(url);
	}
	
	@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
		Assert.assertTrue(loginPage.isHomePageVisible());
	}

	@When("Click on Signup Or Login button")
	public void click_on_signup_or_login_button() {
		loginPage.clickOnSignupLogin();
	}
	
	@Then("Verify Login to your account is visible")
	public void verify_login_to_your_account_is_visible() {
		Assert.assertTrue(loginPage.isLoginToYourAccountVisible());
	}

	@When("Enter correct email address {string} and password {string}")
	public void enter_correct_email_address_and_password(String email, String pwd) {
		loginPage.enterUsernamePassword(email, pwd);
	}

	@When("Click login button")
	public void click_login_button() {
		loginPage.clickOnLogin();
	}

	@Then("Verify that Logged in as username is visible")
	public void verify_that_logged_in_as_username_is_visible() {
		Assert.assertTrue(loginPage.isLoggedInUsernameVisible());
	}
	
	@Then("Verify {string} is visible")
	public void verify_is_visible(String string) {
		Assert.assertTrue(loginPage.h2ElementTextVisible(string));
	}
	
	@Then("Verify {string} visible")
	public void verify_visible(String string) {
		Assert.assertTrue(loginPage.bElementTextVisible(string));
	}
	
	@Then("Click Delete Account button")
	public void click_delete_account_button() {
		loginPage.clickOnDeleteAccount();
	}
	
	@When("Enter incorrect email address {string} and password {string}")
	public void enter_incorrect_email_address_and_password(String email, String pwd) {
		loginPage.enterUsernamePassword(email, pwd);
	}
	
	@Then("Verify error {string} is visible")
	public void verify_error_is_visible(String string) {
		Assert.assertTrue(loginPage.pElementTextVisible(string));
	}
	
	@Then("Click Logout button")
	public void click_logout_button() {
		loginPage.clickOnLogout();
	}

	@Then("Verify that user is navigated to login page")
	public void verify_that_user_is_navigated_to_login_page() {
		String act_title =  loginPage.getLoginPageTitle();
		String exp_title = "Automation Exercise - Signup / Login";
		Assert.assertEquals(act_title, exp_title);
	}
	
	@Then("Enter name {string} and email address {string}")
	public void enter_name_and_email_address(String name, String email) {
		loginPage.enterNameEmail(name, email);
	}

	@Then("Click Signup button")
	public void click_signup_button() {
		loginPage.clickOnSignUp();
	}

}
