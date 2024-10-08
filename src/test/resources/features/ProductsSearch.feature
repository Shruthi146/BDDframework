Feature: Search products

@Test7
Scenario: Verify All Products and product detail page
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click on Products button
Then Verify user is navigated to All Products page successfully
And Click on View Product of first product
Then Verify User is landed to product detail page
Then Verify that detail is visible: product name, category, price, availability, condition, brand

@Test8
Scenario: Search Product
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click on Products button
Then Verify user is navigated to All Products page successfully
And Enter product name 'Top For Women' in search input
And Click on search button
Then Verify SEARCHED PRODUCTS is visible
Then Verify all the products related to search are visible 'Top For Women'

