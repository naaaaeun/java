package list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<Integer>();
		Random r=new Random();
		//1~10까지의 숫자를 20개 입력 한다.
		//단 while문을 이용한다.
		while(list.size()<20) {
			list.add(r.nextInt(10)+1);
		}
		System.out.println(list.size());
		System.out.println(list);
	}

}
