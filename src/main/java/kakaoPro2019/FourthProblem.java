package kakaoPro2019;

import java.util.Arrays;
import java.util.List;

public class FourthProblem {

    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        int[] time = {3,1,2};
        int answer = sol.solution(time, 5);
        System.out.println(answer);
    }
}


class Solution4 {
    public int solution(int[] food_times, long k) {

        int index =0;
        while(k !=0){

            if(food_times[index] != 0){

                food_times[index]--;
                k--;

                if(k !=0){

                    if(++index > food_times.length-1){
                        index =0;
                    }

                }else{
                    if(++index > food_times.length-1){
                        index =0;
                    }
                    return  index+1;

                }


            }else{
                if(++index > food_times.length-1){
                    index =0;
                }
            }

        }

        return index+1;
    }

}
