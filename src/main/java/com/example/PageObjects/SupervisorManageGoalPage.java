package com.example.PageObjects;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import cucumber.app.enums.FileNames;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SupervisorManageGoalPage extends GenericUtils {

	public SupervisorManageGoalPage() {
		// TODO Auto-generated constructor stub
	}

	PropertyFileOperations locators;

	static String newgoal;
	// public WebDriver driver;

	static Logger log = LogManager.getLogger(SupervisorManageGoalPage.class);

	{
		locators = new PropertyFileOperations(FileNames.Huner);
		log.info("STEP: Assets Page Locators loaded into memory");
	}

	public void selectSupervisorDropdown(String selectSupervisor) {
		selectDropDown(locators.getKey("Created_Text"), selectSupervisor);
		log.info("STEP:Click on selectEmployee  Successfully" + "Created_Text");
	}

	public void clickOnSuperUserSignoutButton() {
		clickOnElement(locators.getKey("ClickOnSUProfile"));
		clickOnElement(locators.getKey("ClickOnSignout"));

		log.info("STEP:Click on Signout Successfully" + "ClickOnSUProfile");

	}

}