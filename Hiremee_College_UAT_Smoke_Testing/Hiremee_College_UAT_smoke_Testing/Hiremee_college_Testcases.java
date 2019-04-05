package Hiremee_College_UAT_smoke_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Hiremee_college_Testcases 
{	
	WebDriver driver;
	
	public Hiremee_college_Testcases(WebDriver colldriver)
	{
	this.driver=colldriver;
	PageFactory.initElements(driver,this);
	}
	

public void college_Home_main_page() throws Exception
{
	Hiremee_college_Pages college_pages=new Hiremee_college_Pages(driver);
try {
	
	college_pages.College_Home_page();
}
catch(Exception e)
{
	throw(e);
}
}

public void college_login_main_page() throws Exception
{
	Hiremee_college_Pages college_pages=new Hiremee_college_Pages(driver);
try {
	college_pages.College_Login();
}
catch(Exception e)
{
	throw(e);
}
}

public void college_Dashboard_main_page() throws Exception
{
	Hiremee_college_Pages college_pages=new Hiremee_college_Pages(driver);
try {
	
	college_pages.College_Dashboard_College();
}
catch(Exception e)
{
	throw(e);
}
}

public void college_Profile_main_page() throws Exception
{
	Hiremee_college_Pages college_pages=new Hiremee_college_Pages(driver);
try {
	college_pages.College_Profile();
}
catch(Exception e)
{
	throw(e);
}
}	
public void college_Registered_Students_main_page() throws Exception
{
	Hiremee_college_Pages college_pages=new Hiremee_college_Pages(driver);
try {
	college_pages.Registered_Students();
}
catch(Exception e)
{
	throw(e);
}
}
public void college_Upload_Students_main_page() throws Exception
{
	Hiremee_college_Pages college_pages=new Hiremee_college_Pages(driver);
try {
	college_pages.Upload_Student_details();
}
catch(Exception e)
{
	throw(e);
}
}	
public void college_Student_Assessment_Results_main_page() throws Exception
{
	Hiremee_college_Pages college_pages=new Hiremee_college_Pages(driver);
try {
	college_pages.Student_Assessment_result();
}
catch(Exception e)
{
	throw(e);
}
}	
public void college_FAQ_main_page() throws Exception
{
	Hiremee_college_Pages college_pages=new Hiremee_college_Pages(driver);
try {
	college_pages.FAQ();
}
catch(Exception e)
{
	throw(e);
}
}	
public void college_Feedback_main_page() throws Exception
{
	Hiremee_college_Pages college_pages=new Hiremee_college_Pages(driver);
try {
	college_pages.Feedback();
}
catch(Exception e)
{
	throw(e);
}
}	
public void college_Change_Password_main_page() throws Exception
{
	Hiremee_college_Pages college_pages=new Hiremee_college_Pages(driver);
try {
	
	college_pages.Change_password();
}
catch(Exception e)
{
	throw(e);
}
}		
public void college_Logout_main_page() throws Exception
{
	Hiremee_college_Pages college_pages=new Hiremee_college_Pages(driver);
try {
	college_pages.Logout();
}
catch(Exception e)
{
	throw(e);
}
}		
}

