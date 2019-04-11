package Driver_Started_Company_Module;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
import Hiremee_Company_Module_Testcases.Company_Pro_Manage_Candidate_Testcase;
import Hiremee_Company_Module_Testcases.company_All_shortlisted_candidate_Testcase;
import Hiremee_Company_Module_Testcases.company_Login_Testcase;
import Hiremee_Company_Module_Testcases.company_Registration_Testcase;
import Hiremee_Company_Module_Testcases.company_Search_Candidate_Testcase;
import Hiremee_Company_Module_Testcases.company_change_password_Testcase;
import Hiremee_Company_Module_Testcases.company_dashboard_Testcase;
import Hiremee_Company_Module_Testcases.company_email_template_Testcase;
import Hiremee_Company_Module_Testcases.company_feedback_TestCase;
import Hiremee_Company_Module_Testcases.company_posted_a_job_Testcase;
import Hiremee_Company_Module_Testcases.company_pro_manage_assessment_Testcase;
import Hiremee_Company_Module_Testcases.company_pro_manage_book_assessment_Testcase;
import Hiremee_Company_Module_Testcases.company_pro_upgrade_Testcase;
import Hiremee_Company_Module_Testcases.company_recruiters_Testcase;

public class Driver_Class 
{
	company_Registration_Testcase obj_company_registration_Testcase;
	company_Login_Testcase obj_Company_Login_Testcase;
	company_pro_upgrade_Testcase obj_company_pro_upgrade_Testcase;
	company_dashboard_Testcase obj_company_dashboard_Testcase;
	company_recruiters_Testcase obj_company_recruiters_Testcase;
	company_Search_Candidate_Testcase obj_company_Search_Candidate_Testcase;
	company_posted_a_job_Testcase obj_company_posted_a_job_Testcase;
	company_All_shortlisted_candidate_Testcase obj_company_All_shortlisted_candidate_Testcase;
	company_email_template_Testcase obj_company_email_template_Testcase;
	company_pro_manage_assessment_Testcase obj_company_pro_manage_assessment_Testcase;
	company_pro_manage_book_assessment_Testcase obj_company_pro_manage_book_assessment_Testcase;
	Company_Pro_Manage_Candidate_Testcase obj_Company_Pro_Manage_Candidate_Testcase;
	company_change_password_Testcase obj_company_change_password_Testcase;
	company_feedback_TestCase obj_company_feedback_TestCase;

	public static ExtentHtmlReporter smoke_testing;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String Recruiter_Email_id;
	public static String Recruiter_Passs="Temp!123";
	WebDriver driver;
	WebDriverWait wait;
	@BeforeSuite(alwaysRun=true)
	public void startReport(){

		smoke_testing = new ExtentHtmlReporter(System.getProperty("user.dir") +"/Reports/Hiremee_Comapany_Module_Regression_Testing_ExtentReport.html");
		extent = new ExtentReports ();
		extent.attachReporter(smoke_testing);
		extent.setSystemInfo("Host Name", "Regression_Testing");
		extent.setSystemInfo("Environment", "UAT");
		extent.setSystemInfo("User Name", "Automation Tester");
		smoke_testing.config().setDocumentTitle("Hiremee_Web_Portal_UAT_company_module_Regression_Testing");		
		smoke_testing.config().setReportName("Hiremee_Execution_Report");		
		smoke_testing.config().setTheme(Theme.DARK);
	}

	@BeforeTest
	public void Start_driver() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
	
		/*
		//Grid_hub_node-start---------------------------------------------------------------------------------------------------------------------------------------------------------------------
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		URL url=new URL("http://172.18.1.34:31154/wd/hub");
		driver=new RemoteWebDriver(url, cap);
		//Grid_hub_node-end-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@Test(priority=0)
	public void Company_Registration_Testcase() throws Exception
	{
		obj_company_registration_Testcase =new company_Registration_Testcase(driver);
		try 
		{
			obj_company_registration_Testcase.company_registration();
		}
		catch (Exception e) 
		{
			throw(e);
		}

	}
	 
	@Test(priority=1)
	public void Company_Login_Testcase() throws Exception
	{
		obj_Company_Login_Testcase =new company_Login_Testcase(driver);
		try 
		{
			obj_Company_Login_Testcase.company_login_Testcase();
		}
		catch (Exception e) 
		{
			throw(e);
		}
	}
	
	@Test(priority=2)
	public void company_pro_Testcases() throws Exception
	{
		obj_company_pro_upgrade_Testcase=new company_pro_upgrade_Testcase(driver);
		try
		{
			obj_company_pro_upgrade_Testcase.company_pro_testcase();
			
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
		
	
	@Test(priority=3)
	public void Company_dashboard_Testcase() throws Exception
	{
		obj_company_dashboard_Testcase =new company_dashboard_Testcase(driver);
		try 
		{
			obj_company_dashboard_Testcase.Company_dashboard();
		}
		catch (Exception e) 
		{
			throw(e);
		}
	}
	
	@Test(priority=4)
	public void Company_recruiters_Testcase() throws Exception
	{
		obj_company_recruiters_Testcase =new company_recruiters_Testcase(driver);
		try 
		{
			obj_company_recruiters_Testcase.Company_Recruiters();

		}
		catch (Exception e) 
		{
			throw(e);
		}
	}


	@Test(priority=5)
	public void Company_posted_a_job_Testcase() throws Exception
	{
		obj_company_posted_a_job_Testcase =new company_posted_a_job_Testcase(driver);
		try 
		{
			obj_company_posted_a_job_Testcase.Company_Post_a_new_job();

		}
		catch (Exception e) 
		{
			throw(e);
		}
	}


	@Test(priority=6)
	public void Company_Search_Candidate_Testcase() throws Exception
	{
		obj_company_Search_Candidate_Testcase =new company_Search_Candidate_Testcase(driver);
		try 
		{
			obj_company_Search_Candidate_Testcase.Company_Search_Candidate();

		}
		catch (Exception e) 
		{
			throw(e);
		}
	}


	@Test(priority=7)
	public void Company_email_template_Testcase() throws Exception
	{
		obj_company_email_template_Testcase =new company_email_template_Testcase(driver);
		try 
		{
			obj_company_email_template_Testcase.Company_Email_Candidate();

		}
		catch (Exception e) 
		{
			throw(e);
		}
	}


	@Test(priority=8)
	public void Company_All_shortlisted_candidate_Testcase() throws Exception
	{

		obj_company_All_shortlisted_candidate_Testcase =new company_All_shortlisted_candidate_Testcase(driver);
		try 
		{
			obj_company_All_shortlisted_candidate_Testcase.Company_Shortlisted_Candidate();

		}
		catch (Exception e) 
		{
			throw(e);
		}
	}
	
	@Test(priority=9)
	public void Manage_Assessment() throws Exception
	{
		obj_company_pro_manage_assessment_Testcase=new company_pro_manage_assessment_Testcase(driver);
		try
		{
			obj_company_pro_manage_assessment_Testcase.Company_manage_assessment_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=10)
	public void Manage_Book_Assessment() throws Exception
	{
		obj_company_pro_manage_book_assessment_Testcase=new company_pro_manage_book_assessment_Testcase(driver);
		try
		{
			obj_company_pro_manage_book_assessment_Testcase.company_pro_book_assess_Testcase();

		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	 

	@Test(priority=11)
	public void Manage_Candidate_Testcases() throws Exception
	{
		obj_Company_Pro_Manage_Candidate_Testcase=new Company_Pro_Manage_Candidate_Testcase(driver);
		try
		{
			obj_Company_Pro_Manage_Candidate_Testcase.Manage_candidate_Test();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	
	@Test(priority=12)
	public void Company_change_password_Testcase() throws Exception
	{
		obj_company_change_password_Testcase=new company_change_password_Testcase(driver);
		try
		{
			obj_company_change_password_Testcase.company_changepassword_testcase();

		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=13)
	public void Company_feedback_TestCase() throws Exception
	{
		obj_company_feedback_TestCase =new company_feedback_TestCase(driver);
		try 
		{
			obj_company_feedback_TestCase.Company_Feedback_and_logout();

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
		//driver.quit();
		try {
			FileUtils.deleteDirectory(new File("C:\\Users\\SURV2E~1\\AppData\\Local\\Temp"));
		}
		catch(IOException e) {
			System.err.println("An IOException was caught by Arunn :"+e.getMessage());
		}
	}

	@AfterSuite()
	public void teardown() throws Exception
	{
		extent.flush();
		Thread.sleep(5000);
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("./Reports/Hiremee_Comapany_Module_Regression_Testing_ExtentReport.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("Please find the Attachement");
		attachment.setName("Hiremee_Pro_Regression_Extent_Report");

		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("mail.veetechnologies.com");
		email.setSmtpPort(25);
		email.setAuthenticator(new DefaultAuthenticator("irudayaraj.n@veetechnologies.com", "Geri%9r%rREw"));
		email.setSSLOnConnect(true);
		email.setFrom("irudayaraj.n@veetechnologies.com");
		email.setSubject("HireMee_Pro_Regression_Testing_Extent_Report");
		email.setMsg("Please find the Attachment for Hiremee Pro Company Module Regression Test case Report");
		email.addTo("irudayaraj.n@veetechnologies.com");
		email.addTo("suresh.k@veetechnologies.com");
		email.addTo("arunkumar.a@veetechnologies.com");
		email.addTo("udhayakumar.n@veetechnologies.com");
		email.addCc("senthilkumar.t@veetechnologies.com");
		email.attach(attachment);
		//email.send();
		System.out.println("Mail Send Sucessfully");

	}

	public static void ExplicitWait(WebDriver driver,WebElement locater) throws Exception
	{	

		(new WebDriverWait(driver,30)).until(ExpectedConditions
				.elementToBeClickable(locater));

	}



}
