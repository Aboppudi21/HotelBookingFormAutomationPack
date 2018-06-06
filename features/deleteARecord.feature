Feature: Test Delete a Customer Reccord from Hotel booking form

  Scenario: Delete Hotel Booking record
    Given I am on hotel booking form page
    When I click on delete button of existing record
    Then I see record has deleted
