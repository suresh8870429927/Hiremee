package Hiremee_Candidate_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Candidate_Mock_Assessment_Page extends Candidate_Driver_Class
{
	@FindBy(how=How.LINK_TEXT,using="Mock Assessment")
	WebElement Mock_Assessment;

	@FindBy(how=How.LINK_TEXT,using="Take Mock Assessment")
	WebElement Take_Mock_Assessment;

	@FindBy(how=How.LINK_TEXT,using="Take Test")
	WebElement Take_Test;

	@FindBy(how=How.ID,using="btn_start")
	WebElement Start_Test;
	
	@FindBy(how=How.XPATH,using="//input[@id='1'][@name='group']")
	WebElement Verbal_Group;
	
	@FindBy(how=How.XPATH,using="//input[@id='2'][@name='group']")
	WebElement Quantitative_Group;
	
	@FindBy(how=How.XPATH,using="//input[@id='3'][@name='group']")
	WebElement Logical_Group;
	
	@FindBy(how=How.XPATH,using="//input[@id='6'][@name='group']")
	WebElement Technical_Group;
	
	@FindBy(how=How.XPATH,using="//input[@id='7'][@name='group']")
	WebElement Technical_fundamental_Group;
	
	@FindBy(how=How.ID,using="btn_submit")
	WebElement Group_submit_button;
	
	@FindBy(how=How.NAME,using="radio")
	WebElement Question_radio_button;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div/div[4]/div/div/div/div[2]/div/div[1]/div[3]/div[2]/button")
	WebElement Question_Next_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div/div/div[4]/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/button[2]")
	WebElement Question_Submit_Button;

	@FindBy(how=How.XPATH,using="/html/body/div[15]/div[7]/div/button")
	WebElement Compalete_group_popub;
	
	@FindBy(how=How.NAME,using="answer_1")
	WebElement Feedaback_radio_button1;
	
	@FindBy(how=How.NAME,using="answer_2")
	WebElement Feedaback_radio_button2;
	
	@FindBy(how=How.NAME,using="answer_3")
	WebElement Feedaback_radio_button3;
	
	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet();

	public Candidate_Mock_Assessment_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}

	public  void Mock_Assessment() throws Exception 
	{
		logger=extent.createTest("Mock_Assessment");
		try
		{
			Thread.sleep(2000);
			Mock_Assessment.click();
			excel.Write_data_pass(1, 236, 12);
			Thread.sleep(2000);
			Take_Mock_Assessment.click();
			excel.Write_data_pass(1, 237, 12);
			Thread.sleep(3000);
			Take_Test.click();
			excel.Write_data_pass(1, 238, 12);
			Thread.sleep(2000);
			//new user write exam---need to change
			Start_Test.click();
			excel.Write_data_pass(1, 239, 12);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 236, 12);
			excel.Write_data_fail(1, 237, 12);
			excel.Write_data_fail(1, 238, 12);
			excel.Write_data_pass(1, 239, 12);
			throw(e);
		}
	}
	@Test
	public void verbal_group_exam() throws Exception
	{
		logger=extent.createTest("verbal_group_exam");
		try
		{
			//Verbal
			Actions act1=new Actions(driver);
			Thread.sleep(3000);
			act1.moveToElement(Verbal_Group).click().build().perform();
			excel.Write_data_pass(1, 240, 12);
			Thread.sleep(3000);
			Group_submit_button.click();
			excel.Write_data_pass(1, 241, 12);
			Thread.sleep(3000);
			//question
			act1.moveToElement(Question_radio_button).click().build().perform();
			excel.Write_data_pass(1, 242, 12);
			Thread.sleep(3000);
			Question_Next_Button.click();
			excel.Write_data_pass(1, 243, 12);
			//question2
			act1.moveToElement(Question_radio_button).click().build().perform();
			Thread.sleep(3000);
			Question_Submit_Button.click();
			excel.Write_data_pass(1, 244, 12);
			Thread.sleep(3000);
			Compalete_group_popub.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 240, 12);
			excel.Write_data_fail(1, 241, 12);
			excel.Write_data_fail(1, 242, 12);
			excel.Write_data_fail(1, 243, 12);
			excel.Write_data_fail(1, 244, 12);
			throw(e);
		}
	}
	@Test
	public void quantitative_group_exam() throws Exception
	{
		logger=extent.createTest("quantitative_group_exam");
		try
		{
			//quantitative
			Thread.sleep(3000);
			Actions act1=new Actions(driver);
			Thread.sleep(3000);
			act1.moveToElement(Quantitative_Group).click().build().perform();
			excel.Write_data_pass(1, 245, 12);
			Thread.sleep(3000);
			Group_submit_button.click();
			excel.Write_data_pass(1, 246, 12);
			//question1
			Thread.sleep(3000);
			act1.moveToElement(Question_radio_button).click().build().perform();
			excel.Write_data_pass(1, 247, 12);
			Thread.sleep(3000);
			Question_Next_Button.click();
			excel.Write_data_pass(1, 248, 12);
			Thread.sleep(3000);
			//question2
			act1.moveToElement(Question_radio_button).click().build().perform();
			Thread.sleep(3000);
			Question_Submit_Button.click();
			excel.Write_data_pass(1, 249, 12);
			Thread.sleep(3000);
			Compalete_group_popub.click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 245, 12);
			excel.Write_data_fail(1, 246, 12);
			excel.Write_data_fail(1, 247, 12);
			excel.Write_data_fail(1, 248, 12);
			excel.Write_data_fail(1, 249, 12);
			throw(e);
		}
	}
	@Test
	public void logical_group_exam() throws Exception
	{
		logger=extent.createTest("logical_group_exam");
		try
		{
			//logical
			Actions act1=new Actions(driver);
			Thread.sleep(3000);
			act1.moveToElement(Logical_Group).click().build().perform();
			excel.Write_data_pass(1, 250, 12);
			Thread.sleep(3000);
			Group_submit_button.click();
			excel.Write_data_pass(1, 251, 12);
			Thread.sleep(3000);
			//question1
			act1.moveToElement(Question_radio_button).click().build().perform();
			excel.Write_data_pass(1, 252, 12);
			Thread.sleep(3000);
			Question_Next_Button.click();
			excel.Write_data_pass(1, 253, 12);
			Thread.sleep(3000);
			//question2
			act1.moveToElement(Question_radio_button).click().build().perform();
			Thread.sleep(3000);
			Question_Submit_Button.click();
			excel.Write_data_pass(1, 254, 12);
			Thread.sleep(3000);
			Compalete_group_popub.click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 250, 12);
			excel.Write_data_fail(1, 251, 12);
			excel.Write_data_fail(1, 252, 12);
			excel.Write_data_fail(1, 253, 12);
			excel.Write_data_fail(1, 254, 12);
			throw(e);
		}
	}
	@Test
	public void Technical_group_exam() throws Exception
	{
		logger=extent.createTest("Technical_group_exam");
		try
		{
			//Technical
			Actions act1=new Actions(driver);
			Thread.sleep(3000);
			act1.moveToElement(Technical_Group).click().build().perform();
			excel.Write_data_pass(1, 255, 12);
			Thread.sleep(3000);
			Group_submit_button.click();
			excel.Write_data_pass(1, 256, 12);
			Thread.sleep(3000);
			//question1
			act1.moveToElement(Question_radio_button).click().build().perform();
			excel.Write_data_pass(1, 257, 12);
			Thread.sleep(3000);
			Question_Next_Button.click();
			excel.Write_data_pass(1, 258, 12);
			Thread.sleep(3000);
			//question2
			act1.moveToElement(Question_radio_button).click().build().perform();
			Thread.sleep(3000);
			Question_Submit_Button.click();
			excel.Write_data_pass(1, 259, 12);
			Thread.sleep(3000);
			Compalete_group_popub.click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 255, 12);
			excel.Write_data_fail(1, 256, 12);
			excel.Write_data_fail(1, 257, 12);
			excel.Write_data_fail(1, 258, 12);
			excel.Write_data_fail(1, 259, 12);
			throw(e);
		}
	}
	@Test
	public void Technical_computer_group_exam() throws Exception
	{
		logger=extent.createTest("Technical_computer_group_exam");
		try
		{
			//computer
			Actions act1=new Actions(driver);
			Thread.sleep(3000);
			act1.moveToElement(Technical_fundamental_Group).click().build().perform();
			excel.Write_data_pass(1, 260, 12);
			Thread.sleep(3000);
			Group_submit_button.click();
			excel.Write_data_pass(1, 261, 12);
			Thread.sleep(3000);
			//question1
			act1.moveToElement(Question_radio_button).click().build().perform();
			excel.Write_data_pass(1, 262, 12);
			Thread.sleep(3000);
			Question_Next_Button.click();
			excel.Write_data_pass(1, 263, 12);
			Thread.sleep(3000);
			//question2
			act1.moveToElement(Question_radio_button).click().build().perform();
			Thread.sleep(3000);
			Question_Submit_Button.click();
			excel.Write_data_pass(1, 264, 12);
			Thread.sleep(3000);
			Compalete_group_popub.click();
			Thread.sleep(3000);
			Compalete_group_popub.click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 260, 12);
			excel.Write_data_fail(1, 261, 12);
			excel.Write_data_fail(1, 262, 12);
			excel.Write_data_fail(1, 263, 12);
			excel.Write_data_fail(1, 264, 12);
			throw(e);
		}
	}
	@Test
	public void feedback_exam() throws Exception
	{
		logger=extent.createTest("feedback_group_exam");
		try
		{
			Thread.sleep(3000);
			//feedback
			Actions act1=new Actions(driver);
			Thread.sleep(3000);
			act1.moveToElement(Feedaback_radio_button1).click().build().perform();
			excel.Write_data_pass(1, 265, 12);
			Thread.sleep(3000);
			act1.moveToElement(Feedaback_radio_button2).click().build().perform();
			Thread.sleep(3000);
			act1.moveToElement(Feedaback_radio_button3).click().build().perform();
			Thread.sleep(3000);
			Group_submit_button.click();
			excel.Write_data_pass(1, 266, 12);
			Thread.sleep(3000);
			Compalete_group_popub.click();
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 264, 12);
			excel.Write_data_fail(1, 266, 12);
			throw(e);
		}
	}
}
