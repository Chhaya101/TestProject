#Flow Test Task: CPBL-25917
#Auto Test Task: CPBL-30657
#Create Date:01/16/2024

Feature: Online Service Booking Successful

  Scenario: EF06 - OSB successful for a logged in user with 1 vehicle and preferred dealer in his account
    Given User opens the toyota webpage "https://dxp-de-de-test.toyota.eu/online-service-booking","de_de"

    Given I am a customer that is on the OSB landing page
    When I select the Login option on OSB page landing page
    And The user with account details logs in to the portal "testingbooking83+osbautomation1@gmail.com" "Testing.1"
#   And The user with account details logs in to the portal "testingbooking83+osbflow@gmail.com" "Testing.1"
    #    Need to implement line 16
    Then I see Vin, Dealer based on my Logged in user with 1 vehicle and preferred dealer
    And I should be able to enter the mileage of my vehicle "10"
    And I should be able to confirm my selection

    When I select the option to confirm my selection on the landing page

#    Need to implement line 23, 24
    Then I see my selected vehicle is on the top summary
    And I see my selected dealer is on the top summary

    Given That I'm a user that selected at least one service
    When I confirm the service(s)
    Then I see the option to select an alternative transport dropdown field
    And I should be able to select a time for my drop off time
    When I go to the service booking summary on  Date and time section during a service booking
    Then I see the service type of the selected service(s)
    And I see the service with promotional price is indicated next to its service name
    When I select to confirm the selected services
    Then I should see the contact details section

   Then I should be able to see my first name prefilled
   And My last name prefilled
   And My email address prefilled
   And I should be able to edit my personal information

    And the phone number "32123456789"
    And I should be able to choose between email or phone as the preferred contact method (default email)

    When I go to the service booking summary on Personal details step during a service booking
    Then I see the service type of the selected service(s) on Personal details step
    And I see the service with promotional price is indicated next to its service name on Personal details

    When My booking is successful
    Then I should be informed that my booking has been confirmed
    And I should see a recap of my appointment
    And I should see the retailer's information where I booked my appointment
    And I should be able to return to the homepage



