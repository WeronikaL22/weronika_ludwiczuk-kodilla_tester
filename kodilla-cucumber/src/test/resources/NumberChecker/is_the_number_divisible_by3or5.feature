Feature: Is the number divisible by 3 and/or 5?

  Scenario Outline: The number is or isn't divisible by 3
    Given number is <number>
    When I ask whether it is or isn't divisible by 3
    Then I should get response <response>

    Examples:
    |number| response|
    |6 | "Fizz"|
    |9 | "Fizz"|
    |14| "Nope"|

  Scenario Outline: The number is or isn't divisible by 5
    Given number is <number>
    When I ask whether it is or isn't divisible by 5
    Then I should get response <response>

    Examples:
      |number| response|
      |5 | "Buzz"|
      |20 | "Buzz"|
      |4| "Nope"|

  Scenario Outline: The number is or isn't divisible by 3 and 5
    Given number is <number>
    When I ask whether it is or isn't divisible by 3 and 5
    Then I should get response <response>

    Examples:
      |number| response|
      |15 | "FizzBuzz"|
      |60 | "FizzBuzz"|
      |123| "Nope"|



