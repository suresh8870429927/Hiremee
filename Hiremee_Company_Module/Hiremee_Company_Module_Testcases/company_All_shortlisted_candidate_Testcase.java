package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Company_Module_Pages.Company_All_Shortlisted_Candidate_Page;

public class company_All_shortlisted_candidate_Testcase {
	WebDriver driver;
	Company_All_Shortlisted_Candidate_Page Obj_company_all_shortlisted; 
	
	public company_All_shortlisted_candidate_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Company_Shortlisted_Candidate() throws Exception
	{
		try 
		{
		//all candidate shortlisted
		Obj_company_all_shortlisted=new Company_All_Shortlisted_Candidate_Page(driver);
		Obj_company_all_shortlisted.Candidate_Shortlisted_candidate();
		Obj_company_all_shortlisted.Candidate_Invite_Hire();
		}
		catch(Exception e)
		{
			throw(e);
		}

}
}