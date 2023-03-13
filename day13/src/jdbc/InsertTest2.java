package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest2 {

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
		String updateSql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";

		// Statement 생성-SQL
		// SQL 전송
		try(Connection con=DriverManager.getConnection(url, id, pwd);
			PreparedStatement pstmt = con.prepareStatement(updateSql);) {
			pstmt.setString(1, "pwd10");
			pstmt.setString(2, "김길동");
			pstmt.setInt(3, 1);
			pstmt.setString(4, "id11");
			int result = pstmt.executeUpdate();
			System.out.println("결과:" + result);
		} catch (SQLException e1) {
			System.out.println("삽입 실패");
			e1.getStackTrace();
		} 

		// 결과받기

		// Close
		
	}

}
