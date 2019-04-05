package Hiremee_Assessment_UAT_Smoke_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Hiremee_assessment_Testcase {
	WebDriver driver;
	Hiremee_assessment_page obj_assessment_page;
	
	public Hiremee_assessment_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public void Assessment_Home_main_page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Home_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_login_page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Login_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_Exam_Center_master_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Exam_Center_master_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_Eassessment_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Eassessment_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_Essessment_create_exam_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Essessment_createexam_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_Essessment_candidate_Feedback_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Essessment_candidate_Feedback_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_Reports_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Reports_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_overall_exam_Reports_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_overall_exam_Reports_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_userwise_exam_Reports_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_userwise_exam_Reports_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_AI_Rejection_Reports_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_AI_Rejection_Reports_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_User_Management_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_User_Management_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_User_Management_usermapping_college_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_User_Management_usermapping_college_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_User_Management_usermapping_Pooled_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_User_Management_usermapping_Pooled_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_User_Management_hallticket_details_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_User_Management_hallticket_details_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_User_Management_Invigilater_Registration_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_User_Management_Invigilater_Registration_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_Autoproctored_Assessment_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Autoproctored_Assessment_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_Autoproctored_Assessment_Managing_Existing_user_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Autoproctored_Assessment_Managing_Existing_user_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_Autoproctored_Assessment_Managing_New_user_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Autoproctored_Assessment_Managing_New_user_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_Autoproctored_Assessment_Createautoproctored_exam_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Autoproctored_Assessment_Createautoproctored_exam_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_Autoproctored_Assessment_Incompelete_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Autoproctored_Assessment_Incompelete_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_Autoproctored_Assessment_Overall_ststus_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Autoproctored_Assessment_Overall_ststus_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Assessment_Autoproctored_Assessment_Candidate_Feedback_Page() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Autoproctored_Assessment_Candidate_Feedback_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_Logout_Pages() throws Exception
	{
		obj_assessment_page=new Hiremee_assessment_page(driver);
		try {
			obj_assessment_page.Assessment_Logout_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}