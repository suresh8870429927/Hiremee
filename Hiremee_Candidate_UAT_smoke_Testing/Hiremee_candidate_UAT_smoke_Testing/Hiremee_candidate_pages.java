package Hiremee_candidate_UAT_smoke_Testing;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started.Hiremee_Smoke_Test_Driver_Initial;
import Excel_Config.Excel_Sheet_Config;
import Property_File.Property_File_Config;

public class Hiremee_candidate_pages extends Hiremee_Smoke_Test_Driver_Initial 
{
	
	@FindBy(how=How.XPATH,using="(.//*[normalize-space(text()) and normalize-space(.)='About us'])[1]/following::a[2]")
	public WebElement candidate_Login_Link;
	
	@FindBy(how=How.ID,using="js-candi-email_address")
	public WebElement candidate_Email_Address;
	
	@FindBy(how=How.ID,using="js-candi-password")
	public WebElement candidate_Password;
	
	@FindBy(how=How.ID,using="js-candi-captcha")	
	public WebElement Captcha_Value;
	
	@FindBy(how=How.ID,using="js-btn_submit")
	public WebElement Candidate_Login_Submit_Button;
	
	@FindBy(how=How.LINK_TEXT,using="Dashboard")
	public WebElement Dashboard;
	
	@FindBy(how=How.LINK_TEXT,using="My Profile")
	public WebElement My_Profile;
	
	@FindBy(how=How.LINK_TEXT,using="Take Online Assessment")
	public WebElement Take_Online_Assessment;
	
	@FindBy(how=How.LINK_TEXT,using="Mock Assessment")
	public WebElement Mock_Assessment;
	
	@FindBy(how=How.LINK_TEXT,using="Take Mock Assessment")
	public WebElement Take_Mock_Assessment;
	
	@FindBy(how=How.LINK_TEXT,using="Recruiter Messages")
	public WebElement Recruiter_Messages;
	
	@FindBy(how=How.LINK_TEXT,using="Current Openings")
	public WebElement Current_Openings;
	
	@FindBy(how=How.LINK_TEXT,using="Current Walkins")
	public WebElement Current_Walkins;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs")
	public WebElement candidate_Jobs;
	
	@FindBy(how=How.LINK_TEXT,using="Search Jobs")
	public WebElement Search_Jobs;
	
	@FindBy(how=How.LINK_TEXT,using="Applied Jobs")
	public WebElement Applied_Jobs;
	
	@FindBy(how=How.LINK_TEXT,using="Recommended Jobs")
	public WebElement Recommended_Jobs;
	
	@FindBy(how=How.LINK_TEXT,using="Invite Friends")
	public WebElement Invite_Friends;
	
	@FindBy(how=How.LINK_TEXT,using="FAQs")

	public WebElement FAQs;
	
	@FindBy(how=How.CSS,using=".pcoded-item > li:nth-child(11) > a:nth-child(1) > span:nth-child(2)")
	public WebElement Feedback;
	
	@FindBy(how=How.CSS,using="#modal_close")
	public WebElement candidate_Feedback_modal;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/nav/div/div[2]/div/ul[2]/li[3]/a/i")
	public WebElement Candidate_modal;
	
	@FindBy(how=How.LINK_TEXT,using="Change Password")
	public WebElement Candidate_change_Password;
	
	@FindBy(how=How.LINK_TEXT,using="Logout")
	public WebElement Candidate_Logout;
	

	WebDriver driver;
	Property_File_Config config;
	//String Email_id;
	//String password;
	//String url;
	Excel_Sheet_Config excel=new Excel_Sheet_Config();
	public Hiremee_candidate_pages(WebDriver candidriver)
	{
		this.driver=candidriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void candidate_Home_page() throws Exception
	{	Testcase_ID=excel.Read_data(1, 19, 0);
		Expected_Result=excel.Read_data(1, 19, 7);
		logger = extent.createTest("candidate_Home_page");
		try {	
			//url=excel.Read_data(1, 19, 10);
			config=new Property_File_Config();
			driver.get(config.getCandidate_url());
			excel.Write_data_pass(1, 19, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 19, 11);
			throw(e);	
	}
	}
	@Test
	public void candidate_Login() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 21, 0);
		Expected_Result=excel.Read_data(1, 21, 7);
		logger = extent.createTest("candidate_Login");
		try {
			candidate_Login_Link.click();
			//Email_id=excel.Read_data(1, 20, 10);
			config=new Property_File_Config();
			candidate_Email_Address.sendKeys(config.getCandidate_username());
			//password=excel.Read_data(1, 21, 10);
			candidate_Password.sendKeys(config.getCandidate_password());
			String captchaanswer = JOptionPane.showInputDialog("Enter the answer for above captcha:");
			Captcha_Value.sendKeys(captchaanswer);
			Candidate_Login_Submit_Button.click();
			excel.Write_data_pass(1, 20, 11);
			excel.Write_data_pass(1, 21, 11);
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 20, 11);
			excel.Write_data_fail(1, 21, 11);
			throw(e);	
		}
		}
	@Test
	public void candidate_Dashboard() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 22, 0);
		Expected_Result=excel.Read_data(1, 22, 7);
		logger = extent.createTest("candidate_Dashboard");
		try {
			ExplicitWait(driver,Dashboard);
			Dashboard.click();
			excel.Write_data_pass(1, 22, 11);
			
		}
		catch(Exception e)
		{	
			//FailedFlash(Dashboard, driver);
			Drawborder(Dashboard, driver);
			Exceptionalert("Dashboard Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 22, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_My_Profile() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 23, 0);
		Expected_Result=excel.Read_data(1, 23, 7);
		logger = extent.createTest("candidate_My_Profile");
		try {
			ExplicitWait(driver,My_Profile);
			My_Profile.click();
			excel.Write_data_pass(1, 23, 11);
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			Drawborder(My_Profile, driver);
			Exceptionalert("My_Profile Failed", driver);
			excel.Write_data_fail(1, 23, 11);
			throw(e);	
		}
		
	}
	@Test
	public void candidate_Take_Online_Assessment() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 24, 0);
		Expected_Result=excel.Read_data(1, 24, 7);
		logger = extent.createTest("candidate_Take_Online_Assessment");
		try
		{
			ExplicitWait(driver,Take_Online_Assessment);
			Take_Online_Assessment.click();
			Thread.sleep(3000);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_W);
			excel.Write_data_pass(1, 24, 11);
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			Drawborder(Take_Online_Assessment, driver);
			Exceptionalert("Take_Online_Assessment Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 24, 11);
			throw(e);
		}
	}
	@Test
	public void candidate_Mock_Assessment() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 25, 0);
		Expected_Result=excel.Read_data(1, 25, 7);
		logger = extent.createTest("candidate_Mock_Assessment");
		try
		{
			ExplicitWait(driver,Mock_Assessment);
			Mock_Assessment.click();
			excel.Write_data_pass(1, 25, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Mock_Assessment, driver);
			Exceptionalert("Mock_Assessment Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 25, 11);
		}
	}
	@Test
	public void candidate_Take_Mock_Assessment() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 26, 0);
		Expected_Result=excel.Read_data(1, 26, 7);
		logger = extent.createTest("candidate_Take_Mock_Assessment");
		try
		{
			ExplicitWait(driver,Take_Mock_Assessment);
			Take_Mock_Assessment.click();
			excel.Write_data_pass(1, 26, 11);
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			Drawborder(Take_Mock_Assessment, driver);
			Exceptionalert("Take_Mock_Assessment Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 26, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_Recruiter_Messagge() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 27, 0);
		Expected_Result=excel.Read_data(1, 27, 7);
		logger = extent.createTest("candidate_Recruiter_Messagge");
		try
		{
			ExplicitWait(driver,Recruiter_Messages);
			Recruiter_Messages.click();
			excel.Write_data_pass(1, 27, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Recruiter_Messages, driver);
			Exceptionalert("Recruiter_Messages Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 27, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_Current_Openings() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 28, 0);
		Expected_Result=excel.Read_data(1, 28, 7);
		logger = extent.createTest("candidate_Current_Openings");
		try
		{
			ExplicitWait(driver,Current_Openings);
			Current_Openings.click();
			excel.Write_data_pass(1, 28, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Current_Openings, driver);
			Exceptionalert("Current_Openings Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 28, 11);
			throw(e);	
		}
	}
	@Test()
	public void candidate_Current_Walkins() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 29, 0);
		Expected_Result=excel.Read_data(1, 29, 7);
		logger = extent.createTest("candidate_Current_Walkins");
		try
		{	
			ExplicitWait(driver,Current_Walkins);
			Current_Walkins.click();
			excel.Write_data_pass(1, 29, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Current_Walkins, driver);
			Exceptionalert("Current_Walkins Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 29, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_Jobs() throws Exception
	{	
		Testcase_ID=excel.Read_data(1, 30, 0);
		Expected_Result=excel.Read_data(1, 30, 7);
		logger = extent.createTest("candidate_Jobs");
		try
		{	
			ExplicitWait(driver,candidate_Jobs);
			candidate_Jobs.click();
			excel.Write_data_pass(1, 30, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(candidate_Jobs, driver);
			Exceptionalert("candidate_Jobs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 30, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_Search_Jobs() throws Exception
	{	
		Testcase_ID=excel.Read_data(1, 31, 0);
		Expected_Result=excel.Read_data(1, 31, 7);
		logger = extent.createTest("candidate_Search_Jobs");
		try
		{	
			ExplicitWait(driver,Search_Jobs);
			Search_Jobs.click();
			excel.Write_data_pass(1, 31, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Search_Jobs, driver);
			Exceptionalert("Search_Jobs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 31, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_Applied_Jobs() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 32, 0);
		Expected_Result=excel.Read_data(1, 32, 7);
		logger = extent.createTest("candidate_Applied_Jobs");
		try
		{	
			ExplicitWait(driver,Applied_Jobs);
			Applied_Jobs.click();
			excel.Write_data_pass(1, 32, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Applied_Jobs, driver);
			Exceptionalert("Applied_Jobs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 32, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_Recommended_Jobs() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 33, 0);
		Expected_Result=excel.Read_data(1, 33, 7);
		logger = extent.createTest("candidate_Recommended_Jobs");
		try
		{
			ExplicitWait(driver,Recommended_Jobs);
			Recommended_Jobs.click();
			excel.Write_data_pass(1, 33, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Recommended_Jobs, driver);
			Exceptionalert("Recommended_Jobs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 33, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_Invite_Friends() throws Exception
	{	
		Testcase_ID=excel.Read_data(1, 34, 0);
		Expected_Result=excel.Read_data(1, 34, 7);
		logger = extent.createTest("candidate_Invite_Friends");
		try
		{
			ExplicitWait(driver,Invite_Friends);
			Invite_Friends.click();
			excel.Write_data_pass(1, 34, 11);
			Thread.sleep(3000);

		}
		catch(Exception e)
		{
			Drawborder(Invite_Friends, driver);
			Exceptionalert("Invite_Friends Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 34, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_FAQS() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 35, 0);
		Expected_Result=excel.Read_data(1, 35, 7);
		logger = extent.createTest("candidate_FAQS");
		try
		{
			ExplicitWait(driver,FAQs);
			FAQs.click();
			excel.Write_data_pass(1, 35, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(FAQs, driver);
			Exceptionalert("FAQs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 35, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_Feedback() throws Exception
	{	
		Testcase_ID=excel.Read_data(1, 36, 0);
		Expected_Result=excel.Read_data(1, 36, 7);
		logger = extent.createTest("candidate_Feedback");
		try
		{
			ExplicitWait(driver,Feedback);
			Feedback.click();
			ExplicitWait(driver,candidate_Feedback_modal);
			candidate_Feedback_modal.click();
			excel.Write_data_pass(1, 36, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Feedback, driver);
			Exceptionalert("Feedback Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 36, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_Change_password() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 37, 0);
		Expected_Result=excel.Read_data(1, 37, 7);
		logger = extent.createTest("candidate_Change_password");
		try
		{
			ExplicitWait(driver, Candidate_modal);
			WebElement element=Candidate_modal;
			Actions act=new Actions(driver);
			Thread.sleep(3000);
			act.moveToElement(element).build().perform();
			ExplicitWait(driver, Candidate_change_Password);
			Candidate_change_Password.click();
			excel.Write_data_pass(1, 37, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Candidate_change_Password, driver);
			Exceptionalert("Candidate_change_Password Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 37, 11);
			throw(e);	
		}
	}
	@Test
	public void candidate_logout() throws Exception
	{
		Testcase_ID=excel.Read_data(1, 38, 0);
		Expected_Result=excel.Read_data(1, 38, 7);
		logger = extent.createTest("candidate_logout");
		try
		{
			ExplicitWait(driver, Candidate_modal);
			WebElement element1=Candidate_modal;
			Actions act1=new Actions(driver);
			Thread.sleep(3000);
			act1.moveToElement(element1).build().perform();
			ExplicitWait(driver, Candidate_Logout);
			Candidate_Logout.click();
			excel.Write_data_pass(1, 38, 11);
		}
		catch(Exception e)
		{
			Drawborder(Candidate_Logout, driver);
			Exceptionalert("Candidate_Logout Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(1, 38, 11);
			throw(e);	
		}
	}
}	