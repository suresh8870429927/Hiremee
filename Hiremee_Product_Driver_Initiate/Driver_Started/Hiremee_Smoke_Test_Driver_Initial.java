
package Driver_Started;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.zeroturnaround.zip.ZipUtil;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
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
import com.sun.mail.handlers.message_rfc822;

import Hiremee_Assessment_UAT_Smoke_Testing.Hiremee_assessment_Testcase;
import Hiremee_College_UAT_smoke_Testing.Hiremee_college_Testcases;
import Hiremee_Company_UAT_smoke_Testing.Hiremee_Company_Testcases;
import Hiremee_Home_jobs_UAT_Smoke_Testing.Hiremee_jobs_Testcase;
import Hiremee_Recruiter_UAT_Smoke_Testing.Hiremee_Recruiter_Testcases;
import Hiremee_candidate_UAT_smoke_Testing.Hiremee_candidate_Testcases;
import Hiremee_cms_UAT_Smoke_Testing.Hiremee_cms_Testcase;
import Hiremee_pro_UAT_Testing.Hiremee_pro_Testcase;
import Property_File.Property_File_Config;
import Screenshot.Utility;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Hiremee_Smoke_Test_Driver_Initial {
	Property_File_Config config;
	Hiremee_candidate_Testcases candidate_main_page;
	Hiremee_college_Testcases college_main_page;
	Hiremee_Company_Testcases company_main_page;
	Hiremee_Recruiter_Testcases Recruiter_main_page;
	Hiremee_assessment_Testcase Assessment_main_page;
	Hiremee_jobs_Testcase obj_Hiremee_jobs_Testcase;
	Hiremee_cms_Testcase obj_Hiremee_cms_Testcase;
	Hiremee_pro_Testcase obj_Hiremee_pro_Testcase;

	public static ExtentHtmlReporter smoke_testing;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String Testcase_ID;
	public static String Expected_Result;
	public static String Start_Date;
	public static String End_Date;
	public static String Pass;
	public static String Fail;
	public static String Skip;
	public static String Total;
	WebDriver driver;
	WebDriverWait wait;
	@BeforeSuite(alwaysRun=true)
	public void startReport() throws Exception{
		config=new Property_File_Config();
		smoke_testing = new ExtentHtmlReporter(System.getProperty("user.dir") +config.getExtent_path());
		extent = new ExtentReports ();
		extent.attachReporter(smoke_testing);
		extent.setSystemInfo("Host Name", "Smoke_Testing");
		extent.setSystemInfo("Environment", "UAT");
		extent.setSystemInfo("User Name", "Automation Tester");
		smoke_testing.config().setDocumentTitle("Hiremee_Web_Portal_UAT_Smoke_Testing");
		smoke_testing.config().setReportName("Hiremee_Execution_Report");		
		smoke_testing.config().setTheme(Theme.DARK);
	}

	@BeforeTest
	public void Start_driver() throws Exception
	{
		config=new Property_File_Config();
		//WebDriverManager.chromedriver().setup();
	
		//Chrome
		System.setProperty("webdriver.chrome.driver",config.getChromeDriver());
		driver = new ChromeDriver();
		
		/*//Firefox
		System.setProperty("webdriver.gecko.driver",config.geFirefoxDriver());
		driver = new FirefoxDriver();*/
		
		Reporter.log(">=============================Hiremee_Project_Driver_Initiated=====================================<",true);

		//Grid_hub_node-start---------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		/*
		//Raj system-client
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		URL url=new URL("http://172.18.1.34:36728/wd/hub");
		 */

/*
		//Suresh System-client
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		URL url=new URL("http://172.18.1.31:45162/wd/hub");

		driver=new RemoteWebDriver(url, cap);
		//Grid_hub_node-end-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
		driver.manage().window().maximize();
		Reporter.log(">=============================Hiremee_Project_Browser_Started=====================================<",true);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	//Candidate Module
	@Test(priority=0)
	public void Hiremee_Automation_candidate_module_Home_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {

			candidate_main_page.candidate_Home_main_page();
		}
		catch(Exception e)
		{
			throw(e);

		}
	}
	
	@Test(priority=1)
	public void Hiremee_Automation_candidate_module_login_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_main_Login();
		}
		catch(Exception e)
		{
			throw(e);

		}
	}

	@Test(priority=2)
	public void Hiremee_Automation_candidate_module_Dashboard_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Dashboard_main();
		}

		catch(Exception e)
		{
			throw(e);

		}	
	}


	@Test(priority=3)
	public void Hiremee_Automation_candidate_module_Myprofile_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_My_Profile_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=4)
	public void Hiremee_Automation_candidate_module_Take_Online_Assessment_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {

			candidate_main_page.candidate_Take_Online_Assessment_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=5)
	public void Hiremee_Automation_candidate_module_Mock_Assessment_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Mock_Assessment_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=6)
	public void Hiremee_Automation_candidate_module_Teke_Mock_Assessment_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Take_Mock_Assessment_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=7)
	public void Hiremee_Automation_candidate_Recruiter_Measage_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Recruiter_Messagge_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=8)
	public void Hiremee_Automation_candidate_Current_openings_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Current_Openings_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=9)
	public void Hiremee_Automation_candidate_Current_walkins_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Current_Walkins_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=10)
	public void Hiremee_Automation_candidate_job_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Jobs_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=11)
	public void Hiremee_Automation_candidate_search_job_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Search_Jobs_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}
	@Test(priority=12)
	public void Hiremee_Automation_candidate_Applied_job_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Applied_Jobs_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}
	@Test(priority=13)
	public void Hiremee_Automation_candidate_Recommended_job_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Recommended_Jobs_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=14)
	public void Hiremee_Automation_candidate_Invite_Friends_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Invite_Friends_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=15)
	public void Hiremee_Automation_candidate_FAQ_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_FAQS_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=16)
	public void Hiremee_Automation_candidate_Feedback_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Feedback_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	@Test(priority=17)
	public void Hiremee_Automation_candidate_Change_Password_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_Change_password_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}

	
	@Test(priority=18)
	public void Hiremee_Automation_candidate_logout_page() throws Exception
	{
		candidate_main_page=new Hiremee_candidate_Testcases(driver);
		try {
			candidate_main_page.candidate_logout_main();
		}
		catch(Exception e)
		{
			throw(e);

		}	
	}
	
	//college module
	@Test(priority=19)
	public void Hiremee_Automation_college_Home_page() throws Exception
	{
		college_main_page=new Hiremee_college_Testcases(driver);

		try {
			college_main_page.college_Home_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	@Test(priority=20)
	public void Hiremee_Automation_college_login_page() throws Exception
	{
		college_main_page=new Hiremee_college_Testcases(driver);
		try {
			college_main_page.college_login_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	@Test(priority=21)
	public void Hiremee_Automation_college_dashboard_page() throws Exception
	{
		college_main_page=new Hiremee_college_Testcases(driver);
		try {
			college_main_page.college_Dashboard_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	@Test(priority=22)
	public void Hiremee_Automation_college_Profile_page() throws Exception
	{
		college_main_page=new Hiremee_college_Testcases(driver);
		try {
			college_main_page.college_Profile_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	@Test(priority=23)	
	public void Hiremee_Automation_college_Registered_Students_page() throws Exception
	{
		college_main_page=new Hiremee_college_Testcases(driver);
		try {

			college_main_page.college_Registered_Students_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	@Test(priority=24)
	public void Hiremee_Automation_college_Upload_Students_page() throws Exception
	{
		college_main_page=new Hiremee_college_Testcases(driver);
		try {

			college_main_page.college_Upload_Students_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	
	@Test(priority=25)
	public void Hiremee_Automation_college_Student_Assessment_Result_page() throws Exception
	{
		college_main_page=new Hiremee_college_Testcases(driver);
		try {
			college_main_page.college_Student_Assessment_Results_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	
	@Test(priority=26)
	public void Hiremee_Automation_college_FAQ_page() throws Exception
	{
		college_main_page=new Hiremee_college_Testcases(driver);
		try {
			college_main_page.college_FAQ_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	
	@Test(priority=27)
	public void Hiremee_Automation_college_Feedback_page() throws Exception
	{
		college_main_page=new Hiremee_college_Testcases(driver);
		try {

			college_main_page.college_Feedback_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	
	@Test(priority=28)
	public void Hiremee_Automation_college_change_Password_page() throws Exception
	{
		college_main_page=new Hiremee_college_Testcases(driver);
		try {
			college_main_page.college_Change_Password_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		
	@Test(priority=29)
	public void Hiremee_Automation_college_Logout_page() throws Exception
	{
		college_main_page=new Hiremee_college_Testcases(driver);
		try {
			college_main_page.college_Logout_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		


	//company-module
	@Test(priority=30)
	public void Hiremee_Automation_company_Home_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Home_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		
	@Test(priority=31)
	public void Hiremee_Automation_company_login_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_login_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		

	@Test(priority=32)
	public void Hiremee_Automation_company_dashboard_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Dashboard_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=33)
	public void Hiremee_Automation_company_Recruiter_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Recruiter_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		
	@Test(priority=34)
	public void Hiremee_Automation_company_Registered_Recruiter_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Registered_Recruiter_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		

	@Test(priority=35)
	public void Hiremee_Automation_company_Invited_Recruiter_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Invited_Recruiter_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		
	@Test(priority=36)
	public void Hiremee_Automation_company_candidate_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=37)
	public void Hiremee_Automation_company_All_candidate_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_All_candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		

	@Test(priority=38)
	public void Hiremee_Automation_company_Shortlisted_candidate_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Shortlisted_candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		
	@Test(priority=39)
	public void Hiremee_Automation_company_Invited_candidate_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Invited_candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		

	@Test(priority=40)
	public void Hiremee_Automation_company_Hired_candidate_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Hired_candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		

	@Test(priority=41)
	public void Hiremee_Automation_company_Job_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Jobs_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		
	@Test(priority=42)
	public void Hiremee_Automation_company_Posted_Job_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Posted_Jobs_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}		

	@Test(priority=43)
	public void Hiremee_Automation_company_Application_Job_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Applications_Jobs_main_page();
		}
		catch(Exception e)
		{
		throw(e);
		}
	}	
	@Test(priority=44)
	public void Hiremee_Automation_company_Post_Job_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Post_Job_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=45)
	public void Hiremee_Automation_company_Search_candidate_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Search_Candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=46)
	public void Hiremee_Automation_company_Email_Template_page() throws Exception
	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Email_Template_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	


	@Test(priority=47)
	public void Hiremee_Automation_company_FAQ_page() throws Exception	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_FAQ_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=48)
	public void Hiremee_Automation_company_Feedback_page() throws Exception	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Feedback_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=49)
	public void Hiremee_Automation_company_Profile_page() throws Exception	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Company_Profile_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=50)
	public void Hiremee_Automation_company_Change_Password_page() throws Exception	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Change_Password_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=51)
	public void Hiremee_Automation_company_Logout_page() throws Exception	{
		company_main_page=new Hiremee_Company_Testcases(driver);
		try {
			company_main_page.company_Logout_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}


	//Recruiter_module
	@Test(priority=52)
	public void Hiremee_Automation_Recruiter_Home_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Home_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=53)
	public void Hiremee_Automation_Recruiter_Login_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_login_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=54)
	public void Hiremee_Automation_Recruiter_Dashboard_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Dashboard_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=55)
	public void Hiremee_Automation_Recruiter_candidate_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=56)
	public void Hiremee_Automation_Recruiter_All_candidate_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_All_Candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	
	@Test(priority=57)
	public void Hiremee_Automation_Recruiter_Shortlisted_candidate_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Shortlisted_Candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=58)
	public void Hiremee_Automation_Recruiter_Invited_candidate_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Invited_Candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=59)
	public void Hiremee_Automation_Recruiter_Hired_candidate_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Hired_Candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=60)
	public void Hiremee_Automation_Recruiter_Jobs_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_jobs_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=61)
	public void Hiremee_Automation_Recruiter_Posted_Jobs_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Posted_jobs_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=62)
	public void Hiremee_Automation_Recruiter_Application_Jobs_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Application_jobs_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=63)
	public void Hiremee_Automation_Recruiter_Post_Jobs_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Post_jobs_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=64)
	public void Hiremee_Automation_Recruiter_Search_candidate_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Search_candidate_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	
	@Test(priority=65)
	public void Hiremee_Automation_Recruiter_Email_Template_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Email_Template_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=66)
	public void Hiremee_Automation_Recruiter_FAQ_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_FAQ_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=67)
	public void Hiremee_Automation_Recruiter_Feedback_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Feedback_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	
	@Test(priority=68)
	public void Hiremee_Automation_Recruiter_Profile_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Profile_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=69)
	public void Hiremee_Automation_Recruiter_Change_Password_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Change_password_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

	@Test(priority=70)
	public void Hiremee_Automation_Recruiter_Logout_page() throws Exception	{
		Recruiter_main_page=new Hiremee_Recruiter_Testcases(driver);
		try {
			Recruiter_main_page.Recruiter_Change_Logout_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}	

/*
	//Assessment_module
	@Test(priority=71)
	public void Hiremee_Assessment_Home_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Home_main_page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
	@Test(priority=72)
	public void Hiremee_Assessment_Login_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_login_page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
	@Test(priority=73)
	public void Hiremee_Assessment_Exam_Center_Master_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Exam_Center_master_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=74)
	public void Hiremee_Assessment_Eassessmnet_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Eassessment_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=75)
	public void Hiremee_Assessment_Eassessmnet_create_exam_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Essessment_create_exam_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=76)
	public void Hiremee_Assessment_Eassessmnet_candidate_feedback_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Essessment_candidate_Feedback_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}


	@Test(priority=77)
	public void Hiremee_Assessment_Reports_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Reports_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
	@Test(priority=78)
	public void Hiremee_Assessment_overall_exam_Reports_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_overall_exam_Reports_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=79)
	public void Hiremee_Assessment_Userwise_exam_Reports_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_userwise_exam_Reports_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=80)
	public void Hiremee_Assessment_AI_Rejection_Reports_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_AI_Rejection_Reports_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=81)
	public void Hiremee_Assessment_Usermanagement_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_User_Management_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
	@Test(priority=82)
	public void Hiremee_Assessment_Usermanagement_usermapping_college_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_User_Management_usermapping_college_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=83)
	public void Hiremee_Assessment_Usermanagement_usermapping_Pooled_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_User_Management_usermapping_Pooled_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=84)
	public void Hiremee_Assessment_Usermanagement_Hallticket_details_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_User_Management_hallticket_details_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=85)
	public void Hiremee_Assessment_Usermanagement_Invigilater_Registration_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_User_Management_Invigilater_Registration_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=86)
	public void Hiremee_Assessment_Autoproctored_Assessment_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Autoproctored_Assessment_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	/*
	@Test(priority=87)
	public void Hiremee_Assessment_Autoproctored_Assessment_Existing_User_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Autoproctored_Assessment_Managing_Existing_user_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
	 */
	/*
	@Test(priority=88)
	public void Hiremee_Assessment_Autoproctored_Assessment_New_User_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Autoproctored_Assessment_Managing_New_user_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=89)
	public void Hiremee_Assessment_Autoproctored_Assessment_Create_Autoproctored_Exam_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Autoproctored_Assessment_Createautoproctored_exam_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
	@Test(priority=90)
	public void Hiremee_Assessment_Autoproctored_Assessment_Incomplete_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Autoproctored_Assessment_Incompelete_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=91)
	public void Hiremee_Assessment_Autoproctored_Assessment_Overall_status_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Autoproctored_Assessment_Overall_ststus_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=92)
	public void Hiremee_Assessment_Autoproctored_Assessment_Candidate_Feedback_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Autoproctored_Assessment_Candidate_Feedback_Page();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=93)
	public void Hiremee_Assessment_Logout_Page() throws Exception
	{
		Assessment_main_page=new Hiremee_assessment_Testcase(driver);
		try {
			Assessment_main_page.Assessment_Logout_Pages();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
	 */
	
	//cms page
	@Test(priority=94)
	public void Hiremee_Cms_Home_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Home_Tescase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=95)
	public void Hiremee_Cms_overall_Login_modal_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_overall_Login_modal_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=96)
	public void Hiremee_Cms_i_am_a_student_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_i_am_a_student_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=97)
	public void Hiremee_Cms_i_am_a_college_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_i_am_a_college_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=98)
	public void Hiremee_Cms_i_am_a_company_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_i_am_a_company_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=99)
	public void Hiremee_Cms_Hiremee_logo_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Hiremee_logo_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=100)
	public void Hiremee_Cms_Hiremee_app_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Hiremee_app_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=120)
	public void Hiremee_Cms_company_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_company_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=121)
	public void Hiremee_Cms_college_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_college_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=122)
	public void Hiremee_Cms_candidate_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_candidate_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=123)
	public void Hiremee_Cms_Events_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Events_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=124)
	public void Hiremee_Cms_Blogs_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Blogs_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=125)
	public void Hiremee_Cms_Media_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Media_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=126)
	public void Hiremee_Cms_Contact_us_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Contact_us_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=127)
	public void Hiremee_Cms_About_us_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_About_us_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=128)
	public void Hiremee_Cms_FAQ_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_FAQ_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=129)
	public void Hiremee_Cms_Sitemap_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Sitemap_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=130)
	public void Hiremee_Cms_Terms_use_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Terms_use_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=131)
	public void Hiremee_Cms_Privacy_policy_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Privacy_policy_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=132)
	public void Hiremee_Cms_Testnomials_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Testnomials_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=133)
	public void Hiremee_Cms_Carieer_quick_link_Testcase() throws Exception 
	{
		obj_Hiremee_cms_Testcase=new Hiremee_cms_Testcase(driver);
		try
		{
			obj_Hiremee_cms_Testcase.Hiremee_cms_Carieer_quick_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	//job posting
	@Test(priority=134)
	public void Hiremee_home_Testcase() throws Exception
	{
		obj_Hiremee_jobs_Testcase=new Hiremee_jobs_Testcase(driver);
		try {
			obj_Hiremee_jobs_Testcase.hiremee_home_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=135)
	public void Hiremee_job_Testcase() throws Exception
	{
		obj_Hiremee_jobs_Testcase=new Hiremee_jobs_Testcase(driver);
		try {
			obj_Hiremee_jobs_Testcase.hiremee_job_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=136)
	public void Hiremee_job_Hiremee_app_link_Testcase() throws Exception
	{
		obj_Hiremee_jobs_Testcase=new Hiremee_jobs_Testcase(driver);
		try {
			obj_Hiremee_jobs_Testcase.hiremee_job_Hiremee_app_link_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=137)
	public void Hiremee_job_View_apply_Testcase() throws Exception
	{
		obj_Hiremee_jobs_Testcase=new Hiremee_jobs_Testcase(driver);
		try {
			obj_Hiremee_jobs_Testcase.hiremee_job_View_apply_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
	@Test(priority=138)
	public void Hiremee_job_Home_Icon_Testcase() throws Exception
	{
		obj_Hiremee_jobs_Testcase=new Hiremee_jobs_Testcase(driver);
		try {
			obj_Hiremee_jobs_Testcase.hiremee_job_Home_Icon_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}

	@Test(priority=139)
	public void Hiremee_job_Jobs_Icon_Tescase() throws Exception
	{
		obj_Hiremee_jobs_Testcase=new Hiremee_jobs_Testcase(driver);
		try {
			obj_Hiremee_jobs_Testcase.hiremee_job_Jobs_Icon_Tescase();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}


	//Hiremee-Pro
	@Test(priority=140)
	public void Hiremee_Web_pro_Home_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Home_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=141)
	public void Hiremee_Web_pro_Login_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Login_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=142)
	public void Hiremee_Web_pro_Dashboard_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Dashboard_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=143)
	public void Hiremee_Web_pro_Purchase_Assessment_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Purchase_Assessment_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=144)
	public void Hiremee_Web_pro_Manage_Assessment_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Manage_Assessment_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=145)
	public void Hiremee_Web_pro_Manage_Assessment_manage_pools_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Manage_Assessment_manage_pools_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=146)
	public void Hiremee_Web_pro_Manage_Assessment_manage_Questions_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Manage_Assessment_manage_Questions_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=147)
	public void Hiremee_Web_pro_Manage_Assessment_my_Questions_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Manage_Assessment_My_Questions_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=148)
	public void Hiremee_Web_pro_Manage_Assessment_myot_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Manage_Assessment_MYOT_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=149)
	public void Hiremee_Web_pro_Book_Assessment_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Book_Assessment_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=150)
	public void Hiremee_Web_pro_Book_Assessment_Upload_candidates_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Book_Assessment_upload_Candidates_Testcase();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	@Test(priority=151)
	public void Hiremee_Web_pro_Manage_candidates_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Manage_Candidates_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=152)
	public void Hiremee_Web_pro_Manage_candidates_invite_pendings_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {
			obj_Hiremee_pro_Testcase.Hiremee_PRO_Mnage_Candidates_Invite_pendings_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=153)
	public void Hiremee_Web_pro_Manage_candidates_invite_sends_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {

			obj_Hiremee_pro_Testcase.Hiremee_PRO_Manage_Candidates_Invite_Send_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=154)
	public void Hiremee_Web_pro_Manage_candidates_Test_started_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {

			obj_Hiremee_pro_Testcase.Hiremee_PRO_Mnage_Candidates_Test_Started_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=155)
	public void Hiremee_Web_pro_Manage_candidates_Test_Expired_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {

			obj_Hiremee_pro_Testcase.Hiremee_PRO_Mnage_Candidates_Test_Expired_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=156)
	public void Hiremee_Web_pro_Vew_Result_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {

			obj_Hiremee_pro_Testcase.Hiremee_PRO_View_Result_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=157)
	public void Hiremee_Web_pro_Logout_Testcase() throws Exception
	{
		obj_Hiremee_pro_Testcase=new Hiremee_pro_Testcase(driver);
		try {

			obj_Hiremee_pro_Testcase.Hiremee_PRO_logout_Testcase();
		}
		catch(Exception e)
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
			String Screenshotpath=Utility.getScreenhot(driver, result.getName());
			logger.fail("Failed_Screenshots", MediaEntityBuilder.createScreenCaptureFromPath(Screenshotpath).build());
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
			logger.log(Status.PASS, MarkupHelper.createLabel("TestCase_ID : " + Testcase_ID , ExtentColor.BLUE));
			logger.log(Status.PASS, MarkupHelper.createLabel("Expected_Result : "+Expected_Result, ExtentColor.ORANGE));
		}

		else if(result.getStatus() == ITestResult.SKIP)
		{
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case Skipped", ExtentColor.YELLOW));
		}

	}
	@AfterTest
	public void driver_close() {
		driver.quit();
		Reporter.log(">=============================Hiremee_Project_Driver_End=====================================<",true);
	}
	@AfterSuite()
	public void teardown() throws Exception
	{
		//extent.flush();
		Thread.sleep(50000);
		//Count  for pass or fail of skip
		config=new Property_File_Config();
		File xmlFile = new File(config.getxmlpath());
		DocumentBuilderFactory docbuildFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docbuildFactory.newDocumentBuilder();
		Document document = docBuilder.parse(xmlFile);
		document.getDocumentElement().normalize();
		NodeList nodeList1 = document.getElementsByTagName("suite");
		for (int i = 0; i < nodeList1.getLength(); i++) {

			Node node = nodeList1.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {

				Element element = (Element) node;
				Start_Date=element.getAttribute("started-at");
				End_Date=element.getAttribute("finished-at");
			}
		}
		NodeList nodeList = document.getElementsByTagName("testng-results");
		for (int i = 0; i < nodeList.getLength(); i++) {

			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {

				Element element = (Element) node;
				Pass=element.getAttribute("passed");
				Fail=element.getAttribute("failed");
				Skip=element.getAttribute("skipped");
				Total=String.valueOf((Integer.parseInt(Pass)+Integer.parseInt(Fail))+Integer.parseInt(Skip));
			}
		}
		// Create object of Property file
		//ZipUtil.pack(new File("./test-output/"), new File("./HireMee_Pro_Smoke_Report.zip"));
		ImageHtmlEmail email = new ImageHtmlEmail();
		String htmlEmailTemplate = ( //"<img src=\"http://172.18.1.87:81/assets/home/images/hiremee-logo.png\"> "+
				"            <center > <table width=\"600\" style=\"width:600px\">\r\n" +
				"            <tbody>\r\n" +
				"                <tr height=\"101\" style=\"padding-top:24px;padding-bottom:24px\">\r\n" +
				"                    <td width=\"50%\" style=\"width:50%;padding:0\"><img src=\"http://172.18.1.87:81/assets/home/images/hiremee-logo.png\"\r\n" +
				"                            alt=\"HirMee\" /></td>\r\n" +
				"                    <td width=\"50%\" valign=\"middle\" style=\"width:50%;vertical-align:middle;padding:0\">\r\n" +
				"                        <h2 style=\"margin:0;font-size:18px;color:#04a0dc;text-align:right\">Test Suite Execution Report</h2>\r\n" +
				"                    </td>\r\n" +
				"                </tr>\r\n" +
				"                <tr style=\"background-color:#fff;align=center\">\r\n" +
				"                    <td style=\"border:1px solid #dddee1;padding:24px;word-break:break-word;word-wrap:break-word\" colspan=\"2\">\r\n" +
				"                       <p>Dear Team,<br><br>HireMee Smoke test suite has been scuessfully Completed . Here is the summary report.</p>\r\n" +
				"                        <table class=\"border\" width=\"400\" border=\"1\" bgcolor=\"#f5f7fa\" style=\"width:100%;background-color:#f5f7fa;border:1px solid #dddee1\">\r\n" +
				"                            <tbody>\r\n" +
				"                            <tr>\r\n" +
				"                                <tr> <td colspan=\"8\" align=\"center\">Automation_Testing_Report</td></tr>\r\n"+
				"                                <tr> <td>Project Name</td>"+"<td colspan=\"8\">"+"HireMee Pro Web"+"</td></tr>\r\n"+
				"                                <tr> <td>Test Suite</td>"+"<td colspan=\"8\">"+"Smoke_Test"+"</td></tr>\r\n"+
				"                                <tr> <td>Browser</td>"+"<td colspan=\"8\">"+"Chrome_Browser"+"</td></tr>\r\n"+
				// "                                <tr> <td>Started Date</td>"+"<td colspan=\"8\">"+Start_Date+"</td></tr>\r\n"+
				"                               <tr> <td>Started Date</td>"+"<td colspan=\"8\">"+Start_Date+"</td></tr>\r\n"+
				"                                <tr> <td>End Date</td>"+"<td colspan=\"8\">"+End_Date+"</td></tr>\r\n"+
				// "                                <tr> <td>Total Duration</td>"+"<td colspan=\"8\">"+Start_Date+"</td></tr>\r\n"+
				"                                <tr> <td width=\"20%\">Result</td>"+"<td width=\"10%\" style=\"color:Green\">Pass : "+Pass+"</td>" +
				"                                <td width=\"10%\" style=\"color:red\">Fail : "+Fail+"</td>"+
				"                                <td width=\"10%\" style=\"color:blue\">Skip : "+Skip+"</td>" +
				"                                <td width=\"10%\" style=\"color:blue\">Total : "+Total+"</td></tr>\r\n" +
				"                                </tr>\r\n" +
				"                            </tbody>\r\n" +
				"                        </table>\r\n" +
				"                        <p>Kindly find the below attachement for your Reference \r\n" +
				"                        <br>\r\n" +
				"                        <br>This email was sent automatically by Automation Team.<br><br>Thanks,<br>Automation Team</p>\r\n" +
				"                    </td>\r\n" +
				"                </tr>\r\n" +
				"            </tbody>\r\n" +
				"        </table>\r\n" +
				"    </center>");
		URL url = new URL("http://172.18.1.87:81/");
		email.setDataSourceResolver(new DataSourceUrlResolver(url));
		email.setHostName("mail.veetechnologies.com");
		email.setSmtpPort(25);
		email.setAuthenticator(new DefaultAuthenticator("irudayaraj.n@veetechnologies.com", "Geri%9r%rREw"));
		email.setSSLOnConnect(true);
		email.setFrom("irudayaraj.n@veetechnologies.com");
		email.setSubject("HireMee_mail _Pro_Live_Smoke_Testing_Extent_Report");
		email.addTo("irudayaraj.n@veetechnologies.com");
		email.addCc("suresh.k@veetechnologies.com");
		email.addCc("arunkumar.a@veetechnologies.com");
		email.addCc("udhayakumar.n@veetechnologies.com");
		email.addCc("senthilkumar.t@veetechnologies.com");
		//mail attachement
		EmailAttachment attachment = new EmailAttachment();
		//attachment.setPath("./HireMee_Pro_Smoke_Report.zip");
		attachment.setPath("./Reports/Hiremee_Smoke_Testing_ExtentReport.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		email.attach(attachment);
		email.setHtmlMsg(htmlEmailTemplate);
		email.send();
		System.out.println("Mail Send Sucessfully");
	} 


	public static void ExplicitWait(WebDriver driver,WebElement locater) throws Exception
	{	

		(new WebDriverWait(driver,30)).until(ExpectedConditions
				.elementToBeClickable(locater));

	}
	public static void Drawborder(WebElement element,WebDriver driver) throws Exception
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void Exceptionalert(String message,WebDriver driver) throws Exception
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
	}	
}