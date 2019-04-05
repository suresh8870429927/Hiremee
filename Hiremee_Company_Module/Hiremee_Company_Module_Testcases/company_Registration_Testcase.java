package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Company_Module_Pages.Comapany_Registration_Page;
import db.DB;

public class company_Registration_Testcase{
	
	WebDriver driver;
	Comapany_Registration_Page Obj_company_register;
	DB obj_company_registration_activate_ops_portal;
	public company_Registration_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void company_registration()throws Exception
	{
		Obj_company_register=new Comapany_Registration_Page(driver);
		obj_company_registration_activate_ops_portal=new DB(driver);
		try 
		{
		
		Obj_company_register.company_register_page();
		//obj_company_registration_activate_ops_portal.company_registration_activate_ops_portal();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}
