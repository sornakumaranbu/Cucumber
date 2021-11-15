Feature: Checking the booking functionality of the adactin application 
Scenario: User checking the login page functionality 
	Given User launch application 
	When User enter the valid username in the usename field 
	And User enter the valid password in the password field 
	Then  User click the login button 
	
Scenario: User search  Hotel 
	Given User navigate search hotel 
	When User select location 
	And User select hotel 
	And User select hotel room type 
	And User select no of rooms 
	And User enter check-in date 
	And User enter check-out date 
	And user enter how many adults per room 
	Then User click search button 
	
Scenario: User select a hotel 
	Given User navigate to select hotel page
	When User select perticular hotel 
	Then User click on continue button 
	
Scenario: User Booking a hotel 
	Given user navigate to book hotel page
	When user enter first name in the first name field
	And user enter last name in the lastname name field
	And user enter address in the address field
	And user enter 16 digit credit card no
	And user select type of credit card
	And user select card expiry month from the dropdown
	And user select card expiry year from the dropdown
	And user enter the cvv no in the cvv field
	And user clicks on book now button 
	And user clicks on myitinerary 
	And user clicks on order it check box 
	Then user logout session 