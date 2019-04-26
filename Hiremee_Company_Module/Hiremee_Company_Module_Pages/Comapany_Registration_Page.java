package Hiremee_Company_Module_Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Company_Module.Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Comapany_Registration_Page  extends Driver_Class
{	
	//company register
	@FindBy(how=How.ID,using="js-corp-companyname")
	WebElement company_names;

	@FindBy(how=How.ID,using="js-corp-register-mobile_number")
	WebElement company_mobile_number;

	@FindBy(how=How.ID,using="js-corp-register-email_address")
	WebElement company_email_address;

	@FindBy(how=How.ID,using="js-corp-spoc")
	WebElement company_spoc_name;

	@FindBy(how=How.ID,using="js-corp-register-password")
	WebElement company_registered_password;

	@FindBy(how=How.ID,using="js-corp-register-confirm_password")
	WebElement company_registered_confirm_password;


	@FindBy(how=How.ID,using="js-corp-register-website")
	WebElement company_registered_website;

	@FindBy(how=How.ID,using="js-corp-reg-v_captcha")
	WebElement company_captcha_value;

	@FindBy(how=How.XPATH,using="/html/body/div/div[1]/div/div[2]/div/form/div[2]/div[5]/div/div/label/span[1]/i")
	WebElement company_Termes_condition;

	@FindBy(how=How.XPATH,using="/html/body/div/div[1]/div/div[2]/div/form/div[2]/div[6]/div[1]/button")
	WebElement company_Register_submit;

	//ops portal
	@FindBy(how=How.ID,using="email")
	WebElement Opsportal_email_id;

	@FindBy(how=How.ID,using="password")
	WebElement Opsportal_password;

	@FindBy(how=How.ID,using="captcha")
	WebElement ops_captcha_value;

	@FindBy(how=How.ID,using="login_submit")
	WebElement ops_login_submit;

	@FindBy(how=How.LINK_TEXT,using="Company Details")
	WebElement ops_company_details;

	@FindBy(how=How.XPATH,using="/html/body/section/section/div/div/div/div[2]/div[1]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[6]/div/label[2]")
	WebElement ops_company_activation_status;

	@FindBy(how=How.NAME,using="adnote")
	WebElement ops_company_Activation_notes;

	@FindBy(how=How.ID,using="activestatus")
	WebElement ops_company_Activation_submit;

	@FindBy(how=How.XPATH,using="//*[@id=\"edittablemodal\"]")
	WebElement ops_company_Edit;

	@FindBy(how=How.ID,using="typesearch_perday_company")
	WebElement ops_company_Search_per_day;

	@FindBy(how=How.ID,using="typenoofrecords_serach_Company")
	WebElement ops_company_Number_of_Search;

	@FindBy(how=How.ID,using="typenoofselected_day_company")
	WebElement ops_company_Number_of_selected;

	@FindBy(how=How.ID,using="typesearch_permonth_company")
	WebElement ops_company_Search_per_month;

	@FindBy(how=How.ID,using="typenoofselected_month_company")
	WebElement ops_company_Selected_per_month;

	@FindBy(how=How.ID,using="typeno_of_recruiter")
	WebElement ops_company_Number_of_record;

	@FindBy(how=How.ID,using="UpdateButton")
	WebElement ops_company_Edit_update_button;

	WebDriver driver;
	String company_register_url;
	String company_captcha,ops_portal_captcha;
	String company_name;
	String company_Mobile;
	static String company_Email;
	static String company_Password;
	String company_Website;
	String company_spoc;
	
	//Negative Inputs
	static String company_negative_Inputs;
	
	//ops portal
	String hiremee_url_opsportal="http://172.18.1.87:82/";
	String ops_portal_username="pjxraj@gmail.com";
	String ops_portal_password="Temp@123";

	Excel_Sheet excel=new Excel_Sheet();
	public Comapany_Registration_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void company_register_page() throws Exception 
	{
		logger = extent.createTest("company_register_page");
		try 
		{
			//company-register
			company_register_url=excel.Read_data(3, 19, 11);
			driver.get(company_register_url);
			excel.Write_data_pass(3, 19, 12);
			excel.Write_data_pass(3, 20, 12);
			company_name=excel.Read_data(3, 21, 11);
			company_names.sendKeys(company_name);
			excel.Write_data_pass(3, 21, 12);
			company_Email=excel.Read_data(3, 26, 11);
			company_email_address.sendKeys(company_Email);
			excel.Write_data_pass(3, 26, 12);
			company_Mobile=excel.Read_data(3, 28, 11);
			company_mobile_number.sendKeys(company_Mobile);
			excel.Write_data_pass(3, 28, 12);
			company_spoc=excel.Read_data(3, 33, 11);
			company_spoc_name.sendKeys(company_spoc);
			excel.Write_data_pass(3, 33, 12);
			company_Password=excel.Read_data(3, 37, 11);
			company_registered_password.sendKeys(company_Password);
			excel.Write_data_pass(3, 37, 12);
			company_Password=excel.Read_data(3, 41, 11);
			company_registered_confirm_password.sendKeys(company_Password);
			excel.Write_data_pass(3, 41, 12);
			excel.Write_data_pass(3, 43, 12);
			company_Website=excel.Read_data(3, 44, 11);
			company_registered_website.sendKeys(company_Website);
			excel.Write_data_pass(3, 44, 12);
			company_captcha=JOptionPane.showInputDialog("Enter the captcha value");
			company_captcha_value.sendKeys(company_captcha);
			excel.Write_data_pass(3, 50, 12);
			company_Termes_condition.click();
			excel.Write_data_pass(3, 46, 12);
			company_Register_submit.click();
			excel.Write_data_pass(3, 48, 12);
			excel.Write_data_pass(3, 52, 12);
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 19, 12);
			excel.Write_data_fail(3, 20, 12);
			excel.Write_data_fail(3, 21, 12);
			excel.Write_data_fail(3, 26, 12);
			excel.Write_data_fail(3, 28, 12);
			excel.Write_data_fail(3, 33, 12);
			excel.Write_data_fail(3, 37, 12);
			excel.Write_data_fail(3, 41, 12);
			excel.Write_data_fail(3, 43, 12);
			excel.Write_data_fail(3, 44, 12);
			excel.Write_data_fail(3, 50, 12);
			excel.Write_data_fail(3, 46, 12);
			excel.Write_data_fail(3, 48, 12);
			excel.Write_data_fail(3, 52, 12);
			throw(e);
		}
	}
	@Test
	public void ops_portal_company_activation() throws Exception
	{
		logger=extent.createTest("ops_portal_company_activation");
		try
		{
			//ops approver company
			String parent=driver.getWindowHandle();
			Robot a=new Robot();
			a.keyPress(KeyEvent.VK_CONTROL);
			a.keyPress(KeyEvent.VK_T);
			a.keyRelease(KeyEvent.VK_CONTROL);
			a.keyRelease(KeyEvent.VK_T);
			Thread.sleep(5000);
			Set<String>s1=driver.getWindowHandles();
			//int count=s1.size();
			for(String child:s1) {
				if(!parent.equalsIgnoreCase(child))
				{
					driver.switchTo().window(child);
					Thread.sleep(5000);
					driver.get(hiremee_url_opsportal);
					//login-opsportal
					Opsportal_email_id.sendKeys(ops_portal_username);
					Opsportal_password.sendKeys(ops_portal_password);
					//captcha
					ops_portal_captcha=JOptionPane.showInputDialog("Enter the captcha value");
					ops_captcha_value.sendKeys(ops_portal_captcha);
					ops_login_submit.click();

					//company activation
					Thread.sleep(3000);
					ops_company_details.click();
					Thread.sleep(3000);
					ops_company_activation_status.click();
					driver.switchTo().alert().accept();
					Thread.sleep(3000);
					ops_company_Activation_notes.sendKeys("Automation Team");
					Thread.sleep(3000);
					ops_company_Activation_submit.click();
					Thread.sleep(7000);
					/*
					ops_company_Edit.click();
					Thread.sleep(3000);
					ops_company_Search_per_day.clear();
					ops_company_Search_per_day.sendKeys("1000");
					Thread.sleep(3000);
					ops_company_Number_of_Search.clear();
					ops_company_Number_of_Search.sendKeys("1000");
					Thread.sleep(3000);
					ops_company_Number_of_selected.clear();
					ops_company_Number_of_selected.sendKeys("1000");
					Thread.sleep(3000);
					ops_company_Search_per_month.clear();
					ops_company_Search_per_month.sendKeys("1000");
					Thread.sleep(3000);
					ops_company_Selected_per_month.clear();
					ops_company_Selected_per_month.sendKeys("1000");
					Thread.sleep(3000);
					ops_company_Number_of_record.clear();
					ops_company_Number_of_record.sendKeys("2");
					Thread.sleep(2000);
					ops_company_Edit_update_button.click();
					*/
					driver.close();
				}
				driver.switchTo().window(parent);

			}

		}
	catch(Exception e)
	{
		throw(e);

	}

}





}