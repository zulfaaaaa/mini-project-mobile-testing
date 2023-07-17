Feature: As a user i have be able to resgister so that i can see home screen

@Register
  Scenario: As a user i can register and i can see home screen
    Given user on dashboard
    When user click logout
    And user click link regist
    And user input name for regist
    And user input email for regist
    And user input password for regist
    And user click resgister button
    Then user direct to home page

#  @RegisterSameEmail
#  Scenario: As a user i can't register because input same email
#    Given user on dashboard for regist same email
#    When user click logout for regist same email
#    And user click link regist for regist same email
#    And user input name for regist same email
#    And user input email for regist same email
#    And user input password for regist same email
#    And user click resgister button for regist same email
#    Then user direct to home page for regist same email

  @RegisterIncorrectFormatEmail
  Scenario: As a user i can't register because input incorrect email format
    Given user on dashboard for regist incorrect email format
    When user click logout for regist incorrect email format
    And user click link regist for regist incorrect email format
    And user input name for regist incorrect email format
    And user input email for regist incorrect email format
    And user input password for regist incorrect email format
    And user click resgister button for incorrect email format
    Then user direct to home page for regist incorrect email format

  @RegisterBlankName
  Scenario: As a user i can't register because input blank name
    Given user on dashboard for regist blank name
    When user click logout for regist blank name
    And user click link regist for regist blank name
    And user input name for regist blank name
    And user input email for regist blank name
    And user input password for regist blank name
    And user click resgister button for blank name
    Then user direct to home page for regist blank name

#  @RegisterBlankEmail
#  Scenario: As a user i can't register because input blank email
#    Given user on dashboard for regist blank email
#    When user click logout for regist blank email
#    And user click link regist for regist blank email
#    And user input name for regist blank email
#    And user input email for regist blank email
#    And user input password for regist blank email
#    And user click resgister button for regist blank email
#    Then user direct to home page for regist blank email

  @RegisterBlankPassword
  Scenario: As a user i can't register because input blank password
    Given user on dashboard for regist blank password
    When user click logout for regist blank password
    And user click link regist for regist blank password
    And user input name for regist blank password
    And user input email for regist blank password
    And user input password for regist blank password
    And user click resgister button for regist blank password
    Then user direct to home page for regist blank password

  @RegisterBlankData
  Scenario: As a user i can't register because input blank data
    Given user on dashboard for regist blank data
    When user click logout for regist blank data
    And user click link regist for regist blank data
    And user input name for regist blank data
    And user input email for regist blank data
    And user input password for regist blank data
    And user click resgister button for regist blank data
    Then user direct to home page for regist blank data