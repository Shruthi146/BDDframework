Feature: Contact Us Form

@Test6
Scenario Outline: Contct us form
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click on Contact Us button
Then Verify 'Get In Touch' is visible
And Enter "<Name>" "<Email>" "<Subject>" "<Message>"
And Upload file
And Click Submit button
And Click OK button
Then Verify success message is visible
And Click Home button
Then Verify that home page is visible successfully

Examples:
|Name|Email         |Subject |Message            |
|Shru|shru@gmail.com|Feedback|Very good materials|
