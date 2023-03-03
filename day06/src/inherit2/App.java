package inherit2;


public class App {

	public static void main(String[] args) {
		
		int a=0;
		double b=0.0;
		
		a+=(int)b;
		
		
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
				System.out.println(em.getIncentive()); //타입캐스팅 없이 진행하기
			}
		}
		System.out.println("=======================");
		TaxCal t = new TaxCal();
		System.out.println(t.getTax(ea[0]));
		
		
	}
}
