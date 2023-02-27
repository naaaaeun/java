package array;

import java.util.Arrays;
import java.util.Random;

public class P106 {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int sum=0;
		int cnt=0;
		Random r=new Random();
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt(99)+1;		//random의 내장 메소드 nextInt(n) 0~n-1 사이에서 랜덤 숫자 생성
		}
		
		System.out.println(Arrays.toString(arr)); 
		
		//배열에 홀수의 값들의 합과 평균을 구하시오
	}

}
