package Hiremee_Candidate_TestCase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Hiremee_Candidate_Page.Candidate_Login_Page;
import Hiremee_Candidate_Page.Candidate_Recruiter_Message_Page;

public class candidate_recruiter_messages_Testcase {
	
	WebDriver driver;
	Candidate_Login_Page Obj_Candidate_login;
	Candidate_Recruiter_Message_Page Obj_Candidate_Recruiter_Messages;
	@BeforeTest
	public void Start_driver() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void candidate_Recruiter_message_Testcases() throws Exception
	{
		//login
		Obj_Candidate_login=new Candidate_Login_Page(driver);
		Obj_Candidate_login.Candiadte_Login();
		
		Obj_Candidate_Recruiter_Messages=new Candidate_Recruiter_Message_Page(driver);
		Obj_Candidate_Recruiter_Messages.Recruitermessage();
		
		
}
}
