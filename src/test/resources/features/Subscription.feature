Feature: Subscription page

@Test9
Scenario: Verify Subscription in home page
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
Then Verify text SUBSCRIPTION
And Enter email address in input "shruthi@gmail.com"
And Click subscribe arrow button
Then Verify success message 'You have been successfully subscribed!' is visible
