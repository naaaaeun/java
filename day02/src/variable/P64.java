package variable;

public class P64 {

	public static void main(String[] args) {
		int a=10;
		double d=10.32545;
		String str1="abc";
		String str2="abc";
		str1="def";
		System.out.printf("%d\t %2.2f\t %s\n" , a,d,str1); // 탭간역에서 보면 n.n 간격확인 가능.
		if(str1==str2) { //stack 영역의 주소 비교.
			System.out.println("ok");
		}
		if(str1.equals(str2)) { //heap영역의 실제 값 비교
			System.out.println("ok2");
		}
		String str3=new String("abc");
		String str4=new String("abc");
	}

}
