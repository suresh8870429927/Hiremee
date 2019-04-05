package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Candidate_Page.Candidate_Feedback_and_logout_Page;

public class candidate_feedback_and_logout_Testcase
{
	WebDriver driver;
	Candidate_Feedback_and_logout_Page obj_Candidate_Feedback_and_logout_Page;
	
	public candidate_feedback_and_logout_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public void candi_feedback_and_logout_testcase() throws Exception
	{
		obj_Candidate_Feedback_and_logout_Page=new Candidate_Feedback_and_logout_Page(driver);
		try
		{
			obj_Candidate_Feedback_and_logout_Page.feedback_and_logout();
		}
		catch(Exception e)
		{
			throw(e);
		}
		
	}
}
