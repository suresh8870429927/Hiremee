package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_Candidate_Page.Candidate_Invite_Friends_Page;

public class candidate_invite_friends_Testcase 
{
	WebDriver driver;
	Candidate_Invite_Friends_Page obj_Candidate_Invite_Friends_Page;
	public candidate_invite_friends_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Invite_friends_testcase() throws Exception
	{
		obj_Candidate_Invite_Friends_Page=new Candidate_Invite_Friends_Page(driver);
		try
		{
			obj_Candidate_Invite_Friends_Page.candidate_invite_friends();
		}
	
		catch(Exception e)
		{
			throw(e);
		}
	}
}
