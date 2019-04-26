package Hiremee_Company_Module_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started_Company_Module.Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Company_Feedback_page extends Driver_Class{

	@FindBy(how=How.LINK_TEXT,using="Feedback")
	WebElement Company_Feedback_Link;

	@FindBy(how=How.ID,using="js-feedback_subject")
	WebElement Company_Feedback_Subject;

	@FindBy(how=How.ID,using="js-feedback_msg")
	WebElement Company_Feedback_Message;

	@FindBy(how=How.ID,using="js_feedback")
	WebElement Company_Feedback_submit_button;
	
	@FindBy(how=How.XPATH,using="//button[@class='confirm']")
	WebElement Company_Feedback_success_pop_ub;
	

	//logout
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[1]/nav/div[2]/div[1]/div/div[1]/div[1]/div[2]/span[2]/i")
	WebElement Company_modal;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[1]/nav/div[2]/div[1]/div/div[1]/div[2]/ul/li/a[3]")
	WebElement Company_Logout;

	WebDriver driver;
	String subject;
	String Message;
	Excel_Sheet excel=new  Excel_Sheet();
	public Company_Feedback_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void Company_Feedback_pages() throws Exception
	{
		logger=extent.createTest("Company_Feedback_pages");
		try
		{
		Thread.sleep(3000);
		Company_Feedback_Link.click();
		excel.Write_data_pass(3, 298, 12);
		Thread.sleep(5000);
		subject=excel.Read_data(3, 300, 11);
		Company_Feedback_Subject.sendKeys(subject);
		excel.Write_data_pass(3, 300, 12);
		Message=excel.Read_data(3, 304, 11);
		Company_Feedback_Message.sendKeys(Message);
		excel.Write_data_pass(3, 304, 12);
		Company_Feedback_submit_button.click();
		excel.Write_data_pass(3, 305, 12);
		ExplicitWait(driver, Company_Feedback_success_pop_ub);
		Company_Feedback_success_pop_ub.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 298, 12);
			excel.Write_data_fail(3, 300, 12);
			excel.Write_data_fail(3, 304, 12);
			excel.Write_data_fail(3, 305, 12);
			throw(e);
		}
	}

	@Test
	public void Company_Logout() throws Exception
	{
		logger=extent.createTest("Company_Logout");
		try
		{
		Thread.sleep(5000);
		Company_modal.click();
		ExplicitWait(driver, Company_Logout);
		Company_Logout.click();
		excel.Write_data_pass(3, 370, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 370, 12);
			throw(e);
		}
	}
}
