
@tag
Feature: login
  I want to login to website

  @tag1
  Scenario: logged in succesfully
    Given I want to enter valid <username> and <password>
    When I click on login button
    Then I should be able to login with valid username and password
   


    Examples: 
      | username  | password | 
      | name1 |     pass1 | 
      | name2 |     pass2 | 
