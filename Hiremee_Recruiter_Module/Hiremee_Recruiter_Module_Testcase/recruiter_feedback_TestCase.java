package Hiremee_Recruiter_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Recruiter_Module_Page.Recruiter_Feedback_page;

public class recruiter_feedback_TestCase {
	
	WebDriver driver;
	Recruiter_Feedback_page obj_recruiter_Feedback;
	
	public recruiter_feedback_TestCase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Recruiter_Feedback_and_Logout() throws Exception
	{
		try
		{
		//feedback and logout
		obj_recruiter_Feedback=new Recruiter_Feedback_page(driver);
		obj_recruiter_Feedback.Recruiter_Feedback_pages();
		obj_recruiter_Feedback.Recruiter_Logout();
		}
		catch(Exception e)
		{
			throw(e);
		}
}
}