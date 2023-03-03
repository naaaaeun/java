package inherit;


public class App2 {

	public static void main(String[] args) {
		Employee e =new Manager("200","kim",500.0,50);
		
		Employee[] ea=new Employee[5];
		
		ea[0]=new Manager("200","kim",500.0,50);
		ea[1]=new Employee("200","kim",500.0);
		ea[2]=new Manager("200","kim",500.0,50);
		ea[3]=new Employee("200","kim",500.0);
		ea[4]=new Sales("104","james",500.0,"seoul",0.35);
		
		for(Employee em :ea) {
			System.out.println(em.getAnnSalary());
			if(em instanceof Sales) { //Sales 객체 맞는지 확인하기
				Sales s=(Sales)em; //클래스 바꾸기 //타입캐스팅
				System.out.println(s);
			}
		}
	}
}
