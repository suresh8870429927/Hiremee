package Hiremee_Candidate_Page;

import java.awt.AWTException;
import org.openqa.selenium.JavascriptExecutor;
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

import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Candidate_My_Profile_Page extends Candidate_Driver_Class{

	@FindBy(how=How.ID,using="js-lname")
	WebElement Candidate_Last_Name;

	@FindBy(how=How.ID,using="js-designation")
	WebElement Candidate_designation;

	@FindBy(how=How.ID,using="js-specilization")
	WebElement Candidate_specilization;

	@FindBy(how=How.ID,using="js-present_adder")
	WebElement Candidate_Present_Address;

	@FindBy(how=How.ID,using="js-p_pincode")
	WebElement Candidate_Pincode;

	@FindBy(how=How.ID,using="js-P-add_no")
	WebElement Candidate_address_clone_no;

	@FindBy(how=How.ID,using="js-prem_address")
	WebElement Candidate_permanent_address;

	@FindBy(how=How.ID,using="js-prem_pincode")
	WebElement Candidate_permanent_address_pincode;

	@FindBy(how=How.ID,using="js-about_me")
	WebElement Candidate_About_me;

	@FindBy(how=How.ID,using="select2-js-lang0known-container")
	WebElement Candidate_Language;

	@FindBy(how=How.CLASS_NAME,using="select2-search__field")
	WebElement Candidate_dropdown_input_classname;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div[2]/div/div[1]/div/div/form/div[6]/div/div[2]/div[4]/button")
	WebElement Candidate_Update_Personal_details;

	@FindBy(how=How.XPATH,using="/html/body/div[16]/div[7]/div/button")
	WebElement Candidate_Popub_success;

	@FindBy(how=How.ID,using="select2-js-sslc_board-container")
	WebElement Candidate_SSLC_Board;

	@FindBy(how=How.ID,using="js-sslc_schoolname")
	WebElement Candidate_SSLC_School_name;

	@FindBy(how=How.ID,using="js-sslc_register_number")
	WebElement Candidate_SSLC_Register_Number;

	@FindBy(how=How.ID,using="js-sslc_percentage")
	WebElement Candidate_SSLC_Percentage;

	@FindBy(how=How.ID,using="select2-js-sslc_yearofpassing-container")
	WebElement Candidate_SSLC_Year_of_Passing;

	@FindBy(how=How.ID,using="js-sslc_pincode")
	WebElement Candidate_SSLC_Pincode;

	@FindBy(how=How.ID,using="select2-js-high_board-container")
	WebElement Candidate_Higher_Boeard;

	@FindBy(how=How.ID,using="js-high_schoolname")
	WebElement Candidate_Higher_School_Name;

	@FindBy(how=How.ID,using="js-high_register_no")
	WebElement Candidate_Higher_Register_Number;

	@FindBy(how=How.ID,using="js-high_percentage")
	WebElement Candidate_Higher_School_percentage;

	@FindBy(how=How.ID,using="select2-js-high_yearofpassing-container")
	WebElement Candidate_Higher_School_Year;

	@FindBy(how=How.ID,using="js-high_pincode")
	WebElement Candidate_Higher_School_pincode;

	@FindBy(how=How.ID,using="js-percentage_edu0")
	WebElement Candidate_Graduation_Percentage;

	@FindBy(how=How.NAME,using="pincode_edu0")
	WebElement Candidate_Graduation_Pincode;

	@FindBy(how=How.ID,using="js-register_no0")
	WebElement Candidate_Graduation_Register_Number;

	@FindBy(how=How.ID,using="up_edu")
	WebElement Candidate_Educational_update;

	@FindBy(how=How.LINK_TEXT,using="Certification Update")
	WebElement Candidate_Certification_Update;

	@FindBy(how=How.ID,using="js-certification_name0")
	WebElement Candidate_Certification_Name;

	@FindBy(how=How.ID,using="js-certification_year0")
	WebElement Candidate_Certification_Year;

	@FindBy(how=How.ID,using="update_cert")
	WebElement Candidate_Certification_Update_Button;

	@FindBy(how=How.ID,using="file")
	WebElement Candidate_Choose_Profile_picture;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div/div[2]")
	WebElement Candidate_Choose_Profile_picture_crop;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div[2]/form/div/div[2]/input")
	WebElement Candidate_Choose_Profile_picture_Upload_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/form/div/div[3]/div/span[1]/span[1]/span/ul/li/input")
	WebElement Candidate_prefered_job_location;

	@FindBy(how=How.ID,using="js-dob")
	WebElement Candidate_Date_of_Birth_Datepicker;

	@FindBy(how=How.XPATH,using="/html/body/div[14]/div/div[2]/button[4]")
	WebElement Candidate_Date_of_Birth_Datepicker_OK;

	@FindBy(how=How.NAME,using="gender")
	WebElement Candidate_Gender;

	@FindBy(how=How.ID,using="js-aadhar_number")
	WebElement Candidate_Aadhaar_Number;

	@FindBy(how=How.ID,using="js-passport_number")
	WebElement Candidate_Passport_Number;

	@FindBy(how=How.ID,using="js-pan_number")
	WebElement Candidate_Pan_Number;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/form/div/button")
	WebElement Candidate_Personal_Update_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div/div[4]/div[2]/div/div/div[2]/div/div[1]/div/div/form/div[1]/div[1]/a/i")
	WebElement Candidate_Myprofile_cancel_Button;

	WebDriver driver;
	String Last_name;
	String designation;
	String specilization;
	String present_address;
	String pincode;
	String about_me;
	String language;
	String Board;
	String School_name;
	String percentage;
	String yearof_completion;
	String Registration_number;	
	String Skills;
	String certification;
	String prefered_location;
	String Aadhaar_Number;
	String Passport_Number;
	String pan_number;
	Excel_Sheet excel=new Excel_Sheet();
	Screen s = new Screen();
	Pattern fileInputTextBox = new Pattern("./Sikuli/pattern_images/FileTextBox.PNG");
	Pattern openButton = new Pattern("./Sikuli/pattern_images/OpenButton.PNG");
	
	public Candidate_My_Profile_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	
	@Test
	public void My_Profile_Update() throws InterruptedException, AWTException, Exception
	{
		logger=extent.createTest("My_Profile_Update");
		try 
		{
		ExplicitWait(driver, Candidate_Last_Name);
		excel.Write_data_pass(1, 117, 12);
		Last_name=excel.Read_data(1, 120, 11);
		Candidate_Last_Name.sendKeys(Last_name);
		excel.Write_data_pass(1, 120, 12);
		designation=excel.Read_data(1, 122, 11);
		Candidate_designation.sendKeys(designation);
		excel.Write_data_pass(1, 122, 12);
		specilization=excel.Read_data(1, 124, 11);
		Candidate_specilization.sendKeys(specilization);
		excel.Write_data_pass(1, 124, 12);
		present_address=excel.Read_data(1, 126, 11);
		Candidate_Present_Address.sendKeys(present_address);
		excel.Write_data_pass(1, 126, 12);
		pincode=excel.Read_data(1, 128, 11);
		Candidate_Pincode.sendKeys(pincode);
		Thread.sleep(3000);
		Candidate_Pincode.sendKeys(Keys.TAB);
		excel.Write_data_pass(1, 128, 12);
		excel.Write_data_pass(1, 130, 12);
		excel.Write_data_pass(1, 131, 12);
		Thread.sleep(3000);
		Candidate_address_clone_no.click();
		Thread.sleep(3000);
		Candidate_permanent_address.sendKeys(present_address);
		excel.Write_data_pass(1, 132, 12);
		Candidate_permanent_address_pincode.sendKeys(pincode);
		Thread.sleep(3000);
		Candidate_permanent_address_pincode.sendKeys(Keys.TAB);
		excel.Write_data_pass(1, 134, 12);
		excel.Write_data_pass(1, 136, 12);
		excel.Write_data_pass(1, 137, 12);
		Thread.sleep(3000);
		about_me=excel.Read_data(1, 138, 11);
		Candidate_About_me.sendKeys(about_me);
		excel.Write_data_pass(1, 138, 12);
		Thread.sleep(2000);
		Candidate_Language.click();
		Thread.sleep(2000);
		language=excel.Read_data(1, 148, 11);
		Candidate_dropdown_input_classname.sendKeys(language);
		Thread.sleep(2000);
		Candidate_dropdown_input_classname.sendKeys(Keys.ENTER);
		excel.Write_data_pass(1, 148, 12);
		excel.Write_data_pass(1, 149, 12);
		excel.Write_data_pass(1, 150, 12);
		Thread.sleep(2000);
		Candidate_Update_Personal_details.click();
		excel.Write_data_pass(1, 152, 12);
		Thread.sleep(2000);
		Candidate_Popub_success.click();
		
		//Educational details--Schools	
		Thread.sleep(2000);
		Candidate_SSLC_Board.click();
		excel.Write_data_pass(1, 153, 12);
		Thread.sleep(2000);
		Board=excel.Read_data(1, 154, 11);
		Candidate_dropdown_input_classname.sendKeys(Board);  
		Thread.sleep(2000);
		Candidate_dropdown_input_classname.sendKeys(Keys.ENTER);  
		excel.Write_data_pass(1, 154, 12);
		School_name=excel.Read_data(1, 155, 11);
		Candidate_SSLC_School_name.sendKeys(School_name); 
		excel.Write_data_pass(1, 155, 12);
		Registration_number=excel.Read_data(1, 165, 11);
		Candidate_SSLC_Register_Number.sendKeys(Registration_number);
		excel.Write_data_pass(1, 164, 12);
		percentage=excel.Read_data(1, 157, 11);
		Candidate_SSLC_Percentage.sendKeys(percentage);
		excel.Write_data_pass(1, 157, 12);
		Thread.sleep(2000);
		Candidate_SSLC_Year_of_Passing.click();
		Thread.sleep(2000);
		yearof_completion=excel.Read_data(1, 158, 11);
		Candidate_dropdown_input_classname.sendKeys(yearof_completion);
		Thread.sleep(2000);
		Candidate_dropdown_input_classname.sendKeys(Keys.ENTER);
		excel.Write_data_pass(1, 158, 12);
		pincode=excel.Read_data(1, 128, 11);
		Candidate_SSLC_Pincode.sendKeys(pincode);
		excel.Write_data_pass(1, 159, 12);
		Thread.sleep(2000);
		Candidate_Higher_Boeard.click();
		excel.Write_data_pass(1, 161, 12);
		Candidate_dropdown_input_classname.sendKeys(Board);  
		Thread.sleep(2000);
		Candidate_dropdown_input_classname.sendKeys(Keys.ENTER);
		excel.Write_data_pass(1, 162, 12);
		Candidate_Higher_School_Name.sendKeys(School_name);
		excel.Write_data_pass(1, 163, 12);
		Candidate_Higher_Register_Number.sendKeys(Registration_number);
		Candidate_Higher_School_percentage.sendKeys(percentage);
		excel.Write_data_pass(1, 163, 12);
		Thread.sleep(2000);
		Candidate_Higher_School_Year.click();
		Thread.sleep(2000);
		Candidate_dropdown_input_classname.sendKeys(yearof_completion);
		Thread.sleep(2000);
		Candidate_dropdown_input_classname.sendKeys(Keys.ENTER);
		excel.Write_data_pass(1, 176, 12);
		Candidate_Higher_School_pincode.sendKeys(pincode);
		excel.Write_data_pass(1, 177, 12);
		
		//Educational details-->Graduation
		excel.Write_data_pass(1, 179, 12);
		Candidate_Graduation_Register_Number.sendKeys(Registration_number);
		excel.Write_data_pass(1, 181, 12);
		Candidate_Graduation_Percentage.sendKeys(percentage);
		excel.Write_data_pass(1, 185, 12);
		Candidate_Graduation_Pincode.sendKeys(pincode);
		excel.Write_data_pass(1, 187, 12);
		excel.Write_data_pass(1, 189, 12);
		excel.Write_data_pass(1, 190, 12);
		Thread.sleep(2000);
		Skills=excel.Read_data(1, 202, 11);
		Candidate_dropdown_input_classname.sendKeys(Skills);
		Thread.sleep(2000);
		Candidate_dropdown_input_classname.sendKeys(Keys.ENTER);
		excel.Write_data_pass(1, 202, 12);
		excel.Write_data_pass(1, 190, 12);
		excel.Write_data_pass(1, 191, 12);
		excel.Write_data_pass(1, 192, 12);
		excel.Write_data_pass(1, 193, 12);
		excel.Write_data_pass(1, 194, 12);
		excel.Write_data_pass(1, 195, 12);
		Thread.sleep(3000);
		Candidate_Educational_update.click();
		excel.Write_data_pass(1, 196, 12);
		excel.Write_data_pass(1, 197, 12);
		excel.Write_data_pass(1, 198, 12);
		excel.Write_data_pass(1, 199, 12);
		excel.Write_data_pass(1, 201, 12);
		excel.Write_data_pass(1, 203, 12);
		excel.Write_data_pass(1, 204, 12);
		Thread.sleep(2000);
		Candidate_Popub_success.click();
		Thread.sleep(2000);
		
		//certification1
		Candidate_Certification_Update.click();
		excel.Write_data_pass(1, 205, 12);
		Thread.sleep(2000);
		certification=excel.Read_data(1, 206, 11);
		Candidate_Certification_Name.sendKeys(certification);
		excel.Write_data_pass(1, 206, 12);
		new Select(Candidate_Certification_Year).selectByVisibleText("2016");
		excel.Write_data_pass(1, 207, 12);
		excel.Write_data_pass(1, 208, 12);
		Candidate_Certification_Update_Button.click();
		excel.Write_data_pass(1, 209, 12);
		Thread.sleep(2000);
		Candidate_Popub_success.click();
		Thread.sleep(6000);
		Candidate_Choose_Profile_picture.click();
		excel.Write_data_pass(1, 229, 12);
		s.wait(fileInputTextBox,10);	
		s.type(fileInputTextBox,"D:\\Sikuli\\images\\Chrysanthemum.jpg");
		s.click(openButton);
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.clickAndHold(Candidate_Choose_Profile_picture_crop).moveByOffset(60, 60).release().build().perform();
		excel.Write_data_pass(1, 231, 12);
		Candidate_Choose_Profile_picture_Upload_Button.click();
		excel.Write_data_pass(1, 232, 12);
		Thread.sleep(3000);
		Candidate_Popub_success.click();
		//personal Information
		Thread.sleep(3000);
		prefered_location=excel.Read_data(1, 215, 11);
		Candidate_prefered_job_location.sendKeys(prefered_location);
		Thread.sleep(2000);
		Candidate_prefered_job_location.sendKeys(Keys.ENTER);
		excel.Write_data_pass(1, 215, 12);
		Candidate_Date_of_Birth_Datepicker.click();
		excel.Write_data_pass(1, 216, 12);
		Thread.sleep(3000);
		Candidate_Date_of_Birth_Datepicker_OK.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		//radio button----resolved by using action class
		Thread.sleep(2000);
		Actions act1=new Actions(driver);
		act1.moveToElement(Candidate_Gender).click().build().perform();
		excel.Write_data_pass(1, 217, 12);
		Aadhaar_Number=excel.Read_data(1, 219, 11);
		Candidate_Aadhaar_Number.sendKeys(Aadhaar_Number);
		excel.Write_data_pass(1, 219, 12);
		Passport_Number=excel.Read_data(1, 221, 11);
		Candidate_Passport_Number.sendKeys(Passport_Number);
		excel.Write_data_pass(1, 221, 12);
		pan_number=excel.Read_data(1, 223, 11);
		Candidate_Pan_Number.sendKeys(pan_number);
		excel.Write_data_pass(1, 223, 12);
		Thread.sleep(3000);
		Candidate_Personal_Update_Button.click();
		Thread.sleep(3000);
		Candidate_Popub_success.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-800)");
		Candidate_Myprofile_cancel_Button.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 117, 12);
			excel.Write_data_fail(1, 120, 12);
			excel.Write_data_fail(1, 122, 12);
			excel.Write_data_fail(1, 124, 12);
			excel.Write_data_fail(1, 126, 12);
			excel.Write_data_fail(1, 128, 12);
			excel.Write_data_fail(1, 130, 12);
			excel.Write_data_fail(1, 131, 12);
			excel.Write_data_fail(1, 132, 12);
			excel.Write_data_fail(1, 134, 12);
			excel.Write_data_fail(1, 136, 12);
			excel.Write_data_fail(1, 137, 12);
			excel.Write_data_fail(1, 138, 12);
			excel.Write_data_fail(1, 148, 12);
			excel.Write_data_fail(1, 149, 12);
			excel.Write_data_fail(1, 150, 12);
			excel.Write_data_fail(1, 152, 12);
			excel.Write_data_fail(1, 153, 12);
			excel.Write_data_fail(1, 154, 12);
			excel.Write_data_fail(1, 155, 12);
			excel.Write_data_fail(1, 157, 12);
			excel.Write_data_fail(1, 158, 12);
			excel.Write_data_fail(1, 159, 12);
			excel.Write_data_fail(1, 161, 12);
			excel.Write_data_fail(1, 162, 12);
			excel.Write_data_fail(1, 164, 12);
			excel.Write_data_fail(1, 176, 12);
			excel.Write_data_fail(1, 177, 12);
			excel.Write_data_fail(1, 179, 12);
			excel.Write_data_fail(1, 181, 12);
			excel.Write_data_fail(1, 185, 12);
			excel.Write_data_fail(1, 187, 12);
			excel.Write_data_fail(1, 189, 12);
			excel.Write_data_fail(1, 190, 12);
			excel.Write_data_fail(1, 191, 12);
			excel.Write_data_fail(1, 192, 12);
			excel.Write_data_fail(1, 193, 12);
			excel.Write_data_fail(1, 194, 12);
			excel.Write_data_fail(1, 195, 12);
			excel.Write_data_fail(1, 196, 12);
			excel.Write_data_fail(1, 197, 12);
			excel.Write_data_fail(1, 198, 12);
			excel.Write_data_fail(1, 199, 12);
			excel.Write_data_fail(1, 201, 12);
			excel.Write_data_fail(1, 202, 12);
			excel.Write_data_fail(1, 203, 12);
			excel.Write_data_fail(1, 204, 12);
			excel.Write_data_fail(1, 206, 12);
			excel.Write_data_fail(1, 207, 12);
			excel.Write_data_fail(1, 208, 12);
			excel.Write_data_fail(1, 209, 12);
			excel.Write_data_fail(1, 215, 12);
			excel.Write_data_fail(1, 216, 12);
			excel.Write_data_fail(1, 217, 12);
			excel.Write_data_fail(1, 219, 12);
			excel.Write_data_fail(1, 221, 12);
			excel.Write_data_fail(1, 223, 12);
			excel.Write_data_fail(1, 229, 12);
			excel.Write_data_fail(1, 231, 12);
			excel.Write_data_fail(1, 232, 12);
			throw(e);
		}
	}
}
