package access;

public class Employee {
	private String id;
	protected String name;
	private int salary; //

	public Employee() {
	}


	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getTax() {
		double result = 0.0;
		result = this.salary * 0.17;
		return result;
	}

	private int getAnnSalary() { //해당 클래스 내부에서만 함수 사용가능
		return salary * 12;
	}
	
	protected double getAnnTax() { //
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
