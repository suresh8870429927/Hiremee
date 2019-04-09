package Driver_Started_College_Module;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
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
import Hiremee_College_Module_Testcase.college_assessment_scores_Testcase;
import Hiremee_College_Module_Testcase.college_change_password_Testcase;
import Hiremee_College_Module_Testcase.college_dashboard_Testcase;
import Hiremee_College_Module_Testcase.college_feedback_Tescase;
import Hiremee_College_Module_Testcase.college_login_Testcase;
import Hiremee_College_Module_Testcase.college_profile_Testcase;
import Hiremee_College_Module_Testcase.college_registered_students_details_Testcase;
import Hiremee_College_Module_Testcase.college_registration_Testcase;
import Hiremee_College_Module_Testcase.college_upload_student_details_Testcase;

public class College_Driver_Class 
{
	college_registration_Testcase obj_college_registration_Testcase;
	college_login_Testcase obj_college_login_Testcase;
	college_dashboard_Testcase obj_college_dashboard_Testcase;
	college_profile_Testcase obj_college_profile_Testcase;
	college_upload_student_details_Testcase obj_college_upload_student_details_Testcase;
	college_registered_students_details_Testcase obj_college_registered_students_details_Testcase;
	college_assessment_scores_Testcase obj_college_assessment_scores_Testcase;
	college_change_password_Testcase obj_college_change_password_Testcase;
	college_feedback_Tescase obj_college_feedback_Tescase;

	public static ExtentHtmlReporter smoke_testing;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String Hiremee_college_url;
	public static String Email_id;
	public static String password;
	public static String password_Exam="123456";
	WebDriver driver;
	WebDriverWait wait;
	@BeforeSuite(alwaysRun=true)
	public void startReport(){

		smoke_testing = new ExtentHtmlReporter(System.getProperty("user.dir") +"/Reports/Hiremee_College_Module_Regression_Testing_ExtentReport.html");
		extent = new ExtentReports ();
		extent.attachReporter(smoke_testing);
		extent.setSystemInfo("Host Name", "Regression_Testing");
		extent.setSystemInfo("Environment", "UAT");
		extent.setSystemInfo("User Name", "Automation Tester");
		smoke_testing.config().setDocumentTitle("Hiremee_Web_Portal_UAT_college_module_Regression_Testing");
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
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@Test(priority=0)
	public void College_registration_Testcase() throws Exception
	{
		obj_college_registration_Testcase =new college_registration_Testcase(driver);
		try 
		{
			obj_college_registration_Testcase.college_registration_Testcases();
		}
		catch (Exception e) 
		{
			//throw(e);
		}
	}


	@Test(priority=1)
	public void College_login_Testcase() throws Exception
	{
		obj_college_login_Testcase =new college_login_Testcase(driver);
		try 
		{

			obj_college_login_Testcase.college_login_Testcases();
		}
		catch (Exception e) 
		{
			//throw(e);
		}

	}

	@Test(priority=2)
	public void College_Dashboard_Testcase() throws Exception 
	{
		obj_college_dashboard_Testcase=new college_dashboard_Testcase(driver);
		try
		{
			obj_college_dashboard_Testcase.college_dashboard_testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}


	@Test(priority=3)
	public void College_profile_Testcase() throws Exception
	{
		obj_college_profile_Testcase =new college_profile_Testcase(driver);
		try 
		{
			obj_college_profile_Testcase.College_Profile_testcase();
		}
		catch (Exception e) 
		{
			//throw(e);
		}
	}


	@Test(priority=4)
	public void College_upload_student_details_Testcase() throws Exception
	{
		obj_college_upload_student_details_Testcase =new college_upload_student_details_Testcase(driver);
		try 
		{
			obj_college_upload_student_details_Testcase.college_Upload_Student_Details_Testcases();
		}
		catch (Exception e) 
		{
			//throw(e);

		}
	}


	@Test(priority=5)
	public void college_Assessment_Exam_Center_creation() throws Exception
	{
		obj_college_registered_students_details_Testcase =new college_registered_students_details_Testcase(driver);
		try
		{

			obj_college_registered_students_details_Testcase.College_candidate_assessment_exam_center_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}


	@Test(priority=6)
	public void college_Assessment_Exam_Halticket_Update() throws Exception
	{
		obj_college_registered_students_details_Testcase =new college_registered_students_details_Testcase(driver);
		try
		{

			obj_college_registered_students_details_Testcase.college_candidate_halticket_update_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=7)
	public void college_Assessment_Exam_Candidate() throws Exception
	{
		obj_college_registered_students_details_Testcase =new college_registered_students_details_Testcase(driver);
		try
		{

			obj_college_registered_students_details_Testcase.College_candidate_Assessment_exam_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}


	@Test(priority=8)
	public void College_registered_students_details_Testcase() throws Exception
	{
		obj_college_registered_students_details_Testcase =new college_registered_students_details_Testcase(driver);
		try 
		{
			obj_college_registered_students_details_Testcase.College_Registered_Students_Testcase();
		}
		catch (Exception e) 
		{
			//throw(e);
		}
	}

	@Test(priority=9)
	public void College_assessment_scores_Testcase() throws Exception
	{
		obj_college_assessment_scores_Testcase =new college_assessment_scores_Testcase(driver);
		try 
		{
			obj_college_assessment_scores_Testcase.college_Assessment_Scores();

		}
		catch (Exception e) 
		{
			//throw(e);
		}
	}

	@Test(priority=10)
	public void College_Change_password_Testcase() throws Exception
	{
		obj_college_change_password_Testcase=new college_change_password_Testcase(driver);
		try
		{
			obj_college_change_password_Testcase.college_change_password_Testcases();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}
	@Test(priority=11)
	public void College_feedback_Tescase() throws Exception
	{
		obj_college_feedback_Tescase =new college_feedback_Tescase(driver);
		try 
		{
			obj_college_feedback_Tescase.Collge_Feedback_and_login_Testcase();

		}
		catch (Exception e) 
		{
			//throw(e);
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
		attachment.setPath("./Reports/Hiremee_College_Module_Regression_Testing_ExtentReport.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("Please find the Attachement");
		attachment.setName("Hiremee_Extent_Report");
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("mail.veetechnologies.com");
		email.setSmtpPort(25);
		email.setAuthenticator(new DefaultAuthenticator("irudayaraj.n@veetechnologies.com", "Geri%9r%rREw"));
		email.setSSLOnConnect(true);
		email.setFrom("irudayaraj.n@veetechnologies.com");
		email.setSubject("HireMee_Pro Regression_Testing_Extent_Report");
		email.setMsg("Please find the Attachment for Hiremee Pro College Module Regression Test case Report");
		email.addTo("irudayaraj.n@veetechnologies.com");
		email.addCc("suresh.k@veetechnologies.com");
		email.addCc("arunkumar.a@veetechnologies.com");
		email.addCc("senthilkumar.t@veetechnologies.com");
		email.addCc("udhayakumar.n@veetechnologies.com");
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
