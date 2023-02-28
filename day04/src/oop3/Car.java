package oop3;

public class Car {
	private String name; // 생성될 객체의 속성. 클래스는 3부분으로 이뤄짐
	private String color;
	private int size;
	private int fsize;
	private int cfsize;

	// 생성자. constructor. 실무에서는 입력받아서 초기화
	public Car() {
	}

	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
	}

	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize);
		this.cfsize = cfsize;

	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}

	// 기름을 넣는다. 기름통보다 많이 넣으면 -> 다시 주유하세요.
	// 이상한 값인 경우 -> 다시 주유하세요.

	public void setCfsize(int size) {
		System.out.println("현재 연료 :" +cfsize);
		if (cfsize + size > fsize || size < 0) {
			System.out.println("다시 주유하세요");
		} else {
			cfsize += size;
			System.out.println("잔존 연료 :" +cfsize);
		}
	}

	public void go(int distance) {

		System.out.printf("%s는 %d km 갈 수 있어요~! \n", this.name, cfsize * 10);

		if (distance > cfsize * 10) {
			System.out.printf("남은 연료:%d\n", cfsize);
			System.out.printf("%dkm 가시려면 %d리터 더 주유해주세요~! \n", distance, (distance - cfsize * 10) / 10);
			return;
		}
		
		System.out.println("출발하겠습니다~!");
		cfsize -= (distance / 10);
		System.out.printf("남은 연료:%d\n", cfsize);

	}
}
