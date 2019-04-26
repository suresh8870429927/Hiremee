package Hiremee_Recruiter_Module_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started_Receruiter_Module.Recruiter_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Recruiter_Feedback_page extends Recruiter_Driver_Class{

	@FindBy(how=How.LINK_TEXT,using="Feedback")
	WebElement Company_Feedback_Link;

	@FindBy(how=How.ID,using="js-feedback_subject")
	WebElement Company_Feedback_Subject;

	@FindBy(how=How.ID,using="js-feedback_msg")
	WebElement Company_Feedback_Message;

	@FindBy(how=How.ID,using="js_feedback")
	WebElement Company_Feedback_submit_button;

	@FindBy(how=How.XPATH,using="//button[@class='confirm']")
	WebElement Company_upload_success_popub;

	//logout
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[1]/nav/div[2]/div[1]/div/div[1]/div[1]/div[2]/span[2]/i")
	WebElement Company_modal;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[1]/nav/div[2]/div[1]/div/div[1]/div[2]/ul/li/a[3]")
	WebElement Company_Logout;

	WebDriver driver;
	String feedback_subject;
	String feedback_message;
	Excel_Sheet excel=new Excel_Sheet();
	public Recruiter_Feedback_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void Recruiter_Feedback_pages() throws Exception
	{
		logger=extent.createTest("Recruiter_Feedback_pages");
		try
		{
			Thread.sleep(3000);
			Company_Feedback_Link.click();
			excel.Write_data_pass(4, 255, 12);
			Thread.sleep(3000);
			feedback_subject=excel.Read_data(4, 257, 11);
			Thread.sleep(3000);
			Company_Feedback_Subject.sendKeys(feedback_subject);
			excel.Write_data_pass(4, 257, 12);
			feedback_message=excel.Read_data(4, 261, 11);
			Thread.sleep(3000);
			Company_Feedback_Message.sendKeys(feedback_message);
			excel.Write_data_pass(4, 261, 12);
			Thread.sleep(3000);
			Company_Feedback_submit_button.click();
			excel.Write_data_pass(4, 262, 12);
			ExplicitWait(driver, Company_upload_success_popub);
			Company_upload_success_popub.click();
			
			

		}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 255, 12);
			excel.Write_data_fail(4, 257, 12);
			excel.Write_data_fail(4, 261, 12);
			excel.Write_data_fail(4, 262, 12);
			throw(e);
		}
	}

	@Test
	public void Recruiter_Logout() throws Exception
	{
		logger=extent.createTest("Recruiter_Logout");
		try
		{
			ExplicitWait(driver, Company_modal);
			Company_modal.click();
			ExplicitWait(driver, Company_Logout);
			Company_Logout.click();
			excel.Write_data_pass(4, 262, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 262, 12);
			throw(e);
		}
	}
}
