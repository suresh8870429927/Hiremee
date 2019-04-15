package Property_File;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Property_File_Config 
{
	Properties pro;
	public Property_File_Config() throws Exception
	{
		try
		{
			File src=new File("./Configuration/config.property");
			FileInputStream input=new FileInputStream(src);
			pro=new Properties();
			pro.load(input);
		}
		catch(Exception e)
		{
			System.out.println("Exception is:"+e.getMessage());
		}
	}

	//Chrome driver
	public String getChromeDriver()
	{
		String Chromepath=pro.getProperty("Chrome_Driver");
		return Chromepath;
	}

	//Firefox driver
	public String geFirefoxDriver()
	{
		String Firefoxpath=pro.getProperty("Firefox_Driver");
		return Firefoxpath;
	}
	
	//candidate module
	public String getCandidate_url()
	{
		String candi_url=pro.getProperty("candidate_url");
		return candi_url;
	}

	public String getCandidate_username()
	{
		String candi_username=pro.getProperty("candidate_Username");
		return candi_username;
	}

	public String getCandidate_password()
	{
		String Candi_password=pro.getProperty("Candidate_Password");
		return Candi_password;
	}

	//college module
	public String getCollege_url()
	{
		String coll_url=pro.getProperty("College_url");
		return coll_url;
	}

	public String getCollege_username()
	{
		String coll_username=pro.getProperty("college_username");
		return coll_username;
	}

	public String getCollege_password()
	{
		String Coll_password=pro.getProperty("college_password");
		return Coll_password;
	}

	//company module
	public String getCompany_url()
	{
		String com_url=pro.getProperty("Company_url");
		return com_url;
	}

	public String getCompany_username()
	{
		String com_username=pro.getProperty("company_username");
		return com_username;
	}

	public String getCompany_password()
	{
		String Com_password=pro.getProperty("company_password");
		return Com_password;
	}

	//Recruiter module
	public String getRecruiter_url()
	{
		String rec_url=pro.getProperty("Recruiter_url");
		return rec_url;
	}

	public String getRecruiter_username()
	{
		String rec_username=pro.getProperty("recruiter_username");
		return rec_username;
	}

	public String getRecruiter_password()
	{
		String rec_password=pro.getProperty("recruiter_password");
		return rec_password;
	}

	//Assessment module
	public String Assessment_url()
	{
		String Assess_url=pro.getProperty("Recruiter_url");
		return Assess_url;
	}

	public String getAssessment_username()
	{
		String Assess_username=pro.getProperty("recruiter_username");
		return Assess_username;
	}

	public String getAssessment_password()
	{
		String Assess_password=pro.getProperty("recruiter_password");
		return Assess_password;
	}

	//Hiremee_Home_Url
	public String getHiremee_Home_Url()
	{
		String Hiremee_Home=pro.getProperty("Hiremee_Home_url");
		return Hiremee_Home;
	}

	//testng_result_xml url
	public String getxmlpath()
	{
		String Testng_xml_file_path=pro.getProperty("xml_path");
		return Testng_xml_file_path;
		
	}
	
	//Extent_Report_xml_File
	public String getExtent_path()
	{
		String Extent_Report_Path=pro.getProperty("Report_extent_file");
		return Extent_Report_Path;
		
	}
	
	


}
