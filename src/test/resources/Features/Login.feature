Feature: Valid Login Functionality
  Scenario: Login with valid credentials
    Given user in login page
    When user enters valid "Admin" and "admin123"
    And user clicks on login button
    Then display login successfully
    #Examples:


  #username|password
  #admin  |admin123
  #<username>" "<password>"
