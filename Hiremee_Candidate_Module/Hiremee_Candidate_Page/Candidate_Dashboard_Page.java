package Hiremee_Candidate_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Excel_Sheet_config.Excel_Sheet;

public class Candidate_Dashboard_Page {

	@FindBy(how=How.LINK_TEXT,using="Dashboard")
	WebElement Candidate_Dashboard;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div/div[4]/div/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/a/button")
	WebElement Candidate_Dashboard_Job_View_Apply;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div/div[4]/div/div/div/div[2]/div/div[1]/div/div/div/div/div[11]/a")
	WebElement Candidate_Dashboard_Job_View_Apply_Back_button;

	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet();
	public Candidate_Dashboard_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	
	@Test
	public void candidate_Dashboard() throws Exception 
	{
		try
		{
		Thread.sleep(2000);
		Candidate_Dashboard.click();
		excel.Write_data_pass(1, 103, 12);
		excel.Write_data_pass(1, 104, 12);
		excel.Write_data_pass(1, 105, 12);
		excel.Write_data_pass(1, 106, 12);
		excel.Write_data_pass(1, 107, 12);
		excel.Write_data_pass(1, 108, 12);
		excel.Write_data_pass(1, 109, 12);
		excel.Write_data_pass(1, 110, 12);
		Thread.sleep(2000);
		Candidate_Dashboard_Job_View_Apply.click();
		excel.Write_data_pass(1, 113, 12);
		excel.Write_data_pass(1, 114, 12);
		excel.Write_data_pass(1, 115, 12);
		Thread.sleep(2000);
		Candidate_Dashboard_Job_View_Apply_Back_button.click();
		excel.Write_data_pass(1, 116, 12);

		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 103, 12);
			excel.Write_data_fail(1, 104, 12);
			excel.Write_data_fail(1, 105, 12);
			excel.Write_data_fail(1, 106, 12);
			excel.Write_data_fail(1, 107, 12);
			excel.Write_data_fail(1, 108, 12);
			excel.Write_data_fail(1, 109, 12);
			excel.Write_data_fail(1, 110, 12);
			excel.Write_data_fail(1, 113, 12);
			excel.Write_data_fail(1, 114, 12);
			excel.Write_data_fail(1, 115, 12);
			excel.Write_data_fail(1, 116, 12);
			throw(e);
		}

	}

}
