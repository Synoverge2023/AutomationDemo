package com.example.StepDefinitions;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.example.PageObjects.SupervisorAccomplishmentPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.example.Utilities.GenericUtils;

import app.constants.ApplicationConstants;

public class EmployeeAccomplishmentStep {

	// We should intialize the object of page class to call their methos
	SupervisorAccomplishmentPage accomplishment = new SupervisorAccomplishmentPage();
	GenericUtils genericUtils;

//	public static final String Title = "Testing" + RandomStringUtils.random(5, true, true);

	public EmployeeAccomplishmentStep() {

	}

	@Then("^click on again same existing accomplishment and refer employee comment$")
	public void click_on_again_same_existing_accomplishment_and_refer_employee_comment() throws Throwable {

	
		accomplishment.ClickOnMyActivityMenu();
		accomplishment.ClickOnDashboard();
		accomplishment.clickOnExistingAccomplishmentSection();

	

	}

}