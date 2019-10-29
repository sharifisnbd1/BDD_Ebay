@Smoke
Feature: Ebay Transaction Varifications

Scenario: Successful execution of Transaction varifications
	
	Given User Opens Chrome Browser and enter URL
	When Search Vintage Watches
	And Sort price low to High
	And Select price range from 60 to 270
	And select gender as man
	Then click on Vintage soviet MAJAK m43 Watch
	And add to cart with 2 years plan
	Then Search Vintage Watches again 
	And Click Vintage Waltham Art Deco Watch Runs
	And Add to cart without plan
	And Remove 2yrs plan from cart
	Then Go to Checkout
	And Provide invalid credentials
	Then Validate login failure
	And Close the browser
