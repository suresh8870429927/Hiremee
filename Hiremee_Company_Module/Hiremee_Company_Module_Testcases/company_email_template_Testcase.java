package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Company_Module_Pages.Company_Email_Template_Page;

public class company_email_template_Testcase {

	WebDriver driver;
	Company_Email_Template_Page Obj_company_Email_template;

	public company_email_template_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Company_Email_Candidate() throws Exception
	{
		try
		{
		//email template
		Obj_company_Email_template=new Company_Email_Template_Page(driver);
		Obj_company_Email_template.Company_Email_Template();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
}
