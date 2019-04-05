package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Company_Module_Pages.Company_Recruiters_page;

public class company_recruiters_Testcase
{
	WebDriver driver;
	Company_Recruiters_page Obj_company_Recruiters;
	
	public company_recruiters_Testcase(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public void Company_Recruiters() throws Exception
	{
		try
		{
		//Recruiiter_invite
		Obj_company_Recruiters=new Company_Recruiters_page(driver);
		Obj_company_Recruiters.Recruiter_invite_page();
		Obj_company_Recruiters.Recruiter_Registered_page();
		}
		catch(Exception e) 
		{
			throw(e);
		}
	}
}
