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

public class Recruiter_Post_a_job_page extends Recruiter_Driver_Class{

	@FindBy(how=How.LINK_TEXT,using="Jobs")
	WebElement Company_Jobs_Link;

	@FindBy(how=How.LINK_TEXT,using="Post a Job")
	WebElement Company_post_a_Job_Link;

	@FindBy(how=How.NAME,using="job_title")
	WebElement Company_post_a_Job_Job_Title;

	@FindBy(how=How.ID,using="select2-job_industrys-container")
	WebElement Company_post_a_Job_Job_Category_dropdown;

	@FindBy(how=How.XPATH,using="/html/body/span[2]/span/span[1]/input")
	WebElement Company_post_a_Job_Job_category_input_dropdown;

	@FindBy(how=How.CLASS_NAME,using="select2-search__field")
	WebElement Company_dropdown_input_classname;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/form/div[15]/div/div/div[3]/div[3]")
	WebElement Company_post_a_Job_Job_Description;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/form/div[17]/div/button")
	WebElement Company_post_a_Job_Save_as_draft;

	@FindBy(how=How.ID,using="select2-js-coursetype-container")
	WebElement Company_post_a_Job_Education_dropdown;

	@FindBy(how=How.XPATH,using="/html/body/span[2]/span/span[1]/input")
	WebElement Company_post_a_Job_Education_input_dropdown;

	@FindBy(how=How.ID,using="js-add-qualifications")
	WebElement Company_post_a_Job_Add_degree_button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/form/div[7]/div/div/span[1]/span[1]/span/ul/li/input")
	WebElement Company_post_a_Job_Skills_input_dropdown;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[8]/div/button")
	WebElement Company_post_a_Job_second_Save_as_draft;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/div/div/div/div/form/div[1]/div[2]/div/label[2]")
	WebElement Company_post_a_Job_Check_application_first_button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/div/div/div/div/form/div[3]/div[3]/div/div/input")
	WebElement Company_post_a_Job_Last_update_date_picker;

	@FindBy(how=How.XPATH,using="/html/body/div[12]/div/div[2]/button[4]")
	WebElement Company_post_a_Job_Last_date_apply_ok_button;

	@FindBy(how=How.ID,using="js-job-draft-button")
	WebElement Company_post_a_Job_Third_Save_as_draft;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/div[2]/form/div/button")
	WebElement Company_post_a_Job_Save_and_post;

	WebDriver driver;
	String Job_Title;
	String job_category;
	String location;
	String job_description;
	String education;
	String skills;
	Excel_Sheet excel=new Excel_Sheet();
	public Recruiter_Post_a_job_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void Recruiter_Post_a_job() throws Exception
	{
		logger=extent.createTest("Recruiter_Post_a_job");
		try
		{
			//jobs-first page
			ExplicitWait(driver, Company_Jobs_Link);
			Company_Jobs_Link.click();
			excel.Write_data_pass(4, 140, 12);
			excel.Write_data_pass(4, 141, 12);
			ExplicitWait(driver, Company_post_a_Job_Link);
			Company_post_a_Job_Link.click();
			ExplicitWait(driver, Company_post_a_Job_Job_Title);
			Job_Title=excel.Read_data(4, 143, 11);
			Company_post_a_Job_Job_Title.sendKeys(Job_Title);
			excel.Write_data_pass(4, 143, 12);
			Company_post_a_Job_Job_Category_dropdown.click();
			ExplicitWait(driver, Company_post_a_Job_Job_category_input_dropdown);
			job_category=excel.Read_data(4, 145, 11);
			Company_post_a_Job_Job_category_input_dropdown.sendKeys(job_category);
			ExplicitWait(driver, Company_post_a_Job_Job_category_input_dropdown);
			Company_post_a_Job_Job_category_input_dropdown.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 145, 12);
			ExplicitWait(driver, Company_dropdown_input_classname);
			location=excel.Read_data(4, 147, 11);
			Company_dropdown_input_classname.sendKeys(location);
			ExplicitWait(driver, Company_dropdown_input_classname);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 147, 12);
			ExplicitWait(driver, Company_post_a_Job_Job_Description);
			job_description=excel.Read_data(4, 162, 11);
			Company_post_a_Job_Job_Description.sendKeys(job_description);
			excel.Write_data_pass(4, 162, 12);
			ExplicitWait(driver, Company_post_a_Job_Save_as_draft);
			Company_post_a_Job_Save_as_draft.click();
			excel.Write_data_pass(4, 168, 12);
			Thread.sleep(5000);
			//Second page
			Company_post_a_Job_Education_dropdown.click();
			excel.Write_data_pass(4, 171, 12);
			ExplicitWait(driver, Company_post_a_Job_Education_input_dropdown);
			education=excel.Read_data(4, 172, 11);
			Company_post_a_Job_Education_input_dropdown.sendKeys(education);
			ExplicitWait(driver, Company_post_a_Job_Education_input_dropdown);
			Company_post_a_Job_Education_input_dropdown.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 172, 12);
			Company_post_a_Job_Add_degree_button.click();
			excel.Write_data_pass(4, 176, 12);
			ExplicitWait(driver, Company_Jobs_Link);
			skills=excel.Read_data(4, 179, 11);
			Company_post_a_Job_Skills_input_dropdown.sendKeys(skills);
			ExplicitWait(driver, Company_post_a_Job_Skills_input_dropdown);
			Company_post_a_Job_Skills_input_dropdown.sendKeys(Keys.ENTER);
			excel.Write_data_pass(4, 179, 12);
			ExplicitWait(driver, Company_post_a_Job_second_Save_as_draft);
			Company_post_a_Job_second_Save_as_draft.click();
			excel.Write_data_pass(4, 199, 12);
			Thread.sleep(5000);
			//third-page
			Company_post_a_Job_Check_application_first_button.click();
			excel.Write_data_pass(4, 200, 12);
			ExplicitWait(driver, Company_post_a_Job_Last_update_date_picker);
			Company_post_a_Job_Last_update_date_picker.click();
			excel.Write_data_pass(4, 201, 12);
			ExplicitWait(driver, Company_post_a_Job_Last_date_apply_ok_button);
			Company_post_a_Job_Last_date_apply_ok_button.click();
			excel.Write_data_pass(4, 202, 12);
			Company_post_a_Job_Third_Save_as_draft.click();
			excel.Write_data_pass(4, 227, 12);
			//fourth page
			Thread.sleep(5000);
			Company_post_a_Job_Save_and_post.click();
			excel.Write_data_pass(4, 228, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 140, 12);
			excel.Write_data_fail(4, 141, 12);
			excel.Write_data_fail(4, 143, 12);
			excel.Write_data_fail(4, 145, 12);
			excel.Write_data_fail(4, 147, 12);
			excel.Write_data_fail(4, 162, 12);
			excel.Write_data_fail(4, 168, 12);
			excel.Write_data_fail(4, 171, 12);
			excel.Write_data_fail(4, 172, 12);
			excel.Write_data_fail(4, 176, 12);
			excel.Write_data_fail(4, 179, 12);
			excel.Write_data_fail(4, 199, 12);
			excel.Write_data_fail(4, 200, 12);
			excel.Write_data_fail(4, 201, 12);
			excel.Write_data_fail(4, 202, 12);
			excel.Write_data_fail(4, 227, 12);
			excel.Write_data_fail(4, 228, 12);
			throw(e);
		}
	}

}
