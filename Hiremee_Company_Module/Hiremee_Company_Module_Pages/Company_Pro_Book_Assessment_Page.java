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
	String Asessment_name="Automation_Testing_Team";
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
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload.click();
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_Assessment_name.sendKeys(Asessment_name);
			Book_Assessment_Bulk_upload_Assessment_name.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_Start_Date_Picker.click();
			for(int i=0;i<=2;i++)
			{
			Thread.sleep(3000);
			Book_Assessment_Bulk_upload_Start_Date_Picker_ok_button.click();
			}
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_End_Date_Picker.click();
			for(int i=0;i<=2;i++)
			{
				Thread.sleep(3000);
				Book_Assessment_Bulk_upload_End_Date_Picker_ok_button.click();
			}
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_Window_Proctoring_Switch_Button.click();
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_Window_Proctoring_No_of_tries.sendKeys("10 Retry");
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_Brow_Excel_File_Button.click();
			s.wait(fileInputTextBox,10);
			s.type(fileInputTextBox,"D:\\Automation_directory\\Hiremee_Product_Sanity_Testing\\Sikuli\\Excel_Files\\Bulk_Assessment_Testpin.xls");
			s.click(openButton);
			Thread.sleep(1000);
			Book_Assessment_Bulk_upload_Excel_Button.click();
			
		}
		catch(Exception e)
		{
			throw(e);
		}
	}


}
