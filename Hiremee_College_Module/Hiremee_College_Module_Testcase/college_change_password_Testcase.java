package Hiremee_College_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_College_Module_Page.College_Change_Password_Page;

public class college_change_password_Testcase 
{
	College_Change_Password_Page obj_College_Change_Password_Page;
	WebDriver driver;
	
	public college_change_password_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void college_change_password_Testcases() throws Exception
	{
		obj_College_Change_Password_Page=new College_Change_Password_Page(driver);
		try
		{
			obj_College_Change_Password_Page.college_change_password();
		}
		
		catch(Exception e)
		{
			throw(e);
		}
		
	}
}
