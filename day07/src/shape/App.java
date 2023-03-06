package shape;

public class App {

	public static void main(String[] args) {
		//Shape s=new Shape(10,10); 바로 생성 불가
		Shape s1=new Rectangle(10,20,100,80); 
		System.out.println(s1.getXY()); 
		System.out.println(s1.getArea()); 
		System.out.println(s1.getCircumn());
		

		Shape s2=new Triangle(10,20,100,80);  
		System.out.println(s2.getXY()); 
		System.out.println(s2.getArea()); 
		System.out.println(s2.getCircumn());
	}

}
