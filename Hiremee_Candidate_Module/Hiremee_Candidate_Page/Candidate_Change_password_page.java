package Hiremee_Candidate_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Candidate_Change_password_page extends Candidate_Driver_Class
{
	
	@FindBy(how=How.CSS,using="#pcoded > div.pcoded-container.navbar-wrapper > nav > div > div.navbar-container.container-fluid > div > ul.nav-right.p-t-10 > li.user-profile.header-notification > a > i")
	public WebElement Candidate_modal;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/nav/div/div[2]/div/ul[2]/li[3]/ul/li[3]/a")
	public WebElement Candidate_change_Password;
	
	@FindBy(how=How.ID,using="current_password")
	public WebElement Candidate_change_Password_current_password;
	
	@FindBy(how=How.ID,using="new_password")
	public WebElement Candidate_change_Password_New_password;
	
	@FindBy(how=How.ID,using="confirm_password")
	public WebElement Candidate_change_Password_Confirm_password;
	
	@FindBy(how=How.ID,using="btn_change_password")
	public WebElement Candidate_change_Password_Button;
	
	@FindBy(how=How.XPATH,using="/html/body/div[15]/div[7]/div/button")
	public WebElement Candidate_success_popub;
	
	
	WebDriver driver;
	String current_pass;
	String new_pass;
	Excel_Sheet excel=new Excel_Sheet();
	public Candidate_Change_password_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void candidate_change_password() throws Exception
	{
		logger=extent.createTest("candidate_change_password");
		try
		{
			ExplicitWait(driver,Candidate_modal);
			Actions act=new Actions(driver);
			Thread.sleep(3000);
			act.moveToElement(Candidate_modal).build().perform();
			Thread.sleep(1000);
			Candidate_change_Password.click();
			excel.Write_data_pass(1, 303, 12);
			excel.Write_data_pass(1, 304, 12);
			current_pass=excel.Read_data(1, 305, 11);
			Candidate_change_Password_current_password.sendKeys(current_pass);
			excel.Write_data_pass(1, 305, 12);
			Thread.sleep(3000);
			new_pass=excel.Read_data(1, 308, 11);
			Candidate_change_Password_New_password.sendKeys(new_pass);
			excel.Write_data_pass(1, 308, 12);
			Thread.sleep(3000);
			Candidate_change_Password_Confirm_password.sendKeys(new_pass);
			excel.Write_data_pass(1, 311, 12);
			Thread.sleep(3000);
			Candidate_change_Password_Button.click();
			Thread.sleep(3000);
			Candidate_success_popub.click();
			
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 303, 12);
			excel.Write_data_fail(1, 304, 12);
			excel.Write_data_fail(1, 305, 12);
			excel.Write_data_fail(1, 308, 12);
			excel.Write_data_fail(1, 311, 12);
			throw(e);
		}
	}
}
