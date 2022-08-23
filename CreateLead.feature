
Feature: Create a new Lead
Background: Positive Login

 Given Type username as 'demosalesmanager'
 And Type the password as 'crmsfa'
 When Click on the Login button
 

  

 Scenario Outline: Create a new Lead with Different Data
 
   Given Click CRMSFA Link
    And Select the leads option
    And Click on CreateLead icon
    And Type the companyname as <companyName>
    And Type the firstname as <firstName>
    And Type the lastname as <LastName>
    Then Proceed to creating lead
    
  

    Examples: 
      | companyName  | firstName | LastName  |
      | TestLeaf |     Babu | NK |
      | TCS |    Anjana | SP    |
