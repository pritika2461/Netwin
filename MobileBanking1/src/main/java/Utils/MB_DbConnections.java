package Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class MB_DbConnections
{
	 public static Connection CreateDBConnection(String DBname)
	 {
		 Connection conn = null;
		 String dbUrl = " ";
		 String DBName = "";
		 String UserName = "";
		 String Password = "root";
		 
		 try {
			// DriverManager.registerDriver(new org.postgresql.Driver());
			 
			conn = DriverManager.getConnection(dbUrl+DBName,UserName, Password);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
		 
		return conn;
	 }
}
