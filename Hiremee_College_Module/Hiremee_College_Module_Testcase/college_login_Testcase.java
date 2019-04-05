package Hiremee_College_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_College_Module_Page.College_Login_Page;

public class college_login_Testcase {
	
	WebDriver driver;
	College_Login_Page obj_college_login_page;
	
	public college_login_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void college_login_Testcases() throws Exception
	{
		try
		{
		obj_college_login_page=new College_Login_Page(driver);
		obj_college_login_page.College_Login();
		}
		catch(Exception e)
		{
			throw(e);
		}
		
		}
}