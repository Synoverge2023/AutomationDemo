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

public class ManageGoal extends GenericUtils {

	public ManageGoal() {
		// TODO Auto-generated constructor stub
	}

	PropertyFileOperations locators;

	static String newgoal;
	// public WebDriver driver;

	static Logger log = LogManager.getLogger(ManageGoal.class);

	{
		locators = new PropertyFileOperations(FileNames.Huner);
		log.info("STEP: Assets Page Locators loaded into memory");
	}

	public void clickOnManageGoalModule() {
		clickOnElement(locators.getKey("Manage_Goal_Module"));
		log.info("STEP:Click on CalendarIcon Successfully" + "Manage_Goal_Module");
	}

	public void EnterDescription(String Description) {

		clickOnElement(locators.getKey("Description"));

		enterText(locators.getKey("Description"), Description);
		log.info("STEP:Enter Description successfully" + "Description");

	}

	public void enterTitle(String GoalTitle) {

		clickOnElement(locators.getKey("GoalTitle"));

		enterText(locators.getKey("GoalTitle"), GoalTitle);
		log.info("STEP:Enter Goal Title successfully" + "GoalTitle");

	}

	public void enterEmployeeUsername(String EUsername) {

		clickOnElement(locators.getKey("Username"));

		enterText(locators.getKey("Username"), EUsername);
		log.info("STEP:Enter Username successfully" + "GoalTitle");

	}

	public void clickOnCreateButton() {
		clickOnElement(locators.getKey("Create_Button"));
		log.info("STEP:Click on Create Button Successfully" + "Create_Button");
	}

	public void enterGoalTitle() {
		generateRandomGoalText(locators.getKey("GoalTitle"));

		log.info("STEP:Enter GoalTitle successfully" + "GoalTitle");

	}

	public void assertinOfGoalTitle() {

		wait(2000);

		List<WebElement> elements = getDriver().findElements(By.xpath("//tbody/tr/td[2]"));

		for (int i = elements.size() - 1; i > 0; i--) {

			System.out.println(newgoal);

			if (elements.get(i).getText().equals(newgoal)) {

				System.out.println("Goal Title verified in the table");

				log.info("STEP - Goal Title verified in the table");

				elements.get(i).click();

			}

			else {

				log.info("STEP - Goal Title not verified in the table"); //

			}

		}

	}

	public void assertinOfEmployeeGoalTitle() {

		wait(2000);

		WebElement elements = getDriver().findElement(By.xpath("//table/tbody/tr[1]/td[1]/a"));

		elements.click();

	}

	public void refreshGoalsection() {
		clickOnElement(locators.getKey("clickOnReviewSection"));
		clickOnElement(locators.getKey("clickOnGoalSection"));

	}

	public void clickOnCreatedForDropdown() {
		clickOnElement(locators.getKey("Created_Text"));

	}

	public void selectGoalDropdown() {
		keyDown(locators.getKey("Created_Text"));
		log.info("STEP:Select " + "GoalTitle");
	}

	public void clickOnCalenderIcon() {
		clickOnElement(locators.getKey("CalendarIcon"));
		log.info("STEP:Click on calender ICON successfully" + "CalendarIcon");

	}

	public void selectGoalDate() {
		clickOnElement(locators.getKey("SelectGoalDate"));
		log.info("STEP:select goal date successfully" + "SelectGoalDate");

	}

	public void clickOnGoalSaveButton() {
		clickOnElement(locators.getKey("SaveButton"));
		log.info("STEP:Click on Save Button Successfully" + "SaveButton");
	}

	public void verifyGoalSuceesMessage() {
		boolean test = isElementDisplay(locators.getKey("VerifyGoalSuccessMessage"));
		if (test) {
			log.info("STEP: " + "VerifyGoalSuccessMessage" + " is present on Create Goal screen screen");
		} else {
			log.info("STEP: " + "VerifyGoalSuccessMessage" + " is not Create Goal  screen");
		}
	}

	public String generateRandomGoalText(String locator) {
		try {
			String Title = "AutomationGoal" + RandomStringUtils.random(5, true, true);
			getWait().until(ExpectedConditions.visibilityOf(getElement(locator))).sendKeys(Keys.TAB);
			getElement(locator).sendKeys(Title);
			log.debug("STEP: " + Title + " is set inside element");
			newgoal = Title;
			return newgoal;

		} catch (Exception exe) {

			log.debug("STEP - Generte Random Text");
		}
		return null;

	}

	public void enterEmployeeComments(String Comments) {

		clickOnElement(locators.getKey("EmployeeComments"));

		enterText(locators.getKey("EmployeeComments"), Comments);
		log.info("STEP:Enter Employee comments successfully" + "EmployeeComments");

	}

	public void clickOnCompleteButton() {
		clickOnElement(locators.getKey("CompleteButton"));
		log.info("STEP:Click on Complete Button Successfully" + "CompleteButton");
	}

	public void enterSupervisiorComments(String Comments) {
		clickOnElement(locators.getKey("SupervisiorComments"));

		enterText(locators.getKey("SupervisiorComments"), Comments);
		log.info("STEP:Enter supervisior Button Successfully" + "SupervisiorComments");
	}

	public void clickOnGoalApproveButton() {
		clickOnElement(locators.getKey("ApproveButton"));
		log.info("STEP:Click on Approve Button Successfully" + "ApproveButton");
	}

	public void clickOnRejectButton() {
		clickOnElement(locators.getKey("ManageGoalRejectButton"));
		log.info("STEP:Click on Reject Button Successfully" + "ManageGoalRejectButton");
	}

	public void verifyEmployeeGoalStatus() {

		verifyText(locators.getKey("EmployeeSubmitGoalStatus"), "Submitted For Approval");
		log.info("STEP:Status should be display" + "EmployeeSubmitGoalStatus");
		EscKey();
	}

	public void verifyStatusofApproveGoal() {
		verifyText(locators.getKey("EmployeeApproveGoalStatus"), "Accomplished");
		log.info("STEP:Status should be display" + "EmployeeApproveGoalStatus");
		EscKey();
	}

	public void verifyStatusEditMessage() {
		verifyText(locators.getKey("EditGoalSuccessMessage"), "Goal edited successfully");
		log.info("STEP:Edit message Should  be display" + "EditGoalSuccessMessage");

	}

	public void verifyEmployeeRejectGoal() {
		verifyText(locators.getKey("EmployeeRejectGoalStatus"), "Rejected");
		log.info("STEP:Status should be display" + "EmployeeRejectGoalStatus");
		EscKey();
	}

	public void verifyGoalListingStatus() {

		wait(2000);

		WebElement ele = getDriver().findElement(By.xpath(" //*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'"
				+ newgoal + "')]/following-sibling::td[contains(.,'Goal Created')]"));

		System.out.println("Title verified in the table");

	}

	public void verifyGoalListingActiveStatus() {

		wait(2000);

		WebElement ele = getDriver().findElement(By.xpath(" //*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'"
				+ newgoal + "')]/following-sibling::td[contains(.,'Active')]"));

		System.out.println("Goal Active Status value is verified " + ele);
		// ele.click();

	}

	public void verifyAccomplishedsupervisiorstatus() {

		wait(2000);

		WebElement ele = getDriver().findElement(By.xpath(" //*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'"
				+ newgoal + "')]/following-sibling::td[contains(.,'Accomplished')]"));

		System.out.println("Supervisior goal  Status value is verified " + ele);
		// ele.click();

	}

	public void verifyRejectedsupervisiorstatus() {

		wait(2000);

		WebElement ele = getDriver().findElement(By.xpath(" //*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'"
				+ newgoal + "')]/following-sibling::td[contains(.,'Rejected')]"));

		System.out.println("Supervisior reject goal  Status value is verified " + ele);
		// ele.click();

	}

	public void clickOnEmployeeGoalReview() {

		wait(2000);

		List<WebElement> ele = getDriver().findElements(
				By.xpath("//*[@id=\"no-more-tables\"]/table/tbody/tr[1]/td[contains(.,'" + newgoal + "')]/a"));

		for (int i = 0; i < ele.size(); i++) {

			// System.out.println(elements.get(i).getText()); //

			System.out.println(newgoal);

			if (ele.get(i).getText().equals(newgoal)) {

				System.out.println("Title verified in the table");

				log.info("STEP - Title verified in the table");

				ele.get(i).click();

			}

			else {

				log.info("STEP - Title not verified in the table"); //

			}

		}

	}

	public void clickOnEmployeeGoalReviewWithSU() {

		wait(2000);

		List<WebElement> ele = getDriver().findElements(
				By.xpath("//*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'" + newgoal + "')]/a"));

		for (int i = 0; i < ele.size(); i++) {

			System.out.println(newgoal);

			if (ele.get(i).getText().equals(newgoal)) {

				System.out.println("Goal verified in the table");

				log.info("STEP - Goal verified in the table");

				wait(5000);

				ele.get(i).click();

			}

			else {

				log.info("STEP - Title not verified in the table"); //

			}

		}

	}

	public void verifyGoalApproveMessage() {

		verifyText(locators.getKey("ApproveGoalMessage"), "Goal Accomplished successfully.");
		log.info("STEP:Approve message should be display" + "ApproveGoalMessage");
		EscKey();
	}

	public void verifyEmployeeApproveGoalStatus() {

		verifyText(locators.getKey("EmployeeApproveGoalStatus"), "Accomplished");
		log.info("STEP:Status should be display" + "EmployeeApproveGoalStatus");
		EscKey();
	}

	public void clickOnGoalEditButton() {

		wait(2000);

		WebElement ele = getDriver()
				.findElement(By.xpath(" //*[@id=\"no-more-tables\"]/table/tbody/tr[1]/td[contains(.,'" + newgoal
						+ "')]//preceding::td[1]/a/i"));

		System.out.println("Edit Goal Successfully");
		ele.click();

	}

	public void clickOnActiveCheckBox() {
		// WebElement ele =
		// getDriver().findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/goal-entry/div/div/kt-portlet/div/kt-portlet-body/form/div/div[5]/label/span"));
		// *[@id="IsActive"]
		WebElement ele = getDriver().findElement(By.cssSelector("#IsActive"));

		ele.click();
		wait(15000);
		// SpaceKey();
		// clickOnElement(locators.getKey("ActiveCheckBox"));
		log.info("STEP:Click on Active Checkbox Successfully" + "ActiveCheckBox");

	}

	public void verifyInActiveStatus() {

		wait(2000);

		WebElement ele = getDriver().findElement(By.xpath(" //*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'"
				+ newgoal + "')]/following-sibling::td[contains(.,'In Active')]"));

		System.out.println("Goal Inactive  Status value is verified " + ele);

	}

	public void verifyInactiveGoalVisibility() {

		WebElement ele = getDriver()
				.findElement(By.xpath(" //*[@id=\"no-more-tables\"]/table/tbody/tr[1]/td[contains(.,'" + newgoal
						+ "')]/preceding::td[1]/a/i"));

		if (ele.getText().equals(newgoal)) {

			System.out.println("Title verified in the table");

			log.info("STEP - Title verified in the table");

		} else {

			log.info("STEP - Title not verified in the table"); //

		}

	}
}