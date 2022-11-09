package jdbc_alpha_book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserCRUD {

	public void SignUpUser(User u) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","TestYantra@2022");
		String query="Insert into user values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1, u.getId());
		ps.setString(2, u.getFirstName());
		ps.setString(3, u.getLastName());
		ps.setString(4, u.getMailId());
		ps.setLong(5, u.getContactNumber());
		ps.setString(6, u.getDOB());
		ps.setString(7, u.getPassword());
		ps.setString(8, u.getGender());
		ps.executeUpdate();
		connection.close();
		System.out.println("Data Saved");
	}
	
	public void LoginUser(String email2, String password2, User u) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","TestYantra@2022");
		String query="Select * from user where mailId = ? and password = ?";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1, u.getMailId());
		ps.setString(2, u.getPassword());
		ResultSet resultset=ps.executeQuery();
		String pass="";
		String email="";
		while(resultset.next())
		{
			email+=resultset.getString(4);
			pass+=resultset.getString(7);
		}
		if(email.equals(u.getMailId()) && pass.equals(u.getPassword()))
		{
			System.out.println("Login is Successful***** Welcome to Alpha Book ***** Where User Interacts with Multiple Users *****");
		}
		else
		{
			System.out.println("Login Failed ***** Invalid Credentials ***** ");
		}
	}
	
	public void StatusUser(String email,String Status, String datetime) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","TestYantra@2022");
		String query="Insert into StatusTable value(?,?,?)";
		String query1="Select * from status where emailId = ?";
		PreparedStatement ps=connection.prepareStatement(query);
		
	}
	
	
}
