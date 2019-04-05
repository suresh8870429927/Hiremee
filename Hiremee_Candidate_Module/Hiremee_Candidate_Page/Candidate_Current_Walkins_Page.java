package Hiremee_Candidate_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Candidate_Current_Walkins_Page extends Candidate_Driver_Class{

	@FindBy(how=How.LINK_TEXT,using="Current Walkins")
	WebElement current_walkins;

	@FindBy(how=How.ID,using="apply_job")
	WebElement current_Walkins_Apply_Job;

	@FindBy(how=How.XPATH,using="/html/body/div[19]/div[7]/div/button")
	WebElement current_walkins_Popub_success_button;

	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet();
	public Candidate_Current_Walkins_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	@Test
	public  void Current_Walkinss() throws Exception
	{
		logger=extent.createTest("Current_Walkinss");
		try
		{
			Thread.sleep(2000);
			current_walkins.click();
			excel.Write_data_pass(1, 280, 12);
			excel.Write_data_pass(1, 281, 12);
			Thread.sleep(2000);
			current_Walkins_Apply_Job.click();
			excel.Write_data_pass(1, 282, 12);
			Thread.sleep(3000);	
			current_walkins_Popub_success_button.click();
			Thread.sleep(3000);	
			current_walkins_Popub_success_button.click();
			excel.Write_data_pass(1, 283, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 280, 12);
			excel.Write_data_fail(1, 281, 12);
			excel.Write_data_fail(1, 282, 12);
			excel.Write_data_fail(1, 283, 12);
			throw(e);
		}
	}
}