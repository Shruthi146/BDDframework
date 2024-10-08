package com.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Subscription {
	
	private WebDriver driver;
	
	public Subscription(WebDriver driver){
		this.driver=driver;
	}
	
	private static Logger LOG = LoggerFactory.getLogger(LoginPage.class);
	
	public boolean isSubscriptionVisible() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(ObjectRepository.SubscriptionElements.subscription));
		
		try {		
			 return driver.findElement(ObjectRepository.SubscriptionElements.subscription).isDisplayed(); 
		}catch (Exception e) {
			LOG.error("Error in Login to your account visible");
			throw e;
		}	 
	}

	public void entersubscriptionemail(String email) {
		try {
			driver.findElement(ObjectRepository.SubscriptionElements.subscriptionInput).sendKeys(email);
		}catch (Exception e) {
			LOG.error("Error while clicking on signup");
			throw e;
		}		
	}
	
	public void clickOnSubscribeButton() {
		try {
			driver.findElement(ObjectRepository.SubscriptionElements.subscribeButton).click();
		}catch (Exception e) {
			LOG.error("Error while clicking on signup");
			throw e;
		}		
	}

}
