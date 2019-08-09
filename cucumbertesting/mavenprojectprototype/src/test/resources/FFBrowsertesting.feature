Feature: Page Load Testing 

Scenario Outline: Home Page load test 
	Given lanuch EM URL in "<browsername>"
	Then  enter username pssword and click login button 
	When  checking for enterprise manager text in home page
	When  Click on logout 
	Then  Successfully logged out
Examples:
	| browsername |
	| FF |
	| Chrome |