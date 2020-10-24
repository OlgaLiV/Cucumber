Feature: Job Title validations against DB
@jtValidation
Scenario: Job Title validations against DB
When login with valid credentials
Then verify the dashboard logo is displayed
When navigate to job titles tab
And verify job title table is displayed
When get all job title from the table
Then get all job title from the DB
Then validate job titles from UI against DB

