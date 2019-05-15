package Hiremee_College_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_College_Module_Page.College_Registration_page;
import db.DB;

public class college_registration_Testcase 
{
	WebDriver driver;
	College_Registration_page obj_College_Registration_page;
	DB obj_college_registration_activate_ops_portal;
	
	public college_registration_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public void college_registration_Testcases() throws Exception
	{
		obj_College_Registration_page =new College_Registration_page(driver);
		obj_college_registration_activate_ops_portal=new DB(driver);
		try 
		{
			obj_College_Registration_page.college_registration();	
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}
