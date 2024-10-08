package com.automation.steps;

import org.junit.Assert;

import com.automation.factory.DriverFactory;
import com.automation.pages.ProductsSearch;

import io.cucumber.java.en.Then;

public class ProductsSearchStepDefinition {
	
	private ProductsSearch products = new ProductsSearch(DriverFactory.getDriver());
	
	@Then("Click on Products button")
	public void click_on_products_button() {
		products.clickOnProducts();
	}

	@Then("Verify user is navigated to All Products page successfully")
	public void verify_user_is_navigated_to_all_products_page_successfully() {
		String act_title =  products.getAllProductsPageTitle();
		String exp_title = "Automation Exercise - All Products";
		Assert.assertEquals(act_title, exp_title);
	}

	@Then("Click on View Product of first product")
	public void click_on_view_product_of_first_product() {
		products.clickOnViewProduct();
	}

	@Then("Verify User is landed to product detail page")
	public void verify_user_is_landed_to_product_detail_page() {
		String act_title =  products.getProductDetailsPageTitle();
		String exp_title = "Automation Exercise - Product Details";
		Assert.assertEquals(act_title, exp_title);
	    
	}

	@Then("Verify that detail is visible: product name, category, price, availability, condition, brand")
	public void verify_that_detail_is_visible_product_name_category_price_availability_condition_brand() {
	    
		
	}
	
	@Then("Enter product name {string} in search input")
	public void enter_product_name_in_search_input(String productName) {
		products.enterProductNameInSearchInput(productName);
	}

	@Then("Click on search button")
	public void click_on_search_button() {
		products.clickOnSearchButton();
	}
	
	@Then("Verify SEARCHED PRODUCTS is visible")
	public void verify_searched_products_is_visible() {
		Assert.assertTrue(products.searchedProductsVisible());
	}
	

	@Then("Verify all the products related to search are visible {string}")
	public void verify_all_the_products_related_to_search_are_visible(String value) {
		products.productsRelatedSearchVisible(value);
	}

}
