package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Candidate_Page.Candidate_Current_Openings_Page;

public class candidate_current_opennings_Testcase {

	WebDriver driver;
	Candidate_Current_Openings_Page Obj_Candidate_Current_openings;

	public candidate_current_opennings_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Candidate_Current_Openings_Testcase() throws Exception
	{
		Obj_Candidate_Current_openings=new Candidate_Current_Openings_Page(driver);
		try
		{
			Obj_Candidate_Current_openings.Current_openings();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
}