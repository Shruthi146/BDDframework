Feature: Login page functionality

@Test1
Scenario: Login user with correct username and password
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click on Signup Or Login button
Then Verify Login to your account is visible
And Enter correct email address "shruthi@gmail.com" and password "Welcome123"
And Click login button
Then Verify that Logged in as username is visible

@Test2
Scenario: Login User with correct email and password
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click on Signup Or Login button
Then Verify "Login to your account" is visible
And Enter correct email address "shruthi@gmail.com" and password "Welcome123"
And Click login button
Then Verify that Logged in as username is visible
And Click Delete Account button
Then Verify "Account Deleted!" visible

@Test3
Scenario: Login User with incorrect email and password
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click on Signup Or Login button
Then Verify "Login to your account" is visible
And Enter incorrect email address "shruthi@gmail.com" and password "Welcome1234"
And Click login button
Then Verify error "Your email or password is incorrect!" is visible

@Test4
Scenario: Logout User
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click on Signup Or Login button
Then Verify "Login to your account" is visible
And Enter correct email address "shruthi@gmail.com" and password "Welcome123"
And Click login button
Then Verify that Logged in as username is visible
And Click Logout button
Then Verify that user is navigated to login page

