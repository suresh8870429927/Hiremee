package Hiremee_cms_UAT_Smoke_Testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started.Hiremee_Smoke_Test_Driver_Initial;
import Excel_Config.Excel_Sheet_Config;
import Property_File.Property_File_Config;

public class Hiremee_Cms_page extends Hiremee_Smoke_Test_Driver_Initial
{
	@FindBy(how=How.LINK_TEXT,using="Login")
	WebElement Hiremee_cms_overall_login_modal;

	@FindBy(how=How.ID,using="check-candidate-link")
	WebElement Hiremee_cms_overall_login_modal_I_Am_a_student;
	
	@FindBy(how=How.ID,using="check-college-link")
	WebElement Hiremee_cms_overall_login_modal_I_Am_a_college;
	
	@FindBy(how=How.ID,using="check-company-link")
	WebElement Hiremee_cms_overall_login_modal_I_Am_a_company;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div[1]/a/img")
	WebElement Hiremee_CMS_Hiremee_Logo;
	
	@FindBy(how=How.LINK_TEXT,using="HireMee App")
	WebElement Hiremee_cms_Hiremee_Apk;

	@FindBy(how=How.LINK_TEXT,using="Join Us Now")
	WebElement Hiremee_cms_Join_us;
	
	@FindBy(how=How.LINK_TEXT,using="View & Apply")
	WebElement Hiremee_cms_View_and_apply;
	
	@FindBy(how=How.LINK_TEXT,using="Advertising , Media")
	WebElement Hiremee_cms_Adverting_media;

	@FindBy(how=How.LINK_TEXT,using="Airlines , Aviation , Defence")
	WebElement Hiremee_cms_Arlines_aviation;
	
	@FindBy(how=How.LINK_TEXT,using="Automobile , Auto Ancillaries & Dealers")
	WebElement Hiremee_cms_Automobile;
	
	@FindBy(how=How.LINK_TEXT,using="BFSI")
	WebElement Hiremee_cms_BFSI;
	
	@FindBy(how=How.LINK_TEXT,using="Capital Goods , Machines")
	WebElement Hiremee_cms_capital;
	
	@FindBy(how=How.LINK_TEXT,using="Cement , Marble , Stone etc")
	WebElement Hiremee_cms_cement;
	
	@FindBy(how=How.LINK_TEXT,using="Chemical")
	WebElement Hiremee_cms_chemical;
	
	@FindBy(how=How.LINK_TEXT,using="Construction, Infrastructure")
	WebElement Hiremee_cms_construction;
	
	@FindBy(how=How.LINK_TEXT,using="Consumer Durables, Home Appliances")
	WebElement Hiremee_cms_consumer;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs in Adilabad")
	WebElement Hiremee_cms_Adilabad;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs in Tirunelveli")
	WebElement Hiremee_cms_Tirunelveli;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs in Chennai")
	WebElement Hiremee_cms_chennai;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs in Bangalore")
	WebElement Hiremee_cms_Bangalore;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs in Adilabad")
	WebElement Hiremee_cms_Adilabad1;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs in Good Update")
	WebElement Hiremee_cms_Good_update;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs in Ahmadnagar")
	WebElement Hiremee_cms_Ahmadnagar;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs in Ahmadabad")
	WebElement Hiremee_cms_Ahmadabad;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs in Agra")
	WebElement Hiremee_cms_Agra;
	
	@FindBy(how=How.LINK_TEXT,using="Jobs in Amravati")
	WebElement Hiremee_cms_Amravati;
	
	@FindBy(how=How.LINK_TEXT,using="View all Jobs")
	WebElement Hiremee_cms_View_All_jobs;
	
	@FindBy(how=How.LINK_TEXT,using="All Job Opportunities")
	WebElement Hiremee_cms_View_All_job_opportunities;
	
	
	@FindBy(how=How.LINK_TEXT,using="Companies")
	WebElement Hiremee_cms_company_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="Colleges")
	WebElement Hiremee_cms_college_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="Candidates")
	WebElement Hiremee_cms_candidate_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="Events")
	WebElement Hiremee_cms_Events_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="Blogs")
	WebElement Hiremee_cms_Blogs_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="Media Release")
	WebElement Hiremee_cms_Media_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="Contact us")
	WebElement Hiremee_cms_contact_us_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="About us")
	WebElement Hiremee_cms_about_us_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="FAQs")
	WebElement Hiremee_cms_FAQ_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="Site Map")
	WebElement Hiremee_cms_Sitemap_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="Terms of use")
	WebElement Hiremee_cms_Terms_of_use_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="Privacy policy")
	WebElement Hiremee_cms_Privacy_policy_quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="Testimonials")
	WebElement Hiremee_cms_Testnomials__quick_link;
	
	@FindBy(how=How.LINK_TEXT,using="Career with us")
	WebElement Hiremee_cms_carieer_with_us__quick_link;
	
	
	
	WebDriver driver;
	Property_File_Config config;
	//String home_url;
	Excel_Sheet_Config excel=new Excel_Sheet_Config();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public Hiremee_Cms_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);

	}
	@Test
	public void Hiremee_cms_Home_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Home_page");
		try
		{
			//home_url=excel.Read_data(7, 19, 10);
			config=new Property_File_Config();
			driver.get(config.getHiremee_Home_Url());
			excel.Write_data_pass(7, 19, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 19, 11);
			throw(e);	
		}
	}

	@Test
	public void Hiremee_cms_overall_Login_modal_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_overall_Login_modal_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_overall_login_modal);
			Hiremee_cms_overall_login_modal.click();
			excel.Write_data_pass(7, 20, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 20, 11);
			throw(e);	
		}
	}
	
	@Test
	public void Hiremee_cms_i_am_a_student_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_i_am_a_student_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_overall_login_modal_I_Am_a_student);
			Hiremee_cms_overall_login_modal_I_Am_a_student.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 21, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 21, 11);
			throw(e);	
		}
	}
	
	@Test
	public void Hiremee_cms_i_am_a_college_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_i_am_a_college_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_overall_login_modal);
			Hiremee_cms_overall_login_modal.click();
			ExplicitWait(driver,Hiremee_cms_overall_login_modal_I_Am_a_college);
			Hiremee_cms_overall_login_modal_I_Am_a_college.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 22, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 22, 11);
			throw(e);	
		}
	}
	
	@Test
	public void Hiremee_cms_i_am_a_company_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_i_am_a_company_page");
		try
		{
			ExplicitWait(driver, Hiremee_cms_overall_login_modal);
			Hiremee_cms_overall_login_modal.click();
			ExplicitWait(driver, Hiremee_cms_overall_login_modal_I_Am_a_company);
			Hiremee_cms_overall_login_modal_I_Am_a_company.click();
			excel.Write_data_pass(7, 23, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 23, 11);
			throw(e);	
		}
	}
	
	@Test
	public void Hiremee_cms_Hiremee_logo_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Hiremee_app_page");
		try
		{
			ExplicitWait(driver,Hiremee_CMS_Hiremee_Logo);
			Hiremee_CMS_Hiremee_Logo.click();
			excel.Write_data_pass(7, 24, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 24, 11);
			throw(e);	
		}
	}
	
	@Test
	public void Hiremee_cms_Hiremee_app_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Hiremee_app_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Hiremee_Apk);
			Hiremee_cms_Hiremee_Apk.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 25, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 25, 11);
			throw(e);	
		}
	}
	
	@Test
	public void Hiremee_cms_Advertising_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Advertising_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Adverting_media);
			Hiremee_cms_Adverting_media.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 26, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 26, 11);
			throw(e);	
		}
	}
	
	@Test
	public void Hiremee_cms_Arlines_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Arlines_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Arlines_aviation);
			Hiremee_cms_Arlines_aviation.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 27, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 27, 11);
			throw(e);	
		}
	}
	
	
	@Test
	public void Hiremee_cms_Automobile_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Automobile_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Automobile);
			Hiremee_cms_Automobile.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 28, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 28, 11);
			throw(e);	
		}
	}
	

	
	@Test
	public void Hiremee_cms_BFSI_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_BFSI_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_BFSI);
			Hiremee_cms_BFSI.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 29, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 29, 11);
			throw(e);	
		}
	}
	
	@Test
	public void Hiremee_cms_Capital_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Capital_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_capital);
			Hiremee_cms_capital.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 30, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 30, 11);
			throw(e);	
		}
	}	
	
	
	@Test
	public void Hiremee_cms_Cement_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Cement_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_cement);
			Hiremee_cms_cement.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 31, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 31, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Chemical_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Chemical_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_chemical);
			Hiremee_cms_chemical.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 32, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 32, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Construction_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Construction_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_construction);
			Hiremee_cms_construction.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 33, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 33, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Consumer_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Consumer_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_consumer);
			Hiremee_cms_consumer.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 34, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 34, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Adilabad_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Adilabad_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Adilabad);
			Hiremee_cms_Adilabad.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 35, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 35, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Tirunelveli_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Tirunelveli_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Tirunelveli);
			Hiremee_cms_Tirunelveli.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 36, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 36, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Chennai_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Chennai_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_chennai);
			Hiremee_cms_chennai.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 37, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 37, 11);
			throw(e);	
		}
	}	
	
	
	@Test
	public void Hiremee_cms_Bangalore_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Bangalore_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Bangalore);
			Hiremee_cms_Bangalore.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 38, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 38, 11);
			throw(e);	
		}
	}	
	

	@Test
	public void Hiremee_cms_Adilabad1_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Adilabad1_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Adilabad1);
			Hiremee_cms_Adilabad1.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 39, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 39, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Good_Update_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Good_Update_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Good_update);
			Hiremee_cms_Good_update.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 40, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 40, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Ahmednagar_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Ahmednagar_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Ahmadnagar);
			Hiremee_cms_Ahmadnagar.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 41, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 41, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Ahmadabad_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Ahmadabad_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Ahmadabad);
			Hiremee_cms_Ahmadabad.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 42, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 42, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Agra_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Agra_page");
		try
		{
			
			ExplicitWait(driver,Hiremee_cms_Agra);
			Hiremee_cms_Agra.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 43, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 43, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Amravati_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Amravati_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Amravati);
			Hiremee_cms_Amravati.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 44, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 44, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_company_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_company_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_company_quick_link);
			Hiremee_cms_company_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 45, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 45, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_college_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_college_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_college_quick_link);
			Hiremee_cms_college_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 46, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 46, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_candidate_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_candidate_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_candidate_quick_link);
			Hiremee_cms_candidate_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 47, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 47, 11);
			throw(e);	
		}
	}	
	
	
	@Test
	public void Hiremee_cms_Events_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Events_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Events_quick_link);
			Hiremee_cms_Events_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 48, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 48, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Blogs_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Blogs_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Blogs_quick_link);
			Hiremee_cms_Blogs_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 49, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 49, 11);
			throw(e);	
		}
	}	
	
	
	@Test
	public void Hiremee_cms_Media_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Media_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Media_quick_link);
			Hiremee_cms_Media_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 50, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 50, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Contact_us_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Media_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_contact_us_quick_link);
			Hiremee_cms_contact_us_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 51, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 51, 11);
			throw(e);	
		}
	}	
	
	
	@Test
	public void Hiremee_cms_About_us_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Media_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_about_us_quick_link);
			Hiremee_cms_about_us_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 52, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 52, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_FAQ_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_FAQ_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_FAQ_quick_link);
			Hiremee_cms_FAQ_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 53, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 53, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Sitemap_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Sitemap_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Sitemap_quick_link);
			Hiremee_cms_Sitemap_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 54, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 54, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Terms_use_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Terms_use_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Terms_of_use_quick_link);
			Hiremee_cms_Terms_of_use_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 55, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 55, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Privacy_policy_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Privacy_policy_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Privacy_policy_quick_link);
			Hiremee_cms_Privacy_policy_quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 56, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 56, 11);
			throw(e);	
		}
	}	
	
	
	@Test
	public void Hiremee_cms_Testnomials_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Testnomials_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_Testnomials__quick_link);
			Hiremee_cms_Testnomials__quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 57, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 57, 11);
			throw(e);	
		}
	}	
	
	@Test
	public void Hiremee_cms_Carieer_quick_link_page() throws Exception
	{		
		logger=extent.createTest("Hiremee_cms_Carieer_quick_link_page");
		try
		{
			ExplicitWait(driver,Hiremee_cms_carieer_with_us__quick_link);
			Hiremee_cms_carieer_with_us__quick_link.click();
			driver.navigate().back();
			excel.Write_data_pass(7, 58, 11);
		}

		catch(Exception e)
		{
			excel.Write_data_fail(7, 58, 11);
			throw(e);	
		}
	}	
	
	
}
