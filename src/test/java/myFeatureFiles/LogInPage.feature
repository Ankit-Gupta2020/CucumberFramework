Feature: Application Login

Scenario Outline: HomePage Default Login

Given Launch OrangeHRM Login Page "<url>"
When User Login into application with username "<username>" and password "<password>"
Then HomePage is populaed
Then Close Browser

Examples:
|   url                                     |    username  |  password   |
| https://opensource-demo.orangehrmlive.com |    Admin     |  admin123   |



Scenario: HomePage Default Login

Given User is on OrangeHRM Login page with "https://opensource-demo.orangehrmlive.com"
When User Login into application with username "Admin" and password "admin123"
Then HomePage is populaed
Then Close Browser
