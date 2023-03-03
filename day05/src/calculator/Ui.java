package calculator;

public class Ui {

	public static void main(String[] args) {
		Calculator cal= new Calculator();
		
		int result=cal.sum(10,20);
		
		cal.save(result);
	}

}
