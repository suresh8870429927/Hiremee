package Hiremee_Pro_Company_Assessment_Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Hiremee_Pro_Compaany_Assessment_Pages.Exam_Duration_Assessment_Pages;

public class Exam_Duration_Assessment_Testcase 
{
	WebDriver driver;
	Exam_Duration_Assessment_Pages obj_Exam_Duration_Assessment_Pages;
	@BeforeTest
	public void Start_driver() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void Exam_Duration_Assessment_Test()
	{
		obj_Exam_Duration_Assessment_Pages=new Exam_Duration_Assessment_Pages(driver);
		try
		{
			obj_Exam_Duration_Assessment_Pages.Pro_Exam_Duration_Assesment();
		}
		catch(Exception e)
		{
			
		}
		
	}

}
