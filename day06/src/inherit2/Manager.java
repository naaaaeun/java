package inherit2;

public class Manager extends Employee{
	private double bonus;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}


//여기부터
	public Manager(String id, String name, Double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub

	}	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
//여기까지 같이 사용도 가능 (별도의 생성자 선언없이
	public Manager(String id, String name, Double salary, double bonus) {//혹은 이렇게도 가능
		super(id, name, salary);
		this.bonus = bonus;
	}


	@Override
	public double getAnnSalary() {
		double result=0.0;
		result=(this.getSalary()+this.bonus)*12;
		return result;
	}


	@Override
	public String toString() {
		return  super.toString() +" "+"bonus=" + bonus + "]";
	}
  
}
