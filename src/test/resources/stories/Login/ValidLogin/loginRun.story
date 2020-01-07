Narrative: As a user I should be able to login to the application
to perform various tasks

Scenario: To verify if the user is able to login to the page
Given the user opens the url of the application
When the user enters <userid> and <password>
Then the user should go to the home page

Examples:
|userid|password|
|yuvi.subu@yopmail.com|Welcome@123|