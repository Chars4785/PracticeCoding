package answer;

import java.util.PriorityQueue;

/*
 *  우선순위 큐에서 2가지 조건으로
 *  네이버 신입 문제
 */

public class N2019Problem3 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] result = sol.solution(new int[][]{{1, 0, 5},{2, 2, 2},{3, 3, 1},{4, 4, 1},{5, 10, 2}});
		
		for(int e: result) {
			
			System.out.print(e+" ");
		}
		
	}
}

class Solution{
	
	public int[] solution(int[][] data) {
		int[] answer = new int[data.length];
		int count =0;
		int index =0;
		int time =0;
		
		PriorityQueue<Print> p = new PriorityQueue<Print>();
		
		while(data.length != count) {
			
			
			while(data.length != count && data[count][1] <= time ) {
				p.add(new Print(data[count][0],data[count][1],data[count][2]));
				count++;
			}
			
			if(p.isEmpty()) {
				time = data[count][1];
			}else if(p.peek().startTime <= time) {
				Print popValue = p.poll();
				answer[index++] = popValue.reportNum;
				time += popValue.getPage();
			}
		}
		
		
		return answer;
	}
}


class Print implements Comparable<Print>{
	
	int reportNum;
	int startTime;
	int page;
	
	Print(int re,int st, int pg){
		this.reportNum = re;
		this.startTime =st;
		this.page =pg;
	}
	
	int getPage() {
		return page;
	}
	
	int getNum() {
		return reportNum;
	}
	int getStart() {
		return startTime;
	}

	@Override
	public int compareTo(Print o) {
		
		if(page == o.page) {
			return (startTime > o.startTime) ? 1: -1; 
		}
		return (page > o.page) ? 1: -1;
	}
	
}
