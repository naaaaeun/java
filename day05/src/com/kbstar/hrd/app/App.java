package com.kbstar.hrd.app;

import com.kbstar.hrd.Employee;

public class App {

	public static void main(String[] args) {
		Employee e =new Employee("100","이말숙",500);
		System.out.println(e); //toString 생략해도 자동으로 넣어줌. class에 정의 안된 경우 주소값 출력됨
		System.out.println(e.getSalary());
		System.out.println(e.getTax());
		System.out.println(e.getAnnSalary());
		System.out.println(e.getAnnTax());
		
		System.out.println("================================");
		
		
		Employee[] emps=new Employee[3];
		emps[0] = new Employee("201", "홍말자", 400);
		emps[1] = new Employee("202", "정말자", 450);
		emps[2] = new Employee("203", "장말자", 480);
		
		for(Employee em:emps) {
			System.out.println(em);
		}
	}

}
