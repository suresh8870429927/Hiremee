package Hiremee_Candidate_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Candidate_Feedback_and_logout_Page extends Candidate_Driver_Class
{
	@FindBy(how=How.LINK_TEXT,using="Feedback")
	WebElement candidate_feedback;

	@FindBy(how=How.ID,using="feedback_subject")
	WebElement candidate_feedback_Subject;

	@FindBy(how=How.ID,using="feedback_message")
	WebElement candidate_feedback_message;

	@FindBy(how=How.ID,using="btn_feedbackpost")
	WebElement candidate_feedback_submit_button;

	@FindBy(how=How.XPATH,using="/html/body/div[16]/div[7]/div/button")
	WebElement candidate_sucess_popub;

	/*
	@FindBy(how=How.CSS,using="#pcoded > div.pcoded-container.navbar-wrapper > nav > div > div.navbar-container.container-fluid > div > ul.nav-right.p-t-10 > li.user-profile.header-notification > a > i")
	public WebElement Candidate_modal;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/nav/div/div[2]/div/ul[2]/li[3]/ul/li[5]/a")
	public WebElement Candidate_Logout;
*/

	WebDriver driver;
	String subject;
	String message;
	Excel_Sheet excel=new Excel_Sheet();
	public Candidate_Feedback_and_logout_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void feedback_and_logout() throws Exception
	{
		logger=extent.createTest("feedback_and_logout");
		try
		{
			ExplicitWait(driver,candidate_feedback);
			candidate_feedback.click();
			excel.Write_data_pass(1, 343, 12);
			excel.Write_data_pass(1, 344, 12);
			subject=excel.Read_data(1, 346, 11);
			candidate_feedback_Subject.sendKeys(subject);
			excel.Write_data_pass(1, 346, 12);
			Thread.sleep(3000);
			message=excel.Read_data(1, 349, 11);
			candidate_feedback_message.sendKeys(message);
			excel.Write_data_pass(1, 349, 12);
			Thread.sleep(3000);
			candidate_feedback_submit_button.click();
			excel.Write_data_pass(1, 352, 12);
			ExplicitWait(driver, candidate_sucess_popub);
			Thread.sleep(5000);
			candidate_sucess_popub.click();
			excel.Write_data_pass(1, 358, 12);
		/*
			ExplicitWait(driver,Candidate_modal);
			WebElement element1=Candidate_modal;
			Actions act1=new Actions(driver);
			Thread.sleep(3000);
			act1.moveToElement(element1).build().perform();
			Candidate_Logout.click();
			excel.Write_data_pass(1, 358, 12);
			*/
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 343, 12);
			excel.Write_data_fail(1, 344, 12);
			excel.Write_data_fail(1, 346, 12);
			excel.Write_data_fail(1, 349, 12);
			excel.Write_data_fail(1, 352, 12);
			excel.Write_data_fail(1, 358, 12);
			throw(e);
		}
	}
	
	
	

}
