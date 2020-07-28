package mainapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBC {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Class.forName("oracle.jdbc.OracleDriver");
		//Create he connection object
		 Connection con=null;
		
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Reset1998@");
		 if(con!=null)
		 {
			 System.out.println("Established");
	     }

	}

}
