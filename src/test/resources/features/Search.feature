Feature: Search

  @Search
  Scenario: Check the search
    Given user who wishes to perform a search
    When selects enter a word "Improve" in the search box
    Then check all titles include the search word