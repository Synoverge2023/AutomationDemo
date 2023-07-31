package com.example.PageObjects;

//import com.example.StepDefinitions.clickonElementJavaScript;
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

public class EmployeeAccomplishmentPage extends GenericUtils {

	public EmployeeAccomplishmentPage() {
		// TODO Auto-generated constructor stub
	}

	PropertyFileOperations locators;
	// public WebDriver driver;

	static Logger log = LogManager.getLogger(EmployeeAccomplishmentPage.class);

	{
		locators = new PropertyFileOperations(FileNames.Huner);
		log.info("STEP: Assets Page Locators loaded into memory");
	}

}
