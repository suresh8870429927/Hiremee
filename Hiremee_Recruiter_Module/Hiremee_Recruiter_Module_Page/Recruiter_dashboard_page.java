package Hiremee_Recruiter_Module_Page;

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

import Driver_Started_Receruiter_Module.Recruiter_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Recruiter_dashboard_page extends Recruiter_Driver_Class
{
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div/div/div[3]/p/a/span")
	WebElement Recruiter_Profile_Uodate;
	
	@FindBy(how=How.ID,using="recruiter-about_summery")
	WebElement Recruiter_Profile_About_recruiter;

	@FindBy(how=How.ID,using="select2-js_state-container")
	WebElement Recruiter_Profile_dropdown_state;

	@FindBy(how=How.CLASS_NAME,using="select2-search__field")
	WebElement Recruiter_dropdown_input_classname;

	@FindBy(how=How.ID,using="select2-js-city-container")
	WebElement Recruiter_Profile_dropdown_city;

	@FindBy(how=How.ID,using="update")
	WebElement Recruiter_Profile_Update_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[7]/div/button")
	WebElement Recruiter_upload_success_popub;

	@FindBy(how=How.ID,using="file")
	WebElement Recruiter_Profile_Upload_logo;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"views\"]/div/div[2]")
	WebElement Recruiter_Profile_profile_image_crop;

	@FindBy(how=How.ID,using="js_upload")
	WebElement Recruiter_Profile_profile_image_upload_button;

	WebDriver driver;
	String about_recruiter;
	String state;
	String district;
	Excel_Sheet excel=new Excel_Sheet();
	Screen s = new Screen();
	Pattern fileInputTextBox = new Pattern("./Sikuli/pattern_images/FileTextBox.PNG");
	Pattern openButton = new Pattern("/Sikuli/pattern_images/OpenButton.PNG");
	public Recruiter_dashboard_page(WebDriver ldriver)

	{
		this.driver=ldriver;	
		PageFactory.initElements(driver, this);
	}

	@Test
	public void Recruiter_dashboard_pages() throws Exception
	{
		logger=extent.createTest("Recruiter_dashboard_pages");
		try
		{
		//Recruiter profile-update
		Thread.sleep(5000);
		Recruiter_Profile_Uodate.click();
		excel.Write_data_pass(4, 60, 12);
		excel.Write_data_pass(4, 61, 12);
		excel.Write_data_pass(4, 62, 12);
		excel.Write_data_pass(4, 263, 12);
		about_recruiter=excel.Read_data(4, 281, 11);
		Recruiter_Profile_About_recruiter.sendKeys(about_recruiter);
		excel.Write_data_pass(4, 264, 12);
		excel.Write_data_pass(4, 281, 12);
		Thread.sleep(3000);
		Recruiter_Profile_dropdown_state.click();
		ExplicitWait(driver, Recruiter_dropdown_input_classname);
		state=excel.Read_data(4, 282, 11);
		Recruiter_dropdown_input_classname.sendKeys(state);
		ExplicitWait(driver, Recruiter_dropdown_input_classname);
		Recruiter_dropdown_input_classname.sendKeys(Keys.ENTER);
		excel.Write_data_pass(4, 282, 12);
		ExplicitWait(driver, Recruiter_Profile_dropdown_city);
		Recruiter_Profile_dropdown_city.click();
		ExplicitWait(driver, Recruiter_dropdown_input_classname);
		district=excel.Read_data(4, 283, 11);
		Recruiter_dropdown_input_classname.sendKeys(district);
		ExplicitWait(driver, Recruiter_dropdown_input_classname);
		Recruiter_dropdown_input_classname.sendKeys(Keys.ENTER);
		excel.Write_data_pass(4, 283, 12);
		ExplicitWait(driver, Recruiter_Profile_Update_Button);
		Recruiter_Profile_Update_Button.click();
		excel.Write_data_pass(4, 284, 12);
		//upload picture and crop image
		//image upload and crop image
		Thread.sleep(5000);
		Recruiter_Profile_Upload_logo.click();
		excel.Write_data_pass(4, 285, 12);
		s.wait(fileInputTextBox,10);
		s.type(fileInputTextBox,"D:\\Sikuli\\images\\Chrysanthemum.jpg");
		s.click(openButton);
		Actions act=new Actions(driver);
		Thread.sleep(7000);
		act.clickAndHold(Recruiter_Profile_profile_image_crop).moveByOffset(60, 60).release().build().perform();
		excel.Write_data_pass(4, 286, 12);
		ExplicitWait(driver, Recruiter_Profile_profile_image_upload_button);
		Recruiter_Profile_profile_image_upload_button.click();
		excel.Write_data_pass(4, 301, 12);
		Thread.sleep(15000);
		Recruiter_upload_success_popub.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(4, 60, 12);
			excel.Write_data_fail(4, 61, 12);
			excel.Write_data_fail(4, 62, 12);
			excel.Write_data_fail(4, 263, 12);
			excel.Write_data_fail(4, 264, 12);
			excel.Write_data_fail(4, 281, 12);
			excel.Write_data_fail(4, 283, 12);
			excel.Write_data_fail(4, 284, 12);
			excel.Write_data_fail(4, 286, 12);
			excel.Write_data_fail(4, 301, 12);
			throw(e);
		}
		
	}
}
