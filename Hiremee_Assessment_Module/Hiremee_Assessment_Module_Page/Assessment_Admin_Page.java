package Hiremee_Assessment_Module_Page;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Assessment_Admin_Page extends Candidate_Driver_Class {

	@FindBy(how=How.ID,using="txtUserName")
	WebElement Admin_username;

	@FindBy(how=How.ID,using="txtPassword")
	WebElement Admin_Password;

	@FindBy(how=How.ID,using="txtCaptcha")
	WebElement Admin_captcha_value;

	@FindBy(how=How.ID,using="btnLogin")
	WebElement Admin_login_button;

	@FindBy(how=How.ID,using="a2")
	WebElement Admin_Exam_Center_Master;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlExamCenterType")
	WebElement Admin_Exam_Center_Type;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_txtName")
	WebElement Admin_Exam_Center_Name;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_txtVenue")
	WebElement Admin_Exam_Center_Venue;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_btnAdd")
	WebElement Admin_Exam_Center_Add_Button;

	@FindBy(how=How.ID,using="aEassessment")
	WebElement Admin_EAssessment;

	@FindBy(how=How.ID,using="liEassessmentCreateExam")
	WebElement Admin_EAssessment_create_exam;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlExamCentreType")
	WebElement Admin_EAssessment_Exam_center_type;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlExamCentre")
	WebElement Admin_EAssessment_Exam_center;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_txtExpiryDate")
	WebElement Admin_EAssessment_Exam_Expiry_date;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlCourse")
	WebElement Admin_EAssessment_Exam_course;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_chlSpecialization_11")
	WebElement Admin_EAssessment_Exam_specilization;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_txtExamInstruction")
	WebElement Admin_EAssessment_Exam_Instruction;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_btnSubmit")
	WebElement Admin_EAssessment_Exam_Submit_Button;

	@FindBy(how=How.ID,using="aUserMgtMaster")
	WebElement Admin_Usermanagement;

	@FindBy(how=How.ID,using="liUserMappingPooled")
	WebElement Admin_Ussermapping_pooled_campus;
	
	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlExamCenter")
	WebElement Admin_Ussermapping_pooled_Exam_center;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_btnSearch")
	@CacheLookup
	WebElement Admin_Ussermapping_pooled_Search_Button;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_dgvUser_chkUserID_0")
	WebElement Admin_Ussermapping_pooled_check_box;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_btnSubmit")
	WebElement Admin_Ussermapping_pooled_User_Submit_Button;
	
	@FindBy(how=How.ID,using="ContentPlaceHolderBody_dgvUser_lblHireMeeID_0")
	WebElement Hiremee_id_details;

	WebDriver driver;
	static String Assessment_admin_url;
	static String admin_username;
	static String admin_password;
	String Venue;
	//public static String Exam_center;
	//public static String Hiremee_id;
	Excel_Sheet excel=new Excel_Sheet();

	public Assessment_Admin_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void Assessment_admin_login() throws Exception
	{
		logger=extent.createTest("Assessment_admin_login");
		try 
		{
			Assessment_admin_url=excel.Read_data(5, 19, 11);
			driver.get(Assessment_admin_url);
			excel.Write_data_pass(5, 19, 12);
			admin_username=excel.Read_data(5, 20, 11);
			Admin_username.sendKeys(admin_username);
			excel.Write_data_pass(5, 20, 12);
			admin_password=excel.Read_data(5, 21, 11);
			Admin_Password.sendKeys(admin_password);
			excel.Write_data_pass(5, 21, 12);
			String captcha=JOptionPane.showInputDialog("Enter the answer for above captcha:");
			Admin_captcha_value.sendKeys(captcha);
			Admin_login_button.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(5, 19, 12);
			excel.Write_data_fail(5, 20, 12);
			excel.Write_data_fail(5, 21, 12);
			throw(e);
		}

	}
	@Test
	public void  Assessmnet_Examcenter_creation() throws Exception
	{
		logger=extent.createTest("Assessmnet_Examcenter_creation");
		try 
		{
			//Exam center create
			Thread.sleep(2000);
			Admin_Exam_Center_Master.click();
			excel.Write_data_pass(5, 22, 12);
			excel.Write_data_pass(5, 23, 12);
			Thread.sleep(4000);
			Select center = new Select (Admin_Exam_Center_Type);
			center.selectByIndex(2);
			excel.Write_data_pass(5, 24, 12);
			Exam_center=excel.Read_data(5, 25, 11);
			Admin_Exam_Center_Name.sendKeys(Exam_center);
			excel.Write_data_pass(5, 25, 12);
			Venue=excel.Read_data(5, 26, 11);
			Admin_Exam_Center_Venue.sendKeys(Venue);
			excel.Write_data_pass(5, 26, 12);
			Admin_Exam_Center_Add_Button.click();
			excel.Write_data_pass(5, 27, 12);
			driver.switchTo().alert().accept();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(5, 22, 12);
			excel.Write_data_fail(5, 23, 12);
			excel.Write_data_fail(5, 24, 12);
			excel.Write_data_fail(5, 25, 12);
			excel.Write_data_fail(5, 26, 12);
			excel.Write_data_fail(5, 27, 12);
			throw(e);
		}
	}
	@Test
	public void  Assessmnet_Create_Exam() throws Exception
	{ 	logger=extent.createTest("Assessmnet_Create_Exam");
	try
	{
		Admin_EAssessment.click();
		excel.Write_data_pass(5, 32, 12);
		Thread.sleep(2000);
		Admin_EAssessment_create_exam.click();
		excel.Write_data_pass(5, 33, 12);
		Thread.sleep(3000);
		Select exam_type=new Select (Admin_EAssessment_Exam_center_type);
		exam_type.selectByIndex(2);
		excel.Write_data_pass(5, 34, 12);
		Select exam_center=new Select(Admin_EAssessment_Exam_center);
		exam_center.selectByVisibleText(Exam_center);
		excel.Write_data_pass(5, 35, 12);
		Admin_EAssessment_Exam_center.sendKeys(Keys.ENTER);
		Admin_EAssessment_Exam_Expiry_date.click();
		String actual="/html/body/div[3]/div[1]/table/tbody/tr[";
		String middle="]/td[";
		String end="]";
	
		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("dd");
		Date date = new Date();
		String date1= dateFormat.format(date);
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=7;j++)
			{
				WebElement ele1=driver.findElement(By.xpath(actual + i + middle + j + end));
				String value=ele1.getText();
				//System.out.println(value);
				if(value.equals(date1))
				{
					ele1.click();
					Thread.sleep(1000);

				}
			}
		}
		excel.Write_data_pass(5, 36, 12);
		Select course=new Select(Admin_EAssessment_Exam_course);
		course.selectByIndex(8);
		excel.Write_data_pass(5, 37, 12);
		Admin_EAssessment_Exam_specilization.click();
		excel.Write_data_pass(5, 38, 12);
		Admin_EAssessment_Exam_Instruction.sendKeys("Exam created");
		excel.Write_data_pass(5, 39, 12);
		Thread.sleep(2000);
		Admin_EAssessment_Exam_Submit_Button.click();
		excel.Write_data_pass(5, 40, 12);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}
	catch(Exception e)
	{
		excel.Write_data_fail(5, 32, 12);
		excel.Write_data_fail(5, 33, 12);
		excel.Write_data_fail(5, 34, 12);
		excel.Write_data_fail(5, 35, 12);
		excel.Write_data_fail(5, 36, 12);
		excel.Write_data_fail(5, 37, 12);
		excel.Write_data_fail(5, 38, 12);
		excel.Write_data_fail(5, 39, 12);
		excel.Write_data_fail(5, 40, 12);
		throw(e);
	}
	}

	@Test
	public void  Assessmnet_Pooled_Mapping() throws Exception
	{
		logger=extent.createTest("Assessmnet_Pooled_Mapping");
		try
		{
			//need to change-->Admin Login
			Thread.sleep(3000);
			driver.get(Assessment_admin_url);
			Admin_username.sendKeys(admin_username);
			Admin_Password.sendKeys(admin_password);
			String captcha=JOptionPane.showInputDialog("Enter the answer for above captcha:");
			Admin_captcha_value.sendKeys(captcha);
			Admin_login_button.click();

			//pooled-mapping
			Thread.sleep(2000);
			Admin_Usermanagement.click();
			excel.Write_data_pass(5, 49, 12);
			Thread.sleep(2000);
			Admin_Ussermapping_pooled_campus.click();
			excel.Write_data_pass(5, 61, 12);
			Thread.sleep(2000);
			Select Map =new Select(Admin_Ussermapping_pooled_Exam_center);
			Map.selectByVisibleText(Exam_center);
			//Admin_Ussermapping_pooled_Exam_center.sendKeys(Keys.ENTER);
			excel.Write_data_pass(5, 63, 12);
			System.out.println("first");
			Thread.sleep(5000);
			Admin_Ussermapping_pooled_Search_Button.click();
			System.out.println("second");
			excel.Write_data_pass(5, 64, 12);
			Thread.sleep(5000);
			Hiremee_id=Hiremee_id_details.getText();
			System.out.println("HireMee Id:" + Hiremee_id);
			Admin_Ussermapping_pooled_check_box.click();
			excel.Write_data_pass(5, 65, 12);
			Thread.sleep(2000);
			Admin_Ussermapping_pooled_User_Submit_Button.click();
			excel.Write_data_pass(5, 66, 12);
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(5, 49, 12);
			excel.Write_data_fail(5, 61, 12);
			excel.Write_data_fail(5, 63, 12);
			excel.Write_data_fail(5, 64, 12);
			excel.Write_data_fail(5, 65, 12);
			excel.Write_data_fail(5, 66, 12);
			throw(e);
		}
	}
}


