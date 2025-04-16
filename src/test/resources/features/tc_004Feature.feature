Feature: Verify integrity of uploaded document

  Scenario: Check integrity of a valid PDF document after upload
    Given I am on the document upload page
    When I upload a valid PDF document
    Then the document should be stored successfully
    And the content of the document should be accessible without corruption