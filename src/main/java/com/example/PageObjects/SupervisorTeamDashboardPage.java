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

public class SupervisorTeamDashboardPage extends GenericUtils {

	public SupervisorTeamDashboardPage() {
		// TODO Auto-generated constructor stub
	}

	PropertyFileOperations locators;
	// public WebDriver driver;

	static Logger log = LogManager.getLogger(SupervisorTeamDashboardPage.class);
	static String finaltitle;
	static String finalgoaltitle;
	static String finalSupervisorComment;
	static String EmpFeedback;
	static String newtitle;

	{
		locators = new PropertyFileOperations(FileNames.Huner);
		log.info("STEP: Assets Page Locators loaded into memory");
	}

	public void userIsOnLoginUpPage() {
		boolean test = isElementDisplay(locators.getKey("Login_Button"));
		if (test) {
			log.info("STEP: " + "Login_Button" + " is present on Login screen screen");
		} else {
			log.info("STEP: " + "Login_Button" + " is not present on Login screen");
		}
	}

	public void LoginWithPasswordbutton() {
		clickOnElement(locators.getKey("LoginWithPassword_button"));
		log.info("STEP:Click on Login With Password Successfully" + "LoginWithPassword_button");
	}

	public void enterUsername(String Username) {

		clickOnElement(locators.getKey("Mobile_input"));
		// clickonElementJavaScript(locators.getKey("Mobile_input"));

		enterText(locators.getKey("Username"), Username);
		log.info("STEP:Enter User name successfully" + "Username");

	}

	public void enterPassword(String Password) {

		enterText(locators.getKey("Password"), Password);
		log.info("STEP:Enter password successfully" + "Password");
	}

	public void clickOnSignInButton() {
		clickOnElement(locators.getKey("Login_Button"));
		log.info("STEP:Click on Login button Successfully" + "Login_Button");
	}

	public void ClickOnDashboard() {
		verifyVisibility(locators.getKey("ClickOnDashboard"));
		clickOnElement(locators.getKey("ClickOnDashboard"));
		log.info("STEP:Click on Dashboard Successfully" + "ClickOnDashboard");
	}

	public void ClickOnTeamDashboard() {
		verifyVisibility(locators.getKey("ClickOnTeamMenu"));
		clickOnElement(locators.getKey("ClickOnTeamMenu"));
		log.info("STEP:Click on TEam Dashboard Successfully" + "ClickOnTeamMenu");
	}

	public void clickOnAddaccomplishmentButton() {
		verifyVisibility(locators.getKey("Add_Accomplishment"));
		clickOnElement(locators.getKey("Add_Accomplishment"));
		log.info("STEP:Click on Accomplishment Successfully" + "Add_Accomplishment");
	}

	public void clickOnCalendarIcon() {
		clickOnElement(locators.getKey("CalendarIcon"));
		log.info("STEP:Click on CalendarIcon Successfully" + "CalendarIcon");
		actionEnter();
	}

	public void VerifyPageTitle() {
		boolean test = isElementDisplay(locators.getKey("VerifyTitle"));
		if (test) {
			log.info("STEP: " + "VerifyTitle" + " is present on Accomplishment screen screen");
		} else {
			log.info("STEP: " + "VerifyTitle" + " is not Accomplishment  screen");
		}
	}

	public void VerifyAddComplishButton() {
		verifyVisibility(locators.getKey("Add_Accomplishment"));
		clickOnElement(locators.getKey("Add_Accomplishment"));
		log.info("STEP:Click on Accomplishment Successfully" + "Add_Accomplishment");
	}

	public void VerifyIvisibilityAddComplishButton() {
		verifyInvisibility(locators.getKey("Add_Accomplishment"));
		// clickOnElement(locators.getKey("Add_Accomplishment"));
		log.info("STEP:Add Accomplishment Successfully not visibled" + "Add_Accomplishment");
	}

	public void VerifyIvisibilityAddCommentButton() {
		verifyInvisibility(locators.getKey("ClickOnAddComment"));
		EscKey();
		// clickOnElement(locators.getKey("Add_Accomplishment"));
		log.info("STEP:Add ClickOnAddComment Successfully not visibled" + "ClickOnAddComment");
	}

	public void clickOnEyeIconViewofEmployee() {
		verifyVisibility(locators.getKey("clickOnEyeIconViewofEmployee"));
		clickOnElement(locators.getKey("clickOnEyeIconViewofEmployee"));
		log.info("STEP:Click on clickOnEyeIconViewofEmployee Successfully" + "clickOnEyeIconViewofEmployee");
	}

	public void clickOnEyeIconViewofEmployeeTwo() {
		verifyVisibility(locators.getKey("clickOnEyeIconViewofEmployeeTwo"));
		clickOnElement(locators.getKey("clickOnEyeIconViewofEmployeeTwo"));
		log.info("STEP:Click on clickOnEyeIconViewofEmployeeTwo Successfully" + "clickOnEyeIconViewofEmployeeTwo");
	}

	public void SelectDate() {
		clickOnElement(locators.getKey("DateSelect"));
		log.info("STEP:Click on CalendarIcon Successfully" + "DateSelect");
	}

	public void enterTitle() {

		// clickOnElement(locators.getKey("Title"));
		generateRandomAccomplishmentText(locators.getKey("Title"));
		// generateRandomText(locators.getKey("Title"));

// 	    enterText(locators.getKey("Title"), Title);
		log.info("STEP:Enter Title successfully" + "Title");

	}

	public void assertionTitle() {

	}

	public void enterDescription(String Description) {

		// clickOnElement(locators.getKey("Description"));

		enterText(locators.getKey("Description"), Description);
		log.info("STEP:Enter Description successfully" + "Description");

	}

	public void clickOnSaveButton() {
		scrollUp150();
		clickOnElement(locators.getKey("SaveButton"));
		log.info("STEP:Click on SaveButton Successfully" + "SaveButton");
	}

	public void clickOnAddCommentButton() {
		clickOnElement(locators.getKey("ClickOnAddComment"));
		log.info("STEP:Click on AddComment Successfully" + "ClickOnAddComment");
	}

	public void clickOnSaveCommentButton() {

		clickOnElement(locators.getKey("SaveComment"));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// clickonElementJavaScript(locators.getKey("SaveComment"));
		// clickOnElementWithJS(locators.getKey("SaveComment"));

		log.info("STEP:Click on AddComment Successfully" + "SaveComment");
	}

	public void VerifySuccessMessage() {
		boolean test = isElementDisplay(locators.getKey("Verify_Message"));
		if (test) {
			log.info("STEP: " + "Verify_Message" + " is present on Accomplishment screen screen");
		} else {
			log.info("STEP: " + "Verify_Message" + " is not Accomplishment  screen");
		}
	}

	public void clickOnPendingActivityModule() {
		clickOnElement(locators.getKey("Pending_Activity"));
		log.info("STEP:Click on Pending module Successfully" + "Pending_Activity");

	}

	public void clickOnEmployeeDashboardModule() {
		clickOnElement(locators.getKey("ClickOnEmployeeDashboardMenu"));
		log.info("STEP:ClickOnEmployeeDashboardMenu module Successfully" + "ClickOnEmployeeDashboardMenu");

	}

	public void EnterEmployeeForSearchAndClickSearchButton() {
		clickOnElement(locators.getKey("SearchPanleofEmployeeDashboard"));
		clickOnElement(locators.getKey("EnterUserSearch"));
		log.info("STEP:ClickUserSearch Successfully" + "EnterUserSearch");
		enterText(locators.getKey("EnterUserSearch"), "employeetwo@yopmail.com");
		clickOnElement(locators.getKey("ClickOnSearchEmployee"));
		log.info("STEP:Click OnSearch Employee Successfully" + "ClickOnSearchEmployee");

	}

	public void clickOnExistingAccomplishment() {
		clickOnElement(locators.getKey("ClickOnExistingAccomplishmentDashboard"));
		log.info("STEP:Click on Pending module Successfully" + "ClickOnExistingAccomplishmentDashboard");

	}

	public void verifyAddedSupervisorComment() {
		// clickOnElement(locators.getKey("ClickOnComment"));
		verifyVisibility(locators.getKey("VerifyComment"));
		log.info("STEP:Verifed element Successfully" + "VerifyComment");

	}

	public void assertinOfExistingAccomplishment() {

		assertinOfTitle();
		pageRefresh();

	}

	public void clickOnRequestFeedbackCheckbox() {
		clickOnElement(locators.getKey("ClickRequestFeedbackCheckbox"));
		log.info("STEP:Click on Request FeedbackCheckbox Successfully" + "ClickRequestFeedbackCheckbox");

	}

	public void assertinOfApproveAccomplishementMessage() {
		verifyText(locators.getKey("VerifyApproveAccomplishmentMessage"), "Feedback Request updated successfully");
		log.info("STEP:Click on Approve accomplishment Successfully and also message is displayed"
				+ "VerifyApproveAccomplishmentMessage");
	}

	public String generateRandomAccomplishmentText(String locator) {
		try {
			String Title = "HunerNew" + RandomStringUtils.random(5, true, true);
			getWait().until(ExpectedConditions.visibilityOf(getElement(locator))).sendKeys(Keys.TAB);
			getElement(locator).sendKeys(Title);
			log.debug("STEP: " + Title + " is set inside element");
			newtitle = Title;
			return newtitle;

		} catch (Exception exe) {

			log.debug("STEP - Generte Random Text");
		}
		return null;

	}

	public void assertinOfTitle() {

		wait(2000);

		List<WebElement> elements = getDriver()
				.findElements(By.xpath("//*[@id='no-more-tables']/table//tbody//tr//td[6]"));

		for (int i = elements.size() - 1; i > 0; i--) {

			// System.out.println(elements.get(i).getText()); //

			System.out.println(newtitle);

			if (elements.get(i).getText().equals(newtitle)) {

				System.out.println("Title verified in the table");

				log.info("STEP - Title verified in the table");

				elements.get(i).click();

			}

			else {

				log.info("STEP - Title not verified in the table"); //

			}
		}
	}

	public void assertinOfTeamDashboardTitle() {

		wait(2000);

		List<WebElement> elements = getDriver()
				.findElements(By.xpath("//*[@id='no-more-tables']/table//tbody//tr//td[6]"));

		for (int i = elements.size() - 1; i > 0; i--) {

			// System.out.println(elements.get(i).getText()); //

			System.out.println(newtitle);

			if (elements.get(i).getText().equals(newtitle)) {

				System.out.println("Title verified in the table");

				log.info("STEP - Title verified in the table");

				elements.get(i).click();

			}

			else {

				log.info("STEP - Title not verified in the table"); //

			}
		}
	}

	public void clickOnApproval() {

		wait(2000);

		// WebElement ele =
		// getDriver().findElement(By.xpath("//*[@id='no-more-tables']/table//tbody//tr//td[contains(text(),"+finaltitle+")]//preceding::td[5]/a[1]/i[1]"));

		WebElement ele = getDriver().findElement(By.xpath(
				" //*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'" + newtitle + "')]/preceding::td[5]"));
		System.out.println("final xpath value is " + ele);
		ele.click();

	}

	public void clickOnRejectAcomplishment() {

		wait(2000);

		// WebElement ele =
		// getDriver().findElement(By.xpath("//*[@id='no-more-tables']/table//tbody//tr//td[contains(text(),"+finaltitle+")]//preceding::td[5]/a[1]/i[1]"));

		WebElement ele = getDriver().findElement(By.xpath(
				" //*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'" + newtitle + "')]/preceding::td[4]"));
		System.out.println("final xpath value is " + ele);
		ele.click();

	}

	public void scrollTillSaveButton() {
		scrollTillElementDisplay(locators.getKey("SaveButton"));
		// System.out.println(finaltitle);
		log.info("STEP:Verifed element Successfully" + "SaveButton");

	}

	public String generateRandomGoalTitle(String locator) {

		try {

			String GoalTitle = "QAAutomatedGoal" + RandomStringUtils.random(5, true, true);

			getWait().until(ExpectedConditions.visibilityOf(getElement(locator))).sendKeys(Keys.TAB);

			getElement(locator).sendKeys(GoalTitle);

			log.debug("STEP: " + GoalTitle + " is set inside element");
			finalgoaltitle = GoalTitle;
			return finalgoaltitle;

		}

		catch (Exception exe) {

			log.debug("STEP - Generte Random Text");
		}

		return null;
	}

	public void enterSupevisorComment(String Description) {

		// clickOnElement(locators.getKey("Description"));

		enterText(locators.getKey("SupervisorComment"), Description);
		log.info("STEP:Enter Description successfully" + "Description");

	}

	public void VerifySuccessMessageonRejectAccomplishment() {
		boolean test = isElementDisplay(locators.getKey("Verify_Message_Reject"));
		if (test) {
			log.info("STEP: " + "Verify_Message_Reject" + " is rejected from Accomplishment screen ");
		} else {
			log.info("STEP: " + "Verify_Message_Reject" + " is not rejected from  Accomplishment screen");
		}
	}

	public void enterEmpname(String empname) {

		clickOnElement(locators.getKey("EnterSearchEmployee"));
		// clickonElementJavaScript(locators.getKey("Mobile_input"));

		enterText(locators.getKey("EnterSearchEmployee"), empname);
		log.info("STEP:Enter EMP name successfully" + "empname");

	}

	public void clickOnEmployeeSearchButton() {
		clickOnElement(locators.getKey("ClickOnSearchEmployee"));
		log.info("STEP:Click on Search employee Successfully" + "ClickOnSearchEmployee");

	}

	public void SelectExistingEmployee() {
		clickOnElement(locators.getKey("SelectFirstEmployee"));
		log.info("STEP:Click on first employee Successfully" + "SelectFirstEmployee");

	}

	public void clickOnSOSignoutButton() {
		clickOnElement(locators.getKey("ClickOnSOProfile"));
		clickOnElement(locators.getKey("ClickOnSignout"));

		log.info("STEP:Click on Signout Successfully" + "ClickOnSignout");

	}

	public void ClickOnMyActivityMenu() {
		verifyVisibility(locators.getKey("ClickOnMyActivityMenu"));
		clickOnElement(locators.getKey("ClickOnMyActivityMenu"));
		log.info("STEP:Click on MyActivityMenu Successfully" + "ClickOnMyActivityMenu");
	}

	public void enterEmployeeFeedbackTitle() {

		generateRandomEmployeeFeedback(locators.getKey("EnterFeedbacks"));
//   	    enterText(locators.getKey("Title"), Title);
		log.info("STEP:Enter Title successfully" + "EnterFeedbacks");

	}

	public String generateRandomEmployeeFeedback(String locator) {
		try {
			String Title = "AutomatedEmpFeedback" + RandomStringUtils.random(5, true, true);
			getWait().until(ExpectedConditions.visibilityOf(getElement(locator))).sendKeys(Keys.TAB);
			getElement(locator).sendKeys(Title);
			log.debug("STEP: " + Title + " is set inside element");
			EmpFeedback = Title;
			return EmpFeedback;

		} catch (Exception exe) {

			log.debug("STEP - Generte Random Employee feedback Text");
		}
		return null;

	}

	public void clickOnSendFeedbackButton() {
		clickOnElement(locators.getKey("ClickOnSendFeedbackButton"));
		log.info("STEP:Click On Send FeedbackButton Successfully" + "ClickOnSendFeedbackButton");
	}

	public void VerifySuccessMessageonOnSendFeedbacks() {
		boolean test = isElementDisplay(locators.getKey("VerifyMessageOnSendFeedback"));
		if (test) {
			log.info("STEP: " + "VerifyMessageOnSendFeedback" + " is sent on feedback ");
		} else {
			log.info("STEP: " + "VerifyMessageOnSendFeedback" + " is not sent on feedback");
		}
	}

	public void clickOnEOSignoutButton() {
		clickOnElement(locators.getKey("ClickOnEOProfile"));
		clickOnElement(locators.getKey("ClickOnSignout"));

		log.info("STEP:Click on Signout Successfully" + "ClickOnSignout");

	}

	public void AssertAndClickMyPendingActivities() {

		wait(2000);

		List<WebElement> elements = getDriver()
				.findElements(By.xpath("//button[normalize-space()='Add Feedback']/preceding::td[2]"));

		for (int i = elements.size() - 1; i > 0; i--) {

			// System.out.println(elements.get(i).getText()); //

			System.out.println("Hiren" + newtitle);

			if (elements.get(i).getText().equals(newtitle)) {

				System.out.println("Title verified in the table");

				log.info("STEP - Title verified in the table");

				elements.get(i).click();

			}

			else {

				log.info("STEP - Title not verified in the table"); //

			}
		}
	}

	public void clickOnApprovalFeedbacks() throws InterruptedException {

		wait(2000);

		// WebElement ele
		// =getDriver().findElement(By.xpath("//*[@id='no-more-tables']/table//tbody//tr//td[contains(text(),"+finaltitle+")]//preceding::td[5]/a[1]/i[1]"));

		// " //*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'" + finaltitle +
		// "')]/preceding::td[5]"));

		// WebElement ele =
		// getDriver().findElement(By.xpath("//tbody/tr/td[contains(text(),'" +
		// finaltitle + "')]//following::td[2]/button"));
		System.out.println("Timir    " + newtitle);

		WebElement ele = getDriver()
				.findElement(By.xpath("//tbody/tr/td[contains(text(),'" + newtitle + "')]//following::td[2]/button"));

		System.out.println("Timir2" + ele);

		/*
		 * WebElement ele = getDriver().findElement(By.xpath(
		 * "//tbody/tr/td[contains(text(),'QAAutomationcIZdP')]//following::td[2]/button"
		 * ));
		 */
		Thread.sleep(8000);

		// button[normalize-space()='Add Feedback']/preceding::td[contains(.,'" +
		// finaltitle + "')]
		System.out.println("final xpath value is " + ele);
		ele.click();

	}
}
