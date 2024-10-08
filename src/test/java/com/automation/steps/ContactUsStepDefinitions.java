package com.automation.steps;

import org.testng.Assert;

import com.automation.factory.DriverFactory;
import com.automation.pages.ContactUsForm;

import io.cucumber.java.en.Then;

public class ContactUsStepDefinitions {
	
	private ContactUsForm contactUsForm = new ContactUsForm(DriverFactory.getDriver());

	@Then("Click on Contact Us button")
	public void click_on_contact_us_button() {
		contactUsForm.click_on_contact_us_button();
	}
	
	@Then("Enter {string} {string} {string} {string}")
	public void enter(String name, String email, String subject, String message) {
		contactUsForm.enter(name, email, subject, message);
	}
	
	@Then("Upload file")
	public void upload_file() {
	    
	}
	
	@Then("Click Submit button")
	public void click_submit_button() {
		contactUsForm.click_submit_button();
	}
	
	@Then("Click OK button")
	public void click_ok_button() {
		contactUsForm.click_ok_button();
	}
	
	@Then("Verify success message is visible")
	public void verify_success_message_is_visible() {
		String act_msg = contactUsForm.verify_success_message_is_visible();
		contactUsForm.verify_success_message_is_visible();
		String exp_msg = "Success! Your details have been submitted successfully.";
	
		Assert.assertEquals(act_msg, exp_msg);

	}
	
	@Then("Click Home button")
	public void click_home_button() {
		contactUsForm.click_HomePage();
	}
	

}
