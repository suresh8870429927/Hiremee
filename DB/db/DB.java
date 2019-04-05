package db;
import java.sql.Connection;  
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DB {
	WebDriver driver;
	public static String Registration_otp;
	public static String College_Registration_otp;
	
	public DB(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	//candidate
	@Test
	public void pooled_selectquery_otp() throws SQLException, ClassNotFoundException
	{ 
		String dbURL = "jdbc:sqlserver://172.18.1.88:1433;databaseName=hiremee";
		String username = "itdev";
		String password = "Temp@123";
		Connection con = DriverManager.getConnection(dbURL,username,password);
		Statement st = con.createStatement();
		String select_query = "select top 1 * from hiremee..hiremee_otp where otp_type=6 and otp like 'EPC%' order by updated_at desc";
		ResultSet rs = st.executeQuery(select_query);
		System.out.println("pooled otp got");
		while (rs.next()) {
			Registration_otp=rs.getString("otp");
			System.out.println(Registration_otp);
		}
		System.out.println("pooled otp end");
		con.close();
	}
	
	//college-candidate Registration
	@Test
	public void college_invitecandidate_selectquery_otp() throws SQLException, ClassNotFoundException
	{ 
		String dbURL = "jdbc:sqlserver://172.18.1.88:1433;databaseName=hiremee";
		String username = "itdev";
		String password = "Temp@123";
		Connection con = DriverManager.getConnection(dbURL,username,password);
		Statement st = con.createStatement();
		String select_query = "select top 1 * from hiremee..hiremee_otp where otp_type=4 and otp like 'ECC%' order by updated_at desc";
		ResultSet rs = st.executeQuery(select_query);
		while (rs.next()) {
			College_Registration_otp=rs.getString("otp");
			System.out.println(College_Registration_otp);
		}
		con.close();

	}
	
	@Test
	// college Activation
		public void college_registration_activate_ops_portal() throws SQLException, ClassNotFoundException
		{
			String dbURL = "jdbc:sqlserver://172.18.1.88:1433;databaseName=hiremee";
			String username = "itdev";
			String password = "Temp@123";
			Connection con = DriverManager.getConnection(dbURL,username,password);
			Statement st = con.createStatement();
			String select_query = "update collegeregistration set status='active' where id=(select top (1)  id from collegeregistration order by id desc)";
			ResultSet rs=st.executeQuery(select_query);
			while (rs.next()) {
				System.out.println(rs.getString(select_query));
			}
			con.close();
			System.out.println("exceuted");

		}
	
	//company module
	@Test
	//needs to alternation in this 
	public void company_registration_activate_ops_portal() throws SQLException, ClassNotFoundException
	{
		System.out.println("started");
		String dbURL = "jdbc:sqlserver://172.18.1.88:1433;databaseName=hiremee";
		String username = "itdev";
		String password = "Temp@123";
		Connection con = DriverManager.getConnection(dbURL,username,password);
		Statement st = con.createStatement();
		String select_query = "update corporate_users set status=1 where id = (select top (1)  id from corporate_users order by id desc)";
		st.executeQuery(select_query);
		con.close();
	}
	
	@Test
	//needs to alternation in this 
	public void company_limit_update_ops_portal() throws SQLException, ClassNotFoundException
	{
		System.out.println("statt2");
		String dbURL = "jdbc:sqlserver://172.18.1.88:1433;databaseName=hiremee";
		String username = "itdev";
		String password = "Temp@123";
		Connection con = DriverManager.getConnection(dbURL,username,password);
		Statement st = con.createStatement();
		String update_query1 = "update company_profile set search_perday_company=1000,noofrecords_search_company=1000,noofselected_day_company=1000,search_permonth_company=1000,noofselected_month_company=1000,no_of_recruiter=2 where company_name='Automation_Team_Comapny_new18'";
		st.executeQuery(update_query1);
		con.close();

	}
	
	@Test
	//Assessment
	public void Assessment_College_Halticket_Update() throws SQLException, ClassNotFoundException
	{
		String dbURL = "jdbc:sqlserver://172.18.1.88:1433;databaseName=HiremeeAssessment";
		String username = "itdev";
		String password = "Temp@123";
		Connection con = DriverManager.getConnection(dbURL,username,password);
		Statement st = con.createStatement();
		String select_query = "update HRPortalEmployees set HallTicketAttendanceComments='Success' where HallTicketAttendanceDateTime is null";
		st.executeQuery(select_query);
		con.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

