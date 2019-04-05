package Hiremee_Assessment_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Assessment_Module_Page.Assessment_Exam_page;

public class assessment_exam_Testcase {
	WebDriver driver;
	Assessment_Exam_page obj_Assessment_exam_page;
	
	public assessment_exam_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public void Assessment_Exam_Testcase() throws Exception
	{	
		obj_Assessment_exam_page=new Assessment_Exam_page(driver);
		try
		{
		obj_Assessment_exam_page.Assessment_Exam_login();
		obj_Assessment_exam_page.Assessment_Exam_verbal();
		obj_Assessment_exam_page.Assessment_Exam_Quantitative();
		obj_Assessment_exam_page.Assessment_Exam_Logical();
		obj_Assessment_exam_page.Assessment_Exam_Behaviour();
		obj_Assessment_exam_page.Assessment_Exam_Technical_Core_Domain();
		obj_Assessment_exam_page.Assessment_Exam_Technical_Fundamental();
		obj_Assessment_exam_page.Assessment_Feedback();
		}
		catch(Exception e)
		{
			throw(e);
		}
		
	}
	}
