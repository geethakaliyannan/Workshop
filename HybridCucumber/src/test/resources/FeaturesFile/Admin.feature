 Feature: To test admin
    Background: To validate the admin page
    Given To open browser and navigate to the OHRM_url 
	When To get the title of the page 
	Then Enter user login info "Admin" and "admin123"
	Then Click submit button 
	
	Scenario: To validate Admin Functiolnality		
    Given  click Admin page
    Then Enter sysuser info "nani","Admin","nanipandi","Enabled"
	Then Click search button
	Then Close the browser

	