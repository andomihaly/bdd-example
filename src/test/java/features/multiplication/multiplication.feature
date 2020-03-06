Feature: multiply two number
  Scenario: multiply two positive numbers
    When multiply 2 and 3
    Then the result is 6

  Scenario: multiply two negative numbers
    When multiply -2 and -3
    Then the result is 6

  Scenario: multiply one positive and one negative number
    When multiply -2 and 3
    Then the result is -6

  Scenario: multiply with zero
    When multiply 0 and 3
    Then the result is 0