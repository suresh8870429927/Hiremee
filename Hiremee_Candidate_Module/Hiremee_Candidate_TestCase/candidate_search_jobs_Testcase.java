package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_Candidate_Page.Candidate_Search_Jobs_Page;

public class candidate_search_jobs_Testcase {
	WebDriver driver;
	Candidate_Search_Jobs_Page Obj_Candidate_Search_Jobs;
	public candidate_search_jobs_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Candidate_Search_jobs_Testcase() throws Exception
	{
		Obj_Candidate_Search_Jobs=new Candidate_Search_Jobs_Page(driver);
		try
		{
			Obj_Candidate_Search_Jobs.Saerch_Jobss();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}