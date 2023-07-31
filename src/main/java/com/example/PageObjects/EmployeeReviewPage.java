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

public class EmployeeReviewPage extends GenericUtils {

	public EmployeeReviewPage() {
		// TODO Auto-generated constructor stub
	}

	PropertyFileOperations locators;
	// public WebDriver driver;

	static Logger log = LogManager.getLogger(EmployeeReviewPage.class);
//   static String finaltitle;
//   static String finalgoaltitle;
//   static String finalSupervisorComment;

	{
		locators = new PropertyFileOperations(FileNames.Huner);
		log.info("STEP: Assets Page Locators loaded into memory");
	}

	public void clickonReviewSection() {
		clickOnElement(locators.getKey("clickOnReviewSection"));
		log.info("STEP:Enter supervisior Button Successfully" + "clickOnReviewSection");
	}

	public void clickOnAssignReviewForm() {
		clickOnElement(locators.getKey("ClickOnAssignReviewForm"));
		log.info("STEP:Click on assign form successfully" + "ClickOnAssignReviewForm");
	}

	public void clickOnReviewSubmitButton() {
		clickOnElement(locators.getKey("ReviewSaveButton"));
		log.info("STEP:click on save button Successfully" + "ReviewSaveButton");
	}
	
  	
	public void clickOnOrgSignoutButton() {
	clickOnElement(locators.getKey("ClickOnOAProfile"));
	clickOnElement(locators.getKey("ClickOnSignout"));

	log.info("STEP:Click on Signout Successfully" + "ClickOnOAProfile");

}
	
	
	
public void reviewRejectStatus() {
		
		scrollDown150();
		scrollDown150();
		verifyText(locators.getKey("RejectedReviewedStatus"), "Rejected");
		log.info("STEP: Review Status should be display" + "RejectedReviewedStatus");
		EscKey();
	}
	
	   public void enterOrgUsername(String OrgUsername) {

	  		

	  		enterText(locators.getKey("Username"), OrgUsername);
	  		log.info("STEP:Enter User name successfully" + "OrgUsername");

	  	}

	public void clickOnSubmitForReviewButton() {
		clickOnElement(locators.getKey("SubmitForReviewButton"));
		wait(3000);
		log.info("STEP:click on submit for review button Successfully" + "SubmitForReviewButton");
	}
	
	
	  public void EnterOrgRejectComments(String OrgComments) {

  		

  		enterText(locators.getKey("OrgRejectComments"), OrgComments);
  		log.info("STEP:Enter Org comments successfully" + "OrgRejectComments");

  	}
	
	
	
	
	
	
	public void clickOnReviewApproveButton() {
		clickOnElement(locators.getKey("AcceptButton"));
		log.info("STEP:click on Approve button Successfully" + "AcceptButton");
	}

	public void VerifySubmitFormStatus() {
		
		scrollDown150();
		scrollDown150();
		verifyText(locators.getKey("ReviewSubmittedStatus"), "Submitted");
		log.info("STEP: Review Status should be display" + "ReviewSubmittedStatus");
		EscKey();
	}
	
	 public void clickOnPending_Activities(){
         clickOnElement(locators.getKey("Pending_Activities"));
         log.info("STEP:Click on Pending_Activities Successfully" + "Pending_Activities");
   }
	 
	 
	public void clickOnOrgEditIcon()
	{
		 clickOnElement(locators.getKey("OrgEditIcon"));
         log.info("STEP:Click on Edit Icon Successfully" + "OrgEditIcon");
	}
	
	public void verifyClosedStatus() {
		
		scrollDown150();
		scrollDown150();
		verifyText(locators.getKey("ClosedStatus"), "Closed");
		log.info("STEP: Review Status should be display" + "ReviewSubmittedStatus");
		EscKey();
	}
	
	
	public void EnterRejectComments(String Comments)
	{
		enterText(locators.getKey("EmployeeRejectComments"), Comments);
		log.info("STEP: Enter Reject Comments" + "EmployeeRejectComments");
	}
	
	
	
	public void clickOnReviewEditIcon()
	{
		clickOnElement(locators.getKey("SupervisorReviewEditIcon"));
		log.info("STEP:click on Edit Icon Successfully" + "SupervisorReviewEditIcon");
	}

//	public boolean FillReviewForm() {
//		try {
//			if (isElementDisplay(locators.getKey("ReviewSubmittedStatus"))) {
//
//				enterText(locators.getKey("ReviewSubmittedStatus"), "ReviewSubmittedStatus");
//
//			} else if (isElementNotDisplay(locators.getKey("ReviewSubmittedStatus"))) {
//				log.info("STEP:Field is disabled" + "ReviewSubmittedStatus");
//			} else {
//
//				log.info("STEP:Field is disabled" + "ReviewSubmittedStatus");
//			}
//		} catch (Exception e) {
//
//			log.debug("STEP: issue whi;e checking in checkbox" + e);
//
//		}
//		return false;
//
//	}

	public void fillReviewFormswithEmployee()

	{
		
	clickOnElement(locators.getKey("TimeManagementPanel"));
	enterText(locators.getKey("EnterTimeManagementSkill"), "Test Skills");
	log.info("STEP:Enter Text successfully" + "EnterTimeManagementSkill");
		
		clickOnElement(locators.getKey("ManagementSkillPanel"));
		clickOnElement(locators.getKey("ClickOnCheckbox"));
		log.info("STEP:Checked skill checkbox successfully" + "ClickOnCheckbox");
		
		clickOnElement(locators.getKey("AnalyticalSkillPanel"));
		enterText(locators.getKey("EnterAnalyticalSkill"), "Test Review");
		log.info("STEP:Enter analytical skill successfully" + "EnterAnalyticalSkill");
		
		
		

		

	}
	
	public void fillReviewFormswithSupervisor()

	{
		
	
		clickOnElement(locators.getKey("CommunicationPanel"));

		enterText(locators.getKey("SelectTextArea"), "Test Communication");
		log.info("STEP:Enter text successfully" + "SelectTextArea");
		
		clickOnElement(locators.getKey("PrimarySkillPanel"));
		keyDown(locators.getKey("SelectDropdownValueSupervisor"));
		log.info("STEP:Select checkbox successfully" + "SelectDropdownValueSupervisor");

		

	}
}