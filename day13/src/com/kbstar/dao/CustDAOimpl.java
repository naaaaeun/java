package com.kbstar.dao;

import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Properties;

import com.kbstar.dto.Cust;

public class CustDAOimpl implements DAO<String, String, Cust> {
	public CustDAOimpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("로딩 성공");
	}

	public Connection getConnection() throws Exception {
		Connection con = null;

		Properties props = new Properties();
		String fileName = "db_info.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);
		String id = props.getProperty("DB_ID");
		String pwd = props.getProperty("DB_PWD");
		String url = props.getProperty("DB_URL");

		con = DriverManager.getConnection(url, id, pwd);
		return con;
	}

	@Override
	public void insert(Cust v) throws Exception {

		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			int result = pstmt.executeUpdate();
			System.out.println("결과:" + result);
		} catch (Exception e1) {
			if (e1 instanceof SQLIntegrityConstraintViolationException) {
				System.out.println("id already exist");
			} else {
				System.out.println("system error");
			}
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate();
			System.out.println("결과:" + result);
		} catch (SQLException e1) {
			System.out.println("실패");
			e1.getStackTrace();
		}
	}

	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId());
			int result = pstmt.executeUpdate();
			System.out.println("결과:" + result);
		} catch (SQLException e1) {
			System.out.println("실패");
			e1.getStackTrace();
		}
	}

	@Override
	public Cust select(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);) {
			try{
				pstmt.setString(1, k);
				ResultSet rset = pstmt.executeQuery();
				rset.next();
				String db_id = rset.getString("id");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				System.out.println(db_id + " " + name + " " + age);
			}catch(Exception e) {
			System.out.println("실패");
			e.getStackTrace();
			}
		}catch (Exception e1) {
			System.out.println("실패1");
			e1.getStackTrace();
			}
		return null;
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
					String db_id = rset.getString("id");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					System.out.println(db_id + " " + name + " " + age);
				}
			} catch (SQLException e) {
				e.getStackTrace();
			}
		} catch (SQLException e1) {
			System.out.println("실패");
			e1.getStackTrace();
		}
		return null;
	}

	@Override
	public List<Cust> search(String k) throws Exception {

		return null;
	}

}
