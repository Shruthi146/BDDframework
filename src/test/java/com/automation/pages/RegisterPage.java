package com.automation.pages;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.en.Then;

public class RegisterPage {
	
private WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static Logger LOG = LoggerFactory.getLogger(LoginPage.class);
	
	
	public void fill_details(String title, String name, String password, String day, String month, String year) {
		
		try {
			
			if(title.equals("Mrs.")) {
				driver.findElement(ObjectRepository.RegisterPageElements.genderMrsRadio).click();
			}
			else if(title.equals("Mr.")){
				driver.findElement(ObjectRepository.RegisterPageElements.genderMrRadio).click();
			}
			Thread.sleep(2000);
			driver.findElement(ObjectRepository.RegisterPageElements.name).clear();
			driver.findElement(ObjectRepository.RegisterPageElements.name).sendKeys(name);
			Thread.sleep(2000);
			driver.findElement(ObjectRepository.RegisterPageElements.password).sendKeys(password);
			
			Select day_drp = new Select(driver.findElement(ObjectRepository.RegisterPageElements.Day));
			day_drp.selectByVisibleText(day);
			Thread.sleep(2000);
			Select month_drp = new Select(driver.findElement(ObjectRepository.RegisterPageElements.Month));
			month_drp.selectByVisibleText(month);
			Thread.sleep(2000);
			Select year_drp = new Select(driver.findElement(ObjectRepository.RegisterPageElements.Year));
			year_drp.selectByVisibleText(year);
			
			Thread.sleep(2000);
		}catch (Exception e) {
			LOG.error("Error while entering username and password");
		}	
		    
	}
	
	public void select_checkbox(String checkboxText) {
		try {
			if(checkboxText.equals("Sign up for our newsletter!")) {
				driver.findElement(ObjectRepository.RegisterPageElements.NewsLetterCheckbox).click();
				Thread.sleep(2000);
			}
			else if(checkboxText.equals("Receive special offers from our partners!")) {
				WebElement s=driver.findElement(ObjectRepository.RegisterPageElements.OfferCheckbox);
				s.click();
				System.out.println("check box : "+ s.isEnabled());
				Thread.sleep(3000);
			}
		}catch (Exception e) {
			LOG.error("Error while entering username and password");
		}   
	}
	
	public void fill_details(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
		try {
			
			driver.findElement(ObjectRepository.RegisterPageElements.Firstname).sendKeys(firstName);
			driver.findElement(ObjectRepository.RegisterPageElements.LastName).sendKeys(lastName);
			driver.findElement(ObjectRepository.RegisterPageElements.Company).sendKeys(company);
			driver.findElement(ObjectRepository.RegisterPageElements.Address).sendKeys(address);
			driver.findElement(ObjectRepository.RegisterPageElements.Address2).sendKeys(address2);
			Select drp = new Select(driver.findElement(ObjectRepository.RegisterPageElements.Country));
			drp.selectByVisibleText(country);
			driver.findElement(ObjectRepository.RegisterPageElements.State).sendKeys(state);
			driver.findElement(ObjectRepository.RegisterPageElements.City).sendKeys(city);
			driver.findElement(ObjectRepository.RegisterPageElements.ZipCode).sendKeys(zipcode);
			driver.findElement(ObjectRepository.RegisterPageElements.MobileNumber).sendKeys(mobileNumber);
			
			

		}catch (Exception e) {
			LOG.error("Error while entering username and password");
		}   
	}
	
	public void click_create_account_button() {
		try {
			driver.findElement(ObjectRepository.RegisterPageElements.CreateAccount).click();
			Thread.sleep(2000);
		}catch (Exception e) {
			LOG.error("Error while entering username and password");
		}   
	}

	public void click_continue_button() {
		try {
			driver.findElement(ObjectRepository.RegisterPageElements.Continue).click();
			
		}catch (Exception e) {
			LOG.error("Error while entering username and password");
		}   
	   
	}

}
