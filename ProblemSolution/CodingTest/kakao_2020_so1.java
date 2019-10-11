package kakao2020.so1;

/*
 * 카카오_2020 1번
 * 
 */
public class kakao_2020_so1 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = sol.solution("a");
		System.out.println(result);

	}
}

class Solution {
	String temp = "";

	public int solution(String s) {
		int answer = 100001;
		int count = s.length();
		
		if(s.length() ==1) return 1;

		for (int gap = 1; gap < s.length(); gap++) {
			temp ="";
			for(int i=0;i<s.length();) {
				if(i+gap >= s.length()) {
					temp+=s.substring(i, s.length());
					break;
				}
				
				String stand = s.substring(i,i+gap);
				i = checkString(s, stand, i+gap, gap);
				
			}
			
			if (temp.length() < answer) {
				answer = temp.length();
			}
		
		}
		
		
		return answer;
	}

	public int checkString(String word, String stand, int start,int gap) {
		
		int count=1;
		
		for(;start<word.length();start+=gap) {
			if(start+gap > word.length()) break;
			
			String com = word.substring(start, start+gap);
			if(com.equals(stand)) {
				count++;
			}else {
				break;
			}
		}
		
		if(count != 1) {
			temp += Integer.toString(count)+stand;
		}else {
			temp += stand;
		}
		
		return start;
	}
}