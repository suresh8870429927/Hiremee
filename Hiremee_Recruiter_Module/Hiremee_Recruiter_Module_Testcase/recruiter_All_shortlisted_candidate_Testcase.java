package Hiremee_Recruiter_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Recruiter_Module_Page.Recruiter_All_Shortlisted_Candidate_Page;

public class recruiter_All_shortlisted_candidate_Testcase {
	
	WebDriver driver;
	Recruiter_All_Shortlisted_Candidate_Page Obj_recruiter_all_shortlisted; 
	
	public recruiter_All_shortlisted_candidate_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Company_Shortlisted_Candidate() throws Exception
	{
		try
		{
		//all candidate shortlisted
		Obj_recruiter_all_shortlisted=new Recruiter_All_Shortlisted_Candidate_Page(driver);
		Obj_recruiter_all_shortlisted.Candidate_Shortlisted_candidate();
		Obj_recruiter_all_shortlisted.Candidate_Invite_Hire();
		}

		catch(Exception e)
		{
			throw(e);
		}
	}
}