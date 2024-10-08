package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static Logger LOG = LoggerFactory.getLogger(LoginPage.class);
	//private static final Logger LOG = Logger.getLogger(LoginPage.class.getName());
	
	public boolean isHomePageVisible() {
		try {		
			 return driver.findElement(ObjectRepository.LoginPageElements.Homepage).isDisplayed(); 
		}catch (Exception e) {
			LOG.error("Error in Homepage visible");
			throw e;
		}	 
	}
	
	public String getLoginPageTitle() {
		try {
			return driver.getTitle();
		}catch (Exception e) {
			LOG.error("Error while getting login page title");
			throw e;
		}		
	}
	
	public void clickOnSignupLogin() {
		try {
			driver.findElement(ObjectRepository.LoginPageElements.SignupLogin).click();
		}catch (Exception e) {
			LOG.error("Error while clicking on signup");
			throw e;
		}		
	}
	
	public boolean isLoginToYourAccountVisible() {
		try {		
			 return driver.findElement(ObjectRepository.LoginPageElements.LoginToYourAccount).isDisplayed(); 
		}catch (Exception e) {
			LOG.error("Error in Login to your account visible");
			throw e;
		}	 
	}
	
	public void enterUsernamePassword(String email, String pwd) {
		try {
			driver.findElement(ObjectRepository.LoginPageElements.EmailAddress).sendKeys(email);
			driver.findElement(ObjectRepository.LoginPageElements.Password).sendKeys(pwd);
		}catch (Exception e) {
			LOG.error("Error while entering username and password");
			throw e;
		}	
	}
	public void clickOnLogin() {
		try {
			driver.findElement(ObjectRepository.LoginPageElements.Login).click();
		}catch (Exception e) {
			LOG.error("Error while login to application");
			throw e;
		}		
	}
	
	public boolean isLoggedInUsernameVisible() {
		try {		
			 return driver.findElement(ObjectRepository.LoginPageElements.LoggedInUsername).isDisplayed(); 
		}catch (Exception e) {
			LOG.error("Error in Login to your account");
			throw e;
		}	 
	}
	
	
	public boolean h2ElementTextVisible(String xpath) {
		try {		
			 return driver.findElement(ObjectRepository.LoginPageElements.h2ElementTextVisible(xpath)).isDisplayed(); 
		}catch (Exception e) {
			LOG.error("Error in Login to your account");
			throw e;
		}	 
	}
	
	public boolean bElementTextVisible(String xpath) {
		try {		
			 return driver.findElement(ObjectRepository.LoginPageElements.bElementTextVisible(xpath)).isDisplayed(); 
		}catch (Exception e) {
			LOG.error("Error in Login to your account");
			throw e;
		}	 
	}
	
	public boolean pElementTextVisible(String xpath) {
		try {		
			 return driver.findElement(ObjectRepository.LoginPageElements.pElementTextVisible(xpath)).isDisplayed();
		}catch (Exception e) {
			LOG.error("Error in Login to your account");
			throw e;
		}	 
	}
	
	
	public void clickOnDeleteAccount() {
		try {
			driver.findElement(ObjectRepository.LoginPageElements.DeleteAccount).click();
		}catch (Exception e) {
			LOG.error("Error while login to application");
			throw e;
		}		
	}
	
	public void clickOnLogout() {
		try {
			driver.findElement(ObjectRepository.LoginPageElements.Logout).click();
		}catch (Exception e) {
			LOG.error("Error while login to application");
			throw e;
		}		
	}
	
	public void clickOnSignUp() {
		try {
			driver.findElement(ObjectRepository.RegisterPageElements.SignUp).click();
			Thread.sleep(3000);
		}catch (Exception e) {
			LOG.error("Error while login to application");
			//throw e;
		}		
	}
	
	public void enterNameEmail(String name, String email) {
		try {
			driver.findElement(ObjectRepository.RegisterPageElements.NameSignUp).sendKeys(name);
			driver.findElement(ObjectRepository.RegisterPageElements.EmailSignUp).sendKeys(email);
		}catch (Exception e) {
			LOG.error("Error while entering username and password");
			throw e;
		}	
	}

}
