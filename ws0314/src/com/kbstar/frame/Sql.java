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

	// Cart DML

	public static String cartDeleteSql = "DELETE FROM cart WHERE id=?";
	public static String cartInsertSql = "INSERT INTO cart VALUES (?,?,?,?,SYSDATE)";
	public static String cartUpdateSql = "UPDATE cart SET cnt=? WHERE id=?";
	public static String cartSelectSql = "Select * FROM cart WHERE id=?";
	public static String cartSelectByUserSql = "Select * FROM cart WHERE user_id=?";
	public static String cartSelectAllSql = "SELECT * FROM cart";

}










