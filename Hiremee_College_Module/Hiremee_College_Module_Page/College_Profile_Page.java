package Hiremee_College_Module_Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import Driver_Started_College_Module.College_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class College_Profile_Page extends College_Driver_Class
{
	@FindBy(how=How.LINK_TEXT,using="College Profile")
	WebElement college_Profile_link;
	
	@FindBy(how=How.NAME,using="about_col")
	WebElement college_Profile_About_college;

	//@FindBy(how=How.NAME,using="col_address")
	//WebElement college_Profile_college_Address;
	
	@FindBy(how=How.ID,using="select2-js-state-container")
	WebElement College_Profile_dropdown_corp_state;

	@FindBy(how=How.ID,using="select2-js-district-container")
	WebElement College_Profile_dropdown_District;
	
	@FindBy(how=How.CLASS_NAME,using="select2-search__field")
	WebElement College_dropdown_input_class_name;
	
	@FindBy(how=How.ID,using="js_college_register_button")
	WebElement College_Profile_Register_button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[3]/a/i")
	WebElement college_Profile_Edit_Pencil;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div/div[3]/a/i")
	WebElement college_Profile_Edit_Pencil1;
	
	@FindBy(how=How.ID,using="file")
	WebElement College_Profile_choose_profile_image;


	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div[2]")
	WebElement College_Profile_profile_image_crop;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div[2]/form/div/div[2]/input")
	WebElement College_Profile_profile_image_upload_button;

	@FindBy(how=How.XPATH,using="/html/body/div[15]/div[7]/div/button")
	WebElement College_upload_success_popub;

	@FindBy(how=How.ID,using="video_title")
	WebElement College_Profile_Video_Title;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/label")
	WebElement College_Profile_Upload_Video;

	@FindBy(how=How.ID,using="js_college_profilevideo_button")
	WebElement College_Profile_Video_Upload_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div/div/form/div[1]/div/a/i")
	WebElement Company_Profile_Close_button;
	

	WebDriver driver;
	String About_college;
	String college_State;
	String college_district;
	String Video_Title;
	Excel_Sheet excel=new Excel_Sheet();
	public College_Profile_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void College_Profile() throws Exception 
	{
		logger=extent.createTest("College_Profile");
		try
		{
			Screen s = new Screen();
			Pattern fileInputTextBox = new Pattern("./Sikuli/pattern_images/FileTextBox.PNG");
			Pattern openButton = new Pattern("./Sikuli/pattern_images/OpenButton.PNG");
			ExplicitWait(driver, college_Profile_link);	
			college_Profile_link.click();
			excel.Write_data_pass(2, 180, 12);
			Thread.sleep(5000);
			college_Profile_Edit_Pencil.click();
			excel.Write_data_pass(2, 182, 12);
			About_college=excel.Read_data(2,186,11);
			college_Profile_About_college.sendKeys(About_college);
			excel.Write_data_pass(2, 186, 12);
			college_State=excel.Read_data(2, 192, 11);
			College_Profile_dropdown_corp_state.click();
			Thread.sleep(3000);
			College_dropdown_input_class_name.sendKeys(college_State);
			Thread.sleep(3000);
			College_dropdown_input_class_name.sendKeys(Keys.ENTER);
			excel.Write_data_pass(2, 192, 12);
			college_district=excel.Read_data(2, 194, 11);
			College_Profile_dropdown_District.click();
			Thread.sleep(3000);
			College_dropdown_input_class_name.sendKeys(college_district);
			Thread.sleep(3000);
			College_dropdown_input_class_name.sendKeys(Keys.ENTER);
			excel.Write_data_pass(2, 194, 12);
			Thread.sleep(3000);
			College_Profile_Register_button.click();
			excel.Write_data_pass(2, 196, 12);
			//image upload
			//upload picture and crop image
			//image upload and crop image
			Thread.sleep(4000);
			college_Profile_Edit_Pencil1.click();
			excel.Write_data_pass(2, 200, 12);
			Thread.sleep(5000);
			College_Profile_choose_profile_image.click();
			excel.Write_data_pass(2, 201, 12);
			s.wait(fileInputTextBox,10);
			s.type(fileInputTextBox,"D:\\Automation_directory\\Hiremee_Product_Sanity_Testing\\Sikuli\\images\\Chrysanthemum.jpg");
			s.click(openButton);
			Actions act=new Actions(driver);
			Thread.sleep(5000);
			act.clickAndHold(College_Profile_profile_image_crop).moveByOffset(60, 60).release().build().perform();
			excel.Write_data_pass(2, 203, 12);
			Thread.sleep(3000);
			College_Profile_profile_image_upload_button.click();
			excel.Write_data_pass(2, 204, 12);
			ExplicitWait(driver, College_upload_success_popub);
			College_upload_success_popub.click();
			//video profile update
			Thread.sleep(3000);
			Video_Title=excel.Read_data(2, 205, 11);
			College_Profile_Video_Title.sendKeys(Video_Title);
			excel.Write_data_pass(2, 205, 12);
			Thread.sleep(5000);
			College_Profile_Upload_Video.click();
			excel.Write_data_pass(2, 207, 12);
			s.wait(fileInputTextBox,10);
			s.type(fileInputTextBox,"D:\\Automation_directory\\Hiremee_Product_Sanity_Testing\\Sikuli\\video\\SampleVideo_1280x720_1mb.mp4");
			s.click(openButton);
			College_Profile_Video_Upload_Button.click();
			excel.Write_data_pass(2, 209, 12);
			excel.Write_data_pass(2, 212, 12);
			excel.Write_data_pass(2, 214, 12);
			Thread.sleep(7000);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(2, 180, 12);
			excel.Write_data_fail(2, 182, 12);
			excel.Write_data_fail(2, 186, 12);
			excel.Write_data_fail(2, 192, 12);
			excel.Write_data_fail(2, 194, 12);
			excel.Write_data_fail(2, 196, 12);
			excel.Write_data_fail(2, 200, 12);
			excel.Write_data_fail(2, 201, 12);
			excel.Write_data_fail(2, 203, 12);
			excel.Write_data_fail(2, 204, 12);
			excel.Write_data_fail(2, 205, 12);
			excel.Write_data_fail(2, 207, 12);
			excel.Write_data_fail(2, 209, 12);
			excel.Write_data_fail(2, 212, 12);
			excel.Write_data_fail(2, 214, 12);
			throw(e);
		}

	}
}