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
		String user = "Master";
		String password = "jaemkgt";
		try{
		Class.forName("com.pervasive.jdbc.v2.Driver");
		Connection conn = DriverManager.getConnection(url,user,password);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from TransporFusion where (FL_HABILITADO  = 'S')  ");
		while (rs.next()) {
			
			System.out.println(rs.getString("cod_transpor") +" | " + rs.getString("razaoSocialTranspor")+ " | "+ rs.getString("FL_HABILITADO")  );
		}
		
		
		
		
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