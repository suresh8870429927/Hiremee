package Hiremee_Home_jobs_UAT_Smoke_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started.Hiremee_Smoke_Test_Driver_Initial;
import Excel_Config.Excel_Sheet_Config;
import Property_File.Property_File_Config;

public class Hiremee_jobs_page extends Hiremee_Smoke_Test_Driver_Initial
{
	@FindBy(how=How.LINK_TEXT,using="Jobs")
	WebElement jobs_link;

	@FindBy(how=How.XPATH,using="/html/body/nav/div/a")
	WebElement jobs_page_Hiremeeapp_link;

	@FindBy(how=How.XPATH,using="/html/body/main/section/div/div/div[1]/div/div[1]/a")
	WebElement jobs_page_View_Apply;


	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/ul/li[1]/a/i")
	WebElement jobs_page_Home_icon;

	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/ul/li[2]/a")
	WebElement jobs_page_Job_icon;

	WebDriver driver;
	Property_File_Config config;
	//String Hiremee_Job_url;
	Excel_Sheet_Config excel=new Excel_Sheet_Config();
	public Hiremee_jobs_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void hiremee_Home_page() throws Exception
	{
		Testcase_ID=excel.Read_data(6, 19, 0);
		Expected_Result=excel.Read_data(6, 19, 7);
		logger = extent.createTest("hiremee_Home_page");
		try {	
			//Hiremee_Job_url=excel.Read_data(6, 19, 10);
			config=new Property_File_Config();
			driver.get(config.getHiremee_Home_Url());
			excel.Write_data_pass(6, 19, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(6, 19, 11);
			throw(e);	
		}
	}

	@Test
	public void hiremee_job_page() throws Exception
	{
		Testcase_ID=excel.Read_data(6, 20, 0);
		Expected_Result=excel.Read_data(6, 20, 7);
		logger = extent.createTest("hiremee_job_page");
		try {	

			ExplicitWait(driver,jobs_link);
			jobs_link.click();
			excel.Write_data_pass(6, 20, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(6, 20, 11);
			throw(e);	
		}
	}
	@Test
	public void hiremee_job_Hiremee_app_link_page() throws Exception
	{
		Testcase_ID=excel.Read_data(6, 21, 0);
		Expected_Result=excel.Read_data(6, 21, 7);
		logger = extent.createTest("hiremee_job_Hiremee_app_link_page");
		try {	

			ExplicitWait(driver, jobs_page_Hiremeeapp_link);
			jobs_page_Hiremeeapp_link.click();
			driver.navigate().back();
			excel.Write_data_pass(6, 21, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(6, 21, 11);
			throw(e);	
		}
	}
	@Test
	public void hiremee_job_View_apply_page() throws Exception
	{
		Testcase_ID=excel.Read_data(6, 22, 0);
		Expected_Result=excel.Read_data(6, 22, 7);
		logger = extent.createTest("hiremee_job_View_apply_page");
		try {	

			ExplicitWait(driver, jobs_page_View_Apply);
			jobs_page_View_Apply.click();
			//driver.close();
			excel.Write_data_pass(6, 22, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(6, 22, 11);
			throw(e);	
		}
	}

	@Test
	public void hiremee_job_Home_Icon_page() throws Exception
	{
		Testcase_ID=excel.Read_data(6, 23, 0);
		Expected_Result=excel.Read_data(6, 23, 7);
		logger = extent.createTest("hiremee_job_Home_Icon_page");
		try {	

			ExplicitWait(driver, jobs_page_Home_icon);
			jobs_page_Home_icon.click();
			driver.navigate().back();
			excel.Write_data_pass(6, 23, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(6, 23, 11);
			throw(e);	
		}
	}

	@Test
	public void hiremee_job_Jobs_Icon_page() throws Exception
	{
		Testcase_ID=excel.Read_data(6, 24, 0);
		Expected_Result=excel.Read_data(6, 24, 7);
		logger = extent.createTest("hiremee_job_Jobs_Icon_page");
		try {	

			ExplicitWait(driver, jobs_page_Job_icon);
			jobs_page_Job_icon.click();
			excel.Write_data_pass(6, 24, 11);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(6, 24, 11);
			throw(e);	
		}
	}


}


