package Hiremee_College_Module_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_College_Module.College_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class College_Change_Password_Page extends College_Driver_Class{

	@FindBy(how=How.CSS,using=".ti-angle-down")
	WebElement College_modal;
	
	@FindBy(how=How.CSS,using=".show-notification > li:nth-child(4) > a:nth-child(1)")
	@CacheLookup
	WebElement College_Change_password;
	
	@FindBy(how=How.ID,using="current_password")
	WebElement College_Change_current_password;
	
	@FindBy(how=How.ID,using="new_password")
	WebElement College_Change_new_password;
	
	@FindBy(how=How.ID,using="confirm_password")
	WebElement College_Change_confirm_password;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/form/div/div/div/div[4]/div/button")
	WebElement College_Change_password_Submit_Button;
	
	@FindBy(how=How.XPATH,using="/html/body/div[15]/div[7]/div/button")
	WebElement College_success_popub;
	
	
	WebDriver driver;
	String college_current_password;
	String college_new_password;
	String college_confirm_password;
	Excel_Sheet excel=new Excel_Sheet();
	public College_Change_Password_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void college_change_password() throws Exception 
	{
		logger=extent.createTest("college_change_password");
		try
		{
			Actions act1=new Actions(driver);
			ExplicitWait(driver,College_modal);
			WebElement qrcode =College_modal;
			Thread.sleep(3000);
			act1.moveToElement(qrcode).click().build().perform();
			College_Change_password.click();
			excel.Write_data_pass(2, 285, 12);
			college_current_password=excel.Read_data(2, 287, 11);
			College_Change_current_password.sendKeys(college_current_password);
			excel.Write_data_pass(2, 287, 12);
			college_new_password=excel.Read_data(2, 290, 11);
			College_Change_new_password.sendKeys(college_new_password);
			excel.Write_data_pass(2, 290, 12);
			college_confirm_password=excel.Read_data(2, 293, 11);
			College_Change_confirm_password.sendKeys(college_confirm_password);
			excel.Write_data_pass(2, 293, 12);
			College_Change_password_Submit_Button.click();
			excel.Write_data_pass(2, 297, 12);
			Thread.sleep(5000);
			College_success_popub.click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}
	
