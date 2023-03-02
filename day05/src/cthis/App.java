package cthis;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		Employee e =new Employee("이종석",500);
		System.out.println(e.id);
		
		Date d =new Date();
		java.sql.Date dd=new java.sql.Date(0);
		
		System.out.println(d);

		System.out.println(dd);
	}

}
