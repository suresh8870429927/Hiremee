package Hiremee_Recruiter_Module_Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Receruiter_Module.Recruiter_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Recruiter_All_Shortlisted_Candidate_Page extends Recruiter_Driver_Class{

	@FindBy(how=How.LINK_TEXT,using="Candidates")
	WebElement Company_Candidate_Link;

	@FindBy(how=How.LINK_TEXT,using="All Candidate")
	WebElement Company_All_Candidate_Link;

	@FindBy(how=How.ID,using="select2-js-search_type-container")
	WebElement Company_Candidate_Search_type_dropdown;

	@FindBy(how=How.CLASS_NAME,using="select2-search__field")
	WebElement Company_dropdown_input_classname;

	@FindBy(how=How.ID,using="select2-js-all-done-by-container")
	WebElement Company_Candidate_Select_all_done_by_dropdown;

	@FindBy(how=How.ID,using="select2-js-prof_type-container")
	WebElement Company_All_Candidate_Profile_type_dropdown;

	@FindBy(how=How.NAME,using="allcandidate_date")
	WebElement Company_All_Candidate_date_picker;

	@FindBy(how=How.XPATH,using="/html/body/div[16]/div/div[2]/button[4]")
	WebElement Company_All_Candidate_date_picker_Ok_button;

	@FindBy(how=How.ID,using="select2-js-type-search_name-container")
	WebElement Company_All_Candidate_Search_name_dropdown;

	@FindBy(how=How.ID,using="js_checkall")
	WebElement Company_All_Candidate_Select_All_Check_box;

	@FindBy(how=How.ID,using="js_email")
	WebElement Company_All_Candidate_Select_All_Send_mail_Button;

	@FindBy(how=How.ID,using="select2-mailtemplate-container")
	WebElement Company_All_Candidate_Shortlisted_Email_Template_dropdown;

	@FindBy(how=How.ID,using="subject")
	WebElement Company_All_Candidate_Shortlisted_Email_subject_Text;

	@FindBy(how=How.ID,using="send-selected-email")
	WebElement Company_All_Candidate_Shortlisted_Email_send_button;
	
	@FindBy(how=How.XPATH,using="//button[@class='confirm']")
	WebElement Company_sendmail_success_popub;

	@FindBy(how=How.ID,using="js_invited")
	WebElement Company_All_Candidate_Hired_Button;

	WebDriver driver;
	String search_type;
	String search_done_by;
	String profile_type;
	String Search_name;
	String Email_template_name_invite;
	String Email_subject;
	String job_url;
	String invite_profile_type;
	Excel_Sheet excel=new Excel_Sheet();

	public Recruiter_All_Shortlisted_Candidate_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void Candidate_Shortlisted_candidate() throws Exception
	{
		logger=extent.createTest("Candidate_Shortlisted_candidate");
		try
		{
			//candidate--all candidate---shortlisted
			Thread.sleep(3000);
			Company_Candidate_Link.click();
			excel.Write_data_pass(4, 69, 12);
			Thread.sleep(5000);
			Company_All_Candidate_Link.click();
			excel.Write_data_pass(4, 70, 12);
			Thread.sleep(3000);
			Company_Candidate_Search_type_dropdown.click();
			excel.Write_data_pass(4, 77, 12);
			Thread.sleep(3000);
			search_type=excel.Read_data(4, 78, 11);
			Company_dropdown_input_classname.sendKeys(search_type);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 78, 12);
			Thread.sleep(3000);
			Company_Candidate_Select_all_done_by_dropdown.click();
			Thread.sleep(3000);
			search_done_by=excel.Read_data(4, 80, 11);
			Company_dropdown_input_classname.sendKeys(search_done_by);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 80, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Profile_type_dropdown.click();
			Thread.sleep(3000);
			profile_type=excel.Read_data(4, 81, 11);
			Company_dropdown_input_classname.sendKeys(profile_type);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 81, 12);
			Thread.sleep(3000);
			Company_All_Candidate_date_picker.click();
			excel.Write_data_pass(4, 82, 12);
			Thread.sleep(3000);
			Company_All_Candidate_date_picker_Ok_button.click();
			Thread.sleep(3000);
			Company_All_Candidate_Search_name_dropdown.click();
			Thread.sleep(3000);
			Search_name=excel.Read_data(4, 83, 11);
			Company_dropdown_input_classname.sendKeys(Search_name);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 83, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Select_All_Check_box.click();
			excel.Write_data_pass(4, 84, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Select_All_Send_mail_Button.click();
			excel.Write_data_pass(4, 85, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Shortlisted_Email_Template_dropdown.click();
			Thread.sleep(3000);
			Email_template_name_invite=excel.Read_data(4, 87, 11);
			Company_dropdown_input_classname.sendKeys(Email_template_name_invite);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 87, 12);
			Email_subject=excel.Read_data(4, 88, 11);
			Company_All_Candidate_Shortlisted_Email_subject_Text.sendKeys(Email_subject);
			excel.Write_data_pass(4, 88, 12);
			Company_All_Candidate_Shortlisted_Email_send_button.click();
			Thread.sleep(3000);
			Company_sendmail_success_popub.click();
			Thread.sleep(3000);
			//job mail-updated
			String parent=driver.getWindowHandle();
			Robot a=new Robot();
			a.keyPress(KeyEvent.VK_CONTROL);
			a.keyPress(KeyEvent.VK_T);
			a.keyRelease(KeyEvent.VK_CONTROL);
			a.keyRelease(KeyEvent.VK_T);
			Set<String>s2=driver.getWindowHandles();
			for(String child1:s2) {
				if(!parent.equalsIgnoreCase(child1))
				{
					Thread.sleep(3000);
					driver.switchTo().window(child1);
					Thread.sleep(5000);
					job_url=excel.Read_data(4, 89, 11);
					driver.get(job_url);
					excel.Write_data_pass(4, 89, 12);
					Thread.sleep(15000);
					driver.close();
				}
			}
			Thread.sleep(3000);
			driver.switchTo().window(parent);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 69, 12);
			excel.Write_data_fail(4, 70, 12);
			excel.Write_data_fail(4, 77, 12);
			excel.Write_data_fail(4, 78, 12);
			excel.Write_data_fail(4, 80, 12);
			excel.Write_data_fail(4, 81, 12);
			excel.Write_data_fail(4, 82, 12);
			excel.Write_data_fail(4, 83, 12);
			excel.Write_data_fail(4, 84, 12);
			excel.Write_data_fail(4, 85, 12);
			excel.Write_data_fail(4, 87, 12);
			excel.Write_data_fail(4, 88, 12);
			excel.Write_data_fail(4, 89, 12);
			throw(e);
		}
	}
	@Test
	public void Candidate_Invite_Hire() throws Exception
	{
		logger=extent.createTest("Candidate_Invite_Hire");
		try {
			//candidate--all candidate---invited and hire
			Thread.sleep(3000);
			Company_Candidate_Search_type_dropdown.click();
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(search_type);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 93, 12);
			Thread.sleep(3000);
			Company_Candidate_Select_all_done_by_dropdown.click();
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(search_done_by);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 94, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Profile_type_dropdown.click();
			Thread.sleep(3000);
			invite_profile_type=excel.Read_data(4, 96, 11);
			Company_dropdown_input_classname.sendKeys(invite_profile_type);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 96, 12);
			Thread.sleep(3000);
			Company_All_Candidate_date_picker.click();
			excel.Write_data_pass(4, 97, 12);
			Thread.sleep(3000);
			Company_All_Candidate_date_picker_Ok_button.click();
			excel.Write_data_pass(4, 98, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Search_name_dropdown.click();
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Search_name);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 99, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Select_All_Check_box.click();
			excel.Write_data_pass(4, 100, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Hired_Button.click();
			excel.Write_data_pass(4, 110, 12);
			Thread.sleep(3000);
			Company_sendmail_success_popub.click();
			Thread.sleep(3000);
			Company_sendmail_success_popub.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 93, 12);
			excel.Write_data_fail(4, 94, 12);
			excel.Write_data_fail(4, 96, 12);
			excel.Write_data_fail(4, 97, 12);
			excel.Write_data_fail(4, 98, 12);
			excel.Write_data_fail(4, 99, 12);
			excel.Write_data_fail(4, 100,12);
			excel.Write_data_fail(4, 110, 12);
			throw(e);
		}
	}
}


