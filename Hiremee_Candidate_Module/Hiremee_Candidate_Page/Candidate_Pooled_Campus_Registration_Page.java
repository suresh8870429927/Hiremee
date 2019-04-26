package Hiremee_Candidate_Page;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;
import Hiremee_Assessment_Module_Page.Assessment_Admin_Page;
import db.DB;

public class Candidate_Pooled_Campus_Registration_Page extends Candidate_Driver_Class
{
	@FindBy(how=How.ID,using="select2-select1-container")
	WebElement Exam_center_id;

	@FindBy(how=How.CLASS_NAME,using="select2-search__field")
	WebElement Registration_input_dropdown_class_name;

	@FindBy(how=How.NAME,using="first_name")
	WebElement Registration_First_name;

	@FindBy(how=How.ID,using="mobile_number")
	WebElement Registration_Mobile_Number;

	@FindBy(how=How.ID,using="email_address")
	WebElement Registration_Email_Address;

	@FindBy(how=How.ID,using="password")
	WebElement Registration_Password;

	@FindBy(how=How.ID,using="select2-select2-container")
	WebElement Registration_Course_Type;

	@FindBy(how=How.ID,using="select2-select3-container")
	WebElement Registration_Course;

	@FindBy(how=How.ID,using="select2-select4-container")
	WebElement Registration_specilization;

	@FindBy(how=How.ID,using="select2-select5-container")
	WebElement Registration_university;

	@FindBy(how=How.ID,using="select2-select6-container")
	WebElement Registration_college;

	@FindBy(how=How.ID,using="select2-select7-container")
	WebElement Registration_year_of_completion;

	@FindBy(how=How.ID,using="pooled_register")
	WebElement Registration_submit_Button;

	@FindBy(how=How.NAME,using="otp_code")
	WebElement Registration_OTP_Code;

	@FindBy(how=How.XPATH,using="//input[@id='pooled-otp-verify'][@type='submit']")
	WebElement Registration_OTP_Verify_submit_button;

	WebDriver driver;
	String pooled_Url;
	
	//need to hide
	//String Exam_center;	
	
	String F_name;
	String Mobile_number;
	public static String Email_id;
	
	//need to hide
	//String password;
	 
	String Course_Type;
	String Course;
	String Specialization;
	String University;
	String College;
	String Yr_Completion;
	Excel_Sheet excel=new Excel_Sheet();
	public Candidate_Pooled_Campus_Registration_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	@Test
	
	public void pooled_campus_registration() throws Exception
	{
		logger=extent.createTest("pooled_campus_registration");
		try 
		{
			pooled_Url=excel.Read_data(6, 19, 11);
			driver.get(pooled_Url);
			excel.Write_data_pass(6, 19, 12);
			Exam_center_id.click();
			ExplicitWait(driver, Registration_input_dropdown_class_name);
			Registration_input_dropdown_class_name.sendKeys(Assessment_Admin_Page.Exam_center);
			ExplicitWait(driver, Registration_input_dropdown_class_name);
			Registration_input_dropdown_class_name.sendKeys(Keys.ENTER);
			excel.Write_data_pass(6, 20, 12);
			F_name=excel.Read_data(6, 22, 11);
			Registration_First_name.sendKeys(F_name);
			excel.Write_data_pass(6, 22, 12);
			Mobile_number=excel.Read_data(6, 24, 11);
			Thread.sleep(2000);
			Registration_Mobile_Number.sendKeys(Mobile_number);
			excel.Write_data_pass(6, 24, 12);
			ExplicitWait(driver, Registration_Email_Address);
			Email_id=excel.Read_data(6, 26, 11);
			Registration_Email_Address.sendKeys(Email_id);
			excel.Write_data_pass(6, 26, 12);
			password=excel.Read_data(6, 28, 11);
			Registration_Password.sendKeys(password);
			excel.Write_data_pass(6, 28, 12);
			Thread.sleep(3000);
			Registration_Course_Type.click();
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			Course_Type=excel.Read_data(6, 21, 11);
			Registration_input_dropdown_class_name.sendKeys(Course_Type);
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			Registration_input_dropdown_class_name.sendKeys(Keys.ENTER);
			excel.Write_data_pass(6, 21, 12);
			Thread.sleep(3000);
			Registration_Course.click();
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			Course=excel.Read_data(6, 23, 11);
			Registration_input_dropdown_class_name.sendKeys(Course);
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			Registration_input_dropdown_class_name.sendKeys(Keys.ENTER);
			excel.Write_data_pass(6, 23, 12);
			Thread.sleep(3000);
			Registration_specilization.click();
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			Specialization=excel.Read_data(6, 25, 11);
			Registration_input_dropdown_class_name.sendKeys(Specialization);
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			Registration_input_dropdown_class_name.sendKeys(Keys.ENTER);
			excel.Write_data_pass(6, 25, 12);
			Thread.sleep(3000);
			Registration_university.click();
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			University=excel.Read_data(6, 27, 11);
			Registration_input_dropdown_class_name.sendKeys(University);
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			Registration_input_dropdown_class_name.sendKeys(Keys.ENTER);
			excel.Write_data_pass(6, 27, 12);
			Thread.sleep(3000);
			Registration_college.click();
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			College=excel.Read_data(6, 29, 11);
			Registration_input_dropdown_class_name.sendKeys(College);
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			Registration_input_dropdown_class_name.sendKeys(Keys.ENTER);
			excel.Write_data_pass(6, 29, 12);
			Thread.sleep(3000);
			Registration_year_of_completion.click();
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			Yr_Completion=excel.Read_data(6, 30, 11);
			Registration_input_dropdown_class_name.sendKeys(Yr_Completion);
			ExplicitWait(driver,Registration_input_dropdown_class_name);
			Registration_input_dropdown_class_name.sendKeys(Keys.ENTER);
			excel.Write_data_pass(6, 30, 12);
			Registration_submit_Button.click();	
			excel.Write_data_pass(6, 31, 12);
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(6, 19, 12);
			excel.Write_data_fail(6, 20, 12);
			excel.Write_data_fail(6, 22, 12);
			excel.Write_data_fail(6, 24, 12);
			excel.Write_data_fail(6, 26, 12);
			excel.Write_data_fail(6, 28, 12);
			excel.Write_data_fail(6, 21, 12);
			excel.Write_data_fail(6, 23, 12);
			excel.Write_data_fail(6, 25, 12);
			excel.Write_data_fail(6, 27, 12);
			excel.Write_data_fail(6, 30, 12);
			excel.Write_data_fail(6, 31, 12);
			throw(e);
		}
	}
	@Test
	
	public void Registration_OTP_Verification() throws Exception
	{
		logger=extent.createTest("Registration_OTP_Verification");
		try
		{
		Thread.sleep(3000);
		System.out.println(DB.pooled_otp_final);
		excel.Write_data_pass(6, 32, 12);
		excel.Write_data_pass(6, 33, 12);
		excel.Write_data_pass(6, 34, 12);
		Registration_OTP_Code.sendKeys(DB.pooled_otp_final);
		Thread.sleep(3000);
		Registration_OTP_Verify_submit_button.click();
		excel.Write_data_pass(6, 35, 12);
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(6, 32, 12);
			excel.Write_data_fail(6, 33, 12);
			excel.Write_data_fail(6, 34, 12);
			excel.Write_data_fail(6, 35, 12);
			throw(e);
		}

	}
}
