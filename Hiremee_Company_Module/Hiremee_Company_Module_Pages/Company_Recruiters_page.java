package Hiremee_Company_Module_Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started_Company_Module.Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Company_Recruiters_page extends Driver_Class{


	//invitation
	@FindBy(how=How.LINK_TEXT,using="Recruiters")
	WebElement company_Recruiters; 	

	@FindBy(how=How.LINK_TEXT,using="Invited")
	WebElement company_recruiter_Invited;

	@FindBy(how=How.ID,using="recruiter-invite-email")
	WebElement company_recruiter_Invite_email;

	@FindBy(how=How.ID,using="recruiter-invite-send")
	WebElement company_recruiter_Invite_send_button;

	@FindBy(how=How.XPATH,using="/html/body/div[15]/div[7]/div/button")
	WebElement Company_upload_success_popub;

	//mailtrap
	@FindBy(how=How.ID,using="user_email")
	WebElement Mailtrap_Username;

	@FindBy(how=How.ID,using="user_password")
	WebElement Mailtrap_Password;

	@FindBy(how=How.NAME,using="commit")
	WebElement Mailtrap_Submit_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[1]/div[1]/strong/a")
	WebElement Mailtrap_Inbox_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div[1]/div/ul/li[1]/div/span[1]/span")
	WebElement Mailtrap_Inbox_Invitation;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/a[2]/div")
	WebElement Mailtrap_Inbox_Invitation_New_Tab;

	@FindBy(how=How.XPATH,using="/html/body/center/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/a")
	WebElement Mailtrap_Inbox_Accept_Invitation;

	//Recruiter Registration
	@FindBy(how=How.ID,using="mobile_number")
	WebElement Recruiter_Mobile_Number;

	@FindBy(how=How.ID,using="fname")
	WebElement Recruiter_fname;

	@FindBy(how=How.ID,using="lname")
	WebElement Recruiter_lname;

	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/form/div/div[2]/div[3]/div/div[1]/div/div/div[1]/label")
	WebElement Recruiter_Gender;

	@FindBy(how=How.ID,using="js-corp-rec-password")
	WebElement Recruiter_password;

	@FindBy(how=How.ID,using="js-corp-rec-confirm_password")
	WebElement Recruiter_confirm_password;

	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/form/div/div[3]/div/button")
	WebElement Recruiter_Register_button;

	//Recruiter Register and limitation
	@FindBy(how=How.LINK_TEXT,using="Registered")
	WebElement company_recruiter_Registered;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[3]/div[2]/div/div[2]/div[2]/div/label/span[2]")
	WebElement company_recruiter_Active_Status;

	@FindBy(how=How.ID,using="js-recruiter-limit-modal")
	WebElement company_recruiter_Registered_Update;
	
	@FindBy(how=How.ID,using="js-no_of_search_day")
	WebElement company_recruiter_Update_Daily_Search;
	
	@FindBy(how=How.ID,using="js-no_of_records_day")
	WebElement company_recruiter_Update_Daily_Record;

	@FindBy(how=How.ID,using="js-no_of_search_month")
	WebElement company_recruiter_Update_Monthly_Search;
	
	@FindBy(how=How.ID,using="js-no_of_select_month")
	WebElement company_recruiter_Update_Monthly_Select;
	
	@FindBy(how=How.ID,using="js-no_select_day")
	WebElement company_recruiter_Update_Daily_Select;
	
	@FindBy(how=How.ID,using="js-corp-rec-limit-update")
	WebElement company_recruiter_Update_Recruiter_limit_button;
	
	WebDriver driver;
	//mailtrap-details
	String Mailtrap_url="https://mailtrap.io/signin";
	String Email = "surv5e11606@gmail.com";
	String Pwd = "Temp!123";
	
	//Recruiter Details
	String Rec_Mobile;
	public static String Recruiter_Email_id;
	public static String Recruiter_Passs="Temp!123";
	String daily_limit;
	String daily_record;
	String Month_search;
	String monthly_select;
	String daily_select;
	Excel_Sheet excel=new Excel_Sheet();
	public Company_Recruiters_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void Recruiter_invite_page() throws Exception
	{
		logger=extent.createTest("Recruiter_invite_page");
		try
		{
		//Recruiter invitation
		ExplicitWait(driver, company_Recruiters);
		company_Recruiters.click();
		excel.Write_data_pass(3, 103, 12);
		excel.Write_data_pass(3, 104, 12);
		ExplicitWait(driver, company_recruiter_Invited);
		company_recruiter_Invited.click();
		excel.Write_data_pass(3, 103, 12);
		Recruiter_Email_id=excel.Read_data(3, 108, 11);
		company_recruiter_Invite_email.sendKeys(Recruiter_Email_id);
		excel.Write_data_pass(3, 108, 12);
		company_recruiter_Invite_send_button.click();
		excel.Write_data_pass(3, 111, 12);
		Thread.sleep(10000);
		Company_upload_success_popub.click();
		//mailtrap
		String parent=driver.getWindowHandle();
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_T);
		a.keyRelease(KeyEvent.VK_CONTROL);
		a.keyRelease(KeyEvent.VK_T);
		Set<String>s1=driver.getWindowHandles();
		for(String child:s1) {
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				Thread.sleep(3000);
				driver.get(Mailtrap_url);
				Mailtrap_Username.sendKeys(Email);
				Mailtrap_Password.sendKeys(Pwd);
				Mailtrap_Submit_Button.click();
				ExplicitWait(driver, Mailtrap_Inbox_Button);
				Mailtrap_Inbox_Button.click();
				ExplicitWait(driver, Mailtrap_Inbox_Invitation);
				//need to change
				Mailtrap_Inbox_Invitation.click();
				ExplicitWait(driver, Mailtrap_Inbox_Invitation_New_Tab);
				Mailtrap_Inbox_Invitation_New_Tab.click();
				driver.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		//window 2
		Thread.sleep(3000);
		Set<String>s2=driver.getWindowHandles();
		for(String child1:s2) {
			if(!parent.equalsIgnoreCase(child1))
			{
				Thread.sleep(3000);
				driver.switchTo().window(child1);
				ExplicitWait(driver, Mailtrap_Inbox_Accept_Invitation);
				Mailtrap_Inbox_Accept_Invitation.click();
				driver.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		//window 3
		Thread.sleep(3000);
		Set<String>s3=driver.getWindowHandles();
		for(String child2:s3) {
			if(!parent.equalsIgnoreCase(child2))
			{
				Thread.sleep(3000);
				driver.switchTo().window(child2);
				ExplicitWait(driver, Recruiter_Mobile_Number);
				Rec_Mobile=excel.Read_data(3, 107, 11);
				Recruiter_Mobile_Number.sendKeys(Rec_Mobile);
				excel.Write_data_pass(4, 20, 12);
				excel.Write_data_pass(3, 107, 12);
				excel.Write_data_pass(4, 21, 12);
				excel.Write_data_pass(4, 22, 12);
				Recruiter_fname.sendKeys("Automation");
				excel.Write_data_pass(4, 24, 12);
				excel.Write_data_pass(4, 26, 12);
				Recruiter_lname.sendKeys("Team");
				excel.Write_data_pass(4, 28, 12);
				ExplicitWait(driver, Recruiter_Gender);
				Recruiter_Gender.click();
				excel.Write_data_pass(4, 30, 12);
				Recruiter_password.sendKeys(Recruiter_Passs);
				Recruiter_confirm_password.sendKeys(Recruiter_Passs);
				ExplicitWait(driver, Recruiter_Register_button);
				Recruiter_Register_button.click();
				excel.Write_data_pass(4, 32, 12);
				excel.Write_data_pass(4, 34, 12);
				excel.Write_data_pass(4, 36, 12);
				excel.Write_data_pass(4, 37, 12);
				Thread.sleep(20000);
				driver.close();
			}
		}	
		Thread.sleep(3000);
		driver.switchTo().window(parent);
	}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 20, 12);
			excel.Write_data_fail(4, 21, 12);
			excel.Write_data_fail(4, 22, 12);
			excel.Write_data_fail(4, 24, 12);
			excel.Write_data_fail(4, 26, 12);
			excel.Write_data_fail(4, 28, 12);
			excel.Write_data_fail(4, 30, 12);
			excel.Write_data_fail(4, 32, 12);
			excel.Write_data_fail(4, 34, 12);
			excel.Write_data_fail(4, 36, 12);
			excel.Write_data_fail(4, 37, 12);
			excel.Write_data_fail(3, 103, 12);
			excel.Write_data_fail(3, 104, 12);
			excel.Write_data_fail(3, 108, 12);
			excel.Write_data_fail(3, 111, 12);
			throw(e);
		}
	}
	@Test
	public void Recruiter_Registered_page() throws Exception
	{
		logger=extent.createTest("Recruiter_Registered_page");
		try
		{
		
		ExplicitWait(driver, company_recruiter_Registered);
		company_recruiter_Registered.click();
		excel.Write_data_pass(3, 91, 12);
		excel.Write_data_pass(3, 92, 12);
		excel.Write_data_pass(3, 95, 12);
		ExplicitWait(driver, company_recruiter_Active_Status);
		company_recruiter_Active_Status.click();
		excel.Write_data_pass(3, 98, 12);
		ExplicitWait(driver, Company_upload_success_popub);
		Company_upload_success_popub.click();
		ExplicitWait(driver, company_recruiter_Registered_Update);
		company_recruiter_Registered_Update.click();
		excel.Write_data_pass(3, 97, 12);
		Thread.sleep(5000);
		company_recruiter_Update_Daily_Search.clear();
		daily_limit=excel.Read_data(3, 93, 11);
		company_recruiter_Update_Daily_Search.sendKeys(daily_limit);
		excel.Write_data_pass(3, 93, 12);
		company_recruiter_Update_Daily_Record.clear();
		daily_record=excel.Read_data(3, 94, 11);
		company_recruiter_Update_Daily_Record.sendKeys(daily_record);
		excel.Write_data_pass(3, 94, 12);
		company_recruiter_Update_Monthly_Search.clear();
		Month_search=excel.Read_data(3, 96, 11);
		company_recruiter_Update_Monthly_Search.sendKeys(Month_search);
		excel.Write_data_pass(3, 96, 12);
		company_recruiter_Update_Monthly_Select.clear();
		monthly_select=excel.Read_data(3, 99, 11);
		company_recruiter_Update_Monthly_Select.sendKeys(monthly_select);
		excel.Write_data_pass(3, 99, 12);
		company_recruiter_Update_Daily_Select.clear();
		daily_select=excel.Read_data(3, 100, 11);
		company_recruiter_Update_Daily_Select.sendKeys(daily_select);
		excel.Write_data_pass(3, 100, 12);
		company_recruiter_Update_Recruiter_limit_button.click();
		excel.Write_data_pass(3, 102, 12);
		ExplicitWait(driver, Company_upload_success_popub);
		Company_upload_success_popub.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 91, 12);
			excel.Write_data_fail(3, 92, 12);
			excel.Write_data_fail(3, 95, 12);
			excel.Write_data_fail(3, 98, 12);
			excel.Write_data_fail(3, 97, 12);
			excel.Write_data_fail(3, 93, 12);
			excel.Write_data_fail(3, 94, 12);
			excel.Write_data_fail(3, 96, 12);
			excel.Write_data_fail(3, 99, 12);
			excel.Write_data_fail(3, 100, 12);
			excel.Write_data_fail(3, 102, 12);
			excel.Write_data_fail(3, 107, 12);
			throw(e);
		}
	}






}
