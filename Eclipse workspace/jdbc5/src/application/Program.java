package application;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?");
			
			st.setInt(1, 6);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows Affected: "+rowsAffected);
			
		} catch (Exception e) {
			throw new DbIntegrityException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
