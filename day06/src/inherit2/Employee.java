package inherit2;

public class Employee {
	private String id;
	private String name;
	private Double salary;
	
	public Employee() {}

	public Employee(String id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	  
	public Double getSalary() {
		return salary;
	}

	public double getAnnSalary() {
		double result =0.0;
		result=this.salary*12;
		return result;
	}
	public double getIncentive() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
}
