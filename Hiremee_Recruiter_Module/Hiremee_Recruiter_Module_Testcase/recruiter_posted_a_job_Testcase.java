package Hiremee_Recruiter_Module_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Hiremee_Recruiter_Module_Page.Recruiter_Post_a_job_page;

public class recruiter_posted_a_job_Testcase {
	
	WebDriver driver;
	Recruiter_Post_a_job_page obj_recruiter_Post_a_job;
	
	public recruiter_posted_a_job_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public void Recruiter_Post_a_job() throws Exception
	{
		try 
		{
		//post a job
		obj_recruiter_Post_a_job=new Recruiter_Post_a_job_page(driver);
		obj_recruiter_Post_a_job.Recruiter_Post_a_job();
		}
		catch(Exception e)
		{
			throw(e);
		}
}
}
