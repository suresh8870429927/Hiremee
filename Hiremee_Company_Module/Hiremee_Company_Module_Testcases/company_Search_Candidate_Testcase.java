package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Company_Module_Pages.Company_Search_Candidate_Page;

public class company_Search_Candidate_Testcase{

	WebDriver driver;
	Company_Search_Candidate_Page Obj_company_Search_candidate;
	
	public company_Search_Candidate_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public void Company_Search_Candidate() throws Exception
	{
		try
		{
		//search-candidate
		Obj_company_Search_candidate=new Company_Search_Candidate_Page(driver);
		Obj_company_Search_candidate.Search_candidate_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

}
