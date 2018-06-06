Feature: Test Hotel Booking Form smoke Scenarios

  #Data Driven testing using Scenario Options
  Scenario Outline: Book an hotel
    Given I am on Hotel Booking Form
    When I enter "<fname>", "<surName>", "<Price>", "<deposite>", "<checkIn>", "<checkOut>"
    And click on save button
    Then save deatils with delete button

    Examples: 
      | fname  | surName | Price | deposite | checkIn   | checkOut  |
      | Anusha | Boppudi |   500 |        0 | 2018-06-03 | 2018-06-05 |
      | Anu    | B       |   120 |        1 | 2018-06-05 | 2018-06-07 |
