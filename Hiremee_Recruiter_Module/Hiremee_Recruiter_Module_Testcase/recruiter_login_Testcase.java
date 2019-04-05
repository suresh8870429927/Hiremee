package Hiremee_Recruiter_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Recruiter_Module_Page.Recruiter_Login_Page;

public class recruiter_login_Testcase {

	WebDriver driver;
	Recruiter_Login_Page Obj_Recruiter_login;

	public recruiter_login_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void company_login_Testcase() throws Exception
	{
		Obj_Recruiter_login=new Recruiter_Login_Page(driver);
		try 
		{
			Obj_Recruiter_login.Recruiter_login();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}
