package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactUsForm {
	
private WebDriver driver;
	
	public ContactUsForm(WebDriver driver) {
		this.driver = driver;
	}
	private static Logger LOG = LoggerFactory.getLogger(LoginPage.class);
	
	public void click_on_contact_us_button() {
		try {		
			  driver.findElement(ObjectRepository.ContactUsForm.ContctUsForm).click();
			  
		}catch (Exception e) {
			LOG.error("Error in Homepage visible");
			throw e;
		}	 
	}
	
	public void enter(String name, String email, String subject, String message) {
		try {		
			  driver.findElement(ObjectRepository.ContactUsForm.Name).sendKeys(name);
			  driver.findElement(ObjectRepository.ContactUsForm.Email).sendKeys(email);
			  driver.findElement(ObjectRepository.ContactUsForm.Subject).sendKeys(subject);
			  driver.findElement(ObjectRepository.ContactUsForm.Message).sendKeys(message);
			 
		}catch (Exception e) {
			LOG.error("Error in Homepage visible");
		}
	}
	
	public void click_submit_button() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
			  driver.findElement(ObjectRepository.ContactUsForm.Submit).click();
			  
		}catch (Exception e) {
			LOG.error("Error in Homepage visible");
		}	
	}
	
	public void click_ok_button() {
		try {		
			  driver.switchTo().alert().accept();
			  
		}catch (Exception e) {
			LOG.error("Error in Homepage visible");
			throw e;
		}	
	}
	
	public String verify_success_message_is_visible() {
		try {
			WebElement successMsg =  driver.findElement(ObjectRepository.ContactUsForm.SuccessMsg);
			successMsg.isDisplayed();
			return successMsg.getText();
			  
		}catch (Exception e) {
			LOG.error("Error in Homepage visible");
			throw e;
		}	
	}
	
	public void click_HomePage() {
		try {		
			  driver.findElement(By.xpath("//span[normalize-space()='Home']")).click();
			  
		}catch (Exception e) {
			LOG.error("Error in Homepage visible");
			throw e;
		}	
	}

}
