package Hiremee_Candidate_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Candidate_Recruiter_Message_Page
{


	@FindBy(how=How.LINK_TEXT,using="Recruiter Messages")
	WebElement Recruiter_messages;

	WebDriver driver;
	public Candidate_Recruiter_Message_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	public  void Recruitermessage() throws Exception 
	{
		Thread.sleep(2000);
		Recruiter_messages.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pcoded\"]/div[2]/div/div/div[4]/div/div/div/div[2]/div/div[1]/ul/li/a/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pcoded\"]/div[2]/div/div/div[4]/div/div/div/div[2]/div/div[1]/ul/li/a/div/label/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("clear_all_recruiter")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();


	}

}
