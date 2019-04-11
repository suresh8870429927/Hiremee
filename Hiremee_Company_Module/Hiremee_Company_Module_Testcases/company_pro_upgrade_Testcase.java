package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_Company_Module_Pages.Company_Pro_Upgrade_page;

public class company_pro_upgrade_Testcase
{
	WebDriver driver;
	Company_Pro_Upgrade_page obj_Company_Pro_Upgrade_page;
	public company_pro_upgrade_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public void company_pro_testcase() throws Exception
	{
		obj_Company_Pro_Upgrade_page=new Company_Pro_Upgrade_page(driver);
		try
		{
			obj_Company_Pro_Upgrade_page.pro_upgrade_company();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}
