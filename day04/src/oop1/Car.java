package oop1;

public class Car {
	public String name; //생성될 객체의 속성. 클래스는 3부분으로 이뤄짐
	public String color;
	public int size;

	// 생성자. constructor. 실무에서는 입력받아서 초기화 
	public Car() { //생성될 객체의 속성을 초기화
		this.name = "k5"; //"this.는  생략가능"
		this.color = "red";
		this.size = 1000;
	}
	public Car(String name, String color, int size){ //생성자/변수 같은 변수명을 사용할 수 있는 이유? 오버로딩. 자바만 가능. 듣고나서도 모르겠어요
		this.name=name; //this. 여기서는 생략불가능
		this.color =color;
		this.size =size; 
	}

	
	public void go() { // 생성될 객체의 행위
		System.out.printf("%s, %s go Car..\n",this.name,this.color);
	}

	public void stop() {
		System.out.printf("%s, %s stop Car..",this.name,this.color);
	}
}
