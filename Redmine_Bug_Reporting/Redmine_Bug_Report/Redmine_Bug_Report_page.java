package Redmine_Bug_Report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Redmine_Bug_Report_page 
{
	
	@FindBy(how=How.LINK_TEXT,using="Sign in")
	WebElement Sign_in_Link;
		
	@FindBy(how=How.ID,using="username")
	WebElement Sign_in_Username;
	
	@FindBy(how=How.ID,using="password")
	WebElement Sign_in_Passsword;
	
	@FindBy(how=How.NAME,using="login")
	WebElement Sign_in_Login_Button;
	
	@FindBy(how=How.ID,using="project_quick_jump_box")
	WebElement Jump_Project;
	
	
	
	WebDriver driver;
	String Redmine_Url="https://veeredmine.vee-services.com/";
	String username="suresh";
	String passord="Temp!123";
	String Project_Name="HireMee-Web";
	public Redmine_Bug_Report_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void Remine_Login()
	{
		driver.get(Redmine_Url);
		Sign_in_Link.click();
		Sign_in_Username.sendKeys(username);
		Sign_in_Passsword.sendKeys(passord);
		Sign_in_Login_Button.click();	
		Jump_Project.sendKeys(Project_Name);
	}
	

}
