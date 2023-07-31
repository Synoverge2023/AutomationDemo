Feature: Manage PIP
Background: 
	Given User is on Login page
	
@test1
Scenario Outline:Supervisor Create PIP and assign PIP to Employee

When user enters the Username as <Username> Username
When user enters the password as <Password> password
When User clicks on SignIn button
When User clicks on Manage PIP Module
When User clicks Manage PIP Create Button
When User select employee as <selectEmployee> selectEmployee
When User select plan creation month as <selectMonth> selectMonth
When User enter Issue Title
When User enter Issue Description as <Description> Description
When User click on performance improvement action icon
When User enter performance improvement title
When User enter TimeFrame as <TimeFrame> TimeFrame
When User enter PIA Description as <PIADescription> PIADescription
When User click on save button
When User verify the resolution status should be Initiated
Then user click on signout button
When user enters the Username as <OrgUsername> OrgUsername
When user enters the password as <Password> password
When User clicks on SignIn button
When User clickOn Pending Activities
When verify created performance Improvement is existing on pending activity screen and click on existing text and also click on approve button
Then Orguser click on signout button
When user enters the EMPuser as <EMPuser> EMPuser
When user enters the password as <Password> password
When User clicks on SignIn button
When user click on My Dashbaord Module
When User click on right scrollingbar for PIP and click on PIP section
When When User click on eye view of existing PIP and click on downarrow key and also verify the Action status as a NotStarted
When User click on Start button
When user enters the comments as <EnterPIPComment> EnterPIPComment
When User click on PIP Complete button
Then EMPuse click on signout button
When user enters the Username as <Username> Username
When user enters the password as <Password> password
When User clicks on SignIn button
When user click on Pending Activity Module
When verify pending for approval performance Improvement is existing on pending activity screen under Performance Improvement Plan Actions section and click on existing text and also click on down arrowkey
#When verify pending for approval performance Improvement is existing on pending activity screen under Performance Improvement Plan Actions section and click on existing text and also click on down arrowkey
When user enters the comments as <EnterPIPComment> EnterPIPComment
When user click on approve button
Then user click on signout button
When user enters the Username as <OrgUsername> Username
When user enters the password as <Password> password
When User clicks on SignIn button
When User clickOn Pending Activities
When verify created performance Improvement is existing on pending activity screen and click on existing text and also click on down arrow key and verify the status should be Reviewed
When user enters the comments as <EnterPIPComment> EnterPIPComment
When user click on approve button
Then Orguser click on signout button
When user enters the EMPuser as <EMPuser> EMPuser
When user enters the password as <Password> password
When User clicks on SignIn button
When user click on My Dashbaord Module
When User click on right scrollingbar for PIP and click on PIP section
When User click on eye view of existing PIP and click on downarrow key and also verify the Action status should be Approved
Examples: 
| Username | Password |  Description |selectEmployee|selectMonth|TimeFrame|OrgUsername|EMPuser|EnterPIPComment|PIADescription|
| Supervisorone@yopmail.com | Synoverge@123 | Test PIP Description |Employee One| Dec|20|orgadmin123@yopmail.com|employeeone@yopmail.com|TestEnterPIPComment|Description|


@test2
Scenario Outline:Reject PIP

When user enters the Username as <Username> Username
When user enters the password as <Password> password
When User clicks on SignIn button
When User clicks on Manage PIP Module
When User clicks Manage PIP Create Button
When User select employee as <selectEmployee> selectEmployee
When User select plan creation month as <selectMonth> selectMonth
When User enter Issue Title
When User enter Issue Description as <Description> Description
When User click on performance improvement action icon
When User enter performance improvement title
When User enter TimeFrame as <TimeFrame> TimeFrame
When User enter PIA Description as <PIADescription> PIADescription
When User click on save button
When User verify the resolution status should be Initiated
Then user click on signout button
When user enters the Username as <OrgUsername> OrgUsername
When user enters the password as <Password> password
When User clicks on SignIn button
When User clickOn Pending Activities
When verify created performance Improvement is existing on pending activity screen and click on existing text and also click on reject button
Then Orguser click on signout button
When user enters the EMPuser as <EMPuser> EMPuser
When user enters the password as <Password> password
When User clicks on SignIn button
When user click on My Dashbaord Module
When User click on right scrollingbar for PIP and click on PIP section for rejected
#When verify rejected performance Improvement is not existing

Examples: 
| Username | Password |  Description |selectEmployee|selectMonth|TimeFrame|OrgUsername|EMPuser|EnterPIPComment|PIADescription|
| Supervisorone@yopmail.com | Synoverge@123 | Test PIP Description |Employee One| Dec|20|orgadmin123@yopmail.com|employeeone@yopmail.com|TestEnterPIPComment|Description|


@test3
Scenario Outline:Reject PIP

When user enters the Username as <Username> Username
When user enters the password as <Password> password
When User clicks on SignIn button
When User clicks on Manage PIP Module
When User clicks Manage PIP Create Button
When User select employee as <selectEmployee> selectEmployee
When User select plan creation month as <selectMonth> selectMonth
When User enter Issue Title
When User enter Issue Description as <Description> Description
When User click on performance improvement action icon
When User enter performance improvement title
When User enter TimeFrame as <TimeFrame> TimeFrame
When User enter PIA Description as <PIADescription> PIADescription
When User click on save button
When User verify the resolution status should be Initiated
Then user click on signout button
When user enters the Username as <OrgUsername> OrgUsername
When user enters the password as <Password> password
When User clicks on SignIn button
When User clickOn Pending Activities
When verify created performance Improvement is existing on pending activity screen and click on existing text and also click on approve button
Then Orguser click on signout button
When user enters the EMPuser as <EMPuser> EMPuser
When user enters the password as <Password> password
When User clicks on SignIn button
When user click on My Dashbaord Module
When User click on right scrollingbar for PIP and click on PIP section
When When User click on eye view of existing PIP and click on downarrow key and also verify the Action status as a NotStarted
When User click on Start button
When user enters the comments as <EnterPIPComment> EnterPIPComment
When User click on PIP Complete button
Then EMPuse click on signout button
When user enters the Username as <Username> Username
When user enters the password as <Password> password
When User clicks on SignIn button
When user click on Pending Activity Module
When verify pending for approval performance Improvement is existing on pending activity screen under Performance Improvement Plan Actions section and click on existing text and also click on down arrowkey
When user enters the comments as <EnterPIPComment> EnterPIPComment
When user click on reject button
Then user click on signout button

Examples: 
| Username | Password |  Description |selectEmployee|selectMonth|TimeFrame|OrgUsername|EMPuser|EnterPIPComment|PIADescription|
| Supervisorone@yopmail.com | Synoverge@123 | Test PIP Description |Employee One| Dec|20|orgadmin123@yopmail.com|employeeone@yopmail.com|TestEnterPIPComment|Description|