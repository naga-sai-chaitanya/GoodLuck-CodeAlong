package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public Connection getConnection() throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		
		//Create the connection object
		Connection con=null;
		
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Reset1998@");
		 return con;
	}


}
