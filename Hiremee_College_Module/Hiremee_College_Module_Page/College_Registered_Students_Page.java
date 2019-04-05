package Hiremee_College_Module_Page;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_College_Module.College_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class College_Registered_Students_Page extends College_Driver_Class
{

	@FindBy(how=How.ID,using="email_static")
	WebElement college_login_username;

	@FindBy(how=How.ID,using="password_static")
	WebElement college_login_password;

	@FindBy(how=How.ID,using="college_sign_in_static")
	WebElement college_login_Button;
	
	@FindBy(how=How.NAME,using="v_captcha")
	WebElement college_login_Captcha;
	
	@FindBy(how=How.LINK_TEXT,using="Registered Students")
	WebElement College_Registered_Students;

	@FindBy(how=How.ID,using="js-profile-detailed-view")
	WebElement College_Registered_Student_Profile;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div[4]/div[2]/div[1]/div/a")
	WebElement College_Registered_Student_Profile_Assessment_Report;
	

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/button")
	WebElement College_Registered_Student_Profile_Close;

	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet();
	public College_Registered_Students_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void College_Registered_student() throws Exception
	{
		logger=extent.createTest("College_Registered_student");
		try
		{
			/*
			//login
			Hiremee_college_url=excel.Read_data(2, 61, 11);
			driver.get(Hiremee_college_url);
			college_login_username.sendKeys(Email_id);
			password=excel.Read_data(2, 67, 11);
			college_login_password.sendKeys(password);
			String captcha=JOptionPane.showInputDialog("Enter the captcha");
			college_login_Captcha.sendKeys(captcha);
			college_login_Button.click();
			*/
			//Registered students
			driver.get(Hiremee_college_url);
			ExplicitWait(driver,College_Registered_Students);
			College_Registered_Students.click();
			excel.Write_data_pass(2, 218, 12);			
			ExplicitWait(driver,College_Registered_Student_Profile);
			College_Registered_Student_Profile.click();
			excel.Write_data_pass(2, 225, 12);	
			ExplicitWait(driver,College_Registered_Student_Profile_Assessment_Report);
			College_Registered_Student_Profile_Assessment_Report.click();
			ExplicitWait(driver,College_Registered_Student_Profile_Close);
			College_Registered_Student_Profile_Close.click();
			excel.Write_data_pass(2, 228, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(2, 218, 12);	
			excel.Write_data_fail(2, 225, 12);	
			excel.Write_data_fail(2, 228, 12);
			throw(e);
		}
	}
}
