package cthis;

import java.util.Calendar;

public class Employee {
	public String id;
	private String name;
	private int salary; //

	public Employee() {
		Calendar cal = Calendar.getInstance();
		this.id=cal.get(Calendar.YEAR)+""+cal.get(Calendar.MILLISECOND);
	}


	public Employee(String name, int salary) {
		this();
		this.name = name;
		this.salary = salary;
	}

	public double getTax() {
		double result = 0.0;
		result = this.salary * 0.17;
		return result;
	}

	public int getAnnSalary() {
		return salary * 12;
	}
	
	public double getAnnTax() {
		double result = 0.0;
		result = this.getAnnSalary()* 0.17;
		return result;
	}

	
	//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
