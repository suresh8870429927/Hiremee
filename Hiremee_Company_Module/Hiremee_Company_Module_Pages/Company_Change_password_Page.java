package Hiremee_Company_Module_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started_Company_Module.Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Company_Change_password_Page extends Driver_Class 
{
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[1]/nav/div[2]/div[1]/div/div[1]/div[1]/div[2]/span[2]/i")
	WebElement Company_modal;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[1]/nav/div[2]/div[1]/div/div[1]/div[2]/ul/li/a[2]")
	WebElement Company_Change_Password;
		
	@FindBy(how=How.ID,using="current_password")
	WebElement Company_Change_current_password;
	
	@FindBy(how=How.ID,using="new_password")
	WebElement Company_Change_new_password;
	
	@FindBy(how=How.ID,using="confirm_password")
	WebElement Company_Change_confirm_password;
	
	@FindBy(how=How.ID,using="js-change-password")
	WebElement Company_Change_password_Button;
	
	@FindBy(how=How.XPATH,using="//button[@class='confirm']")
	WebElement Company_success_popub;
	
	
	WebDriver driver;
	String current_password;
	String new_password;
	String confirm_password;
	Excel_Sheet excel=new Excel_Sheet();
	public Company_Change_password_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void company_change_password() throws Exception
	{
		logger=extent.createTest("company_change_password");
		try
		{
			ExplicitWait(driver,Company_modal);
			Company_modal.click();
			excel.Write_data_pass(3, 351, 12);
			excel.Write_data_pass(3, 352, 12);
			Thread.sleep(3000);
			Company_Change_Password.click();
			excel.Write_data_pass(3, 353, 12);
			ExplicitWait(driver,Company_Change_current_password);
			current_password=excel.Read_data(3, 356, 11);
			Company_Change_current_password.sendKeys(current_password);
			excel.Write_data_pass(3, 356, 12);
			ExplicitWait(driver,Company_Change_new_password);
			new_password=excel.Read_data(3, 359, 11);
			Company_Change_new_password.sendKeys(new_password);
			excel.Write_data_pass(3, 359, 12);
			ExplicitWait(driver,Company_Change_confirm_password);
			confirm_password=excel.Read_data(3, 363, 11);
			Company_Change_confirm_password.sendKeys(confirm_password);
			excel.Write_data_pass(3, 363, 12);
			Company_Change_password_Button.click();
			excel.Write_data_pass(3, 364, 12);
			Thread.sleep(5000);
			Company_success_popub.click();
			
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 351, 12);
			excel.Write_data_fail(3, 352, 12);
			excel.Write_data_fail(3, 353, 12);
			excel.Write_data_fail(3, 356, 12);
			excel.Write_data_fail(3, 359, 12);
			excel.Write_data_fail(3, 363, 12);
			excel.Write_data_fail(3, 364, 12);
			throw(e);
		}
	}

}
