#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: login
  I want to login to website

  @tag1
  Scenario: logged in succesfully
    Given I want to enter valid <username> and <password>
    When I click on login button
    Then I should be able to login
   


    Examples: 
      | username  | password | 
      | name1 |     pass1 | 
      | name2 |     pass2 | 
