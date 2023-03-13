package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("로딩 성공");
		// Connect //port 1521
		String id = "bank";
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;


		// Statement 생성-SQL
		// SQL 전송
		try {
			con = DriverManager.getConnection(url, id, pwd);
			pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, "id08");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "김길동");
			pstmt.setInt(4, 1);
			int result = pstmt.executeUpdate();
			System.out.println("결과:" + result);
		} catch (SQLException e1) {
			System.out.println("삽입 실패");
			e1.printStackTrace();

		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("종료 실패!");
				e.printStackTrace();
				return;
			}
			System.out.println("종료 성공!");
		}

		// 결과받기

		// Close
		
	}

}
