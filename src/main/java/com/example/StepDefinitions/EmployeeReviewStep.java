
package com.example.StepDefinitions;

import org.apache.commons.lang3.RandomStringUtils;

import com.example.PageObjects.EmployeeReviewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeReviewStep {

	// We should intialize the object of page class to call their methos
	EmployeeReviewPage review = new EmployeeReviewPage();

	public static final String Title = "Testing" + RandomStringUtils.random(5, true, true);

	public EmployeeReviewStep() {

	}

	@Then("^User click on Review section$")
	public void User_click_on_Review_section() throws Throwable {
		// review.clickOnManageGoalModule();
		review.clickonReviewSection();
	}

	@Then("^user click on Assign review form$")
	public void user_click_on_Assign_review_form() throws Throwable {
		// review.clickOnManageGoalModule();
		review.clickOnAssignReviewForm();
	}

	@Then("^user fill review data and click on save button$")
	public void user_fill_review_data_and_click_on_submit_button() throws Throwable {
		review.fillReviewFormswithEmployee();
		review.clickOnReviewSubmitButton();
	}

	@Then("^User click on Submit for Review Button$")
	public void User_Click_on_Submit_for_Review_Button() throws Throwable {

		review.clickOnSubmitForReviewButton();

	}

	@Then("^User enter comments as (.+) OrgComments$")
	public void User_enter_comments_as_OrgComments(String OrgComments) throws Throwable {

		review.EnterOrgRejectComments(OrgComments);

	}

	@Then("^verify that review form status should be Submitted$")
	public void verify_that_review_form_status_should_be_Submitted() throws Throwable {
		// review.clickOnManageGoalModule();
		review.clickOnAssignReviewForm();

		review.VerifySubmitFormStatus();

	}



	@Then("^User click on Close button$")
	public void User_click_on_Close_button() throws Throwable {
		// review.clickOnManageGoalModule();

	}

	@Then("^verify that status should be display Pending$")
	public void verify_that_status_should_be_display_Pending() throws Throwable {

	}

	@Then("^user click on edit icon$")
	public void user_click_on_edit_icon() throws Throwable {
	

		review.clickOnReviewEditIcon();

	}

	@Then("^Supervisor fill review data and click on save button$")
	public void Supervisor_fill_review_data_and_click_on_save_button() throws Throwable {

		review.fillReviewFormswithSupervisor();
		review.clickOnReviewSubmitButton();

	}



	@Then("^verify that status should be Review done$")
	public void verify_that_status_should_be_Review_done() throws Throwable {
		// review.clickOnManageGoalModule();

	}

	@Then("^verify that meeting icon should display$")
	public void verify_that_meeting_icon_should_display() throws Throwable {

	}

	@Then("^User click on Approve button$")
	public void User_click_on_Approve_button() throws Throwable {

		review.clickOnReviewApproveButton();

	}

	@Then("^verify that form status should be Closed$")
	public void verify_that_form_status_should_be_Closed() throws Throwable {
		review.clickOnAssignReviewForm();
	
		review.verifyClosedStatus();

	}

	@Then("^User enter comments as (.+) Comments$")
	public void User_enter_comments_as_Comments(String Comments) throws Throwable {
		review.EnterRejectComments(Comments);

	}

	@Then("^User click on Save button$")
	public void User_click_on_Save_button() throws Throwable {

		review.clickOnReviewSubmitButton();

	}

//	@Then("^Orguser click on signout button$")
//	public void Orguser_click_on_signout_button() throws Throwable {
//		review.clickOnOrgSignoutButton();
//	}

	@Then("^verify that status should be display Rejected$")
	public void verify_that_status_should_be_display_Rejected() throws Throwable {
		review.clickOnAssignReviewForm();
		review.reviewRejectStatus();

	}

//	@When("^user enters the Username as (.+) OrgUsername$")
//	public void user_enters_the_Username_as_OrgUsername(String OrgUsername) throws Throwable {
//		review.enterOrgUsername(OrgUsername);
//	}

}
