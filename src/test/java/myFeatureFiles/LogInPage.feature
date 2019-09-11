Feature: Application Login

Scenario: HomePage Default Login

Given User is on NetBanking Login page
When User Login into application with username and password
Then HomePage is populaed
And Cards are displayed
