package Hiremee_Recruiter_Module_Page;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Receruiter_Module.Recruiter_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;
import Hiremee_Company_Module_Pages.Company_Recruiters_page;
import Hiremee_Company_Module_Pages.Company_login_page;

public class Recruiter_Login_Page extends Recruiter_Driver_Class{
	@FindBy(how=How.ID,using="js-corp-login-username")
	WebElement Company_Email_ID;

	@FindBy(how=How.ID,using="js-corp-login-password")
	WebElement Company_Password;

	@FindBy(how=How.ID,using="js-corp-login-v_captcha")
	WebElement Captcha_value;

	@FindBy(how=How.ID,using="corporate-login-submit")
	WebElement Company_Login_Submit;

	WebDriver driver;
	String url_hiremee_company_login;
	String company_login_captcha;
	String Recruiter_Email_id;
	String Recruiter_Passs;
	
	Excel_Sheet excel=new Excel_Sheet();
	public Recruiter_Login_Page(WebDriver l1driver)
	{
		this.driver=l1driver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void Recruiter_login() throws Exception
	{
		logger=extent.createTest("Recruiter_login");
		try {
			//Recruiter-login
			url_hiremee_company_login=excel.Read_data(4, 19, 11);
			driver.get(url_hiremee_company_login);
			excel.Write_data_pass(4, 19, 12);
			Recruiter_Email_id=excel.Read_data(4, 38, 11);
			Company_Email_ID.sendKeys(Recruiter_Email_id);
			excel.Write_data_pass(4, 38, 12);
			Recruiter_Passs=excel.Read_data(4, 40, 11);
			Company_Password.sendKeys(Recruiter_Passs);
			excel.Write_data_pass(4, 40, 12);
			//captcha
			company_login_captcha=JOptionPane.showInputDialog("Enter the answer for above captcha:");
			Captcha_value.sendKeys(company_login_captcha);
			Company_Login_Submit.click();
			excel.Write_data_pass(4, 42, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 19, 12);
			excel.Write_data_fail(4, 38, 12);
			excel.Write_data_fail(4, 40, 12);
			excel.Write_data_fail(4, 42, 12);
			throw(e);
		}
	}
}

