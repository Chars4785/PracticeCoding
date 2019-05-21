package kakaoPro2019;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * 실패율 문제
 */

public class SecondProblem {

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
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