package Hiremee_Recruiter_UAT_Smoke_Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
public class Hiremee_Recruiter_Pages extends Hiremee_Smoke_Test_Driver_Initial
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
	
	@FindBy(how=How.CSS,using=".md-trigger > span:nth-child(2)")
	WebElement Feedback;
	
	@FindBy(how=How.CSS,using=".btn-icon-custom")
	WebElement Feedback_mobal;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/nav/div/div[2]/div/ul[2]/li[2]/a/i")
	WebElement Recruiter_modal;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/nav/div/div[2]/div/ul[2]/li[2]/ul/li[1]/a")
	WebElement Recruiter_Profile;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/nav/div/div[2]/div/ul[2]/li[2]/ul/li[2]/a")
	WebElement Recruiter_Change_Password;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/nav/div/div[2]/div/ul[2]/li[2]/ul/li[3]/a")
	WebElement Recruiter_Logout;
	
	@FindBy(how=How.XPATH,using="/html/body/nav/div/div[1]/a/img")
	WebElement Hiremee_Logo;
	
		
	WebDriver driver;
	Property_File_Config config;
	//String url;
	//String username;
	//String password;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String captcha;
	Excel_Sheet_Config excel=new Excel_Sheet_Config();
	public Hiremee_Recruiter_Pages(WebDriver recdriver) 
	{
		this.driver=recdriver;
		PageFactory.initElements(driver,this);
	}
	@Test
	public void Recruiter_Home_page() throws Exception
	{
		logger = extent.createTest("Recruiter_Home_page");
		try 
		{
			//url=excel.Read_data(4, 19, 10);
			config=new Property_File_Config();
			driver.get(config.getRecruiter_url());
			excel.Write_data_pass(4, 19, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 19, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_login() throws Exception
	{
		logger = extent.createTest("Recruiter_login");
		try 
		{
			company_Login_Link.click();
			config=new Property_File_Config();
			//username=excel.Read_data(4, 20, 10);
			company_Email_Address.sendKeys(config.getRecruiter_username());
			//password=excel.Read_data(4, 21, 10);
			company_Paaword.sendKeys(config.getRecruiter_password());
			String captchaanswer = JOptionPane.showInputDialog("Enter the answer for above captcha:");
			company_capcha_value.sendKeys(captchaanswer);
			company_Login_Button_submit.click();
			excel.Write_data_pass(4, 20, 11);
			excel.Write_data_pass(4, 21, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 20, 11);
			excel.Write_data_fail(4, 21, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Dashboard() throws Exception
	{
		logger = extent.createTest("Recruiter_Dashboard");
		try 
		{
			ExplicitWait(driver,Dashboard);
			Dashboard.click();
			excel.Write_data_pass(4, 22, 11);
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			Drawborder(Dashboard, driver);
			Exceptionalert("Dashboard Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 22, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Candidate() throws Exception
	{
		logger = extent.createTest("Recruiter_Candidate");
		try 
		{
			ExplicitWait(driver,Candidates);
			Candidates.click();
			excel.Write_data_pass(4, 23, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Candidates, driver);
			Exceptionalert("Candidates Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 23, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_All_Candidate() throws Exception
	{
		logger = extent.createTest("Recruiter_All_Candidate");
		try 
		{
			ExplicitWait(driver,All_Candidate);
			All_Candidate.click();
			excel.Write_data_pass(4, 24, 11);
			Thread.sleep(3000);

		}
		catch(Exception e)
		{
			Drawborder(All_Candidate, driver);
			Exceptionalert("All_Candidate Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 24, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Shortlisted_Candidate() throws Exception
	{
		logger = extent.createTest("Recruiter_Shortlisted_Candidate");
		try 
		{
			ExplicitWait(driver,Shortlisted_Candidates);
			Shortlisted_Candidates.click();
			excel.Write_data_pass(4, 25, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Shortlisted_Candidates, driver);
			Exceptionalert("Shortlisted_Candidates Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 25, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Invited_Candidate() throws Exception
	{
		logger = extent.createTest("Recruiter_Invited_Candidate");
		try 
		{
			ExplicitWait(driver,Invited_Candidate);
			Invited_Candidate.click();
			excel.Write_data_pass(4, 26, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Invited_Candidate, driver);
			Exceptionalert("Invited_Candidate Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 26, 11);
			throw(e);

		}
	}
	@Test
	public void Recruiter_Hired_Candidate() throws Exception
	{
		logger = extent.createTest("Recruiter_Hired_Candidate");
		try 
		{
			ExplicitWait(driver,Hired_Candidate);
			Hired_Candidate.click();
			excel.Write_data_pass(4, 27, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Hired_Candidate, driver);
			Exceptionalert("Hired_Candidate Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 27, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Jobs() throws Exception
	{
		logger = extent.createTest("Recruiter_Jobs");
		try 
		{
			ExplicitWait(driver,Jobs);
			Jobs.click();
			excel.Write_data_pass(4, 28, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Jobs, driver);
			Exceptionalert("Jobs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 28, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Posted_Jobs() throws Exception
	{
		logger = extent.createTest("Recruiter_Posted_Jobs");
		try 
		{
			ExplicitWait(driver,Posted_Jobs);
			Posted_Jobs.click();
			excel.Write_data_pass(4, 29, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Posted_Jobs, driver);
			Exceptionalert("Posted_Jobs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 29, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Applications() throws Exception
	{
		logger = extent.createTest("Recruiter_Applications");
		try 
		{
			ExplicitWait(driver,Applications);
			Applications.click();
			excel.Write_data_pass(4, 30, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Applications, driver);
			Exceptionalert("Applications Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 30, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Post_Job() throws Exception
	{
		logger = extent.createTest("Recruiter_Post_Job");
		try 
		{
			ExplicitWait(driver,Post_a_Job);
			Post_a_Job.click();
			excel.Write_data_pass(4, 31, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Post_a_Job, driver);
			Exceptionalert("Post_a_Job Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 31, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Search_Candidate() throws Exception
	{
		logger = extent.createTest("Recruiter_Search_Candidate");
		try 
		{
			ExplicitWait(driver,Search_Candidate);
			Search_Candidate.click();
			excel.Write_data_pass(4, 32, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Search_Candidate, driver);
			Exceptionalert("Search_Candidate Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 32, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Email_Template() throws Exception
	{
		logger = extent.createTest("Recruiter_Email_Template");
		try 
		{
			ExplicitWait(driver,Email_Template);
			Email_Template.click();
			excel.Write_data_pass(4, 33, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Email_Template, driver);
			Exceptionalert("Email_Template Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 33, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_FAQs() throws Exception
	{
		logger = extent.createTest("Recruiter_FAQs");
		try 
		{
			ExplicitWait(driver,FAQs);
			FAQs.click();
			excel.Write_data_pass(4, 34, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(FAQs, driver);
			Exceptionalert("FAQs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 34, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Feedback() throws Exception
	{
		logger = extent.createTest("Recruiter_Feedback");
		try 
		{
			ExplicitWait(driver,Feedback);
			Feedback.click();
			ExplicitWait(driver,Feedback_mobal);
			Feedback_mobal.click();
			excel.Write_data_pass(4, 35, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Feedback_mobal, driver);
			Exceptionalert("Feedback_mobal Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 35, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Profile() throws Exception
	{
		logger = extent.createTest("Recruiter_Profile");
		try 
		{
			ExplicitWait(driver,Recruiter_modal);
			Recruiter_modal.click();
			Thread.sleep(3000);
			Recruiter_Profile.click();
			excel.Write_data_pass(4, 36, 11);
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			Drawborder(Recruiter_Profile, driver);
			Exceptionalert("Recruiter_Profile Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 36, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Change_password() throws Exception
	{
		logger = extent.createTest("Recruiter_Change_password");
		try 
		{
			ExplicitWait(driver,Recruiter_modal);
			Recruiter_modal.click();
			Thread.sleep(3000);
			Recruiter_Change_Password.click();
			excel.Write_data_pass(4, 37, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Recruiter_Change_Password, driver);
			Exceptionalert("Recruiter_Change_Password Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 37, 11);
			throw(e);
		}
	}
	@Test
	public void Recruiter_logout() throws Exception
	{
		logger = extent.createTest("Recruiter_logout");
		try 
		{
			ExplicitWait(driver,Recruiter_modal);
			Recruiter_modal.click();
			Thread.sleep(3000);
			Recruiter_Logout.click();
			Thread.sleep(3000);
			Hiremee_Logo.click();
			excel.Write_data_pass(4, 38, 11);
		}
		catch(Exception e)
		{
			Drawborder(Recruiter_Logout, driver);
			Exceptionalert("Recruiter_Logout Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(4, 38, 11);
			throw(e);
		}
	}

}