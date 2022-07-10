package crudSLQServer.lvd.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionSql {
	public static Connection conecctionSQL() {
		Connection cnx = null; 
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cnx = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=Pentagono", "sa", "1234");
			
			if(cnx.isValid(0)) {
				System.out.println("Successful Connection SQL Server");
			} else {
				System.out.println("Error in Connection");
			}
		} catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return cnx;
	}
	
//	public static void main(String[] args) {
//		conecctionSQL();
//	}
	
}
