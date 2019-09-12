package sol2;

import java.util.Stack;

/*
 * 프로그래머스
 * 네트워크 문제
 * 
 * https://programmers.co.kr/learn/courses/30/lessons/43162
 * DFS -> 스택
 * BFS -> 큐 
 */

public class Programmers_network {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] computers = {{1,1,1,0}, {1,1,0,1}, {1,0,1,0},{0,1,0,1}};
		
		int result = sol.solution(4, computers);
		System.out.println(result);
	}
}

class Solution {
	
	public int solution(int n, int[][] computers) {
       
		int answer =0;
       boolean[] visited = new boolean[n+2];
       
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				bfs(i,computers,visited);
				answer++;
			}
		}
		return answer;
    }
	
	
	public void bfs(int start,int[][]computers,boolean[] visited) {
		
		Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(start);
        
        while(!stack.empty()) {
        	int po = stack.pop();
        	visited[po] = true;
        	
        	for(int i =0;i<computers.length;i++) {
        		if(computers[po][i] == 1 && !visited[i]) {
        			stack.push(i);
        		}
        	}
        }
    }
}
