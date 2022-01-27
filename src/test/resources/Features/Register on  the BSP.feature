Feature: As a student, i want to register on BSP.
  Scenario: As a student i want to be able to register on BSP platform using valid details.

    Given User is on the BSP home page.
    When user enters valid details.
    And user clicks the register button.
    Then User should be successfully registered on BSP.

