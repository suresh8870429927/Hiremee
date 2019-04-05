package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Company_Module_Pages.Company_dashboard_page;

public class company_dashboard_Testcase{
	WebDriver driver;
	Company_dashboard_page obj_company_dashboard;
	public company_dashboard_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Company_dashboard() throws Exception
	{
		obj_company_dashboard=new Company_dashboard_page(driver);
		try
		{
			obj_company_dashboard.comapany_dashboard_page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

}
