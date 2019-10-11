package sol5;

import java.util.Scanner;

/*
 * 연속 합 구하기
 * 
 * 1 2 -4 5 3 -2 9 10
 * 
 * O(n^3) 과 O(n^2) 가 나오게 하는 방법이 있다.! 잘 생각해 보자
 * 10
 * 1 2 -7 5 6 -3 8 9 -12 8
 * 25
 * 음수만 있는 경우도 생각
 * 3
 * -1 -2 -3
 * -1
 */

public class SumFindMax2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] data = new int[n];
		int[] sum = new int[n];
		
		for(int i=0;i<n;i++) {
			data[i]=scanner.nextInt();
		}
		
		sum[0] = data[0];
		
		for(int i=1;i<n ;i++) {
			sum[i]= sum[i-1]+data[i];
		}
		
		int myMax = -9127320;
		
		for(int start =0;start<n;start++) {
			for(int end =start;end<n;end++) {
				int mySum =0;
				if(start ==0 ) mySum = sum[end];
				else mySum = sum[end] - sum[start-1];
				
				if(mySum > myMax) {
					myMax = mySum;
				}
			}
		}
		
		System.out.println(myMax);
		
	}
}
