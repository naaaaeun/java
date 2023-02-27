package array;

import java.util.Arrays;
import java.util.Random;

public class P105 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int sum=0;
		int cnt=0;
		Random r=new Random();
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt(9)+1;		//random의 내장 메소드 nextInt(n) 0~n-1 사이에서 랜덤 숫자 생성
		}
		
		System.out.println(Arrays.toString(arr)); 
		
		//홀수 번째의 합과 평균을 구하시오
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				continue;
			}
			sum+=arr[i];
			cnt++;
		}
		System.out.printf("합: %d 평균:%f\n",sum,(sum*1.0)/cnt);
	}

}
