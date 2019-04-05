package Hiremee_Pro_Compaany_Assessment_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exam_Duration_Assessment_Pages 
{
	
	
	WebDriver driver;
	String Corporate_Assessment_url="https://172.18.1.1:8102/";
	
	public Exam_Duration_Assessment_Pages(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void Pro_Exam_Duration_Assesment()
	{
		driver.get(Corporate_Assessment_url);
		
	}

}
