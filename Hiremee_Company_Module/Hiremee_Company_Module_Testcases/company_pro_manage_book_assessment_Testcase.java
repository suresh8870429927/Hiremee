package Hiremee_Company_Module_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hiremee_Company_Module_Pages.Company_Pro_Book_Assessment_Page;

public class company_pro_manage_book_assessment_Testcase 
{
	WebDriver driver;
	Company_Pro_Book_Assessment_Page obj_Company_Pro_Book_Assessment_Page;
	public company_pro_manage_book_assessment_Testcase(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public void company_pro_book_assess_Testcase() throws Exception
	{
		obj_Company_Pro_Book_Assessment_Page=new Company_Pro_Book_Assessment_Page(driver);
		try
		{
			obj_Company_Pro_Book_Assessment_Page.Book_Bulk_Assessment();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

}
