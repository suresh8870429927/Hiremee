package Hiremee_Company_UAT_smoke_Testing;

import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started.Hiremee_Smoke_Test_Driver_Initial;
import Excel_Config.Excel_Sheet_Config;
import Property_File.Property_File_Config;
public class Hiremee_company_Pages extends Hiremee_Smoke_Test_Driver_Initial
{
	@FindBy(how=How.XPATH,using="/html/body/nav/div/div[2]/div/a[1]")
	WebElement company_Login_Link;
	
	@FindBy(how=How.ID,using="js-corp-login-username")
	WebElement company_Email_Address;
	
	@FindBy(how=How.ID,using="js-corp-login-password")
	WebElement company_Paaword;
	
	@FindBy(how=How.ID,using="js-corp-login-v_captcha")
	WebElement company_capcha_value;
	
	@FindBy(how=How.ID,using="corporate-login-submit")
	WebElement company_Login_Button_submit;
	
	@FindBy(how=How.LINK_TEXT,using="Dashboard")
	WebElement Dashboard;
	
	@FindBy(how=How.LINK_TEXT,using="Recruiters")
	WebElement Recruiters;
	
	@FindBy(how=How.LINK_TEXT,using="Registered")
	WebElement Registered;
	
	@FindBy(how=How.LINK_TEXT,using="Invited")
	WebElement Invited;
	
	@FindBy(how=How.LINK_TEXT,using="Candidates")
	WebElement Candidates;
	
	@FindBy(how=How.LINK_TEXT,using="All Candidate")
	WebElement All_Candidate;
	
	@FindBy(how=How.LINK_TEXT,using="Shortlisted Candidates")
	WebElement Shortlisted_Candidates;
	
	@FindBy(how=How.LINK_TEXT,using="Invited Candidate")
	WebElement Invited_Candidate;
	
	@FindBy(how=How.LINK_TEXT,using="Hired Candidate")
	WebElement Hired_Candidate;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs")
	WebElement Jobs;
	
	@FindBy(how=How.LINK_TEXT,using="Posted Jobs")
	WebElement Posted_Jobs;
	
	@FindBy(how=How.LINK_TEXT,using="Applications")
	WebElement Applications;
	
	@FindBy(how=How.LINK_TEXT,using="Post a Job")
	WebElement Post_a_Job;
	
	@FindBy(how=How.LINK_TEXT,using="Search Candidate")
	WebElement Search_Candidate;
	
	@FindBy(how=How.LINK_TEXT,using="Email Template")
	WebElement Email_Template;
	
	@FindBy(how=How.LINK_TEXT,using="FAQs")
	WebElement FAQs;
	
	@FindBy(how=How.LINK_TEXT,using="Feedback")
	WebElement Feedback;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/form/div/button")
	WebElement Feedback_mobal_close;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[1]/nav/div[2]/div[1]/div/div[1]/div[1]/div[2]/span[2]/i")
	WebElement Company_modal;
	
	@FindBy(how=How.LINK_TEXT,using="Company Profile")
	WebElement Company_Profile;
	
	@FindBy(how=How.LINK_TEXT,using="Change Password")
	WebElement Company_Change_Password;
	
	@FindBy(how=How.LINK_TEXT,using="Logout")
	WebElement Company_Logout;
	
	WebDriver driver;
	Property_File_Config config;
	//String url;
	//String username;
	//String password;
	Excel_Sheet_Config excel=new Excel_Sheet_Config();
	public Hiremee_company_Pages(WebDriver comdriver)
	{
		this.driver=comdriver;
		PageFactory.initElements(driver,this);
	}

	@Test
	public void company_Home_page() throws Exception
	{
		Testcase_ID=excel.Read_data(3, 19, 0);
		Expected_Result=excel.Read_data(3, 19, 7);
		logger = extent.createTest("company_Home_page");
		try
		{
			//url=excel.Read_data(3, 19, 10);
			config=new Property_File_Config();
			driver.get(config.getCompany_url());
			excel.Write_data_pass(3, 19, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 19, 11);
			throw(e);
		}
	}

	@Test
	public void company_login() throws Exception
	{
		Testcase_ID=excel.Read_data(3, 21, 0);
		Expected_Result=excel.Read_data(3, 21, 7);
		logger = extent.createTest("company_login");
		try
		{
			config=new Property_File_Config();
			company_Login_Link.click();
			//username=excel.Read_data(3, 20, 10);
			company_Email_Address.sendKeys(config.getCompany_username());
			//password=excel.Read_data(3, 21, 10);
			company_Paaword.sendKeys(config.getCompany_password());
			String captchaanswer = JOptionPane.showInputDialog("Enter the answer for above captcha:");
			company_capcha_value.sendKeys(captchaanswer);
			company_Login_Button_submit.click();
			excel.Write_data_pass(3, 20, 11);
			excel.Write_data_pass(3, 21, 11);
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 20, 11);
			excel.Write_data_fail(3, 21, 11);
			throw(e);
		}
	}

	@Test
	public void company_dashboard() throws Exception
	{
		Testcase_ID=excel.Read_data(3, 22, 0);
		Expected_Result=excel.Read_data(3, 22, 7);
		logger = extent.createTest("company_dashboard");
		try
		{	ExplicitWait(driver,Dashboard);
			Dashboard.click();
			excel.Write_data_pass(3, 22, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Dashboard, driver);
			Exceptionalert("Dashboard Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 22, 11);
			throw(e);
		}
	}


	@Test
	public void Recruiter() throws Exception
	{
		Testcase_ID=excel.Read_data(3, 23, 0);
		Expected_Result=excel.Read_data(3, 23, 7);
		logger = extent.createTest("Recruiter");
		try 
		{
			ExplicitWait(driver,Recruiters);
			Recruiters.click();
			excel.Write_data_pass(3, 23, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Recruiters, driver);
			Exceptionalert("Recruiters Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 23, 11);
			throw(e);
		}
	}
	@Test
	public void Registered_recruiter() throws Exception
	{
		Testcase_ID=excel.Read_data(3, 24, 0);
		Expected_Result=excel.Read_data(3, 24, 7);
		logger = extent.createTest("Registered_recruiter");
		try
		{
			ExplicitWait(driver,Registered);
			Registered.click();
			excel.Write_data_pass(3, 24, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Registered, driver);
			Exceptionalert("Registered Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 24, 11);
			throw(e);
		}
	}
	@Test
	public void Invited_recruiter()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 25, 0);
		Expected_Result=excel.Read_data(3, 25, 7);
		logger = extent.createTest("Invited_recruiter");
		try
		{
			ExplicitWait(driver,Invited);
			Invited.click();
			excel.Write_data_pass(3, 25, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Invited, driver);
			Exceptionalert("Invited Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 25, 11);
			throw(e);
		}
	}
	@Test
	public void Candidate()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 26, 0);
		Expected_Result=excel.Read_data(3, 26, 7);
		logger = extent.createTest("Candidate");
		try
		{
			ExplicitWait(driver,Candidates);
			Candidates.click();
			excel.Write_data_pass(3, 26, 11);
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			Drawborder(Candidates, driver);
			Exceptionalert("Candidates Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 26,11);
			throw(e);
		}
	}
	@Test
	public void All_candidate()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 27, 0);
		Expected_Result=excel.Read_data(3, 27, 7);
		logger = extent.createTest("All_candidate");
		try
		{
			ExplicitWait(driver,All_Candidate);
			All_Candidate.click();
			excel.Write_data_pass(3, 27, 11);
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			Drawborder(All_Candidate, driver);
			Exceptionalert("All_Candidate Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 27, 11);
			throw(e);
		}
	}
	@Test
	public void Shortlisted_candidate()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 28, 0);
		Expected_Result=excel.Read_data(3, 28, 7);
		logger = extent.createTest("Shortlisted_candidate");
		try
		{
			ExplicitWait(driver,Shortlisted_Candidates);
			Shortlisted_Candidates.click();
			excel.Write_data_pass(3, 28, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Shortlisted_Candidates, driver);
			Exceptionalert("Shortlisted_Candidates Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 28, 11);
			throw(e);
		}
	}
	@Test
	public void Invited_candidate()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 29, 0);
		Expected_Result=excel.Read_data(3, 29, 7);
		logger = extent.createTest("Invited_candidate");
		try
		{
			ExplicitWait(driver,Invited_Candidate);
			Invited_Candidate.click();
			excel.Write_data_pass(3, 29, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Invited_Candidate, driver);
			Exceptionalert("Invited_Candidate Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 29, 11);
			throw(e);
		}
	}
	@Test
	public void Hired_candidate()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 30, 0);
		Expected_Result=excel.Read_data(3, 30, 7);
		logger = extent.createTest("Hired_candidate");
		try
		{
			ExplicitWait(driver,Hired_Candidate);
			Hired_Candidate.click();
			excel.Write_data_pass(3, 30, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Hired_Candidate, driver);
			Exceptionalert("Hired_Candidate Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 30, 11);
			throw(e);
		}
	}
	@Test
	public void Jobs()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 31, 0);
		Expected_Result=excel.Read_data(3, 31, 7);
		logger = extent.createTest("Jobs");
		try
		{
			ExplicitWait(driver,Jobs);
			Jobs.click();
			excel.Write_data_pass(3, 31, 11);
			Thread.sleep(3000);
		}
		catch(Exception e) 
		{
			Drawborder(Jobs, driver);
			Exceptionalert("Jobs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 31, 11);
			throw(e);
		}
	}
	@Test
	public void Posted_Jobs()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 32, 0);
		Expected_Result=excel.Read_data(3, 32, 7);
		logger = extent.createTest("Posted_Jobs");
		try
		{
			ExplicitWait(driver,Posted_Jobs);
			Posted_Jobs.click();
			excel.Write_data_pass(3, 32, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Posted_Jobs, driver);
			Exceptionalert("Posted_Jobs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 32, 11);
			throw(e);
		}
	}
	@Test
	public void Application_Jobs()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 33, 0);
		Expected_Result=excel.Read_data(3, 33, 7);
		logger = extent.createTest("Application_Jobs");
		try
		{
			ExplicitWait(driver,Applications);
			Applications.click();
			excel.Write_data_pass(3, 33, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Applications, driver);
			Exceptionalert("Applications Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 33, 11);
			throw(e);
		}
	}
	@Test
	public void Post_Jobs()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 34, 0);
		Expected_Result=excel.Read_data(3, 34, 7);
		logger = extent.createTest("Post_Jobs");
		try
		{
			ExplicitWait(driver,Post_a_Job);
			Post_a_Job.click();
			excel.Write_data_pass(3, 34, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Post_a_Job, driver);
			Exceptionalert("Post_a_Job Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 34, 11);
			throw(e);
		}
	}
	@Test
	public void Search_candidate()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 35, 0);
		Expected_Result=excel.Read_data(3, 35, 7);
		logger = extent.createTest("Search_candidate");
		try
		{
			ExplicitWait(driver,Search_Candidate);
			Search_Candidate.click();
			excel.Write_data_pass(3, 35, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Search_Candidate, driver);
			Exceptionalert("Search_Candidate Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 35 , 11);
			throw(e);
		}
	}
	@Test
	public void Email_Template()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 36, 0);
		Expected_Result=excel.Read_data(3, 36, 7);
		logger = extent.createTest("Email_Template");
		try
		{
			ExplicitWait(driver,Email_Template);
			Email_Template.click();
			excel.Write_data_pass(3, 36, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Email_Template, driver);
			Exceptionalert("Email_Template Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 36, 11);
			throw(e);
		}
	}
	@Test
	public void FAQ()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 37, 0);
		Expected_Result=excel.Read_data(3, 37, 7);
		logger = extent.createTest("FAQ");
		try {
			ExplicitWait(driver,FAQs);
			FAQs.click();
			excel.Write_data_pass(3, 37, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(FAQs, driver);
			Exceptionalert("FAQs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 37, 11);
			throw(e);
		}
	}
	@Test
	public void Feedback()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 38, 0);
		Expected_Result=excel.Read_data(3, 38, 7);
		logger = extent.createTest("Feedback");
		try
		{	
			ExplicitWait(driver,Feedback);
			Feedback.click();
			ExplicitWait(driver,Feedback_mobal_close);
			Feedback_mobal_close.click();
			excel.Write_data_pass(3, 38, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Feedback_mobal_close, driver);
			Exceptionalert("Feedback_mobal Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 38, 11);
			throw(e);
		}
	}
	@Test
	public void Company_profile()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 39, 0);
		Expected_Result=excel.Read_data(3, 39, 7);
		logger = extent.createTest("Company_profile");
		try
		{
			ExplicitWait(driver,Company_modal);
			Company_modal.click();
			Thread.sleep(3000);
			Company_Profile.click();
			excel.Write_data_pass(3, 39, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Company_Profile, driver);
			Exceptionalert("Company_Profile Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 39, 11);
			throw(e);
		}
	}
	@Test
	public void Change_password()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 40, 0);
		Expected_Result=excel.Read_data(3, 40, 7);
		logger = extent.createTest("Change_password");
		try
		{
			ExplicitWait(driver,Company_modal);
			Company_modal.click();
			Thread.sleep(3000);
			Company_Change_Password.click();
			excel.Write_data_pass(3, 40, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Company_Change_Password, driver);
			Exceptionalert("Company_Change_Password Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 40, 11);
			throw(e);
		}
	}
	@Test
	public void logout()throws Exception
	{
		Testcase_ID=excel.Read_data(3, 41, 0);
		Expected_Result=excel.Read_data(3, 41, 7);
		logger = extent.createTest("logout");
		try
		{
			ExplicitWait(driver,Company_modal);
			Company_modal.click();
			Thread.sleep(3000);
			Company_Logout.click();
			excel.Write_data_pass(3, 41, 11);
		}
		catch(Exception e)
		{
			Drawborder(Company_Logout, driver);
			Exceptionalert("Company_Logout Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(3, 41, 11);
			throw(e);
		}
	}
}
