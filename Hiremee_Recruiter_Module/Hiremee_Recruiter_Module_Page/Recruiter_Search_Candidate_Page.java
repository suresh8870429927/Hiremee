package Hiremee_Recruiter_Module_Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started_Receruiter_Module.Recruiter_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Recruiter_Search_Candidate_Page extends Recruiter_Driver_Class{

	@FindBy(how=How.LINK_TEXT,using="Search Candidate")
	WebElement Recruiter_Search_Candidate;

	@FindBy(how=How.ID,using="search-box")
	WebElement Recruiter_Search_Candidate_Search_box;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div[1]/label/span")
	WebElement recruiter_Search_Candidate_Search_chechbox_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div/div[3]/div/div/div[2]/button[3]")
	WebElement Recruiter_Search_Candidate_Search_Dotted_Button;

	@FindBy(how=How.XPATH,using="//button[@class='dropdown-item search-select-multiple']")
	WebElement Recruiter_Search_Candidate_Search_Select_candidate;

	@FindBy(how=How.XPATH,using="//button[@class='confirm']")
	WebElement Recruiter_upload_success_popub;

	WebDriver driver;
	String Recruiter_searchname;
	Excel_Sheet excel=new Excel_Sheet();
	public Recruiter_Search_Candidate_Page(WebDriver ldriver)
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
		ExplicitWait(driver, Recruiter_Search_Candidate);
		Recruiter_Search_Candidate.click();
		excel.Write_data_pass(4, 229, 12);
		Recruiter_searchname=excel.Read_data(4, 230, 11);
		Recruiter_Search_Candidate_Search_box.sendKeys(Recruiter_searchname);
		Recruiter_Search_Candidate_Search_box.sendKeys(Keys.ENTER);
		excel.Write_data_pass(4, 230, 12);
		ExplicitWait(driver, recruiter_Search_Candidate_Search_chechbox_Button);
		recruiter_Search_Candidate_Search_chechbox_Button.click();
		excel.Write_data_pass(4, 231, 12);
		ExplicitWait(driver, Recruiter_Search_Candidate_Search_Dotted_Button);
		Recruiter_Search_Candidate_Search_Dotted_Button.click();
		ExplicitWait(driver, Recruiter_Search_Candidate_Search_Select_candidate);
		Recruiter_Search_Candidate_Search_Select_candidate.click();
		excel.Write_data_pass(4, 232, 12);
		ExplicitWait(driver, Recruiter_upload_success_popub);
		Recruiter_upload_success_popub.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 229, 12);
			excel.Write_data_fail(4, 230, 12);
			excel.Write_data_fail(4, 231, 12);
			excel.Write_data_pass(4, 232, 12);
			throw(e);
		}

	}

}

