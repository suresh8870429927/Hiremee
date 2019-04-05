package Hiremee_Recruiter_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Recruiter_Module_Page.Recruiter_Search_Candidate_Page;

public class recruiter_Search_Candidate_Testcase {

	WebDriver driver;
	Recruiter_Search_Candidate_Page Obj_recruiter_Search_candidate;
	
	public recruiter_Search_Candidate_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Recruiter_Search_Candidate() throws Exception
	{
		try
		{
		//search-candidate
		Obj_recruiter_Search_candidate=new  Recruiter_Search_Candidate_Page(driver);
		Obj_recruiter_Search_candidate.Search_candidate_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

}
