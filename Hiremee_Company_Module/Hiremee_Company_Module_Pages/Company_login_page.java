package Hiremee_Company_Module_Pages;

import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started_Company_Module.Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Company_login_page extends Driver_Class
{
	@FindBy(how=How.ID,using="js-corp-login-username")
	WebElement Company_Email_ID;

	@FindBy(how=How.ID,using="js-corp-login-password")
	WebElement Company_Password;

	@FindBy(how=How.ID,using="js-corp-login-v_captcha")
	WebElement Captcha_value;

	@FindBy(how=How.ID,using="corporate-login-submit")
	WebElement Company_Login_Submit;

	WebDriver driver;
	public static String url_hiremee_company_login;
	String company_login_captcha;
	String company_Email;
	String company_Password="Temp!123";

	Excel_Sheet excel=new Excel_Sheet(); 
	public Company_login_page(WebDriver l1driver)
	{
		this.driver=l1driver;
		PageFactory.initElements(driver,this);

	}

	@Test
	public void company_login() throws Exception
	{
		logger = extent.createTest("company_login");
		try
		{
			//company-login
			url_hiremee_company_login=excel.Read_data(3, 54, 11);
			driver.get(url_hiremee_company_login);
			excel.Write_data_pass(3, 54, 12);
			company_Email=excel.Read_data(3, 56, 11);
			//Company_Email_ID.sendKeys(Comapany_Registration_Page.company_Email);
			Company_Email_ID.sendKeys(company_Email);
			excel.Write_data_pass(3, 56, 12);
			company_Password=excel.Read_data(3, 58, 11);
			//Company_Password.sendKeys(Comapany_Registration_Page.company_Password);
			Company_Password.sendKeys(company_Password);
			excel.Write_data_pass(3, 58, 12);
			//captcha
			company_login_captcha=JOptionPane.showInputDialog("Enter the answer for above captcha:");
			Captcha_value.sendKeys(company_login_captcha);
			excel.Write_data_pass(3, 61, 12);
			excel.Write_data_pass(3, 62, 12);
			Company_Login_Submit.click();
			excel.Write_data_pass(3, 59, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 54, 12);
			excel.Write_data_fail(3, 56, 12);
			excel.Write_data_fail(3, 58, 12);
			excel.Write_data_fail(3, 59, 12);
			excel.Write_data_fail(3, 61, 12);
			excel.Write_data_fail(3, 62, 12);
			
			throw(e);
			
		}
	}













}
