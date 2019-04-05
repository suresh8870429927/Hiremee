package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Company_Module_Pages.Company_Post_a_job_page;

public class company_posted_a_job_Testcase{
	WebDriver driver;
	Company_Post_a_job_page obj_company_Post_a_job;

	public company_posted_a_job_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Company_Post_a_new_job() throws Exception
	{
		obj_company_Post_a_job=new Company_Post_a_job_page(driver);
		try
		{
			obj_company_Post_a_job.company_Post_a_job();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
}
