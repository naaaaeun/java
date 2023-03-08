package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		//
		Random r= new Random();
		while(set.size()<10) {
			set.add(r.nextInt(10)+1);
		}
		for(int a:set) {
			System.out.println(a);
		}
	}

}
