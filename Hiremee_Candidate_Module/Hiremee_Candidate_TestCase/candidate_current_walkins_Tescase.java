package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_Candidate_Page.Candidate_Current_Walkins_Page;

public class candidate_current_walkins_Tescase {
	WebDriver driver;
	Candidate_Current_Walkins_Page Obj_Candidate_Current_walkins;
	
	public candidate_current_walkins_Tescase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Candidate_Current_Walkins_Testcase() throws Exception
	{
		Obj_Candidate_Current_walkins=new Candidate_Current_Walkins_Page(driver);
		try
		{
		Obj_Candidate_Current_walkins.Current_Walkinss();
		}
		catch(Exception e)
		{
			throw(e);
		}
}
}