package Hiremee_College_Module_Page;

import javax.swing.JOptionPane;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started_College_Module.College_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class College_Registration_page extends College_Driver_Class
{
	@FindBy(how=How.LINK_TEXT,using="College")
	@CacheLookup
	WebElement college_link;
	
	@FindBy(how=How.XPATH,using="/html/body/nav/div/div[2]/div/a[2]")
	@CacheLookup
	WebElement college_Register_link;
	
	@FindBy(how=How.ID,using="select2-js-university-container")
	WebElement college_university_dropdown;

	@FindBy(how=How.CLASS_NAME,using="select2-search__field")
	WebElement college_dropdown_Input;

	@FindBy(how=How.ID,using="select2-js-college-container")
	WebElement college_college_dropdown;

	@FindBy(how=How.ID,using="js-email-address")
	WebElement college_email_address;

	@FindBy(how=How.ID,using="js-contact-number")
	WebElement college_mobile_number;

	@FindBy(how=How.NAME,using="spoc_name")
	WebElement college_spoc_name;

	@FindBy(how=How.ID,using="js-college-password")
	WebElement college_registered_password;

	@FindBy(how=How.NAME,using="confirm_password")
	WebElement college_registered_confirm_password;


	@FindBy(how=How.ID,using="js-website-address")
	WebElement college_registered_website;

	@FindBy(how=How.NAME,using="address")
	WebElement college_address;


	@FindBy(how=How.NAME,using="v_captcha")
	WebElement college_captcha_value;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div[2]/div/form/div[2]/div/div/label/span[1]/i")
	WebElement college_Termes_condition;

	@FindBy(how=How.ID,using="js-college-register")
	WebElement college_Register_submit;

	WebDriver driver;
	//web portal
	String college_register_url;
	String company_captcha,ops_portal_captcha;
	String University;
	String College;
	String college_Email_Address;
	String contact_number;
	String contact_person_name;
	String Website_Address;
	String Password;
	String Confirm_Password;
	String Address;
	Excel_Sheet excel=new Excel_Sheet();
	public College_Registration_page(WebDriver ldriver) 
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void college_registration() throws Exception
	{
		logger=extent.createTest("college_registration");
		try
		{
			college_register_url=excel.Read_data(2, 19, 11);
			driver.get(college_register_url);
			excel.Write_data_pass(2, 19, 12);
			ExplicitWait(driver,college_link);
			college_link.click();
			ExplicitWait(driver, college_Register_link);
			college_Register_link.click();
			excel.Write_data_pass(2, 20, 12);
			excel.Write_data_pass(2, 21, 12);
			college_university_dropdown.click();
			ExplicitWait(driver, college_dropdown_Input);
			University=excel.Read_data(2, 23, 11);
			college_dropdown_Input.sendKeys(University);
			ExplicitWait(driver, college_dropdown_Input);
			college_dropdown_Input.sendKeys(Keys.ENTER);
			excel.Write_data_pass(2, 23, 12);
			college_college_dropdown.click();
			ExplicitWait(driver, college_dropdown_Input);
			College=excel.Read_data(2, 25, 11);
			college_dropdown_Input.sendKeys(College);
			ExplicitWait(driver, college_dropdown_Input);
			college_dropdown_Input.sendKeys(Keys.ENTER);
			excel.Write_data_pass(2, 25, 12);
			college_Email_Address=excel.Read_data(2, 27, 11);
			college_email_address.sendKeys(college_Email_Address);
			excel.Write_data_pass(2, 27, 12);
			contact_number=excel.Read_data(2, 31, 11);
			college_mobile_number.sendKeys(contact_number);
			excel.Write_data_pass(2, 31, 12);
			contact_person_name=excel.Read_data(2, 34, 11);
			college_spoc_name.sendKeys(contact_person_name);
			excel.Write_data_pass(2, 34, 12);
			Website_Address=excel.Read_data(2, 37, 11);
			college_registered_website.sendKeys(Website_Address);
			excel.Write_data_pass(2, 37, 12);
			Password=excel.Read_data(2, 40, 11);
			college_registered_password.sendKeys(Password);
			excel.Write_data_pass(2, 40, 12);
			Confirm_Password=excel.Read_data(2, 43, 11);
			college_registered_confirm_password.sendKeys(Confirm_Password);
			excel.Write_data_pass(2, 43, 12);
			Address=excel.Read_data(2, 46, 11);
			college_address.sendKeys(Address);
			excel.Write_data_pass(2, 46, 12);
			String college_captcha=JOptionPane.showInputDialog("Enter the captcha value");
			college_captcha_value.sendKeys(college_captcha);
			excel.Write_data_pass(2, 50, 12);
			excel.Write_data_pass(2, 51, 12);
			excel.Write_data_pass(2, 52, 12);
			college_Termes_condition.click();
			excel.Write_data_pass(2, 55, 12);
			college_Register_submit.click();
			excel.Write_data_pass(2, 57, 12);
			excel.Write_data_pass(2, 58, 12);
			Thread.sleep(8000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(2, 19, 12);
			excel.Write_data_fail(2, 20, 12);
			excel.Write_data_fail(2, 21, 12);
			excel.Write_data_fail(2, 23, 12);
			excel.Write_data_fail(2, 25, 12);
			excel.Write_data_fail(2, 27, 12);
			excel.Write_data_fail(2, 31, 12);
			excel.Write_data_fail(2, 34, 12);
			excel.Write_data_fail(2, 37, 12);
			excel.Write_data_fail(2, 40, 12);
			excel.Write_data_fail(2, 43, 12);
			excel.Write_data_fail(2, 46, 12);
			excel.Write_data_fail(2, 50, 12);
			excel.Write_data_fail(2, 51, 12);
			excel.Write_data_fail(2, 52, 12);
			excel.Write_data_fail(2, 55, 12);
			excel.Write_data_fail(2, 57, 12);
			excel.Write_data_fail(2, 58, 12);
			throw(e);
		}
	}
}
