package com.example.PageObjects;

import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;
import cucumber.app.enums.FileNames;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ManageGoalPage extends GenericUtils {

	public ManageGoalPage() {
		// TODO Auto-generated constructor stub
	}

	PropertyFileOperations locators;
	// public WebDriver driver;

	static Logger log = LogManager.getLogger(ManageGoalPage.class);

	{
		locators = new PropertyFileOperations(FileNames.Huner);
		log.info("STEP: Assets Page Locators loaded into memory");
	}

	public void clickOnManageGoalModule() {
		clickOnElement(locators.getKey("Manage_Goal_Module"));
		log.info("STEP:Click on Manage goal module Successfully" + "Manage_Goal_Module");
	}

}
