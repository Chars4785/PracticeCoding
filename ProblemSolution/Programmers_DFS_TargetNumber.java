package sol1;

/*
 * 프로그래머스 타겟 넘버
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 * 
 */
public class Programmers_DFS_TargetNumber {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] numbers= {1,1,1,1,1};
		int r = sol.solution(numbers, 3);
		System.out.println(r);
	}
}


//class Solution {
//	
//	int[] nums;
//	int[] ary;
//	int answer =0;
//	int target;
//	
//    public int solution(int[] numbers, int target) {
//    	nums = numbers;
//    	ary= new int[numbers.length+10];
//    	this.target = target;
//    	dfs(0);
//    	
//    	return answer;
//    }
//    
//    public void dfs(int index) {
//    	
//    	if(index == nums.length) {
//    		
//    		if(cal(index)) answer++;
//    		
//    		return;
//    	}
//    	
//    	ary[index] = 0;
//    	dfs(index+1);
//    	
//    	ary[index] = 1;
//    	dfs(index+1);
//    	
//    	
//    }
//    
//    public boolean cal(int index) {
//    	int result=0;
//
//    	for(int i =0;i<index;i++) {
//    		switch (ary[i]) {
//			case 0:
//				result +=nums[i];
//				break;
//			case 1:
//				result -=nums[i];
//				break;
//			}
//    	}
//    	return (result == target);  
//    }
//}

// 다른 풀이
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    int dfs(int[] numbers, int n, int sum, int target) {
        if(n == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    }
}


//import java.util.Arrays;
//class Solution {
//    public int solution(int[] numbers, int target) {
//        int answer = 0;
//        int cycle = (int) Math.pow(2, numbers.length);
//
//        for(int i=0; i<=cycle; i++) {
//            for(int j=0; j<numbers.length; j++) {
//                if((i & (1<<j)) == (1<<j)) {numbers[j] = Math.abs(numbers[j]);}
//                else {numbers[j] = -Math.abs(numbers[j]);}
//            }
//            if(sum(numbers) == target) {answer++;}
//        }
//        return answer;
//    }
//
//    int sum(int[] arr) {
//        return Arrays.stream(arr).sum();
//    }
//}
