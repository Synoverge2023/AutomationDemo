Feature: Verify Manage goal functionality with employee and supervisior role

Background: 
	Given User is on Login page
	

@test1
Scenario Outline: Verify that supervisor able to create goal and assign created goal to employee
  
    When user enters the Username as <Username> Username
    When user enters the password as <Password> password
    Then User clicks on SignIn button
    Then User clicks on Manage goal module
    Then User clicks on Create Button
    When user enters the GoalTitle
   When User select goal employee as <selectEmployee> selectEmployee
   When User select Due date month as <selectMonth> selectMonth 
   When user enters the Description as <Description> Description
    Then user click on save button and verify success message
   Then verify that created goal should be display on listing screen with Goal Created status
    Then verify that created goal should be display on listing screen with Active status
    Then user click on signout button
    
    
   Examples: 
      | Username | Password | Description | selectEmployee |selectMonth|
      |  Supervisorone@yopmail.com | Synoverge@123 | Test Goal | Employee One |Dec|
      
      
    @test2
  Scenario Outline: Verify manage goal functionality with employee login
    When user enters the Username as <Username> Username
    When user enters the password as <Password> password
    Then User clicks on SignIn button
    Then User clicks on Assign goal and verify that status should be Goal Created
    When enter employee comments as <Comments> Comments
    Then User click on Complete button
    Then User clicks on My activity menu
    Then user click on My Dashbaord Module
    Then User click on assign goal and verify that status should be Submitted For Approval
    Then EMPuse click on signout button
    
  
 Examples: 
      | Username | Password | Description | Comments |
      |  employeeone@yopmail.com | Synoverge@123 | Test Goal | Test Comments |
      
      
      
     @test3 
 Scenario Outline: Verify manage goal functionality with Approve flow
   When user enters the Username as <Username> Username
    When user enters the password as <Password> password
    Then User clicks on SignIn button
    Then user click on Pending Activity Module
    Then User click on pending approval goal
    Then supervisior add comments as <Comments> Comments
    Then User click on Approve button and verify approve message 
    Then User clicks on Manage goal module
    Then User verify that approved comments status should be Accomplished
    Then user click on signout button 
    
  
  Examples: 
      | Username | Password | Comments |
      | Supervisorone@yopmail.com | Synoverge@123 | Test Approve Comments |
      
      
      @test4
     Scenario Outline: Verify Approve goal status on employee login
    When user enters the Username as <Username> Username
    When user enters the password as <Password> password
    Then User clicks on SignIn button
    Then User clicks on Assign goal and verify that status should be Accomplished
    Then EMPuse click on signout button
   
    
Examples: 
      | Username | Password | Description | Comments |
      | employeeone@yopmail.com | Synoverge@123 | Test Goal | Test Approve Supervisior |
      
      
     @test5
   Scenario Outline: Verify manage goal functionality with Reject flow
   When user enters the Username as <Username> Username
    When user enters the password as <Password> password
    Then User clicks on SignIn button
     Then User clicks on Manage goal module
    Then User clicks on Create Button
    When user enters the GoalTitle
   When User select goal employee as <selectEmployee> selectEmployee
 When User select Due date month as <selectMonth> selectMonth
  When user enters the Description as <Description> Description
    Then user click on save button and verify success message
   Then verify that created goal should be display on listing screen with Goal Created status
    Then verify that created goal should be display on listing screen with Active status
    Then user click on signout button
     When user enters the EUsername as <EUsername> EUsername
    When user enters the password as <Password> password
    Then User clicks on SignIn button
    Then User clicks on Assign goal and verify that status should be Goal Created
    When enter employee comments as <Comments> Comments
    Then User click on Complete button
    Then User clicks on My activity menu
    Then user click on My Dashbaord Module
    Then User click on assign goal and verify that status should be Submitted For Approval
    Then EMPuse click on signout button
     When user enters the Username as <Username> Username
    When user enters the password as <Password> password
    Then User clicks on SignIn button
    Then user click on Pending Activity Module
    Then User click on pending approval goal
    Then supervisior add comments as <Comments> Comments
    Then User click on Reject button
    Then User clicks on Manage goal module
    Then  User verify that Rejected comments status should be Rejected
    Then user click on signout button
      
  Examples: 
      | Username | Password | Description | Comments | EUsername |selectEmployee |selectMonth|
      |  Supervisorone@yopmail.com | Synoverge@123 | Test Goal | Test Reject| employeeone@yopmail.com |Employee One |Dec|
      
      
      
          @test6
       Scenario Outline: Verify Reject goal status on employee login
    When user enters the Username as <Username> Username
    When user enters the password as <Password> password
    Then User clicks on SignIn button
    Then User clicks on Assign goal and verify that status should be Reject
      Then EMPuse click on signout button
    
    
  Examples: 
      | Username | Password | Description |
      |  employeeone@yopmail.com | Synoverge@123 | Test Goal |
      
      #
     #@test7
     #Scenario Outline: Verify that when supervisor deactive any goal the deactivate goal should not display on employee side
     #
     #When user enters the Username as <Username> Username
    #When user enters the password as <Password> password
    #Then User clicks on SignIn button
    #Then User clicks on Manage goal module
    #Then User clicks on Create Button
    #When user enters the GoalTitle
    #When   User select goal employee as <selectEmployee> selectEmployee
  #When User select Due date month as <selectMonth> selectMonth
  #When user enters the Description as <Description> Description
    #Then user click on save button and verify success message
   #Then verify that created goal should be display on listing screen with Goal Created status
    #Then verify that created goal should be display on listing screen with Active status
    #Then user click on goal edit button
    #Then user click on Active button checkbox
    #Then user click on Manage Goal Save button and verify success message
  #   Then verify that created goal should be display on listing screen with In Active status
    #Then user click on signout button
     #When user enters the EUsername as <EUsername> EUsername
    #When user enters the password as <Password> password
    #Then Verify that inactive status should not display on employee goal page
    #Then EMPuse click on signout button
     #
#
#
#
#Examples: 
      #| Username | Password | Description |EUsername |selectEmployee |selectMonth|
      #| Supervisorone@yopmail.com | Synoverge@123 | Test Goal |employeeone@yopmail.com | Employee One |Dec|


 