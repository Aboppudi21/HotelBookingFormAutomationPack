$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BookACustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Test Hotel Booking Form smoke Scenarios",
  "description": "",
  "id": "test-hotel-booking-form-smoke-scenarios",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Data Driven testing using Scenario Options"
    }
  ],
  "line": 4,
  "name": "Book an hotel",
  "description": "",
  "id": "test-hotel-booking-form-smoke-scenarios;book-an-hotel",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on Hotel Booking Form",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"\u003cfname\u003e\", \"\u003csurName\u003e\", \"\u003cPrice\u003e\", \"\u003cdeposite\u003e\", \"\u003ccheckIn\u003e\", \"\u003ccheckOut\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "save deatils with delete button",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "test-hotel-booking-form-smoke-scenarios;book-an-hotel;",
  "rows": [
    {
      "cells": [
        "fname",
        "surName",
        "Price",
        "deposite",
        "checkIn",
        "checkOut"
      ],
      "line": 11,
      "id": "test-hotel-booking-form-smoke-scenarios;book-an-hotel;;1"
    },
    {
      "cells": [
        "Anusha",
        "Boppudi",
        "500",
        "0",
        "2018-06-03",
        "2018-06-05"
      ],
      "line": 12,
      "id": "test-hotel-booking-form-smoke-scenarios;book-an-hotel;;2"
    },
    {
      "cells": [
        "Anu",
        "B",
        "120",
        "1",
        "2018-06-05",
        "2018-06-07"
      ],
      "line": 13,
      "id": "test-hotel-booking-form-smoke-scenarios;book-an-hotel;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Book an hotel",
  "description": "",
  "id": "test-hotel-booking-form-smoke-scenarios;book-an-hotel;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on Hotel Booking Form",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"Anusha\", \"Boppudi\", \"500\", \"0\", \"2018-06-03\", \"2018-06-05\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "save deatils with delete button",
  "keyword": "Then "
});
formatter.match({
  "location": "bookACustomerStep.i_launched_URL_on_browser()"
});
formatter.result({
  "duration": 13435709162,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Anusha",
      "offset": 9
    },
    {
      "val": "Boppudi",
      "offset": 19
    },
    {
      "val": "500",
      "offset": 30
    },
    {
      "val": "0",
      "offset": 37
    },
    {
      "val": "2018-06-03",
      "offset": 42
    },
    {
      "val": "2018-06-05",
      "offset": 56
    }
  ],
  "location": "bookACustomerStep.i_enter_Anusha_Boppudi_true_checkIn_checkOut(String,String,String,int,String,String)"
});
formatter.result({
  "duration": 2710115320,
  "status": "passed"
});
formatter.match({
  "location": "bookACustomerStep.click_on_save_button()"
});
formatter.result({
  "duration": 2306762813,
  "status": "passed"
});
formatter.match({
  "location": "bookACustomerStep.save_entered_details_in_a_table()"
});
formatter.result({
  "duration": 14315475203,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Book an hotel",
  "description": "",
  "id": "test-hotel-booking-form-smoke-scenarios;book-an-hotel;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on Hotel Booking Form",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"Anu\", \"B\", \"120\", \"1\", \"2018-06-05\", \"2018-06-07\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "save deatils with delete button",
  "keyword": "Then "
});
formatter.match({
  "location": "bookACustomerStep.i_launched_URL_on_browser()"
});
formatter.result({
  "duration": 12501803123,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Anu",
      "offset": 9
    },
    {
      "val": "B",
      "offset": 16
    },
    {
      "val": "120",
      "offset": 21
    },
    {
      "val": "1",
      "offset": 28
    },
    {
      "val": "2018-06-05",
      "offset": 33
    },
    {
      "val": "2018-06-07",
      "offset": 47
    }
  ],
  "location": "bookACustomerStep.i_enter_Anusha_Boppudi_true_checkIn_checkOut(String,String,String,int,String,String)"
});
formatter.result({
  "duration": 2810949436,
  "status": "passed"
});
formatter.match({
  "location": "bookACustomerStep.click_on_save_button()"
});
formatter.result({
  "duration": 2301342322,
  "status": "passed"
});
formatter.match({
  "location": "bookACustomerStep.save_entered_details_in_a_table()"
});
formatter.result({
  "duration": 14110823587,
  "status": "passed"
});
formatter.uri("bookingForm.feature");
formatter.feature({
  "line": 1,
  "name": "Test Hotel Booking Form",
  "description": "",
  "id": "test-hotel-booking-form",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Launch Hotel Booking Form",
  "description": "",
  "id": "test-hotel-booking-form;launch-hotel-booking-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I launched URL on browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I check header of the page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see header name as Hotel booking form",
  "keyword": "Then "
});
formatter.match({
  "location": "bookingFormStep.i_launched_URL_on_browser()"
});
formatter.result({
  "duration": 12230493763,
  "status": "passed"
});
formatter.match({
  "location": "bookingFormStep.i_check_header_of_the_page()"
});
formatter.result({
  "duration": 69298702,
  "status": "passed"
});
formatter.match({
  "location": "bookingFormStep.i_see_header_name_as_Hotel_booking_form()"
});
formatter.result({
  "duration": 2715887356,
  "status": "passed"
});
formatter.uri("deleteARecord.feature");
formatter.feature({
  "line": 1,
  "name": "Test Delete a Customer Reccord from Hotel booking form",
  "description": "",
  "id": "test-delete-a-customer-reccord-from-hotel-booking-form",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Delete Hotel Booking record",
  "description": "",
  "id": "test-delete-a-customer-reccord-from-hotel-booking-form;delete-hotel-booking-record",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on hotel booking form page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on delete button of existing record",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see record has deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "deleteARecordStep.i_am_on_hotel_booking_form_page()"
});
formatter.result({
  "duration": 9666111757,
  "status": "passed"
});
formatter.match({
  "location": "deleteARecordStep.i_click_on_delete_button_of_existing_record()"
});
formatter.result({
  "duration": 3357074117,
  "status": "passed"
});
formatter.match({
  "location": "deleteARecordStep.i_see_record_has_deleted()"
});
formatter.result({
  "duration": 4057850540,
  "status": "passed"
});
});