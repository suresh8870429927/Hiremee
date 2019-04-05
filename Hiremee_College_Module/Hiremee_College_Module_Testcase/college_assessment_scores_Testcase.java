package Hiremee_College_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_College_Module_Page.College_Assessment_scores_Page;

public class college_assessment_scores_Testcase {

	WebDriver driver;
	College_Assessment_scores_Page obj_college_Assessment_Scores_page; 
	
	public college_assessment_scores_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void college_Assessment_Scores() throws Exception
	{	
		try
		{
		//Assessment scores
		obj_college_Assessment_Scores_page=new College_Assessment_scores_Page(driver);
		obj_college_Assessment_Scores_page.Collge_Assessment_Scores();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}
