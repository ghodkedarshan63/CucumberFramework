Feature: Login functionality

Scenario: validate login page with valid credential

Given user should be open chrome browser
When user enters username,password
And click on login button
Then page should be navigate home page
And close the browser


Scenario: validate login page with invalid credential
Given user should be open chrome browser
When When user enters username,password
And click on login button
Then error message should be display to the user
And close the browser1
