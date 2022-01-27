Feature: Login To OSS platform


  Scenario: Login with valid credentials.
    Given User is on home page
    When user enter bsptrainingmanager@yahoo.com as username.
    And user enters Pass123$ as password.
    Then user should be able to login.


