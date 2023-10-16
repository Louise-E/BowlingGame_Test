Feature: Roll bowling ball

  Scenario Outline: Roll bowling ball
    Given I hit the <pins> pins
    When I roll the bowling ball
    Then I should get <score>
    Examples:
      | pins | score|
      | 0    | 0     |
      | 1    | 1     |
      | 2    | 2     |
      | 3    | 3     |
      | 4    | 4     |
      | 5    | 5     |
      | 6    | 6     |
      | 7    | 7     |
      | 8    | 8     |
      | 9    | 9     |
      | 10   | 10    |