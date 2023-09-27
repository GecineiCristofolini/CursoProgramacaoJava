package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class ProgramConect {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {

			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from DC0110 where (SIGLA_UF NOT IN ('SC','CE')) ");

			while (rs.next()) {

				System.out.println(rs.getString("SIGLA_UF") + " | " + rs.getString("NOME_UF"));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
	

}
