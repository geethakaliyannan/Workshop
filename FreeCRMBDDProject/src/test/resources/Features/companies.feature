Feature: To test CRM companies feature
Background:

Given User is on free crm login page
When Title of the page is Free CRM
Then User enters "meera.anand69@gmail.com" and "Dhanush123"
Then  User clicks on login button
And  User is on home page

Scenario: Navigate to companies  page
Given : To open companies page
Then : Add new company details
Then : user click save button
Then : close the browser

Scenario: Back to company  page
Given : Click Company button
Then : Click EXPORT button
Then : Close the browser

