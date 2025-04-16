Feature: File format validation check

  Scenario: Verify validation of disallowed file formats
    Given the user is on the file upload page
    When the user attempts to upload a ".exe" or ".txt" file
    Then the system should display an error message indicating the format is not allowed