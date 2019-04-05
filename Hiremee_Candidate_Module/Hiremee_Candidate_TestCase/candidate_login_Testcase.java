package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Candidate_Page.Candidate_Login_Page;


public class candidate_login_Testcase {
	WebDriver driver;
	Candidate_Login_Page Obj_Candidate_login;
	
	public candidate_login_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	
	public void candidate_login_Testcases() throws Exception
	{
		Obj_Candidate_login=new Candidate_Login_Page(driver);
		try 
		{
		Obj_Candidate_login.Candiadte_Login();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	
}
