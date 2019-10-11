package sol5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakingListInArray {
static int answer =0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer>[] list = new List[110];
		
		int N = scanner.nextInt();
		int root = scanner.nextInt();
		
		for(int i =0;i< N-1 ; i++) {
			
			int an = scanner.nextInt();
			int ch = scanner.nextInt();
			
			
			if(list[an] == null) {
				list[an] = new ArrayList<Integer>();
				list[an].add(ch);
			}else {
				list[an].add(ch); 
			}
			
		}
		
		DFS(root,0,list);
		System.out.println(answer);
	
	}
	
	public static void DFS(int pos, int len,List<Integer>[] list) {
		
		if(list[pos] == null) {
			if(len > answer) {
				answer = len;
			}
			return;
		}else {
			for(int e : list[pos]) {
				DFS(e,len+1,list);
			}
		}
		
	}
}
	


