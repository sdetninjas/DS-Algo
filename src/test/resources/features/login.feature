@loginScenario
Feature: Login to Juice Shop application

@positiveScenerio1 @TC_001
Scenario: Login Page default login with positive inputs

Given User is on Login Page
When User login into application email "febi@gmail.com" and Password "febi"
And User clicks login Button
Then Products page is Populated



@negativeScenerio1 @TC_002
Scenario: Login Page default login with negative inputs

Given User is on Login Page
When User login into application email "febi@gmail.com" and Password "feb"
And User clicks login Button
Then Error message is Populated

