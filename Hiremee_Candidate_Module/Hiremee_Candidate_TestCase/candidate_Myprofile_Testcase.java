package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Candidate_Page.Candidate_My_Profile_Page;

public class candidate_Myprofile_Testcase 
{

	WebDriver driver;
	Candidate_My_Profile_Page Obj_Candidate_myprofile;

	public candidate_Myprofile_Testcase(WebDriver ldriver) 
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public void candidate_Myprofile_Testcases() throws Exception
	{
		Obj_Candidate_myprofile=new Candidate_My_Profile_Page(driver);
		try
		{
			Obj_Candidate_myprofile.My_Profile_Update();
		}
		catch(Exception e) {
			throw(e);
		}
	}
}