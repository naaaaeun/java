package aggregation;


public class App {

	public static void main(String[] args) {
		Human human =new Human("james");
		
		Car car=new Car("k1","red",1000);
		
		human.setCar(car);
		
		System.out.println(human);
		
	}

}
