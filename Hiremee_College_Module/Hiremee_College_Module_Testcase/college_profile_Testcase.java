package Hiremee_College_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_College_Module_Page.College_Profile_Page;

public class college_profile_Testcase 
{
	WebDriver driver;
	College_Profile_Page obj_College_Profile_Page;
	public college_profile_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void College_Profile_testcase() throws Exception
	{
		obj_College_Profile_Page=new College_Profile_Page(driver);
		try
		{
			obj_College_Profile_Page.College_Profile();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

}
