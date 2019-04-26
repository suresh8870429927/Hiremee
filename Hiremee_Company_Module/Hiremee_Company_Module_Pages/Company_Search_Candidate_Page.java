package Hiremee_Company_Module_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started_Company_Module.Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Company_Search_Candidate_Page extends Driver_Class{

	@FindBy(how=How.LINK_TEXT,using="Search Candidate")
	WebElement company_Search_Candidate;

	@FindBy(how=How.ID,using="search-box")
	WebElement company_Search_Candidate_Search_box;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div[1]/label/span")
	WebElement company_Search_Candidate_Search_chechbox_Button;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div/div[3]/div/div/div[2]/button[3]")
	WebElement company_Search_Candidate_Search_Dotted_Button;

	@FindBy(how=How.XPATH,using="//button[@class='dropdown-item search-select-multiple']")
	WebElement company_Search_Candidate_Search_Select_candidate;
	
	@FindBy(how=How.XPATH,using="//button[@class='confirm']")
	WebElement Company_upload_success_popub;

	WebDriver driver;
	String search_job;
	Excel_Sheet excel=new Excel_Sheet();
	public Company_Search_Candidate_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	
	public void Search_candidate_page() throws Exception
	{
		logger=extent.createTest("Search_candidate_page");
		try
		{
			//search candidate
			Thread.sleep(5000);
			company_Search_Candidate.click();
			excel.Write_data_pass(3, 157, 12);
			excel.Write_data_pass(3, 158, 12);
			excel.Write_data_pass(3, 272, 12);
			excel.Write_data_pass(3, 273, 12);
			search_job=excel.Read_data(3, 274, 11);
			company_Search_Candidate_Search_box.sendKeys(search_job);
			company_Search_Candidate_Search_box.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 274, 12);
			ExplicitWait(driver, company_Search_Candidate_Search_chechbox_Button);
			company_Search_Candidate_Search_chechbox_Button.click();
			excel.Write_data_pass(3, 149, 12);
			ExplicitWait(driver, company_Search_Candidate_Search_Dotted_Button);
			company_Search_Candidate_Search_Dotted_Button.click();
			excel.Write_data_pass(3, 150, 12);
			ExplicitWait(driver, company_Search_Candidate_Search_Select_candidate);
			company_Search_Candidate_Search_Select_candidate.click();
			excel.Write_data_pass(3, 275, 12);
			ExplicitWait(driver, Company_upload_success_popub);
			Company_upload_success_popub.click();
			excel.Write_data_pass(3, 151, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 272, 12);
			excel.Write_data_fail(3, 273, 12);
			excel.Write_data_fail(3, 274, 12);
			excel.Write_data_fail(3, 275, 12);
			excel.Write_data_fail(3, 149, 12);
			excel.Write_data_fail(3, 150, 12);
			excel.Write_data_fail(3, 151, 12);
			excel.Write_data_fail(3, 157, 12);
			excel.Write_data_fail(3, 158, 12);
			throw(e);
		}

	}

}

