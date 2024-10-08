package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectRepository {
	
	public static class LoginPageElements {
			
		public static By h2ElementTextVisible(String value) {
			By xpath = By.xpath("//h2[normalize-space()='"+value+"']");
			return xpath;	
		}
		
		public static By bElementTextVisible(String value) {
			By xpath = By.xpath("//b[normalize-space()='"+value+"']");
					
					//driver.findElement(By.xpath("//h6[normalize-space()='Update - "+value+"']"));
			return xpath;	
		}
		
		public static By pElementTextVisible(String value) {
			By xpath = By.xpath("//p[normalize-space()='"+value+"']");
			return xpath;	
		}
		
		public static By Homepage = By.xpath("//a[normalize-space()='Home']");
		public static By SignupLogin = By.xpath("//a[normalize-space()='Signup / Login']");
		public static By LoginToYourAccount = By.xpath("//h2[normalize-space()='Login to your account']");
		public static By EmailAddress = By.xpath("//input[@data-qa='login-email']");
		public static By Password = By.xpath("//input[@placeholder='Password']");
		public static By Login = By.xpath("//button[normalize-space()='Login']");
		public static By LoggedInUsername = By.xpath("//li[10]//a[1]");
		public static By DeleteAccount = By.xpath("//a[normalize-space()='Delete Account']");
		public static By Logout = By.xpath("//a[normalize-space()='Logout']");
		public static By AccountDeleted = By.xpath("//b[normalize-space()='Account Deleted!']");
		public static By IncorrectEmailPwdText = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
		
		
		
	}
	
	public static class RegisterPageElements {
		
		public static By checkbox(String value) {
			By xpath = By.xpath("//label[normalize-space()='"+value+"']");
			return xpath;	
		}
		
		public static By NewUserSignUp = By.xpath("//h2[normalize-space()='New User Signup!']");
		
		public static By EmailSignUp = By.xpath("//input[@data-qa='signup-email']");
		public static By NameSignUp = By.xpath("//input[@placeholder='Name']");
		public static By SignUp = By.xpath("//button[normalize-space()='Signup']");
		public static By EmailExist = By.xpath("//p[normalize-space()='Email Address already exist!']");
		
		public static By genderMrRadio = By.xpath("//input[@value='Mr']");
		public static By genderMrsRadio = By.xpath("//input[@value='Mrs']");
		
		public static By name = By.xpath("//input[@id='name']");
		public static By password = By.xpath("//input[@id='password']");
		
		public static By Day = By.xpath("//select[@id='days']");
		public static By Month = By.xpath("//select[@id='months']");
		public static By Year = By.xpath("//select[@id='years']");
		
		public static By NewsLetterCheckbox = By.xpath("//input[@id='newsletter']");
		public static By OfferCheckbox = By.xpath("//input[@id='optin']");
		
		public static By Firstname = By.xpath("//input[@id='first_name']");
		public static By LastName = By.xpath("//input[@id='last_name']");
		public static By Company = By.xpath("//input[@id='company']");
		
		public static By Address = By.xpath("//input[@data-qa='address']");
		public static By Address2 = By.xpath("//input[@data-qa='address2']");
		public static By Country = By.xpath("//select[@id='country']");
		public static By State = By.xpath("//input[@id='state']");
		public static By City = By.xpath("//input[@id='city']");
		public static By ZipCode = By.xpath("//input[@id='zipcode']");
		public static By MobileNumber = By.xpath("//input[@id='mobile_number']");
		public static By CreateAccount = By.xpath("//button[normalize-space()='Create Account']");
		
		public static By Continue = By.xpath("//a[normalize-space()='Continue']");
		
	}
	
	public static class ContactUsForm {
		
		public static By ContctUsForm = By.xpath("//a[normalize-space()='Contact us']");
		public static By Name = By.xpath("//input[@placeholder='Name']");
		public static By Email = By.xpath("//input[@placeholder='Email']");
		public static By Subject = By.xpath("//input[@placeholder='Subject']");
		public static By Message = By.xpath("//textarea[@id='message']");
		public static By UploadFile = By.xpath("//input[@name='upload_file']");
		public static By Submit = By.xpath("//input[@name='submit']");
		
		public static By SuccessMsg = By.xpath("//div[@class='status alert alert-success']");
		
		public static By HomePage = By.xpath("//span[normalize-space()='Home']");
	}
	
	public static class ProductsElements {
		
		public static By Products = By.xpath("//a[@href='/products']");
		public static By viewProduct = By.xpath("(//a[contains(text(),'View Product')])[1]");
		
	}
	
	public static class SearchProductElements {
		
		public static By SearchInput = By.xpath("//input[@id='search_product']");
		public static By SearchButton = By.xpath("//button[@id='submit_search']");
		public static By SearchedProducts = By.xpath("//h2[normalize-space()='Searched Products']");
		
		
		public static By SearchedProduct(String value) {
			By xpath = By.xpath("//div[@class='productinfo text-center']//p[contains(text(),'"+value+"')]");
			return xpath;	
		}
	}
	
	public static class SubscriptionElements {
		
		
		public static By subscription = By.xpath("//h2[normalize-space()='Subscription']");
		public static By subscriptionInput = By.xpath("//input[@id='susbscribe_email']");
		public static By subscribeButton = By.xpath("//button[@id='subscribe']");
		public static By subsciptionSuccesMsg = By.xpath("");
	}

}
