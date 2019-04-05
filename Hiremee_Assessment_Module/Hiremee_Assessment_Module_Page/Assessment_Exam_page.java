package Hiremee_Assessment_Module_Page;

import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;


public class Assessment_Exam_page extends Candidate_Driver_Class{

	@FindBy(how=How.ID,using="UserName")
	WebElement Assessment_Exam_Username;

	@FindBy(how=How.ID,using="passwordfield")
	WebElement Assessment_Exam_Password;

	@FindBy(how=How.ID,using="Captcha")
	WebElement Assessment_Exam_captcha;

	@FindBy(how=How.ID,using="btnLogin")
	WebElement Assessment_Exam_Login_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div/div/div[1]/div/label")
	WebElement Assessment_Exam_Istruction_Aggrement_condition;

	@FindBy(how=How.ID,using="btnProceed")
	WebElement Assessment_Exam_Istruction_Submit_Button;

	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div/div/div/div[4]/button")
	WebElement Assessment_Exam_Invigilater_Alert_Popub;

	@FindBy(how=How.ID,using="invigilatorpasswordfield")
	WebElement Assessment_Exam_Invigilater_Password;

	@FindBy(how=How.ID,using="btnInvigilatorLogin")
	WebElement Assessment_Exam_Invigilater_Submit_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/h3[1]/div/table/tbody/tr/td[1]/div")
	WebElement Assessment_Exam_Group_Verbal_Verification_Color;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/h3[2]/div/table/tbody/tr/td[1]/div")
	WebElement Assessment_Exam_Group_Quantitative_Verification_Color;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/h3[3]/div/table/tbody/tr/td[1]/div")
	WebElement Assessment_Exam_Group_Logical_Verification_Color;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/h3[4]/div/table/tbody/tr/td[1]/div")
	WebElement Assessment_Exam_Group_Behaviour_Verification_Color;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/h3[5]/div/table/tbody/tr/td[1]/div")
	WebElement Assessment_Exam_Group_Technical_Core_Domain_Verification_Color;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/h3[6]/div/table/tbody/tr/td[1]/div")
	WebElement Assessment_Exam_Group_Technical_Fundamental_Verification_Color;

	@FindBy(how=How.XPATH,using="//*[@id=\"btnProceed\"]")
	WebElement Assessment_Exam_Feedback_Verification_Color;

	@FindBy(how=How.XPATH,using="//h3[@id='ui-id-1']/span")
	WebElement Assessment_Exam_Group_Verbal_selection;

	@FindBy(how=How.XPATH,using="//h3[@id='ui-id-3']/span")
	WebElement Assessment_Exam_Group_Quantitative_selection;

	@FindBy(how=How.XPATH,using="//h3[@id='ui-id-5']/div/table/tbody/tr/td[2]")
	WebElement Assessment_Exam_Group_Logical_selection;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/h3[4]/span")
	WebElement Assessment_Exam_Group_Behaviour_selection;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/h3[5]/span")
	WebElement Assessment_Exam_Group_Technical_Core_Domain_selection;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/h3[6]/div")
	WebElement Assessment_Exam_Group_Technical_Fundamental_selection;

	@FindBy(how=How.ID,using="btnStartExam")
	WebElement Assessment_Exam_Group_Verbal_Start_Button;

	@FindBy(how=How.XPATH,using="(//input[@id='btnStartExam'])[2]")
	WebElement Assessment_Exam_Group_Quantitative_Start_Button;

	@FindBy(how=How.XPATH,using="(//input[@id='btnStartExam'])[3]")
	WebElement Assessment_Exam_Group_Logical_Start_Button;

	@FindBy(how=How.XPATH,using="(//input[@id='btnStartExam'])[4]")
	WebElement Assessment_Exam_Group_Behaviour_Start_Button;

	@FindBy(how=How.XPATH,using="(//input[@id='btnStartExam'])[5]")
	WebElement Assessment_Exam_Group_Technical_Core_Domain_Start_Button;

	@FindBy(how=How.XPATH,using="(//input[@id='btnStartExam'])[6]")
	WebElement Assessment_Exam_Group_Technical_Fundamental_Start_Button;

	@FindBy(how=How.ID,using="trrdoMCA")
	WebElement Assessment_Exam_Group_OptionA;

	@FindBy(how=How.ID,using="trrdoMCB")
	WebElement Assessment_Exam_Group_OptionB;

	@FindBy(how=How.ID,using="trrdoMCC")
	WebElement Assessment_Exam_Group_OptionC;

	@FindBy(how=How.ID,using="trrdoMCD")
	WebElement Assessment_Exam_Group_OptionD;

	//behavioural
	@FindBy(how=How.ID,using="spnMCA")
	WebElement Assessment_Exam_Group_Behavioural_Question_OptionA;

	@FindBy(how=How.ID,using="spnMC1_FC")
	WebElement Assessment_Exam_Group_Behavioural_Answer_OptionA;

	@FindBy(how=How.ID,using="lnkNext")
	WebElement Assessment_Exam_Group_Option_Next_Button;

	@FindBy(how=How.ID,using="btnProceed")
	WebElement Assessment_Exam_Group_overall_Finish_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[2]/div/div/div/div/div[4]/button[1]")
	WebElement Assessment_Exam_Group_overall_Finish_Button_ok_popub;

	//@FindBy(how=How.XPATH,using="//button[@type='button'])[2]")
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div/div/div/div[4]/button[1]")
	WebElement Assessment_Exam_Group_Finish_Button;
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div[2]/div/div/div/div/div[4]/button[1]")
	WebElement Assessment_Exam_Behaviour_Group_Finish_Button;

	@FindBy(how=How.ID,using="rblIdQ12")
	WebElement Assessment_Exam_Feedback_Question1;

	@FindBy(how=How.ID,using="rblIdQ22")
	WebElement Assessment_Exam_Feedback_Question2;

	@FindBy(how=How.ID,using="rblIdQ32")
	WebElement Assessment_Exam_Feedback_Question3;

	@FindBy(how=How.ID,using="btnProceed")
	WebElement Assessment_Exam_Feedback_overall_Finish_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[2]/div/div/div/div/div[4]/button")
	WebElement Assessment_Exam_Feedback_overall_Finish_Ok_Button;

	@FindBy(how=How.ID,using="btnProceed")
	WebElement Assessment_Exam_Logout;

	WebDriver driver;
	private String url_Assessment_exam;
	//String Hiremee_id="HC271970";
	//String password;
	String Invigilator;
	static String Expected="background-color: gray; width: 12px; height: 12px;";
	static String Expected1="rgba(122, 169, 60,1)";	
	Excel_Sheet excel=new Excel_Sheet();
	public Assessment_Exam_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void Assessment_Exam_login()throws Exception
	{		
		logger=extent.createTest("Assessment_Exam_login");
		try
		{
			url_Assessment_exam=excel.Read_data(7, 19, 11);
			driver.get(url_Assessment_exam);
			excel.Write_data_pass(7, 19, 12);
			Assessment_Exam_Username.sendKeys(Hiremee_id);
			excel.Write_data_pass(7, 20, 12);
			//password=excel.Read_data(7, 21, 11);
			Assessment_Exam_Password.sendKeys(password);
			excel.Write_data_pass(7, 21, 12);
			String Assessment_exam_captcha_value=JOptionPane.showInputDialog("Enter the captcha value");
			Assessment_Exam_captcha.sendKeys(Assessment_exam_captcha_value);
			excel.Write_data_pass(7, 22, 12);
			Assessment_Exam_Login_Button.click();
			excel.Write_data_pass(7, 23, 12);
			Assessment_Exam_Instruction();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(7, 19, 12);
			excel.Write_data_fail(7, 20, 12);
			excel.Write_data_fail(7, 21, 12);
			excel.Write_data_fail(7, 22, 12);
			excel.Write_data_fail(7, 23, 12);
			Assessment_Exam_Invigilater();	
			throw(e);
		}
	}
	@Test
	public void Assessment_Exam_Instruction() throws Exception
	{	
		logger=extent.createTest("Assessment_Exam_Instruction");
		try
		{
		Thread.sleep(3000);
		Assessment_Exam_Istruction_Aggrement_condition.click();
		excel.Write_data_pass(7, 28, 12);
		Assessment_Exam_Istruction_Submit_Button.click();
		excel.Write_data_pass(7, 29, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(7, 28, 12);
			excel.Write_data_fail(7, 29, 12);
			throw(e);
		}
	}
	@Test
	public void Assessment_Exam_Invigilater() throws Exception
	{	
		
		logger=extent.createTest("Assessment_Exam_Invigilater");
		try
		{
		Thread.sleep(3000);
		Assessment_Exam_Invigilater_Alert_Popub.click();
		Assessment_Exam_Username.sendKeys(Hiremee_id);
		excel.Write_data_pass(7, 24, 12);
		Assessment_Exam_Password.sendKeys(password);
		excel.Write_data_pass(7, 25, 12);
		Invigilator=excel.Read_data(7, 26, 11);
		Assessment_Exam_Invigilater_Password.sendKeys(Invigilator);
		excel.Write_data_pass(7, 26, 12);
		Assessment_Exam_Invigilater_Submit_Button.click();
		excel.Write_data_pass(7, 27, 12);
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(7, 24, 12);
			excel.Write_data_fail(7, 25, 12);
			excel.Write_data_fail(7, 26, 12);
			excel.Write_data_fail(7, 27, 12);
			throw(e);
		}
	}
	@Test
	public void Assessment_Exam_verbal() throws Exception
	{
		logger=extent.createTest("Assessment_Exam_verbal");
		try
		{
			Thread.sleep(3000);
			String color=Assessment_Exam_Group_Verbal_Verification_Color.getAttribute("style");
			System.out.println(color);
			Assert.assertEquals(color, Expected,"Verify Exam Completed or not ,if completed then Skip");
			Assessment_Exam_Group_Verbal_selection.click();
			excel.Write_data_pass(7, 30, 12);
			Thread.sleep(2000);
			Assessment_Exam_Group_Verbal_Start_Button.click();
			excel.Write_data_pass(7, 31, 12);
			Thread.sleep(1000);
			for(int i=1;i<=10;i++)
			{
				Thread.sleep(2000);
				if (Assessment_Exam_Group_OptionA.isDisplayed())
				{
					Assessment_Exam_Group_OptionA.click();  
					Assessment_Exam_Group_Option_Next_Button.click();
				}
				else if (Assessment_Exam_Group_OptionB.isDisplayed()) {
					Assessment_Exam_Group_OptionB.click();
					Assessment_Exam_Group_Option_Next_Button.click();
				}
				else if (Assessment_Exam_Group_OptionC.isDisplayed()) {
					Assessment_Exam_Group_OptionC.click();
					Assessment_Exam_Group_Option_Next_Button.click();
				}
				else
				{
					Assessment_Exam_Group_OptionD.click();
					Assessment_Exam_Group_Option_Next_Button.click();
				}
			}	
			Thread.sleep(1000);
			Assessment_Exam_Group_Finish_Button.click();
			excel.Write_data_pass(7, 32, 12);
			excel.Write_data_pass(7, 33, 12);
			
			//questions
			excel.Write_data_pass(7, 58, 12);
			excel.Write_data_pass(7, 59, 12);
			excel.Write_data_pass(7, 60, 12);
			excel.Write_data_pass(7, 61, 12);
			excel.Write_data_pass(7, 62, 12);
			excel.Write_data_pass(7, 63, 12);
			excel.Write_data_pass(7, 64, 12);
			excel.Write_data_pass(7, 65, 12);
			excel.Write_data_pass(7, 66, 12);
			excel.Write_data_pass(7, 67, 12);
			
			
		}
		catch(Exception e)
		{
			excel.Write_data_fail(7, 30, 12);
			excel.Write_data_fail(7, 31, 12);
			excel.Write_data_fail(7, 32, 12);
			excel.Write_data_fail(7, 33, 12);
			excel.Write_data_fail(7, 58, 12);
			excel.Write_data_fail(7, 59, 12);
			excel.Write_data_fail(7, 60, 12);
			excel.Write_data_fail(7, 61, 12);
			excel.Write_data_fail(7, 62, 12);
			excel.Write_data_fail(7, 63, 12);
			excel.Write_data_fail(7, 64, 12);
			excel.Write_data_fail(7, 65, 12);
			excel.Write_data_fail(7, 66, 12);
			excel.Write_data_fail(7, 67, 12);
			throw(e);
		}
	}
	@Test
	public void Assessment_Exam_Quantitative() throws Exception
	{
		logger=extent.createTest("Assessment_Exam_Quantitative");
		try
		{
			Thread.sleep(3000);
			String color=Assessment_Exam_Group_Quantitative_Verification_Color.getAttribute("style");
			Assert.assertEquals(color, Expected);
			Assessment_Exam_Group_Quantitative_selection.click();
			excel.Write_data_pass(7, 34, 12);
			Thread.sleep(2000);
			Assessment_Exam_Group_Quantitative_Start_Button.click();
			excel.Write_data_pass(7, 35, 12);
			Thread.sleep(1000);
			for(int i=1;i<=10;i++)
			{
				Thread.sleep(2000);
				if (Assessment_Exam_Group_OptionA.isDisplayed())
				{
					Assessment_Exam_Group_OptionA.click();  
					Assessment_Exam_Group_Option_Next_Button.click();
				}
				else if (Assessment_Exam_Group_OptionB.isDisplayed()) {
					Assessment_Exam_Group_OptionB.click();
					Assessment_Exam_Group_Option_Next_Button.click();
				}
				else if (Assessment_Exam_Group_OptionC.isDisplayed()) {
					Assessment_Exam_Group_OptionC.click();
					Assessment_Exam_Group_Option_Next_Button.click();
				}
				else
				{
					Assessment_Exam_Group_OptionD.click();
					Assessment_Exam_Group_Option_Next_Button.click();
				}
			}	
			Thread.sleep(1000);
			Assessment_Exam_Group_Finish_Button.click();
			excel.Write_data_pass(7, 36, 12);
			excel.Write_data_pass(7, 37, 12);
			
			//questions
			excel.Write_data_pass(7, 68, 12);
			excel.Write_data_pass(7, 69, 12);
			excel.Write_data_pass(7, 70, 12);
			excel.Write_data_pass(7, 71, 12);
			excel.Write_data_pass(7, 72, 12);
			excel.Write_data_pass(7, 73, 12);
			excel.Write_data_pass(7, 74, 12);
			excel.Write_data_pass(7, 75, 12);
			excel.Write_data_pass(7, 76, 12);
			excel.Write_data_pass(7, 77, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(7, 34, 12);
			excel.Write_data_fail(7, 35, 12);
			excel.Write_data_fail(7, 36, 12);
			excel.Write_data_fail(7, 37, 12);
			excel.Write_data_fail(7, 68, 12);
			excel.Write_data_fail(7, 69, 12);
			excel.Write_data_fail(7, 70, 12);
			excel.Write_data_fail(7, 71, 12);
			excel.Write_data_fail(7, 72, 12);
			excel.Write_data_fail(7, 73, 12);
			excel.Write_data_fail(7, 74, 12);
			excel.Write_data_fail(7, 75, 12);
			excel.Write_data_fail(7, 76, 12);
			excel.Write_data_fail(7, 77, 12);
			throw(e);
		}
	}

	@Test
	public void Assessment_Exam_Logical() throws Exception
	{
		logger=extent.createTest("Assessment_Exam_Logical");
		try
		{
			Thread.sleep(3000);
			String color=Assessment_Exam_Group_Logical_Verification_Color.getAttribute("style");
			Assert.assertEquals(color, Expected);
			Assessment_Exam_Group_Logical_selection.click();
			excel.Write_data_pass(7, 38, 12);
			Thread.sleep(3000);
			Assessment_Exam_Group_Logical_Start_Button.click();
			excel.Write_data_pass(7, 39, 12);
			Thread.sleep(1000);
			for(int i=1;i<=10;i++)
			{
				Thread.sleep(2000);
				if (Assessment_Exam_Group_OptionA.isDisplayed())
				{
					Assessment_Exam_Group_OptionA.click();  
					Assessment_Exam_Group_Option_Next_Button.click();
				}
				else if (Assessment_Exam_Group_OptionB.isDisplayed()) {
					Assessment_Exam_Group_OptionB.click();
					Assessment_Exam_Group_Option_Next_Button.click();
				}
				else if (Assessment_Exam_Group_OptionC.isDisplayed()) {
					Assessment_Exam_Group_OptionC.click();
					Assessment_Exam_Group_Option_Next_Button.click();
				}
				else
				{
					Assessment_Exam_Group_OptionD.click();
					Assessment_Exam_Group_Option_Next_Button.click();
				}
			}	
			Thread.sleep(1000);
			Assessment_Exam_Group_Finish_Button.click();
			excel.Write_data_pass(7, 40, 12);
			excel.Write_data_pass(7, 41, 12);
			
			excel.Write_data_pass(7, 78, 12);
			excel.Write_data_pass(7, 79, 12);
			excel.Write_data_pass(7, 80, 12);
			excel.Write_data_pass(7, 81, 12);
			excel.Write_data_pass(7, 82, 12);
			excel.Write_data_pass(7, 83, 12);
			excel.Write_data_pass(7, 84, 12);
			excel.Write_data_pass(7, 85, 12);
			excel.Write_data_pass(7, 86, 12);
			excel.Write_data_pass(7, 87, 12);
			
		}
		catch(Exception e)
		{
			excel.Write_data_fail(7, 38, 12);
			excel.Write_data_fail(7, 39, 12);
			excel.Write_data_fail(7, 40, 12);
			excel.Write_data_fail(7, 41, 12);
			excel.Write_data_fail(7, 78, 12);
			excel.Write_data_fail(7, 79, 12);
			excel.Write_data_fail(7, 80, 12);
			excel.Write_data_fail(7, 81, 12);
			excel.Write_data_fail(7, 82, 12);
			excel.Write_data_fail(7, 83, 12);
			excel.Write_data_fail(7, 84, 12);
			excel.Write_data_fail(7, 85, 12);
			excel.Write_data_fail(7, 86, 12);
			excel.Write_data_fail(7, 87, 12);
			throw(e);
		}
	}
	@Test
	public void Assessment_Exam_Behaviour() throws Exception
	{
		logger=extent.createTest("Assessment_Exam_Behaviour");
		try
		{
			Thread.sleep(3000);
			String color=Assessment_Exam_Group_Behaviour_Verification_Color.getAttribute("style");
			Assert.assertEquals(color, Expected);
			Thread.sleep(1000);
			Assessment_Exam_Group_Behaviour_selection.click();
			excel.Write_data_pass(7, 42, 12);
			Thread.sleep(3000);
			Assessment_Exam_Group_Behaviour_Start_Button.click();
			excel.Write_data_pass(7, 43, 12);
			for(int i=1;i<=25;i++)
			{	
				Thread.sleep(1000);
				Assessment_Exam_Group_Behavioural_Question_OptionA.click();
				Assessment_Exam_Group_Behavioural_Answer_OptionA.click();
				Assessment_Exam_Group_Option_Next_Button.click(); 
			}
			Thread.sleep(1000);
			Assessment_Exam_Behaviour_Group_Finish_Button.click();
			excel.Write_data_pass(7, 44, 12);
			excel.Write_data_pass(7, 45, 12);
			
			excel.Write_data_pass(7, 88, 12);
			excel.Write_data_pass(7, 89, 12);
			excel.Write_data_pass(7, 90, 12);
			excel.Write_data_pass(7, 91, 12);
			excel.Write_data_pass(7, 92, 12);
			excel.Write_data_pass(7, 93, 12);
			excel.Write_data_pass(7, 94, 12);
			excel.Write_data_pass(7, 95, 12);
			excel.Write_data_pass(7, 96, 12);
			excel.Write_data_pass(7, 97, 12);
			excel.Write_data_pass(7, 98, 12);
			excel.Write_data_pass(7, 99, 12);
			excel.Write_data_pass(7, 100, 12);
			excel.Write_data_pass(7, 101, 12);
			excel.Write_data_pass(7, 102, 12);
			excel.Write_data_pass(7, 103, 12);
			excel.Write_data_pass(7, 104, 12);
			excel.Write_data_pass(7, 105, 12);
			excel.Write_data_pass(7, 106, 12);
			excel.Write_data_pass(7, 107, 12);
			excel.Write_data_pass(7, 108, 12);
			excel.Write_data_pass(7, 109, 12);
			excel.Write_data_pass(7, 110, 12);
			excel.Write_data_pass(7, 111, 12);
			excel.Write_data_pass(7, 112, 12);
			
		}
		catch(Exception e)
		{
			excel.Write_data_fail(7, 42, 12);
			excel.Write_data_fail(7, 43, 12);
			excel.Write_data_fail(7, 44, 12);
			excel.Write_data_fail(7, 45, 12);
			excel.Write_data_fail(7, 88, 12);
			excel.Write_data_fail(7, 89, 12);
			excel.Write_data_fail(7, 90, 12);
			excel.Write_data_fail(7, 91, 12);
			excel.Write_data_fail(7, 92, 12);
			excel.Write_data_fail(7, 93, 12);
			excel.Write_data_fail(7, 94, 12);
			excel.Write_data_fail(7, 95, 12);
			excel.Write_data_fail(7, 96, 12);
			excel.Write_data_fail(7, 97, 12);
			excel.Write_data_fail(7, 98, 12);
			excel.Write_data_fail(7, 99, 12);
			excel.Write_data_fail(7, 100, 12);
			excel.Write_data_fail(7, 101, 12);
			excel.Write_data_fail(7, 102, 12);
			excel.Write_data_fail(7, 103, 12);
			excel.Write_data_fail(7, 104, 12);
			excel.Write_data_fail(7, 105, 12);
			excel.Write_data_fail(7, 106, 12);
			excel.Write_data_fail(7, 107, 12);
			excel.Write_data_fail(7, 108, 12);
			excel.Write_data_fail(7, 109, 12);
			excel.Write_data_fail(7, 110, 12);
			excel.Write_data_fail(7, 111, 12);
			excel.Write_data_fail(7, 112, 12);
			throw(e);
		}
	}

	@Test
	public void Assessment_Exam_Technical_Core_Domain()throws Exception
	{
		logger=extent.createTest("Assessment_Exam_Technical_Core_Domain");
		try
		{
			Thread.sleep(5000);
			String color=Assessment_Exam_Group_Technical_Core_Domain_Verification_Color.getAttribute("style");
			Assert.assertEquals(color, Expected);
			Assessment_Exam_Group_Technical_Core_Domain_selection.click();
			excel.Write_data_pass(7, 46, 12);
			Thread.sleep(5000);
			Assessment_Exam_Group_Technical_Core_Domain_Start_Button.click(); 
			excel.Write_data_pass(7, 47, 12);
			for(int i=1;i<=30;i++)
			{   Thread.sleep(1000);


			if (Assessment_Exam_Group_OptionA.isDisplayed()) {
				Assessment_Exam_Group_OptionA.click();  
				Assessment_Exam_Group_Option_Next_Button.click();

			}
			else if (Assessment_Exam_Group_OptionB.isDisplayed()) {
				Assessment_Exam_Group_OptionB.click();
				Assessment_Exam_Group_Option_Next_Button.click();

			}
			else if (Assessment_Exam_Group_OptionC.isDisplayed()) {
				Assessment_Exam_Group_OptionC.click();
				Assessment_Exam_Group_Option_Next_Button.click();

			}
			else
			{
				Assessment_Exam_Group_OptionD.click();
				Assessment_Exam_Group_Option_Next_Button.click();
			}
			}
			Thread.sleep(1000);
			Assessment_Exam_Group_Finish_Button.click();
			excel.Write_data_pass(7, 48, 12);
			excel.Write_data_pass(7, 49, 12);
			
			excel.Write_data_pass(7, 113, 12);
			excel.Write_data_pass(7, 114, 12);
			excel.Write_data_pass(7, 115, 12);
			excel.Write_data_pass(7, 116, 12);
			excel.Write_data_pass(7, 117, 12);
			excel.Write_data_pass(7, 118, 12);
			excel.Write_data_pass(7, 119, 12);
			excel.Write_data_pass(7, 120, 12);
			excel.Write_data_pass(7, 121, 12);
			excel.Write_data_pass(7, 122, 12);
			excel.Write_data_pass(7, 123, 12);
			excel.Write_data_pass(7, 124, 12);
			excel.Write_data_pass(7, 125, 12);
			excel.Write_data_pass(7, 126, 12);
			excel.Write_data_pass(7, 127, 12);
			excel.Write_data_pass(7, 128, 12);
			excel.Write_data_pass(7, 129, 12);
			excel.Write_data_pass(7, 130, 12);
			excel.Write_data_pass(7, 131, 12);
			excel.Write_data_pass(7, 132, 12);
			excel.Write_data_pass(7, 133, 12);
			excel.Write_data_pass(7, 134, 12);
			excel.Write_data_pass(7, 135, 12);
			excel.Write_data_pass(7, 136, 12);
			excel.Write_data_pass(7, 137, 12);
			excel.Write_data_pass(7, 138, 12);
			excel.Write_data_pass(7, 139, 12);
			excel.Write_data_pass(7, 140, 12);
			excel.Write_data_pass(7, 141, 12);
			excel.Write_data_pass(7, 142, 12);			
		
		}
		catch(Exception e)
		{
			excel.Write_data_fail(7, 46, 12);
			excel.Write_data_fail(7, 47, 12);
			excel.Write_data_fail(7, 48, 12);
			excel.Write_data_fail(7, 49, 12);
			excel.Write_data_fail(7, 113, 12);
			excel.Write_data_fail(7, 114, 12);
			excel.Write_data_fail(7, 115, 12);
			excel.Write_data_fail(7, 116, 12);
			excel.Write_data_fail(7, 117, 12);
			excel.Write_data_fail(7, 118, 12);
			excel.Write_data_fail(7, 119, 12);
			excel.Write_data_fail(7, 120, 12);
			excel.Write_data_fail(7, 121, 12);
			excel.Write_data_fail(7, 122, 12);
			excel.Write_data_fail(7, 123, 12);
			excel.Write_data_fail(7, 124, 12);
			excel.Write_data_fail(7, 125, 12);
			excel.Write_data_fail(7, 126, 12);
			excel.Write_data_fail(7, 127, 12);
			excel.Write_data_fail(7, 128, 12);
			excel.Write_data_fail(7, 129, 12);
			excel.Write_data_fail(7, 130, 12);
			excel.Write_data_fail(7, 131, 12);
			excel.Write_data_fail(7, 132, 12);
			excel.Write_data_fail(7, 133, 12);
			excel.Write_data_fail(7, 134, 12);
			excel.Write_data_fail(7, 135, 12);
			excel.Write_data_fail(7, 136, 12);
			excel.Write_data_fail(7, 137, 12);
			excel.Write_data_fail(7, 138, 12);
			excel.Write_data_fail(7, 139, 12);
			excel.Write_data_fail(7, 140, 12);
			excel.Write_data_fail(7, 141, 12);
			excel.Write_data_fail(7, 142, 12);
			throw(e);
		}
	}
	@Test
	public void Assessment_Exam_Technical_Fundamental() throws Exception
	{
		logger=extent.createTest("Assessment_Exam_Technical_Fundamental");
		try
		{
			Thread.sleep(3000);
			String color=Assessment_Exam_Group_Technical_Fundamental_Verification_Color.getAttribute("style");
			Assert.assertEquals(color, Expected);
			Thread.sleep(3000);
			Assessment_Exam_Group_Technical_Fundamental_selection.click();
			excel.Write_data_pass(7, 50, 12);
			Thread.sleep(5000);
			Assessment_Exam_Group_Technical_Fundamental_Start_Button.click();
			excel.Write_data_pass(7, 51, 12);
			Thread.sleep(1000);
			for(int i=1;i<=20;i++)
			{
				Thread.sleep(2000);
				if (Assessment_Exam_Group_OptionA.isDisplayed()) {
					Assessment_Exam_Group_OptionA.click();  
					Assessment_Exam_Group_Option_Next_Button.click();

				}
				else if (Assessment_Exam_Group_OptionB.isDisplayed()) {
					Assessment_Exam_Group_OptionB.click();
					Assessment_Exam_Group_Option_Next_Button.click();

				}
				else if (Assessment_Exam_Group_OptionC.isDisplayed()) {
					Assessment_Exam_Group_OptionC.click();
					Assessment_Exam_Group_Option_Next_Button.click();

				}
				else
				{
					Assessment_Exam_Group_OptionD.click();
					Assessment_Exam_Group_Option_Next_Button.click();
				}
			}
			Thread.sleep(1000);
			Assessment_Exam_Group_Finish_Button.click();
			excel.Write_data_pass(7, 52, 12);
			excel.Write_data_pass(7, 53, 12);
			
			excel.Write_data_pass(7, 143, 12);	
			excel.Write_data_pass(7, 144, 12);	
			excel.Write_data_pass(7, 145, 12);	
			excel.Write_data_pass(7, 146, 12);	
			excel.Write_data_pass(7, 147, 12);	
			excel.Write_data_pass(7, 148, 12);	
			excel.Write_data_pass(7, 149, 12);	
			excel.Write_data_pass(7, 150, 12);	
			excel.Write_data_pass(7, 151, 12);	
			excel.Write_data_pass(7, 152, 12);	
			excel.Write_data_pass(7, 153, 12);	
			excel.Write_data_pass(7, 154, 12);	
			excel.Write_data_pass(7, 155, 12);	
			excel.Write_data_pass(7, 156, 12);	
			excel.Write_data_pass(7, 157, 12);	
			excel.Write_data_pass(7, 158, 12);	
			excel.Write_data_pass(7, 159, 12);	
			excel.Write_data_pass(7, 160, 12);	
			excel.Write_data_pass(7, 161, 12);	
			excel.Write_data_pass(7, 162, 12);		
		}
		catch(Exception e)
		{
			excel.Write_data_fail(7, 50, 12);
			excel.Write_data_fail(7, 51, 12);
			excel.Write_data_fail(7, 52, 12);
			excel.Write_data_fail(7, 53, 12);
			excel.Write_data_fail(7, 143, 12);	
			excel.Write_data_fail(7, 144, 12);	
			excel.Write_data_fail(7, 145, 12);	
			excel.Write_data_fail(7, 146, 12);	
			excel.Write_data_fail(7, 147, 12);	
			excel.Write_data_fail(7, 148, 12);	
			excel.Write_data_fail(7, 149, 12);	
			excel.Write_data_fail(7, 150, 12);	
			excel.Write_data_fail(7, 151, 12);	
			excel.Write_data_fail(7, 152, 12);	
			excel.Write_data_fail(7, 153, 12);	
			excel.Write_data_fail(7, 154, 12);	
			excel.Write_data_fail(7, 155, 12);	
			excel.Write_data_fail(7, 156, 12);	
			excel.Write_data_fail(7, 157, 12);	
			excel.Write_data_fail(7, 158, 12);	
			excel.Write_data_fail(7, 159, 12);	
			excel.Write_data_fail(7, 160, 12);	
			excel.Write_data_fail(7, 161, 12);	
			excel.Write_data_fail(7, 162, 12);		
			throw(e);
		}
	}	

	@Test
	public void Assessment_Feedback() throws Exception
	{
		logger=extent.createTest("Assessment_Feedback");
		try
		{
			Thread.sleep(3000);
			//String color1=Assessment_Exam_Feedback_Verification_Color.getCssValue("background-color");
			//Assert.assertEquals(color1, Expected1);
			Assessment_Exam_Group_overall_Finish_Button.click();
			excel.Write_data_pass(7, 54, 12);
			Thread.sleep(3000);
			Assessment_Exam_Group_overall_Finish_Button_ok_popub.click();
			Thread.sleep(1000);
			Assessment_Exam_Feedback_Question1.click();
			Assessment_Exam_Feedback_Question2.click();
			Assessment_Exam_Feedback_Question3.click();
			excel.Write_data_pass(7, 55, 12);
			Thread.sleep(1000);
			Assessment_Exam_Feedback_overall_Finish_Button.click();
			excel.Write_data_pass(7, 56, 12);
			Thread.sleep(3000);
			Assessment_Exam_Feedback_overall_Finish_Ok_Button.click();
			Assessment_Exam_Logout.click();
			excel.Write_data_pass(7, 57, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(7, 54, 12);
			excel.Write_data_fail(7, 55, 12);
			excel.Write_data_fail(7, 56, 12);
			excel.Write_data_fail(7, 57, 12);
			throw(e);
		}
	}
}


