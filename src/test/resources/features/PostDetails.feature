Feature: Post Details

  @PostDetails
  Scenario: Check the details of an article
    Given that a user has selected an article
    When the article's page is open
    Then check the title is correct
    And check the paragraph is correct
    And check the links in certain words of the paragraph