package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int sum=0;
		Random r=new Random();
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt(99)+1;		//random의 내장 메소드 nextInt(n) 0~n-1 사이에서 랜덤 숫자 생성
			//System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr)); //배열 출력하기
		
		for (int a:arr) { //배열의 자료형과 일치하는 자료형 a선언.  for문 실행되는 순서대로 a는 arr의 요소값 
				sum+=a;
		}
		System.out.printf("합: %d 평균:%f\n",sum,(sum*1.0)/(arr.length));
		
		System.out.println((sum*1.0)/arr.length);
	}

}
