package topic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {


		private static final String DB_URL = 
				"jdbc:sqlserver://localhost:1433;databaseName=jdbc";
		private static final String USER = "sa";
		private static final String PASSWORD = "passw0rd";
		
		private static final String SQL =
				"DELETE green WHERE �\�U�W��=?";
		
		//public static void main(String[] args) {
		
			public void resDelete(String name) {
			Connection conn = null;
			try {     
				conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement(SQL);
				//String name = "123";
				//int no = 53;
				pstmt.setString(1,name);
				int count = pstmt.executeUpdate();
				if (count==0) {
					System.err.println("�d�L���\�U'"+name+"'\n�R�����ѽЭ��s�ާ@");
				}else {
					System.out.println("�R��" + count + "�a�\�U���");
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (conn != null)
					try {
						conn.close();
					} catch(SQLException e) { 
						e.printStackTrace();
					}
			}
		}
	
		
		
		
	}


