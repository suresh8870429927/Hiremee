package Hiremee_Candidate_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Candidate_Search_Jobs_Page extends Candidate_Driver_Class
{
	@FindBy(how=How.LINK_TEXT,using="Jobs")
	WebElement Jobs;

	@FindBy(how=How.LINK_TEXT,using="Search Jobs")
	WebElement Search_Jobs;

	@FindBy(how=How.ID,using="js-apply_job")
	WebElement Searchjobs_Apply_Job;

	@FindBy(how=How.XPATH,using="/html/body/div[15]/div[7]/div/button")
	WebElement Search_job_Popub_success_button;

	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet();
	public Candidate_Search_Jobs_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	@Test
	public  void Saerch_Jobss() throws Exception 
	{
		logger=extent.createTest("Saerch_Jobss");
		try
		{
		Thread.sleep(2000);
		Jobs.click();
		excel.Write_data_pass(1, 284, 12);
		Thread.sleep(2000);
		Search_Jobs.click();
		excel.Write_data_pass(1, 286, 12);
		excel.Write_data_pass(1, 289, 12);
		Thread.sleep(3000);
		Searchjobs_Apply_Job.click();
		excel.Write_data_pass(1, 290, 12);
		excel.Write_data_pass(1, 291, 12);
		Thread.sleep(3000);
		Search_job_Popub_success_button.click();
		Thread.sleep(3000);
		Search_job_Popub_success_button.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 284, 12);
			excel.Write_data_fail(1, 286, 12);
			excel.Write_data_fail(1, 289, 12);
			excel.Write_data_fail(1, 290, 12);
			excel.Write_data_fail(1, 291, 12);
			throw(e);
		}
	}

}
