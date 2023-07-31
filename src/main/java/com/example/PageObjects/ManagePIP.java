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

public class ManagePIP extends GenericUtils {

	public ManagePIP() {
		// TODO Auto-generated constructor stub
	}

	PropertyFileOperations locators;
	// public WebDriver driver;

	static Logger log = LogManager.getLogger(ManagePIP.class);
	static String FinalPIP;
	static String FinalPIPImprovement;

	{
		locators = new PropertyFileOperations(FileNames.Huner);
		log.info("STEP: Assets Page Locators loaded into memory");
	}

	public void clickOnManagePIPModule() {
		clickOnElement(locators.getKey("Manage_PIP_Module"));
		log.info("STEP:Click on Manage_PIP_Module Successfully" + "Manage_PIP_Module");
	}

	public void enterTitle(String GoalTitle) {

		clickOnElement(locators.getKey("GoalTitle"));
		// clickonElementJavaScript(locators.getKey("Mobile_input"));

		enterText(locators.getKey("GoalTitle"), GoalTitle);
		log.info("STEP:Enter Goal Title successfully" + "GoalTitle");

	}

	public void clickOnCreateButton() {
		clickOnElement(locators.getKey("Create_PIP_Button"));
		log.info("STEP:Click on Create Button Successfully" + "Create_PIP_Button");
	}

	public void selectEmployee(String selectEmployee) {
		selectDropDown(locators.getKey("SelectEmployee"), selectEmployee);
		log.info("STEP:Click on selectEmployee  Successfully" + "selectEmployee");
	}

	public void SelectCreateGoalEmployee(String selectEmployee) {
		selectDropDown(locators.getKey("Created_Text"), selectEmployee);
		log.info("STEP:Click on selectEmployee  Successfully" + "selectEmployee");
	}

	public void SelectMonth(String SelectMonth) {
		clickOnElement(locators.getKey("ClickOnPlanDateIcon"));

		selectDropDown(locators.getKey("SelectMonth"), SelectMonth);
		clickOnElement(locators.getKey("SelectDate"));

		log.info("STEP:Click on SelectMonth Successfully" + "SelectMonth");

	}

	public void SelectGoalMonth(String SelectMonth) {
		clickOnElement(locators.getKey("CalendarIcon"));

		selectDropDown(locators.getKey("SelectMonth"), SelectMonth);
		clickOnElement(locators.getKey("SelectDate"));

		log.info("STEP:Click on SelectMonth Successfully" + "SelectMonth");

	}

	public String generateRandomPIPIssueTitle(String locator) {
		try {
			String PIP = "PIPAutomation" + RandomStringUtils.random(5, true, true);
			getWait().until(ExpectedConditions.visibilityOf(getElement(locator))).sendKeys(Keys.TAB);
			getElement(locator).sendKeys(PIP);
			log.debug("STEP: " + PIP + " is set inside element");
			FinalPIP = PIP;
			return FinalPIP;

		} catch (Exception exe) {

			log.debug("STEP - Generte Random Text");
		}
		return null;

	}

	public void enterIssueTitle() {

	
		generateRandomPIPIssueTitle(locators.getKey("EnterIssueTitle"));
	
		log.info("STEP:Enter EnterIssueTitle successfully" + "EnterIssueTitle");

	}

	public void enterIssueDescription(String Description) {


		enterText(locators.getKey("EnterIssueDescription"), Description);
		log.info("STEP:Enter Goal Title successfully" + "Description");

	}

	public void enterPIADescription(String PIADescription) {

		
		enterText(locators.getKey("EnterPIADescription"), PIADescription);
		log.info("STEP:Enter Goal Title successfully" + "PIADescription");

	}

	public void clickOnDownArrowKey() {
		scrollDown150();
		clickOnElement(locators.getKey("ClickOnDownArrowkey"));
		scrollDown150();
		log.info("STEP:Click on ClickOnDownArrowkey Successfully" + "ClickOnDownArrowkey");
	}

	public String generateRandomPIPImprovementTitle(String locator) {
		try {
			String PIPImprovement = "PIPImprovement" + RandomStringUtils.random(5, true, true);
			getWait().until(ExpectedConditions.visibilityOf(getElement(locator))).sendKeys(Keys.TAB);
			getElement(locator).sendKeys(PIPImprovement);
			log.debug("STEP: " + PIPImprovement + " is set inside element");
			FinalPIPImprovement = PIPImprovement;
			return FinalPIPImprovement;

		} catch (Exception exe) {

			log.debug("STEP - Generte Random Text");
		}
		return null;

	}

	public void enterPIPImprovementTitle() {

	
		generateRandomPIPImprovementTitle(locators.getKey("PerformanceImprovementActionTitle"));



		log.info("STEP:Enter EnterIssueTitle successfully" + "EnterIssueTitle");

	}

	public void UserenterTimeFrame(String TimeFrame) {

	
		enterText(locators.getKey("EnterTimeFrame"), TimeFrame);
		log.info("STEP:Enter TimeFrame successfully" + "TimeFrame");

	}

	public void clickOnSaveButton() {
		scrollUp150();
		scrollUp150();
		scrollUp150();
		scrollUp150();
		clickOnElement(locators.getKey("SaveButton"));
		log.info("STEP:Click on SaveButton Successfully" + "SaveButton");
	}

	public void assertionofStautofIssueTitle() {
		wait(2000);
		List<WebElement> ele = getDriver()
				.findElements(By.xpath("//*[@id=\"no-more-tables\"]/table/tbody/tr[3]/td[contains(.,'" + FinalPIP
						+ "')]/following-sibling::td[contains(.,'Initiated')]"));
		System.out.println("assertionofStautofIssueTitle  Status value is verified " + ele);

		for (int i = ele.size() - 1; i > 0; i--) {

	

			System.out.println(FinalPIP);

			if (ele.get(i).getText().equals(FinalPIP)) {

				System.out.println("Title verified in the table");

				log.info("STEP - Title verified in the table");


			}

			else {

				log.info("STEP - Title not verified in the table"); //

			}

		}

	}

	public void enterOrgUsername(String OrgUsername) {

		enterText(locators.getKey("Username"), OrgUsername);
		log.info("STEP:Enter User name successfully" + "OrgUsername");

	}

	public void enterEOUsername(String EMPuser) {

		enterText(locators.getKey("Username"), EMPuser);
		log.info("STEP:Enter User name successfully" + "EMPuser");

	}

	public void clickOnPending_Activities() {
		clickOnElement(locators.getKey("Pending_Activities"));
		log.info("STEP:Click on Pending_Activities Successfully" + "Pending_Activities");
	}

	public void clickOnIssueTitleOnPending_Activities() {

		wait(2000);

		List<WebElement> Taskelements = getDriver().findElements(
				By.xpath("//*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'" + FinalPIP + "')]/a"));

		for (int i = 0; i < Taskelements.size(); i++) {
	
			System.out.println("Test" + FinalPIP);

			if (Taskelements.get(i).getText().equals(FinalPIP)) {

				System.out.println("FinalPIP verified in the table");

				log.info("STEP - FinalPIP verified in the table");

				Taskelements.get(i).click();

			}

			else {

				log.info("STEP - Title not verified in the table"); //

			}

		}

	}

	public void ClickOnApproveIssueTitle() {
		clickOnElement(locators.getKey("ClickOnApproveIssueTitle"));
		log.info("STEP:Click on ClickOnApproveIssueTitle Successfully" + "ClickOnApproveIssueTitle");
	}

	public void ClickOnRejectIssueTitle() {
		clickOnElement(locators.getKey("ClickOnRejectIssueTitle"));
		log.info("STEP:Click on ClickOnRejectIssueTitle Successfully" + "ClickOnRejectIssueTitle");
	}

	public void clickOnOrgSignoutButton() {
		clickOnElement(locators.getKey("ClickOnOAProfile"));
		clickOnElement(locators.getKey("ClickOnSignout"));

		log.info("STEP:Click on Signout Successfully" + "ClickOnOAProfile");

	}

	public void clickOnPIPSection() {
		clickOnElement(locators.getKey("ClickOnArrowKey"));
		clickOnElement(locators.getKey("ClickOnArrowKey"));
		clickOnElement(locators.getKey("ClickOnPIPSection"));
		// clickOnElement(locators.getKey("ClickonTable"));
		// scrollDown250();
		log.info("STEP:Click on Signout Successfully" + "ClickOnArrowKey");

	}

	public void clickOnPIPTitle() {

		// wait(2000);

		/*
		 * List<WebElement> PIPTitle =getDriver().findElements(By.xpath(
		 * "//*[@id=\"mat-tab-content-1-2\"]/div/div/div/div/div/div/div/table/tbody/tr/td[contains(.,'"
		 * + FinalPIP + "')]/following::td[1]/div/a/i"));
		 * System.out.println("assertionofStautofIssueTitle  Status value is verified "
		 * + FinalPIP);
		 * 
		 * for (int i = PIPTitle.size() - 1; i > 0; i--) {
		 * 
		 * // System.out.println(elements.get(i).getText()); //
		 * 
		 * System.out.println(FinalPIP);
		 * 
		 * if (PIPTitle.get(i).getText().equals(FinalPIP)) {
		 * 
		 * System.out.println("Title verified in the table");
		 * 
		 * log.info("STEP - Title verified in the table");
		 * 
		 * PIPTitle.get(i).click();
		 * 
		 * }
		 * 
		 * else {
		 * 
		 * log.info("STEP - Title not verified in the table"); //
		 * 
		 * }
		 * 
		 * }
		 */
		clickOnElement(locators.getKey("ClickOnPipTitle"));
	}

	public void assertionofNotStartedStatus() {
		wait(2000);
		scrollDown150();
		WebElement ele = getDriver().findElement(By.xpath("//*[@id=\"mat-expansion-header-0\"]"));
		ele.click();
		scrollDown150();
		WebElement status = getDriver().findElement(By.xpath(
				"//*[@id=\"cdk-accordion-child-0\"]/div/div/div/div[3]/div[2]//label[normalize-space()='Not started']"));
		System.out.println("assertionofStautofIssueTitle  Status value is verified " + status);

	}

	public void assertionofInProgressStatus() {
		wait(2000);
		scrollDown150();
		// WebElement ele =
		// getDriver().findElement(By.xpath("//*[@id=\"mat-dialog-6\"]/pipa/div/div/kt-portlet/div/kt-portlet-body/kt-portlet/div/kt-portlet-body/mat-accordion/mat-expansion-panel"));
		// ele.click();
		WebElement status = getDriver().findElement(By.xpath(
				"//*[@id=\"cdk-accordion-child-3\"]/div/div/div/div[3]/div[2]/label[normalize-space()='In Progress']"));
		System.out.println("assertionofStautofIssueTitle  Status value is verified " + status);

	}

	public void clickOnStartButton() {
		scrollUp150();
		clickOnElement(locators.getKey("StartButton"));
		// wait(15000);
		// EscKey();

		// onPageRefresh();

		/*
		 * WebElement eles = getDriver().findElement(By.xpath(
		 * "//*[@id=\"mat-expansion-panel-header-1\"]/span[1]")); eles.click();
		 * wait(15000); clickOnElement(locators.getKey("Startnexttimebutton"));
		 * WebElement ele = getDriver().findElement(By.xpath(
		 * "//*[@id=\"mat-expansion-panel-header-2\"]/span[1]")); ele.click();
		 * wait(15000); scrollDown150();
		 */
		log.info("STEP:Click on StartButton Successfully" + "StartButton");

	}

	public void enterPIPcomment(String EnterPIPComment) {
		scrollDown150();

		clickOnElement(locators.getKey("EnterPIPComment"));
		// clickonElementJavaScript(locators.getKey("Mobile_input"));

		enterText(locators.getKey("EnterPIPComment"), EnterPIPComment);
		log.info("STEP:Enter EnterPIPComment  successfully" + "EnterPIPComment");
		wait(100);

	}

	public void clickOnCompleteButton() {
		scrollUp150();
		clickOnElement(locators.getKey("Complete_PIP_Button"));
		EscKey();
		log.info("STEP:Click on CompleteButton Successfully" + "Complete_PIP_Button");

	}

	public void ClickOnPerformanceImprovementPlanActions() {

		wait(2000);

		List<WebElement> IssueTitle = getDriver().findElements(
				By.xpath("//*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'" + FinalPIP + "')]"));
		for (int i = 0; i < IssueTitle.size(); i++) {
			System.out.println(FinalPIP);

			if (IssueTitle.get(i).getText().equals(FinalPIP)) {

				System.out.println("FinalPIP verified in the table");

				log.info("STEP - FinalPIP verified in the table");

				IssueTitle.get(i).click();

			} else {

				log.info("STEP - Title not verified in the table"); //

			}

		}

	}

	public void assertionofCompletedStatus() {
		wait(2000);
		scrollDown150();
		WebElement scroll = getDriver().findElement(By.xpath("//*[@id=\"mat-expansion-header-0\"]"));
		scroll.click();
		WebElement status = getDriver().findElement(By.xpath(
				"//*[@id=\"cdk-accordion-child-0\"]/div/div/div/div[4]/div[3]/label[normalize-space()='Completed']"));
		System.out.println("assertionofStautofIssueTitle  Status value is verified " + status);

	}

	public void clickRejectLink() {
		clickOnElement(locators.getKey("ClickOnRejectAnchorLink"));
		log.info("STEP:Click on ClickOnRejectAnchorLink Successfully" + "ClickOnRejectAnchorLink");

	}

	public void clickApproveLink() {
		clickOnElement(locators.getKey("ClickOnApproveAnchorLink"));
		log.info("STEP:Click on ClickOnApproveAnchorLink Successfully" + "ClickOnApproveAnchorLink");

	}

	public void assertionofIssueOnDashboardWithOrg() {
		wait(2000);
		List<WebElement> IssueTitle = getDriver().findElements(
				By.xpath("//*[@id=\"no-more-tables\"]/table/tbody/tr/td[contains(.,'" + FinalPIP + "')]/a"));
		for (int i = 0; i < IssueTitle.size(); i++) {
			System.out.println(FinalPIP);

			if (IssueTitle.get(i).getText().equals(FinalPIP)) {

				System.out.println("FinalPIP verified in the table");

				log.info("STEP - FinalPIP verified in the table");

				IssueTitle.get(i).click();

			} else {

				log.info("STEP - Title not verified in the table"); //

			}

		}

	}

	public void assertionofStautofIssueReviewed() {
		wait(2000);
		WebElement arrowkey = getDriver().findElement(By.xpath("//*[@id=\"mat-expansion-header-0\"]"));
		arrowkey.click();
		scrollDown150();
	
	}

	public void clickOnDownArrowKeyTwo() {

		clickOnElement(locators.getKey("ClickOnArrowKeyTwo"));
		log.info("STEP:Click on ClickOnArrowKeyTwo Successfully" + "ClickOnArrowKeyTwo");
	}

	public void assertionofStautofIssueApproved() {
		wait(2000);
		WebElement arrowkey = getDriver().findElement(By.xpath("//*[@id=\"mat-expansion-header-0\"]"));
		arrowkey.click();
		WebElement ele = getDriver().findElement(By.xpath(
				"//*[@id=\"cdk-accordion-child-0\"]/div/div/div/div[3]/div[2]/label[normalize-space()='Approved']"));
		scrollDown150();
		System.out.println("assertionofStautofIssueTitle  Status value is verified " + ele);

	}
}
