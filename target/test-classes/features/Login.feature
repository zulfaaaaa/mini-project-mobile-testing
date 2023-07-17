Feature: As a user i have be able to login so that i can see home screen
@Login
  Scenario: As a user i can login with valid credential
  Given user on dashboard for login
  When user click logout for login
  And user on login page for login
  And user click email field
  And user input valid email
  And user click password field
  And user input password
  And user click login button
  Then user can see hompegae and list products

#  @LoginInvalidEmail
#  Scenario: As a user i can't login because input invalid email
#    Given user on dashboard for login invalid email
#    When user click logout for login invalid email
#    And user on login page for login invalid email
#    And user click email field invalid email
#    And user input invalid email
#    And user click password field invalid email
#    And user input invalid password invalid email
#    And user click login button invalid email
#    Then user can see hompegae and list products invalid email

  @LoginInvalidPassword
  Scenario: As a user i can't login because input invalid password
    Given user on dashboard for login invalid password
    When user click logout for login invalid password
    And user on login page for login invalid password
    And user click email field invalid password
    And user input valid email invalid password
    And user click password field invalid password
    And user input invalid password
    And user click login button invalid password
    Then user can see hompegae and list products invalid password

  @LoginBlankEmail
  Scenario: As a user i can't login because input blank email
    Given user on dashboard for login blank email
    When user click logout for login blank email
    And user on login page for login blank email
    And user click email field blank email
    And user input blank email
    And user click password field blank email
    And user input valid password blank email
    And user click login button blank email
    Then user can see hompegae and list products blank email

#  @LoginBlankPassword
#  Scenario: As a user i can't login because input blank password
#    Given user on dashboard for login blank password
#    When user click logout for login blank password
#    And user on login page for login blank password
#    And user click email field blank password
#    And user input valid email blank password
#    And user click password field blank password
#    And user input blank password
#    And user click login button blank password
#    Then user can see hompegae and list products blank password

  @LoginBlankData
  Scenario: As a user i can't login because input blank data
    Given user on dashboard for login blank data
    When user click logout for login blank data
    And user on login page for login blank data
    And user click email field blank data
    And user input email blank data
    And user click password field blank data
    And user input password blank data
    And user click login button blank data
    Then user can see hompegae and list products blank data