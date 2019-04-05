package Hiremee_Assessment_Module_Testcase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_Assessment_Module_Page.Assessment_Admin_Page;

public class assessment_admin_Testcase {

	WebDriver driver;
	Assessment_Admin_Page obj_Assessment_admin_page;

	public assessment_admin_Testcase(WebDriver ldriver) 
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Assessment_Admin_login_Testcase() throws Exception
	{
		obj_Assessment_admin_page=new Assessment_Admin_Page(driver);
		try 
		{
			obj_Assessment_admin_page.Assessment_admin_login();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_Admin_Exam_center_Testcase() throws Exception
	{
		obj_Assessment_admin_page=new Assessment_Admin_Page(driver);
		try 
		{
			obj_Assessment_admin_page.Assessmnet_Examcenter_creation();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_Admin_create_Exam_Testcase() throws Exception
	{
		obj_Assessment_admin_page=new Assessment_Admin_Page(driver);
		try 
		{
			obj_Assessment_admin_page.Assessmnet_Create_Exam();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Assessment_Admin_Pooled_mapping_Testcase() throws Exception
	{
		obj_Assessment_admin_page=new Assessment_Admin_Page(driver);
		try 
		{
			obj_Assessment_admin_page.Assessmnet_Pooled_Mapping();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

}
