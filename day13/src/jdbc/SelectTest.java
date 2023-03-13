package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

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
		String selectAllSql = "select * FROM cust";

		// Statement 생성-SQL
		// SQL 전송
		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(selectAllSql);) {
			try(ResultSet rset = pstmt.executeQuery()) {
				while(rset.next()) {
					String db_id=rset.getString("id");
					String db_pwd=rset.getString("pwd");
					String name=rset.getString("name");
					int age=rset.getInt("age");
					System.out.println(db_id+" "+ name+" "+ age);					
				}
			}catch(SQLException e) {
				e.getStackTrace();
			}
		} catch (SQLException e1) {
			System.out.println("실패");
			e1.getStackTrace();
		}

		// 결과받기

		// Close

	}

}
