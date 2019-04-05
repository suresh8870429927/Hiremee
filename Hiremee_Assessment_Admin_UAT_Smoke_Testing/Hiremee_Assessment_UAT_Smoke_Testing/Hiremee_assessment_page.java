package Hiremee_Assessment_UAT_Smoke_Testing;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started.Hiremee_Smoke_Test_Driver_Initial;
import Excel_Config.Excel_Sheet_Config;
import Property_File.Property_File_Config;

public class Hiremee_assessment_page extends Hiremee_Smoke_Test_Driver_Initial{
	@FindBy(how=How.ID,using="txtUserName")
	WebElement Admin_username;

	@FindBy(how=How.ID,using="txtPassword")
	WebElement Admin_Password;

	@FindBy(how=How.ID,using="txtCaptcha")
	WebElement Admin_captcha_value;

	@FindBy(how=How.ID,using="btnLogin")
	WebElement Admin_login_button;

	@FindBy(how=How.ID,using="a2")
	WebElement Admin_Exam_Center_Master;

	@FindBy(how=How.ID,using="aEassessment")
	WebElement Admin_Eassessment;

	@FindBy(how=How.ID,using="aEassessmentCreateExam")
	WebElement Admin_Eassessment_create_exam;

	@FindBy(how=How.ID,using="a4")
	WebElement Admin_Eassessment_Candidate_Feedback;
	
	@FindBy(how=How.ID,using="aReports")
	WebElement Admin_Reports;
	
	@FindBy(how=How.ID,using="a3")
	WebElement Admin_overall_exam_Reports;
	
	@FindBy(how=How.ID,using="a9")
	WebElement Admin_userwise_exam_Reports;
	
	@FindBy(how=How.ID,using="aAIAssessmentRejectionReport")
	WebElement Admin_AI_Assessment_Rejection_Reports;
	
	@FindBy(how=How.ID,using="aUserMgtMaster")
	WebElement Admin_Usermanagement;
	
	@FindBy(how=How.ID,using="a6")
	WebElement Admin_Usermanagement_usermapping_college;
	
	@FindBy(how=How.ID,using="a1")
	WebElement Admin_Usermanagement_usermapping_Pooled;
	
	@FindBy(how=How.ID,using="a8")
	WebElement Admin_Usermanagement_HallTicket_Details;
	
	@FindBy(how=How.ID,using="aInvigilatorRegistration")
	WebElement Admin_Usermanagement_Invigilater_Registration;
	
	@FindBy(how=How.ID,using="aAutoProctoredExam")
	WebElement Admin_Autoproctored_Assessment;
	
	@FindBy(how=How.ID,using="a7")
	WebElement Admin_Autoproctored_Assessment_Manage_Existing_User;
	
	@FindBy(how=How.ID,using="aImport")
	WebElement Admin_Autoproctored_Assessment_Manage_New_User;
	
	@FindBy(how=How.ID,using="aCreateExam")
	WebElement Admin_Autoproctored_Assessment_Create_Autoproctored_Exam;

	@FindBy(how=How.ID,using="aIncompleteReport")
	WebElement Admin_Autoproctored_Assessment_Incomplete;
	
	@FindBy(how=How.ID,using="a10")
	WebElement Admin_Autoproctored_Assessment_overall_status;
	
	@FindBy(how=How.ID,using="a11")
	WebElement Admin_Autoproctored_Assessment_overall_Exam_status;
	
	@FindBy(how=How.ID,using="a12")
	WebElement Admin_Autoproctored_Assessment_Candidate_Feedback_status;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"liLogout\"]/a")
	WebElement Admin_Assessment_logout_modal;
	
	@FindBy(how=How.ID,using="lnkLogout")	WebElement Admin_Assessment_logout;

	WebDriver driver;
	Property_File_Config config;
	//String Assessment_url;
	//String admin_username;
	//String	admin_password;
	Excel_Sheet_Config excel=new Excel_Sheet_Config();
	public Hiremee_assessment_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void Assessment_Home_Page() throws Exception
	{
		logger = extent.createTest("Assessment_Home_Page");
		try {
			//Assessment_url=excel.Read_data(5, 19, 10);
			config=new Property_File_Config();
			driver.get(config.Assessment_url());
			excel.Write_data_pass(5, 19, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(5, 19, 11);
			throw(e);
		}
	}
	@Test
	public void Assessment_Login_Page() throws Exception
	{
		logger = extent.createTest("Assessment_Home_Page");
		try {
			//admin_username=excel.Read_data(5, 20, 10);
			config=new Property_File_Config();
			Admin_username.sendKeys(config.getAssessment_username());
			//admin_password=excel.Read_data(5, 21, 10);
			Admin_Password.sendKeys(config.getAssessment_password());
			String captcha=JOptionPane.showInputDialog("Enter the answer for above captcha:");
			Admin_captcha_value.sendKeys(captcha);
			Admin_login_button.click();
			excel.Write_data_pass(5, 20, 11);
			excel.Write_data_pass(5, 21, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(5, 20, 11);
			excel.Write_data_fail(5, 21, 11);
			throw(e);
		}
	}
	@Test
	public void Assessment_Exam_Center_master_Page() throws Exception
	{	logger = extent.createTest("Assessment_Home_Page");
		try {
			ExplicitWait(driver, Admin_Exam_Center_Master);
			Admin_Exam_Center_Master.click();
			excel.Write_data_pass(5, 22, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(5, 22, 11);
			throw(e);
		}
	}
	@Test
	public void Assessment_Eassessment_Page() throws Exception
	{	logger = extent.createTest("Assessment_Eassessment_Page");
		try {
			ExplicitWait(driver, Admin_Eassessment);
			Admin_Eassessment.click();
			excel.Write_data_pass(5, 23, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(5, 23, 11);
			throw(e);
		}
	}

	@Test
	public void Assessment_Essessment_createexam_Page() throws Exception
	{	logger = extent.createTest("Assessment_Essessment_createexam_Page");
		try {
			ExplicitWait(driver, Admin_Eassessment_create_exam);
			Admin_Eassessment_create_exam.click();
			excel.Write_data_pass(5, 24, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(5, 24, 11);
			throw(e);
		}
	}
		@Test
		public void Assessment_Essessment_candidate_Feedback_Page() throws Exception
		{	logger = extent.createTest("Assessment_Essessment_candidate_Feedback_Page");
			try {
				ExplicitWait(driver, Admin_Eassessment_Candidate_Feedback);
				Admin_Eassessment_Candidate_Feedback.click();
				excel.Write_data_pass(5, 25, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 25, 11);
				throw(e);
				
			}
		}
		@Test
		public void Assessment_Reports_Page() throws Exception
		{	logger = extent.createTest("Assessment_Reports_Page");
			try {
				
				Admin_Reports.click();
				excel.Write_data_pass(5, 26, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 26, 11);
				throw(e);
			}
		}
		@Test
		public void Assessment_overall_exam_Reports_Page() throws Exception
		{	logger = extent.createTest("Assessment_overall_exam_Reports_Page");
			try {
				Admin_overall_exam_Reports.click();
				excel.Write_data_pass(5, 27, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 27, 11);
				throw(e);
			}
		}
		
		@Test
		public void Assessment_userwise_exam_Reports_Page() throws Exception
		{	logger = extent.createTest("Assessment_userwise_exam_Reports_Page");
			try {
				Thread.sleep(3000);
				Admin_Reports.click();
				Thread.sleep(3000);
				Admin_userwise_exam_Reports.click();
				excel.Write_data_pass(5, 28, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 28, 11);
				throw(e);
			}
		}
		
		@Test
		public void Assessment_AI_Rejection_Reports_Page() throws Exception
		{	logger = extent.createTest("Assessment_AI_Rejection_Reports_Page");
			try {
				Thread.sleep(3000);
				Admin_AI_Assessment_Rejection_Reports.click();
				excel.Write_data_pass(5, 29, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 29, 11);
				throw(e);
			}
		}
		
		@Test
		public void Assessment_User_Management_Page() throws Exception
		{	logger = extent.createTest("Assessment_User_Management_Page");
			try {
				Thread.sleep(3000);
				Admin_Usermanagement.click();
				excel.Write_data_pass(5, 30, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 30, 11);
				throw(e);
			}
		}
		@Test
		public void Assessment_User_Management_usermapping_college_Page()throws Exception
		{	logger = extent.createTest("Assessment_User_Management_usermapping_college_Page");
			try {
				Thread.sleep(3000);
				Admin_Usermanagement_usermapping_college.click();
				excel.Write_data_pass(5, 31, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 31, 11);
				throw(e);
			}
		}
		@Test
		public void Assessment_User_Management_usermapping_Pooled_Page()throws Exception
		{	logger = extent.createTest("Assessment_User_Management_usermapping_Pooled_Page");
			try {
				Thread.sleep(3000);
				Admin_Usermanagement_usermapping_Pooled.click();
				excel.Write_data_pass(5, 32, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 32, 11);
				throw(e);
			}
		}
		@Test
		public void Assessment_User_Management_hallticket_details_Page()throws Exception
		{	logger = extent.createTest("Assessment_User_Management_hallticket_details_Page");
			try {
				Thread.sleep(3000);
				Admin_Usermanagement_HallTicket_Details.click();
				excel.Write_data_pass(5, 33, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 33, 11);
				throw(e);
			}
		}
		@Test
		public void Assessment_User_Management_Invigilater_Registration_Page()throws Exception
		{	logger = extent.createTest("Assessment_User_Management_Invigilater_Registration_Page");
			try {
				Thread.sleep(3000);
				Admin_Usermanagement_Invigilater_Registration.click();
				excel.Write_data_pass(5, 34, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 34, 11);
				throw(e);
			}
		}
		
		@Test
		public void Assessment_Autoproctored_Assessment_Page()throws Exception
		{	logger = extent.createTest("Assessment_Autoproctored_Assessment_Page");
			try {
				Thread.sleep(5000);
				Admin_Autoproctored_Assessment.click();
				excel.Write_data_pass(5, 35, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 35, 11);
				throw(e);
			}
		}
		
		@Test
		public void Assessment_Autoproctored_Assessment_Managing_Existing_user_Page()throws Exception
		{	logger = extent.createTest("Assessment_Autoproctored_Assessment_Managing_Existing_user_Page");
			try {
				Thread.sleep(15000);
				Admin_Autoproctored_Assessment_Manage_Existing_User.click();
				excel.Write_data_pass(5, 36, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 36, 11);
				throw(e);
			}
		}
		@Test
		public void Assessment_Autoproctored_Assessment_Managing_New_user_Page()throws Exception
		{	logger = extent.createTest("Assessment_Autoproctored_Assessment_Managing_New_user_Page");
			try {
				Thread.sleep(5000);
				Admin_Autoproctored_Assessment_Manage_New_User.click();
				excel.Write_data_pass(5, 37, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 37, 11);
				throw(e);
			}
		}
		
		@Test
		public void Assessment_Autoproctored_Assessment_Createautoproctored_exam_Page()throws Exception
		{	logger = extent.createTest("Assessment_Autoproctored_Assessment_Createautoproctored_exam_Page");
			try {
				Thread.sleep(5000);
				Admin_Autoproctored_Assessment_Create_Autoproctored_Exam.click();
				excel.Write_data_pass(5, 38, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 38, 11);
				throw(e);
			}
		}
		
		@Test
		public void Assessment_Autoproctored_Assessment_Incompelete_Page()throws Exception
		{	logger = extent.createTest("Assessment_Autoproctored_Assessment_Incompelete_Page");
			try {
				Thread.sleep(5000);
				Admin_Autoproctored_Assessment_Incomplete.click();
				excel.Write_data_pass(5, 39, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 39, 11);
				throw(e);
			}
		}
		
		@Test
		public void Assessment_Autoproctored_Assessment_Overall_ststus_Page()throws Exception
		{	logger = extent.createTest("Assessment_Autoproctored_Assessment_Overall_ststus_Page");
			try {
				Thread.sleep(5000);
				Admin_Autoproctored_Assessment_overall_status.click();
				excel.Write_data_pass(5, 40, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 40, 11);
				throw(e);
			}
		}
		
		@Test
		public void Assessment_Autoproctored_Assessment_Candidate_Feedback_Page() throws Exception
		{	logger = extent.createTest("Assessment_Autoproctored_Assessment_Candidate_Feedback_Page");
			try {
				Thread.sleep(5000);
				Admin_Autoproctored_Assessment_Candidate_Feedback_status.click();
				excel.Write_data_pass(5, 41, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 41, 11);
				throw(e);
			}
		}	
		
		@Test
		public void Assessment_Logout_Page() throws Exception
		{	logger = extent.createTest("Assessment_Logout_Page");
			try {
				ExplicitWait(driver, Admin_Assessment_logout_modal);
				Admin_Assessment_logout_modal.click();
				ExplicitWait(driver, Admin_Assessment_logout);
				Admin_Assessment_logout.click();
				excel.Write_data_pass(5, 42, 11);
			}
			catch(Exception e)
			{
				excel.Write_data_fail(5, 42, 11);
				throw(e);

			}
		}	
		
		
		
		
		
		
		
}
