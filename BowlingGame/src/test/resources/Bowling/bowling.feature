Feature: Playing a bowling game

  Scenario Outline: Play a game of bowling with <rolls> rolls and <pins> pins
    Given I roll bowling ball <rolls> times
    And I knock down <pins> every roll
    When I play a bowling game
    Then I should get a total <score>

    Examples:
      | rolls | pins | score |
      | 20    | 1    | 20    |
      | 21    | 5    | 150   |
      | 12    | 10   | 300   |

  Scenario: Strike
    Given I roll a strike
    And I hit 3 and 4 pins in next two rolls
    And I 0 on the rest of the rolls
    When I play a bowling game
    Then my total score should be 24

  Scenario: Spare
    Given I roll a spare
    And I hit 3 and 4 pins in next two rolls
    And I 0 on the rest of the rolls
    When I play a bowling game
    Then my total score should be 20


