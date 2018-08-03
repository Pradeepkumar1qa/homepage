Feature: Google Homepage
This feature verifies the functionality on Google Homepage

Scenario: Check that main elements on Google Homepage are displayed
Given I launch Chrome browser
When I open Google Homepage
Then I verify that the page displays search text box
And the page displays Google Search button
And the page displays Im Feeling Lucky button

#Scenario:check that search box is working properly
#Given I launch chrome browsr
#When I Open google HOmepage
#And  provides "tomorrow weather" 
#And click on the search butoon
#Then I verify that it shows some result based on that word

