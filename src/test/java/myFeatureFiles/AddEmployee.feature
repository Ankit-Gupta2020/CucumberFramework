Feature: This feature is to add new employee

Scenario: Add new employee

Given Launch OrangeHRM Login Page
|  https://opensource-demo.orangehrmlive.com |
And Enter admin User credentials
| Admin  | admin123 |
And Naviage to Add Employee page under PIM tab
When Enter employee details
|  Ankit  | Gupta   |
And clicks on save button
Then new employee should be added


