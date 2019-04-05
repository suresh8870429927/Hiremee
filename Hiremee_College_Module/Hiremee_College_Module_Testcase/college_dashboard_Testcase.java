package Hiremee_College_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_College_Module_Page.College_Dashboard_Page;

public class college_dashboard_Testcase {

	WebDriver driver;
	College_Dashboard_Page obj_College_Dashboard_Page;
	public college_dashboard_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public void college_dashboard_testcase() throws Exception
	{
		obj_College_Dashboard_Page=new College_Dashboard_Page(driver);
		try
		{
			obj_College_Dashboard_Page.college_dashboard();

		}
		catch(Exception e) 
		{
			throw(e);
		}
	}
}
