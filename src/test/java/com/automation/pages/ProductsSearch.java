package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductsSearch {
	
	private WebDriver driver;
	
	public ProductsSearch(WebDriver driver) {
		this.driver = driver;
	}
	
	private static Logger LOG = LoggerFactory.getLogger(LoginPage.class);
	
	
	public void clickOnProducts() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {	
			WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(ObjectRepository.ProductsElements.Products));
			element.click();
			// driver.findElement(ObjectRepository.ProductsElements.Products).click(); 
			 
		}catch (Exception e) {
			LOG.error("Error while clicking on products");
			throw e;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	public String getAllProductsPageTitle() {
		try {
			return driver.getTitle();
		}catch (Exception e) {
			LOG.error("Error while getting all products page title");
			throw e;
		}
	}
	
	public void clickOnViewProduct() {
		try {		
			Thread.sleep(1000);
			 driver.findElement(ObjectRepository.ProductsElements.viewProduct).click(); 
			 
		}catch (Exception e) {
			LOG.error("Error while clicking on view product");
			//throw e;
		}	 
	}
	
	public String getProductDetailsPageTitle() {
		try {
			return driver.getTitle();
		}catch (Exception e) {
			LOG.error("Error while getting product details page title");
			throw e;
		}		
	}
	
	public void enterProductNameInSearchInput(String productName) {
		try {		
			 driver.findElement(ObjectRepository.SearchProductElements.SearchInput).sendKeys(productName); 
			 
		}catch (Exception e) {
			LOG.error("Error while clicking on view product");
			throw e;
		}	 
	}
	
	public void clickOnSearchButton() {
		try {		
			 driver.findElement(ObjectRepository.SearchProductElements.SearchButton).click(); 
			 
		}catch (Exception e) {
			LOG.error("Error while clicking on view product");
			throw e;
		}	 
	}
	
	public boolean searchedProductsVisible() {
		try {		
			return driver.findElement(ObjectRepository.SearchProductElements.SearchedProducts).isDisplayed(); 
			 
		}catch (Exception e) {
			LOG.error("Error while clicking on products");
			throw e;
		}		
	}
	
	public void productsRelatedSearchVisible(String value) {
		try {		
			 driver.findElement(ObjectRepository.SearchProductElements.SearchedProduct(value)).click(); 
			 
		}catch (Exception e) {
			LOG.error("Error while clicking on view product");
			throw e;
		}	
		
		   
	}

	

}
