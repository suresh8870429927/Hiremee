package Hiremee_Company_Module_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Driver_Started_Company_Module.Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Company_Pro_Upgrade_page extends Driver_Class
{
	@FindBy(how=How.LINK_TEXT,using="Upgrade to PRO")
	WebElement Upgrade_pro_Button;
	
	@FindBy(how=How.ID,using="upgrade_message")
	WebElement Upgrade_pro_Message;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary f-16 pull-right proupgrade' and @type='submit']")
	WebElement Upgrade_pro_Request_pro_Button;
	
	@FindBy(how=How.XPATH,using="//button[@class='confirm']")
	WebElement Upgrade_pro_Request_Success_ok_button;
	
	WebDriver driver;
	String Pro_Request_Message;
	Excel_Sheet excel=new Excel_Sheet();
	public Company_Pro_Upgrade_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void pro_upgrade_company() throws Exception
	{
		logger=extent.createTest("pro_upgrade_company");
		try
		{
			ExplicitWait(driver, Upgrade_pro_Button);
			Upgrade_pro_Button.click();
			excel.Write_data_pass(3, 397, 12);
			excel.Write_data_pass(3, 398, 12);
			ExplicitWait(driver, Upgrade_pro_Message);
			Pro_Request_Message=excel.Read_data(3, 400, 11);
			Upgrade_pro_Message.sendKeys(Pro_Request_Message);
			excel.Write_data_pass(3, 400, 12);
			ExplicitWait(driver, Upgrade_pro_Request_pro_Button);
			Upgrade_pro_Request_pro_Button.click();
			excel.Write_data_pass(3, 401, 12);
			ExplicitWait(driver, Upgrade_pro_Request_Success_ok_button);
			Upgrade_pro_Request_Success_ok_button.click();
			excel.Write_data_pass(3, 404, 12);
		}
		catch(Exception e)
		{
			excel.Write_data_fail(3, 397, 12);
			excel.Write_data_fail(3, 398, 12);
			excel.Write_data_fail(3, 400, 12);
			excel.Write_data_fail(3, 401, 12);
			excel.Write_data_fail(3, 404, 12);
			throw(e);
		}
	}
}
