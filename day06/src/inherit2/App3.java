package inherit2;

public class App3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Manager();
		Employee e3 = new Sales();
		Sales s=(Sales)new Manager();
		
		Object obj = new Employee(); //모든 객체는 선언 시 자동으로 Object를 상속함. extends Object가 생략되어있음. 
	}

}
