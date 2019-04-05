package Hiremee_pro_UAT_Testing;

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

public class Hiremee_pro_pages extends Hiremee_Smoke_Test_Driver_Initial
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

	@FindBy(how=How.LINK_TEXT,using="Purchase Assessment")
	WebElement Company_Purchase_Assessment_button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/form/div/button")
	WebElement Company_Purchase_Assessment_close_button;

	@FindBy(how=How.LINK_TEXT,using="Manage Assessment")
	WebElement Company_Manage_Assessment_link;


	@FindBy(how=How.LINK_TEXT,using="Manage Pools")
	WebElement Company_Manage_pools_link;

	@FindBy(how=How.LINK_TEXT,using="Manage Questions")
	WebElement Company_Manage_Questions_link;

	@FindBy(how=How.LINK_TEXT,using="My Questions")
	WebElement Company_My_Question_link;

	@FindBy(how=How.LINK_TEXT,using="MYOT")
	WebElement Company_MYOT_Link;

	@FindBy(how=How.LINK_TEXT,using="Book Assessment")
	WebElement Company_Book_Assessment_link;

	@FindBy(how=How.LINK_TEXT,using="Bulk Assessment Booking")
	WebElement Company_Bulk_Assessment_Booking_link;
	
	@FindBy(how=How.LINK_TEXT,using="Single Assessment Booking")
	WebElement Company_Single_Assessment_Booking_link;

	@FindBy(how=How.LINK_TEXT,using="Manage Candidate")
	WebElement Company_Manage_Candidates_link;

	@FindBy(how=How.LINK_TEXT,using="Invites Pending")
	WebElement Company_Invites_pending_link;

	@FindBy(how=How.LINK_TEXT,using="Invites Sent")
	WebElement Company_Invites_Send_link;

	@FindBy(how=How.LINK_TEXT,using="Test Started")
	WebElement Company_Test_Started_Link;

	@FindBy(how=How.LINK_TEXT,using="Test Expired")
	WebElement Company_Test_Expired_link;

	@FindBy(how=How.LINK_TEXT,using="View Result")
	WebElement Company_View_Result_Link;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/nav/div/div[2]/div/ul[2]/li[2]/a/i")
	WebElement Company_modal;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/nav/div/div[2]/div/ul[2]/li[2]/ul/li[3]/a")
	WebElement Company_Logout;

	WebDriver driver;
	Property_File_Config config;
	//String url;
	//String username;
	//String password;
	Excel_Sheet_Config excel=new Excel_Sheet_Config();
	public Hiremee_pro_pages(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void company_Home_page_PRO() throws Exception
	{
		logger = extent.createTest("company_Home_page");
		try
		{
			//url=excel.Read_data(8, 19, 10);
			config=new Property_File_Config();
			driver.get(config.getCompany_url());
			excel.Write_data_pass(8, 19, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 19, 11);
			throw(e);
		}
	}

	@Test
	public void company_login_PRO() throws Exception
	{
		logger = extent.createTest("company_login");
		try

		{
			company_Login_Link.click();
			config=new Property_File_Config();
			//username=excel.Read_data(8, 20, 10);
			company_Email_Address.sendKeys(config.getCompany_username());
			//password=excel.Read_data(8, 21, 10);
			company_Paaword.sendKeys(config.getCompany_password());
			String captchaanswer = JOptionPane.showInputDialog("Enter the answer for above captcha:");
			company_capcha_value.sendKeys(captchaanswer);
			company_Login_Button_submit.click();
			excel.Write_data_pass(8, 20, 11);
			excel.Write_data_pass(8, 21, 11);
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 20, 11);
			excel.Write_data_fail(8, 21, 11);
			throw(e);
		}
	}

	@Test
	public void company_dashboard_PRO() throws Exception
	{
		logger = extent.createTest("company_dashboard");
		try
		{	ExplicitWait(driver,Dashboard);
		Dashboard.click();
		excel.Write_data_pass(8, 22, 11);
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Dashboard, driver);
			Exceptionalert("Dashboard Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(8, 22, 11);
			throw(e);
		}
	}


	@Test
	public void company_dashboard_Purchase_Assessment_Button() throws Exception
	{
		logger = extent.createTest("company_dashboard_Purchase_Assessment_Button");
		try
		{	
			ExplicitWait(driver,Company_Purchase_Assessment_button);
			Company_Purchase_Assessment_button.click();
			ExplicitWait(driver,Company_Purchase_Assessment_close_button);
			Company_Purchase_Assessment_close_button.click();
			excel.Write_data_pass(8, 23, 11);
			excel.Write_data_pass(8, 24, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 23, 11);
			excel.Write_data_fail(8, 24, 11);
			throw(e);
		}
	}

	@Test
	public void company_Manage_Assessment() throws Exception
	{
		logger = extent.createTest("company_Manage_Assessment");
		try
		{
			ExplicitWait(driver,Company_Manage_Assessment_link);
			Company_Manage_Assessment_link.click();
			excel.Write_data_pass(8, 25, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 25, 11);
			throw(e);
		}

	}

	@Test
	public void company_Manage_Assessment_manage_pools() throws Exception
	{
		logger = extent.createTest("company_Manage_Assessment_manage_pools");
		try
		{
			ExplicitWait(driver,Company_Manage_pools_link);
			Company_Manage_pools_link.click();
			excel.Write_data_pass(8, 26, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 26, 11);
			throw(e);
		}
	}

	@Test
	public void company_Manage_Assessment_manage_Questions() throws Exception
	{
		logger = extent.createTest("company_Manage_Assessment_manage_Questions");
		try
		{
			ExplicitWait(driver,Company_Manage_Questions_link);
			Company_Manage_Questions_link.click();
			excel.Write_data_pass(8, 27, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 27, 11);
			throw(e);
		}

	}

	@Test
	public void company_Manage_Assessment_my_Questions() throws Exception
	{
		logger = extent.createTest("company_Manage_Assessment_my_Questions");
		try
		{
			ExplicitWait(driver,Company_My_Question_link);
			Company_My_Question_link.click();
			excel.Write_data_pass(8, 28, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 28, 11);
			throw(e);
		}

	}
	@Test
	public void company_Manage_Assessment_MYOT() throws Exception
	{
		logger = extent.createTest("company_Manage_Assessment_MYOT");
		try
		{
			ExplicitWait(driver,Company_MYOT_Link);
			Company_MYOT_Link.click();
			excel.Write_data_pass(8, 29, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 29, 11);
			throw(e);
		}

	}

	@Test
	public void company_Book_Assessment() throws Exception
	{
		logger = extent.createTest("company_Book_Assessment");
		try
		{
			ExplicitWait(driver,Company_Book_Assessment_link);
			Company_Book_Assessment_link.click();
			excel.Write_data_pass(8, 30, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 30, 11);
			throw(e);
		}

	}


	@Test
	public void company_Book_Assessment_upload_candidates() throws Exception
	{
		logger = extent.createTest("company_Book_Assessment_upload_candidates");
		try
		{
			ExplicitWait(driver,Company_Bulk_Assessment_Booking_link);
			Company_Bulk_Assessment_Booking_link.click();
			excel.Write_data_pass(8, 31, 11);
			ExplicitWait(driver,Company_Single_Assessment_Booking_link);
			Company_Single_Assessment_Booking_link.click();
			
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 31, 11);
			throw(e);
		}

	}

	@Test
	public void company_Manage_candidates() throws Exception
	{
		logger = extent.createTest("company_Manage_candidates");
		try
		{
			ExplicitWait(driver,Company_Manage_Candidates_link);
			Company_Manage_Candidates_link.click();
			excel.Write_data_pass(8, 32, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 32, 11);
			throw(e);
		}

	}

	@Test
	public void company_Manage_candidates_Invite_pending() throws Exception
	{
		logger = extent.createTest("company_Manage_candidates_Invite_pending");
		try
		{
			ExplicitWait(driver,Company_Invites_pending_link);
			Company_Invites_pending_link.click();
			excel.Write_data_pass(8, 33, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 33, 11);
			throw(e);
		}

	}


	@Test
	public void company_Manage_candidates_Invite_Send() throws Exception
	{
		logger = extent.createTest("company_Manage_candidates_Invite_Send");
		try
		{
			ExplicitWait(driver,Company_Invites_Send_link);
			Company_Invites_Send_link.click();
			excel.Write_data_pass(8, 34, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 34, 11);
			throw(e);
		}

	}

	@Test
	public void company_Manage_candidates_Test_Started() throws Exception
	{
		logger = extent.createTest("company_Manage_candidates_Test_Started");
		try
		{
			ExplicitWait(driver,Company_Test_Started_Link);
			Company_Test_Started_Link.click();
			excel.Write_data_pass(8, 35, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 35, 11);
			throw(e);
		}

	}

	@Test
	public void company_Manage_candidates_Test_Expired() throws Exception
	{
		logger = extent.createTest("company_Manage_candidates_Test_Expired");
		try
		{
			ExplicitWait(driver,Company_Test_Expired_link);
			Company_Test_Expired_link.click();
			excel.Write_data_pass(8, 36, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 36, 11);
			throw(e);
		}

	}


	@Test
	public void company_View_Result() throws Exception
	{
		logger = extent.createTest("company_View_Result");
		try
		{
			ExplicitWait(driver,Company_View_Result_Link);
			Company_View_Result_Link.click();
			excel.Write_data_pass(8, 37, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 37, 11);
			throw(e);
		}

	}


	@Test
	public void company_Logout_End() throws Exception
	{
		logger = extent.createTest("company_View_Result");
		try
		{
			ExplicitWait(driver,Company_modal);
			Company_modal.click();
			Thread.sleep(3000);
			Company_Logout.click();
			excel.Write_data_pass(8, 38, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(8, 38, 11);
			throw(e);
		}

	}











}