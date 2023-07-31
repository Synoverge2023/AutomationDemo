package com.example.StepDefinitions;

import org.apache.commons.lang3.RandomStringUtils;

import com.example.PageObjects.ManagePIP;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagePIPSteps {

	// We should intialize the object of page class to call their methos
	ManagePIP managepip = new ManagePIP();

	public static final String Title = "Testing" + RandomStringUtils.random(5, true, true);

	public ManagePIPSteps() {

	}

	@When("^User clicks on Manage PIP Module$")
	public void User_clicks_on_Manage_PIP_Module() throws Throwable {
		managepip.clickOnManagePIPModule();

	}

	@When("^User clicks Manage PIP Create Button$")
	public void User_click_Manage_PIP_Create_Button() throws Throwable {
		managepip.clickOnCreateButton();

	}

	@When("^User select employee as (.+) selectEmployee$")
	public void User_select_employee(String selectEmployee) throws Throwable {
		managepip.selectEmployee(selectEmployee);

	}

	@When("^User select plan creation month as (.+) selectMonth$")
	public void User_select_plan_creation_month(String selectMonth) throws Throwable {
		managepip.SelectMonth(selectMonth);

	}

	@When("^User select goal employee as (.+) selectEmployee$")
	public void User_select_goal_employee_as_selectEmployee_selectEmployee(String selectEmployee) throws Throwable {
		managepip.SelectCreateGoalEmployee(selectEmployee);

	}

	@When("^User select Due date month as (.+) selectMonth$")
	public void User_select_Due_date_month_as_selectMonth(String selectMonth) throws Throwable {
		managepip.SelectGoalMonth(selectMonth);

	}

	@When("^User enter Issue Title$")
	public void User_enter_Issue_Title() throws Throwable {
		managepip.enterIssueTitle();

	}

	@When("^User enter Issue Description as (.+) Description$")
	public void User_enter_Issue_Description(String Description) throws Throwable {
		managepip.enterIssueDescription(Description);

	}

	@When("^User enter PIA Description as (.+) PIADescription$")
	public void User_enter_PIA_Description(String PIADescription) throws Throwable {
		managepip.enterPIADescription(PIADescription);

	}

	@When("^User click on performance improvement action icon$")
	public void User_click_on_performance_improvement_action_icon() throws Throwable {
		managepip.clickOnDownArrowKey();

	}

	@When("^User enter performance improvement title$")
	public void enter_performance_improvement_title() throws Throwable {
		managepip.enterPIPImprovementTitle();

	}

	@When("^User enter TimeFrame as (.+) TimeFrame$")
	public void User_enter_TimeFrame(String TimeFrame) throws Throwable {
		managepip.UserenterTimeFrame(TimeFrame);

	}

	@When("^User click on save button$")
	public void User_click_on_save_button() throws Throwable {
		managepip.clickOnSaveButton();

	}

	@When("^User verify the resolution status should be Initiated$")
	public void User_verify_the_resolution_status_should_be_Initiated() throws Throwable {
		managepip.assertionofStautofIssueTitle();

	}

	@When("^user enters the Username as (.+) OrgUsername$")
	public void user_enters_the_Username_as_OrgUsername(String OrgUsername) throws Throwable {
		managepip.enterOrgUsername(OrgUsername);

	}

	@When("^User clickOn Pending Activities$")
	public void user_click_on_Pending_Activities_Module() throws Throwable {
		managepip.clickOnPending_Activities();

	}

	@When("^verify created performance Improvement is existing on pending activity screen and click on existing text and also click on approve button$")
	public void verify_created_performance_Improvement_is_existing_on_pending_activity_screen_and_click_on_existing_text_and_also_click_on_approve_button()
			throws Throwable {
		managepip.clickOnIssueTitleOnPending_Activities();
		managepip.ClickOnApproveIssueTitle();

	}

	@When("^verify created performance Improvement is existing on pending activity screen and click on existing text and also click on reject button$")
	public void verify_created_performance_Improvement_is_existing_on_pending_activity_screen_and_click_on_existing_text_and_also_click_on_reject_button()
			throws Throwable {
		managepip.clickOnIssueTitleOnPending_Activities();
		managepip.ClickOnRejectIssueTitle();

	}

	@When("^Orguser click on signout button$")
	public void Orguser_click_on_signout_button() throws Throwable {
		managepip.clickOnOrgSignoutButton();
	}

	@When("^user enters the EMPuser as(.+) EMPuser$")
	public void user_enters_the_UEMPuser_as_EMPuser(String EMPuser) throws Throwable {
		managepip.enterEOUsername(EMPuser);

	}

	@When("^User click on right scrollingbar for PIP and click on PIP section$")

	public void User_click_on_right_scrollingbar_for_PIP_and_click_on_PIP_section() throws Throwable {

		managepip.clickOnPIPSection();
		managepip.clickOnPIPTitle();
	}

	@When("^User click on right scrollingbar for PIP and click on PIP section for rejected$")

	public void User_click_on_right_scrollingbar_for_PIP_and_click_on_PIP_section_for_rejected() throws Throwable {

		managepip.clickOnPIPSection();
		// managepip.clickOnPIPTitle();
	}

	@When("^verify rejected performance Improvement is not existing$")

	public void verify_rejected_performance_Improvement_is_not_existing() throws Throwable {

		managepip.clickOnPIPSection();
		managepip.clickOnPIPTitle();
	}

	@When("^When User click on eye view of existing PIP and click on downarrow key and also verify the Action status as a NotStarted$")

	public void User_click_on_eye_view_of_existing_PIP_and_click_on_downarrow_key_and_also_verify_the_Action_status_as_a_NotStarted()
			throws Throwable {
		managepip.assertionofNotStartedStatus();
	}

	@When("^User click on Start button$")
	public void User_click_on_Start_button() throws Throwable {
		managepip.clickOnStartButton();
	}

	@When("^When User click on eye view of existing PIP and click on downarrow key and also verify the Action status as a InProgress$")

	public void User_click_on_eye_view_of_existing_PIP_and_click_on_downarrow_key_and_also_verify_the_Action_status_as_a_InProgress()
			throws Throwable {
		managepip.assertionofInProgressStatus();
	}

	@When("^user enters the comments as (.+) EnterPIPComment$")
	public void User_enter_comments_as_comments(String EnterPIPComment) throws Throwable {

		managepip.enterPIPcomment(EnterPIPComment);

	}

	@When("^User click on PIP Complete button$")
	public void User_click_on_PIP_Complete_button() throws Throwable {
		managepip.clickOnCompleteButton();
	}

	@When("^verify pending for approval performance Improvement is existing on pending activity screen under Performance Improvement Plan Actions section and click on existing text and also click on down arrowkey$")
	public void verify_pending_for_approval_performance_Improvement_is_existing_on_pending_activity_screen_under_Performance_Improvement_Plan_Actions_section_and_click_on_existing_text_and_also_click_on_down_arrowkey()
			throws Throwable {
		managepip.ClickOnPerformanceImprovementPlanActions();
		managepip.assertionofCompletedStatus();
	}

	@When("^user click on approve button$")
	public void User_click_on_approve_button() throws Throwable {
		managepip.clickApproveLink();
	}

	@When("^user click on reject button$")
	public void User_click_on_reject_button() throws Throwable {
		managepip.clickRejectLink();
	}

	@When("^verify created performance Improvement is existing on pending activity screen and click on existing text and also click on down arrow key and verify the status should be Reviewed$")

	public void verify_created_performance_Improvement_is_existing_on_pending_activity_screen_and_click_on_existing_text_and_also_click_on_down_arrow_key_and_verify_the_status_should_be_Reviewed()
			throws Throwable {
		managepip.assertionofIssueOnDashboardWithOrg();
		managepip.assertionofStautofIssueReviewed();

	}

	@When("^User click on eye view of existing PIP and click on downarrow key and also verify the Action status should be Approved$")
	public void User_click_on_eye_view_of_existing_PIP_and_click_on_downarrow_key_and_also_verify_the_Action_status_should_be_Approved()
			throws Throwable {
		managepip.assertionofStautofIssueApproved();

	}
}
