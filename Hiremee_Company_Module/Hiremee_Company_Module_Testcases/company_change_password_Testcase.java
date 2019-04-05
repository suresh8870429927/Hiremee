package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Hiremee_Company_Module_Pages.Company_Change_password_Page;

public class company_change_password_Testcase 
{
	WebDriver driver;
	Company_Change_password_Page obj_Company_Change_password_Page;
	public company_change_password_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void company_changepassword_testcase() throws Exception
	{
		obj_Company_Change_password_Page=new Company_Change_password_Page(driver);
		try
		{
			obj_Company_Change_password_Page.company_change_password();
			
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	
}
