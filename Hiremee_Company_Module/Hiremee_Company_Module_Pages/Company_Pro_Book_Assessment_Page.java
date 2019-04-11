package Hiremee_Company_Module_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import Driver_Started_Company_Module.Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Company_Pro_Book_Assessment_Page extends Driver_Class
{

	@FindBy(how=How.LINK_TEXT,using="Book Assessment")
	WebElement Book_Assessment;

	@FindBy(how=How.LINK_TEXT,using="Bulk Assessment Booking")
	WebElement Book_Assessment_Bulk_upload;
	
	@FindBy(how=How.ID,using="assessment_id_field")
	WebElement Book_Assessment_Bulk_upload_Assessment_name;
	
	@FindBy(how=How.ID,using="start_date_field")
	WebElement Book_Assessment_Bulk_upload_Start_Date_Picker;
	
	@FindBy(how=How.XPATH,using="/html/body/div[14]/div/div[2]/button[4]")
	WebElement Book_Assessment_Bulk_upload_Start_Date_Picker_ok_button;
	
	@FindBy(how=How.ID,using="end_date_field")
	WebElement Book_Assessment_Bulk_upload_End_Date_Picker;
	
	@FindBy(how=How.XPATH,using="/html/body/div[15]/div/div[2]/button[4]")
	WebElement Book_Assessment_Bulk_upload_End_Date_Picker_ok_button;
	
	@FindBy(how=How.ID,using="window_proctoring_field_label")
	WebElement Book_Assessment_Bulk_upload_Window_Proctoring_Switch_Button;
	
	@FindBy(how=How.ID,using="no_of_retries_field")
	WebElement Book_Assessment_Bulk_upload_Window_Proctoring_No_of_tries;
	
	@FindBy(how=How.ID,using="inputGroupFile02")
	WebElement Book_Assessment_Bulk_upload_Brow_Excel_File_Button;
	
	@FindBy(how=How.ID,using="upload_candidate_form_button")
	WebElement Book_Assessment_Bulk_upload_Excel_Button;
	
	

	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet(); 
	String Asessment_name;
	public Company_Pro_Book_Assessment_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test 
	public void Book_Bulk_Assessment() throws Exception
	{
		try
		{
			Screen s = new Screen();
			Pattern fileInputTextBox = new Pattern("./Sikuli/pattern_images/FileTextBox.PNG");
			Pattern openButton = new Pattern("/Sikuli/pattern_images/OpenButton.PNG");
			Thread.sleep(2000);
			Book_Assessment.click();
			excel.Write_data_pass(3, 553, 12);
			excel.Write_data_pass(3, 555, 12);
			excel.Write_data_pass(3, 557, 12);
			excel.Write_data_pass(3, 557, 12);
			excel.Write_data_pass(3, 558, 12);
			excel.Write_data_pass(3, 559, 12);
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload.click();
			excel.Write_data_pass(3, 560, 12);
			excel.Write_data_pass(3, 561, 12);
			Thread.sleep(1000);
			Asessment_name=excel.Read_data(3, 562, 11);
			Book_Assessment_Bulk_upload_Assessment_name.sendKeys(Asessment_name);
			excel.Write_data_pass(3, 562, 12);
			excel.Write_data_pass(3, 565, 12);
			Book_Assessment_Bulk_upload_Assessment_name.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 568, 12);
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_Start_Date_Picker.click();
			excel.Write_data_pass(3, 571, 12);
			for(int i=0;i<=2;i++)
			{
			Thread.sleep(3000);
			excel.Write_data_pass(3, 573, 12);
			Book_Assessment_Bulk_upload_Start_Date_Picker_ok_button.click();
			excel.Write_data_pass(3, 575, 12);
			}
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_End_Date_Picker.click();
			excel.Write_data_pass(3, 577, 12);
			for(int i=0;i<=2;i++)
			{
				Thread.sleep(3000);
				Book_Assessment_Bulk_upload_End_Date_Picker_ok_button.click();
				excel.Write_data_pass(3, 578, 12);
				excel.Write_data_pass(3, 579, 12);
				
			}
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_Window_Proctoring_Switch_Button.click();
			excel.Write_data_pass(3, 580, 12);
			excel.Write_data_pass(3, 581, 12);
			excel.Write_data_pass(3, 582, 12);
			excel.Write_data_pass(3, 583, 12);
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_Window_Proctoring_No_of_tries.sendKeys("10 Retry");
			excel.Write_data_pass(3, 584, 12);
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_Brow_Excel_File_Button.click();
			excel.Write_data_pass(3, 585, 12);
			s.wait(fileInputTextBox,10);
			s.type(fileInputTextBox,"D:\\Automation_directory\\Hiremee_Product_Sanity_Testing\\Sikuli\\Excel_Files\\Bulk_Assessment_Testpin.xls");
			s.click(openButton);
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_Excel_Button.click();
			excel.Write_data_pass(3, 587, 12);
			
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 553, 12);
			excel.Write_data_fail(3, 555, 12);
			excel.Write_data_fail(3, 557, 12);
			excel.Write_data_fail(3, 558, 12);
			excel.Write_data_fail(3, 559, 12);
			excel.Write_data_fail(3, 560, 12);
			excel.Write_data_fail(3, 561, 12);
			excel.Write_data_fail(3, 562, 12);
			excel.Write_data_fail(3, 565, 12);
			excel.Write_data_fail(3, 568, 12);
			excel.Write_data_fail(3, 571, 12);
			excel.Write_data_fail(3, 573, 12);
			excel.Write_data_fail(3, 575, 12);
			excel.Write_data_fail(3, 577, 12);
			excel.Write_data_fail(3, 578, 12);
			excel.Write_data_fail(3, 579, 12);
			excel.Write_data_fail(3, 580, 12);
			excel.Write_data_fail(3, 581, 12);
			excel.Write_data_fail(3, 582, 12);
			excel.Write_data_fail(3, 583, 12);
			excel.Write_data_fail(3, 584, 12);
			excel.Write_data_fail(3, 585, 12);
			excel.Write_data_fail(3, 587, 12);
			throw(e);
		}
	}


}
