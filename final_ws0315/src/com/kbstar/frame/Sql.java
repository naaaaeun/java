package com.kbstar.frame;

public class Sql {
	// Cust DML 
	public static String custDeleteSql = "DELETE FROM cust WHERE id = ?";
	public static String custInsertSql = "INSERT INTO cust VALUES(?,?,?,?)";
	public static String custUpdateSql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";
	public static String custSelectSql = "SELECT * FROM cust WHERE id = ?";
	public static String custSelectAllSql = "SELECT * FROM cust";
	
	// Item DML
	public static String itemDeleteSql = "DELETE FROM item WHERE id=?";
	public static String itemInsertSql = "INSERT INTO item VALUES (?,?,?,?,SYSDATE)";
	public static String itemUpdateSql = "UPDATE item SET name=?, price=?, rate=? WHERE id=?";
	public static String itemSelectSql = "SELECT * FROM item WHERE id=?";
	public static String itemSelectAllSql = "SELECT * FROM item";

	// tr DML //거래내역 이므로 delete, update 없음.

	public static String trInsertSql = "INSERT INTO tr VALUES (?,?,?,?,?,?,SYSDATE)";
	public static String trSelectAllSql = "SELECT * FROM tr"; //전체 계좌의 전체 거래내역 조회하기
	public static String trSelectSql = "Select * FROM tr WHERE myAcc=?"; //내 계좌 거래내역 조회하기
}










