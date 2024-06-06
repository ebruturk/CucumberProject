@XYZBank
Feature:XYZ Bank

  Background:Go to homepage
    Given user goes to url "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"

  Scenario Outline: Add Customer

    When click on Bank Manager Login
    And click on Add Customer
    And enter firstname "<firstname>",lastname"<lastname>", postcode"<postcode>"
    And click on Add Costomer Submit button
    Examples:
      | firstname | lastname | postcode |
      | John      | doe      | 12345    |
      | can       | kaya     | 12345    |
      | ali       | alp      | 12345    |
      | veli      | tan      | 12345    |
      | fatma     | can      | 12345    |

  Scenario: Deposit and Withdraw
    When click on Customer login
    And select the name
    And click on login
    And click on deposit
    And enter amount
    And click on deposit submit
    When click on withdraw
    And enter amount
    Then click on withdraw submit