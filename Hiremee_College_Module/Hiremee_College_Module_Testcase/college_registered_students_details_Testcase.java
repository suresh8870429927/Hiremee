package Hiremee_College_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Assessment_Module_Page.Assessment_Admin_College;
import Hiremee_Assessment_Module_Testcase.assessment_Exam_College_Wise_Testcase;
import Hiremee_College_Module_Page.College_Registered_Students_Page;
import db.DB;

public class college_registered_students_details_Testcase {

	WebDriver driver;
	College_Registered_Students_Page obj_college_registered_students_page; 
	Assessment_Admin_College obj_Assessment_Admin_College;
	DB obj_user_halticket_update;
	assessment_Exam_College_Wise_Testcase obj_assessment_Exam_College_Wise_Testcase;

	public college_registered_students_details_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public void College_Registered_Students_Testcase() throws Exception
	{
		obj_college_registered_students_page=new College_Registered_Students_Page(driver);
		try 
		{
			//Registered Students
			obj_college_registered_students_page.College_Registered_student();

		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	public void College_candidate_assessment_exam_center_Testcase() throws Exception
	{
		obj_Assessment_Admin_College=new Assessment_Admin_College(driver);
		try 
		{
			obj_Assessment_Admin_College.Assessment_admin_login();
			obj_Assessment_Admin_College.Assessmnet_Examcenter_creation_College();
			obj_Assessment_Admin_College.Assessmnet_Create_Exam_College();
			obj_Assessment_Admin_College.Assessmnet_College_Mapping();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	public void college_candidate_halticket_update_Testcase() throws Exception
	{
		obj_user_halticket_update =new DB(driver);
		try
		{
			obj_user_halticket_update.Assessment_College_Halticket_Update();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}



	public void College_candidate_Assessment_exam_Testcase() throws Exception
	{
		obj_assessment_Exam_College_Wise_Testcase=new assessment_Exam_College_Wise_Testcase(driver);
		try 
		{
			obj_assessment_Exam_College_Wise_Testcase.Assessment_Exam_collegewise_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}


}
