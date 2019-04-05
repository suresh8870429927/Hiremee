package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_Candidate_Page.Candidate_Dashboard_Page;

public class candidate_dashboard_Testcase 
{
	WebDriver driver;
	Candidate_Dashboard_Page Obj_Candidate_Dashboard;
	
	public candidate_dashboard_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Candidate_Dashboard_Testcase() throws Exception
	{
		//dashboard
		Obj_Candidate_Dashboard=new Candidate_Dashboard_Page(driver);
		Obj_Candidate_Dashboard.candidate_Dashboard();

	}


}
