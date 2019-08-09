Feature: All Targets Page load test 

Scenario Outline: All Targets Page load test
	Given lanuch EM URL in "<browsername>" 
	Then  enter username pssword and click login button 
	When click on Targets link to see all the options 
	When click on All Targets link 
	When check for All Target text on the landed page 
	When Click on logout 
	Then Successfully logged out
Examples:
	| browsername |
	| FF |
	| Chrome |