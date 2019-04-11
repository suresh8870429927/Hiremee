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

public class Company_Pro_Manage_Assess_Page extends Driver_Class
{
	@FindBy(how=How.LINK_TEXT,using="Manage Assessment")
	WebElement Manage_assessment;
	
	@FindBy(how=How.LINK_TEXT,using="Manage Pools")
	WebElement Manage_Pools;
	
	@FindBy(how=How.LINK_TEXT,using="Manage Questions")
	WebElement Manage_Questions;
	
	@FindBy(how=How.LINK_TEXT,using="My Questions")
	WebElement My_Questions;
	
	@FindBy(how=How.LINK_TEXT,using="MYOT")
	WebElement Myot;
	
	@FindBy(how=How.ID,using="select2-pool_question_type-container")
	WebElement Question_Type_Dropdownn;
	
	@FindBy(how=How.CLASS_NAME,using="select2-search__field")
	WebElement Company_Dropdownn_Input_classname;
	
	@FindBy(how=How.ID,using="poolname")
	WebElement Pool_Name_Input;
	
	@FindBy(how=How.ID,using="create_pool")
	WebElement Create_Pool_Button;
	
	@FindBy(how=How.XPATH,using="//button[@class='confirm']")
	WebElement Pro_Success_Button;
	
	@FindBy(how=How.XPATH,using="//label[@class='input-group-addon']")
	WebElement Browse_Excel_File_Button;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-lg orange pro-icon-button' and @type='submit']")
	WebElement Browse_Excel_File_Upload_Question_Button;
	
	@FindBy(how=How.ID,using="js-bulk_question_type")
	WebElement Bulk_Upload_Question_Type_dropdown;
	
	@FindBy(how=How.ID,using="js-bulk_pool_name")
	WebElement Bulk_Upload_Question_Pool_name_dropdown;
	
	@FindBy(how=How.ID,using="js-bulk_difficulty_level")
	WebElement Bulk_Upload_Question_Difficulty_level_dropdown;
	
	@FindBy(how=How.LINK_TEXT,using="Create New Assessment")
	WebElement Create_New_Assessment;
	
	@FindBy(how=How.ID,using="js-pro-assessment_name")
	WebElement Create_New_Assessment_Name;
	
	@FindBy(how=How.XPATH,using="//div[@class='radio radiofill radio-primary radio-inline']")
	WebElement Create_New_Assessment_Exam_Duration_Radio;
	
	@FindBy(how=How.ID,using="js-pro-test_duration_time")
	WebElement Create_New_Assessment_Exam_Duration_Date_Picker;

	@FindBy(how=How.XPATH,using="/html/body/div[20]/div/div[2]/button[4]")
	WebElement Create_New_Assessment_Exam_Duration_date_oicker_ok_button;
	
	@FindBy(how=How.ID,using="js-pro-is_negative_switch-label")
	WebElement Create_New_Assessment_Enable_Negative_Mark;
	
	@FindBy(how=How.XPATH,using="//div[@class='note-editable']")
	WebElement Create_New_Assessment_Exam_Instruction;
	
	@FindBy(how=How.ID,using="js-pro-is_feedback_switch-label")
	WebElement Create_New_Assessment_Enable_Feedback;
	
	@FindBy(how=How.ID,using="miot-save-step-1")
	WebElement Create_New_Assessment_Submit_Button;
	
	@FindBy(how=How.ID,using="js-pro-section_name")
	WebElement Create_New_Assessment_Section_name;
	
	@FindBy(how=How.ID,using="js-pro-section_type")
	WebElement Create_New_Assessment_Section_Type;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/form/div[3]/div/div/p[2]/label")
	WebElement Create_New_Assessment_Manual_Selection_question_No_Radio;
	
	@FindBy(how=How.XPATH,using="//div[@class='note-editable']")
	WebElement Create_New_Assessment_Section_Instruction;
	
	@FindBy(how=How.ID,using="js-pro-save-section-button")
	WebElement Create_New_Assessment_second_page_save_Section_Info;
	
	@FindBy(how=How.ID,using="js-pro-save-step2")
	WebElement Create_New_Assessment_Second_page_save_proceed;
	
	@FindBy(how=How.NAME,using="pool")
	WebElement Create_New_Assessment_Select_Question_Pool;
	
	@FindBy(how=How.NAME,using="topic")
	WebElement Create_New_Assessment_Select_Topic_Dropdown;
	
	@FindBy(how=How.NAME,using="qCount")
	WebElement Create_New_Assessment_Select_Basic_Question_Count_Input;
	
	@FindBy(how=How.CSS,using=".bg-green")
	WebElement Create_New_Assessment_Basic_Question_Count;
	
	@FindBy(how=How.XPATH,using="//span[@class='hmepro-icon-plus']")
	WebElement Create_New_Assessment_Question_count_add_Button;
	
	@FindBy(how=How.ID,using="js-proceed-step3")
	WebElement Create_New_Assessment_Third_Page_Save_proceed_Button;
	
	@FindBy(how=How.ID,using="js-pro-save-step4")
	WebElement Create_New_Assessment_Fourth_Page_Save_proceed_Button;
	
	@FindBy(how=How.XPATH,using="//label[@class='js-pro-score_display_value']")
	WebElement Create_New_Assessment_Score_Dusplay;
	
	@FindBy(how=How.ID,using="js-pro-save-step5")
	WebElement Create_New_Assessment_Fifth_Page_Save_proceed_Button;
	
	@FindBy(how=How.XPATH,using="//button[@class='confirm']")
	WebElement Create_New_Assessment_Assessment_Confirm_Button;
	
	//my questions
	@FindBy(how=How.XPATH,using="//i[@class='hmepro-icon-myot f-20 m-r-0']")
	WebElement My_Questions_Edit_Button;
	
	@FindBy(how=How.XPATH,using="//input[@class='btn btn-primary f-16 waves-effect' and @type='submit']")
	WebElement My_Questions_Edit_Button_Update_Question;
	
	@FindBy(how=How.ID,using="js-pro-question-view")
	WebElement My_Questions_Preview_Button;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-sm btn-danger' and @type='button']")
	WebElement My_Questions_Preview_Button_Modal_close;
	
	@FindBy(how=How.ID,using="js-pool-master")
	WebElement My_Questions_pool_dropdown;
	
	@FindBy(how=How.ID,using="js-topic-master")
	WebElement My_Questions_topic_dropdown;
	
	WebDriver driver;
	String Pool_name;
	String Question_Type;
	String difficulty_level;
	String Assessment_name;
	String Exam_Instruction;
	String Section_Name;
	String Section_Instruction;
	String topic_name="Automation_Testing4";
	Excel_Sheet excel=new Excel_Sheet();
	Screen s = new Screen();
	Pattern fileInputTextBox = new Pattern("./Sikuli/pattern_images/FileTextBox.PNG");
	Pattern openButton = new Pattern("/Sikuli/pattern_images/OpenButton.PNG");
	public Company_Pro_Manage_Assess_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void Manage_pools() throws Exception
	{
		logger=extent.createTest("Manage_pools");
		try
		{
		Thread.sleep(2000);
		Manage_assessment.click();
		excel.Write_data_pass(3, 405, 12);
		Thread.sleep(2000);
		Manage_Pools.click();
		Thread.sleep(1000);
		Question_Type_Dropdownn.click();
		Thread.sleep(1000);
		Question_Type=excel.Read_data(3, 406, 11);
		Company_Dropdownn_Input_classname.sendKeys(Question_Type);
		excel.Write_data_pass(3, 406, 12);
		Thread.sleep(1000);
		Company_Dropdownn_Input_classname.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Pool_name=excel.Read_data(3, 407, 11);
		Pool_Name_Input.sendKeys(Pool_name);
		excel.Write_data_pass(3, 407, 12);
		excel.Write_data_pass(3, 409, 12);
		Thread.sleep(1000);
		Create_Pool_Button.click();
		excel.Write_data_pass(3, 410, 12);
		excel.Write_data_pass(3, 412, 12);
		excel.Write_data_pass(3, 413, 12);
		excel.Write_data_pass(3, 415, 12);
		excel.Write_data_pass(3, 417, 12);
		Thread.sleep(3000);
		Pro_Success_Button.click();
		excel.Write_data_pass(3, 418, 12);
		excel.Write_data_pass(3, 419, 12);
		excel.Write_data_pass(3, 421, 12);
		
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 405, 12);
			excel.Write_data_fail(3, 406, 12);
			excel.Write_data_fail(3, 407, 12);
			excel.Write_data_fail(3, 409, 12);
			excel.Write_data_fail(3, 410, 12);
			excel.Write_data_fail(3, 412, 12);
			excel.Write_data_fail(3, 413, 12);
			excel.Write_data_fail(3, 415, 12);
			excel.Write_data_fail(3, 417, 12);
			excel.Write_data_fail(3, 419, 12);
			excel.Write_data_fail(3, 421, 12);
			throw(e);
		}
				
	}	
	
	@Test
	public void Manage_Questions() throws Exception
	{
		logger=extent.createTest("Manage_Questions");
		try
		{
		//Thread.sleep(2000);
		//Manage_assessment.click();
		Thread.sleep(2000);
		Manage_Questions.click();
		excel.Write_data_pass(3, 423, 12);
		Thread.sleep(1000);
		Bulk_Upload_Question_Type_dropdown.sendKeys(Question_Type);
		excel.Write_data_pass(3, 425, 12);
		Thread.sleep(1000);
		Bulk_Upload_Question_Pool_name_dropdown.sendKeys(Pool_name);
		excel.Write_data_pass(3, 426, 12);
		excel.Write_data_pass(3, 428, 12);
		excel.Write_data_pass(3, 430, 12);
		excel.Write_data_pass(3, 432, 12);
		Thread.sleep(1000);
		difficulty_level=excel.Read_data(3, 437, 11);
		Bulk_Upload_Question_Difficulty_level_dropdown.sendKeys(difficulty_level);
		excel.Write_data_pass(3, 433, 12);
		excel.Write_data_pass(3, 434, 12);
		excel.Write_data_pass(3, 436, 12);
		excel.Write_data_pass(3, 437, 12);
		Thread.sleep(1000);
		Browse_Excel_File_Button.click();
		excel.Write_data_pass(3, 439, 12);
		excel.Write_data_pass(3, 443, 12);
		excel.Write_data_pass(3, 445, 12);
		Thread.sleep(1000);
		s.wait(fileInputTextBox,10);
		s.type(fileInputTextBox,"D:\\Automation_directory\\Hiremee_Product_Sanity_Testing\\Sikuli\\Excel_Files\\Pro_QuestionTemplate.xlsx");
		s.click(openButton);
		Thread.sleep(3000);
		Browse_Excel_File_Upload_Question_Button.click();
		excel.Write_data_pass(3, 446, 12);
		
		//My-Questions
		Thread.sleep(2000);
		My_Questions.click();
		Thread.sleep(3000);
		My_Questions_Edit_Button.click();
		Thread.sleep(3000);
		My_Questions_Edit_Button_Update_Question.click();
		Thread.sleep(3000);
		My_Questions_Preview_Button.click();
		Thread.sleep(3000);
		My_Questions_Preview_Button_Modal_close.click();
		Thread.sleep(1000);
		My_Questions_pool_dropdown.sendKeys(Pool_name);
		My_Questions_pool_dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		My_Questions_topic_dropdown.sendKeys(topic_name);
		My_Questions_topic_dropdown.sendKeys(Keys.ENTER);
		
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 423, 12);
			excel.Write_data_fail(3, 425, 12);
			excel.Write_data_fail(3, 426, 12);
			excel.Write_data_fail(3, 428, 12);
			excel.Write_data_fail(3, 430, 12);
			excel.Write_data_fail(3, 432, 12);
			excel.Write_data_fail(3, 433, 12);
			excel.Write_data_fail(3, 434, 12);
			excel.Write_data_fail(3, 436, 12);
			excel.Write_data_fail(3, 437, 12);
			excel.Write_data_fail(3, 439, 12);
			excel.Write_data_fail(3, 443, 12);
			excel.Write_data_fail(3, 445, 12);
			excel.Write_data_fail(3, 446, 12);
			throw(e);
		}
	}	
	
	@Test
	public void MYOT_Exam_Duration() throws Exception
	{
		logger=extent.createTest("MYOT_Exam_Duration");
		try
		{
			//Thread.sleep(2000);
			//Manage_assessment.click();
			Thread.sleep(2000);
			Myot.click();
			excel.Write_data_pass(3, 448, 12);
			Thread.sleep(1000);
			Create_New_Assessment.click();
			excel.Write_data_pass(3, 449, 12);
			Thread.sleep(1000);
			Assessment_name=excel.Read_data(3, 450, 11);
			Create_New_Assessment_Name.sendKeys(Assessment_name);
			excel.Write_data_pass(3, 450, 12);
			ExplicitWait(driver, Create_New_Assessment_Exam_Duration_Radio);
			Create_New_Assessment_Exam_Duration_Radio.click();
			excel.Write_data_pass(3, 456, 12);
			excel.Write_data_pass(3, 457, 12);
			excel.Write_data_pass(3, 458, 12);
			Thread.sleep(1000);
			Create_New_Assessment_Exam_Duration_Date_Picker.click();
			excel.Write_data_pass(3, 460, 12);
			for(int i=0;i<=1;i++)
			{
			Thread.sleep(1000);
			Create_New_Assessment_Exam_Duration_date_oicker_ok_button.click();
			excel.Write_data_pass(3, 462, 12);
			excel.Write_data_pass(3, 463, 12);
			}
			Create_New_Assessment_Enable_Negative_Mark.click();
			excel.Write_data_pass(3, 473, 12);
			Thread.sleep(1000);
			Exam_Instruction=excel.Read_data(3, 470, 11);
			Create_New_Assessment_Exam_Instruction.sendKeys(Exam_Instruction);
			excel.Write_data_pass(3, 470, 12);
			Thread.sleep(1000);
			Create_New_Assessment_Enable_Feedback.click();
			excel.Write_data_pass(3, 474, 12);
			Thread.sleep(1000);
			Create_New_Assessment_Submit_Button.click();
			excel.Write_data_pass(3, 475, 12);
			//second page
			Thread.sleep(1000);
			Section_Name=excel.Read_data(3, 476, 11);
			Create_New_Assessment_Section_name.sendKeys(Section_Name);
			excel.Write_data_pass(3, 476, 12);
			Thread.sleep(1000);
			Create_New_Assessment_Section_Type.sendKeys(Question_Type);
			Create_New_Assessment_Section_Type.sendKeys(Keys.ENTER);
			excel.Write_data_pass(3, 479, 12);
			Thread.sleep(2000);
			Create_New_Assessment_Manual_Selection_question_No_Radio.click();
			excel.Write_data_pass(3, 480, 12);
			excel.Write_data_pass(3, 481, 12);
			Thread.sleep(1000);
			Section_Instruction=excel.Read_data(3, 482, 11);
			Create_New_Assessment_Section_Instruction.sendKeys(Section_Instruction);
			excel.Write_data_pass(3, 482, 12);
			excel.Write_data_pass(3, 485, 12);
			excel.Write_data_pass(3, 486, 12);
			excel.Write_data_pass(3, 487, 12);
			excel.Write_data_pass(3, 488, 12);
			Thread.sleep(1000);
			Create_New_Assessment_second_page_save_Section_Info.click();
			excel.Write_data_pass(3, 490, 12);
			excel.Write_data_pass(3, 492, 12);
			excel.Write_data_pass(3, 494, 12);
			Thread.sleep(1000);
			Create_New_Assessment_Second_page_save_proceed.click();
			excel.Write_data_pass(3, 496, 12);
			excel.Write_data_pass(3, 497, 12);
			//third page
			Thread.sleep(1000);
			Create_New_Assessment_Select_Question_Pool.sendKeys(Pool_name);
			excel.Write_data_pass(3, 498, 12);
			excel.Write_data_pass(3, 500, 12);
			excel.Write_data_pass(3, 501, 12);
			Create_New_Assessment_Select_Question_Pool.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Create_New_Assessment_Select_Topic_Dropdown.sendKeys(topic_name);
			excel.Write_data_pass(3, 503, 12);
			Thread.sleep(3000);
			String question_count=Create_New_Assessment_Basic_Question_Count.getText();
			Thread.sleep(3000);
			Create_New_Assessment_Select_Basic_Question_Count_Input.sendKeys(question_count);
			excel.Write_data_pass(3, 505, 12);
			Thread.sleep(3000);
			Create_New_Assessment_Question_count_add_Button.click();
			excel.Write_data_pass(3, 507, 12);
			excel.Write_data_pass(3, 509, 12);
			excel.Write_data_pass(3, 511, 12);
			excel.Write_data_pass(3, 513, 12);
			excel.Write_data_pass(3, 515, 12);
			excel.Write_data_pass(3, 517, 12);
			excel.Write_data_pass(3, 518, 12);
			excel.Write_data_pass(3, 520, 12);
			excel.Write_data_pass(3, 522, 12);
			excel.Write_data_pass(3, 523, 12);
			excel.Write_data_pass(3, 524, 12);
			excel.Write_data_pass(3, 526, 12);
			excel.Write_data_pass(3, 527, 12);
			excel.Write_data_pass(3, 529, 12);
			Thread.sleep(1000);
			Create_New_Assessment_Third_Page_Save_proceed_Button.click();
			excel.Write_data_pass(3, 531, 12);
			excel.Write_data_pass(3, 533, 12);
			excel.Write_data_pass(3, 535, 12);
			//fourth page
			Thread.sleep(3000);
			Create_New_Assessment_Fourth_Page_Save_proceed_Button.click();
			excel.Write_data_pass(3, 547, 12);
			//fifth page
			Thread.sleep(3000);
			Create_New_Assessment_Score_Dusplay.click();
			excel.Write_data_pass(3, 548, 12);
			Thread.sleep(3000);
			Create_New_Assessment_Fifth_Page_Save_proceed_Button.click();
			excel.Write_data_pass(3, 549, 12);
			excel.Write_data_pass(3, 551, 12);
			Thread.sleep(2000);
			Create_New_Assessment_Assessment_Confirm_Button.click();
			excel.Write_data_pass(3, 552, 12);
			
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 448, 12);
			excel.Write_data_fail(3, 449, 12);
			excel.Write_data_fail(3, 450, 12);
			excel.Write_data_fail(3, 456, 12);
			excel.Write_data_fail(3, 457, 12);
			excel.Write_data_fail(3, 458, 12);
			excel.Write_data_fail(3, 460, 12);
			excel.Write_data_fail(3, 462, 12);
			excel.Write_data_fail(3, 463, 12);
			excel.Write_data_fail(3, 470, 12);
			excel.Write_data_fail(3, 473, 12);
			excel.Write_data_fail(3, 474, 12);
			excel.Write_data_fail(3, 475, 12);
			excel.Write_data_fail(3, 476, 12);
			excel.Write_data_fail(3, 479, 12);
			excel.Write_data_fail(3, 480, 12);
			excel.Write_data_fail(3, 481, 12);
			excel.Write_data_fail(3, 482, 12);
			excel.Write_data_fail(3, 485, 12);
			excel.Write_data_fail(3, 486, 12);
			excel.Write_data_fail(3, 487, 12);
			excel.Write_data_fail(3, 488, 12);
			excel.Write_data_fail(3, 490, 12);
			excel.Write_data_fail(3, 492, 12);
			excel.Write_data_fail(3, 494, 12);
			excel.Write_data_fail(3, 496, 12);
			excel.Write_data_fail(3, 497, 12);
			excel.Write_data_fail(3, 498, 12);
			excel.Write_data_fail(3, 500, 12);
			excel.Write_data_fail(3, 501, 12);
			excel.Write_data_fail(3, 503, 12);
			excel.Write_data_fail(3, 505, 12);
			excel.Write_data_fail(3, 507, 12);
			excel.Write_data_fail(3, 509, 12);
			excel.Write_data_fail(3, 511, 12);
			excel.Write_data_fail(3, 513, 12);
			excel.Write_data_fail(3, 515, 12);
			excel.Write_data_fail(3, 517, 12);
			excel.Write_data_fail(3, 518, 12);
			excel.Write_data_fail(3, 520, 12);
			excel.Write_data_fail(3, 522, 12);
			excel.Write_data_fail(3, 523, 12);
			excel.Write_data_fail(3, 524, 12);
			excel.Write_data_fail(3, 526, 12);
			excel.Write_data_fail(3, 527, 12);
			excel.Write_data_fail(3, 529, 12);
			excel.Write_data_fail(3, 531, 12);
			excel.Write_data_fail(3, 533, 12);
			excel.Write_data_fail(3, 535, 12);
			excel.Write_data_fail(3, 547, 12);
			excel.Write_data_fail(3, 548, 12);
			excel.Write_data_fail(3, 549, 12);
			excel.Write_data_fail(3, 551, 12);
			excel.Write_data_fail(3, 552, 12);
			throw(e);
		}
	}
}