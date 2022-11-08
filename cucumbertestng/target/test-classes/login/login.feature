Feature: Test the guru99 login
1) Valid Case
2) Invalid Case
Scenario Outline:To test guru99 with valid and invalid data
Background:
Given i should open the browser and naviagte to the login page of guru99
@PositiveTesting
Scenario: To Test the Login with valid data
When Enter Username "<user>"
And Enter Password "<pass>"
And Click on the loginbutton
Then i should see the title as "Login:Mercury Tours"
Examples:
|user|pass|
|user|user|
|admin|admin|
@NegativeTesting
Scenario: To Test the Login with invalid data
When Enter Username "<user>"
And Enter Password "<pass>"
And Click on the loginbutton 
Then i should see the title as "Login:Mercury Tours" 
Examples:
|user|pass|
|vishnu|@vishnu|