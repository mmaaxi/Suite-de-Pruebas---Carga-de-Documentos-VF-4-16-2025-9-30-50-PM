Feature: Verify the ability to upload multiple documents sequentially

  Scenario: Upload several documents one after another
    Given the user is on the document upload page
    When the user uploads multiple documents sequentially
    Then each document should be uploaded successfully with its associated metadata