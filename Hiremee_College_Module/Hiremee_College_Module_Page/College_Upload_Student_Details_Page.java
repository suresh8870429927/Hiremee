package Hiremee_College_Module_Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import Driver_Started_College_Module.College_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;
import db.DB;

public class College_Upload_Student_Details_Page extends College_Driver_Class
{
	@FindBy(how=How.LINK_TEXT,using="Upload Student Details")
	WebElement college_upload_student_details;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/form/div/label")
	WebElement college_upload_student_details_Browse_Button;

	@FindBy(how=How.ID,using="_submit")
	WebElement college_upload_student_details_submit_button;

	@FindBy(how=How.CLASS_NAME,using="checkmark-round")
	WebElement college_upload_student_details_Invite_Tick;

	@FindBy(how=How.ID,using="resend")
	WebElement college_upload_student_details_Invite_All;

	@FindBy(how=How.XPATH,using="/html/body/div[15]/div[7]/div/button")
	WebElement college_popub_successs;

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

	@FindBy(how=How.XPATH,using="/html/body/center/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td/p/a")
	WebElement Mailtrap_Inbox_Accept_Invitation;

	//college-Registration
	@FindBy(how=How.ID,using="js-v_captcha")
	WebElement College_Registration_captcha_value;

	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div/form/div[2]/div/div/label/span[1]/i")
	WebElement College_Termes_Conditions;

	@FindBy(how=How.ID,using="invite-step-one-register")
	WebElement College_Registration_Submit_Button;

	@FindBy(how=How.ID,using="js-OTP")
	WebElement College_Registration_OTP_Value;

	@FindBy(how=How.ID,using="college-invite-step-two")
	WebElement College_Registration_OTP_Submit_Button;

	@FindBy(how=How.ID,using="js-password")
	WebElement College_Registration_Candidate_Password;

	@FindBy(how=How.ID,using="js-confirmpassword")
	WebElement College_Registration_Candidate_confirm_Password;

	@FindBy(how=How.ID,using="college-invite-auth")
	WebElement College_Registration_Candidate_Register_Button;


	WebDriver driver;
	//mailtrap-details
	String Mailtrap_url="https://mailtrap.io/signin";
	String Email = "surv5e11606@gmail.com";
	String Pwd = "Temp!123";
	static String parent;
	//candidate details
	//String password="123456";
	Excel_Sheet excel=new Excel_Sheet();
	public College_Upload_Student_Details_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void college_Upload_Sudent_Details() throws Exception
	{
		logger=extent.createTest("college_Upload_Sudent_Details");
		try
		{
			Screen s = new Screen();
			Pattern fileInputTextBox = new Pattern("./Sikuli/pattern_images/FileTextBox.PNG");
			Pattern openButton = new Pattern("./Sikuli/pattern_images/OpenButton.PNG");
			Thread.sleep(2000);
			college_upload_student_details.click();
			excel.Write_data_pass(2, 229, 12);
			Thread.sleep(3000);
			college_upload_student_details_Browse_Button.click();
			excel.Write_data_pass(2, 230, 12);
			s.wait(fileInputTextBox,10);
			s.type(fileInputTextBox,"D:\\Automation_directory\\Hiremee_Product_Sanity_Testing\\Sikuli\\Excel_Files\\Studentupload.xlsx");
			s.click(openButton);
			Thread.sleep(3000);
			college_upload_student_details_submit_button.click();
			excel.Write_data_pass(2, 231, 12);
			Thread.sleep(5000);
			college_upload_student_details_Invite_Tick.click();
			excel.Write_data_pass(2, 232, 12);
			Thread.sleep(5000);
			college_upload_student_details_Invite_All.click();
			excel.Write_data_pass(2, 232, 12);
			Thread.sleep(10000);
			college_popub_successs.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(2, 229, 12);
			excel.Write_data_fail(2, 230, 12);
			excel.Write_data_fail(2, 231, 12);
			excel.Write_data_fail(2, 232, 12);
			excel.Write_data_fail(2, 232, 12);
			throw(e);
		}
	}
	@Test
	public void College_candidate_Activation() throws Exception
	{
		logger=extent.createTest("College_candidate_Activation");
		try
		{
			//Mailtrap
			parent=driver.getWindowHandle();
			Robot a=new Robot();
			a.keyPress(KeyEvent.VK_CONTROL);
			a.keyPress(KeyEvent.VK_T);
			a.keyRelease(KeyEvent.VK_CONTROL);
			a.keyRelease(KeyEvent.VK_T);
			Thread.sleep(3000);
			Set<String>s1=driver.getWindowHandles();
			for(String child:s1) {
				if(!parent.equalsIgnoreCase(child))
				{
					driver.switchTo().window(child);
					Thread.sleep(3000);
					driver.get(Mailtrap_url);
					Mailtrap_Username.sendKeys(Email);
					excel.Write_data_pass(2, 235, 12);
					Mailtrap_Password.sendKeys(Pwd);
					excel.Write_data_pass(2, 237, 12);
					Mailtrap_Submit_Button.click();
					excel.Write_data_pass(2, 238, 12);
					Thread.sleep(2000);
					Mailtrap_Inbox_Button.click();
					excel.Write_data_pass(2, 239, 12);
					Thread.sleep(2000);
					//need to change
					Mailtrap_Inbox_Invitation.click();
					excel.Write_data_pass(2, 240, 12);
					Thread .sleep(2000);
					Mailtrap_Inbox_Invitation_New_Tab.click();
					excel.Write_data_pass(2, 241, 12);
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
					Thread.sleep(5000);
					Mailtrap_Inbox_Accept_Invitation.click();
					excel.Write_data_pass(2, 243, 12);
					excel.Write_data_pass(2, 244, 12);
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
					Thread.sleep(3000);
					String captcha=JOptionPane.showInputDialog("Enter captcha value");
					College_Registration_captcha_value.sendKeys(captcha);
					excel.Write_data_pass(2, 246, 12);
					Thread.sleep(3000);
					College_Termes_Conditions.click();
					excel.Write_data_pass(2, 248, 12);
					excel.Write_data_pass(2, 250, 12);
					Thread.sleep(3000);
					College_Registration_Submit_Button.click();
					excel.Write_data_pass(2, 252, 12);
					Thread.sleep(5000);
				}
			}
		}
		catch(Exception e)
		{
			excel.Write_data_fail(2, 235, 12);
			excel.Write_data_fail(2, 237, 12);
			excel.Write_data_fail(2, 238, 12);
			excel.Write_data_fail(2, 239, 12);
			excel.Write_data_fail(2, 240, 12);
			excel.Write_data_fail(2, 241, 12);
			excel.Write_data_fail(2, 243, 12);
			excel.Write_data_fail(2, 244, 12);
			excel.Write_data_fail(2, 246, 12);
			excel.Write_data_fail(2, 248, 12);
			excel.Write_data_fail(2, 250, 12);
			excel.Write_data_fail(2, 252, 12);
			throw(e);
		}
	}		
	@Test
	public void college_Candidate_OTP_Activation() throws Exception
	{
		logger=extent.createTest("college_Candidate_OTP_Activation");
		try
		{
		Thread.sleep(3000);
		College_Registration_OTP_Value.sendKeys(DB.College_Registration_otp);
		Thread.sleep(3000);
		College_Registration_OTP_Submit_Button.click();
		Thread.sleep(3000);
		College_Registration_Candidate_Password.sendKeys(password_Exam);
		College_Registration_Candidate_confirm_Password.sendKeys(password_Exam);
		College_Registration_Candidate_Register_Button.click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

}	
