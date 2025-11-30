Feature: LeafTabs Application
  Scenario: CreateLead Page Testing
    Given Enter the url http://leaftaps.com/opentaps/control/main
    Given Enter the username
    |user|
    |DemoSalesManager|
    Given Enter the password "crmsfa"
    When Click the button and Click thr crmsfa link and Click create Lead
    Given Enter the all details createlead page
    |C_Name|F_Name|L_Name|
    |Testing|T_Name|L_Names|
    When click the createlead button


  Scenario: CreateLead Page Testings
    Given Enter the url http://leaftaps.com/opentaps/control/main
    Given Enter the username
      |user|
      |DemoSalesManager|
    Given Enter the password "crmsfa"
    When Click the button and Click thr crmsfa link and Click create Lead
    Given Enter the all details createlead page
      |C_Name|F_Name|L_Name|
      |Testing|T_Name|L_Names|
    When click the createlead button