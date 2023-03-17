Feature: Main Screen

  Scenario: Check posts in Rain's blog
    Given that a user goes to the rain's blog
    When the main page is shown
    Then check the number of post that the user should see
    And check that the posts shown are those detailed in the articles file.