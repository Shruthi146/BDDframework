Feature: Register

@Test1
Scenario Outline: Registeration of user
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click on Signup Or Login button
Then Verify 'New User Signup!' is visible
And Enter name "shru" and email address "abcshruthi@gmail.com"
And Click Signup button
Then Verify 'Enter Account Information' visible
And Fill details "<Title>" "<Name>" "<Password>" "<Day>" "<Month>" "<Year>"
And Select checkbox 'Sign up for our newsletter!'
And Select checkbox 'Receive special offers from our partners!'
And Fill details "<FirstName>" "<LastName>" "<Company>" "<Address>" "<Address2>" "<Country>" "<State>" "<City>" "<Zipcode>" "<MobileNumber>"
And Click Create Account button
Then Verify 'Account Created!' visible
And Click Continue button
Then Verify that Logged in as username is visible
And Click Delete Account button
Then Verify 'Account Deleted!' visible 
And Click Continue button

Examples:
|Title|Name   |Password  |Day|Month|Year|FirstName|LastName|Company|Address|Address2|Country|State    |City     |Zipcode|MobileNumber|
|Mrs. |Shruthi|Welcome123|25 |June |1995|Shuthi   |S       |JRD    |Pai    |Layout  |India  |Karnataka|Bangalore|560017 |9876543210  |


@Test2
Scenario Outline: Register User with existing email
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click on Signup Or Login button
Then Verify 'New User Signup!' is visible
And Enter name "shru" and email address "abcshru@gmail.com"
And Click Signup button
Then Verify 'Enter Account Information' visible
And Fill details "<Title>" "<Name>" "<Password>" "<Day>" "<Month>" "<Year>"
And Select checkbox 'Sign up for our newsletter!'
And Select checkbox 'Receive special offers from our partners!'
And Fill details "<FirstName>" "<LastName>" "<Company>" "<Address>" "<Address2>" "<Country>" "<State>" "<City>" "<Zipcode>" "<MobileNumber>"
And Click Create Account button
Then Verify 'Account Created!' visible
And Click Continue button
Then Verify that Logged in as username is visible
And Click Logout button
Then Verify "New User Signup!" is visible
And Enter name "shruthi" and email address "shruthi@gmail.com"
And Click Signup button
Then Verify error "Email Address already exist!" is visible

Examples:
|Title|Name   |Password  |Day|Month|Year|FirstName|LastName|Company|Address|Address2|Country|State    |City     |Zipcode|MobileNumber|
|Mrs. |Shruthi|Welcome123|25 |June |1995|Shuthi   |S       |JRD    |Pai    |Layout  |India  |Karnataka|Bangalore|560017 |9876543210  |
