package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DbException;

public class ConectPervasive {

	
	public static void main(String[] args)
	{
		//specify latin 2 encoding
		String url = "jdbc:pervasive://192.168.1.10:1583/BANCO007;encoding=cp850";
		try{
		Class.forName("com.pervasive.jdbc.v2.Driver");
		Connection conn = DriverManager.getConnection(url);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from SwedishTable");
		rs.close();
		stmt.close();
		conn.close();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
}
	
}