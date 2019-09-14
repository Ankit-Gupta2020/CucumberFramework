Feature: This feature is to explain tagging in cucumber

@SmokeTest
Scenario: This is my first scenario
Given launch browser
And login into application
When Add new employee
Then Verify employee is added

@RegressionTest
Scenario: This is my second scenario
Given launch browser
And login into application
When Add new manager
Then Verify new manager is added

@SmokeTest @RegressionTest
Scenario: This is my third scenario
Given launch browser
And login into application
When Transfer employee to new location
Then transfer is done successfull

@E2ETest
Scenario: This is my forth scenario
Given launch browser
And login into application
When Send employee to onsite
Then Verify employee is sent to onsite

@SmokeTest @RegressionTest @E2ETest
Scenario: This is my fifth scenario
Given launch browser
And login into application
When Request for team activity
Then Verify team acitvity

@E2ETest @RegressionTest
Scenario: This is my sixth scenario
Given launch browser
And login into application
When employee data is deleted
Then Verify employee data is deleted

@E2ETest @SmokeTest
Scenario: This is my seven scenario
Given launch browser
And login into application
When apply for IJP employee
Then Verify IJP is done successfully

