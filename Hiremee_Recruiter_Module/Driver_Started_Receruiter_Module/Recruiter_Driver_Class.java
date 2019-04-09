package Driver_Started_Receruiter_Module;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import Excel_Sheet_config.Screenshot;
import Hiremee_Recruiter_Module_Testcase.recruiter_All_shortlisted_candidate_Testcase;
import Hiremee_Recruiter_Module_Testcase.recruiter_Search_Candidate_Testcase;
import Hiremee_Recruiter_Module_Testcase.recruiter_change_password_Testcase;
import Hiremee_Recruiter_Module_Testcase.recruiter_dashboard_Testcase;
import Hiremee_Recruiter_Module_Testcase.recruiter_email_template_Testcase;
import Hiremee_Recruiter_Module_Testcase.recruiter_feedback_TestCase;
import Hiremee_Recruiter_Module_Testcase.recruiter_login_Testcase;
import Hiremee_Recruiter_Module_Testcase.recruiter_posted_a_job_Testcase;

public class Recruiter_Driver_Class {

	recruiter_login_Testcase obj_recruiter_login_Testcase;
	recruiter_dashboard_Testcase obj_recruiter_dashboard_Testcase;
	recruiter_posted_a_job_Testcase obj_recruiter_posted_a_job_Testcase;
	recruiter_Search_Candidate_Testcase obj_recruiter_Search_Candidate_Testcase;
	recruiter_All_shortlisted_candidate_Testcase obj_recruiter_All_shortlisted_candidate_Testcase;
	recruiter_email_template_Testcase obj_recruiter_email_template_Testcase;
	recruiter_change_password_Testcase obj_recruiter_change_password_Testcase;
	recruiter_feedback_TestCase obj_recruiter_feedback_TestCase;

	public static ExtentHtmlReporter smoke_testing;
	public static ExtentReports extent;
	public static ExtentTest logger;
	WebDriver driver;
	WebDriverWait wait;
	@BeforeSuite(alwaysRun=true)
	public void startReport(){

		smoke_testing = new ExtentHtmlReporter(System.getProperty("user.dir") +"/Reports/Hiremee_Recruiter_Module_Regression_Testing_ExtentReport.html");
		extent = new ExtentReports ();
		extent.attachReporter(smoke_testing);
		extent.setSystemInfo("Host Name", "Regression_Testing");
		extent.setSystemInfo("Environment", "UAT");
		extent.setSystemInfo("User Name", "Automation Tester");
		smoke_testing.config().setDocumentTitle("Hiremee_Web_Portal_UAT_recruiter_module_Regression_Testing");
		smoke_testing.config().setReportName("Hiremee_Execution_Report");		
		smoke_testing.config().setTheme(Theme.DARK);
	}

	@BeforeTest
	public void Start_driver() throws Exception
	{

		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//driver = new ChromeDriver();

		//Grid_hub_node-start---------------------------------------------------------------------------------------------------------------------------------------------------------------------
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		URL url=new URL("http://172.18.1.34:31154/wd/hub");
		driver=new RemoteWebDriver(url, cap);
		//Grid_hub_node-end-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@Test(priority=0)
	public void Recruiter_login_Testcase() throws Exception
	{	
		obj_recruiter_login_Testcase=new recruiter_login_Testcase(driver);
		try 
		{
			obj_recruiter_login_Testcase.company_login_Testcase();
		}
		catch (Exception e) 
		{
			throw(e);
		}

	}

	@Test(priority=1)
	public void Recruiter_dashboard_Testcase() throws Exception
	{
		obj_recruiter_dashboard_Testcase =new recruiter_dashboard_Testcase(driver);
		try 
		{
			obj_recruiter_dashboard_Testcase.Recruiter_dashboard();
		}
		catch (Exception e) 
		{
			throw(e);
		}
	}


	@Test(priority=2)
	public void Recreuiter_Post_a_job_Testcase() throws Exception
	{
		obj_recruiter_posted_a_job_Testcase =new recruiter_posted_a_job_Testcase(driver);
		try 
		{
			obj_recruiter_posted_a_job_Testcase.Recruiter_Post_a_job();
		}
		catch (Exception e) 
		{
			throw(e);
		}
	}


	@Test(priority=3)
	public void Recruiter_Search_Candidate_Testcase() throws Exception
	{
		obj_recruiter_Search_Candidate_Testcase =new recruiter_Search_Candidate_Testcase(driver);
		try 
		{
			obj_recruiter_Search_Candidate_Testcase.Recruiter_Search_Candidate();

		}
		catch (Exception e) 
		{
			throw(e);
		}
	}

	@Test(priority=4)
	public void Recruiter_email_template_Testcase() throws Exception
	{
		obj_recruiter_email_template_Testcase =new recruiter_email_template_Testcase(driver);
		try 
		{
			obj_recruiter_email_template_Testcase.Company_Email_Candidate();

		}
		catch (Exception e) 
		{
			throw(e);
		}
	}

	@Test(priority=5)
	public void Recruiter_All_shortlisted_candidate_Testcase() throws Exception
	{
		obj_recruiter_All_shortlisted_candidate_Testcase =new recruiter_All_shortlisted_candidate_Testcase(driver);
		try 
		{
			obj_recruiter_All_shortlisted_candidate_Testcase.Company_Shortlisted_Candidate();

		}
		catch (Exception e) 
		{
			throw(e);
		}
	}

	@Test(priority=6)
	public void Recruiter_changepassword_Testcase() throws Exception
	{
		obj_recruiter_change_password_Testcase=new recruiter_change_password_Testcase(driver);
		try
		{
			obj_recruiter_change_password_Testcase.recruiter_change_password_testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}


	@Test(priority=7)
	public void Recruiter_feedback_TestCase() throws Exception
	{
		obj_recruiter_feedback_TestCase =new recruiter_feedback_TestCase(driver);
		try 
		{
			obj_recruiter_feedback_TestCase.Recruiter_Feedback_and_Logout();

		}
		catch (Exception e) 
		{
			throw(e);
		}
	}


	@AfterMethod
	public void getResult(ITestResult result) throws Exception
	{
		if(result.getStatus() == ITestResult.FAILURE){
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable().getMessage() + " - Test Case Failed", ExtentColor.RED));
			String Screenshotpath=Screenshot.getScreenhot(driver, result.getName());
			logger.fail("Failed_Screenshots", MediaEntityBuilder.createScreenCaptureFromPath(Screenshotpath).build());
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		}

		else if(result.getStatus() == ITestResult.SKIP)
		{
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case Skipped", ExtentColor.YELLOW));
		}

	}

	@AfterTest
	public void driver_close()
	{
		driver.quit();
	}
	@AfterSuite()
	public void teardown() throws Exception
	{
		extent.flush();
		Thread.sleep(5000);
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("./Reports/Hiremee_Recruiter_Module_Regression_Testing_ExtentReport.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("Please find the Attachement");
		attachment.setName("Hiremee_Pro_Extent_Report");
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("mail.veetechnologies.com");
		email.setSmtpPort(25);
		email.setAuthenticator(new DefaultAuthenticator("irudayaraj.n@veetechnologies.com", "Geri%9r%rREw"));
		email.setSSLOnConnect(true);
		email.setFrom("irudayaraj.n@veetechnologies.com");
		email.setSubject("HireMee_Pro_Regression_Testing_Extent_Report");
		email.setMsg("Please find the Attachment for Hiremee Pro Recruiter Regression Test case report");
		email.addTo("irudayaraj.n@veetechnologies.com");
		email.addCc("suresh.k@veetechnologies.com");
		email.addCc("arunkumar.a@veetechnologies.com");
		email.addCc("senthilkumar.t@veetechnologies.com");
		email.attach(attachment);
		email.send();
		System.out.println("Mail Send Sucessfully");

	}

	public static void ExplicitWait(WebDriver driver,WebElement locater) throws Exception
	{	

		(new WebDriverWait(driver,30)).until(ExpectedConditions
				.elementToBeClickable(locater));

	}



}
