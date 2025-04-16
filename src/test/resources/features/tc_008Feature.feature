Feature: Document Upload Cancellation
  Scenario: Validate cancellation of document upload
    Given the user initiates a document upload
    When the user clicks on 'Cancel'
    Then the upload is stopped
    And the system returns to the initial state without storing the file