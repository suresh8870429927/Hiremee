package Hiremee_Pro_Compaany_Assessment_Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exam_Duration_Assessment_Pages 
{
	@FindBy(how=How.ID,using="TestPin")
	WebElement Testpin;

	@FindBy(how=How.ID,using="btnStartExam")
	WebElement Assessment_Start_Button;

	@FindBy(how=How.ID,using="btnBrowse")
	WebElement Assessment_StartTest__Exam_Button;

	@FindBy(how=How.ID,using="btnProceed")
	WebElement Assessment_StartTest_Proceed_Button;


	@FindBy(how=How.ID,using="ProceedWithoutFeedBack")
	WebElement Assessment_Feedback_Proceed_Button;


	WebDriver driver;
	String Corporate_Assessment_url="http://172.18.1.1:8102/";
	String Test_Pin="H058535";
	public Exam_Duration_Assessment_Pages(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@Test
	public void Pro_Exam_Duration_Assesment() throws InterruptedException
	{
		try
		{
			driver.get(Corporate_Assessment_url);
			Testpin.sendKeys(Test_Pin);
			Assessment_Start_Button.click();
			driver.switchTo().window("HireMee Assessment");
			System.out.println("one");
			String parent=driver.getWindowHandle();
			System.out.println(parent);
			// This will return the number of windows opened by Webdriver and will return Set of St//rings
			Set<String>s1=driver.getWindowHandles();
			// Now we will iterate using Iterator
			Iterator<String> I1= s1.iterator();
			while(I1.hasNext())
			{
				String child_window=I1.next();

				// Here we will compare if parent window is not equal to child window then we            will close

				if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window);

					System.out.println(driver.switchTo().window(child_window).getTitle());
					Assessment_StartTest__Exam_Button.click();
					Assessment_StartTest_Proceed_Button.click();
					Assessment_StartTest_Proceed_Button.click();
					Assessment_StartTest_Proceed_Button.click();

					driver.close();
				}

			}
			// once all pop up closed now switch to parent window
			driver.switchTo().window(parent);

		} 
		catch(Exception e)
		{
			throw(e);
		}
	}	
}


