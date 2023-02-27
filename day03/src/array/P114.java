package array;

import java.util.Arrays;
import java.util.Random;

public class P114 {

	public static void main(String[] args) {
		int arr[][]=new int[5][5];//2차원 배열, 5행 5열
		
		Random r=new Random();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=r.nextInt(9)+1;
				System.out.printf("%d",arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("------------------------------");
		
		for(int[] a:arr) {
			for(int data:a) {
			System.out.printf("%d",data);
			}
			System.out.println();
		}

	}

}
