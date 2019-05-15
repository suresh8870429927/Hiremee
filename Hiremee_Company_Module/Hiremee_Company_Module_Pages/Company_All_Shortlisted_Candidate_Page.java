package Hiremee_Company_Module_Pages;

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
import Driver_Started_Company_Module.Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Company_All_Shortlisted_Candidate_Page extends Driver_Class{

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

	@FindBy(how=How.ID,using="js-corp-allcandidate-date")
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
	String Profile_Type;
	String search_name;
	String Email_Template;
	String email_subject;
	String profile_type_invite;
	Excel_Sheet excel=new Excel_Sheet();
	static String job_url;

	public Company_All_Shortlisted_Candidate_Page(WebDriver ldriver)
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
			ExplicitWait(driver,Company_Candidate_Link);
			Company_Candidate_Link.click();
			excel.Write_data_pass(3, 112, 12);
			ExplicitWait(driver,Company_All_Candidate_Link);
			Company_All_Candidate_Link.click();	
			excel.Write_data_pass(3, 113, 12);
			Thread.sleep(3000);
			Company_Candidate_Search_type_dropdown.click();
			excel.Write_data_pass(3, 115, 12);
			Thread.sleep(3000);
			search_type=excel.Read_data(3, 116, 11);
			Company_dropdown_input_classname.sendKeys(search_type);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 116, 12);
			Thread.sleep(7000);
			Company_Candidate_Select_all_done_by_dropdown.click();
			Thread.sleep(3000);
			search_done_by=excel.Read_data(3, 118, 11);
			Company_dropdown_input_classname.sendKeys(search_done_by);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 118, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Profile_type_dropdown.click();
			Thread.sleep(7000);
			Profile_Type=excel.Read_data(3, 119, 11);
			Company_dropdown_input_classname.sendKeys(Profile_Type);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 119, 12);
			Thread.sleep(7000);
			Company_All_Candidate_date_picker.click();
			Thread.sleep(3000);
			Company_All_Candidate_date_picker_Ok_button.click();
			excel.Write_data_pass(3, 120, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Search_name_dropdown.click();
			Thread.sleep(3000);
			search_name=excel.Read_data(3, 121, 11);
			Company_dropdown_input_classname.sendKeys(search_name);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 121, 12);
			Thread.sleep(7000);
			Company_All_Candidate_Select_All_Check_box.click();
			excel.Write_data_pass(3, 122, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Select_All_Send_mail_Button.click();
			Thread.sleep(3000);
			Company_All_Candidate_Shortlisted_Email_Template_dropdown.click();
			Thread.sleep(3000);
			Email_Template=excel.Read_data(3, 123, 11);
			Company_dropdown_input_classname.sendKeys(Email_Template);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 123, 12);
			Thread.sleep(7000);
			Email_Template=excel.Read_data(3, 125, 11);
			Company_All_Candidate_Shortlisted_Email_subject_Text.sendKeys(Email_Template);
			excel.Write_data_pass(3, 125, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Shortlisted_Email_send_button.click();
			excel.Write_data_pass(3, 126, 12);
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
					job_url=excel.Read_data(3, 130, 11);
					driver.get(job_url);
					Thread.sleep(15000);
					driver.close();
				}
			}
			Thread.sleep(3000);
			driver.switchTo().window(parent);
			
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 112, 12);
			excel.Write_data_fail(3, 113, 12);
			excel.Write_data_fail(3, 115, 12);
			excel.Write_data_fail(3, 116, 12);
			excel.Write_data_fail(3, 118, 12);
			excel.Write_data_fail(3, 119, 12);
			excel.Write_data_fail(3, 120, 12);
			excel.Write_data_fail(3, 121, 12);
			excel.Write_data_fail(3, 122, 12);
			excel.Write_data_fail(3, 123, 12);
			excel.Write_data_fail(3, 125, 12);
			excel.Write_data_fail(3, 126, 12);
			throw(e);
		}
	}
		@Test
		public void Candidate_Invite_Hire() throws Exception
		{
			logger=extent.createTest("Candidate_Invite_Hire");
			try
			{
				
			//candidate--all candidate---invited and hire
			Thread.sleep(3000);
			Company_Candidate_Search_type_dropdown.click();
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(search_type);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 130, 12);
			Thread.sleep(7000);
			Company_Candidate_Select_all_done_by_dropdown.click();
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(search_done_by);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 131, 12);
			Thread.sleep(7000);
			Company_All_Candidate_Profile_type_dropdown.click();
			Thread.sleep(3000);
			profile_type_invite=excel.Read_data(3, 134, 11);
			Company_dropdown_input_classname.sendKeys(profile_type_invite);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 134, 12);
			Thread.sleep(7000);
			Company_All_Candidate_date_picker.click();
			excel.Write_data_pass(3, 135, 12);
			Thread.sleep(3000);
			Company_All_Candidate_date_picker_Ok_button.click();
			excel.Write_data_pass(3, 136, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Search_name_dropdown.click();
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(search_name);
			Thread.sleep(3000);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 137, 12);
			Thread.sleep(7000);
			Company_All_Candidate_Select_All_Check_box.click();
			excel.Write_data_pass(3, 139, 12);
			Thread.sleep(3000);
			Company_All_Candidate_Hired_Button.click();
			excel.Write_data_pass(3, 148, 12);
			excel.Write_data_pass(3, 159, 12);
			excel.Write_data_pass(3, 160, 12);
			excel.Write_data_pass(3, 161, 12);
			excel.Write_data_pass(3, 162, 12);
			excel.Write_data_pass(3, 163, 12);
			excel.Write_data_pass(3, 164, 12);
			excel.Write_data_pass(3, 165, 12);
			excel.Write_data_pass(3, 166, 12);
			excel.Write_data_pass(3, 167, 12);
			excel.Write_data_pass(3, 168, 12);
			excel.Write_data_pass(3, 169, 12);
			excel.Write_data_pass(3, 170, 12);
			excel.Write_data_pass(3, 171, 12);
			excel.Write_data_pass(3, 172, 12);
			excel.Write_data_pass(3, 173, 12);
			Thread.sleep(3000);
			Company_sendmail_success_popub.click();
			Thread.sleep(3000);
			Company_sendmail_success_popub.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 130, 12);
			excel.Write_data_fail(3, 131, 12);
			excel.Write_data_fail(3, 134, 12);
			excel.Write_data_fail(3, 135, 12);
			excel.Write_data_fail(3, 136, 12);
			excel.Write_data_fail(3, 137, 12);
			excel.Write_data_fail(3, 148, 12);
			excel.Write_data_fail(3, 159, 12);
			excel.Write_data_fail(3, 160, 12);
			excel.Write_data_fail(3, 161, 12);
			excel.Write_data_fail(3, 162, 12);
			excel.Write_data_fail(3, 163, 12);
			excel.Write_data_fail(3, 164, 12);
			excel.Write_data_fail(3, 165, 12);
			excel.Write_data_fail(3, 166, 12);
			excel.Write_data_fail(3, 167, 12);
			excel.Write_data_fail(3, 168, 12);
			excel.Write_data_fail(3, 169, 12);
			excel.Write_data_fail(3, 170, 12);
			excel.Write_data_fail(3, 171, 12);
			excel.Write_data_fail(3, 172, 12);
			excel.Write_data_fail(3, 173, 12);
			
			throw(e);
		}
	}
}


