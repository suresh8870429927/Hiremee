package Hiremee_College_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_College_Module_Page.College_Feedback_Page;

public class college_feedback_Tescase {
	
	WebDriver driver;
	College_Feedback_Page obj_college_Feedback_page; 
	
	public college_feedback_Tescase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Collge_Feedback_and_login_Testcase() throws Exception
	{
		try
		{
		//feedback and logout
		obj_college_Feedback_page=new College_Feedback_Page(driver);
		obj_college_Feedback_page.Collge_Feedback();
		obj_college_Feedback_page.Collge_Logout();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}
