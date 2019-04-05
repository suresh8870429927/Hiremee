package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_Assessment_Module_Page.Assessment_Admin_Page;
import Hiremee_Assessment_Module_Testcase.assessment_exam_Testcase;
import Hiremee_Candidate_Page.Candidate_Pooled_Campus_Registration_Page;
import db.DB;

public class candidate_pooled_campus_registration_Testcase 
{
	WebDriver driver;
	Candidate_Pooled_Campus_Registration_Page Obj_Candidate_Registration;
	DB Obj_Database_Otp_Selectquery;
	Assessment_Admin_Page obj_Assessment_Admin_Page;
	assessment_exam_Testcase obj_assessment_exam_Testcase;
	
	public candidate_pooled_campus_registration_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public void Candidate_Assessment_Exam_Center_Testcase() throws Exception
	{
		obj_Assessment_Admin_Page=new Assessment_Admin_Page(driver);
		try
		{
			//assessment
			obj_Assessment_Admin_Page.Assessment_admin_login();
			obj_Assessment_Admin_Page.Assessmnet_Examcenter_creation();
			obj_Assessment_Admin_Page.Assessmnet_Create_Exam();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Candidate_Pooled_campus_registration_Testcase() throws Exception
	{
		Obj_Candidate_Registration=new Candidate_Pooled_Campus_Registration_Page(driver);
		Obj_Database_Otp_Selectquery=new DB(driver);
		try
		{
			//pooled-registration
			Obj_Candidate_Registration.pooled_campus_registration();
			Obj_Database_Otp_Selectquery.pooled_selectquery_otp();
			Obj_Candidate_Registration.Registration_OTP_Verification();

		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Candidate_Assessment_user_mapping() throws Exception
	{
		obj_Assessment_Admin_Page=new Assessment_Admin_Page(driver);
		try
		{
			//assessment
			obj_Assessment_Admin_Page.Assessmnet_Pooled_Mapping();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Candidate_Assesment_Exam() throws Exception
	{
		obj_assessment_exam_Testcase=new assessment_exam_Testcase(driver);
		try
		{
			//Assessment Exam
			obj_assessment_exam_Testcase.Assessment_Exam_Testcase();
		}
		
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	
	
	
	
	
}