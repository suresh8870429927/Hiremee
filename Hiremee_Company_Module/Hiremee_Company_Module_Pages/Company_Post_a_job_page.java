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

public class Company_Post_a_job_page extends Driver_Class{

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
	String job_Title;
	String Job_Category;
	String job_location;
	String job_description;
	String job_education;
	String Skills;
	Excel_Sheet excel=new Excel_Sheet();
	public Company_Post_a_job_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void company_Post_a_job() throws Exception
	{
		logger=extent.createTest("company_Post_a_job");
		try
		{
			//jobs-first page
			ExplicitWait(driver, Company_Jobs_Link);
			Company_Jobs_Link.click();
			excel.Write_data_pass(3, 174, 12);
			excel.Write_data_pass(3, 175, 12);
			excel.Write_data_pass(3, 176, 12);
			excel.Write_data_pass(3, 177, 12);
			excel.Write_data_pass(3, 178, 12);
			excel.Write_data_pass(3, 183, 12);
			ExplicitWait(driver, Company_post_a_Job_Link);
			Company_post_a_Job_Link.click();
			excel.Write_data_pass(3, 184, 12);
			excel.Write_data_pass(3, 179, 12);
			excel.Write_data_pass(3, 180, 12);
			excel.Write_data_pass(3, 181, 12);
			ExplicitWait(driver, Company_post_a_Job_Job_Title);
			job_Title=excel.Read_data(3, 186, 11);
			Company_post_a_Job_Job_Title.sendKeys(job_Title);
			excel.Write_data_pass(3, 186, 12);
			Company_post_a_Job_Job_Category_dropdown.click();
			ExplicitWait(driver, Company_post_a_Job_Job_category_input_dropdown);
			Job_Category=excel.Read_data(3, 188, 11);
			Company_post_a_Job_Job_category_input_dropdown.sendKeys(Job_Category);
			ExplicitWait(driver, Company_post_a_Job_Job_category_input_dropdown);
			Company_post_a_Job_Job_category_input_dropdown.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 188, 12);
			ExplicitWait(driver, Company_dropdown_input_classname);
			job_location=excel.Read_data(3, 190, 11);
			Company_dropdown_input_classname.sendKeys(job_location);
			ExplicitWait(driver, Company_dropdown_input_classname);
			Company_dropdown_input_classname.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 190, 12);
			ExplicitWait(driver, Company_post_a_Job_Job_Description);
			job_description=excel.Read_data(3, 205, 11);
			Company_post_a_Job_Job_Description.sendKeys(job_description);
			excel.Write_data_pass(3, 204, 12);
			excel.Write_data_pass(3, 205, 12);
			ExplicitWait(driver, Company_post_a_Job_Save_as_draft);
			Company_post_a_Job_Save_as_draft.click();
			excel.Write_data_pass(3, 211, 12);
			//Second page
			Company_post_a_Job_Education_dropdown.click();
			ExplicitWait(driver, Company_post_a_Job_Education_input_dropdown);
			job_education=excel.Read_data(3, 215, 11);
			Company_post_a_Job_Education_input_dropdown.sendKeys(job_education);
			ExplicitWait(driver, Company_post_a_Job_Education_input_dropdown);
			Company_post_a_Job_Education_input_dropdown.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 215, 12);
			Company_post_a_Job_Add_degree_button.click();
			excel.Write_data_pass(3, 219, 12);
			ExplicitWait(driver, Company_post_a_Job_Skills_input_dropdown);
			Skills=excel.Read_data(3, 221, 11);
			Company_post_a_Job_Skills_input_dropdown.sendKeys(Skills);
			ExplicitWait(driver, Company_post_a_Job_Skills_input_dropdown);
			Company_post_a_Job_Skills_input_dropdown.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 221, 12);
			ExplicitWait(driver, Company_post_a_Job_second_Save_as_draft);
			Company_post_a_Job_second_Save_as_draft.click();
			excel.Write_data_pass(3, 236, 12);
			//third-page
			ExplicitWait(driver, Company_post_a_Job_Check_application_first_button);
			Company_post_a_Job_Check_application_first_button.click();
			excel.Write_data_pass(3, 243, 12);
			ExplicitWait(driver, Company_post_a_Job_Last_update_date_picker);
			Company_post_a_Job_Last_update_date_picker.click();
			excel.Write_data_pass(3, 245, 12);
			ExplicitWait(driver, Company_post_a_Job_Last_date_apply_ok_button);
			Company_post_a_Job_Last_date_apply_ok_button.click();
			Company_post_a_Job_Third_Save_as_draft.click();
			excel.Write_data_pass(3, 270, 12);
			//fourth page
			Thread.sleep(5000);
			Company_post_a_Job_Save_and_post.click();
			excel.Write_data_pass(3, 271, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 174, 12);
			excel.Write_data_fail(3, 175, 12);
			excel.Write_data_fail(3, 176, 12);
			excel.Write_data_fail(3, 177, 12);
			excel.Write_data_fail(3, 178, 12);
			excel.Write_data_fail(3, 179, 12);
			excel.Write_data_fail(3, 180, 12);
			excel.Write_data_fail(3, 181, 12);
			excel.Write_data_fail(3, 183, 12);
			excel.Write_data_fail(3, 184, 12);
			excel.Write_data_fail(3, 186, 12);
			excel.Write_data_fail(3, 188, 12);
			excel.Write_data_fail(3, 190, 12);
			excel.Write_data_fail(3, 204, 12);
			excel.Write_data_fail(3, 205, 12);
			excel.Write_data_fail(3, 211, 12);
			excel.Write_data_fail(3, 215, 12);
			excel.Write_data_fail(3, 219, 12);
			excel.Write_data_fail(3, 221, 12);
			excel.Write_data_fail(3, 236, 12);
			excel.Write_data_fail(3, 243, 12);
			excel.Write_data_fail(3, 245, 12);
			excel.Write_data_fail(3, 270, 12);
			excel.Write_data_fail(3, 271, 12);
			throw(e);
		}
	}
}
