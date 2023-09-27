package application;

import java.sql.Connection;

import db.DB;



public class ProgramConect {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		DB.closeConnection();
		
		System.out.print(conn);
		
	}
}