package sol5;



/*
 * 문제를 잘 읽어야 하는 문제다 조건에 절대로 부모, 자식이라는 이야기는 없다.
 * 트리의 높이는 루트로부터 가장 멀리 떨어진 노드와의 거리로 정의된다.
 * 예를 들어, 아래의 트리에서 0번 노드가 루트라고 하면,
 * 7번 노드까지의 거리가 가장 멀고, 그 거리는 3이다. 
 * 따라서 이 트리의 높이는 3이 된다. 트리가 주어질 때,
 * 그 트리의 높이를 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 *  
 * 첫 번째 줄에 트리의 노드 개수 n, 그리고 루트노드의 번호 r이 주어진다.
 * ( 1 ≤ n ≤ 100, 0 ≤ r ≤ n - 1 ) 
 *  두 번째 줄부터 트리의 간선 정보가 주어진다. 
 *  각 줄은 2개의 숫자 a, b로 이루어지며, 
 *  이는 a번 노드와 b번 노드가 연결되어 있다는 뜻이다. 
 *  각 노드의 번호는 0 ~ n-1까지 존재한다. 또한, 연결이 되지않은 노드는 없다.
 *  
 * 입력
 *  8 0
 *  0 1
 *  0 2
 *  1 3
 *  1 4
 *  1 5
 *  2 6
 *  6 7
 *  
 *  출력
 *  3
 */

import java.util.Scanner;
import java.util.Stack;

public class findHeight {

	static int answer =0;
	static int[][] ary = new int[110][110];
	static boolean[] visited = new boolean[110]; 
	static int N;
	static Stack<Integer> stack;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		stack = new Stack<>();
		N = scanner.nextInt();
		int root = scanner.nextInt();
		
		for(int i =0;i< N-1 ; i++) {
			
			int an = scanner.nextInt();
			int ch = scanner.nextInt();
			ary[an][ch] =1;
			ary[ch][an] =1;
		}
		visited[root] = true;
		DFS(root,0);
		System.out.println(answer);
	}
	
	private static void DFS(int root, int len) {
		int count =0;
		if(len > answer) {
			answer = len;
		}
		
		for(int i=0;i<N;i++) {
			if(ary[root][i] != 0 && !visited[i]) {
				stack.add(i);
				visited[i] = true;
				count++;
			}
		}
		
		if(count != 0) {
			for(int i=0;i<count;i++) {
				DFS(stack.pop(),len+1);
			}
		}
		return ;
		
	}
	
}
		
