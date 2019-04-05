package Hiremee_Candidate_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Candidate_Invite_Friends_Page extends Candidate_Driver_Class
{

	@FindBy(how=How.LINK_TEXT,using="Invite Friends")
	WebElement candidate_invite_friends_link;

	@FindBy(how=How.ID,using="email_address")
	WebElement candidate_invite_friendS_Email_address;

	@FindBy(how=How.ID,using="btn_submit")
	WebElement candidate_invite_friendS_Send_Invitation;

	@FindBy(how=How.XPATH,using="/html/body/div[15]/div[7]/div/button")
	WebElement candidate_success_popub;


	WebDriver driver;
	String Email_address;
	Excel_Sheet excel=new Excel_Sheet();
	public Candidate_Invite_Friends_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void candidate_invite_friends() throws Exception
	{
		logger=extent.createTest("candidate_invite_friends");
		try
		{
			Thread.sleep(2000);
			candidate_invite_friends_link.click();
			excel.Write_data_pass(1, 296, 12);
			Thread.sleep(3000);
			Email_address=excel.Read_data(1, 297, 11);
			candidate_invite_friendS_Email_address.sendKeys(Email_address);
			excel.Write_data_pass(1, 297, 12);
			Thread.sleep(3000);
			candidate_invite_friendS_Send_Invitation.click();
			excel.Write_data_pass(1, 298, 12);
			excel.Write_data_pass(1, 299, 12);
			Thread.sleep(3000);
			candidate_success_popub.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 296, 12);
			excel.Write_data_fail(1, 297, 12);
			excel.Write_data_fail(1, 298, 12);
			excel.Write_data_fail(1, 299, 12);
			throw(e);
		}
	}
}
