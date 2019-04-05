package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_Candidate_Page.Candidate_Applied_Jobs_Page;

public class candidate_applied_Testcase 
{
	WebDriver driver;
	Candidate_Applied_Jobs_Page obj_Candidate_Applied_Jobs_Page;
	
	public candidate_applied_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Applied_jobs() throws Exception
	{
		obj_Candidate_Applied_Jobs_Page=new Candidate_Applied_Jobs_Page(driver);
		try
		{
			obj_Candidate_Applied_Jobs_Page.Applied_Jobss();
		}
		catch(Exception e)
		{
			throw(e);
		}
		
	}
}
