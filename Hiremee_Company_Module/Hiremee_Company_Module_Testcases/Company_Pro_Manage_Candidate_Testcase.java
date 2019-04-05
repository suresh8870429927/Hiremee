package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Hiremee_Company_Module_Pages.Company_Pro_Manage_Candidate_Page;

public class Company_Pro_Manage_Candidate_Testcase 
{ 
	WebDriver driver;
	Company_Pro_Manage_Candidate_Page obj_Company_Pro_Manage_Candidate_Page;
	public Company_Pro_Manage_Candidate_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void Manage_candidate_Test() throws Exception
	{
		obj_Company_Pro_Manage_Candidate_Page=new Company_Pro_Manage_Candidate_Page(driver);
		try
		{
			obj_Company_Pro_Manage_Candidate_Page.company_manage_candidate();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

}
