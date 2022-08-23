
Feature: Edit Lead

Background: Positive Login

 Given Type username as 'demosalesmanager'
 And Type the password as 'crmsfa'
 When Click on the Login button
  


  Scenario: Editing existing Lead Details
    Given Select CRMSFA Link
    When Leads option is selected
    Then Select FindLeads option
    Given First name as 'Siva'
    Then Select Findleads icon
    And Select the first resulting lead
    Then verify page title
    And  Select edit lead button
    Then Clear the companyname
    And Enter the companyName as 'HP'

  