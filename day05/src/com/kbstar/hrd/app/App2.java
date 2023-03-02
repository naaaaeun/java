package com.kbstar.hrd.app;

import com.kbstar.hrd.Manager;

public class App2 {

	public static void main(String[] args) {

		Manager[] ms = new Manager[3];
		ms[0] = new Manager("301", "정수아", 500, 50);
		ms[1] = new Manager("302", "고수아", 510, 55);
		ms[2] = new Manager("303", "이수아", 520, 65);

		for (Manager m : ms) {
			System.out.println(m);
		}

		System.out.println(ms[0].id);
	}

}
