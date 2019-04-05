package Hiremee_College_UAT_smoke_Testing;

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

public class Hiremee_college_Pages extends Hiremee_Smoke_Test_Driver_Initial
{
	//same to company
	@FindBy(how=How.XPATH,using="/html/body/nav/div/div[2]/div/a[1]")
	@CacheLookup
	WebElement college_Login_Link;
	
	@FindBy(how=How.ID,using="email_static")
	@CacheLookup
	WebElement college_Email_Address;
	
	@FindBy(how=How.ID,using="password_static")
	@CacheLookup
	WebElement college_Password;
	
	@FindBy(how=How.NAME,using="v_captcha")
	@CacheLookup
	WebElement college_Captcha_Value;
	
	@FindBy(how=How.ID,using="college_sign_in_static")
	@CacheLookup
	WebElement College_Login_Submit_Button;
	
	@FindBy(how=How.LINK_TEXT,using="Dashboard")
	WebElement Dashboard;
	
	@FindBy(how=How.LINK_TEXT,using="College Profile")
	@CacheLookup
	WebElement College_Profile;
	
	@FindBy(how=How.LINK_TEXT,using="Registered Students")
	@CacheLookup
	WebElement Registered_Students;
	
	@FindBy(how=How.LINK_TEXT,using="Upload Student Details")
	@CacheLookup
	WebElement Upload_Student_Details;
	
	@FindBy(how=How.LINK_TEXT,using="Assessment Scores")
	@CacheLookup
	WebElement Assessment_Scores;
	
	@FindBy(how=How.LINK_TEXT,using="FAQs")
	@CacheLookup
	WebElement FAQs;
	
	@FindBy(how=How.CSS,using=".pcoded-item > li:nth-child(7) > a:nth-child(1) > span:nth-child(2)")
	WebElement Feedback;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[1]/div[1]/div/form/button")
	WebElement College_Feedback_modal;
	
	
	@FindBy(how=How.CSS,using=".ti-angle-down")
	WebElement College_modal;
	
	@FindBy(how=How.CSS,using=".show-notification > li:nth-child(4) > a:nth-child(1)")
	@CacheLookup
	WebElement College_Change_password;
	
	@FindBy(how=How.CSS,using=".show-notification > li:nth-child(6) > a:nth-child(1)")
	@CacheLookup
	WebElement College_Logout;
	
	WebDriver driver;
	Property_File_Config config;
	//String url;
	//String username;
	//String password;
	//excel class object creation
	Excel_Sheet_Config excel=new Excel_Sheet_Config();
	public Hiremee_college_Pages(WebDriver colldriver)
	{
		this.driver=colldriver;
		PageFactory.initElements(driver,this);
	}

	@Test()
	public void College_Home_page() throws Exception
	{	
		logger = extent.createTest("College_Home_page");
		try 
		{
			//url=excel.Read_data(2, 19, 10);
			config=new Property_File_Config();
			driver.get(config.getCollege_url());
			excel.Write_data_pass(2, 19, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(2, 19, 11);
			throw(e);
		}

	}
	@Test()
	public void College_Login() throws Exception
	{
		logger = extent.createTest("College_Login");
		try
		{
			college_Login_Link.click();
			//username=excel.Read_data(2, 20, 10);
			config=new Property_File_Config();
			college_Email_Address.sendKeys(config.getCollege_username());
			//password=excel.Read_data(2, 21, 10);
			college_Password.sendKeys(config.getCollege_password());
			String captchaanswer = JOptionPane.showInputDialog("Enter the answer for above captcha:");
			college_Captcha_Value.sendKeys(captchaanswer);	
			College_Login_Submit_Button.click();
			excel.Write_data_pass(2, 20, 11);
			excel.Write_data_pass(2, 21, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(2, 20, 11);
			excel.Write_data_fail(2, 21, 11);
			throw(e);
		}

	}

	@Test()
	public void College_Dashboard_College() throws Exception
	{
		logger = extent.createTest("College_Dashboard_College");
		try
		{
			Thread.sleep(3000);
			Dashboard.click();
			excel.Write_data_pass(2, 22, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Dashboard, driver);
			Exceptionalert("Dashboard Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(2, 22, 11);
			throw(e);
		}
	}

	@Test()
	public void College_Profile() throws Exception
	{
		logger = extent.createTest("College_Profile");
		try
		{
			ExplicitWait(driver,College_Profile);
			College_Profile.click();
			excel.Write_data_pass(2, 23, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(College_Profile, driver);
			Exceptionalert("College_Profile Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(2, 23, 11);
			throw(e);
		}
	}

	@Test()
	public void Registered_Students() throws Exception
	{
		logger = extent.createTest("Registered_Students");
		try
		{
			ExplicitWait(driver,Registered_Students);
			Registered_Students.click();
			excel.Write_data_pass(2, 24, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Registered_Students, driver);
			Exceptionalert("Registered_Students Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(2, 24, 11);
			throw(e);
		}
	}

	@Test()
	public void Upload_Student_details() throws Exception
	{
		logger = extent.createTest("Upload_Student_details");
		try
		{
			ExplicitWait(driver,Upload_Student_Details);
			Upload_Student_Details.click();
			excel.Write_data_pass(2, 25, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Upload_Student_Details, driver);
			Exceptionalert("Upload_Student_Details Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(2, 25, 11);
			throw(e);
		}
	}

	@Test()
	public void Student_Assessment_result() throws Exception
	{
		logger = extent.createTest("Student_Assessment_result");
		try
		{
			ExplicitWait(driver,Assessment_Scores);
			Assessment_Scores.click();
			excel.Write_data_pass(2, 26, 11);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Drawborder(Assessment_Scores, driver);
			Exceptionalert("Assessment_Scores Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(2, 26, 11);
			throw(e);
		}
	}
	@Test()
	public void FAQ() throws Exception
	{
		logger = extent.createTest("FAQ");

		try {
			ExplicitWait(driver,FAQs);
			FAQs.click();
			excel.Write_data_pass(2, 27, 11);
			Thread.sleep(3000);

		} catch (Exception e) {
			Drawborder(FAQs, driver);
			Exceptionalert("FAQs Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(2, 27, 11);
			throw(e);
		}
	}

	@Test()
	public void Feedback() throws Exception
	{
		logger = extent.createTest("Feedback");
		try {
			ExplicitWait(driver,Feedback);
			Feedback.click();
			ExplicitWait(driver,College_Feedback_modal);
			College_Feedback_modal.click();
			excel.Write_data_pass(2, 28, 11);
			Thread.sleep(3000);

		} catch (Exception e) {
			Drawborder(College_Feedback_modal, driver);
			Exceptionalert("College_Feedback_modal Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(2, 28, 11);
			throw(e);
		}
	}

	@Test()
	public void Change_password() throws Exception
	{
		logger = extent.createTest("Change_password");
		try {

			
			Actions act1=new Actions(driver);
			ExplicitWait(driver,College_modal);
			WebElement qrcode =College_modal;
			Thread.sleep(3000);
			act1.moveToElement(qrcode).click().build().perform();
			College_Change_password.click();
			excel.Write_data_pass(2, 29, 11);
			Thread.sleep(3000);

		} catch (Exception e) {
			Drawborder(College_Change_password, driver);
			Exceptionalert("College_Change_password Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(2, 29, 11);
			throw(e);
		}
	}
	@Test()
	public void Logout() throws Exception
	{
		logger = extent.createTest("Logout");
		try {

			
			Actions act2=new Actions(driver);
			ExplicitWait(driver,College_modal);
			WebElement qrcode1 =College_modal;
			Thread.sleep(3000);
			act2.moveToElement(qrcode1).click().build().perform();
			College_Logout.click();
			excel.Write_data_pass(2, 30, 11);
			Thread.sleep(3000);

		} catch (Exception e) {
			Drawborder(College_Logout, driver);
			Exceptionalert("College_Logout Failed", driver);
			driver.switchTo().alert().accept();
			excel.Write_data_fail(2, 30, 11);
			throw(e);
		}
	}

}

