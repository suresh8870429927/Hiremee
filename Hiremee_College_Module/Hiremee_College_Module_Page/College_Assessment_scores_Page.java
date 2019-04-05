package Hiremee_College_Module_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started_College_Module.College_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class College_Assessment_scores_Page extends College_Driver_Class{
	
	@FindBy(how=How.LINK_TEXT,using="Assessment Scores")
	WebElement College_Assessment_Scores;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div/div/div[4]/ul/li/button")
	WebElement College_Candidate_Assessment_View;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div/div/div[4]/ul/li/ul/li[1]/a")
	WebElement College_Candidate_Assessment_Result;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[4]/div/div/button")
	WebElement College_Candidate_Assessment_Result_popub_close;
	
	@FindBy(how=How.ID,using="js-profile-detailed-view")
	WebElement College_Candidate_Assessment_Student_Profile;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/button")
	WebElement College_Candidate_Student_Profile_popub_close;
	
	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet();
	public College_Assessment_scores_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	@Test
	public void Collge_Assessment_Scores() throws Exception
	{
		logger=extent.createTest("Collge_Assessment_Scores");
		try
		{
		ExplicitWait(driver, College_Assessment_Scores);
		College_Assessment_Scores.click();
		ExplicitWait(driver, College_Candidate_Assessment_View);
		College_Candidate_Assessment_View.click();
		ExplicitWait(driver, College_Candidate_Assessment_Result);
		College_Candidate_Assessment_Result.click();
		ExplicitWait(driver, College_Candidate_Assessment_Result_popub_close);
		College_Candidate_Assessment_Result_popub_close.click();
		ExplicitWait(driver, College_Candidate_Assessment_View);
		College_Candidate_Assessment_View.click();
		ExplicitWait(driver, College_Candidate_Assessment_Student_Profile);
		College_Candidate_Assessment_Student_Profile.click();
		ExplicitWait(driver, College_Candidate_Student_Profile_popub_close);
		College_Candidate_Student_Profile_popub_close.click();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

}
