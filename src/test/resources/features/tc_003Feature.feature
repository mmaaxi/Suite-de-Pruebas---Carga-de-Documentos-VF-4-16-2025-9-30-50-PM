Feature: Validate maximum file size

  Scenario: Select a file that exceeds the maximum allowed size
    Given I am on the file upload page
    When I select a file that exceeds the maximum allowed size
    Then I should see an error message indicating the size exceeded