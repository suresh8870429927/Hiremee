package Hiremee_Candidate_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Candidate_Current_Openings_Page extends Candidate_Driver_Class
{
	@FindBy(how=How.LINK_TEXT,using="Current Openings")
	WebElement current_openings;

	@FindBy(how=How.ID,using="apply_job")
	WebElement current_openings_Apply_Job;

	@FindBy(how=How.XPATH,using="/html/body/div[15]/div[7]/div/button")
	WebElement current_openings_Popub_success_button;

	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet();
	
	public Candidate_Current_Openings_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	@Test
	public  void Current_openings() throws Exception 
	{
		logger=extent.createTest("Current_openings");
		try
		{
		Thread.sleep(2000);
		current_openings.click();
		excel.Write_data_pass(1, 276, 12);
		Thread.sleep(2000);
		current_openings_Apply_Job.click();
		excel.Write_data_pass(1, 277, 12);
		excel.Write_data_pass(1, 278, 12);
		Thread.sleep(3000);
		current_openings_Popub_success_button.click();	
		Thread.sleep(3000);
		current_openings_Popub_success_button.click();	
		excel.Write_data_pass(1, 279, 12);
	}
	catch(Exception e)
	{
		excel.Write_data_fail(1, 276, 12);
		excel.Write_data_fail(1, 277, 12);
		excel.Write_data_fail(1, 278, 12);
		excel.Write_data_fail(1, 279, 12);
		throw(e);
	}

}
}