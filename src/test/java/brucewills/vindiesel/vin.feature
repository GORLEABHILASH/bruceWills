Feature: check login
Scenario Outline: 
Given open the url
And click sign in
And Enter <username>
And Enter2 <password>
And press login
Then press SignOut
Examples:
|username|password|
|lalitha|password123|
