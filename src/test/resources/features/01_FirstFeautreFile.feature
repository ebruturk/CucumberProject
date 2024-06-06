@Login
Feature: Login Test

  Background:User goes to homepage
    Given user goes to homepage

  @PositiveLogin
  Scenario: Positive login Test
    Given user goes to homepage
    When user enters email
    And user enters password
    And user clicks on submit
    Then user validates sign in
    And user closes the browser

  @NegetiveLogin
  Scenario: Negative login Test
  Given user goes to homepage
  When user enters wrong email
  And user enters password
  And user clicks on submit
  Then user validates error message
  And user closes the browser

  @NegetiveLoginWrongPassword
  Scenario: Negative login Test
    Given user goes to homepage
    When user enters email
    And user enters wrong password
    And user clicks on submit
    Then user validates error message
    And user closes the browser
