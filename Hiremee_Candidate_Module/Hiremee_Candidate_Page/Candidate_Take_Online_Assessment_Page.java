package Hiremee_Candidate_Page;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver_Started_Candidate_Module.Candidate_Driver_Class;
import Excel_Sheet_config.Excel_Sheet;

public class Candidate_Take_Online_Assessment_Page extends Candidate_Driver_Class{
	
	@FindBy(how=How.LINK_TEXT,using="Take Online Assessment")
	WebElement Take_Online_Assessment;
	
	WebDriver driver;
	Excel_Sheet excel=new Excel_Sheet();
	public Candidate_Take_Online_Assessment_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	@Test()
	public void take_online_asessment() throws Exception
	{
		logger=extent.createTest("take_online_asessment");
		try
		{
		Thread.sleep(3000);
		Take_Online_Assessment.click();
		excel.Write_data_pass(1, 235, 12);
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		Set<String>allwindows=driver.getWindowHandles(); 
		for(String child:allwindows) {
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.close();
				driver.switchTo().window(parent);
				Thread.sleep(2000);
			}

		}		 	 
	}
		catch(Exception e)
		{
			excel.Write_data_fail(1, 235, 12);
			throw(e);
		}

}
}