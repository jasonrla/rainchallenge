Feature: Category Details

  @CategoryDetails
  Scenario: Check Category tabs
    Given user
    When selects Business category
    Then check the posts displayed belong to the corresponding category