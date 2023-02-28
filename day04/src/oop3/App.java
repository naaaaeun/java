package oop3;

public class App {

	public static void main(String[] args) {
		Car car1=new Car("c1", "red", 1000, 50);
		System.out.println(car1.toString());
		
		car1.setCfsize(15);
		car1.go(100);
		car1.go(100);
	}

}
