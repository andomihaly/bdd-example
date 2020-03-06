@additionHook
Feature: add two numbers

  Scenario: add two positive number
    Given open calculator
    When add 2 and 3
    Then the addition result is 5

  Scenario: add a negative and a positive number
    Given open calculator
    When add 2 and -3
    Then the addition result is -1

  Scenario: add two negative number
    Given open calculator
    When add -2 and -3
    Then the addition result is -5

