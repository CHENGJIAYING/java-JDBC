package topic;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
public class Insert {

		private static final String DB_URL = 
				"jdbc:sqlserver://localhost:1433;databaseName=jdbc";
		private static final String USER = "sa";
		private static final String PASSWORD = "passw0rd";
		private static final String SQL =
				"INSERT INTO Green VALUES ( ?, ?, ?)";
		
		//public static void main(String[] args) {
			public void resInsert(String name,String phone,String address ) {
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement(SQL);
				
				//int no = 53;
				//String name = "�G�a�p�]";
				//String phone = "03-4758692";
				//String address = "��饫�����Ϥ��s�_��1��";
				//pstmt.setInt(1, no);
				pstmt.setString(1, name);
				pstmt.setString(2, phone); 
				pstmt.setString(3, address);
				
				int count = pstmt.executeUpdate();
				System.out.println("���\��J"+ count + "�a�\�U���");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				
				if (conn != null)
					try {
						conn.close();
					} catch(SQLException e) { 
						e.printStackTrace();
					}
		
		
			}
		}
}
	


