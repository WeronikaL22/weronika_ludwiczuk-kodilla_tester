Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given  I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Impossible to withdraw from a wallet in credit
    Given  I have deposited $200 in my wallet
    When I request $250
    Then No money should be dispensed

  Scenario: Impossible to deposit negative amount
    Given  I have deposited -$50 in my wallet
    When I request $20
    Then No money should be deposited or dispensed