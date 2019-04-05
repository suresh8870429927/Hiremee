package Hiremee_Candidate_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Candidate_Applied_Jobs_Page extends Candidate_Driver_Class
{
	
	@FindBy(how=How.LINK_TEXT,using="Jobs")
	WebElement Jobs;
	
	@FindBy(how=How.LINK_TEXT,using="Applied Jobs")
	WebElement Applied_jobs;
	
	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet();
	public Candidate_Applied_Jobs_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public void Applied_Jobss() throws Exception 
	{
		logger=extent.createTest("Applied_Jobss");
		try
		{
		Thread.sleep(2000);
		Jobs.click();
		excel.Write_data_pass(1, 287, 12);
		Thread.sleep(2000);
		Applied_jobs.click();
		excel.Write_data_pass(1, 292, 12);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[4]/div/div/div/div[2]/div/div[1]/div/div/div/div/div[11]/a")).click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 287, 12);
			excel.Write_data_fail(1, 292, 12);
			throw(e);
		}
	}

}
