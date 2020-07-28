package mainapp;

import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	public boolean validate(LoginPojo loginpojo) throws ClassNotFoundException, SQLException {
		String username=loginpojo.getUsername();
		String password=loginpojo.getPassword();
		
		ConnectionManager con = new ConnectionManager();
		Statement st=(Statement) con.getConnection().createStatement();
		ResultSet rs= ((java.sql.Statement) st).executeQuery("SELECT * from USERDETAILS");
		
		while(rs.next())
		{
			if(username.contentEquals(rs.getString("USERNAME")) && password.equals("PASSWORD"))
			{
				con.getConnection().close();
				return true;
			}
			else
			{
				con.getConnection().close();
				return false;
			}
			
		}
		return bvb;
		
	}

}
