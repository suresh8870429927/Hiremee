package Hiremee_Recruiter_UAT_Smoke_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Hiremee_Recruiter_Testcases 
{
	WebDriver driver;
	Hiremee_Recruiter_Pages _Recruiter_pages;
	public Hiremee_Recruiter_Testcases(WebDriver rmcdriver)
	{
		this.driver=rmcdriver;
		PageFactory.initElements(driver,this);
	}
	public void Recruiter_Home_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Home_page();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}

	public void Recruiter_login_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_login();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void Recruiter_Dashboard_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Dashboard();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_Candidate_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Candidate();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_All_Candidate_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_All_Candidate();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_Shortlisted_Candidate_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Shortlisted_Candidate();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_Invited_Candidate_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Invited_Candidate();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
		
	public void Recruiter_Hired_Candidate_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Hired_Candidate();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_jobs_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Jobs();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_Posted_jobs_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Posted_Jobs();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_Application_jobs_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Applications();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_Post_jobs_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Post_Job();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_Search_candidate_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Search_Candidate();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
		
	public void Recruiter_Email_Template_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Email_Template();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_FAQ_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_FAQs();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
		
	public void Recruiter_Feedback_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Feedback();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_Profile_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_Profile();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	
	public void Recruiter_Change_password_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		
		_Recruiter_pages.Recruiter_Change_password();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void Recruiter_Change_Logout_main_page() throws Exception
	{
		_Recruiter_pages=new Hiremee_Recruiter_Pages(driver);
		try {
		_Recruiter_pages.Recruiter_logout();
	}
		catch(Exception e)
		{
			throw(e);
		}
	}
}

