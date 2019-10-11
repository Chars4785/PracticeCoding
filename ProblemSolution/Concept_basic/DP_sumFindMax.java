package sol5;

import java.util.Scanner;

/*
 * 연속한 최대합을 DP 로 해결
 * https://9105lgm.tistory.com/162
 */

public class DP_sumFindMax {

	// 1. Table 정의
	// 2. 점화식

	// Table(i) = i 번째 숫자를 오른쪽 끝으로 하는 연속 부분 최대합
	// Table(i) = max( Table(i-1) + Data(i), Data(i))
	static int MAX = 100;

	public static void main(String[] args) {
		int[] Table = new int[MAX];
		int[] Data = new int[MAX];
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			Data[i] = sc.nextInt();
		}
		
		Table[0] = Data[0];
		
		for(int i=1;i<n;i++) {
			if(Table[i-1]+Data[i] > Data[i]) {
				Table[i] = Table[i-1] + Data[i];
			}else {
				Table[i] = Data[i];
			}
		}
		
		int myMax = -9769928;
		
		for (int i = 0; i < n; i++) {
			if(Table[i] > myMax) {
				myMax = Table[i];
			}
		}
		
		System.out.println(myMax);
				
	}

}
