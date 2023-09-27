package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class ProgramConect4 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
	
			st = conn.prepareStatement(
					
					//EXEMPLO 1
					/*"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?)");
                    
                    "UPDATE seller INNER JOIN department ON seller.DepartmentId = department.Id"
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE(department.Name = ?)";

                    
                    
                    */
					
					
					
					//EXEMPLO 2
					"UPDATE seller INNER JOIN department ON seller.DepartmentId = department.Id "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "where (department.Name = ?)");
					
					
					
			st.setDouble(1, 200.0);
			st.setString(2, "Computers");
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
