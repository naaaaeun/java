package inherit;

public class App {

	public static void main(String[] args) {
		Employee e =new Employee("100","james",500.0);//정수 실수
		System.out.println(e);
		System.out.println(e.getAnnSalary()); //ㅠㅠ
		
		Manager m =new Manager("200","kim",500.0,50);
		System.out.println(m);
		System.out.println(m.getAnnSalary());
		
		
	}

}
