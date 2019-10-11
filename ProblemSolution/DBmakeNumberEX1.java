package sol5;

import java.util.Scanner;

/*
 * 숫자 1, 2, 3을 이용하여 숫자 N을 만드는 경우의 수를 출력하는
 * 프로그램을 작성하시오.
 * 예를 들어, N이 4일 경우에는 다음의 7가지 경우가 존재한다.
 * 단, 경우의 수가 매우 많을 수 있으므로, 경우의 수를 1,000,007 
 * 로 나눈 나머지를 출력한다.

	1+1+1+1
	1+1+2
	1+2+1
	2+1+1
	2+2
	1+3
	3+1
	
	첫 번째 줄에 N이 주어진다. ( 1 ≤ N ≤ 100,000 ) 
	
	1, 2, 3을 이용하여 N을 만들 수 있는 경우의 수를 
	1,000,007 로 나눈 나머지를 출력한다.  
	
	200
	
	290816
	
 */
public class DBmakeNumberEX1 {
	static int MAX = 100_000;
	
	public static void main(String[] args) {
		long[] Table = new long[MAX];
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Table[1]=1;
		int sum =0;
		
		int share = 1_000_007;
		
		for (int i = 2; i <= 3; i++) {
			sum += Table[i-1];
			Table[i] = sum +1;
		}
		
		for(int i=4;i <= N;i++) {
			int temp =0;
			
			for(int j=0;j<3;j++) {
				temp += (Table[i-1-j]);
			}
			Table[i] = temp % share;
		}
		
		
		System.out.println(Table[N]);
		
	}
}
