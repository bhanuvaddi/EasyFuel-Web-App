@SmartCityLogin
Feature: SmartCityLogin
  As a SmartCity customer
  I want to log in to SmartCity
  So that I can access SmartCity account

  @Regression
  Scenario Outline: login without mandatory details
    Given I am on the SmartCity login page
      And I have left "<mandatory>" login details blank
     When I try to log in
     Then an "<mandatory error>" message is displayed

    Examples:
      | mandatory |mandatory error  |
      | All       |Both Required    |
      | UserName  |UserName Required|
      | Password  |Password Required|

  @Extended
  Scenario: login with unregistered username and valid password
    Given I am on the SmartCity login page
      And I have entered an unregistered username and a valid password
     When I try to log in
     Then login unsuccessful message is displayed

  @Extended
  Scenario: login with registered username and an invalid password
    Given I am on the SmartCity login page
      And I have entered a registered username and an invalid password
     When I try to log in
     Then login unsuccessful message is displayed

  @Regression
  Scenario: login with registered user name and valid password
    Given I am on the SmartCity login page
      And I have entered a registered username and a valid password
     When I try to log in
     Then I am logged in to SmartCity account
      And I am able to logout from SmartCity account

  @Regression
  Scenario: logout from SmartCity account
    Given I am on the SmartCity account page
     When I select logout from SmartCity account
     Then I am logged out from SmartCity account

  @Extended
  Scenario Outline: log in with registered valid/invalid login details
    Given I am on the SmartCity login page
      And I have entered a registered "<username>" username and "<password>" password
     When I try to log in
     Then the login is a "<result>"

    Examples:
      | username | password | result  |
      | Valid    | Invalid  | Fail    |
      | Invalid  | Invalid  | Fail    |
      | Invalid  | Valid    | Fail    |
      | Valid    | Valid    | Success |

  @Extended
  Scenario: reset password with an invalid email address
    Given I am on the SmartCity login page
      And I select forgotten username or password
     When I select do not remember password
      And I give an invalid format email address
     Then an invalid email address error message is displayed

  @Extended
  Scenario: reset password with unregistered email address
    Given I am on the SmartCity login page
      And I select forgotten username or password
     When I select do not remember password
      And I give an unregistered email address
     Then an unregistered email address error message is displayed

  @Regression
  Scenario: reset password with registered email address
    Given I am on the forgotten password page
     When I select do not remember password
      And I give a registered email address
     Then a message confirming reset password email has been sent is displayed

  @Extended
  Scenario: close window button after reset password
    Given I am on the forgotten password page
      And I select do not remember password
     When I give a registered email address
      And I close window after message confirming reset password email has been sent is displayed
     Then reset password window will be closed

  @Extended
  Scenario: reset username with an invalid email address
    Given I am on the SmartCity login page
      And I select forgotten username or password
     When I select do not remember username
      And I give an invalid format email address
     Then an invalid email address error message is displayed

  @Extended
  Scenario: reset username with unregistered email address
    Given I am on the SmartCity login page
      And I select forgotten username or password
     When I select do not remember username
      And I give an unregistered email address
     Then an unregistered email address error message is displayed

  @Regression
  Scenario: reset username with registered email address
    Given I am on the forgotten username page
     When I select do not remember username
      And I give a registered email address
     Then a message confirming reset username email has been sent is displayed

  @Extended
  Scenario: close window button after reset username
    Given I am on the forgotten username page
      And I select do not remember username
     When I give a registered email address
      And I close window after message confirming reset username email has been sent is displayed
     Then reset username window will be closed
