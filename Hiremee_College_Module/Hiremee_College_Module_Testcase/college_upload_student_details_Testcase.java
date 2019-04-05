package Hiremee_College_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_College_Module_Page.College_Upload_Student_Details_Page;
import db.DB;

public class college_upload_student_details_Testcase {

	WebDriver driver;
	College_Upload_Student_Details_Page obj_college_upload_student_details_page;
	DB obj_database_college_otp_select_quesry;
	
	public college_upload_student_details_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void college_Upload_Student_Details_Testcases() throws Exception
	{
		try
		{
		//upload student_details
		obj_college_upload_student_details_page=new College_Upload_Student_Details_Page(driver);
		obj_database_college_otp_select_quesry=new DB(driver);
		obj_college_upload_student_details_page.college_Upload_Sudent_Details();
		obj_college_upload_student_details_page.College_candidate_Activation();
		obj_database_college_otp_select_quesry.college_invitecandidate_selectquery_otp();
		obj_college_upload_student_details_page.college_Candidate_OTP_Activation();
		
		}
		catch(Exception e) 
		{
			throw(e);
		}
	}

}
