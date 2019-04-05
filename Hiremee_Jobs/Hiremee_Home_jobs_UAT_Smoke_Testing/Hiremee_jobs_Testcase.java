package Hiremee_Home_jobs_UAT_Smoke_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Hiremee_jobs_Testcase 
{
	WebDriver driver;
	Hiremee_jobs_page obj_Hiremee_jobs_page;
	public Hiremee_jobs_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public void hiremee_home_Testcase() throws Exception
	{
		obj_Hiremee_jobs_page=new Hiremee_jobs_page(driver);
		try
		{
			obj_Hiremee_jobs_page.hiremee_Home_page();
		}
		catch(Exception e) 
		{

			throw(e);
		}
	}
	
	public void hiremee_job_Testcase() throws Exception
	{
		obj_Hiremee_jobs_page=new Hiremee_jobs_page(driver);
		try
		{
			obj_Hiremee_jobs_page.hiremee_job_page();
		}
		catch(Exception e) 
		{

			throw(e);
		}
	}
	
	public void hiremee_job_Hiremee_app_link_Testcase() throws Exception
	{
		obj_Hiremee_jobs_page=new Hiremee_jobs_page(driver);
		try
		{
			obj_Hiremee_jobs_page.hiremee_job_Hiremee_app_link_page();
		}
		catch(Exception e) 
		{

			throw(e);
		}
	}
	public void hiremee_job_View_apply_Testcase() throws Exception
	{
		obj_Hiremee_jobs_page=new Hiremee_jobs_page(driver);
		try
		{
			obj_Hiremee_jobs_page.hiremee_job_View_apply_page();
		}
		catch(Exception e) 
		{

			throw(e);
		}
	}
	
	public void hiremee_job_Home_Icon_Testcase() throws Exception
	{
		obj_Hiremee_jobs_page=new Hiremee_jobs_page(driver);
		try
		{
			obj_Hiremee_jobs_page.hiremee_job_Home_Icon_page();
		}
		catch(Exception e) 
		{

			throw(e);
		}
	}
	public void hiremee_job_Jobs_Icon_Tescase() throws Exception
	{
		obj_Hiremee_jobs_page=new Hiremee_jobs_page(driver);
		try
		{
			obj_Hiremee_jobs_page.hiremee_job_Jobs_Icon_page();
		}
		catch(Exception e) 
		{

			throw(e);
		}
	}
}
