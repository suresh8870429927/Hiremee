package Hiremee_candidate_UAT_smoke_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Hiremee_candidate_Testcases 
{
	WebDriver driver;
	Hiremee_candidate_pages candidate_pages;
	public Hiremee_candidate_Testcases(WebDriver canmdriver)
	{
		this.driver=canmdriver;
		PageFactory.initElements(driver, this);

	}
	
	public void candidate_Home_main_page() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try {
			candidate_pages.candidate_Home_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_main_Login() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{
			candidate_pages.candidate_Login();

		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Dashboard_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{
			candidate_pages.candidate_Dashboard();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_My_Profile_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{
			candidate_pages.candidate_My_Profile();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	public void candidate_Take_Online_Assessment_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	
			candidate_pages.candidate_Take_Online_Assessment();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Mock_Assessment_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	
			candidate_pages.candidate_Mock_Assessment();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Take_Mock_Assessment_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	

			candidate_pages.candidate_Take_Mock_Assessment();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Recruiter_Messagge_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	
			candidate_pages.candidate_Recruiter_Messagge();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Current_Openings_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	
			candidate_pages.candidate_Current_Openings();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Current_Walkins_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	
			candidate_pages.candidate_Current_Walkins();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Jobs_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	

			candidate_pages.candidate_Jobs();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Search_Jobs_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	
			candidate_pages.candidate_Search_Jobs();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Applied_Jobs_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	
			candidate_pages.candidate_Applied_Jobs();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Recommended_Jobs_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	
			candidate_pages.candidate_Recommended_Jobs();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Invite_Friends_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	
			candidate_pages.candidate_Invite_Friends();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_FAQS_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	
			candidate_pages.candidate_FAQS();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Feedback_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{	

			candidate_pages.candidate_Feedback();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_Change_password_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{
			candidate_pages.candidate_Change_password();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void candidate_logout_main() throws Exception
	{
		candidate_pages=new Hiremee_candidate_pages(driver);
		try
		{
			candidate_pages.candidate_logout();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
}
