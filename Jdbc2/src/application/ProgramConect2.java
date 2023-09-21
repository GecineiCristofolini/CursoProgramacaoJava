package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

import db.DB;

public class ProgramConect2 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		ResultSet rss = null;
		try {
			conn = DB.getConnection();
	
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from department");
			System.out.println("Departament");
			while (rs.next()) {
				
				System.out.println(rs.getInt("Id") + " |" + rs.getString("Name"));
			}
			
			rss = st.executeQuery("select * from seller");
			System.out.println();
			System.out.println("Seller");
			
			while (rss.next()) {
				System.out.println(rss.getInt("Id") + " |" + rss.getString("Name")+"|" + rss.getString("Email")+"|" + rss.getString("BaseSalary") );
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		finally {
			DB.closeResultSet(rs);
			DB.closeResultSet(rss);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}