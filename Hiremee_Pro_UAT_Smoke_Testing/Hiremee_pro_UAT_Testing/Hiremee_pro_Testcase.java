package Hiremee_pro_UAT_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Hiremee_pro_Testcase 
{
	WebDriver driver;
	Hiremee_pro_pages obj_Hiremee_pro_pages;
	public Hiremee_pro_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public void Hiremee_PRO_Home_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Home_page_PRO();
	
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Login_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_login_PRO();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	
	public void Hiremee_PRO_Dashboard_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_dashboard_PRO();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Purchase_Assessment_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_dashboard_Purchase_Assessment_Button();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Manage_Assessment_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Manage_Assessment();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Manage_Assessment_manage_pools_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Manage_Assessment_manage_pools();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Manage_Assessment_manage_Questions_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Manage_Assessment_manage_Questions();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Manage_Assessment_My_Questions_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Manage_Assessment_my_Questions();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Manage_Assessment_MYOT_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Manage_Assessment_MYOT();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Book_Assessment_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Book_Assessment();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Book_Assessment_upload_Candidates_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Book_Assessment_upload_candidates();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Manage_Candidates_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Manage_candidates();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Mnage_Candidates_Invite_pendings_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Manage_candidates_Invite_pending();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Manage_Candidates_Invite_Send_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Manage_candidates_Invite_Send();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Mnage_Candidates_Test_Started_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Manage_candidates_Test_Started();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_Mnage_Candidates_Test_Expired_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Manage_candidates_Test_Expired();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_View_Result_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_View_Result();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Hiremee_PRO_logout_Testcase() throws Exception
	{
		obj_Hiremee_pro_pages=new Hiremee_pro_pages(driver);
		
		try
		{
			obj_Hiremee_pro_pages.company_Logout_End();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
