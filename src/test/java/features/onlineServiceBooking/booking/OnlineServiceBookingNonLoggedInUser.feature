#Flow Test Task: CPBL-25917
#Auto Test Task: CPBL-25453
#Create Date:16/11/2022
@Regression
Feature: Online Service Booking Successful

  Scenario: EF1 - Online Service Booking Successful for guest user when vehicle is searched by VIN

    Given User opens the toyota webpage "https://dxp-de-de-test.toyota.eu/online-service-booking","de_de"

    Given I am a customer that is on the OSB landing page
    And I have entered a VIN/Reg in the input field "JF1ZN6K72DG002976"
    And I see the field of enter Vin/Registration number is indicated with the abbreviation of my country
    And I see the option to see more details of the field (tool tip for Vin)

    Then I see the Select dealer field
    When I select the option to search for dealer based on Search by location "Dusseldorf"
    And I see the option to select any one of the dealer
    When I select the option to select a specific dealer from the result
    And I should be able to enter the mileage of my vehicle "10"
    When I select the option to confirm my selection on the landing page

    Given That I'm a user that selected at least one service
    When I confirm the service(s)
    Then I see the option to select an alternative transport dropdown field
    And I should be able to select a time for my drop off time
    When I go to the service booking summary on  Date and time section during a service booking
    Then I see the service type of the selected service(s)
    And I see the service with promotional price is indicated next to its service name

    When I select to confirm the selected services
    Then I should see the contact details section
    And I should be able to fill in the first name "OSB Testing"
    And the last name "Testing"
    And the email address "testingbooking83+osbflow@gmail.com"
    And the phone number "32123456789"
    And I should be able to choose between email or phone as the preferred contact method (default email)
    And mandatory fields should be indicated

    When I go to the service booking summary on Personal details step during a service booking
    Then I see the service type of the selected service(s) on Personal details step
    And I see the service with promotional price is indicated next to its service name on Personal details

    When I accept the privacy policy
    Then I should be able to finalize my booking
    When My booking is successful
    And I should see a recap of my appointment
    And I should see the retailer's information where I booked my appointment
    And I should be able to return to the homepage











