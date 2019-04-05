package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Company_Module_Pages.Company_Feedback_page;

public class company_feedback_TestCase{
	WebDriver driver;
	Company_Feedback_page obj_company_Feedback;

	public company_feedback_TestCase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Company_Feedback_and_logout() throws Exception
	{
		try {
		//feedback and logout
		obj_company_Feedback=new Company_Feedback_page(driver);
		obj_company_Feedback.Company_Feedback_pages();
		obj_company_Feedback.Company_Logout();
		}
		catch(Exception e)
		{
			throw(e);
		}
		
	}
}