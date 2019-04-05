package Hiremee_Candidate_Page;

import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Candidate_Login_Page extends Candidate_Driver_Class
{

	@FindBy(how=How.ID,using="js-candi-email_address")
	WebElement Candidate_Email_ID;

	@FindBy(how=How.ID,using="js-candi-password")
	WebElement Candidate_Password;

	@FindBy(how=How.ID,using="js-candi-captcha")
	WebElement candidate_Captcha_value;

	@FindBy(how=How.ID,using="js-btn_submit")
	WebElement candidate_Login_Submit_button;


	WebDriver driver;
	String Hiremee_candidate_url;
	//String Email_id;
	//String password;
	Excel_Sheet excel=new Excel_Sheet();
	public Candidate_Login_Page(WebDriver l1driver)
	{
		this.driver=l1driver;
		PageFactory.initElements(driver,this);
	}

	@Test
	public void Candiadte_Login() throws Exception
	{	
		logger=extent.createTest("Candiadte_Login");
		try
		{
			//login-candidate
			Hiremee_candidate_url=excel.Read_data(1, 19, 11);
			driver.get(Hiremee_candidate_url);
			excel.Write_data_pass(1, 19, 12);
			excel.Write_data_pass(1, 61, 12);
			excel.Write_data_pass(1, 62, 12);
			//Email_id=excel.Read_data(1, 65, 11);
			Candidate_Email_ID.sendKeys(Candidate_Pooled_Campus_Registration_Page.Email_id);
			excel.Write_data_pass(1, 63, 12);
			excel.Write_data_pass(1, 64, 12);
			excel.Write_data_pass(1, 65, 12);
			//password=excel.Read_data(1, 67, 11);
			Candidate_Password.sendKeys(Candidate_Pooled_Campus_Registration_Page.password);
			excel.Write_data_pass(1, 67, 12);
			String candidate_login_captcha=JOptionPane.showInputDialog("Enter the answer for above captcha:");
			candidate_Captcha_value.sendKeys(candidate_login_captcha);
			excel.Write_data_pass(1, 69, 12);
			candidate_Login_Submit_button.click();
			excel.Write_data_pass(1, 71, 12);
			excel.Write_data_pass(1, 73, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 19, 12);
			excel.Write_data_fail(1, 61, 12);
			excel.Write_data_fail(1, 62, 12);
			excel.Write_data_fail(1, 63, 12);
			excel.Write_data_fail(1, 64, 12);
			excel.Write_data_fail(1, 65, 12);
			excel.Write_data_fail(1, 67, 12);
			excel.Write_data_fail(1, 69, 12);
			excel.Write_data_fail(1, 71, 12);
			excel.Write_data_fail(1, 73, 12);
			throw(e);
		}

	}
}