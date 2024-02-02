package com.automation.steps;

import com.automation.factory.DriverFactory;
import com.automation.pages.RegisterPage;

import io.cucumber.java.en.Then;

public class RegisterPageStepDefinition {

	RegisterPage registerPage = new RegisterPage(DriverFactory.getDriver());
	
	@Then("Fill details {string} {string} {string} {string} {string} {string}")
	public void fill_details(String title, String name, String password, String day, String month, String year) {
		registerPage.fill_details(title, name, password, day, month, year);
	}

	@Then("Select checkbox {string}")
	public void select_checkbox(String checkboxText) {
		registerPage.select_checkbox(checkboxText);
	}

	@Then("Fill details {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void fill_details(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
		registerPage.fill_details(firstName, lastName, company, address, address2, country, state, city, zipcode, mobileNumber);
	}

	@Then("Click Create Account button")
	public void click_create_account_button() {
		registerPage.click_create_account_button();
	}

	@Then("Click Continue button")
	public void click_continue_button() {
		registerPage.click_continue_button();
	}
}
