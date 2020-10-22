package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	static String databaseDriver = "com.mysql.cj.jdbc.Driver";
	static String databaseLocation = "jdbc:mysql://localhost:3306/april2020";
	static String username = "root";
	static String password = "root";
	
	public static String getData(String tableName, String columnName) throws ClassNotFoundException, SQLException{
		Class.forName(databaseDriver);
		Connection con = DriverManager.getConnection(databaseLocation, username, password);
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("SELECT * FROM "+ tableName);
		
		while(rs.next()) {
		return rs.getString(columnName);
		}
		return columnName;
	}
}
