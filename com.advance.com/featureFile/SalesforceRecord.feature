Feature: MST university portal
@SmokeTest
Scenario: To check the record in the created in the Application Object in Salesforce
 Given User enters the url of the salesforce
 When User enters the username and password
 Then User clicks the applauncher and selects Applications
 Then User clicks listview and selects todaysapplications
 Then User clicks the record created
 