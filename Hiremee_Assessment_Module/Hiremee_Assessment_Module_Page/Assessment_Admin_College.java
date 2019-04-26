package Hiremee_Assessment_Module_Page;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Driver_Started_College_Module.College_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Assessment_Admin_College extends College_Driver_Class
{

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

	@FindBy(how=How.ID,using="a6")
	WebElement Admin_Ussermapping_College_campus;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_dgvUser_lblHireMeeID_0")
	WebElement Hiremee_id_details;

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

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlCollege")
	WebElement Admin_Ussermapping_Select_College;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div[1]/div[2]/div[2]/div[1]/span/div/button")
	WebElement Admin_Ussermapping_Select_College_Search;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div[1]/div[2]/div[2]/div[1]/span/div/ul/li[1]/div/input")
	WebElement Admin_Ussermapping_Select_College_Name;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[1]/span/div/ul/li[2]/a/label/input")
	WebElement Admin_Ussermapping_Select_College_Checkbox;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[2]/span/div/button")
	WebElement Admin_Ussermapping_Select_Degree_Dummy;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[2]/span/span/span")
	WebElement Admin_Ussermapping_Select_Degree_Search;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[2]/span/span/span/div/ul/li[1]/div/input")
	WebElement Admin_Ussermapping_Select_Degree_Name;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[2]/span/span/span/div/ul/li[2]/a/label/input")
	WebElement Admin_Ussermapping_Select_Degree_Checkbox;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[3]/span/div/button")
	WebElement Admin_Ussermapping_Select_Course_Dummy;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[3]/span/span/span")
	WebElement Admin_Ussermapping_Select_Course_Search;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[3]/span/span/span/div/ul/li[3]/a/label")
	WebElement Admin_Ussermapping_Select_Course_Name;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[3]/span/span/span/div/ul/li[2]/a/label/input")
	WebElement Admin_Ussermapping_Select_Course_Checkbox;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[5]/span/div/button")
	WebElement Admin_Ussermapping_Select_Specialization_Dummy;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[5]/span/span/span")
	WebElement Admin_Ussermapping_Select_Specialization_Search;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[5]/span/span/span/div/ul/li[1]/div/input")
	WebElement Admin_Ussermapping_Select_Specialization_Search_Input;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[5]/span/span/span/div/ul/li[14]/a/label")
	WebElement Admin_Ussermapping_Select_Specialization_Name;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[5]/span/span/span/div/ul/li[2]/a/label/input")
	WebElement Admin_Ussermapping_Select_Specialization_Checkbox;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[6]/span/div/button")
	WebElement Admin_Ussermapping_Select_Year_Dummy;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[6]/span/span/span")
	WebElement Admin_Ussermapping_Select_Year_Search;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[6]/span/span/span/div/ul/li[1]/div/input")
	WebElement Admin_Ussermapping_Select_Year_Name;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[6]/span/span/span/div/ul/li[2]/a/label/input")
	WebElement Admin_Ussermapping_Select_Year_Checkbox;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_btnSearch")
	WebElement Admin_Ussermapping_Select_Search;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_dgvUser_chkchild_0")
	WebElement Admin_Ussermapping_College_Mapping_Checkbox;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlExamCenter")
	WebElement Admin_Ussermapping_Mapping_Exam_Center;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlExamName")
	WebElement Admin_Ussermapping_Mapping_Exam_Name;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_btnSubmit")
	WebElement Admin_Ussermapping_Mapping_Exam_Submit;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlExamCenter")
	WebElement Admin_Ussermapping_Mapping_Hall_Ticket_Exam_Center;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_ddlExamName']")
	WebElement Admin_Ussermapping_Mapping_Hall_Ticket_Exam_Name;

	@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_divList']/div[1]/label[2]")
	WebElement Admin_Ussermapping_Mapping_Hall_Ticket_Exam_Name_Link;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlExamName[]")
	WebElement Admin_Ussermapping_Mapping_Hall_Ticket_Exam_Name_checkbox;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlHallTicketStatus")
	WebElement Admin_Ussermapping_Mapping_Hall_Ticket_Status;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_btnSearch")
	WebElement Admin_Ussermapping_Mapping_Hall_Ticket_Search;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_dgvUser_chkbx_0")
	WebElement Admin_Ussermapping_Mapping_Hall_Ticket_Generate_checkbox;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_btnGenerate")
	WebElement Admin_Ussermapping_Mapping_Hall_Ticket_Generate_Sendmail;

	//@FindBy(how=How.XPATH,using="//*[@id='ContentPlaceHolderBody_UpdatePanel1']/div/div/div[2]/div[2]/div[2]/span/div/button")
	//WebElement Admin_Ussermapping_Select_Course_Dummy;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlCourse")
	WebElement Admin_Ussermapping_Select_Course;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlSpecialization")
	WebElement Admin_Ussermapping_Select_Specialization;

	@FindBy(how=How.ID,using="ContentPlaceHolderBody_ddlYear")
	WebElement Admin_Ussermapping_Select_Year;

	WebDriver driver;
	//college
	static String Assessment_admin_url;
	static String admin_username;
	static String admin_password;
	String Venue;
	public static String Hiremee_id;
	static String College_Exam_center;
	String College_Name;
	String Degree;
	String Course;
	String Specialization;
	String Year;
	Excel_Sheet excel=new Excel_Sheet();

	public Assessment_Admin_College(WebDriver ldriver)
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
	public void Assessmnet_Examcenter_creation_College() throws Exception
	{
		logger=extent.createTest("Assessmnet_Examcenter_creation_College");
		try 
		{
			//Exam center create - College
			Thread.sleep(2000);
			Admin_Exam_Center_Master.click();
			Thread.sleep(4000);
			Select center = new Select (Admin_Exam_Center_Type);
			center.selectByIndex(1);
			excel.Write_data_pass(5, 28, 12);
			College_Exam_center=excel.Read_data(5, 29, 11);
			Admin_Exam_Center_Name.sendKeys(College_Exam_center);
			excel.Write_data_pass(5, 29, 12);
			Venue=excel.Read_data(5, 26, 11);
			Admin_Exam_Center_Venue.sendKeys(Venue);
			excel.Write_data_pass(5, 30, 12);
			Admin_Exam_Center_Add_Button.click();
			excel.Write_data_pass(5, 31, 12);
			driver.switchTo().alert().accept();
		}

		catch(Exception e)
		{
			excel.Write_data_fail(5, 28, 12);
			excel.Write_data_fail(5, 29, 12);
			excel.Write_data_fail(5, 30, 12);
			excel.Write_data_fail(5, 31, 12);

			throw(e);
		}
	}


	@Test
	//Assessmnet_Create_Exam - College
	public void  Assessmnet_Create_Exam_College() throws Exception
	{ 	
		logger=extent.createTest("Pooled_Assessmnet_Create_Exam_College");
		try
		{
			Admin_EAssessment.click();
			Thread.sleep(2000);
			Admin_EAssessment_create_exam.click();
			Thread.sleep(3000);
			Select exam_type=new Select (Admin_EAssessment_Exam_center_type);
			exam_type.selectByIndex(1);
			excel.Write_data_pass(5, 41, 12);
			Select exam_center=new Select(Admin_EAssessment_Exam_center);
			exam_center.selectByVisibleText(College_Exam_center);
			excel.Write_data_pass(5, 42, 12);
			Admin_EAssessment_Exam_center.sendKeys(Keys.ENTER);
			Admin_EAssessment_Exam_Expiry_date.click();
			String actual="/html/body/div[3]/div[1]/table/tbody/tr[";
			String middle="]/td[";
			String end="]";
			// Create object of SimpleDateFormat class and decide the format
			DateFormat dateFormat = new SimpleDateFormat("d");
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
			excel.Write_data_pass(5, 43, 12);
			Select course=new Select(Admin_EAssessment_Exam_course);
			course.selectByIndex(8);
			excel.Write_data_pass(5, 44, 12);
			Admin_EAssessment_Exam_specilization.click();
			excel.Write_data_pass(5, 45, 12);
			Admin_EAssessment_Exam_Instruction.sendKeys("College Exam created");
			excel.Write_data_pass(5, 46, 12);
			Thread.sleep(2000);
			Admin_EAssessment_Exam_Submit_Button.click();
			excel.Write_data_pass(5, 47, 12);
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(5, 41, 12);
			excel.Write_data_fail(5, 42, 12);
			excel.Write_data_fail(5, 43, 12);
			excel.Write_data_fail(5, 44, 12);
			excel.Write_data_fail(5, 45, 12);
			excel.Write_data_fail(5, 46, 12);
			excel.Write_data_fail(5, 47, 12);
			throw(e);
		}
	}


	@Test
	public void  Assessmnet_College_Mapping() throws Exception
	{
		logger=extent.createTest("Assessmnet_College_Mapping");
		try
		{
			
			//	driver.get(Assessment_admin_url);
			Admin_Usermanagement.click();
			Thread.sleep(1000);
			College_Exam_center=excel.Read_data(5, 29, 11);
			Admin_Ussermapping_College_campus.click();
			excel.Write_data_pass(5, 50, 12);
			Thread.sleep(2000);
			Admin_Ussermapping_Select_College_Search.click();
			Thread.sleep(2000);
			College_Name=excel.Read_data(5, 51, 11);
			Admin_Ussermapping_Select_College_Name.sendKeys(College_Name);
			Thread.sleep(2000);
			Admin_Ussermapping_Select_College_Checkbox.click();
			excel.Write_data_pass(5, 51, 12);
			Thread.sleep(2000);
			Admin_Ussermapping_Select_Degree_Dummy.click();
			Thread.sleep(2000);
			Admin_Ussermapping_Select_Degree_Search.click();
			Thread.sleep(2000);
			Degree=excel.Read_data(5, 52, 11);
			Admin_Ussermapping_Select_Degree_Name.sendKeys(Degree);
			Thread.sleep(2000);
			Admin_Ussermapping_Select_Degree_Checkbox.click();
			excel.Write_data_pass(5, 52, 12);
			Thread.sleep(3000);
			Admin_Ussermapping_Select_Course_Dummy.click();
			Thread.sleep(3000);
			Admin_Ussermapping_Select_Course_Search.click();
			Thread.sleep(2000);
			Course=excel.Read_data(5, 53, 11);
			Admin_Ussermapping_Select_Course_Name.sendKeys(Course);
			Thread.sleep(2000);
			Admin_Ussermapping_Select_Course_Checkbox.click();
			Thread.sleep(3000);
			excel.Write_data_pass(5, 53, 12);
			Admin_Ussermapping_Select_Specialization_Dummy.click();
			Thread.sleep(3000);
			Admin_Ussermapping_Select_Specialization_Search.click();
			Thread.sleep(3000);
			Specialization=excel.Read_data(5, 54, 11);
			Admin_Ussermapping_Select_Specialization_Search_Input.sendKeys(Specialization);
			Thread.sleep(2000);
			Admin_Ussermapping_Select_Specialization_Checkbox.click();
			excel.Write_data_pass(5, 54, 12);
			Thread.sleep(2000);
			Admin_Ussermapping_Select_Year_Dummy.click();
			Thread.sleep(2000);
			Admin_Ussermapping_Select_Year_Search.click();
			Thread.sleep(2000);
			Year=excel.Read_data(5, 55, 11);
			Admin_Ussermapping_Select_Year_Name.sendKeys(Year);
			Thread.sleep(2000);
			Admin_Ussermapping_Select_Year_Checkbox.click();
			Thread.sleep(3000);
			excel.Write_data_pass(5, 55, 12);
			Admin_Ussermapping_Select_Search.click();
			excel.Write_data_pass(5, 56, 12);
			Thread.sleep(8000);
			Hiremee_id=Hiremee_id_details.getText();
			System.out.println("HireMee Id:" + Hiremee_id);
			Admin_Ussermapping_College_Mapping_Checkbox.click();
			Thread.sleep(3000);
			Select Map_Exam_Center =new Select(Admin_Ussermapping_Mapping_Exam_Center);
			Map_Exam_Center.selectByVisibleText(College_Exam_center);
			excel.Write_data_pass(5, 58, 12);
			Thread.sleep(3000);
			//Select Map_Exam_Name =new Select(Admin_Ussermapping_Mapping_Exam_Name);
			//Map_Exam_Name.selectByIndex(2);
			excel.Write_data_pass(5, 59, 12);
			Admin_Ussermapping_Mapping_Exam_Submit.click();
			excel.Write_data_pass(5, 60, 12);
			Thread.sleep(1000);
			driver.switchTo().alert().accept();

			
			/*
			//hall ticket
			//driver.findElement(By.id("a8")).click();
			Select Hall_Ticket_Exam_Center =new Select(Admin_Ussermapping_Mapping_Hall_Ticket_Exam_Center);
			Hall_Ticket_Exam_Center.selectByIndex(1);
			//Hall_Ticket_Exam_Center.selectByVisibleText("VeeTesting2");
			Thread.sleep(5000);
			Admin_Ussermapping_Mapping_Hall_Ticket_Exam_Name.click();
			Thread.sleep(2000);
			Admin_Ussermapping_Mapping_Hall_Ticket_Exam_Name_Link.click();
			Thread.sleep(2000);
			Admin_Ussermapping_Mapping_Hall_Ticket_Status.click();
			Select Hall_Ticket_Status =new Select(Admin_Ussermapping_Mapping_Hall_Ticket_Status);
			Hall_Ticket_Status.selectByVisibleText("Generate");
			Thread.sleep(1000);
			Admin_Ussermapping_Mapping_Hall_Ticket_Search.click();
			Thread.sleep(1000);
			Admin_Ussermapping_Mapping_Hall_Ticket_Generate_checkbox.click();
			Thread.sleep(1000);
			System.out.println("db Check");
			Thread.sleep(1000);
*/
		}
		catch(Exception e)
		{
			excel.Write_data_fail(5, 50, 12);
			excel.Write_data_fail(5, 51, 12);
			excel.Write_data_fail(5, 52, 12);
			excel.Write_data_fail(5, 53, 12);
			excel.Write_data_fail(5, 54, 12);
			excel.Write_data_fail(5, 55, 12);
			excel.Write_data_fail(5, 56, 12);
			excel.Write_data_fail(5, 58, 12);
			excel.Write_data_fail(5, 59, 12);
			throw(e);
		}
	}


}
