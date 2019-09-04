package sol3;

/*
 * 2017 카카오 코드 예선
 * 카카오 프렌즈 컬러링북
 * 
 */

public class Kakao_Code_festival1 {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int [][] a = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		int[] result = sol.solution(6,4, a);
		for ( int each : result) {
			System.out.println(each);
		}
	}
}

class Solution {
	
	boolean[][] visited;
	int[][] pict;
	  int tempValue;
	  int maxM,maxN;
	  
	  public int[] solution(int m, int n, int[][] picture) {
	     visited = new boolean[m][n];
	     pict = picture;
	     maxM = m;
	     maxN = n;
	     int numberOfArea = 0;
	     int maxSizeOfOneArea = 0;
	      
	     for(int i=0;i<m;i++) {
	    	 for(int j =0;j<n;j++) {
	    		 if(visited[i][j] || picture[i][j] == 0) {
	    			 continue;
	    		 }else {
	    			 numberOfArea++;
	    		
	    			 tempValue = 0;
	    			 
	    			 findValue(i,j,picture[i][j]);
	    			 
	    			 if(tempValue > maxSizeOfOneArea) {
	    				 maxSizeOfOneArea = tempValue;
	    			 }
	    		 }
	    	 }
	     }
	    
	      int[] answer = new int[2];
	      answer[0] = numberOfArea;
	      answer[1] = maxSizeOfOneArea;
	      
	      return answer;
	  }
	  
	  
	  int[] dx = {1,0,-1,0};
	  int[] dy = {0,1,0,-1};
	  
	  public void findValue(int x, int y, int value) {
		  
		  if((x<0 || x>=maxM)|| (y<0 || y>=maxN)) {
			  return;
		  }
		  
		  if(visited[x][y] || pict[x][y] !=value) {
			  return;
		  }
		  
		  	for(int i =0;i<4;i++) {
		  		if(pict[x][y] == value && !visited[x][y]) {
		  			tempValue++;
		  			visited[x][y] = true;
		  		}
		  		findValue(x+dx[i],y+dy[i],value);
		  	}
		
	  }
	  
}