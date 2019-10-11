package kakaoPro2019;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 실패율 문제
 */

public class SecondProblem {

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = sol.solution(5, stages);

        for (int each : answer) {
            System.out.println(each);
        }

    }

}

class Solution2 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] playerPosition = new int[N + 10];
        Map<Integer, Float> failRate = new TreeMap<>();
        int winningPlayer = 0;

        for (int player : stages) {
            playerPosition[player]++;
        }   //모든 플레이어 위치 갯수올려줌

        for (int i = 1; i <= N; i++) {
            float value;

            if(playerPosition[i] ==0){
                value =0;
            }else{
                value = playerPosition[i] / (float) (stages.length - winningPlayer);
            }
            failRate.put(i, value);
            winningPlayer += playerPosition[i];

        }

        Map<Integer, Float> result = failRate.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));



        int index = 0;
        for (Integer each : result.keySet()) {
            answer[index++] = each;
        }

        return answer;
    }
}

class Solution3 {
    public int[] solution(int N, int[] stages){
        int[] answer = {};
        answer = new int[N];

        List<item> list = new LinkedList<item>();

        for(int i = 1; i <= N; i++){
            int stagePeople = 0;
            int challengePeople = 0;
            for(int j = 0; j < stages.length; j++){
                if(i <= stages[j]){
                    stagePeople++;
                    if( i == stages[j]){
                        challengePeople++;
                    }
                }
            }

            double fail = (double)challengePeople / (double)stagePeople;
            list.add(new item(i, fail));
        }

        Collections.sort(list,(item i1, item i2)->{
                System.out.println(i1.index + " vs " + i2.index);
                if(i1.fail > i2.fail){
                    return -1;
                } else if(i1.fail < i2.fail){
                    return 1;
                } else {
                    return 0;
                }
        });

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).index;
        }
        return answer;
    }

    class item {
        public int index;
        public double fail;
        public item(int i, double f){
            this.index = i;
            this.fail = f;
        }
    }
}