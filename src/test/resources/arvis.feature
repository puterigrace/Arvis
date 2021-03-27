Feature: Arvis e-commerce automation testing

Scenario: Login
	Given User is login page
	When User input username password
	And Click login button
	Then User successfully login
	
Scenario: Add to Chart
	Given User is on site
	When User choosing item category
	And Click add to cart button
	Then Item successfully choosen
	
Scenario: Checkout
	Given Item already in the cart
	When User click process to checkout button
	And Input amount of quantity
	And User Choose address
	And Click terms checkbox
	And Confirm the payment
	Then Order is complete
	