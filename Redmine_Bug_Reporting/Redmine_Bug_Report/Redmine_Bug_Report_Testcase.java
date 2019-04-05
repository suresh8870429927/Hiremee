package Redmine_Bug_Report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redmine_Bug_Report_Testcase 
{
	WebDriver driver;
	Redmine_Bug_Report_page obj_Redmine_Bug_Report_page;
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
	public void Remibe_Testcase()
	{
		obj_Redmine_Bug_Report_page=new Redmine_Bug_Report_page(driver);
		obj_Redmine_Bug_Report_page.Remine_Login();
		//driver.close();
		
	}
}
