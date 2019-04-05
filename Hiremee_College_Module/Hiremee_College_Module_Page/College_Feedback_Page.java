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

public class College_Feedback_Page extends College_Driver_Class{
	
	@FindBy(how=How.LINK_TEXT,using="Feedback")
	WebElement collge_feedback;
	
	@FindBy(how=How.ID,using="feedback_subject")
	WebElement collge_feedback_subject;
	
	@FindBy(how=How.ID,using="feedback_message")
	WebElement collge_feedback_Message;
	
	@FindBy(how=How.ID,using="js-college-feedback")
	WebElement collge_feedback_submit_Button;
	
	@FindBy(how=How.CLASS_NAME,using="confirm")
	WebElement collge_success_popub;
	
	@FindBy(how=How.CSS,using=".ti-angle-down")
	@CacheLookup
	WebElement College_modal;
	
	@FindBy(how=How.CSS,using=".show-notification > li:nth-child(6) > a:nth-child(1)")
	@CacheLookup
	WebElement College_Logout;

	WebDriver driver;
	String Subject;
	String Message;
	Excel_Sheet excel=new Excel_Sheet();
	public College_Feedback_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void Collge_Feedback() throws Exception
	{
		logger=extent.createTest("Collge_Feedback");
		try
		{
		ExplicitWait(driver,collge_feedback);
		collge_feedback.click();
		excel.Write_data_pass(2, 275, 12);
		ExplicitWait(driver,collge_feedback_subject);
		Subject=excel.Read_data(2, 277, 11);
		collge_feedback_subject.sendKeys(Subject);
		excel.Write_data_pass(2, 277, 12);
		Message=excel.Read_data(2, 280, 11);
		collge_feedback_Message.sendKeys(Message);
		excel.Write_data_pass(2, 280, 12);
		collge_feedback_submit_Button.click();
		excel.Write_data_pass(2, 283, 12);
		ExplicitWait(driver,collge_success_popub);
		collge_success_popub.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(2, 275, 12);
			excel.Write_data_fail(2, 277, 12);
			excel.Write_data_fail(2, 280, 12);
			excel.Write_data_fail(2, 283, 12);
			
			throw(e);
		}
		
		
	}

	@Test 
	public void Collge_Logout() throws Exception
	{
		logger=extent.createTest("Collge_Logout");
		try
		{
		Actions act2=new Actions(driver);
		Thread.sleep(3000);
		WebElement qrcode1 =College_modal;
		Thread.sleep(3000);
		act2.moveToElement(qrcode1).click().build().perform();
		College_Logout.click();
		excel.Write_data_pass(2, 303, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(2, 303, 12);
			throw(e);
		}
	}
}
