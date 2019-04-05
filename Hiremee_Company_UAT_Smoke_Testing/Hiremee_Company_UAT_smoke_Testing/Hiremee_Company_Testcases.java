package Hiremee_Company_UAT_smoke_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Hiremee_Company_Testcases 
{	
	WebDriver driver;
	public Hiremee_Company_Testcases(WebDriver cmdriver)
	{
		this.driver=cmdriver;
		PageFactory.initElements(driver,this);
	}
	public void company_Home_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.company_Home_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_login_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.company_login();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Dashboard_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.company_dashboard();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Recruiter_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Recruiter();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Registered_Recruiter_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Registered_recruiter();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Invited_Recruiter_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Invited_recruiter();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_candidate_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Candidate();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_All_candidate_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.All_candidate();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Shortlisted_candidate_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Shortlisted_candidate();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Invited_candidate_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Invited_candidate();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Hired_candidate_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Hired_candidate();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void company_Jobs_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Jobs();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Posted_Jobs_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Posted_Jobs();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void company_Applications_Jobs_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Application_Jobs();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Post_Job_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Post_Jobs();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Search_Candidate_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Search_candidate();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Email_Template_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Email_Template();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_FAQ_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.FAQ();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Feedback_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Feedback();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	public void company_Company_Profile_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Company_profile();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void company_Change_Password_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.Change_password();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	public void company_Logout_main_page() throws Exception
	{
		Hiremee_company_Pages comapany_pages=new Hiremee_company_Pages(driver);
		try {
			comapany_pages.logout();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
}
