package com.example.StepDefinitions;

import com.example.PageObjects.SupervisorTeamDashboardPage;
import com.example.Utilities.GenericUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SupervisorTeamDashboardSteps {

	// We should intialize the object of page class to call their methos
	SupervisorTeamDashboardPage accomplishment = new SupervisorTeamDashboardPage();
	GenericUtils genericUtils;

//	public static final String Title = "Testing" + RandomStringUtils.random(5, true, true);

	public SupervisorTeamDashboardSteps() {

	}

	// Scenario Outline: Verify supervisor is able to login and add accomplishment
	// successfully
	// ########################################################################################

	/*
	 * @Given("^Browser is launch and hit QA URL$") public void
	 * validate_the_browser() throws IOException { //genericUtils=new
	 * GenericUtils(); genericUtils.initBrowser(ApplicationConstants.browser,
	 * ApplicationConstants.URL); }
	 */

	/*
	 * @Given("^User is on Login page$") public void user_is_on_login_page() throws
	 * Throwable {
	 * 
	 * accomplishment.userIsOnLoginUpPage();
	 * 
	 * }
	 * 
	 * @When("^user enters the Username as (.+) Username$") public void
	 * user_enters_the_Username_as_Username(String Username) throws Throwable {
	 * accomplishment.enterUsername(Username);
	 * 
	 * }
	 * 
	 * @When("^user enters the password as (.+) password$") public void
	 * user_enters_the_password_as_password(String Password) throws Throwable {
	 * accomplishment.enterPassword(Password);
	 * 
	 * }
	 * 
	 * @When("^User clicks on SignIn button$") public void
	 * user_clicks_on_SignIn_button1() throws Throwable {
	 * accomplishment.ClickOnTeamDashboard(); }
	 */

	@When("^User click on Team Dashboard menu$")
	public void User_click_on_Team_Dashboard_menu() throws Throwable {
		accomplishment.ClickOnTeamDashboard();
	}

	@When("^User click on employee Dashboard menu$")
	public void User_click_on_employee_Dashboard_menu() throws Throwable {
		accomplishment.clickOnEmployeeDashboardModule();
	}

	@When("^Enter Employee For Search And Click Search Button$")
	public void Enter_Employee_For_Search_And_Click_Search_Button() throws Throwable {
		accomplishment.EnterEmployeeForSearchAndClickSearchButton();
	}

	@When("^User click on eye icon against employee two$")
	public void User_click_on_eye_icon_against_employee_two() throws Throwable {
		accomplishment.clickOnEyeIconViewofEmployeeTwo();
	}

	@When("^Add Complishment button is exist on the screen and User clicks on Add Accomplishment$")
	public void Add_Complishment_button_is_exist_on_the_screen_and_User_clicks_on_Add_Accomplishment()
			throws Throwable {
		accomplishment.VerifyAddComplishButton();
	}

	@When("^Add Complishment button is not exist on the screen$")
	public void Add_Complishment_button_is_not_exist_on_the_screen() throws Throwable {
		accomplishment.VerifyIvisibilityAddComplishButton();
	}

	@When("^User click on eye icon against employeeone user name$")
	public void User_click_on_eye_icon_against_employeeone_user_name() throws Throwable {
		accomplishment.clickOnEyeIconViewofEmployee();
	}

	@When("^Verify that add comment button should not be exsiting on the screen$")
	public void Verify_that_add_comment_button_should_not_be_exsiting_on_the_screen() throws Throwable {
		accomplishment.VerifyIvisibilityAddCommentButton();

	}

	/*
	 * @When("^EMPuse click on signout button$") public void
	 * EMPuser_click_on_signout_button() throws Throwable {
	 * accomplishment.clickOnEOSignoutButton(); }
	 */

	@When("^EMPuser close the browser and launch browser and launch url$")
	public void EMPuser_close_the_browser_and_launch_browser_and_launch_url() throws Throwable {

		accomplishment.clickOnEOSignoutButton();
	}

	/*
	 * @Then("^User clicks on Add Accomplishment$") public void
	 * User_clicks_on_Add_Accomplishment() throws Throwable {
	 * accomplishment.pageRefresh(); // accomplishment.pageRefresh();
	 * accomplishment.ClickOnDashboard();
	 * accomplishment.clickOnAddaccomplishmentButton(); }
	 */

	/*
	 * @Then("^verify Accomplishment page title and User clicks on calendar icon and select date$"
	 * ) public void User_clicks_on_calendar_icon_and_select_date() throws Throwable
	 * { accomplishment.clickOnCalendarIcon(); accomplishment.VerifyPageTitle(); //
	 * accomplishment.currentDate(); // accomplishment.SelectDate();
	 * 
	 * }
	 * 
	 * @When("^user enters the Accomplishment Title$") public void
	 * user_enters_the_Title() throws Throwable { accomplishment.enterTitle();
	 * 
	 * }
	 * 
	 * @When("^user verify the entered text$") public void
	 * user_verify_the_entered_text() throws Throwable {
	 * accomplishment.assertinOfExistingAccomplishment();
	 * 
	 * }
	 * 
	 * @When("^user enters the Accomplishment Description as (.+) Description$")
	 * public void user_enters_the_Description_as_Description(String Description)
	 * throws Throwable { accomplishment.enterDescription(Description);
	 * 
	 * }
	 */
	/*
	 * @And("^click on Save button$") public void
	 * User_click_on_Save_button_and_Verify_success_message() throws Throwable {
	 * accomplishment.clickOnSaveButton();
	 * 
	 * }
	 */
	/*
	 * @Then("^Verify success message$") public void Verify_success_message() throws
	 * Throwable { accomplishment.VerifySuccessMessage();
	 * 
	 * }
	 */
	// Scenario Outline: Verify supervisor is able to approve existing
	// accomplishment from pending activity screen successfully
	// ########################################################################################
	/*
	 * @When("^user click on Pending Activity Module$") public void
	 * user_click_on_Pending_Activity_Module() throws Throwable {
	 * accomplishment.clickOnPendingActivityModule();
	 * 
	 * }
	 */

	/*
	 * @When("^verify created Accomplishment is existing on pending activity screen and click on approve button against existing pending accomplishment$"
	 * ) public void
	 * verify_created_Accomplishment_is_existing_on_pending_activity_screen_and_click_on_approve_button_against_existing_pending_accomplishment
	 * () throws Throwable { accomplishment.assertinOfExistingAccomplishment();
	 * accomplishment.clickOnApproval();
	 * 
	 * }
	 */

	@When("verify_Accomplishment_is_existing_on_the_screen_and_click_on_accomplishment")
	public void verify_accomplishment_is_existing_on_the_screen_and_click_on_accomplishment() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		accomplishment.clickOnExistingAccomplishment();

	}

	/*
	 * @When("User click on employee Dashboard menu") public void
	 * User_click_on_employee_Dashboard_menu() throws Throwable { // Write code here
	 * that turns the phrase above into concrete actions
	 * accomplishment.ClickOnEmployeeDashboardMenu();
	 * 
	 * }
	 */

	/*
	 * @Then("^exsiting accomplishment should be approved and message should be displayed Feedback Request updated successfully$"
	 * ) public void
	 * exsiting_accomplishment_should_be_approved_and_message_should_be_displayed_Feedback_Request_updated_successfully
	 * () throws Throwable { accomplishment.assertinOfExistingAccomplishment();
	 * 
	 * }
	 */

	// Scenario Outline: Verify that user should able to add and save comments for
	// approved accomplishment
	// ###################################################################################################

	/*
	 * @Then("^user click on My Dashbaord Module$") public void
	 * user_click_on_My_Dashbaord_Module() throws Throwable {
	 * accomplishment.ClickOnDashboard(); }
	 * 
	 * @Then("^click on existing accomplishment from dashboard$") public void
	 * click_on_existing_accomplishment_from_dashboard() throws Throwable {
	 * 
	 * accomplishment.clickOnExistingAccomplishment(); }
	 * 
	 * @Then("^Click on Add Comments button$") public void
	 * Click_on_Add_Comments_button() throws Throwable {
	 * 
	 * accomplishment.clickOnAddCommentButton();
	 * 
	 * }
	 * 
	 * @When("^User Enter supervisor comment as (.+) SupervisorComment$") public
	 * void User_Enter_supervisor_comment_as_SupervisorComment(String
	 * SupervisorComment) throws Throwable {
	 * 
	 * accomplishment.enterSupevisorComment(SupervisorComment);
	 * 
	 * }
	 * 
	 * @Then("^click on save button$") public void click_on_save_button() throws
	 * Throwable { accomplishment.clickOnSaveCommentButton();
	 * 
	 * }
	 * 
	 * @Then("^click on again same existing accomplishment and refer supervisor comment$"
	 * ) public void
	 * click_on_again_same_existing_accomplishment_and_refer_supervisor_comment()
	 * throws Throwable { // accomplishment.scrollTillAccomplishemnt(); //
	 * accomplishment.VerifyAccomplishemntOnDashboardAndClick();
	 * accomplishment.clickOnPendingActivityModule();
	 * accomplishment.ClickOnDashboard();
	 * accomplishment.clickOnExistingAccomplishment(); //
	 * accomplishment.verifyAddedSupervisorComment();
	 * 
	 * }
	 */

	// Scenario Outline: Verify supervisor is able to reject existing accomplishment
	// from pending activity screen successfully
	// ###################################################################################################

	/*
	 * @When("^verify created Accomplishment is existing on pending activity screen and click on reject button against existing pending accomplishment$"
	 * ) public void
	 * verify_created_Accomplishment_is_existing_on_pending_activity_screen_and_click_on_reject_button_against_existing_pending_accomplishment
	 * () throws Throwable { accomplishment.assertinOfExistingAccomplishment();
	 * accomplishment.clickOnRejectAcomplishment();
	 * 
	 * }
	 * 
	 * @Then("^exsiting accomplishment should be reject and message should be displayed Feedback Request updated successfully$"
	 * ) public void
	 * exsiting_accomplishment_should_be_rejected_and_message_should_be_displayed_Feedback_Request_updated_successfully
	 * () throws Throwable {
	 * accomplishment.VerifySuccessMessageonRejectAccomplishment();
	 * 
	 * }
	 */
	// Scenario Outline: Verify create Accomplishment with select Request Feedback
	// option and assign accomplishment to User employee
	// ##############################################################################################################################
	/*
	 * @When("^user click on request feedback checkbox$") public void
	 * user_click_on_request_feedback_checkbox() throws Throwable {
	 * accomplishment.clickOnRequestFeedbackCheckbox();
	 * 
	 * }
	 * 
	 * @When("^user enter tageed employee name as (.+) empname$") public void
	 * user_enter_tageed_employee_name_as_empname(String empname) throws Throwable {
	 * accomplishment.enterEmpname(empname);
	 * 
	 * }
	 * 
	 * @Then("^user click on search button$") public void
	 * user_click_on_search_button() throws Throwable {
	 * 
	 * accomplishment.clickOnEmployeeSearchButton();
	 * 
	 * }
	 * 
	 * @Then("^user select existing employee checkbox$") public void
	 * user_select_existing_employee_checkbox() throws Throwable {
	 * accomplishment.SelectExistingEmployee();
	 * 
	 * }
	 * 
	 * @Then("^user click on signout button$") public void
	 * user_click_on_signout_button() throws Throwable {
	 * accomplishment.clickOnSOSignoutButton(); }
	 * 
	 * @Then("^User clicks on My activity menu$")
	 * 
	 * public void User_clicks_on_My_activity_menu() throws Throwable {
	 * 
	 * accomplishment.ClickOnMyActivityMenu();
	 * 
	 * }
	 * 
	 * @When("^User verify that My Pending Activities title is displayed and click on Add Feedback button$"
	 * )
	 * 
	 * public void User_verify_that_My_Pending_Activities_title_is_displayed()
	 * throws Throwable { accomplishment.AssertAndClickMyPendingActivities();
	 * accomplishment.clickOnApprovalFeedbacks(); }
	 * 
	 * 
	 * @When("^User is able to enter the feedbacks$")
	 * 
	 * public void User_is_able_to_enter_the_feedbacks() throws Throwable {
	 * 
	 * accomplishment.enterEmployeeFeedbackTitle(); }
	 * 
	 * @When("^User click on send feedbacks$")
	 * 
	 * public void User_click_on_send_feedbacks() throws Throwable {
	 * accomplishment.clickOnSendFeedbackButton(); }
	 * 
	 * @When("^exsiting accomplishment should be apprve and message should be displayed FeedbackRequest created successfully$"
	 * )
	 * 
	 * public void
	 * exsiting_accomplishment_should_be_apprve_and_message_should_be_displayed_FeedbackRequest_created_successfully
	 * () throws Throwable {
	 * 
	 * accomplishment.VerifySuccessMessageonOnSendFeedbacks();
	 * 
	 * }
	 * 
	 * @Then("^EMPuse click on signout button$") public void
	 * EMPuser_click_on_signout_button() throws Throwable {
	 * accomplishment.clickOnEOSignoutButton(); }
	 */

}