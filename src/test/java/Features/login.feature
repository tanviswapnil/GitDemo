Feature: Login into Application

Scenario Outline: positive test validating login
Given Initialise browser with chrome
And Navigate to "QAClickAcademy" site
And Click on Login in Home page to land on sign In page 
When User enter <username> and <password> and logs in
Then varify that user is successfully logged in

Examples: 
|username  			|password |
|test99gmail.com 	|123456   |
|test11gmail.com 	|123457   |

