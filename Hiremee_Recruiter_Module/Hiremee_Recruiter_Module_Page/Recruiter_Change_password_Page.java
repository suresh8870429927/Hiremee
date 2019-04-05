package Hiremee_Recruiter_Module_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Receruiter_Module.Recruiter_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Recruiter_Change_password_Page extends Recruiter_Driver_Class
{
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[1]/nav/div[2]/div[1]/div/div[1]/div[1]/div[2]/span[2]/i")
	WebElement Recruiter_modal;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[1]/nav/div[2]/div[1]/div/div[1]/div[2]/ul/li/a[2]")
	WebElement Recruiter_Change_Password;
		
	@FindBy(how=How.ID,using="current_password")
	WebElement Recruiter_Change_current_password;
	
	@FindBy(how=How.ID,using="new_password")
	WebElement Recruiter_Change_new_password;
	
	@FindBy(how=How.ID,using="confirm_password")
	WebElement Recruiter_Change_confirm_password;
	
	@FindBy(how=How.ID,using="js-change-password")
	WebElement Recruiter_Change_password_Button;
	
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[7]/div/button")
	WebElement Recruiter_success_popub;
	
	WebDriver driver;
	String current_password;
	String new_password;
	String confirm_password;
	Excel_Sheet excel=new Excel_Sheet();
	public Recruiter_Change_password_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void Recruiter_changepassword_pages() throws Exception
	{
		logger=extent.createTest("Recruiter_changepassword_pages");
		try
		{
			ExplicitWait(driver,Recruiter_modal);
			Recruiter_modal.click();
			excel.Write_data_pass(4, 302, 12);
			excel.Write_data_pass(4, 303, 12);
			ExplicitWait(driver,Recruiter_Change_Password);
			Recruiter_Change_Password.click();
			excel.Write_data_pass(4, 304, 12);
			ExplicitWait(driver,Recruiter_Change_current_password);
			current_password=excel.Read_data(4, 307, 11);
			Recruiter_Change_current_password.sendKeys(current_password);
			excel.Write_data_pass(4, 307, 12);
			ExplicitWait(driver,Recruiter_Change_new_password);
			new_password=excel.Read_data(4, 310, 11);
			Recruiter_Change_new_password.sendKeys(new_password);
			excel.Write_data_pass(4, 310, 12);
			ExplicitWait(driver,Recruiter_Change_confirm_password);
			confirm_password=excel.Read_data(4, 314, 11);
			Recruiter_Change_confirm_password.sendKeys(confirm_password);
			excel.Write_data_pass(4, 314, 12);
			ExplicitWait(driver,Recruiter_Change_password_Button);
			Recruiter_Change_password_Button.click();
			excel.Write_data_pass(4, 315, 12);
			Thread.sleep(3000);
			Recruiter_success_popub.click();

		}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 302, 12);
			excel.Write_data_fail(4, 303, 12);
			excel.Write_data_fail(4, 304, 12);
			excel.Write_data_fail(4, 307, 12);
			excel.Write_data_fail(4, 310, 12);
			excel.Write_data_fail(4, 314, 12);
			excel.Write_data_fail(4, 315, 12);
			throw(e);
		}
	}

}

