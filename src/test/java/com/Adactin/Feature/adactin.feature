Feature: Hotel Booking in Adactin Application
Scenario: Login Functionality
    Given user Launches The Application
    When user Enters The Username In Username Field
    And user Enter The Password In Password Field
    Then user Clicks The Login Button And It Navigates To Homepage
 
Scenario: Search Hotel Functionality
    When user Select The Location From Location Field
  	And user Select The Hotel In The Hotels Field
  	And user Selects The Room Type
  	And user Selects The Number Of Rooms
  	And user Enters The Checkin Date
  	And user Enters The Checkout Date
  	And user Selects Number Of Adults Per Room
  	And user Selects Number Of Childrens Per Room
  	Then user Clicks The Search Button And It Navigates to SelectHotel Page
  	
Scenario: Select Hotel Functionality
 	When user Selects The Hotel
 	Then user Clicks The Continue Button And It Navigates To BookHotel Page
 	
Scenario: Book Hotel Functionality
 	When user Enter The FirstName
 	And user Enters The LastName
 	And user Enters The BillingAddress
 	And user Enters The CreditCard Number
 	And user Selects The CardType
 	And user Selects The Expiry Month
 	And user Selects The Expiry Year
 	And user Enters The CVV NUmber
 	Then user Clicks The Book Now Button And It Navigates To BookingConfirmation Page