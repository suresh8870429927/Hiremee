package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Company_Module_Pages.Company_Pro_Manage_Assess_Page;

public class company_pro_manage_assessment_Testcase 
{
	WebDriver driver;
	Company_Pro_Manage_Assess_Page obj_Company_Pro_Manage_Assess_Page;
	
	public company_pro_manage_assessment_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public void Company_manage_assessment_Testcase() throws Exception
	{
		obj_Company_Pro_Manage_Assess_Page=new Company_Pro_Manage_Assess_Page(driver);
		try
		{
			//obj_Company_Pro_Manage_Assess_Page.Manage_pools();
			//obj_Company_Pro_Manage_Assess_Page.Manage_Questions();
			obj_Company_Pro_Manage_Assess_Page.MYOT_Exam_Duration();
			
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	

}
