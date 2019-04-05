package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Hiremee_Candidate_Page.Candidate_Change_password_page;

public class candidate_change_password_Testcase 
{
	WebDriver driver;
	Candidate_Change_password_page obj_Candidate_Change_password_page;
	public candidate_change_password_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void change_password_Testcase() throws Exception
	{
		obj_Candidate_Change_password_page=new Candidate_Change_password_page(driver);
		try
		{
			obj_Candidate_Change_password_page.candidate_change_password();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}
