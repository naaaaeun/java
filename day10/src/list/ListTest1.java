package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		// List a=new ArrayList(); 제네릭 사용하지 않으면 모든 자료형 담을 수 있음
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		// 1~10까지의 숫자를 랜덤하게 10개 담으세요
		for (int i = 0; i < 10; i++) {
			list.add(r.nextInt(10) + 1);
		}
		list.add(1, 100);
		list.remove(1);
//		list.add(20);
//		list.add(30);
		for (int a : list) {
			System.out.println(a);
		}
	}

}
