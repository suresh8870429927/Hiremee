package Hiremee_Recruiter_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Recruiter_Module_Page.Recruiter_Email_Template_Page;

public class recruiter_email_template_Testcase {

	WebDriver driver;
	Recruiter_Email_Template_Page Obj_recruiter_Email_template;
	
	public recruiter_email_template_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}	
	public void Company_Email_Candidate() throws Exception
	{
		try
		{
		//email template
		Obj_recruiter_Email_template=new Recruiter_Email_Template_Page(driver);
		Obj_recruiter_Email_template.Recruiter_Email_Template();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
}
