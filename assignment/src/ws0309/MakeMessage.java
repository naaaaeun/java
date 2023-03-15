package ws0309;

public class MakeMessage extends Exception {
	public static String message(Integer a) {
		String result = "";
		switch (a) {
		case 1:
			result = "숫자를 입력하세요.";
			break;
		case 2:
			result = "1~25 이하의 숫자를 입력하세요.";
			break;
		case 3:
			result = "숫자 중복입니다.";
			break;
		}
		return result + " 다시 입력하세요.";
	}
}
