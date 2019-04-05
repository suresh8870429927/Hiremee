package Hiremee_Candidate_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Candidate_Page.Candidate_Mock_Assessment_Page;

public class candidate_mock_assessment_Testcase {
	WebDriver driver;
	Candidate_Mock_Assessment_Page Obj_Candidate_Mock_assessment;

	public candidate_mock_assessment_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public void candidate_Mock_Assessmnet_Testcases() throws Exception
	{	
		Obj_Candidate_Mock_assessment=new Candidate_Mock_Assessment_Page(driver);
		try
		{
			Obj_Candidate_Mock_assessment.Mock_Assessment();
			Obj_Candidate_Mock_assessment.verbal_group_exam();
			Obj_Candidate_Mock_assessment.quantitative_group_exam();
			Obj_Candidate_Mock_assessment.logical_group_exam();
			Obj_Candidate_Mock_assessment.Technical_group_exam();
			Obj_Candidate_Mock_assessment.Technical_computer_group_exam();
			Obj_Candidate_Mock_assessment.feedback_exam();

		}
		catch(Exception e)
		{
			throw(e);
		}

	}
}