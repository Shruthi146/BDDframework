package com.automation.steps;

import com.automation.factory.DriverFactory;
import com.automation.pages.Subscription;

import io.cucumber.java.en.Then;

public class SubscriptionStepDefinition {
	
	Subscription subscription=new Subscription(DriverFactory.getDriver());
	
	@Then("Verify text SUBSCRIPTION")
	public void verify_text() {
		subscription.isSubscriptionVisible();
	}

	@Then("Enter email address in input {string}")
	public void enter_email_address_in_input(String string) {
		subscription.entersubscriptionemail(string);
	}

	@Then("Click subscribe arrow button")
	public void click_subscribe_arrow_button() {
		subscription.clickOnSubscribeButton();
	}

	@Then("Verify success message {string} is visible")
	public void verify_success_message_is_visible(String string) {
	    
	}
	

}
