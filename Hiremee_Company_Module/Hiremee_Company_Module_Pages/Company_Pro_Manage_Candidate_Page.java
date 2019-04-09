package Hiremee_Company_Module_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Company_Module.Driver_Class;

public class Company_Pro_Manage_Candidate_Page extends Driver_Class
{
	@FindBy(how=How.LINK_TEXT,using="Manage Candidate")
	WebElement Manage_Candidate;
	
	@FindBy(how=How.LINK_TEXT,using="Invites Pending")
	WebElement Manage_Candidate_Invites_Pending;
	
	@FindBy(how=How.ID,using="show-message")
	WebElement Manage_Candidate_Invites_Pending_Compose_Message_Button;
	
	@FindBy(how=How.ID,using="feedback_message")
	WebElement Manage_Candidate_Invites_Pending_Compose_Message_Custom_Message;
	
	@FindBy(how=How.XPATH,using="//button[@class='m-r-5 btn btn-sm f-14 text-333  btn-block btn-primary sent-invites']")
	WebElement Manage_Candidate_Invites_Pending_Compose_Message_Send_Button;
	
	@FindBy(how=How.XPATH,using="//button[@class='confirm']")
	WebElement Manage_Candidate_Invites_Pendind_Success_Message;
		
	@FindBy(how=How.CLASS_NAME,using="checkItem")
	WebElement Manage_Candidate_Invites_Pending_Check_Box;
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[3]")
	WebElement Manage_Candidate_Invites_Pending_Test_Pin;
	
	@FindBy(how=How.XPATH,using="//span[@class='hmepro-icon-minus c-white']")
	WebElement Manage_Candidate_Invites_Pending_Compose_Message_Button_close_button;
	
	WebDriver driver;
	String Testpins[]=new String[19];
	String Compose_Message="Automation Message";
	public Company_Pro_Manage_Candidate_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void company_manage_candidate() throws Exception
	{
		try
		{
			Thread.sleep(2000);
			Manage_Candidate.click();
			Thread.sleep(2000);
			Manage_Candidate_Invites_Pending.click();
			Thread.sleep(1000);
			Manage_Candidate_Invites_Pending_Compose_Message_Button.click();
			Thread.sleep(1000);
			Manage_Candidate_Invites_Pending_Compose_Message_Custom_Message.sendKeys(Compose_Message);
			Thread.sleep(1000);
			Manage_Candidate_Invites_Pending_Compose_Message_Send_Button.click();
			Thread.sleep(1000);
			Manage_Candidate_Invites_Pendind_Success_Message.click();
			Thread.sleep(3000);
			//Manage_Candidate_Invites_Pending_Check_Box.click();
			for(int i=0;i<=19;i++)
			{
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			js.executeScript("arguments[0].click();", Manage_Candidate_Invites_Pending_Check_Box);
			Thread.sleep(2000);
			Testpins[i]=Manage_Candidate_Invites_Pending_Test_Pin.getText();
			Thread.sleep(1000);
			Manage_Candidate_Invites_Pending_Compose_Message_Button.click();
			Thread.sleep(1000);
			Manage_Candidate_Invites_Pending_Compose_Message_Custom_Message.sendKeys(Compose_Message);
			Thread.sleep(1000);
			Manage_Candidate_Invites_Pending_Compose_Message_Send_Button.click();
			Thread.sleep(1000);
			Manage_Candidate_Invites_Pendind_Success_Message.click();
			Thread.sleep(3000);
			Manage_Candidate_Invites_Pending_Compose_Message_Button_close_button.click();
			System.out.println(Testpins[i]);
			}
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	

}
