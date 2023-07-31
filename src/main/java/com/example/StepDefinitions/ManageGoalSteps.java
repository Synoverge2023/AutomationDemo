package com.example.StepDefinitions;

import org.apache.commons.lang3.RandomStringUtils;

import com.example.PageObjects.ManageGoal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageGoalSteps {

	// We should intialize the object of page class to call their methos
	ManageGoal managegoal = new ManageGoal();

	public static final String Title = "Testing" + RandomStringUtils.random(5, true, true);

	public ManageGoalSteps() {

	}

	@Then("^User clicks on Manage goal module$")
	public void User_clicks_on_Manage_goal_module() throws Throwable {
		managegoal.clickOnManageGoalModule();

	}

	@Then("^User clicks on Create Button$")
	public void User_clicks_on_Create_Button() throws Throwable {
		managegoal.clickOnCreateButton();

	}

	@When("^user enters the GoalTitle$")
	public void user_enters_the_GoalTitle() throws Throwable {

		managegoal.enterGoalTitle();
	}

	@Then("^user select any employee from dropdown$")
	public void user_select_any_employee_from_dropdown() throws Throwable {
		managegoal.clickOnCreatedForDropdown();
		managegoal.selectGoalDropdown();

	}

	@Then("^User clicks on calendar icon and select date$")
	public void User_clicks_on_calendar_icon_and_select_date() throws Throwable {
		managegoal.clickOnCalenderIcon();
		managegoal.selectGoalDate();

	}

//    @Then("^user enters the Description as (.+)Description $")
//    public void user_enters_the_Description_as_Description () throws Throwable {
//    	
//    	
//    }

	@When("^user enters the Description as (.+) Description$")
	public void user_enters_the_description_as_description(String Description) {
		// Write code here that turns the phrase above into concrete actions
		managegoal.EnterDescription(Description);
	}

	@Then("^user click on save button and verify success message$")
	public void user_click_on_save_button_and_verify_success_message() throws Throwable {
		managegoal.clickOnGoalSaveButton();
		managegoal.verifyGoalSuceesMessage();

	}

	@Then("^verify that created goal should be display on listing screen with Goal Created status$")
	public void verify_that_created_goal_should_be_display_on_listing_screen_with_Goal_Created_status()
			throws Throwable {

		managegoal.verifyGoalListingStatus();
	}

	@Then("^verify that created goal should be display on listing screen with Active status$")
	public void verify_that_created_goal_should_be_display_on_listing_screen_with_Active_status() throws Throwable {

		managegoal.verifyGoalListingActiveStatus();
	}

	@When("^enter employee comments as (.+) Comments$")
	public void enter_employee_comments_as_Comments(String Comments) throws Throwable {
		managegoal.enterEmployeeComments(Comments);

	}

	@Then("^User clicks on Assign goal and verify that status should be Goal Created$")
	public void User_clicks_on_Assign_goal_and_verify_that_status_should_be_Goal_Created() throws Throwable {
		managegoal.refreshGoalsection();
		managegoal.assertinOfEmployeeGoalTitle();

	}

	@Then("^user enters the EUsername as (.+) EUsername$")
	public void user_enters_the_EuUsername_as_EUsername(String EUsername) throws Throwable {

		managegoal.enterEmployeeUsername(EUsername);
	}

	@Then("^User click on Complete button$")
	public void User_click_on_Complete_button() throws Throwable {
		managegoal.clickOnCompleteButton();
	}

	@Then("^User click on assign goal and verify that status should be Submitted For Approval$")
	public void User_click_on_assign_goal_and_verify_that_status_should_be_Submitted_For_Approval() throws Throwable {

		managegoal.assertinOfEmployeeGoalTitle();
		managegoal.verifyEmployeeGoalStatus();
	}

	@Then("^supervisior add comments as (.+) Comments$")
	public void supervisior_add_comments_as_Comments(String Comments) throws Throwable {
		managegoal.enterSupervisiorComments(Comments);

	}

	@Then("^User verify that approved comments status should be Accomplished$")
	public void User_verify_that_approved_comments_status_should_be_Accomplished() throws Throwable {
		managegoal.verifyAccomplishedsupervisiorstatus();

	}

	@Then("^User verify that Rejected comments status should be Rejected$")
	public void User_verify_that_approved_comments_status_should_be_Rejected() throws Throwable {
		managegoal.verifyRejectedsupervisiorstatus();

	}

	@Then("^User click on Approve button and verify approve message$")
	public void User_click_on_Approve_button_and_verify_approve_message() throws Throwable {

		managegoal.clickOnGoalApproveButton();
		managegoal.verifyGoalApproveMessage();
	}

	@Then("^User click on pending approval goal$")
	public void User_click_on_pending_approval_goal() throws Throwable {
		managegoal.onPageRefresh();

		managegoal.clickOnEmployeeGoalReview();
	}

	@Then("^User click on pending approval goalText$")
	public void User_click_on_pending_approval_goals() throws Throwable {
		managegoal.onPageRefresh();
		wait(5000);
		// managegoal.clickOnPendingActivityModule();
		managegoal.clickOnEmployeeGoalReviewWithSU();
	}

	@Then("^User clicks on Assign goal and verify that status should be Accomplished$")
	public void User_clicks_on_Assign_goal_and_verify_that_status_should_be_Accomplished() throws Throwable {
		managegoal.assertinOfEmployeeGoalTitle();
		managegoal.verifyStatusofApproveGoal();
	}

	@Then("^User click on Reject button$")
	public void User_click_on_Reject_button() throws Throwable {
		managegoal.clickOnRejectButton();
	}

	@Then("^User clicks on Assign goal and verify that status should be Reject$")
	public void User_clicks_on_Assign_goal_and_verify_that_status_should_be_Reject() throws Throwable {
		managegoal.assertinOfEmployeeGoalTitle();
		managegoal.verifyEmployeeRejectGoal();
	}

	@Then("^user click on goal edit button$")
	public void user_click_on_goal_edit_button() throws Throwable {
		managegoal.clickOnGoalEditButton();

	}

	@Then("^user click on Active button checkbox$")
	public void user_click_on_Active_button_checkbox() throws Throwable {
		managegoal.clickOnActiveCheckBox();

	}

	@Then("^user click on Manage Goal Save button and verify success message$")
	public void user_click_on_Manage_Goal_Save_button_and_verify_success_message() throws Throwable {
		managegoal.clickOnGoalSaveButton();
		managegoal.verifyStatusEditMessage();

	}

	@Then("^verify that created goal should be display on listing screen with In Active status$")
	public void verify_that_created_goal_should_be_display_on_listing_screen_with_In_Active_status() throws Throwable {
		managegoal.verifyInActiveStatus();

	}

	@Then("^Verify that inactive status should not display on employee goal page$")
	public void Verify_that_inactive_status_should_not_display_on_employee_goal_page() throws Throwable {
		managegoal.verifyInactiveGoalVisibility();

	}

}