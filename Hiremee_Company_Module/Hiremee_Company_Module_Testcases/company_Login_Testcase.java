package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Company_Module_Pages.Company_login_page;

public class company_Login_Testcase
{
	WebDriver driver;
	Company_login_page Obj_company_login;
	
	public company_Login_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void company_login_Testcase() throws Exception
	{
		try
		{
		Obj_company_login=new Company_login_page(driver);
		Obj_company_login.company_login();

		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}
