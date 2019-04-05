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

public class College_Login_Page extends College_Driver_Class{

	@FindBy(how=How.ID,using="email_static")
	WebElement college_login_username;

	@FindBy(how=How.ID,using="password_static")
	WebElement college_login_password;

	@FindBy(how=How.ID,using="college_sign_in_static")
	WebElement college_login_Button;
	
	@FindBy(how=How.NAME,using="v_captcha")
	WebElement college_login_Captcha;
	

	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet();
	public College_Login_Page(WebDriver ldriver) 
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	@Test
	public void College_Login() throws Exception
	{
		logger=extent.createTest("College_Login");
		try 
		{
			
			//url need to be deleted
			Hiremee_college_url=excel.Read_data(2, 61, 11);
			driver.get(Hiremee_college_url);
			excel.Write_data_pass(2, 61, 12);
			Email_id=excel.Read_data(2, 63, 11);
			college_login_username.sendKeys(Email_id);
			excel.Write_data_pass(2, 63, 12);
			password=excel.Read_data(2, 67, 11);
			college_login_password.sendKeys(password);
			excel.Write_data_pass(2, 67, 12);
			String captcha=JOptionPane.showInputDialog("Enter the captcha");
			college_login_Captcha.sendKeys(captcha);
			college_login_Button.click();
			excel.Write_data_pass(2, 71, 12);
			excel.Write_data_pass(2, 72, 12);
			excel.Write_data_pass(2, 73, 12);
			excel.Write_data_pass(2, 76, 12);	
		}
		catch(Exception e)
		{
			excel.Write_data_fail(2, 61, 12);
			excel.Write_data_fail(2, 63, 12);
			excel.Write_data_fail(2, 67, 12);
			excel.Write_data_fail(2, 71, 12);
			excel.Write_data_fail(2, 72, 12);
			excel.Write_data_fail(2, 73, 12);
			excel.Write_data_fail(2, 76, 12);
			throw(e);
		}
	}

}
