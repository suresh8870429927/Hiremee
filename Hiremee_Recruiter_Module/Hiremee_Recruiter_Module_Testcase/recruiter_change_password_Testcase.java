package Hiremee_Recruiter_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_Recruiter_Module_Page.Recruiter_Change_password_Page;

public class recruiter_change_password_Testcase 
{
	WebDriver driver;
	Recruiter_Change_password_Page obj_Recruiter_Change_password_Page;
	public recruiter_change_password_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public void recruiter_change_password_testcase() throws Exception
	{
		obj_Recruiter_Change_password_Page=new Recruiter_Change_password_Page(driver);
		try
		{
			obj_Recruiter_Change_password_Page.Recruiter_changepassword_pages();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}



}
