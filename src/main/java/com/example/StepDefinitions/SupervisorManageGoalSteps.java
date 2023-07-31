package com.example.StepDefinitions;

import org.apache.commons.lang3.RandomStringUtils;

import com.example.PageObjects.SupervisorManageGoalPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SupervisorManageGoalSteps {

	// We should intialize the object of page class to call their methos
	SupervisorManageGoalPage supervisiorgoal = new SupervisorManageGoalPage();

	public SupervisorManageGoalSteps() {

	}

	@Then("^user select supervisor as (.+) selectSupervisor$")
	public void user_select_supervisor_as_selectSupervisor(String selectSupervisor) throws Throwable {
		supervisiorgoal.selectSupervisorDropdown(selectSupervisor);

	}

	@Then("^user click on super user signout button$")
	public void user_click_on_super_user_signout_button() throws Throwable {
		supervisiorgoal.clickOnSuperUserSignoutButton();

	}

}