package com.kbstar.frame;

public class Sql {
	//cust dml
	public static String deleteSql = "DELETE FROM cust WHERE id= ?";
	public static String insertSql = "INSERT INTO CUST VALUEs(?,?,?,?)";
	public static String updateSql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id= ?";
	public static String selectSql = "SELECT * FROM cust WHERE id= ?";
	public static String selectAllSql = "SELECT * FROM CUST";
	//item dml
	public static String itemDeleteSql="DELETE FROM item WHERE id=?";
	public static String itemInsertSql="insert into item vaLues (?,?,?,?,SYSDATE)";
	public static String itemUpdateSql="UPDATE item SET name=?', price=?,rate=? where id =?";
	public static String itemSelectSql="SELECT * FROM  item WHRE id=?";
	public static String itemSelectAllSql="SELECT * FROM item";
}
