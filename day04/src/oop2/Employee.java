package oop2;

public class Employee {
	public String id;
	public String name;
	private int salary; // 생성자를 통해서만 접근 가능, 재할당 불가.
	double cfsize;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // private 함수이더라도 재할당 가능
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public Employee() {
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 10000000;
	}

	public Employee(String id, String name, int salary) { // this를 꼭 써줘야 하는 메소드. 알규먼트와 변수명이 같기 때문.
		this.id = id;
		this.name = name;
		if (salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
	}

	public Employee(String name, int salary) {
		this("10000", name, salary); // 메소드의 가장 윗줄에 작성해야함.
	}

	public int getAnnSalary() {
		return salary * 12;
	}

	public double getTax() {
		return this.salary * 0.175;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public void setCfsize(int size) {
		cfsize =  size;
	}
	
	public void go (int distance) {
		System.out.println("go"+this.name);	
		}
	
	public void stop (int distance) {
		System.out.println("stop"+this.name);
	}

}
