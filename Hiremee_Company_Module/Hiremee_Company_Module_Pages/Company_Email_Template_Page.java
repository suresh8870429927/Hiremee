package Hiremee_Company_Module_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Driver_Started_Company_Module.Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Company_Email_Template_Page extends Driver_Class{
	
	@FindBy(how=How.LINK_TEXT,using="Email Template")
	WebElement Email_template_Link;
	
	@FindBy(how=How.ID,using="title")
	WebElement Email_template_New_Title;	
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]")
	WebElement Email_template_Sample_Instruction;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/div/div[3]/div[2]")
	WebElement Email_template_Body;
	
	@FindBy(how=How.ID,using="corporate_email_tmp")
	WebElement Email_template_save_template;	
	
	@FindBy(how=How.XPATH,using="/html/body/div[7]/div[7]/div/button")
	WebElement Company_Email_Template_success_popub;
	
	WebDriver driver;
	String Email_Template_Title;
	Excel_Sheet excel=new Excel_Sheet();
	public Company_Email_Template_Page(WebDriver ldriver)	
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public void Company_Email_Template() throws Exception
	{
		logger=extent.createTest("Company_Email_Template");
		try {
		//email Template
		ExplicitWait(driver, Email_template_Link);
		Email_template_Link.click();
		excel.Write_data_pass(3, 276, 12);
		excel.Write_data_pass(3, 277, 12);
		Email_Template_Title=excel.Read_data(3, 285, 11);
		Email_template_New_Title.sendKeys(Email_Template_Title);
		excel.Write_data_pass(3, 285, 12);
		ExplicitWait(driver, Email_template_Sample_Instruction);
		WebElement element=Email_template_Sample_Instruction;
		String email_body=element.getText();
		ExplicitWait(driver, Email_template_Body);
		Email_template_Body.sendKeys(email_body);
		excel.Write_data_pass(3, 287, 12);
		Email_template_save_template.click();
		excel.Write_data_pass(3, 289, 12);
		ExplicitWait(driver, Company_Email_Template_success_popub);
		Company_Email_Template_success_popub.click();
		excel.Write_data_pass(3, 290, 12);
	}
	catch(Exception e)
	{
		excel.Write_data_fail(3, 276, 12);
		excel.Write_data_fail(3, 277, 12);
		excel.Write_data_fail(3, 285, 12);
		excel.Write_data_fail(3, 287, 12);
		excel.Write_data_fail(3, 289, 12);
		excel.Write_data_fail(3, 290, 12);
		throw(e);
		
	}
}
}

