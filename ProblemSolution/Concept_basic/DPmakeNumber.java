package sol5;

import java.util.Scanner;

/*
 * 동적 계획법의 기본 숫자만들기
 * 
 * 1~3 으로만 5 만들기
 * 블로그 확인!!
 * https://9105lgm.tistory.com/162
 * 
 * 
 */
public class DPmakeNumber {
	static int MAX = 100;
	
	public static void main(String[] args) {
		int[] Table = new int[MAX];
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Table[1] = 1;
		int sum =0;
		
		/*
		 * M =4
		 * Table[1] =1
		 * Table[2] = Table[1] +1
		 * Table[3] = Table[2]+ Table[1]+1
		 * Table[4] = Table[3]+Table[2]+ Table[1] +1 
		 */
		
		for (int i = 2; i <= m; i++) {
			sum += Table[i-1];
			Table[i] = sum +1;
		}
		
		for (int i = m+1; i <= n; i++) {
			for(int j=i-m;j<=i-1;j++) {
				Table[i] += Table[j];
			}
		}
		
		System.out.println(Table[n]);
	}
}
