package Driver_Started_Candidate_Module;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;
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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import Excel_Sheet_config.Screenshot;
import Hiremee_Candidate_TestCase.candidate_Myprofile_Testcase;
import Hiremee_Candidate_TestCase.candidate_applied_Testcase;
import Hiremee_Candidate_TestCase.candidate_change_password_Testcase;
import Hiremee_Candidate_TestCase.candidate_current_opennings_Testcase;
import Hiremee_Candidate_TestCase.candidate_current_walkins_Tescase;
import Hiremee_Candidate_TestCase.candidate_feedback_and_logout_Testcase;
import Hiremee_Candidate_TestCase.candidate_invite_friends_Testcase;
import Hiremee_Candidate_TestCase.candidate_login_Testcase;
import Hiremee_Candidate_TestCase.candidate_mock_assessment_Testcase;
import Hiremee_Candidate_TestCase.candidate_pooled_campus_registration_Testcase;
import Hiremee_Candidate_TestCase.candidate_search_jobs_Testcase;
import Hiremee_Candidate_TestCase.candidate_take_online_assessment_Testcase;

public class Candidate_Driver_Class {

	candidate_pooled_campus_registration_Testcase obj_candidate_pooled_campus_registration_Testcase;
	candidate_login_Testcase obj_candidate_login_Testcase;
	candidate_Myprofile_Testcase obj_candidate_Myprofile_Testcase;
	candidate_take_online_assessment_Testcase obj_candidate_take_online_assessment_Testcase;
	candidate_mock_assessment_Testcase obj_candidate_mock_assessment_Testcase;
	candidate_current_opennings_Testcase obj_candidate_current_opennings_Testcase;
	candidate_current_walkins_Tescase obj_candidate_current_walkins_Tescase;
	candidate_search_jobs_Testcase obj_candidate_search_jobs_Testcase;
	candidate_applied_Testcase obj_candidate_applied_Testcase;
	candidate_invite_friends_Testcase obj_candidate_invite_friends_Testcase;
	candidate_change_password_Testcase obj_candidate_change_password_Testcase;
	candidate_feedback_and_logout_Testcase obj_candidate_feedback_and_logout_Testcase;

	public static ExtentHtmlReporter Regression_testing;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String Exam_center;
	public static String Hiremee_id;
	public static String password;
	
	public static String Start_Date;
	public static String End_Date;
	public static String Pass;
	public static String Fail;
	public static String Skip;
	public static String Total;
	WebDriver driver;
	WebDriverWait wait;
	@BeforeSuite(alwaysRun=true)
	public void startReport(){

		Regression_testing = new ExtentHtmlReporter(System.getProperty("user.dir") +"/Reports/Hiremee_Candidate_Module_Regression_Testing_ExtentReport.html");
		extent = new ExtentReports ();
		extent.attachReporter(Regression_testing);
		extent.setSystemInfo("Host Name", "Regression_Testing");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "Automation Tester");
		Regression_testing.config().setDocumentTitle("Hiremee_Web_Portal_QA_Cycle-2_candidate_module_Regression_Testing");
		Regression_testing.config().setReportName("Hiremee_Execution_Report");		
		Regression_testing.config().setTheme(Theme.DARK);
	}

	@BeforeTest
	public void Start_driver() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@Test(priority=0)
	public void Candidate_Assessment_Exam_Center_Testcase() throws Exception
	{

		obj_candidate_pooled_campus_registration_Testcase =new candidate_pooled_campus_registration_Testcase(driver);
		try 
		{
			obj_candidate_pooled_campus_registration_Testcase.Candidate_Assessment_Exam_Center_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=1)
	public void Candidate_pooled_campus_registration_Testcase() throws Exception
	{
		obj_candidate_pooled_campus_registration_Testcase =new candidate_pooled_campus_registration_Testcase(driver);
		try
		{
			obj_candidate_pooled_campus_registration_Testcase.Candidate_Pooled_campus_registration_Testcase();
		}
		catch (Exception e) 
		{
			//throw(e);

		}
	}

	@Test(priority=2)
	public void Candidate_Assessment_Usermapping_Testcase() throws Exception
	{
		obj_candidate_pooled_campus_registration_Testcase =new candidate_pooled_campus_registration_Testcase(driver);
		try
		{
			obj_candidate_pooled_campus_registration_Testcase.Candidate_Assessment_user_mapping();

		}
		catch (Exception e) 
		{
			//throw(e);

		}
	}

	@Test(priority=3)
	public void Candidate_Assessment_Exam_Testcase() throws Exception
	{
		obj_candidate_pooled_campus_registration_Testcase =new candidate_pooled_campus_registration_Testcase(driver);
		try
		{
			obj_candidate_pooled_campus_registration_Testcase.Candidate_Assesment_Exam();
		}
		catch (Exception e) 
		{
			//throw(e);

		}
	}


	@Test(priority=4)
	public void Candidate_login_Testcase() throws Exception
	{
		obj_candidate_login_Testcase =new candidate_login_Testcase(driver);
		try 
		{
			obj_candidate_login_Testcase.candidate_login_Testcases();
		}
		catch (Exception e) 
		{
			//throw(e);
		}

	}


	@Test(priority=5)
	public void Candidate_Myprofile_Testcase() throws Exception
	{
		obj_candidate_Myprofile_Testcase =new candidate_Myprofile_Testcase(driver);
		try 
		{
			obj_candidate_Myprofile_Testcase.candidate_Myprofile_Testcases();
		}
		catch (Exception e) 
		{
			//throw(e);
		}
	}	

	@Test(priority=6)
	public void Candidate_Takeonline_Assessment_Testcase() throws Exception
	{
		obj_candidate_take_online_assessment_Testcase=new candidate_take_online_assessment_Testcase(driver);
		try
		{
			obj_candidate_take_online_assessment_Testcase.candidate_Take_Online_Assessmnet_Testcases();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=7)
	public void Candidate_Mock_assessment_testcase() throws Exception
	{
		obj_candidate_mock_assessment_Testcase=new candidate_mock_assessment_Testcase(driver);
		try
		{
			obj_candidate_mock_assessment_Testcase.candidate_Mock_Assessmnet_Testcases();

		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=8)
	public void Candidate_Current_openings_testcase() throws Exception
	{
		obj_candidate_current_opennings_Testcase=new candidate_current_opennings_Testcase(driver);
		try
		{
			obj_candidate_current_opennings_Testcase.Candidate_Current_Openings_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}


	@Test(priority=9)
	public void Candidate_Current_Walkins_testcase() throws Exception
	{
		obj_candidate_current_walkins_Tescase=new candidate_current_walkins_Tescase(driver);
		try
		{
			obj_candidate_current_walkins_Tescase.Candidate_Current_Walkins_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=10)
	public void Candidate_Search_jobs_testcase() throws Exception
	{
		obj_candidate_search_jobs_Testcase=new candidate_search_jobs_Testcase(driver);
		try
		{
			obj_candidate_search_jobs_Testcase.Candidate_Search_jobs_Testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}


	/*@Test(priority=11)
	public void Candidate_Applied_jobs_testcase() throws Exception
	{
		obj_candidate_applied_Testcase=new candidate_applied_Testcase(driver);
		try
		{
			obj_candidate_applied_Testcase.Applied_jobs();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}*/

	@Test(priority=12)
	public void Candidate_Invite_friends_testcase() throws Exception
	{
		obj_candidate_invite_friends_Testcase=new candidate_invite_friends_Testcase(driver);
		try
		{
			obj_candidate_invite_friends_Testcase.Invite_friends_testcase();
		}

		catch(Exception e)
		{
			//throw(e);
		}
	}


	@Test(priority=13)
	public void Candidate_feedback_and_logout_Testcase() throws Exception
	{
		obj_candidate_feedback_and_logout_Testcase=new candidate_feedback_and_logout_Testcase(driver);
		try
		{
			obj_candidate_feedback_and_logout_Testcase.candi_feedback_and_logout_testcase();
		}
		catch(Exception e)
		{
			//throw(e);
		}
	}

	@Test(priority=14)
	public void Candidate_Change_Password_testcase() throws Exception
	{
		obj_candidate_change_password_Testcase=new candidate_change_password_Testcase(driver);
		try
		{
			obj_candidate_change_password_Testcase.change_password_Testcase();

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
		Thread.sleep(1000);
		//Count  for pass or fail of skip
		File xmlFile = new File("./test-output/testng-results.xml");
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
				"                       <p>Dear Team,<br><br>HireMee Regression test suite has been scuessfully Completed . Here is the summary report.</p>\r\n" +
				"                        <table class=\"border\" width=\"400\" border=\"1\" bgcolor=\"#f5f7fa\" style=\"width:100%;background-color:#f5f7fa;border:1px solid #dddee1\">\r\n" +
				"                            <tbody>\r\n" +
				"                            <tr>\r\n" +
				"                                <tr> <td colspan=\"8\" align=\"center\">Automation_Testing_Report</td></tr>\r\n"+
				"                                <tr> <td>Project Name</td>"+"<td colspan=\"8\">"+"HireMee Web 9.1"+"</td></tr>\r\n"+
				"                                <tr> <td>Test Suite</td>"+"<td colspan=\"8\">"+"Regression_Test"+"</td></tr>\r\n"+
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
		email.setSubject("HireMee_9.1_QA_Cycle-2_Regression_Testing_Extent_Report");
		email.addTo("irudayaraj.n@veetechnologies.com");
		email.addTo("suresh.k@veetechnologies.com");
		email.addCc("arunkumar.a@veetechnologies.com");
		email.addCc("udhayakumar.n@veetechnologies.com");
		email.addCc("senthilkumar.t@veetechnologies.com");
		//mail attachement
		EmailAttachment attachment = new EmailAttachment();
		//attachment.setPath("./HireMee_Pro_Smoke_Report.zip");
		attachment.setPath("./Reports/Hiremee_Candidate_Module_Regression_Testing_ExtentReport.html");
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



}
