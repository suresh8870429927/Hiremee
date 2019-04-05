package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_Candidate_Page.Candidate_Take_Online_Assessment_Page;

public class candidate_take_online_assessment_Testcase {
	WebDriver driver;
	Candidate_Take_Online_Assessment_Page Obj_Candidate_Take_online_assessment;
	
	public candidate_take_online_assessment_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void candidate_Take_Online_Assessmnet_Testcases() throws Exception
	{
		Obj_Candidate_Take_online_assessment=new Candidate_Take_Online_Assessment_Page(driver);
		try
		{
		//online_Assessmnet
		Obj_Candidate_Take_online_assessment.take_online_asessment();
		}
		catch(Exception e)
		{
			throw(e);
		}
		
}
}