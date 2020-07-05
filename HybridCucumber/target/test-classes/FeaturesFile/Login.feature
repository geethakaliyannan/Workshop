Feature: To test the OrangHR Application 

Scenario Outline: To validate the Login Functionality 
	Given To open browser and navigate to the OHRM_url 
	When To get the title of the page 
	Then Enter "<username>" and "<password>" 
	Then Click submit button 
	
	Examples: 
		|username|password|
		|Admin|admin123|
    
    	
    