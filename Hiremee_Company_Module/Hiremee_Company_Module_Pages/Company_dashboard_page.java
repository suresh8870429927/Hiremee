package Hiremee_Company_Module_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import Driver_Started_Company_Module.Driver_Class;
import Excel_Sheet_config.Excel_Sheet;


public class Company_dashboard_page extends Driver_Class
{
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[3]/div/div/div[3]/p/a/span/span")
	WebElement Company_Profile_Uodate;

	//communication address
	@FindBy(how=How.ID,using="js-comp_type")
	WebElement Company_Profile_company_type;

	@FindBy(how=How.ID,using="js-aboutcompany")
	WebElement Company_Profile_About_company;

	@FindBy(how=How.ID,using="js-comm_address")
	WebElement Company_Profile_communication_address;

	@FindBy(how=How.ID,using="select2-js-comm_state-container")
	WebElement Company_Profile_dropdown_state;

	@FindBy(how=How.CLASS_NAME,using="select2-search__field")
	WebElement Company_dropdown_input_classname;

	@FindBy(how=How.ID,using="select2-js-comm_city-container")
	WebElement Company_Profile_dropdown_city;

	//corporate address
	@FindBy(how=How.ID,using="js-corp_address")
	WebElement Company_Profile_corporate_address;

	@FindBy(how=How.ID,using="select2-js-corp_state-container")
	WebElement Company_Profile_dropdown_corp_state;

	@FindBy(how=How.ID,using="select2-js-corp_city-container")
	WebElement Company_Profile_dropdown_corp_city;

	@FindBy(how=How.ID,using="js-no_of_emp")
	WebElement Company_Profile_dropdown_number_of_employee;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div/div/form/div[2]/div/div[17]/div/button")
	WebElement Company_Profile_Update_button;

	@FindBy(how=How.ID,using="file")
	WebElement Company_Profile_choose_profile_image;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div/div[2]")
	WebElement Company_Profile_profile_image_crop;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/form/div/div[2]/input")
	WebElement Company_Profile_profile_image_upload_button;

	@FindBy(how=How.XPATH,using="//button[@class='confirm']")
	WebElement Company_upload_success_popub;

	@FindBy(how=How.ID,using="js-video_title")
	WebElement Company_Profile_Video_Title;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[2]/form/div/div[2]/div/div[3]/div[2]/label")
	WebElement Company_Profile_Upload_Video;

	@FindBy(how=How.ID,using="js-company-video-upload")
	WebElement Company_Profile_Video_Upload_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div/div/form/div[1]/div/a")
	WebElement Company_Profile_Close_button;

	WebDriver driver;
	String about_company;
	String company_communication_address;
	String company_state;
	String district;
	String corportae_address;
	String video_title;
	Excel_Sheet excel=new Excel_Sheet(); 
	public Company_dashboard_page(WebDriver ldriver)

	{
		this.driver=ldriver;		
		PageFactory.initElements(driver, this);
	}

	@Test
	public void comapany_dashboard_page() throws Exception
	{
		logger=extent.createTest("comapany_dashboard_page");
		try
		{
		//company dashboard profile-update
		Screen s = new Screen();
		Pattern fileInputTextBox = new Pattern("./Sikuli/pattern_images/FileTextBox.PNG");
		Pattern openButton = new Pattern("/Sikuli/pattern_images/OpenButton.PNG");
		ExplicitWait(driver, Company_Profile_Uodate);
		Company_Profile_Uodate.click();
		excel.Write_data_pass(3, 73, 12);
		excel.Write_data_pass(3, 74, 12);
		excel.Write_data_pass(3, 75, 12);
		excel.Write_data_pass(3, 76, 12);
		excel.Write_data_pass(3, 313, 12);
		excel.Write_data_pass(3, 314, 12);
		excel.Write_data_pass(3, 315, 12);
		//Company Profile Edit-commmunication address
		Company_Profile_company_type.click();
		new Select(Company_Profile_company_type).selectByValue("1");
		excel.Write_data_pass(3, 318, 12);
		about_company=excel.Read_data(3, 321, 11);
		Company_Profile_About_company.sendKeys(about_company);
		excel.Write_data_pass(3, 321, 12);
		company_communication_address=excel.Read_data(3, 324, 11);
		Company_Profile_communication_address.sendKeys(company_communication_address);
		excel.Write_data_pass(3, 324, 12);
		company_state=excel.Read_data(3, 325, 11);
		Thread.sleep(3000);
		Company_Profile_dropdown_state.click();
		Thread.sleep(3000);
		Company_dropdown_input_classname.sendKeys(company_state);
		Thread.sleep(3000);
		Company_dropdown_input_classname.sendKeys(Keys.ENTER);
		excel.Write_data_pass(3, 325, 12);
		district=excel.Read_data(3, 326, 11);
		Thread.sleep(3000);
		Company_Profile_dropdown_city.click();
		Company_dropdown_input_classname.sendKeys(district);
		Thread.sleep(3000);
		Company_dropdown_input_classname.sendKeys(Keys.ENTER);
		excel.Write_data_pass(3, 326, 12);
		//Corporate Address
		corportae_address=excel.Read_data(3, 329, 11);
		Company_Profile_corporate_address.sendKeys(corportae_address);
		excel.Write_data_pass(3, 329, 12);
		Thread.sleep(3000);
		Company_Profile_dropdown_corp_state.click();
		company_state=excel.Read_data(3, 330, 11);
		Thread.sleep(3000);
		Company_dropdown_input_classname.sendKeys(company_state);
		Thread.sleep(3000);
		Company_dropdown_input_classname.sendKeys(Keys.ENTER);
		excel.Write_data_pass(3, 330, 12);
		Thread.sleep(3000);
		Company_Profile_dropdown_corp_city.click();
		district=excel.Read_data(3, 331, 11);
		Thread.sleep(3000);
		Company_dropdown_input_classname.sendKeys(district);
		Thread.sleep(3000);
		Company_dropdown_input_classname.sendKeys(Keys.ENTER);
		excel.Write_data_pass(3, 331, 12);
		Thread.sleep(3000);
		new Select(Company_Profile_dropdown_number_of_employee).selectByValue("1");
		excel.Write_data_pass(3, 332, 12);
		Thread.sleep(3000);
		Company_Profile_Update_button.click();
		excel.Write_data_pass(3, 333, 12);
		//upload picture and crop image
		//image upload and crop image
		Thread.sleep(3000);
		Company_Profile_choose_profile_image.click();
		excel.Write_data_pass(3, 341, 12);
		excel.Write_data_pass(3, 342, 12);
		s.wait(fileInputTextBox,10);
		s.type(fileInputTextBox,"D:\\Automation_directory\\Hiremee_Product_Sanity_Testing\\Sikuli\\images\\Chrysanthemum.jpg");
		s.click(openButton);
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.clickAndHold(Company_Profile_profile_image_crop).moveByOffset(60, 60).release().build().perform();
		excel.Write_data_pass(3, 344, 12);
		Company_Profile_profile_image_upload_button.click();
		excel.Write_data_pass(3, 345, 12);
		Thread.sleep(10000);
		ExplicitWait(driver, Company_upload_success_popub);
		Company_upload_success_popub.click();
		//video profile update
		video_title=excel.Read_data(3, 346, 11);
		Company_Profile_Video_Title.sendKeys(video_title);
		excel.Write_data_pass(3, 346, 12);
		Thread.sleep(5000);
		Company_Profile_Upload_Video.click();
		excel.Write_data_pass(3, 347, 12);
		s.wait(fileInputTextBox,10);
		s.type(fileInputTextBox,"D:\\Automation_directory\\Hiremee_Product_Sanity_Testing\\Sikuli\\video\\SampleVideo_1280x720_1mb.mp4");
		s.click(openButton);
		Thread.sleep(3000);
		Company_Profile_Video_Upload_Button.click();
		excel.Write_data_pass(3, 350, 12);
		Thread.sleep(15000);
		Company_upload_success_popub.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 73, 12);
			excel.Write_data_fail(3, 74, 12);
			excel.Write_data_fail(3, 75, 12);
			excel.Write_data_fail(3, 76, 12);
			excel.Write_data_fail(3, 313, 12);
			excel.Write_data_fail(3, 314, 12);
			excel.Write_data_fail(3, 315, 12);
			excel.Write_data_fail(3, 318, 12);
			excel.Write_data_fail(3, 321, 12);
			excel.Write_data_fail(3, 324, 12);
			excel.Write_data_fail(3, 325, 12);
			excel.Write_data_fail(3, 326, 12);
			excel.Write_data_fail(3, 329, 12);
			excel.Write_data_fail(3, 330, 12);
			excel.Write_data_fail(3, 331, 12);
			excel.Write_data_fail(3, 332, 12);
			excel.Write_data_fail(3, 333, 12);
			excel.Write_data_fail(3, 341, 12);
			excel.Write_data_fail(3, 342, 12);
			excel.Write_data_fail(3, 344, 12);
			excel.Write_data_fail(3, 345, 12);
			excel.Write_data_fail(3, 346, 12);
			excel.Write_data_fail(3, 347, 12);
			excel.Write_data_fail(3, 350, 12);
			throw(e);
		}
	}
}
