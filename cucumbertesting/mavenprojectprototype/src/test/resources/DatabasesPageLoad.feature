Feature: Databases Page load test 

Scenario Outline: databases Page load test
	Given lanuch EM URL in "<browsername>" 
	Then  enter username pssword and click login button 
	When click on Targets link to see all the options 
	When click on Database option 
	Then Database page should load successfully 
	When Click on logout 
	Then Successfully logged out
Examples:
	| browsername |
	| FF |
	| Chrome |	