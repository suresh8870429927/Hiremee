package Hiremee_College_Module_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_College_Module.College_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class College_Dashboard_Page extends  College_Driver_Class
{
	
	@FindBy(how=How.ID,using="js-href-shortliststudent-shortlisted")
	WebElement college_shortlisted_students;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[3]/div/a")
	WebElement college_Total_weekly_shortlisted_students;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[4]/div/a")
	WebElement college_Total_Monthly_shortlisted_students;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[5]/div/a")
	WebElement college_Total_Yearly_shortlisted_students;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[6]/div/div[3]/div/div[1]/div[1]/a/div")
	WebElement college_student_uploaded;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[6]/div/div[3]/div/div[1]/div[2]/a/div")
	WebElement college_student_Registered;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[6]/div/div[3]/div/div[1]/div[3]/a/div")
	WebElement college_Assessed_Candidate;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[6]/div/div[3]/div/div[2]/div[1]/a")
	WebElement college_Assessed_Hired_Candidate;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[6]/div/div[4]/div/a")
	WebElement college_Assessed_Rejected_Candidate;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/a")
	WebElement college_Top15_students;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/a")
	WebElement college_Upload_student_XLSX;
	
	
	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet();
	public College_Dashboard_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);

	}
	@Test
	public void college_dashboard() throws Exception
	{
		logger=extent.createTest("college_dashboard");
		try 
		{
			Thread.sleep(3000);
			college_shortlisted_students.click();
			excel.Write_data_pass(2, 109, 12);
			excel.Write_data_pass(2, 117, 12);
			driver.navigate().back();
			excel.Write_data_pass(2, 119, 12);
			excel.Write_data_pass(2, 121, 12);
			Thread.sleep(3000);
			college_Total_weekly_shortlisted_students.click();
			excel.Write_data_pass(2, 122, 12);
			driver.navigate().back();
			Thread.sleep(3000);
			college_Total_Monthly_shortlisted_students.click();
			excel.Write_data_pass(2, 123, 12);
			driver.navigate().back();
			Thread.sleep(3000);
			college_Total_Yearly_shortlisted_students.click();
			excel.Write_data_pass(2, 124, 12);
			excel.Write_data_pass(2, 125, 12);
			excel.Write_data_pass(2, 126, 12);
			excel.Write_data_pass(2, 127, 12);
			excel.Write_data_pass(2, 128, 12);
			excel.Write_data_pass(2, 129, 12);
			driver.navigate().back();
			Thread.sleep(3000);
			college_student_uploaded.click();
			excel.Write_data_pass(2, 131, 12);
			driver.navigate().back();
			Thread.sleep(3000);
			college_student_Registered.click();
			excel.Write_data_pass(2, 132, 12);
			driver.navigate().back();
			Thread.sleep(3000);
			college_Assessed_Candidate.click();
			excel.Write_data_pass(2, 133, 12);
			driver.navigate().back();
			Thread.sleep(3000);
			college_Assessed_Hired_Candidate.click();
			excel.Write_data_pass(2, 134, 12);
			driver.navigate().back();
			Thread.sleep(3000);
			college_Top15_students.click();
			excel.Write_data_pass(2, 142, 12);
			driver.navigate().back();
			Thread.sleep(3000);
			college_Assessed_Rejected_Candidate.click();
			excel.Write_data_pass(2, 154, 12);	
			driver.navigate().back();
			Thread.sleep(3000);
			college_Upload_student_XLSX.click();
			excel.Write_data_pass(2, 153, 12);	
		}
		catch(Exception e)
		{
			excel.Write_data_fail(2, 109, 12);
			excel.Write_data_fail(2, 117, 12);
			excel.Write_data_fail(2, 119, 12);
			excel.Write_data_fail(2, 121, 12);
			excel.Write_data_fail(2, 122, 12);
			excel.Write_data_fail(2, 123, 12);
			excel.Write_data_fail(2, 124, 12);
			excel.Write_data_fail(2, 125, 12);
			excel.Write_data_fail(2, 126, 12);
			excel.Write_data_fail(2, 127, 12);
			excel.Write_data_fail(2, 128, 12);
			excel.Write_data_fail(2, 129, 12);
			excel.Write_data_fail(2, 131, 12);
			excel.Write_data_fail(2, 132, 12);
			excel.Write_data_fail(2, 133, 12);
			excel.Write_data_fail(2, 134, 12);
			excel.Write_data_fail(2, 142, 12);
			excel.Write_data_fail(2, 153, 12);
			excel.Write_data_fail(2, 154, 12);
			throw(e);
		}
	}

}
