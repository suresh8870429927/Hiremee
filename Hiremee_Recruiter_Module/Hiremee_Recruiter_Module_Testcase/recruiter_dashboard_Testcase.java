package Hiremee_Recruiter_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Recruiter_Module_Page.Recruiter_dashboard_page;

public class recruiter_dashboard_Testcase {
	WebDriver driver;
	Recruiter_dashboard_page Obj_Recruiter_dashboard;

	public recruiter_dashboard_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Recruiter_dashboard() throws Exception
	{
		Obj_Recruiter_dashboard=new Recruiter_dashboard_page(driver);
		try
		{
			Obj_Recruiter_dashboard.Recruiter_dashboard_pages();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

}
