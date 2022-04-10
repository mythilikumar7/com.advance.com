Feature: MST university portal
@SmokeTest
Scenario: Login to the community portal with valid credentials
 Given user should enter the url of the portal
 When user enters the username and password 
 Then user should be able to login