#Run the feature file from run configuration as cucumber feature
#@All --> feature level tag which is applicable on all the scenarios
Feature: sample
@Smoke
Scenario: view cart details
Given user is on home page
When user clicks on the cart
Then cart details open
@Smoke @Regression 
Scenario: view cart details2
Given user is on home page
When user clicks on the cart2
Then cart details2 open
@Regression
Scenario: view cart details3
Given user is on home page
When user clicks on the cart3
Then cart details3 open

# int,string values in scenario
#@newtag1
#Scenario: how to use int and string
#Given user is on billing page
#When user enters bill amount 100
#And user enters tax amount "2"
#And user clicks on submit
#Then final bill 102 is shown 

# examples in scenario
@newtag2
Scenario Outline: how to use examples
Given user is on billing page
When user enters bill amount <billamount>
And user enters tax amount "<taxamount>"
And user clicks on submit
Then final bill <finalamount> is shown 
Examples:
|billamount|taxamount|finalamount|
|100|2|102|
|102|3|105|
|200|2|202|

